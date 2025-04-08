## Security

The security of the Jiu-Jitsu academy check-in application is a top priority. The following measures have been implemented to protect data and ensure proper access to the system:

### Authentication

* **JWT (JSON Web Tokens) Based Authentication:** User (student and administrator) authentication is performed using JWT tokens. Upon successful login, a token is generated and sent to the client. This token must be included in authorization headers (usually `Authorization: Bearer <token>`) in all subsequent requests that require authentication.
* **Secure Password Storage:** User passwords are securely stored in the database using robust hashing algorithms (such as bcrypt) with salt to prevent dictionary and rainbow table attacks. Plain text passwords are never stored.

### Authorization

* **Role-Based Access Control (RBAC):** The system implements role-based access control, where different roles (e.g., "student," "administrator") have distinct permissions. This ensures that each user can only access the functionalities and data appropriate to their access level.
* **Endpoint Protection:** API endpoints are protected, requiring proper authentication and authorization before allowing access. Security middlewares are used to verify the validity of the token and the user's permissions for the requested route.

### Data Protection

* **Secure Communication (HTTPS):** The use of HTTPS for all communication between the client and the server is strongly recommended. This ensures that transmitted data (including login credentials and personal information) is encrypted and protected against interception.
* **Data Validation:** All data inputs provided by users are rigorously validated on the backend to prevent vulnerabilities such as injection attacks (SQL Injection, NoSQL Injection) and cross-site scripting (XSS).
* **Data Sanitization:** In addition to validation, received data may be sanitized to remove or escape potentially dangerous characters.
* **Protection Against Common Attacks:** Measures are taken to mitigate common attacks such as:
    * **Cross-Site Request Forgery (CSRF):** Implementation of CSRF tokens to protect against unauthorized requests originating from other websites.
    * **Brute-Force Attacks:** Implementation of rate limiting mechanisms to limit the number of login attempts within a certain period.

### Next Steps and Future Considerations

* **Security Audits:** Conduct regular security audits and penetration testing to identify and fix potential vulnerabilities.
* **Security Updates:** Keep all used dependencies and frameworks (Spring Boot, security libraries, etc.) updated to the latest versions to ensure the application of security patches.
* **Monitoring and Logging:** Implement a robust monitoring and logging