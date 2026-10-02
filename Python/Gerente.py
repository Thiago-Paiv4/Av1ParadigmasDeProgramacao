from FuncionarioPadrao import FuncionarioPadrao


class Gerente(FuncionarioPadrao):
    def __init__(self, nome, idade, cpf, salarioFixo, codigoFuncionario, bonus):
        super().__init__(nome, idade, cpf, salarioFixo, codigoFuncionario)
        self.__bonus = bonus

    def getBonus(self):
        return self.__bonus

    def calculoSalario(self):
        return self.getSalarioFixo() + self.__bonus

    def mostraDados(self):
        super().mostraDados()
        print("O bônus que ganhou por ser gerente foi de: R$", self.__bonus)

    def mostraCargo(self):
        print("Cargo: Gerente")