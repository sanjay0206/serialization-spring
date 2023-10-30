# Serialization and DeSerialization Example
Serialization is the concept of storing the state of the object for re-creating it later in its original form.

## Serialization
- `http://localhost:8081/rest/serialize` - POST request with user JSON eg `{"name": "Sam", "dept", "Operation", "salary": 12000}`


## DeSerialization
- `http://localhost:8081/rest/deserialize` - GET request which returns user JSON eg `[{"name": "Sam", "dept", "Operation", "salary": 12000}]`

## With transient on Salary - DeSerialization
- `http://localhost:8081/rest/deserialize` - GET request which returns user JSON eg `[{"name": "Sam", "dept", "Operation", "salary": null}]`

