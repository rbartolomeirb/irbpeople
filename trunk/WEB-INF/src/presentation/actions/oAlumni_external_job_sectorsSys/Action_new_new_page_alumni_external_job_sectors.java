package presentation.actions.oAlumni_external_job_sectorsSys;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Collections;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import utils.formbeans.ToStringComparator;
import utils.actions.NavigationFunctions;
import utils.actions.BOAdderFunctions;
import utils.formbeans.FormBeanManager;
import utils.formbeans.BOAdderFormBean;
import utils.userUtils.UserUtils;
import utils.Pair;
import utils.listFilter.ViewListConfiguration;
import utils.beanUtils.ExtendedBeanUtils;
import utils.filter.ListConfigurator;

import bussineslogic.controlers.UseCaseFacade;

import bussineslogic.objects.*;
import presentation.formbeans.objects.*;

	import presentation.formbeans.oAlumni_external_job_sectorsSys.*;


/**
 * 
 * @author Automatika - JustInMind SL
 *
 */
public class Action_new_new_page_alumni_external_job_sectors extends Action {
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {    	    	    

    	/** 1.  We obtain the user Information */
    	String usercode = UserUtils.getCurrentUsuarioId(request); 
    	Locale locale = UserUtils.getCurrentLocale(request); 
    	


	
	/** 2.  We obtain the initial form bean and we put it to a new FormBeanManager. */
	
Action_new_new_page_alumni_external_job_sectors_Form action_new_new_page_alumni_external_job_sectors_Form=(Action_new_new_page_alumni_external_job_sectors_Form) form;

FormBeanManager fbManager=new FormBeanManager(request, action_new_new_page_alumni_external_job_sectors_Form);	
	
	/** 3.  We use the business logic to create the new item */
	
	Alumni_external_job_sectors alumni_external_job_sectors = UseCaseFacade.CreateAlumni_external_job_sectors(usercode,(Alumni_external_job_sectors) fbManager.getPOJO("alumni_external_job_sectors_Form",Alumni_external_job_sectors.class));	
	
	/** 4.  In case that a BOAdder exists in the previous jsp, we update the list of values */
	
	

	/** 5.  We clean the current container */
	fbManager.cleanContainer();

	/** 6.  We return to the correct page (introducing some values to the request if necessary) */
	
	
/** 6.1.  We look if the current page is beeing opened in a popup window. */
boolean isPopUp = NavigationFunctions.isPopUpWindow(request);
/** 6.2.  We look for the forward to execute (we put the current object in case it is used in the next page) */

return NavigationFunctions.findForward(request, mapping, "success", "alumni_external_job_sectorscode="+alumni_external_job_sectors.getAlumni_external_job_sectorscode(), isPopUp, alumni_external_job_sectors.getCode(), alumni_external_job_sectors.toString());
	
	
		}
}