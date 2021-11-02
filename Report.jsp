<html>
	<head>
		<link rel="stylesheet" type="text/css" href="Style.css"/>
		<title>Report Page</title>
	</head>
	</head>
	<body>
		<div class="topright">
 		 	<img src="https://www.pngkey.com/png/full/209-2096342_generic-episode-image-gavs-technologies-logo.png" width="250" height="75">
 		 </div>
 		 <h2>Leave Request Management System</h2>
 		 <h3>Employee Leave Report</h3>
 		 <center>
		<form name="form_report" action="ReportDisplay.jsp" method="post" onsubmit="return(todateCheck());">
			<table cellpadding="7">
				<tr>
					<td>Leave From Date:</td>
					<td><input type="date" name="from" required></td>
				</tr>
				<tr>
					<td>Leave Upto:</td>
					<td><input type="date" name="to" required></td>
				</tr>
			</table>
			<input type="submit" value="Submit">
		</form>
		</center>
		<div class="footer">
  			<p>&copy;&nbsp;Copyrights owned by GAVS Technologies</p>
		</div>
		<script>
		function todateCheck(){
			if(document.form_report.from.value>document.form_report.to.value){
				alert("'Leave from date' should be less than 'Leave to date'. Please enter the dates again.");
				return false;}
			return true;
		}
		</script>
	</body>
</html>