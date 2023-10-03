# Invoice Maker
### Problem Statement
Many individuals engaged in side jobs or small-scale businesses often find themselves in need of crafting polished invoices and professional shipping labels. Although it's feasible to accomplish this task using common software like Microsoft Office or LibreOffice, the quality of the resulting documents depends heavily on the user's design skills. Moreover, the process of generating an invoice and shipping label with readily available, budget-friendly tools can be unnecessarily time consuming, involving numerous repetitive steps like inputting the shipping address twice—once on the invoice and again on the shipping label. While not particularly challenging, this process can be streamlined for greater efficiency. 

Enter Invoice Maker, designed to simplify this entire process. It offers an integrated solution that empowers users to effortlessly create invoices and automatically generate shipping labels, all while utilizing information already stored or entered during the invoice creation process.

### Project Technologies/Techniques 

* Security/Authentication
  * AWS Cognito
  * Admin role: create/read/update/delete (crud) of all data
  * User role: create invoices, shipping labels and view previously created items. 
* Database
  * MySQL
* ORM Framework
  * Hibernate 5
* Dependency Management
  * Maven
* CSS 
  * Bootstrap 5
* Data Validation
  * Bootstrap
* Logging
  * Configurable logging using Log4J2. In production, only errors will normally be logged, but logging at a debug level can be turned on to facilitate trouble-shooting. 
* Hosting
  * AWS
* EasyPost API
    * Used to generate shipping labels.
* Unit Testing
  * JUnit tests to achieve 80%+ code coverage 
* IDE: IntelliJ IDEA

## Design
* [User Stories](DesignDocuments/userStories.md)
* [Site Map](DesignDocuments/SiteMap.png)
* [Wireframes](DesignDocuments/Screens.md)
### [Project Plan](projectPlan.md)
### [Time Log](timeLog.md)
