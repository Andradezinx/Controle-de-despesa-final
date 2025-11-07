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