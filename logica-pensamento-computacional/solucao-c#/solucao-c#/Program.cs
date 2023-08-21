// See https://aka.ms/new-console-template for more information
using System;

public class Desafio
{
    public static void Main()
    {
        Console.Write("Digite o valor do salário: ");
        float valorSalario = float.Parse(Console.ReadLine());

        Console.Write("Digite o valor do benefício: ");
        float valorBeneficios = float.Parse(Console.ReadLine());

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100)
        {
            valorImposto = 0.05F * valorSalario;
        }
        else if (valorSalario >= 1100.01 && valorSalario <= 2500.00){
            valorImposto = 0.10F * valorSalario;
        }
        else
        {
            valorImposto = 0.15F * valorSalario;
        }

        float saida = valorSalario - valorImposto + valorBeneficios;
        Console.WriteLine(saida.ToString("O salário liquído é R$ 0.00"));
    }
}
