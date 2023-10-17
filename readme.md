# Invoice Maker
### Problem Statement
InvoiceMaker is the ultimate platform for freelancers, gig workers, and side hustlers who want to create no fuss invoices and shipping labels with ease. You can find many free ways to create an invoice, and making a shipping label is not hard. But InvoiceMaker lets you create both at the same time with a simple step by step interface that rivals costly shopping cart software or CRMs.

InvoiceMaker is designed to save you time and hassle. It offers a seamless solution that lets you create invoices in minutes and generate shipping labels automatically, using the information you already entered during the invoice creation process. No more typing the same data twice!

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
