package MI;
import static java.lang.System.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DAO 
{       
        Connection con;
        PreparedStatement pstmt;
        ResultSet rs;
        public DAO()
        {    try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            con = DriverManager.getConnection("jdbc:mysql:///magnifyInfo", "root", "");
            System.out.println("Connection Established");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            System.out.println(ex);
        }
        }
        public boolean insert(String Name,String Gender,String Address,String Pincode,String UserName,String password,String Phone,String Salary,String Occupation,String Email,String DateofBirth,String Age,String designation)
	{
            boolean flag=false;
        try {        
            
            pstmt=con.prepareStatement("insert into register values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pstmt.setString(1,Name);
            pstmt.setString(2,Gender);
            pstmt.setString(3,Address);
            pstmt.setString(4,Pincode);
            pstmt.setString(5,UserName);
            pstmt.setString(6, password);
            pstmt.setString(7,Phone );
            pstmt.setString(8,Salary);
            pstmt.setString(9,Occupation);
            pstmt.setString(10,Email);
            pstmt.setString(11,DateofBirth);
            pstmt.setString(12,Age);
            pstmt.setString(13,designation);
            int b=pstmt.executeUpdate();
            if(b>0)
            {
                   flag=true;  
            }        
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return flag;
        }
        public String loginCheck(String username,String password)
        {   String designation=null;
            rs=null;
            try{
                pstmt=con.prepareStatement("select designation from register where Username=? and password=?");
                pstmt.setString(1, username);
                pstmt.setString(2, password);
                rs=pstmt.executeQuery();
                if(rs.next())
                {   designation=rs.getString(1);
                }
            }catch(Exception e){
                out.println(e);
            }
            return designation;
        }
        public boolean insertloan(String loantype,String bank,String loanid,String maxloanperiod,String rateofinterest,String amountsanctionedupto,String emi,String processingfee,String hiddencharges)
        {        
                boolean flag=false;
                try{
		pstmt=con.prepareStatement("insert into loandetails values(?,?,?,?,?,?,?,?,?)");
                pstmt.setString(1,loantype);
                pstmt.setString(2,bank);
                pstmt.setString(3,loanid);
		pstmt.setString(4,maxloanperiod);
		pstmt.setString(5,rateofinterest);
		pstmt.setString(6,amountsanctionedupto);
		pstmt.setString(7,emi);
                pstmt.setString(8, processingfee);
                pstmt.setString(9,hiddencharges);
		int b=pstmt.executeUpdate();
		if(b>0)
                {flag=true;  
                }
                }catch(Exception e)
                {
                    System.out.println(e);
                }
            return flag;
        }
        public boolean insertpolicy(String policyid,String policyno,String pname,String minimumentryage,String maximumentryage,String policyterm,String premiumpayingterm,String premiumpaymentfrequency,String amountpaid,String maximumpremium,String maximumsumassured,String minimumsumassured)
        {        
            boolean flag=false;
		try{
		pstmt=con.prepareStatement("insert into policydetails values(?,?,?,?,?,?,?,?,?,?,?,?)");
		pstmt.setString(1,policyid);
                pstmt.setString(2,policyno);
		pstmt.setString(3,minimumentryage);
		pstmt.setString(4,maximumentryage);
		pstmt.setString(5,policyterm);
		pstmt.setString(6,premiumpayingterm);
                pstmt.setString(7, premiumpaymentfrequency);
                pstmt.setString(8,amountpaid);
                pstmt.setString(9,maximumpremium);
                pstmt.setString(10,maximumsumassured);
                pstmt.setString(11,minimumsumassured);
                pstmt.setString(12,pname);
		int b=pstmt.executeUpdate();
		if(b>0)
                {
                       flag=true;  
                }
                }catch(Exception e)
                {
                    System.out.println(e);
                }
            return flag;
        }
        public String getLoanId()
        {
            String id="LD";
            rs=null;
            int n=0;
            try{
                pstmt=con.prepareStatement("select loanid from loandetails");
                rs=pstmt.executeQuery();
                while(rs.next())
                {
                        String s=rs.getString(1);
                        int i=s.lastIndexOf("D");
                        String dummy=s.substring(i+1);
                        System.out.println("dummy:\t"+dummy);
                        int no=Integer.parseInt(dummy);
                        if(n<no)
                            n=no;
                }
            }catch(Exception e)
            {
                System.out.println(e);
            }
            if(n<9)
            id=id+"00"+(n+1);
            else if(n<99)
                id=id+"0"+(n+1);
            else
                id=id+(n+1);
            return id;
        }
        public String getPolicyId()
        {
            String id="PD";
            rs=null;
            int n=0;
            try{
                pstmt=con.prepareStatement("select policyid from policydetails");
                rs=pstmt.executeQuery();
                while(rs.next())
                {
                        String s=rs.getString(1);
                        int i=s.lastIndexOf("D");
                        String dummy=s.substring(i+1);
                        System.out.println("dummy:\t"+dummy);
                        int no=Integer.parseInt(dummy);
                        if(n<no)
                            n=no;
                }
            }catch(Exception e)
            {
                System.out.println(e);
            }
            if(n<9)
            id=id+"00"+(n+1);
            else if(n<99)
                id=id+"0"+(n+1);
            else
                id=id+(n+1);
            return id;
        }

       public ResultSet getAllLoanDetailsbyBankandType(String bank,String loantype)
       {
           rs=null;
           try{
               pstmt=con.prepareStatement("select * from loandetails where bank=? and loantype=?");
               pstmt.setString(1,bank);
               pstmt.setString(2,loantype);
               rs=pstmt.executeQuery();
           }catch(Exception e)
           {
               out.println(e);
           }
           return rs;
       }
       public ResultSet getAllLoanDetailsbyId(String loanid)
       {
           rs=null;
           try{
               pstmt=con.prepareStatement("select * from loandetails where loanid=?");
               pstmt.setString(1,loanid);
               rs=pstmt.executeQuery();
           }catch(Exception e)
           {
               out.println(e);
           }
           return rs;
       }
       public boolean storeViewDetails(String userid,TreeSet<String> ls,TreeSet<String> po)
        {        
            boolean flag=false;
		try{
                    String loansviewed="",policiesviewed="";
                    if(ls!=null){
                    for(String l:ls)
                    {
                        if(loansviewed.equalsIgnoreCase(""))
                            loansviewed=l;
                        else
                            loansviewed=loansviewed+","+l;
                    }}
                    if(po!=null){
                    for(String p:po)
                    {
                        if(policiesviewed.equalsIgnoreCase(""))
                            policiesviewed=p;
                        else
                            policiesviewed=policiesviewed+","+p;
                    }
                    }
                java.util.Date d=new java.util.Date();
                SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");  
		pstmt=con.prepareStatement("insert into UserView values(?,?,?,?)");
		pstmt.setString(1,userid);
                pstmt.setString(2,sdf.format(d));
		pstmt.setString(3,loansviewed);
		pstmt.setString(4,policiesviewed);		
		int b=pstmt.executeUpdate();
		if(b>0)
                {flag=true;  
                }
                }catch(Exception e)
                {System.out.println(e);
                }
            return flag;
        }
       public ResultSet getAllPolicyDetailsbyProvider(String provider)
       {
           rs=null;
           try{
               pstmt=con.prepareStatement("select * from policydetails where providername=?");
               pstmt.setString(1,provider);
               rs=pstmt.executeQuery();
           }catch(Exception e)
           {
               out.println(e);
           }
           return rs;
       }
       public ResultSet getAllPolicyDetailsbyId(String policyid)
       {
           rs=null;
           try{
               pstmt=con.prepareStatement("select * from policydetails where policyid=?");
               pstmt.setString(1,policyid);
               rs=pstmt.executeQuery();
           }catch(Exception e)
           {
               out.println(e);
           }
           return rs;
       }
       public boolean storeDollarDetails(String ondate,String icici,String sbi,String axis,String sbh)
        {        
            boolean flag=false;
		try{  
		pstmt=con.prepareStatement("insert into dollarvalue values(?,?,?,?,?)");
		pstmt.setString(1,ondate);
                pstmt.setString(2,icici);
		 pstmt.setString(3,sbi);
		 pstmt.setString(4,axis);
                  pstmt.setString(5,sbh);
                  int b=pstmt.executeUpdate();
		if(b>0)
                {flag=true;  
                }
                }catch(Exception e)
                {System.out.println(e);
                }
            return flag;
        }
       public ResultSet getDollarDetailsbyDate(String d)
       {
           rs=null;
           try{
               pstmt=con.prepareStatement("select * from dollarvalue where ondate=?");
               pstmt.setString(1,d);
               rs=pstmt.executeQuery();
           }catch(Exception e)
           {
               out.println(e);
           }
           return rs;
       }
       public ResultSet getLoanSearchDetails(String bank,String loantype,String maxloanperiod,String rateofinterest,String amountsanctionedupto,String emi)
       {
           rs=null;
           try{
               double aemi= Double.parseDouble(emi);
               double maxperiod= Double.parseDouble(maxloanperiod);
               double ri= Double.parseDouble(rateofinterest);
               double amtsanc= Double.parseDouble(amountsanctionedupto);
               String qry="select * from loandetails where bank=? and loantype=? and ((maxloanperiod >= ? and maxloanperiod <= ?)or(rateofinterest >= ? and rateofinterest <= ?)or(amountsanctionedupto >= ? and amountsanctionedupto <= ?)or(emi >= ? and emi <= ?))";
               out.println(qry);
               pstmt=con.prepareStatement(qry);
               pstmt.setString(1, bank);
               pstmt.setString(2, loantype);
               pstmt.setDouble(3, maxperiod-((maxperiod*20)/100));
               pstmt.setDouble(4, maxperiod+((maxperiod*20)/100));
               pstmt.setDouble(5, ri-((ri*5)/100));
               pstmt.setDouble(6, ri+((ri*5)/100));
               pstmt.setDouble(7, amtsanc-((amtsanc*20)/100));
               pstmt.setDouble(8, amtsanc+((amtsanc*20)/100));
               pstmt.setDouble(9, aemi-((aemi*10)/100));
               pstmt.setDouble(10,aemi+((aemi*10)/100));
               /*out.println("maxperiod:"+(maxperiod-((maxperiod*2)/100))+"\t"+(maxperiod+((maxperiod*2)/100))+"\t");
               out.println("ri:"+(ri-((ri*5)/100))+"\t"+(ri+((ri*5)/100))+"\t");
               out.println("amtsanc:"+(amtsanc-((amtsanc*20)/100))+"\t"+(amtsanc+((amtsanc*20)/100))+"\t");
               out.println("aemi:"+(aemi-((aemi*10)/100))+"\t"+(aemi+((aemi*10)/100))+"\t");
               * */
               rs=pstmt.executeQuery();
//               while(rs.next())
//               {
//                   out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7)+"\t"+rs.getString(8)+"\t"+rs.getString(9)+"\t");
//               }
           }catch(Exception e)
           {
               out.println(e);
           }
           return rs;
       }
       public ResultSet getPolicySearchDetails(String pname,String premiumterm,String paymentfrequency,String amountpaid)
       {
           rs=null;
           try{
               double amtpaid= Double.parseDouble(amountpaid);
               String qry="select * from policydetails where providername=? and (premiumpayingterm=? or (premiumpaymentfrequency = ?)or(amountpaid  >= ? and amountpaid  <= ?))";
               out.println(qry);
               pstmt=con.prepareStatement(qry);
               pstmt.setString(1, pname);
               pstmt.setString(2, premiumterm);
               pstmt.setString(3, paymentfrequency);
               pstmt.setDouble(4, amtpaid-((amtpaid*25)/100));
               pstmt.setDouble(5, amtpaid+((amtpaid*25)/100));
               /*out.println("maxperiod:"+(maxperiod-((maxperiod*2)/100))+"\t"+(maxperiod+((maxperiod*2)/100))+"\t");
               out.println("ri:"+(ri-((ri*5)/100))+"\t"+(ri+((ri*5)/100))+"\t");
               out.println("amtsanc:"+(amtsanc-((amtsanc*20)/100))+"\t"+(amtsanc+((amtsanc*20)/100))+"\t");
               out.println("aemi:"+(aemi-((aemi*10)/100))+"\t"+(aemi+((aemi*10)/100))+"\t");
               * */
               rs=pstmt.executeQuery();
//               while(rs.next())
//               {
//                   out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7)+"\t"+rs.getString(8)+"\t"+rs.getString(9)+"\t");
//               }
           }catch(Exception e)
           {
               out.println(e);
           }
           return rs;
       }
       public int getNoOfLoanViewsForaLoan(String lid,String fromdate,String todate)
       {
           int views=0;
           try{
                SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
                String to_date = sdf.format(sdf.parse(todate));
                String from_date = sdf.format(sdf.parse(fromdate));
                pstmt=con.prepareStatement("select * from UserView where Ondate>=? and Ondate<=? and loans_viewed like '%"+lid+"%'");
                pstmt.setString(1, from_date);
                pstmt.setString(2, to_date);
                rs=pstmt.executeQuery();
               while(rs.next())
               {
                   views++;
               }               
           }catch(Exception e)
           {
               out.println(e);
           }
           return views;
       }
       public int getNoOfPolicyViewsForaLoan(String pid,String fromdate,String todate)
       {
           int views=0;
           try{
                SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
                String to_date = sdf.format(sdf.parse(todate));
                String from_date = sdf.format(sdf.parse(fromdate));
                pstmt=con.prepareStatement("select * from UserView where Ondate>=? and Ondate<=? and policies_viewed like '%"+pid+"%'");
                pstmt.setString(1, from_date);
                pstmt.setString(2, to_date);
                rs=pstmt.executeQuery();
               while(rs.next())
               {
                   views++;
               }               
           }catch(Exception e)
           {
               out.println(e);
           }
           return views;
       }
}
