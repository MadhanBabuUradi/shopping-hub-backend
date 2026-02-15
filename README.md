# ⚙️ Shopping‑HUB Backend
A RESTful backend API for the Shopping‑HUB eCommerce platform built with Spring Boot, following best practices for clean architecture, modular structure, and easy integration with the frontend.

<h3>🧠Overview</h3> 
This backend service provides core API functionality to support:
- 🔄 User management  
- 🛍️ Product data delivery  
- 🛒 Cart and order handling  
- 📦 CRUD operations  
- 🗃️ Database persistence using SQL  

It is designed to work seamlessly with the frontend at:
```bash
👉 https://github.com/MadhanBabuUradi/shopping-hub-frontend
```

🛠️ **Tech Stack**

| Layer | Technology |
|-------|------------|
| Backend Framework | 🔥 Spring Boot |
| Language | ☕ Java |
| Build Tool | 📦 Maven |
| Database | 🗄️ SQL (schema provided) |
| Version Control | 🧾 Git & GitHub |

🚀 **Features**
- 🔐 RESTful architecture
- 🏷️ Clean and modular project structure
- 🔁 Dependency injection using Spring
- 🗂️ Entity relationships mapped with JPA
- 🧪 Easy database integration
- 📊 Prepared for future enhancements (auth, orders, payments)

<h3>📥 Clone & Setup</h3>  
1️⃣ **Clone the repository**
```bash
https://github.com/MadhanBabuUradi/shopping-hub-backend.git
cd shopping-hub-backend
```
2️⃣**Install Dependencies**
```bash
mvn clean install
```
3️⃣**Configure Database**
 Create DB & import schema:  
```bash
mysql -u root -p -e "CREATE DATABASE shopping_hub;"
mysql -u root -p shopping_hub < sql/schema.sql
```

Update application.properties with your DB credentials:
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/shopping_hub
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```
🚀 **Running the Application**
```bash
mvn spring-boot:run
```
**Acknowledgements**
- Spring Boot Documentation  
- MySQL Documentation  
- Recharts / Frontend integration inspiration

📄 **License**
This project is licensed under the MIT License. See the LICENSE file for details.

🤝 **Contributing**
**Contributions are welcome! Please fork the repository and submit a pull request for improvements or bug fixes.**






