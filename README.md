# 🎓 Simulador de Média ENEM

Este projeto é uma ferramenta interativa desenvolvida para auxiliar estudantes no cálculo da média geral do ENEM, seguindo os padrões do SISU. O projeto representa uma evolução técnica pessoal, migrando conceitos de Java Web (JSP) para o ecossistema moderno do **Spring Boot**.

---

## 🚀 Tecnologias e Conceitos Utilizados

- **Backend:** Java 21 (LTS) com Spring Boot 3  
- **Frontend:** HTML5 e Thymeleaf para renderização dinâmica  
- **CSS Framework:** Tailwind CSS (Modern UI/UX)  
- **Arquitetura:** Padrão MVC (Model-View-Controller)  
- **Gestão de Dependências:** Maven  

---

## 🛠️ Funcionalidades

- **Cálculo Automático:** Processamento da média entre as 5 áreas do conhecimento do ENEM  
- **Feedback Dinâmico:** Mensagens personalizadas baseadas no desempenho da nota final  
- **Interface Responsiva:** Design limpo e adaptável para dispositivos móveis e desktop  
- **Tokens de Design:** Uso de variáveis CSS para fácil manutenção de cores e temas  

---

## 📂 Organização do Código

O projeto foi estruturado seguindo boas práticas de Engenharia de Software:

- `com.example.calcularenem.model`  
  Contém a lógica de negócio e os atributos das notas  

- `com.example.calcularenem.controller`  
  Gerencia as rotas e a comunicação entre o utilizador e o sistema  

- `src/main/resources/static`  
  Armazena os recursos estáticos como o arquivo `style.css`  

- `src/main/resources/templates`  
  Contém o template HTML processado pelo motor Thymeleaf  

---

## 🔧 Como rodar o projeto localmente

### Pré-requisitos

- JDK 21 instalado  
- Git  
- Maven ou Maven Wrapper  

### Passo a passo

1. Clone o repositório:
   ```bash
   git clone https://github.com/O-TEU-USUARIO/calculadora-enem-springboot.git
   ```
2. Entre na pasta do projeto:


```
cd calcularenem
```
3. Execute a aplicação:
```bash
./mvnw spring-boot:run
```
4. Acesse no navegador:



```
http://localhost:8080
```
## 🎯 Objetivo do Projeto
Este projeto tem fins educacionais e foi desenvolvido para consolidar conhecimentos em:

### Spring Boot

### Arquitetura MVC

### Integração Backend e Frontend

### Evolução de aplicações Java Web tradicionais (JSP) para arquiteturas modernas

## 👨‍💻 Autor
### Tiago de Aquino Nunes

Estudante de Técnico em Informática e graduando em Engenharia de Software.
