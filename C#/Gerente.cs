public class Gerente : FuncionarioPadrao
{
    private double bonus;

    public Gerente(
        string nome,
        int idade,
        string cpf,
        double salarioFixo,
        double codigoFuncionario,
        double bonus)
        : base(nome, idade, cpf, salarioFixo, codigoFuncionario)
    {
        this.bonus = bonus;
    }

    public double GetBonus()
    {
        return this.bonus;
    }

    public override double CalculoSalario()
    {
        return GetSalarioFixo() + bonus;
    }

    public override void MostraDados()
    {
        base.MostraDados();

        Console.WriteLine(
            "O bônus que ganhou por ser gerente foi de: R$"
            + this.bonus);
    }

    public override void MostraCargo()
    {
        Console.WriteLine("Cargo: Gerente");
    }
}