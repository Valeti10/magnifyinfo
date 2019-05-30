-- create user mi identified by mi;
-- grant dba to mi;
-- connect mi/mi;
create table register (
Name varchar(20),
Gender varchar(10),
Address varchar(200),
PinCode varchar(8),
Username varchar(20) primary key,
password varchar(20),
Phone varchar(15),
Salary varchar(20),
Occupation varchar(25),
Email varchar(30),
DateofBirth varchar(15),
Age varchar(4),
designation varchar(20)
);
insert into register values('naveen','male','vijayawada','521108','naveen','123456','9553121589','25000','sw engineer','naveenvemulapalli5@gmail.com','05-aug-1990','24','admin');
commit;
create table loandetails(
loantype varchar(20),
bank varchar(20),
loanid varchar(20)primary key,
maxloanperiod varchar(10),
rateofinterest varchar(10),
amountsanctionedupto varchar(20),
emi varchar(20),
processingfee varchar(20),
hiddencharges varchar(20)
);
create table policydetails(
policyid varchar(20),
policyno varchar(30),
minimumentryage varchar(20),
maximumentryage varchar(20),
policyterm varchar(20),
premiumpayingterm varchar(20),
premiumpaymentfrequency varchar(20),
amountpaid varchar(20),
maximumpremium varchar(20),
maximumsumassured varchar(20),
minimumsumassured varchar(20),
providername varchar(30));

create table UserView(
Username varchar(20),
Ondate date,
loans_viewed varchar(600),
policies_viewed varchar(600)
);
create table dollarvalue(
oondate date primary key,
icici float,
sbi float,
axis float,
sbh float
);