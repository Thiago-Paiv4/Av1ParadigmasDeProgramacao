public class FuncionarioPadrao {
    protected String nome;
    protected int idade;
    protected String cpf;
    protected double codigoFuncionario;
    protected double salarioFixo;

    public FuncionarioPadrao(String nome, int idade, String cpf, double salarioBruto, double codigoFuncionario) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.codigoFuncionario = codigoFuncionario;
        this.salarioFixo = salarioBruto;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getCpf() {
        return this.cpf;
    }

    public double getSalarioFixo() {
        return this.salarioFixo;
    }

    public double getCodigoFuncionario(){
        return this.codigoFuncionario;
    }

    public double calculoSalario(){
        return this.salarioFixo;
    }

    public void mostraDados(){
        System.out.println("---------------------------------------------------------------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: " +this.idade);
        System.out.println("Cpf: "+this.cpf);
        System.out.println("Código de identificação: "+this.codigoFuncionario);
        System.out.println("Salário Fixo: R$"+ this.salarioFixo);
        System.out.println("Salário total: R$"+ calculoSalario());
    }

    public void mostraCargo(){
        System.out.println("Cargo: Funcionário Padrão");
    }

}
