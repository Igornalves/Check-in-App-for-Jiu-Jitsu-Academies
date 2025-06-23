# Principais Rotas da aplicacao 

### Rota 01: ``/inteface_check_in/swagger-ui/index.html#/ ``
- Visualizacao da Documentacao da API Criada para os outros dev visualizar como sao os end-ponits 

## 📚 Documentação das Rotas da API
### Esta API permite o gerenciamento completo de alunos, usuários e seus respectivos dados relacionados a treinos, saúde, presenças, anotações e mais.

- 🔐 Usuários
#### 📥 Criar Usuário
- POST /usuarios

```json
{
  "nome": "João",
  "email": "joao@email.com",
  "senha": "123456"
}
```
- 📤 Buscar Todos os Usuários
GET /usuarios

- 🔍 Buscar Usuário por ID
GET /usuarios/{id}

- ❌ Deletar Usuário
DELETE /usuarios/{id}

🧍‍♂️ Alunos
#### 📥 Criar Aluno
- POST /alunos

```json
{
  "nome": "Pedro",
  "idade": 28,
  "sexo": "MASCULINO",
  "telefone": "11999999999",
  "usuario": {
    "id": 1
  }
}
```
- 📤 Buscar Todos os Alunos
GET /alunos

- 🔍 Buscar Aluno por ID
GET /alunos/{id}

- 🔍 Buscar Alunos de um Usuário
GET /alunos/usuario/{usuarioId}

- ❌ Deletar Aluno
DELETE /alunos/{id}

🎯 Objetivos
#### 📥 Criar/Atualizar Objetivo
- POST /objetivos

```json
{
  "descricao": "Ganhar massa muscular",
  "aluno": {
    "id": 2
  }
}
```
- 🔍 Buscar Objetivo de um Aluno
GET /objetivos/aluno/{alunoId}

- ❌ Deletar Objetivo
DELETE /objetivos/{id}

🏥 Histórico de Saúde
#### 📥 Criar Histórico de Saúde
- POST /historicos-saude

```json
{
  "descricao": "Hipertensão controlada",
  "aluno": {
    "id": 2
  }
}
```
- 🔍 Buscar Histórico de Saúde por Aluno
GET /historicos-saude/aluno/{alunoId}

-  ❌ Deletar Histórico de Saúde
DELETE /historicos-saude/{id}

🏋️ Rotinas de Treino
#### 📥 Criar Rotina
- POST /rotinas

```json
{
  "descricao": "Treino ABC: Segunda, Quarta e Sexta",
  "aluno": {
    "id": 2
  }
}
```
- 🔍 Buscar Rotina por Aluno
GET /rotinas/aluno/{alunoId}

- ❌ Deletar Rotina
DELETE /rotinas/{id}

👨‍👩‍👧 Responsáveis
#### 📥 Criar Responsável
- POST /responsaveis

```json
{
  "nome": "Carlos",
  "telefone": "11988888888",
  "aluno": {
    "id": 2
  }
}
```
- 🔍 Buscar Responsável por Aluno
GET /responsaveis/aluno/{alunoId}

- ❌ Deletar Responsável
DELETE /responsaveis/{id}

🥋 Graduações
📥 Criar Graduação
POST /graduacoes

```json
{
  "nivel": "Faixa Azul",
  "dataGraduacao": "2024-05-16",
  "aluno": {
    "id": 2
  }
}
```
- 🔍 Buscar Graduações por Aluno
GET /graduacoes/aluno/{alunoId}

- ❌ Deletar Graduação
DELETE /graduacoes/{id}

📆 Presenças
#### 📥 Registrar Presença
- POST /presencas

```json
{
  "dataPresenca": "2024-05-16",
  "aluno": {
    "id": 2
  }
}
```
- 🔍 Buscar Presenças por Aluno
GET /presencas/aluno/{alunoId}

- ❌ Deletar Presença
DELETE /presencas/{id}

📝 Anotações
#### 📥 Criar Anotação
- POST /anotacoes

```json
{
  "texto": "Fazer alongamento antes do treino",
  "dataAnotacao": "2024-05-15",
  "aluno": {
    "id": 2
  }
}
```
- 🔍 Buscar Anotações por Aluno
GET /anotacoes/aluno/{alunoId}

- ❌ Deletar Anotação
DELETE /anotacoes/{id}

## ✅ Observações
Todas as requisições POST exigem um JSON no corpo da requisição.

As rotas que usam {id} ou {alunoId} devem receber um número válido como parâmetro.

As entidades estão interligadas ao Aluno e, indiretamente, ao Usuario.
