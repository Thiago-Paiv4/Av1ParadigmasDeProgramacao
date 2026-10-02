public class FuncionarioPadrao
{
    protected string nome;
    protected int idade;
    protected string cpf;
    protected double codigoFuncionario;
    protected double salarioFixo;

    public FuncionarioPadrao(
        string nome,
        int idade,
        string cpf,
        double salarioBruto,
        double codigoFuncionario)
    {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.codigoFuncionario = codigoFuncionario;
        this.salarioFixo = salarioBruto;
    }

    public string GetNome()
    {
        return this.nome;
    }

    public int GetIdade()
    {
        return this.idade;
    }

    public string GetCpf()
    {
        return this.cpf;
    }

    public double GetSalarioFixo()
    {
        return this.salarioFixo;
    }

    public double GetCodigoFuncionario()
    {
        return this.codigoFuncionario;
    }

    public virtual double CalculoSalario()
    {
        return this.salarioFixo;
    }

    public virtual void MostraDados()
    {
        Console.WriteLine("---------------------------------------------------------------");
        Console.WriteLine("Nome: " + this.nome);
        Console.WriteLine("Idade: " + this.idade);
        Console.WriteLine("Cpf: " + this.cpf);
        Console.WriteLine("Código de identificação: " + this.codigoFuncionario);
        Console.WriteLine("Salário Fixo: R$" + this.salarioFixo);
        Console.WriteLine("Salário total: R$" + CalculoSalario());
    }

    public virtual void MostraCargo()
    {
        Console.WriteLine("Cargo: Funcionário Padrão");
    }
}