public class Vendedor extends FuncionarioPadrao {
    private double vendasEmReais;
    private double porcentagemComissao = 0.05;

    public Vendedor(String nome, int idade, String cpf, double salarioBruto, double codigoFuncionario, double vendasEmReais) {
        super(nome, idade, cpf, salarioBruto, codigoFuncionario);
        this.vendasEmReais = vendasEmReais;
    }

    public double getVendasEmReais(){
        return this.vendasEmReais;
    }

    public double calculaValorComissao(){
        return vendasEmReais * porcentagemComissao;
    }
    @Override
    public double calculoSalario(){
        return salarioFixo + (vendasEmReais * porcentagemComissao );
    }

    @Override
    public void mostraDados(){
        super.mostraDados();
        System.out.println("A quantidade arrecadada em reais nas vendas desse funcionário foi de: R$"+ vendasEmReais);
        System.out.println("O vendedor ganha 5% desse valor em comissão,ou seja: R$"+calculaValorComissao());
    }
    @Override
    public void mostraCargo() {
        System.out.println("Cargo: Vendedor");
    }
}