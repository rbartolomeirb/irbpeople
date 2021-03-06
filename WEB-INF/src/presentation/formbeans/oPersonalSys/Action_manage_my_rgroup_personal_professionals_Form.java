package presentation.formbeans.oPersonalSys;




import utils.formbeans.FormBeanContainer;
import utils.formbeans.BOAdderFormBean;

import utils.validator.ValidatorFormAndAction;

import presentation.formbeans.objects.*;

/**
 * This class is a FormBeanContainer for the action action_manage_my_rgroup_personal_professionals.
 * 
 * @author Automatika - JustInMind SL
 */
public class Action_manage_my_rgroup_personal_professionals_Form extends FormBeanContainer {

	
	//FormBean for the action
			
			/**
			* nested-pojo-form-bean contained in this container
			**/
			private Personal_Form personal_Form = null;
	
	
	

	
	
	
		
		/**
		 * @return returns the code of the current personal_Form (a shortcut of getPersonal_Form().getPersonalcode())
		 */
		public String getPersonalcode() {
			
			return getPersonal_Form().getPersonalcode();
		}

		/**
		 * Sets the code of the current personal_Form (a shortcut of getPersonal_Form().setPersonalcode(String))
		 * @param personalcode the new code
		 */
		
		public void setPersonalcode(String personalcode){
			
			getPersonal_Form().setPersonalcode(personalcode);
		}

		/**
		 * @return the current personal_Form
		 */
		
		public Personal_Form getPersonal_Form() {
			
			if(personal_Form==null)
				
				personal_Form = new Personal_Form();
			
			return personal_Form;
		}

		/**
		 * set the current personal_Form
		 * @param personal_Form the new personal_Form
		 */
		
		public void setPersonal_Form(Personal_Form personal_Form){
			
			this.personal_Form=personal_Form;
		}
		
		
			/* (non-Javadoc)
			 * @see utils.formbeans.FormBeanContainer#getMainFormBeanCode()
			 */
			@Override
			public String getMainFormBeanCode() {
				return getPersonalcode();
			}
			
			
			
	
	
	
	
	
	
}