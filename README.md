# ATECH - Desafio técnico Senior - Desenvolvedor Java Sr.

Desafio enviado pelo Augusto Cesar Lima de Aragao Junior <aaragao@atech.com.br> no dia 16/03/2017

## Configuração

	$ git clone https://github.com/brunorocca/atech-challenge
	
    $ mvn spring-boot:run

## Lista de Notas

- [http://localhost:8080/index.html](http://localhost:8080/index.html)

## Rest

### Cadastro de Nota Fiscal

**JSON de Exemplo:**

- **POST** [http://localhost:8080/atech/invoices/create](http://localhost:8080/atech/invoices/create)
- **Accept:** application/json
- **Content-Type:** application/json
```
{
"cnpj":"07.689.002/0001-89",
"description":"O Desenvolvedor Bruno Rocca solicitou a compra de dois Jatinhos para sua frota particular. O maior motivo é para fugir do trânsito de São Paulo em suas visitas a ATECH.",
"products": [
		{	
			"productName": "PHENOM_300",
			"quantity": 1
		},
   		{	
			"productName": "Legacy_650E",
			"quantity": 1
		}

	]
}
```

### Consulta de Notas Fiscais por CNPJ do Emissor
- **POST** [http://localhost:8080/atech/invoices/cnpj?cnpj=07.689.002/0001-89](http://localhost:8080/atech/invoices/cnpj?cnpj=07.689.002/0001-89)
- **Accept:** application/json
- **Content-Type:** application/json

### Consulta de Notas Fiscais por Nome do Produto
- **POST** [http://localhost:8080/atech/invoices?productName=PHENOM_300](http://localhost:8080/atech/invoices?productName=PHENOM_300)
- **Accept:** application/json
- **Content-Type:** application/json

