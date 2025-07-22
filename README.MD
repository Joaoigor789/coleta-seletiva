# Coleta Seletiva - Sistema de Pontos de Coleta

![Build Status](https://img.shields.io/badge/build-passing-brightgreen)
![Version](https://img.shields.io/badge/version-1.0.0-blue)
![License](https://img.shields.io/badge/license-MIT-green)
![Language](https://img.shields.io/badge/language-Java-orange)
![Last Commit](https://img.shields.io/github/last-commit/seunome/coleta-seletiva)

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/joao-igor-25b090250/)
[![Discord](https://img.shields.io/badge/Discord-7289DA?style=for-the-badge&logo=discord&logoColor=white)](https://discord.gg/ah6xP86cqR)
[![H2 Database](https://img.shields.io/badge/H2-Database-2C2F33?style=for-the-badge&logo=database&logoColor=white)](http://localhost:8081/h2-console)

---

**O projeto Coleta Seletiva é um sistema desenvolvido para facilitar a localização e o gerenciamento de pontos de coleta de resíduos recicláveis em áreas urbanas. Através de uma API RESTful construída com Spring Boot e uma interface interativa baseada em mapas com Leaflet, o sistema permite que usuários visualizem pontos de coleta em um mapa, além de possibilitar o cadastro e a consulta de informações relevantes sobre os resíduos coletados.**

**O objetivo principal do projeto é incentivar a prática da coleta seletiva, promovendo a sustentabilidade e a conscientização ambiental, oferecendo uma ferramenta simples e eficiente para cidadãos e órgãos responsáveis pelo manejo dos resíduos.**



---

## URLs principais

- **Mapa (localhost:8080):**  
  [http://localhost:8080/mapa](http://localhost:8080/mapa)
- **Mapa (localhost:8081):**  
  [http://localhost:8081/mapa](http://localhost:8081/mapa)

- **API Pontos (localhost:8080):**  
  [http://localhost:8080/api/pontos](http://localhost:8080/api/pontos)
- **API Pontos (localhost:8081):**  
  [http://localhost:8081/api/pontos](http://localhost:8081/api/pontos)

- **Resíduos (localhost:8080):**  
  [http://localhost:8080/residuos](http://localhost:8080/residuos)
- **Resíduos (localhost:8081):**  
  [http://localhost:8081/residuos](http://localhost:8081/residuos)

- **Console H2 (localhost:8081):**  
  [http://localhost:8081/h2-console](http://localhost:8081/h2-console)

---

## Como rodar o projeto

1. Clone este repositório
2. Abra no seu IDE favorito (IntelliJ, Eclipse, VS Code)
3. Configure JDK 17+
4. Rode a aplicação Spring Boot (classe principal com `@SpringBootApplication`)
5. Acesse no navegador:
    - [`http://localhost:8080/mapa`](http://localhost:8080/mapa) para ver o mapa com pontos de coleta
    - [`http://localhost:8080/api/pontos`](http://localhost:8080/api/pontos) para acessar a API JSON dos pontos
    - [`http://localhost:8081/h2-console`](http://localhost:8081/h2-console) para acessar o console do banco H2

---

## API disponível

| Método | Endpoint       | Descrição                  |
|--------|----------------|----------------------------|
| GET    | `/api/pontos`  | Lista todos os pontos       |
| POST   | `/api/pontos`  | Adiciona um novo ponto      |

---

## Frontend

O frontend consiste em uma página HTML com Leaflet que carrega os pontos da API e os exibe no mapa.

O arquivo `mapa.html` está localizado na pasta `templates` (se usar Thymeleaf) ou na pasta `static` (se for frontend puro).

---

## Possíveis melhorias futuras

- Interface para cadastro/edição de pontos diretamente no frontend
- Autenticação e controle de acesso
- Filtros por tipo de resíduo
- Histórico de coleta e relatórios
- Integração com banco de dados externo (MySQL, PostgreSQL)
- Deploy em servidor real

---

## Contato

**Email:** joaoigor1103@gmail.com  
[LinkedIn](https://www.linkedin.com/in/joao-igor-25b090250/) | [Discord](https://discord.gg/ah6xP86cqR)

---

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
