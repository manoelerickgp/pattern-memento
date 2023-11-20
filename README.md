# pattern-memento

DESIGN PATTERN MEMENTO 

Memento quer dizer lembrança, o padrão de projeto memento é um padrão comportamental que permite armazenar e restaurar o estado de um objeto sem violar o seu encapsulamento. Ele é útil quando se quer permitir que o usuário desfaça ou refaça alguma operação, ou quando se quer salvar o estado de um objeto para uso posterior. 

  
Elementos: 

-> Originator (Originador): 

O Originator é o objeto cujo estado se quer preservar. Ele tem a responsabilidade de criar um objeto Memento que representa seu estado atual e pode restaurar seu estado a partir da instância de um objeto Memento. 

-> Memento(Lembraça):  

O Memento é o objeto que armazena o estado interno do Originator. Ele é imutável e só pode ser acessado pelo originador. 

-> Caretaker (Cuidador): 

O Caretaker é responsável por armazenar e gerenciar objetos Memento. Ele não sabe nada sobre o estado interno do Memento ou do Originator. Ele simplesmente armazena e recupera os estados. 

  
Aplicabilidades: 

-> O padrão memento pode ser usado em sistemas que precisam oferecer a funcionalidade de desfazer e refazer operações, como editores de texto, editores gráficos, jogos, etc. 

-> O padrão memento também pode ser usado em sistemas que precisam salvar o estado de um objeto para uso posterior, como navegadores web, calculadoras, etc. 

-> O padrão memento pode ser combinado com outros padrões de projeto, como o comando, o observador e o iterador, para aumentar a flexibilidade e a eficiência do sistema. 

 
Vantagens: 

-> Desacoplamento:  

O padrão Memento permite que o Originador mantenha seu estado interno sem expor sua estrutura interna. Isso ajuda a manter o encapsulamento e o desacoplamento entre o Originador e o Cliente. 

 
-> Restauração de estado:  

O padrão Memento permite que o Cliente restaure o estado anterior do Originador. Isso é útil em situações em que o Cliente deseja desfazer uma ação anterior. 

 
-> Flexibilidade:  

O padrão Memento é flexível o suficiente para ser usado em vários tipos de objetos. Isso significa que ele pode ser aplicado em diferentes contextos e situações. 

 
