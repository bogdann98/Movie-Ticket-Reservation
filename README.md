# Movie-Ticket-Reservation
* This is a project that consist of a fullstack web application for movie ticket reservation using 4 classes: Movie, User, Theater and Reservation.
* The backend side was created using Java with Spring Boot framework and the data will be stored in a MySQL Database. 
* Additionally the implemented Api's have been tested using PostMan for checking all CRUD operation (POST, GET, PUT, DELETE).
* The frontend side was created using HTML, CSS with BootStrap and Javascript with Jquery and Ajax.

## Screenshots
* Diagram
![image](https://github.com/bogdann98/Movie-Ticket-Reservation/assets/84335149/76324ea1-ce2d-4f36-8ac3-e55bb0f6afff)
* Home Page
![image](https://github.com/bogdann98/Movie-Ticket-Reservation/assets/84335149/345221dc-58b4-4e3a-804c-369a2604e986)
* View Movies
![image](https://github.com/bogdann98/Movie-Ticket-Reservation/assets/84335149/7ceb1317-ad63-48cd-9fc5-dcedcdb1059f)
* Add Movies
![image](https://github.com/bogdann98/Movie-Ticket-Reservation/assets/84335149/e92f8b74-489f-4e7d-9f4e-f6ed4fa36cc4)

## Technologies
Java,
Spring Boot,
Spring Data JPA,
Postman,
MySQL,
HTML,
CSS,
BootStrap,
JavaScript

## API Endpoints
* GET /movies: Get a list of movies.
* GET /movies/{id}: Get detailed information about a specific movie.
* POST /movies: Add a new movie.
* DELETE /movie/{movieId}: Delete a movie.
* PUT /movie/{movieId}: Update movie information.
* GET /theaters: Get a list of theaters.
* GET /theaters/{id}: Get detailed information about a specific theater.
* POST /theaters: Add a new theater.
* DELETE /theaters/{movieId}: Delete a theater.
* PUT /theaters/{movieId}: Update theater information.
* GET /user: Get a list of users.
* GET /user/{id}: Get detailed information about a specific user.
* POST /user: Add a new user.
* DELETE /user/{movieId}: Delete an user.
* PUT /user/{movieId}: Update user information.
* GET /reservations: Get a list of reservations.
* GET /reservations/{id}: Get detailed information about a specific reservation.
* POST /reservations: Add a new reservation.
