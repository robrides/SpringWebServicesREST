# SpringWebServicesREST

## Overview
This project demonstrates Restful Web Services using the Spring framework.

### Available API Routes

| Return Type | Route                 | Functionality                  |
|-------------|-----------------------|--------------------------------|
| `List<User>`  |`GET api/users`        | Retrieve all users            |
| `User`        |`GET api/users/{id}`   | Retrieves one user by id      |
| `User`        |`POST api/users`       | Creates a new user             |
| `Boolean`     |`DELETE api/users/{id}`| Deletes an existing user by id |
| 'List<Post>' |'GET api/users/{id}/posts'| Retrieve all posts for a user |
| 'Post' |'POST api/users/{id}/posts'| Create a post for a user |
| 'Post' | 'GET api/users/{id}/posts/{post_id}' | Retrieve post details |
