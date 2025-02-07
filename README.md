<h1>Conversor de Moeda (Currency Converter)</h1>
    
<h2>Descrição</h2>
<p>Este projeto consiste em um programa que calcula o valor em reais (BRL) a ser pago por uma determinada quantia em dólares (USD), considerando a taxa de cotação do dólar e uma alíquota de IOF (Imposto sobre Operações Financeiras) de 6%.</p>
    
<p>Para isso, foi criada uma classe <strong>CurrencyConverter</strong>, que é responsável pelos cálculos necessários.</p>
    
<h2>Funcionalidades</h2>
<ul>
    <li>Ler a cotação do dólar.</li>
    <li>Ler o valor em dólares que será comprado.</li>
    <li>Calcular o valor total em reais considerando o IOF de 6%.</li>
</ul>
    
<h2>Estrutura do Código</h2>
<p>O programa utiliza <strong>membros estáticos</strong> na classe <code>CurrencyConverter</code>. Isso significa que os métodos pertencem à classe e podem ser acessados sem a necessidade de criar instâncias da mesma.</p>
    
<h3>Membros Estáticos</h3>
<ul>
    <li>Um método estático para calcular o valor total em reais.</li>
    <li>Uma constante que representa a taxa de IOF.</li>
</ul>
    
<h2>Exemplo de Uso</h2>
<p>O programa solicita ao usuário:</p>
<ol>
    <li>A cotação do dólar (ex: 5.00 BRL/USD)</li>
    <li>O valor em dólares a ser comprado (ex: 100 USD)</li>
</ol>
    
<p>Com base nesses valores, o programa calcula:</p>
<pre>
Total em reais = (Valor em dólares * Cotação) + IOF (6%)
</pre>
<p>Se o usuário inserir uma cotação de <strong>5.00</strong> e quiser comprar <strong>100 USD</strong>, o programa calculará:</p>
<pre>
100 * 5.00 = 500.00
IOF (6% de 500.00) = 30.00
Total a pagar = 530.00 BRL
</pre>
    
<h2>Tecnologias Utilizadas</h2>
    <ul>
        <li>Linguagem: Python</li>
        <li>Paradigma: Programação Orientada a Objetos (POO) com uso de membros estáticos</li>
    </ul>
    
<h2>Como Executar o Programa</h2>
    <ol>
        <li>Certifique-se de ter o Python instalado em seu sistema.</li>
        <li>Salve o código em um arquivo <code>currency_converter.py</code>.</li>
        <li>Execute o programa no terminal ou em um ambiente Python interativo.</li>
    </ol>
    
<h2>Autor</h2>
<p>Projeto desenvolvido para fins educativos, abordando conceitos de classes, membros estáticos e conversão de moeda em Python.</p>


