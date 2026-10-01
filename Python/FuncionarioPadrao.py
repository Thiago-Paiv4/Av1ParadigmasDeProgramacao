class FuncionarioPadrao:

    def __init__(self, nome, idade, cpf, salarioBruto, codigoFuncionario):

   
        self.__nome = nome
        self.__idade = idade
        self.__cpf = cpf
        self.__salarioFixo = salarioBruto
        self.__codigoFuncionario = codigoFuncionario

 
    def getNome(self):
        return self.__nome

    def getIdade(self):
        return self.__idade

    def getCpf(self):
        return self.__cpf

    def getSalarioFixo(self):
        return self.__salarioFixo

    def getCodigoFuncionario(self):
        return self.__codigoFuncionario

    def calculoSalario(self):
        return self.__salarioFixo

    def mostraDados(self):
        print("---------------------------------------------------------------")
        print("Nome:", self.__nome)
        print("Idade:", self.__idade)
        print("Cpf:", self.__cpf)
        print("Código de identificação:", self.__codigoFuncionario)
        print("Salário Fixo: R$", self.__salarioFixo)
        print("Salário total: R$", self.calculoSalario())

    def mostraCargo(self):
        print("Cargo: Funcionário Padrão")