 # Atividade da semana 07.
uma API em Spring Boot que receba um corpo (JSON) contendo o nome e a idade de uma pessoa. A API deve verificar se a idade é maior ou igual a 18 anos e, em caso positivo, retornar o nome da pessoa e uma mensagem de que a entrada é permitida.

 ## Requisitos
 Certifique-se de ter as seguintes ferramentas instaladas:
 - Java Development Kit (JDK) 11 ou superior
 - Maven
 - Dependencias para o spring-boot-starter-web
     ```bash
   <dependencies>
       <dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-web</artifactId>
	</dependency>

    </dependencies>
   ```

 1. **Clone o repositório**
   ```bash
   git clone https://github.com/llLeinxx/Victor-Iglesias-estudos.git
   cd sprint-01-semana-06
   ```
 2. **Compile o projeto**
   ```bash
   mvn clean install
   ```
 3. **Execute o projeto**
   Para executar o projeto, use o comando:
   ```bash
   mvn exec:java -Dexec.mainClass="com.atividadeSpring.atividadeSpring.AtividadeSpringApplication"

 ### Estrutura do Projeto
 * `src/main/java`: Código-fonte principal do projeto
 * `src/test/java`: Testes automatizados
 * `pom.xml`: Arquivo de configuração do Maven
```


### Contato
Para dúvidas ou problemas, entre em contato com:
* Nome: Victor Augusto
* Email: victor.iglesias.pb@compasso.com.br
* GitHub: github.com/llLeinxx
