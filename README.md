# RestTemplateTest
 
Primeiro é preciso adaptar as informações de banco de dados no Application.properties e assim que executar a aplicação, a JPA vai se encarregar de executar todas as queryes de banco de dados para criar a tabela e os relacionamentos.

Com os sistemas ativos, eles ficarão disponiveis nas URLs: localhost:8090/ (Rest) e localhost:8091/ (RestContinue) e aí pode ser utilizado os comandos mapeados no Controller da Rest para criar e modificar as "pessoas" no banco de dados e depois utilizar o que está mapeado na RestContinue para acessar as informações de Rest via RestTemplate.
