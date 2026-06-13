Quiz and Notes API 🧠⚙️
The robust backend infrastructure powering the Quiz and Notes application. Built with Spring Boot, this RESTful API handles data persistence, manages topic-wise programming quizzes, and seamlessly serves data to the decoupled frontend client.

🚀 Features
✅ RESTful Endpoints: Clean architecture for fetching quizzes (Java, Python, JavaScript, etc.) and study notes.

✅ Cloud Database Integration: Fully integrated with a remote MySQL database (TiDB Serverless) for reliable, persistent storage.

✅ CORS Configured: Safely accepts Cross-Origin Resource Sharing requests from local development environments and live frontend hosting URLs.

✅ Environment-Driven Configuration: Secures sensitive credentials and dynamically binds server ports for cloud hosting (Render).

✅ Automated ORM: Utilizes Spring Data JPA and Hibernate for automatic table generation and data mapping.

📂 Project Structure
Plaintext
quiz-app-backend/
├── src/main/java/com/yourpackage/
│   ├── QuizApplication.java      # Main Spring Boot Application entry point
│   ├── config/
│   │   └── WebConfig.java        # CORS configuration and security settings
│   ├── controller/
│   │   └── QuizController.java   # API endpoints (GET, POST, etc.)
│   ├── model/
│   │   └── Question.java         # JPA Entities representing database tables
│   └── repository/
│       └── QuizRepository.java   # Database interaction interfaces
├── src/main/resources/
│   └── application.properties    # Environment variables, port, and DB settings
├── pom.xml                       # Maven dependencies
└── README.md                     # This file
🧑‍💻 Technologies Used
Java

Spring Boot (Web, Data JPA)

MySQL (TiDB Cloud)

Maven (Dependency Management)

Render (Cloud Deployment)

Git & GitHub

⚙️ Local Setup & Installation
To run this backend locally, ensure you have Java and Maven installed.

Clone the repository:

Bash
git clone https://github.com/BikiBaishya03/quiz-app-backend.git
Navigate to the project directory:

Bash
cd quiz-app-backend
Set your local environment variables (DB_URL, DB_USER, DB_PASS) or temporarily update application.properties with your local MySQL credentials.

Run the application:

Bash
mvn spring-boot:run
The server will start on http://localhost:8080.

🤝 Contributions
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

📧 Contact
For questions, suggestions, or feedback:

Email: bikibaishya03@example.com

GitHub: @BikiBaishya03
