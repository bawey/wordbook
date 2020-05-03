# Under construction

### Poking localhost
```bash
curl  -H 'Content-Type: application/json' -X POST http://localhost:8080/words -d '{"value": "dog", "languageIsoCode": "eng", "gender": "NEUTRAL", "partOfSpeech": "NOUN", "plurality": "SINGULAR", "languageId": 1}'
curl  -H 'Content-Type: application/json' -X POST http://localhost:8080/phrases -d '{"value": "put off", "languageId": 1}'

curl  -H 'Content-Type: application/json' -X POST http://localhost:8080/words -d '{"languageId": 2, "gender": "MASCULINE", "partOfSpeech": "NOUN", "plurality": "SINGULAR", "value": "sillage"}'
curl  -H 'Content-Type: application/json' -X POST http://localhost:8080/definitions -d '{"wordId": 40, "value": "Zone de perturbations que laisse derrière lui un navire en mouvement."}'



```