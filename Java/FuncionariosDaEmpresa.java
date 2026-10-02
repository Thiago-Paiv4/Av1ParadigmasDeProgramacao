public class FuncionariosDaEmpresa {
    public static void main(String[] args) {
        FuncionarioPadrao kleber = new FuncionarioPadrao("Kleber", 53,"12345567-02",3500, 35582);
        Gerente roger = new Gerente("Roger da Silva", 45, "5575783383-01",3500,35540,2000);
        Vendedor jose = new Vendedor("José",22,"558384747-04", 2500,35678,10000);


        kleber.mostraDados();
        kleber.mostraCargo();

        roger.mostraDados();
        roger.mostraCargo();

        jose.mostraDados();
        jose.mostraCargo();

    }
}