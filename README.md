# Blog-Application
# 📝 Blogging App

A full-stack **Blogging Application** built with **Spring Boot (Backend)** and **React (Frontend)**. This app allows users to **sign up, log in**, create and view blogs, and explore posts created by other users. JWT (JSON Web Token) is used for secure user authentication.

---

## 🚀 Features

- ✅ User Signup & Login
- 🔒 Secure JWT Authentication
- ✍️ Create and Publish Blogs
- 👀 View Blogs from Other Users
- 🧾 User Dashboard with Personalized Content
- 📄 RESTful APIs with Spring Boot
- ⚛️ Dynamic UI with React and Axios
- 📦 Backend: Spring Boot + Spring Security + JPA + JWT
- 🌐 Frontend: React + Axios + Bootstrap/Tailwind

---

## 🛠️ Tech Stack

### Backend:
- Java 17
- Spring Boot
- Spring Security
- JWT (JSON Web Tokens)
- Spring Data JPA
- MySQL (or H2 for dev)

### Frontend:
- React
- React Router
- Axios
- Bootstrap / Tailwind CSS

---

## 🔐 Authentication Flow

1. User registers via `/signup`.
2. User logs in via `/login`, and receives a **JWT Token**.
3. Token is stored in browser (typically localStorage).
4. Authenticated requests use the JWT token in the `Authorization` header.

5. Protected routes and blog creation are restricted to logged-in users.

---




---

## 📁 Project Structure

<img width="1530" height="892" alt="Screenshot 2025-05-28 184549" src="https://github.com/user-attachments/assets/79f57521-57ba-4d8f-b9aa-dc0f411eff22" />
<img width="1141" height="768" alt="Screenshot 2025-05-28 184607" src="https://github.com/user-attachments/assets/99af71df-0391-4cb2-87f8-5bdebf355f0b" />
<img width="1919" height="912" alt="Screenshot 2025-05-14 101320" src="https://github.com/user-attachments/assets/6222b776-a6aa-46d9-a538-f21f50430f75" />

