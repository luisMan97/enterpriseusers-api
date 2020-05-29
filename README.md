# enterpriseusers-api

## Installation
Run git clone to download proyect

```ruby
git clone https://github.com/luisMan97/enterpriseusers-api.git
```

#### Use
Example call get

```ruby
http://localhost:8080/employee?name=luis&lastname=rivera&document_type=cc&document=1023020273&birth=1997-04-04&vinculation=2020-05-25&position=developer&salary=3.000.000
```

Json response:

```ruby
{
  "age":
    {
      "years": 1997,
      "months": 3,
      "days": 4
    },
    "vinculation":
      {
        "years": 2020,
        "months": 4,
        "days": 25
      }
}
```

#### Error Messages
When some field is not added to url

```ruby
{
  "message": "All fields are required"
}
```


When some field is empty

```ruby
{
  "message": "Fields is not should empty"
}
```



When some date field is not formatted correct
```ruby
{
  "message": "Date is not correct format"
}
