# BFHL Task

This is a Spring Boot API created for the BFHL assignment.

## Technologies Used

* Java
* Spring Boot
* Maven
* Docker
* Render

## API URLs

### GET API

```text
https://bfhl-task-1-1620.onrender.com/health
```

Response:

```text
API Running
```

### POST API

```text
https://bfhl-task-1-1620.onrender.com/bfhl
```

Request:

```json
{
   "data":["a","1","334","4","R","$"]
}
```

Response:

```json
{
    "is_success": true,
    "user_id": "azharkhan_26052026",
    "email": "azharkhan230826@acropolis.in",
    "roll_number": "0827CS231059",
    "odd_numbers":["1"],
    "even_numbers":["334","4"],
    "alphabets":["A","R"],
    "special_characters":["$"],
    "sum":"339",
    "concat_string":"Ra"
}
```

## Deployment

Project deployed using Docker and Render.
