# iCrudify
Uma aplicação CRUD para estudar Java Spring

É apenas mais um CRUD como qualquer outro, sem mistério :D

## Post
```bash
POST /save
Content-Type: application/json

{
  "image": "url_da_imagem",
  "title": "Título do Item"
}
```

## Get
```bash
GET /
```

## Put
```bash
PUT /update/{id}
Content-Type: application/json

{
  "image": "nova_url_da_imagem",
  "title": "Novo Título"
}
```

## Delete
```bash
DELETE /delete/{id}
```
