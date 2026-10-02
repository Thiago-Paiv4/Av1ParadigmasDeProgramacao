public class Vendedor : FuncionarioPadrao
{
    private double vendasEmReais;
    private double porcentagemComissao = 0.05;

    public Vendedor(
        string nome,
        int idade,
        string cpf,
        double salarioFixo,
        double codigoFuncionario,
        double vendasEmReais)
        : base(nome, idade, cpf, salarioFixo, codigoFuncionario)
    {
        this.vendasEmReais = vendasEmReais;
    }

    public double GetVendasEmReais()
    {
        return this.vendasEmReais;
    }

    public double CalculaValorComissao()
    {
        return vendasEmReais * porcentagemComissao;
    }

    public override double CalculoSalario()
    {
        return GetSalarioFixo() + (vendasEmReais * porcentagemComissao);
    }

    public override void MostraDados()
    {
        base.MostraDados();

        Console.WriteLine(
            "A quantidade arrecadada em reais nas vendas desse funcionário foi de: R$"
            + vendasEmReais);

        Console.WriteLine(
            "O vendedor ganha 5% desse valor em comissão, ou seja: R$"
            + CalculaValorComissao());
    }

    public override void MostraCargo()
    {
        Console.WriteLine("Cargo: Vendedor");
    }
}