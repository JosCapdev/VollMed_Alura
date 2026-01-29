# VollMed_Alura

Este proyecto fue desarrollado como parte de la formación en **Java y Spring Boot** de One Oracle Next Education - Alura Latam.  
A lo largo de la formación fuimos construyendo paso a paso una API REST para la gestión de una clínica médica llamada **VollMed**.

---

## 📚 Recorrido de aprendizaje

### 1️⃣ Spring Boot 3: desarrolla una API REST en Java
- Configuración inicial de un proyecto con Spring Boot.
- Creación de las primeras entidades: **pacientes** y **médicos**.
- Implementación de controladores REST para operaciones CRUD.
- Uso de JPA/Hibernate para persistencia en base de datos.

### 2️⃣ Spring Boot 3: aplique las mejores prácticas y proteja una API Rest
- Incorporación de **validaciones** para garantizar integridad de datos.
- Implementación de reglas de negocio en el agendamiento de consultas.
- Aplicación de **Spring Security** para proteger la API.
- Configuración de autenticación con tokens JWT.

### 3️⃣ Spring Boot 3: documentar, probar y preparar una API para su implementación
- Documentación de la API con **Swagger/OpenAPI**.
- Creación de pruebas unitarias e integración para asegurar calidad.
- Preparación del proyecto para despliegue en producción.
- Reflexión sobre la importancia de la documentación y la automatización de pruebas.

---

## 📂 Estructura del proyecto

El proyecto está organizado siguiendo un enfoque **orientado al dominio**, donde cada área de la clínica tiene su propio paquete:

```
src/main/java/med
│
├── consultas        # Gestión de consultas médicas y validaciones
│   └── Consulta.java
│   └── ConsultaController.java
│   └── Validaciones específicas
│
├── medicos          # Entidades y controladores para médicos
│   └── Medico.java
│   └── MedicoController.java
│   └── MedicoRepository.java
│
├── pacientes        # Entidades y controladores para pacientes
│   └── Paciente.java
│   └── PacienteController.java
│   └── PacienteRepository.java
│
└── security         # Configuración de seguridad y autenticación con JWT
    └── SecurityConfig.java
    └── TokenService.java
```
🔎 Nota sobre la arquitectura
Se eligió una estructura domain-centric, donde cada paquete representa un área del negocio.

Esto permite que las reglas de negocio estén más cerca de las entidades que las necesitan.

La carpeta infra concentra configuraciones transversales como seguridad.

Se utilizaron Java Records para definir DTOs y transferir datos de manera más simple e inmutable, reduciendo código repetitivo y mejorando la legibilidad.

En proyectos más grandes, se podría complementar con un paquete service para separar casos de uso, pero en este proyecto la lógica se mantiene dentro de cada dominio, reflejando lo aprendido en los cursos de Alura.

---

## ⚙️ Tecnologías utilizadas
Java 17

Spring Boot

Maven

MySQL

JPA/Hibernate

Lombok

Swagger/OpenAPI

Spring Security

---

## 🚀 Cómo ejecutar
Clonar el repositorio:
```
bash
git clone https://github.com/JosCapdev/VollMed_Alura.git
```
Entrar en la carpeta del proyecto:
```
bash
cd VollMed_Alura
```
Ejecutar con Maven:
```
bash
mvn spring-boot:run
```
---
## ✨ Reflexión final
Este proyecto no solo me permitió aprender a construir una API REST con Spring Boot, sino también a aplicar buenas prácticas de seguridad, documentación y pruebas.
El camino por esta formación me dio una visión del ciclo de vida de una aplicación backend, desde la idea inicial hasta su preparación para producción.
