package presentation.actions.oAlumni_paramsSys;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import presentation.formbeans.oAlumni_paramsSys.Action_modify_modify_page_alumni_params_Form;
import utils.actions.NavigationFunctions;
import utils.formbeans.FormBeanManager;
import utils.userUtils.UserUtils;
import bussineslogic.controlers.UseCaseFacade;
import bussineslogic.objects.Alumni_params;

/**
 * 
 * @author Automatika - JustInMind SL
 * 
 */
public class Action_modify_modify_page_alumni_params extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		/** 1. We obtain the user Information */
		String usercode = UserUtils.getCurrentUsuarioId(request);
		Locale locale = UserUtils.getCurrentLocale(request);

		/**
		 * 2. We obtain the initial form bean and we put it to a new
		 * FormBeanManager.
		 */

		Action_modify_modify_page_alumni_params_Form action_modify_modify_page_alumni_params_Form = (Action_modify_modify_page_alumni_params_Form) form;

		FormBeanManager fbManager = new FormBeanManager(request, action_modify_modify_page_alumni_params_Form);

		/** 3. We use the business logic to modify the new item */

		Alumni_params alumni_params = UseCaseFacade.UpdateAlumni_params(usercode, (Alumni_params) fbManager.getPOJO("alumni_params_Form", Alumni_params.class));

		/**
		 * 4. In case that a BOAdder exists in the previous jsp, we update the
		 * list of values using the business logic.
		 */

		/** 5. We clean the current container */
		fbManager.cleanContainer();

		/**
		 * 6. We return to the correct page (introducing some values to the
		 * request if necessary)
		 */

		/** 6.1. We look if the current page is beeing opened in a popup window. */
		boolean isPopUp = NavigationFunctions.isPopUpWindow(request);
		/**
		 * 6.2. We look for the forward to execute (we put the current object in
		 * case it is used in the next page)
		 */

		return new ActionForward("/oAlumni_paramsSys/action_modify_page_alumni_params.do");
		//return NavigationFunctions.findForward(request, mapping, "success", "alumni_paramscode=" + alumni_params.getAlumni_paramscode(), isPopUp, alumni_params.getCode(), alumni_params.toString());

	}
}