# BFHL Task

Spring Boot REST API developed for the BFHL task.

## Tech Stack

* Java 17
* Spring Boot
* Maven
* Docker
* Render

## API Endpoints

### Health Check API

Method:

```text
GET
```

URL:

```text
https://bfhl-task-1-1620.onrender.com/health
```

Sample Response:

```text
API Running
```

---

### BFHL API

Method:

```text
POST
```

URL:

```text
https://bfhl-task-1-1620.onrender.com/bfhl
```

Request Body:

```json
{
   "data":["a","1","334","4","R","$"]
}
```

Sample Response:

```json
{
    "is_success": true,
    "user_id": "azharkhan_26052026",
    "email": "azharkhan230826@acropolis.in",
    "roll_number": "0827CS231059",
    "odd_numbers": ["1"],
    "even_numbers": ["334","4"],
    "alphabets": ["A","R"],
    "special_characters": ["$"],
    "sum": "339",
    "concat_string": "Ra"
}
```

## Deployment

The application is deployed on Render using Docker.
