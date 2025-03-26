# Processo Seletivo Simulado em Java

## 📝 Descrição do Projeto
Este projeto simula um sistema de processo seletivo, desenvolvido em Java como parte do Bootcamp JavaCloudNative oferecido pelo Banco Bradesco na plataforma DIO (Digital Innovation One). O programa analisa candidatos com base em seus salários pretendidos e simula o contato com os selecionados.

## 🛠️ Principais Funcionalidades

### 1. Análise de Candidatos
- Gera salários aleatórios entre R$ 1.800 e R$ 2.200 para cada candidato
- Classifica os candidatos em três categorias:
  - **Ligar para o candidato** (salário ≤ R$ 2.000)
  - **Ligar com contra proposta** (salário = R$ 2.000)
  - **Aguardar resultado** (salário > R$ 2.000)

### 2. Seleção Automática
- Filtra até 5 candidatos com salário pretendido ≤ R$ 2.000
- Armazena os selecionados em um array

### 3. Simulação de Contato
- Realiza tentativas de contato (até 3 por candidato)
- Simula probabilidade de 33% de sucesso em cada tentativa
- Exibe resultado do contato (sucesso ou falha)


