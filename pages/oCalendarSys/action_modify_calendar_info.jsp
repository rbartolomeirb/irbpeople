<%@ taglib uri="/tags/struts-bean" prefix="bean"%>
<%@ taglib uri="/tags/struts-html" prefix="html"%>
<%@ taglib uri="/tags/struts-logic" prefix="logic"%>
<%@ taglib uri="/tags/struts-nested" prefix="nested"%>
<%@ taglib uri="/tags/jim" prefix="jim"%>
<%@ taglib uri="/tags/nested-jim" prefix="nested-jim"%>
<%@page import="utils.jsp.JspUtils"%>

<logic:notPresent name="org.apache.struts.action.MESSAGE" scope="application">
	<font color="red">
		ERROR: Application resources not loaded -- check servlet container logs for error messages. 
	</font>
</logic:notPresent>

<html:form action="<%=JspUtils.getCurrentAction(request)%>">
	<html:hidden property="id"/>


	<table>
		<tr>
			<td colspan="2"><html:errors/></td>
		</tr>
	</table>

<nested:nest property="irbholidayinfo_Form">
	<nested:hidden property="irbholidayinfocode" />
</nested:nest>

<table cellpadding="0" cellspacing="0">
	<tr>
		<td><jsp:include page="/pages/common/templates/groupHeader.jsp"> <jsp:param name="HeaderKey" value="personal/spdata"/> </jsp:include></td>
	</tr>
	<tr align="center">
		<td class="GroupContent">
			<table class="FormTable" cellpadding="0" cellspacing="0">
			

<tr>
	<td align="center">
	<nested:nest property="irbholidayinfo_Form">

		<table cellpadding="0" cellspacing="0">		
			
<tr>
	
<td class="FormFieldLeft">
	
<jim:message key="name" />
	
</td>
<td class="FormFieldRight">
	<nested:write property="personal.name"/>
	
</td>
<td class="FormFieldLeft">
	
<jim:message key="surname1" />
	
</td>
<td class="FormFieldRight">
	<nested:write property="personal.surname1"/>
	
</td>
<td class="FormFieldLeft">
	
<jim:message key="surname2" />
	
</td>
<td class="FormFieldRight">
	<nested:write property="personal.surname2"/>
	
</td>
</tr>
<tr>
	<td class="FormSeparator"></td>
	<td class="BlankSeparator"></td>
</tr>
		</table>

	</nested:nest>
	</td>
</tr>
			</table>
		</td>
	</tr>
</table>
<br>
<table cellpadding="0" cellspacing="0">
	<tr>
		<td><jsp:include page="/pages/common/templates/groupHeader.jsp"> <jsp:param name="HeaderKey" value="holidaysinfo"/> </jsp:include></td>
	</tr>
	<tr align="center">
		<td class="GroupContent">
			<table class="FormTable" cellpadding="0" cellspacing="0">
			

<tr>
	<td align="center">
	<nested:nest property="irbholidayinfo_Form">

		<table cellpadding="0" cellspacing="0">		
<tr>
	<td class="FormFieldLeft">
		<jim:message key="year" />
	</td>
	<td class="FormFieldRight">
		<nested:write property="year" format=""/>
	</td>
</tr>

<tr>
	<td class="FormSeparator"></td>
	<td class="BlankSeparator"></td>
</tr>

<tr>
	<td class="FormFieldLeft">
		<jim:message key="holidaysforyear" />
	</td>
	<td class="FormFieldRight">
		<nested:text property="holidaysforyear"/>
	</td>
</tr>

<tr>
	<td class="FormSeparator"></td>
	<td class="BlankSeparator"></td>
</tr>

<tr>
	<td class="FormFieldLeft">
		<jim:message key="apsforyear" />
	</td>
	<td class="FormFieldRight">
		<nested:text property="apsforyear"/>
	</td>
</tr>

<tr>
	<td class="FormSeparator"></td>
	<td class="BlankSeparator"></td>
</tr>

<tr>
	<td class="FormFieldLeft">
		<jim:message key="previousyearholidaysforyear" />
	</td>
	<td class="FormFieldRight">
		<nested:text property="previousyearholidaysforyear"/>
	</td>
</tr>

<tr>
	<td class="FormSeparator"></td>
	<td class="BlankSeparator"></td>
</tr>
		</table>

	</nested:nest>
	</td>
</tr>
			</table>
		</td>
	</tr>
</table>
<br>


</html:form>