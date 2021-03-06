package ldap;

import java.util.ResourceBundle;

import com.novell.ldap.LDAPConnection;
import com.novell.ldap.LDAPEntry;
import com.novell.ldap.LDAPSearchResults;

public class LDAPLogin {

	private static ResourceBundle MAINCONFIG = ResourceBundle.getBundle("MainConfiguration");

	String userrole;

	public String getFullname(String username) throws Exception {		
		String fullName = null;
		LDAPConnection lc = new LDAPConnection();
		int ldapPort = LDAPConnection.DEFAULT_PORT;
		try {
			ldapPort = Integer.parseInt(MAINCONFIG.getString("hostPort"));
		} catch (Exception e) {
		}
		int ldapVersion = LDAPConnection.LDAP_V3;
		try {
			ldapVersion = Integer.parseInt(MAINCONFIG.getString("hostVersion"));
		} catch (Exception e) {
		}
		String searchBase = MAINCONFIG.getString("searchBase");
		String searchFilter = "(" + MAINCONFIG.getString("userLoginAttribute") + "=" + username + ")";

		// connect to the server
		lc.connect(MAINCONFIG.getString("hostName"), ldapPort);

		// bind to the server
		lc.bind(ldapVersion, MAINCONFIG.getString("domainAdminUser") + "@" + MAINCONFIG.getString("domainName"), MAINCONFIG.getString("domainAdminPassword").getBytes("UTF8"));

		LDAPSearchResults searchResults = lc.search(searchBase,LDAPConnection.SCOPE_SUB,searchFilter,new String[] { MAINCONFIG.getString("userFullNameAttribute") },false); // return attrs and values
		if (searchResults.hasMore()) {
			LDAPEntry entry = searchResults.next();
			fullName = entry.getAttribute(MAINCONFIG.getString("userFullNameAttribute")).getStringValue();
		}
		return fullName;
	}

	public boolean doLogin(String username, String password) {
		try {
			LDAPConnection lc = new LDAPConnection();

			int ldapPort = LDAPConnection.DEFAULT_PORT;

			try {
				ldapPort = Integer.parseInt(MAINCONFIG.getString("hostPort"));
			} catch (Exception e) {
			}

			int ldapVersion = LDAPConnection.LDAP_V3;
			try {
				ldapVersion = Integer.parseInt(MAINCONFIG.getString("hostVersion"));
			} catch (Exception e) {
			}

			String searchBase = MAINCONFIG.getString("searchBase");
			String searchFilter = "(" + MAINCONFIG.getString("userLoginAttribute") + "=" + username + ")";

			// connect to the server

			lc.connect(MAINCONFIG.getString("hostName"), ldapPort);

			// bind to the server

			lc.bind(ldapVersion, username + "@" + MAINCONFIG.getString("domainName"), password.getBytes("UTF8"));

			LDAPSearchResults searchResults =

			lc.search(searchBase,

			LDAPConnection.SCOPE_SUB,

			searchFilter,

			new String[] { MAINCONFIG.getString("irbpeopleRoleAttribute") },

			false); // return attrs and values

			if (searchResults.hasMore()) {
				LDAPEntry entry = searchResults.next();
				userrole = entry.getAttribute(MAINCONFIG.getString("irbpeopleRoleAttribute")).getStringValue();
			}

			return true;
		} catch (Exception e) {
			System.out.println("Error: " + e.toString());
		}

		return false;
	}

	public String getUserrole() {
		return userrole;
	}

}
