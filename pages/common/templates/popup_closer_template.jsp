<%@ include file="/pages/common/templates/global.jsp" %>

<SCRIPT LANGUAGE="Javascript" SRC="./common/js/PopupWindow.js"></SCRIPT>
<SCRIPT LANGUAGE="Javascript" SRC="./common/spinweb.js"></SCRIPT>
<SCRIPT LANGUAGE="Javascript" SRC="./common/js/CalendarPopup.js"></SCRIPT>
<SCRIPT LANGUAGE="Javascript" SRC="./common/js/popups.js"></SCRIPT>

<html>
<head>
<link rel=stylesheet HREF="<%=JspUtils.getProjectPath(request)%>/common/eimStyles.css" type="text/css">
<title>IRB RRHH</title>
</head>
<body>

<table border="0" cellspacing="0" cellpadding="0" width="100%">
	<tr>
		<td width="80%" align="<%=utils.jsp.Constants.generalTable_align %>"><tiles:insert
			attribute="center" /></td>
	</tr>
</table>

</body>
</html>
