# iCrudify
Uma aplicação CRUD para estudar Java Spring

É apenas mais um CRUD como qualquer outro, sem mistério :D

## Post
```bash
POST /cruditems/save
Content-Type: application/json

{
  "image": "url_da_imagem",
  "title": "Título do Item"
}
```

## Get
```bash
GET /cruditems
```

## Put
```bash
PUT /cruditems/update/{id}
Content-Type: application/json

{
  "image": "nova_url_da_imagem",
  "title": "Novo Título"
}
```

## Delete
```bash
DELETE /cruditems/delete/{id}
```
