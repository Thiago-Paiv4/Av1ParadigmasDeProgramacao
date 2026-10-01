public class Gerente extends FuncionarioPadrao {
    private double bonus;

    public Gerente(String nome, int idade, String cpf, double salarioFixo, double codigoFuncionario,double bonus) {
        super(nome, idade, cpf, salarioFixo,codigoFuncionario);
        this.bonus = bonus;
    }

    public double getBonus(){
        return this.bonus;
    }

    @Override
    public double calculoSalario(){
        return salarioFixo + bonus;
    }
    @Override
    public void mostraDados(){
        super.mostraDados();
        System.out.println("O bônus que ganhou por ser gerente foi de: R$"+ this.bonus);
    }

    @Override
    public void mostraCargo(){
        System.out.println("Cargo: Gerente");
    }
}
