# HealthApp
### Each service is described below, follow the design & described guidelines for rapid development.
### Add more info if needed. 
### Please follow naming conventions perfectly for conflit-free development.

## User service
The following sections describe the planned **database design**, relations between different tables, **required API endpoints and inter-service dependencies**. Information provided here is not fixed. **Include more if needed**. If any API/service requires an internal call to a different service then use this icon 🔴 to mark it as important so that the developer assigned to that particular service can see high priority API easily. 
### Database relations
![alt text](/Resources/DBDiagrams/UserService.png?raw=true)
### Required APIS
*API's that are mentioned in  the requirements list are marked bold.*

- **/users/register**: User registration.
- **/users/login**: User login, returns JWT auth token with user_id, roles and expire time.
- **/users/login/internal**: Return a JWT token with user_id *"INTERNAL"* and role  *"INTERNAL"* expire time should be very long for internal communication. Only admin can access this API.
- **/users/change-password**: Change user password.
- **/users/assign-role**: Assign a role to a user.
- **/users/remove-role**: Remove a role from a user.

- **/users/profile [create/update/read-by-id]**:
    - Create or update user profile information.
    - Read user profile information by ID.

- **/users/contact [create/update/read-by-id]**:
    - Create or update user contact information.
    - Read user contact information by ID.

- **/users/health-data**: Provide health data (🔴 Internal call to health service)