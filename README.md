*************** Spring-Exercise1   ***************
Spring Framework Learning Exercise

Following topics are covered for the exercise:
(1)	Wiring Beans
	a.	Auto-wiring Configuration
	b.	Java Configuration
	c.	XML Configuration
(2)	Advanced Wiring 
	a.	Environment and Profiles
	b.	Conditional Bean Declaration 
	c.	Autowiring and Ambiguity
	d.	Bean Scoping

*************** Exercise Details ***************

We have a class named CustomerServiceImpl.
First need to create bean for CustomerServiceImpl.

when developer will run DemoApplication.java, It will initialize Spring project and inject bean in service object for CustomerServiceImpl. 
It will call displayInfo() method which will display/print All the customers managed by respective managers (fr e.g QA Manager, Dev Manager)

Two object already created in CustomerServiceImpl named customerRepository and manager.
developer will need to inject bean using different bean injection methods (i.e. constructor injection, setter injection, auto wire ).

Hint : To enable component scanning, Developer will need to annotate configuration class (i.e JavaConfig.class) using @componentScan with Base packages which we need to scan.

Exercise 1 (Wiring Beans using Java Configuration and Auto Configuration) :

Hint : Developer will need to use @Component annotation only on those class for which he/she need to create bean. 

Step 1 : Inject bean of OracleCustomerRepositoryImpl in ICustomerRepository's reference and ProdManagerImpl in IManager's Reference using Auto Wiring(Component scanning).
It should print output : Customers [[Oracle User1, Oracle User2, Oracle User3]] are managed by Prod-Manager

Step 2 : Inject bean of OracleCustomerRepositoryImpl in ICustomerRepository's reference and DevManagerImpl in IManager's Reference using setter injection.
It should print output : Customers [[Oracle User1, Oracle User2, Oracle User3]] are managed by Dev-Manager

Step 3 : Inject bean of SqlServerCustomerRepositoryImpl in ICustomerRepository's reference and QAManagerImpl in IManager's Reference using Constructor Injection by auto wiring and java configuration(Remove all the @Component annotation)
It should print output : Customers [[SQLServer User1, SQLServer User2]] are managed by QA-Manager

You can also inject other bean and check the output by annotating other class instead of this.

Exercise 2 (Profiling):

Hint : Enable profile using System Property like Ora or SS and create bean for ProdManagerImpl

Step 1 : Enable Default Profile and create OracleCustomerRepositoryImpl.
It should print output : Customers [[Oracle User1, Oracle User2, Oracle User3]] are managed by Prod-Manager.

Step 2 : Enable Active Profile and create SqlServerCustomerRepositoryImpl
It should print output : Customers [[SQLServer User1, SQLServer User2]] are managed by Prod-Manager.

Exercise 3 (Qualifier): 

Hint : Assign distinct Qualifier name to all IManager's implementation classes.
For DevManagerImpl : "Dev" , for ProdManagerImpl : "Prod" and PreProdManagerImpl : "PreProd" and for QAManagerImpl = "QA".

Step 1 : Inject bean of DevManagerImpl in IManager's Reference using appropriate Qualifier.
It should print output : Customers [[Oracle User1, Oracle User2, Oracle User3]] are managed by Dev-Manager

Try all the Qualifier and print different output.

Step 2 : For PreProdManagerImpl Change Qualifier to "Prod". and use this Qualifier at Injection Point.
It should raise exception NoUniqueBeanDefinitionException.

Step 3 : Use @Conditional annotation to create unique bean and use TestCondition.class as conditional class.
Check now if it works or not. If not then check wheather you need to correct condition in TestCondition class or not and try again.

Exercise 4 (Scope Beans):

Step 1 : Create new object for ICustomerService in DemoApplication class and Get another bean for ICustomerService in that object.
Sysout both object and check output.

Step 2 : Define Prototype scope for ICustomerService bean.
Again Sysout both object and check the output.
