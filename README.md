# 🤖 Internal AI Chat

An internal ChatGPT-style assistant built from scratch with **Java** and **Spring Boot**, integrated with the **Groq AI API** (LLaMA 3.3 70B model).

![Java](https://img.shields.io/badge/Java_17-FF3B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-00C853?style=for-the-badge&logo=spring&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-2979FF?style=for-the-badge&logo=postgresql&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-00B0FF?style=for-the-badge&logo=docker&logoColor=white)
![Groq](https://img.shields.io/badge/Groq_API-F57C00?style=for-the-badge&logoColor=white)

---

## 📌 About the Project

This project simulates an internal AI assistant for teams or companies that want a private, self-hosted chat powered by a large language model — without sending data to public services.

Built with a clean layered architecture: **Controller → Service → Feign Client → Groq API**.

---

##  Features

- Send messages and receive AI-generated responses
- Integration with **Groq API** (LLaMA 3.3 70B)
- Endpoint protection with **Spring Security**
- Conversation persistence with **PostgreSQL**
- Database containerized via **Docker**
- Clean architecture with separation of concerns

---

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| Java 17 + Spring Boot | Backend framework |
| OpenFeign | HTTP client for Groq API calls |
| PostgreSQL | Relational database |
| Docker | Database containerization |
| Spring Security | Endpoint protection |
| Groq API | AI model (LLaMA 3.3 70B) |

---

## ⚙️ Getting Started

### Prerequisites

- Java 17+
- Docker Desktop
- Groq API Key (free at [console.groq.com](https://console.groq.com))

### 1. Clone the repository

```bash
git clone https://github.com/Micaelatamir/internal-ai-chat.git
cd internal-ai-chat
```

### 2. Create the `.env` file in the root folder

```env
GROQ_API_KEY=your_key_here
GROQ_API_URL=https://api.groq.com/openai/v1/chat/completions
```

### 3. Create `application.properties` in `src/main/resources/`

```properties
spring.application.name=internal-ai-chat
spring.datasource.url=jdbc:postgresql://localhost:5432/internal_ai_chat
spring.datasource.username=admin
spring.datasource.password=admin25
spring.jpa.hibernate.ddl-auto=update
groq.api.key=${GROQ_API_KEY}
groq.api.url=${GROQ_API_URL}
spring.cloud.compatibility-verifier.enabled=false
```

### 4. Start the database

```bash
docker-compose up -d
```

### 5. Run the application

Via IntelliJ or terminal:

```bash
./mvnw spring-boot:run
```

### 6. Test with Postman or curl

```http
POST http://localhost:8080/chat
Content-Type: application/json

"What is a REST API?"
```

---

## 📁 Project Structure

```
src/
└── main/
    └── java/
        └── com/micaela/internal_ai_chat/
            ├── client/         # Feign client for Groq API
            ├── config/         # Security configuration
            ├── controller/     # REST endpoints
            ├── dto/            # Request/Response objects
            │   ├── request/
            │   └── response/
            ├── exception/      # Global exception handling
            ├── model/          # JPA entities
            ├── repository/     # Database access
            └── service/        # Business logic
```

---

##  Roadmap

- [x] Groq API integration
- [x] Conversation history persistence
- [x] Endpoint security with Spring Security
- [ ] JWT Authentication
- [ ] Multiple assistants with different personalities
- [ ] Voice support (Speech-to-Text / Text-to-Speech)
- [ ] Swagger / OpenAPI documentation

---

##  Author

**Micaela Tamires** — Backend Developer focused on Java, Spring Boot, and software security.

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/micaela-tamires-aa320b312/)
[![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Micaelatamir)
