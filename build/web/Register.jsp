<%@ include file="Header.jsp"  %>
<script language="javascript">

        function verify() {

        var val=document.register.phone.value;
	var stripped=val.replace(/[\(\)\.\-\ ]/g, '');
	var m1=document.getElementById("mode1").checked;
	var m2=document.getElementById("mode2").checked;
	var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
	var inputText=document.register.email.value;
            if(m1==false && m2==false)
                    {    alert(" Please select Gender ");
                            return false;
                    }
            else if (document.register.name.value == "") {
                alert("Please give the name");
                document.register.name.focus();
                return false;
            }           
            else if (document.register.address.value == "") {
                alert("Please give address");
                document.register.address.focus();
                return false;
            }
            else if (document.register.pincode.value == "") {
                alert("Please give pincode");
                document.register.pincode.focus();
                return false;
            }
             else if (document.register.username.value == "") {
                alert("Please give username");
                document.register.username.focus();
                return false;
            }
            else if (document.register.password.value == "") {
                alert("Please give Password");
                document.register.password.focus();
                return false;
            }
            else if (document.register.password.value.length < 6) {
                alert("Please give a Password more than 5 characters");
                document.register.password.focus();
                return false;
            }
           
            else if (document.register.phone.value == "") {
                alert("Please give phone no");
                document.register.phone.focus();
                return false;
            }
            else if (isNaN(parseInt(stripped)))
		{
			alert("The phone number contains illegal characters.\n");
			return false;
		}                
		else if(val==0)
		{	        
			alert("Please enter your phone number");
			document.register.phone.focus();
			return false;
	  	}
		else if(val.length<10 || val.length>11)
		{	        
			alert("Phone number should contain 10numbers");
			document.register.phone.focus();
			return false;
	  	}
            else if (document.register.salary.value == "") {
                alert("Please give salary");
                document.register.salary.focus();
                return false;
            }            
            else if (document.register.occupation.value == "") {
                alert("Please give Occupation");
                document.register.password.focus();
                return false;
            }
             else if (document.register.email.value == "") {
                alert("Please give the email");
                document.register.email.focus();
                return false;
            }
             else  if(!(inputText.match(mailformat)))
                {  
                    alert("You have entered an invalid email address!");  
                    document.register.email.focus();
                    return false;  
                }  
            else if (document.register.dob.value == "") {
                alert("Please give date of birth");
                document.register.dob.focus();
                return false;
            }
           else if(document.register.age.value == "") {
                alert("Please give age");
                document.register.age.focus();
                return false;
            }
            else 
            return true;
        }
        </script>

<div id="templatemo_content_panel_1">
<center>
	<div id="templatemo_section_1_1">
    	<h1>Register here</h1>
		<form name="register" action="DoRegister" method="post" onSubmit="return (verify());">
<table align="center">
<tr><td> Name                 :</td><td><input type="text" name="name" /></td></tr>
<tr><td>Gender:</td><td><input type="radio" value="male" name="gender" id="mode1">male<br><input type="radio" value="female" name="gender" id="mode2">female</td></tr>
<tr><td> Address            :</td><td><textarea rows="4" cols="30" name="address"></textarea><br/></td></tr>

<tr><td> PinCode           :</td><td><input type="text" name="pincode" /><br /></td></tr>

<tr><td>Username        : </td><td> <input type="text" name="username" /></td></tr>

<tr><td>Password         : </td><td> <input type="password" name="password" /></td></tr>


<tr><td> Phone               :</td><td><input type="text" name="phone" /></td></tr>


<tr><td> salary                :</td><td><input type="text" name="salary" /></td></tr>
<tr><td> occupation                :</td><td><input type="text" name="occupation"/></td></tr>
<tr><td> Email                :</td><td><input type="text" name="email" /></td></tr>

<tr><td>Date of Birth   : </td><td><input type="text" name="dob" /></td></tr>
<tr><td> Age                :</td><td><input type="text" name="age" /></td></tr>
<!--<tr><td> Designation             :</td><td><input type="text" name="Designation" /></td></tr>-->

		<tr ><td  align="center"><input type="submit" value="Register"/></td><td align="center"><input type="reset" value="Clear"></td></tr>
</table>
		</form>
 

<p>Note: Please make sure your details are correct before submitting form and that all fields marked with * are completed!.</p>
 
    </div><!-- end of news section -->
    
  </center>
    <div class="cleaner_with_height">&nbsp;</div>

</div>





<%@ include file="Footer.jsp"  %>