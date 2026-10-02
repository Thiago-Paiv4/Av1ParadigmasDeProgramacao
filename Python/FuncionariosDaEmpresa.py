from FuncionarioPadrao import FuncionarioPadrao
from Gerente import Gerente
from Vendedor import Vendedor


kleber = FuncionarioPadrao("Kleber", 53, "12345567-02", 3500, 35582)
roger = Gerente("Roger da Silva", 45, "5575783383-01", 3500, 35540, 2000)
jose = Vendedor("José", 22, "558384747-04", 2500, 35678, 10000)


kleber.mostraDados()
kleber.mostraCargo()

roger.mostraDados()
roger.mostraCargo()

jose.mostraDados()
jose.mostraCargo()