After the application is running, try to execute the below script

```bash
curl -v http://localhost:8080 -H'Accepts: application/json' -d'test_id=test&test_secret=asd'
```

and you should get back a HTTP 400 with the below message

```json
{
    "message": "Failed to convert argument [req] for value [null] due to: Failed to convert argument [testSecret] for value [null] due to: No Value found for argument testSecret",
    "path": "/req",
    "_links": {
        "self": {
            "href": "/",
            "templated": false
        }
    }
}
```