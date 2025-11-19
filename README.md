Projeto de Extensão - Padaria 3 Irmãos 🍞

Repositório destinado à disciplina de Programação para Dispositivos Móveis em Android (Estácio).

Este projeto contém a implementação do módulo de persistência de dados (Back-end local) para o aplicativo de gestão de encomendas da Padaria 3 Irmãos, localizada em Carapicuíba/SP.

📱 Sobre o Projeto

O objetivo é substituir o controle manual (papel/caderno) de encomendas por uma solução mobile, evitando perdas de pedidos e erros de agendamento.

🛠 Tecnologias Utilizadas

Linguagem: Kotlin

Banco de Dados: Room Database (SQLite)

Arquitetura: MVVM / DAO Pattern

IDE: Android Studio

📂 Estrutura dos Arquivos

O repositório foca nas classes principais da lógica de negócios:

Encomenda.kt: A entidade que representa a tabela de pedidos no banco de dados.

EncomendaDao.kt: A interface de acesso a dados (Data Access Object) contendo as queries SQL.

AppDatabase.kt: A configuração central do banco de dados Room.

👤 Autor

Nome: Vitor Gabriel Santos Coelho
Curso: Análise e Desenvolvimento de Sistemas
