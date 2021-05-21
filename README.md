# Api rest para consultar cidades do Brasil

disponível em 
https://cities-api-menezeslucas.herokuapp.com/

#### Para executar a aplicação pode ser necessário utilizar um container docker com o seguinte comando:

$ sudo docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=cities postgres

#### Caso esse comando já tenha sido executado anteriormente e não funcionar novamente, pode ser que o container docker já existe e não foi excluído. 
#### Pode-se reutilizar o mesmo cotainer com o seguinte comando:

$ sudo docker restart "/cities-db"

#### Os dados usados podem ser encontrados nesse link:

https://github.com/chinnonsantos/sql-paises-estados-cidades/tree/master/PostgreSQL

#### Para criar o banco e importar esses dados pode-se utilizar esses comandos:

$sudo docker run -it --rm --net=host -v "$PWD:/tmp" postgres /bin/bash

psql -h localhost -U postgres_user_city cities -f /tmp/pais.sql

psql -h localhost -U postgres_user_city cities -f /tmp/estado.sql

psql -h localhost -U postgres_user_city cities -f /tmp/cidade.sql

#### Para o cálculo das distâncias executar é necessário que se ative as extensões necessárias do postgresql com os seguintes comandos:

psql -h localhost -U postgres_user_city cities

CREATE EXTENSION cube;

CREATE EXTENSION earthdistance;