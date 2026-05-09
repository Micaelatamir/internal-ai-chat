# Internal AI Chat 🤖

> 🇧🇷 [Versão em Português abaixo](#português)

---

## 🇺🇸 English

A ChatGPT-like internal assistant built from scratch with Java and Spring Boot, integrated with Groq's AI API.

### 🚀 Features

- Send messages and receive AI-powered responses
- Integration with Groq API (LLaMA 3.3 70B model)
- Secure endpoints with Spring Security
- PostgreSQL database running via Docker
- Clean architecture: Controller → Service → Client

### 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| Java 17 + Spring Boot | Backend framework |
| OpenFeign | HTTP client for AI API calls |
| PostgreSQL | Database |
| Docker | Database containerization |
| Spring Security | Endpoint protection |
| Groq API | AI model (LLaMA 3.3 70B) |

### ⚙️ How to Run

**Prerequisites:**
- Java 17+
- Docker Desktop
- Groq API Key (free at [console.groq.com](https://console.groq.com))

**1. Clone the repository**
```bash
git clone https://github.com/Micaelatamir/internal-ai-chat.git
cd internal-ai-chat
```

**2. Create the `.env` file in the root folder**
```properties
GROQ_API_KEY=your_key_here
GROQ_API_URL=https://api.groq.com/openai/v1/chat/completions
```

**3. Create `application.properties` in `src/main/resources/`**
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

**4. Start the database**
```bash
docker-compose up -d
```

**5. Run the application**

Start via IntelliJ or:
```bash
./mvnw spring-boot:run
```

**6. Test with Postman or curl**
```
POST http://localhost:8080/chat
Content-Type: application/json

"What is a REST API?"
```

### 📁 Project Structure

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

### 🔮 Roadmap

- [x] AI integration with Groq API
- [ ] Conversation history persistence
- [ ] JWT authentication
- [ ] Multiple assistants with different personalities
- [ ] Voice support (Speech-to-Text / Text-to-Speech)

### 👩‍💻 Author

Developed by **Micaela Tamir** — junior backend developer focused on Java, Spring Boot and security.

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-blue)](https://linkedin.com/in/micaelatamir)
[![GitHub](https://img.shields.io/badge/GitHub-Follow-black)](https://github.com/Micaelatamir)

---

## 🇧🇷 Português

Um assistente interno estilo ChatGPT desenvolvido do zero com Java e Spring Boot, integrado com a API de IA da Groq.

### 🚀 Funcionalidades

- Enviar mensagens e receber respostas da IA
- Integração com a API da Groq (modelo LLaMA 3.3 70B)
- Endpoints protegidos com Spring Security
- Banco de dados PostgreSQL rodando via Docker
- Arquitetura limpa: Controller → Service → Client

### 🛠️ Tecnologias

| Tecnologia | Finalidade |
|---|---|
| Java 17 + Spring Boot | Framework backend |
| OpenFeign | Client HTTP para chamadas à API de IA |
| PostgreSQL | Banco de dados |
| Docker | Containerização do banco |
| Spring Security | Proteção dos endpoints |
| Groq API | Modelo de IA (LLaMA 3.3 70B) |

### ⚙️ Como Rodar

**Pré-requisitos:**
- Java 17+
- Docker Desktop
- Groq API Key (gratuita em [console.groq.com](https://console.groq.com))

**1. Clone o repositório**
```bash
git clone https://github.com/Micaelatamir/internal-ai-chat.git
cd internal-ai-chat
```

**2. Crie o arquivo `.env` na raiz do projeto**
```properties
GROQ_API_KEY=sua_key_aqui
GROQ_API_URL=https://api.groq.com/openai/v1/chat/completions
```

**3. Crie o `application.properties` em `src/main/resources/`**
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

**4. Suba o banco de dados**
```bash
docker-compose up -d
```

**5. Rode a aplicação**

Pelo IntelliJ ou via terminal:
```bash
./mvnw spring-boot:run
```

**6. Teste com Postman ou curl**
```
POST http://localhost:8080/chat
Content-Type: application/json

"O que é uma API REST?"
```

### 📁 Estrutura do Projeto

```
src/
└── main/
    └── java/
        └── com/micaela/internal_ai_chat/
            ├── client/         # Client Feign para a API Groq
            ├── config/         # Configuração de segurança
            ├── controller/     # Endpoints REST
            ├── dto/            # Objetos de request/response
            │   ├── request/
            │   └── response/
            ├── exception/      # Tratamento global de erros
            ├── model/          # Entidades JPA
            ├── repository/     # Acesso ao banco de dados
            └── service/        # Lógica de negócio
```

### 🔮 Próximos Passos

- [x] Integração com IA via Groq API
- [ ] Persistência do histórico de conversas
- [ ] Autenticação com JWT
- [ ] Múltiplos assistentes com personalidades diferentes
- [ ] Suporte a voz (Speech-to-Text / Text-to-Speech)

### 👩‍💻 Autora

Desenvolvido por **Micaela Tamir** — desenvolvedora backend júnior focada em Java, Spring Boot e segurança.

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Conectar-blue)](https://linkedin.com/in/micaelatamir)
[![GitHub](https://img.shields.io/badge/GitHub-Seguir-black)](https://github.com/Micaelatamir)
