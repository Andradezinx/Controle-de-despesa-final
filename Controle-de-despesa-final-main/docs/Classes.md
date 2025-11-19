# Documentação das Classes

## Despesa (abstrata)
- **Atributos:** id, descricao, valorTotal, valorPago, vencimento, paga
- **Métodos:** calcularPrioridadePagamento(), registrarPagamento()

## Transporte (concreta)
- Extende Despesa
- Atributo adicional: meio (ex.: ônibus, uber)
- Sobrescreve calcularPrioridadePagamento()

## Usuario
- Atributos: id, login, senha (criptografada)
- Métodos: validarLogin(), alterarSenha()

## TipoDespesa
- Atributos: id, nome, descricao
- Métodos: editar(), excluir()
