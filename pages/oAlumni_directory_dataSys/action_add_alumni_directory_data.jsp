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
			<td colspan=2><html:errors/></td>
		</tr>
	</table>



<nested:nest property="alumni_directory_data_Form">
<nested:hidden property="alumni_directory_datacode" />
</nested:nest>



<table cellpadding=0 cellspacing=0>
	<tr>
		<td><jsp:include page="/pages/common/templates/groupHeader.jsp"> <jsp:param name="HeaderKey" value="alumni_directory_data.new"/> </jsp:include></td>
	</tr>
	<tr align="center">
		<td class="GroupContent">
			<table class="FormTable" cellpadding=0 cellspacing=0>
			

<tr>
	<td align="center">
	<nested:nest property="alumni_directory_data_Form">	
	<nested:hidden property="personal.alumni_personalcode"/>

<table cellpadding=0 cellspacing=0>		
			

	

<tr>
	<td class="FormSeparator"></td>
	<td class="BlankSeparator"></td>
</tr>
<tr>
	<td class="FormFieldLeft">
	<jim:message key="alumni_directory_data.start_date" />
	</td>
	<td class="FormFieldRight">
		<nested-jim:TagDate property="start_date" />
	</td>
</tr>
<tr>
	<td class="FormSeparator"></td>
	<td class="BlankSeparator"></td>
</tr>
<tr>
	<td class="FormFieldLeft">
	<jim:message key="alumni_directory_data.end_date" />
	</td>
	<td class="FormFieldRight">
		<nested-jim:TagDate property="end_date" />
	</td>
</tr>
<tr>
	<td class="FormSeparator"></td>
	<td class="BlankSeparator"></td>
</tr>
<tr>
	
<td class="FormFieldLeft">
	
<jim:message key="alumni_directory_data.irb_job_positions" />
	
</td>
<td class="FormFieldRight">
	
<nested-jim:TagSelect property="irb_job_positions.alumni_irb_job_positionscode"  >
	<nested-jim:TagOptionsCollection name="_selec_alumni_irb_job_positions" label="_descripcion" value="alumni_irb_job_positionscode" />
</nested-jim:TagSelect>
	
</td>
</tr>
<tr>
<td class="FormFieldLeft">
<jim:message key="alumni_directory_data.unit" />
</td>
<td class="FormFieldRight">
<nested-jim:TagSelect property="unit.unitcode" >
	<nested-jim:TagOptionsCollection name="_selec_unit" label="_descripcion" value="unitcode" />
</nested-jim:TagSelect>	
</td>
</tr>

<tr>
<td class="FormFieldLeft">
<jim:message key="alumni_directory_data.unit_2" />
</td>
<td class="FormFieldRight">
<nested-jim:TagSelect property="unit_2.unitcode" >
	<nested-jim:TagOptionsCollection name="_selec_unit" label="_descripcion" value="unitcode" />
</nested-jim:TagSelect>	
</td>
</tr>

<tr>
<td class="FormFieldLeft">
<jim:message key="alumni_directory_data.research_group" />
</td>
<td class="FormFieldRight">
<nested-jim:TagSelect property="research_group.research_groupcode" >
	<nested-jim:TagOptionsCollection name="_selec_research_group" label="_descripcion" value="research_groupcode" />
</nested-jim:TagSelect>	
</td>
</tr>
<tr>
<td class="FormFieldLeft">
<jim:message key="alumni_directory_data.research_group_2" />
</td>
<td class="FormFieldRight">
<nested-jim:TagSelect property="research_group_2.research_groupcode" >
	<nested-jim:TagOptionsCollection name="_selec_research_group" label="_descripcion" value="research_groupcode" />
</nested-jim:TagSelect>	
</td>
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