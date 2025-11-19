# Sistema de Controle de Despesas FINAL

Sistema para gerenciar despesas, pagamentos, categorias e usuários. Utiliza Programação Orientada a Objetos (POO) com herança, interfaces, polimorfismo e persistência em arquivos de texto. E claro ajuda com a IA

## Funcionalidades
- Entrar Despesa
- Anotar Pagamento
- Listar Despesas (Pagas/Pendentes)
- Gerenciar Tipos de Despesa
- Gerenciar Usuários

## Padrões
- Classes abstratas: `Despesa`
- Subclasses: `Transporte`, `Eventual`, `Superfluo`
- Interface: `Pagavel`
- Criptografia: SHA-256
- Persistência: arquivos `.txt`
- Contador global: `ContadorDespesas`

## Documentação das Classes
- `Despesa`: classe abstrata com atributos comuns
- `Usuario`: login e senha criptografada
- `TipoDespesa`: gerencia categorias
- `Pagamento`: registra pagamentos

## B4T01.2 - Segundo Commit 0.0.2

### Separação de Prioridades
- MVP: cadastro de despesa, registro de pagamento, listagem simples, cadastro de usuário com senha criptografada.
- Futuro: filtros por período/categoria, edição/exclusão, relatórios.

### POC
- Menu principal funcionando.
- Persistência inicial em arquivos `.txt`.

### MVP
- Fluxo básico implementado:
  1. Entrar despesa.
  2. Anotar pagamento.
  3. Listar despesas pagas/pendentes.
  4. Cadastro de usuário com senha criptografada.
