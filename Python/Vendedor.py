from FuncionarioPadrao import FuncionarioPadrao

class Vendedor(FuncionarioPadrao):

    def __init__(self, nome, idade, cpf, salarioBruto, codigoFuncionario, vendasEmReais):

        super().__init__(nome, idade, cpf, salarioBruto, codigoFuncionario)

  
        self.__vendasEmReais = vendasEmReais


        self.__porcentagemComissao = 0.05

    def getVendasEmReais(self):
        return self.__vendasEmReais

    def calculaValorComissao(self):
        return self.__vendasEmReais * self.__porcentagemComissao


    def calculoSalario(self):
        return self.getSalarioFixo() + (
            self.__vendasEmReais * self.__porcentagemComissao
        )

   
    def mostraDados(self):
        super().mostraDados()

        print(
            "A quantidade arrecadada em reais nas vendas desse funcionário foi de: R$",
            self.__vendasEmReais
        )

        print(
            "O vendedor ganha 5% desse valor em comissão, ou seja: R$",
            self.calculaValorComissao()
        )


    def mostraCargo(self):
        print("Cargo: Vendedor")