# 🚀 Insurance Quote Management System API

A simple Spring Boot REST API that allows users to create and fetch insurance quotes.  
The system automatically calculates the final premium based on:
- Client Age  
- Coverage Amount  

 ## How Premium Calculation Works

###  Rule 1: Age Discount  
If clientAge < 30, then apply 10% discount**.

###  Rule 2: Coverage Surcharge  
If coverageAmount > 50,00,000, then apply 5% extra surcharge.

 If both conditions are true → both rules apply.

##  How to Run the Project

### 1️ Clone the Repository  
Clone/download this project into your system (with IntelliJ installed).

### 2 Open in IntelliJ  
File → Open → Select the project folder.

### 3️ Run the Application  
Right-click on  
**`WealthVellyTaskApplication`** → **Run**.

Application will start on:
