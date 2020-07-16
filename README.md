# *Fórmulas e Funções do Folha Cloud*

*Este projeto auxilia na criação de fórmulas de eventos da folha de pagamento e funções para fórmulas. As fórmulas e eventos criadas pelo desenvolvimento também estão disponíveis na pasta "modelos"*


<html><body><hr></body></html>

## _Sumário_

#### [Funções reservadas](#funcoesReservadas)
* ##### [AdicionaisTempoServico](#AdicionaisTempoServico)
* ##### [Afastamentos](#Afastamentos)
* ##### [AvisoPrevio](#AvisoPrevio)
* ##### [Bases](#Bases)
* ##### [BasesOutrasEmpresas](#BasesOutrasEmpresas)
* ##### [Eventos](#Eventos)
* ##### [EncargosSociais](#EncargosSociais)
* ##### [FuncoesGratificadas](#FuncoesGratificadas)
* ##### [SalarioFamilia](#SalarioFamilia)
* ##### [Emprestimos](#Emprestimos)
* ##### [Funcoes](#Funcoes)
* ##### [Lancamentos](#Lancamentos)
* ##### [PlanoSaudeDespesas](#PlanoSaudeDespesas)
* ##### [PeriodosAquisitivos](#PeriodosAquisitivos)
* ##### [PeriodosAquisitivosDecimoTerceiro](#PeriodosAquisitivosDecimoTerceiro)
* ##### [ValesTransporte](#ValesTransporte)

### [Variáveis reservadas](#variaveisReservadas)
* ##### [aposentado](#aposentado)
* ##### [calculo](#calculo)
* ##### [estagiario](#estagiario)
* ##### [evento](#evento)
* ##### [folha](#folha)
* ##### [folhas](#folhas)
* ##### [folhasPeriodo](#folhasPeriodo)
* ##### [funcionario](#funcionario)
* ##### [mediaVantagem](#mediaVantagem)
* ##### [matricula](#matricula)
* ##### [periodoAquisitivo](#periodoAquisitivo)
* ##### [periodoConcessao](#periodoConcessao)
* ##### [pensionista](#pensionista)
* ##### [periodoAquisitivoDecimoTerceiro](#periodoAquisitivoDecimoTerceiro)
* ##### [servidor](#servidor)
* ##### [valorReferencia](#valorReferencia)
* ##### [valorCalculado](#valorCalculado)

#### [Enums](#Enums)
* ##### [AplicacaoDesconto](#AplicacaoDesconto)
* ##### [Bases](#Bases)
* ##### [ClassificacaoAdicional](#ClassificacaoAdicional)
* ##### [ClassificacaoEvento](#ClassificacaoEvento)
* ##### [ClassificacaoTipoAfastamento](#ClassificacaoTipoAfastamento)
* ##### [FormaPagamento](#FormaPagamento)
* ##### [GrauDeficiencia](#GrauDeficiencia)
* ##### [MesContribuicaoSindical](#MesContribuicaoSindical)
* ##### [OcorrenciaSefip](#OcorrenciaSefip)
* ##### [OrigemRendimento](#OrigemRendimento)
* ##### [ResponsabilidadePagamento](#ResponsabilidadePagamento)
* ##### [Sexo](#Sexo)
* ##### [SituacaoPeriodoAquisitivoDecimoTerceiro](#SituacaoPeriodoAquisitivoDecimoTerceiro)
* ##### [SituacaoPeriodoAquisitivo](#SituacaoPeriodoAquisitivo)
* ##### [SubTipoProcessamento](#SubTipoProcessamento)
* ##### [TipoAdmissao](#TipoAdmissao)
* ##### [TipoDespesaPlanoSaude](#TipoDespesaPlanoSaude)
* ##### [TipoEvento](#TipoEvento)
* ##### [TipoMatricula](#TipoMatricula)
* ##### [TipoOnus](#TipoOnus)
* ##### [TipoProcessamento](#TipoProcessamento)
* ##### [TipoRegime](#TipoRegime)
* ##### [TipoRegimePrevidenciario](#TipoRegimePrevidenciario)
* ##### [TipoRetornoValeTransporte](#TipoRetornoValeTransporte)
* ##### [TipoSalarioFamilia](#TipoSalarioFamilia)
* ##### [TipoValor](#TipoValor)
* ##### [TipoVinculo](#TipoVinculo)
* ##### [UnidadeEvento](#UnidadeEvento)

#### [Funçoes para fórmulas (mantidas pelo desenvolvimento)](#funcoes-formulas)
* ##### [acumula](#acumula)
* ##### [afasaborto](#afasaborto)
* ##### [afasacidtrab](#afasacidtrab)
* ##### [afasacidtrabemp](#afasacidtrabemp)
* ##### [afasadocao](#afasadocao)
* ##### [afasauxdoenc](#afasauxdoenc)
* ##### [afasauxdoencemp](#afasauxdoencemp)
* ##### [afasdirinteg](#afasdirinteg)
* ##### [afaslicmat](#afaslicmat)
* ##### [afaslicsvenc](#afaslicsvenc)
* ##### [afasprorroglicmat](#afasprorroglicmat)
* ##### [afasprorroglicmatlei11770](#afasprorroglicmatlei11770)
* ##### [afasservmil](#afasservmil)
* ##### [avos13](#avos13)
* ##### [buscaMes](#buscaMes)
* ##### [calcexclusivo](#calcexclusivo)
* ##### [calcprop](#calcprop)
* ##### [cedidocomonus](#cedidocomonus)
* ##### [cedidosemonus](#cedidosemonus)
* ##### [cnvdpbase](#cnvdpbase)
* ##### [dadosMatricula](#dadosMatricula)
* ##### [deducauxmat13](#deducauxmat13)
* ##### [diasafast](#diasafast)
* ##### [diasafastcalc30](#diasafastcalc30)
* ##### [diasaposent](#diasaposent)
* ##### [diasferias](#diasferias)
* ##### [diastrab](#diastrab)
* ##### [dtafast](#dtafast)
* ##### [dtrescisao](#dtrescisao)
* ##### [faltas](#faltas)
* ##### [getfgtsFerias](#getfgtsFerias)
* ##### [getInssFerias](#getInssFerias)
* ##### [getIrrfFerias](#getIrrfFerias)
* ##### [getTotalFerias](#getTotalFerias)
* ##### [getValorFerias](#getValorFerias)
* ##### [idade](#idade)
* ##### [inicioCompetencia](#inicioCompetencia)
* ##### [mesesafast](#mesesafast)
* ##### [mesesmat13](#mesesmat13)
* ##### [ocorrenciaSefip](#ocorrenciaSefip)
* ##### [optanteFgts](#optanteFgts)
* ##### [pagapensao](#pagapensao)
* ##### [permitecalc13integral](#permitecalc13integral)
* ##### [possuiPrevidenciaFederal](#possuiPrevidenciaFederal)
* ##### [primeiroDia](#primeiroDia)
* ##### [recebeDecimoTerceiro](#recebeDecimoTerceiro)
* ##### [recebidosemonus](#recebidosemonus)
* ##### [remuneracao](#remuneracao)
* ##### [replicaFeriasNaFolhaMensal](#replicaFeriasNaFolhaMensal)
* ##### [somenteAposentadosBeneficiarios](#somenteAposentadosBeneficiarios)
* ##### [somenteFuncionario](#somenteFuncionario)

<html><body><hr></body></html>

# *Funções reservadas* <a name="funcoesReservadas"></a> 
  
### *_Afastamentos_* <a name="Afastamentos"></a> 
#### _buscaPorPeriodo_
_Permite buscar os afastamentos de uma matrícula informando uma lista de classificações de afastamentos dentro de um período_
 
|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|dataInicial|Data inicial da verificação de afastamentos, caso não seja informado será considerado o início da competência|Não|
|dataFinal|Data final da verificação de afastamentos, caso não seja informado será considerado o início da competência|Não|
|classificacoes|Classificações de afastamentos, use ClassificacaoTipoAfastamento.[classificação de afastamento] |Sim|

```
Utilizado na função : afasservmil
Afastamentos.buscaPorPeriodo(ClassificacaoTipoAfastamento.SERVICO_MILITAR).each { afast ->
    def diaFim = afast.fim.dia
    def fim = afast.fim
    if (diaFim > 30) {
        fim = Datas.data(afast.fim.ano, afast.fim.mes, 30)
    }
    dias += Datas.diferencaDias(afast.inicio, fim) + 1
}

```

<html><body><hr></body></html>


### *_AdicionaisTempoServico_* <a name="AdicionaisTempoServico"></a> 
#### _busca_
_Busca no sistema RH a quantidade (em valor ou percentual) de adicionais adquiridos conforme a classificação de adicional_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|tipo|1- retorna o valor, 2 - retorna o percentual|Sim|
|classificacaoAdicional|Classificação do adicional|Sim|

```
Utilizado no evento :  Anuênio
if (rh == 1) {
    valorReferencia = AdicionaisTempoServico.busca(2, ClassificacaoAdicional.ANUENIO)
} 
```

<html><body><hr></body></html>

 ### *_AvisoPrevio_* <a name="AvisoPrevio"></a>
 #### _dataFimAviso_ 
 _Retorna a data final do aviso prévio_
 ```
def dataFimAviso = AvisoPrevio.dataFimAviso 
``` 
 
#### _dataPrevistaDesligamento_ 
_Retorna a data prevista do desligamento informado no aviso prévio_
```
def dataPrevistaDesligamento = AvisoPrevio.dataPrevistaDesligamento 
``` 

#### _motivoRescisao_ 
_Retorna o motivo da rescisão informado no aviso prévio_
```
def motivoRescisao = AvisoPrevio.motivoRescisao 
``` 

#### _dataAviso_ 
_Retorna a data do aviso prévio_
```
def dataAviso = AvisoPrevio.dataAviso 
``` 

#### _quantidadeDiasAviso_  <a name="teste"></a>
_Retorna a quantidade de dias de aviso prévio_
```
def quantidadeDiasAviso = AvisoPrevio.quantidadeDiasAviso 
if ( quantidadeDiasAviso > 0 ){ ...
``` 

#### _tipo_ 
_Retorna o tipo de aviso prévio_
```
def tipo = AvisoPrevio.tipo 
if ( TipoAvisoPrevio.INDENIZADO.equals(tipo) ){ ...
``` 

<html><body><hr></body></html>

 ### *_Bases_* <a name="Bases"></a> 
 #### _valor_
 _Permite buscar o valor de uma base no cálculo atual_
 
|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|tipo de base|Informar um tipo de base, use Bases.[sigla da base]|Sim|


```
Utilizado no evento : HORAS EXTRAS 50%
//É importante se atentar a dependências de fórmulas quando for referênciar outra base
if (Eventos.valor(1) > 0) {
	base = Bases.valor(Bases.HORAEXTRA)
...
```
#### _compor_
 _Permite informar um valor para composição de um ou vários tipos de bases de cálculo_
 
|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|valor|Valor que irá compor a base|Sim|
|tipo(s) de base(s)|Um ou vários tipos de bases|Sim|


```
Utilizado no evento : HORAS NORMAIS
valorCalculado = funcionario.salario;
Bases.compor(valorCalculado, Bases.SALBASE, Bases.FGTS, Bases.IRRF, Bases.INSS)
```

 #### _valorCalculado_
 _Permite buscar o valor de uma base de um cálculo que não seja o atual_
 
|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|tipo de base|Informar um tipo de base, use Bases.[sigla da base]|Sim|
|tipo de processamento|Informar um tipo de processamento|Sim|
|subtipo de processamento|Informar um subtipo de processamento|Sim|
|competencia|Informar uma competência, caso não seja informado será considerada a competência atual|Não|
|tipo de regime|Informar o tipo de regime, use TipoRegime.COMPETENCIA ou TipoRegime.CAIXA, caso não seja informado será considerado regime de competência |Não|


```
Utilizado no evento : F.G.T.S. 13º SALÁRIO
if (TipoProcessamento.DECIMO_TERCEIRO_SALARIO.equals(calculo.tipoProcessamento) && vaux > 0) {
        baseaux = Bases.valorCalculado(Bases.FGTS, TipoProcessamento.FERIAS, SubTipoProcessamento.INTEGRAL)
        baseaux += Bases.valorCalculado(Bases.FGTS, TipoProcessamento.MENSAL, SubTipoProcessamento.INTEGRAL)
...
```

<html><body><hr></body></html>

### *_BasesOutrasEmpresas_* <a name="BasesOutrasEmpresas"></a> 
#### _buscaPor_
_Permite buscar uma lista de bases de outras empresas conforme o tipo de processamento e competência informada_
 
|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|tipo de processamento|Informar um tipo de processamento|Sim|
|competencia|Informar uma competência, caso não seja informado será considerada a competência atual|Não|

```
//Use sum() para retornar o valor total de um propriedade em uma lista
return BasesOutrasEmpresas.buscaPor(calculo.tipoProcessamento, calculo.competencia).sum(0, { it.baseInss })
```

<html><body><hr></body></html>

### *_Eventos_* <a name="Eventos"></a> 
#### _valor_
_Permite o valor calculado de um evento do cálculo atual_
 
|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|tipo de processamento|Informar um tipo de processamento|Sim|
|codigo|Informar o código de uma evento|Sim|

```
Utilizado no evento : DESCONTO HORAS AFASTADO
//É importante se atentar a dependências de fórmulas quando for referênciar outro evento
valorCalculado = Eventos.valor(4) + Eventos.valor(5) + Eventos.valor(7) + Eventos.valor(8)
```
#### _valorReferencia_
_Permite o valor de referência de um evento do cálculo atual_
 
|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|tipo de processamento|Informar um tipo de processamento|Sim|
|codigo|Informar o código de uma evento|Sim|

```
Utilizado no evento : DESCONTO HORAS AFASTADO
//É importante se atentar a dependências de fórmulas quando for referênciar outro evento
if (!funcionario.possuiPrevidenciaFederal) {
    valorReferencia = Eventos.valorReferencia(7)
...
```

#### _valorCalculado_
_Permite buscar calculado ou de referência de um evento que não seja do cálculo atual_
 
|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|codigo|Informar o código de uma evento|Sim|
|tipo valor|Se deseja retornar o valor calculado ou de referência, use TipoValor.CALCULADO ou TipoValor.REFERENCIA|Sim|
|tipo de processamento|Informar um tipo de processamento|Sim|
|subtipo de processamento|Informar um subtipo de processamento|Sim|
|competencia|Informar uma competência, caso não seja informado será considerada a competência atual|Não|
|tipo de regime|Informar o tipo de regime, use TipoRegime.COMPETENCIA ou TipoRegime.CAIXA, caso não seja informado será considerado regime de competência |Não|


```
Utilizado no evento : F.G.T.S. 13º SALÁRIO
double vaux;
vaux  = Eventos.valorCalculado(36, TipoValor.CALCULADO , TipoProcessamento.MENSAL, SubTipoProcessamento.INTEGRAL)
```

<html><body><hr></body></html>

### *_EncargosSociais_* <a name="EncargosSociais"></a> 
#### _pisoSalarial_
_Retorna o piso salarial da entidade_

```
def pisoSalarial = EncargosSociais.pisoSalarial
``` 
#### _salarioMinimo_
_Retorna o salário mínio configurado na manutenção de estabelecimentos_

```
def salarioMinimo = EncargosSociais.salarioMinimo
```  
#### _tetoSalarial_
_Retorna o teto salarial da entidade_

```
def tetoSalarial = EncargosSociais.tetoSalarial
``` 
#### _inicioVigencia_
_Retorna o inicio da vigência do cadastro de manutenção de estabelecimentos que esta sendo utilizada no cálculo atual_

```
def inicioVigencia = EncargosSociais.inicioVigencia
```   

#### _cnaePreponderante_
_Retorna o cnae preponderante da entidade, essa informação fica no grupo RGPS_

```
def cnaePreponderante = EncargosSociais.RGPS.cnaePreponderante
``` 

#### _codigoFpas_
_Retorna o código FPAS da entidade, essa informação fica no grupo RGPS_

```
def codigoFpas = EncargosSociais.RGPS.codigoFpas
if ( EncargosSociaisFpas.ENTIDADE_BENEFICENTE.equals(codigoFpas){...
``` 

#### _codigoTerceiros_
_Retorna o código de terceiros da entidade, essa informação fica no grupo RGPS_

```
def codigoTerceiros = EncargosSociais.RGPS.codigoTerceiros
``` 

#### _percentualFap_
_Retorna o percentual do FAP da entidade, essa informação fica no grupo RGPS_

```
def percentualFap = EncargosSociais.RGPS.percentualFap
``` 

#### _percentualGilRat_
_Retorna o percentual do RAT da entidade, essa informação fica no grupo RGPS_

```
def percentualGilRat = EncargosSociais.RGPS.percentualGilRat
``` 

#### _percentualInssEmpregador_
_Retorna o percentual do inss empregador da entidade, essa informação fica no grupo RGPS_

```
def percentualInssEmpregador = EncargosSociais.RGPS.percentualInssEmpregador
``` 

#### _percentualIsencaoFilantropia_
_Retorna o percentual de percentual de isencao de entidade filantrópica, essa informação fica no grupo RGPS_

```
def percentualIsencaoFilantropia = EncargosSociais.RGPS.percentualIsencaoFilantropia
``` 

#### _percentualTerceiros_
_Retorna o percentual de terceiros da entidade, essa informação fica no grupo RGPS_

```
def percentualTerceiros = EncargosSociais.RGPS.percentualTerceiros
``` 

#### _codigoFgts_
_Retorna o código de saque do FGTS da entidade, essa informação fica no grupo FGTS_

```
def codigoFgts = EncargosSociais.FGTS.codigoFgts
``` 

#### _multaFgts_
_Retorna o percentual da multa FGTS da entidade, essa informação fica no grupo FGTS_

```
def multaFgts = EncargosSociais.FGTS.multaFgts
valorCalculado = (calculo.saldoFgts * multaFgts) / 100
``` 

#### _deducaoPorDependente_
_Retorna o valor de desconto por dependente, essa informação fica no grupo IRRF_

```
Utilizado no evento : DESCONTO POR DEPENDENTE
valorReferencia = servidor.dependentesIrrf
def deducaoPorDependente = EncargosSociais.IRRF.deducaoPorDependente
valorCalculado = valorReferencia * deducaoPorDependente
``` 

#### _minimoIrrfDarf_
_Retorna o valor mínimo configurado para DARF, essa informação fica no grupo IRRF_

```
Utilizado no evento : I.R.R.F.
if (valorCalculado < EncargosSociais.IRRF.minimoIrrfDarf) {
    valorCalculado = 0
} ...
``` 

#### _parcelaIsentaAposentadoria_
_Retorna o valor configurado para a parcela isenta de aposentadoria, essa informação fica no grupo IRRF_

```
def parcelaIsentaAposentadoria = EncargosSociais.IRRF.parcelaIsentaAposentadoria
``` 

#### _buscaContribuicao_
_Retorna um valor da coluna em uma faixa encontrada conforme o valor informado de uma  previdência ou de assistência conforme a origem de tipo. Este método pode ser utilizado para todos os tipos de previdências e assistências do RPPS_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|base|Valor base para ser comparado|Sim|
|coluna|coluna que deve retornar|Sim|

```
double valorbase = 1500.00 
previdenciaPropria = EncargosSociais.RPPS.PrevidenciaPropria.buscaContribuicao(valorbase, 2)
previdenciaEstadual = EncargosSociais.RPPS.PrevidenciaEstadual.buscaContribuicao(valorbase, 2)
fundoAssistencia = EncargosSociais.RPPS.FundoAssistencia.buscaContribuicao(valorbase, 2)
fundoFinanceiro = EncargosSociais.RPPS.FundoFinanceiro.buscaContribuicao(valorbase, 2)
``` 

#### _buscaMaior_
_Retorna a coluna referente faixa de maior valor encontrada conforme o valor informado de uma  previdência ou de assistência conforme a origem de tipo. Este método pode ser utilizado para todos os tipos de previdências e assistências do RPPS_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|coluna|coluna que deve retornar|Sim|

```
previdenciaPropria = EncargosSociais.RPPS.PrevidenciaPropria.buscaMaior(1)
previdenciaEstadual = EncargosSociais.RPPS.PrevidenciaEstadual.buscaMaior(1)
fundoAssistencia = EncargosSociais.RPPS.FundoAssistencia.buscaMaior(1)
fundoFinanceiro = EncargosSociais.RPPS.FundoFinanceiro.buscaMaior(1)
``` 

#### _indiceAporte_
_Retorna o percentual do índice de aporte de uma previdência ou de assistência conforme a origem de tipo. Este método pode ser utilizado para todos os tipos de previdências e assistências do RPPS_
```
previdenciaPropria = EncargosSociais.RPPS.PrevidenciaPropria.indiceAporte
previdenciaEstadual = EncargosSociais.RPPS.PrevidenciaEstadual.indiceAporte
fundoAssistencia = EncargosSociais.RPPS.FundoAssistencia.indiceAporte
fundoFinanceiro = EncargosSociais.RPPS.FundoFinanceiro.indiceAporte
``` 

#### _maximo_
_Retorna o valor máximo de contribuição de uma previdência ou de assistência conforme a origem de tipo. Este método pode ser utilizado para todos os tipos de previdências e assistências do RPPS_
```
previdenciaPropria = EncargosSociais.RPPS.PrevidenciaPropria.maximo
previdenciaEstadual = EncargosSociais.RPPS.PrevidenciaEstadual.maximo
fundoAssistencia = EncargosSociais.RPPS.FundoAssistencia.maximo
fundoFinanceiro = EncargosSociais.RPPS.FundoFinanceiro.maximo
``` 

#### _minimo_
_Retorna o valor mínimo de contribuição de uma previdência ou de assistência conforme a origem de tipo. Este método pode ser utilizado para todos os tipos de previdências e assistências do RPPS_
```
previdenciaPropria = EncargosSociais.RPPS.PrevidenciaPropria.minimo
previdenciaEstadual = EncargosSociais.RPPS.PrevidenciaEstadual.minimo
fundoAssistencia = EncargosSociais.RPPS.FundoAssistencia.minimo
fundoFinanceiro = EncargosSociais.RPPS.FundoFinanceiro.minimo
``` 

#### _taxaAdministrativa_
_Retorna o percentual da taxa administrativa de contribuição de uma previdência ou de assistência conforme a origem de tipo. Este método pode ser utilizado para todos os tipos de previdências e assistências do RPPS_
```
previdenciaPropria = EncargosSociais.RPPS.PrevidenciaPropria.taxaAdministrativa
previdenciaEstadual = EncargosSociais.RPPS.PrevidenciaEstadual.taxaAdministrativa
fundoAssistencia = EncargosSociais.RPPS.FundoAssistencia.taxaAdministrativa
fundoFinanceiro = EncargosSociais.RPPS.FundoFinanceiro.taxaAdministrativa
``` 

#### Salário Família <a name="SalarioFamilia"></a> 

#### _buscaContribuicao_
_Retorno o valor da coluna do salário família conforme a base informada, este método pode ser aplicado para todos os tipos de salário família_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|base|Valor base para ser comparado|Sim|
|coluna|coluna que deve retornar|Sim|

```
double valorbase = 1500.00 
celetista = EncargosSociais.SalarioFamilia.Celetista.buscaContribuicao(valorbase, 2)
estatutario = EncargosSociais.SalarioFamilia.Estatutario.buscaContribuicao(valorbase, 2)
especial = EncargosSociais.SalarioFamilia.Especial.buscaContribuicao(valorbase, 2)
aposentado = EncargosSociais.SalarioFamilia.Aposentado.buscaContribuicao(valorbase, 2)
``` 

#### _buscaMaior_
_Retorno o valor da coluna de maior faix encontrada do salário família, este método pode ser aplicado para todos os tipos de salário família_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|coluna|coluna que deve retornar|Sim|

```
celetista = EncargosSociais.SalarioFamilia.Celetista.buscaMaior(1)
estatutario = EncargosSociais.SalarioFamilia.Estatutario.buscaMaior(1)
especial = EncargosSociais.SalarioFamilia.Especial.buscaMaior(1)
aposentado = EncargosSociais.SalarioFamilia.Aposentado.buscaMaior(1)
``` 

<html><body><hr></body></html>
  
### *_Emprestimos_* <a name="Emprestimos"></a> 
#### _busca_
_Retorna uma lista de empréstimos que podem ser filtrados pela situação_
 
|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|situacaoEmprestimo|Situação do empréstimo, caso não seja informado retornará empréstimos em qualquer situação|Não|

```
Emprestimos.busca(SituacaoEmprestimo.EM_ANDAMENTO).each { e ->
  e.parcelas.each { p ->
    if (Funcoes.primeiroDia(p.dataParcela) == Funcoes.primeiroDia(_dataCompetencia)) { 
      if (p.situacao == SituacaoEmprestimoParcela.PENDENTE) {
        valor = valor + p.valorParcela 
        Emprestimos.pagarParcela(e.id, p.id) //Realiza a baixa
      }
    }    
  }
}
```

#### _pagarParcela_
_Realiza a baixa da parcela de empréstimo no RH_
 
|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|emprestimoId|Identificador do empréstimo, será obtido percorrendo Emprestimos.busca()|Sim|
|emprestimoId|Identificador da parcela, será obtido percorrendo Emprestimos.busca() > parcelas|Sim|

```
Emprestimos.busca(SituacaoEmprestimo.EM_ANDAMENTO).each { e ->
  e.parcelas.each { p ->
    if (Funcoes.primeiroDia(p.dataParcela) == Funcoes.primeiroDia(_dataCompetencia)) { 
      if (p.situacao == SituacaoEmprestimoParcela.PENDENTE) {
        valor = valor + p.valorParcela 
        Emprestimos.pagarParcela(e.id, p.id) //Realiza a baixa
      }
    }    
  }
}
```  

<html><body><hr></body></html>

### *_FuncoesGratificadas_* <a name="FuncoesGratificadas"></a> 
#### _busca_
_Retorna os dias em função gratificada na competência com o id da função gratificada_
 
|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|idFuncaoGratificada|id da função, pode ser obtido na edição do cadastro da função gratificada, na url do navegador|Sim|

```
Utilizado no evento : FUNÇÃO GRATIFICADA I
int diasFuncao = FuncoesGratificadas.busca(123) onde 123 é o id da função gratificada
```

<html><body><hr></body></html>
  
### *_Funções_* <a name="Funcoes"></a> 
_Por meio de Funcoes é possível importar funções criadas no cadastro de funções para fórmulas, onde estão scripts criados pelo desenvolvimento à fim de facilitar o uso de recursos em eventos, diminuir código e possibilitar re-uso de recursos_

```
int diasTrabalhados = Funcoes.diastrab()

def avos Funcoes.avos13(12, true)
``` 

<html><body><hr></body></html>
  
### *_Lancamentos_* <a name="Lancamentos"></a> 
#### _valor_
_Verifica se o evento que esta sendo calculado esta lançado em variáveis e retorna o valor lançado, para buscar o valor de outros eventos use valorPorEventoId_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|evento|use evento, não é possível passar literalmente um código de evento|Sim|
|valorPadrao|Permite retornar um valor padrão quando não existe lançamento, caso não seja informado o valor padrão para quando não existe lançamento é -1|Não|

```
def vvar = Lancamentos.valor(evento)
if ( vvar >= 0 ){
 valorCalculdo = vvar
...
``` 

#### _valorPorEventoId_
_Verifica se o evento informado esta lançado em variáveis e retorna o valor lançado, para buscar o valor de outros eventos use valorPorEventoId_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|evento|use evento, não é possível passar literalmente um código de evento|Sim|
|valorPadrao|Permite retornar um valor padrão quando não existe lançamento, caso não seja informado o valor padrão para quando não existe lançamento é -1|Não|

```
def vvar = Lancamentos.valorPorEventoId(390)
if ( vvar >= 0 ){
 valorCalculdo = vvar
...
``` 

#### _valorComposicaoMes_
_Retorna o valor totalizado de todos os lançamentos para eventos que compõem mês_

```
Utilizado no evento : HORAS NORMAIS
def compoemes = Lancamentos.valorComposicaoMes();
vaux = horastrab - compoemes
```

<html><body><hr></body></html>
  
### *_PlanoSaudeDespesas_* <a name="PlanoSaudeDespesas"></a> 
#### _buscaDespesasPlanoSaude_
_Busca uma lista de despesas com planos de saúde_

```
Utilizado no evento : DESPESAS COM PLANO DE SAÚDE - MENSALIDADE
PlanoSaudeDespesas.buscaDespesasPlanoSaude().each { despesa ->
    if (despesa.tipo == TipoDespesaPlanoSaude.MENSALIDADE) {
        vaux += despesa.valor
    }
}
```

<html><body><hr></body></html>
  
### *_PeriodosAquisitivos_* <a name="PeriodosAquisitivos"></a> 
#### _buscaPeriodosComSaldo_
_Retorna uma lista de períodos aquisitivos de férias que tenham saldo, ou seja, proporcionais, utilizados parcialmente ou vencidos_

```
int totalDias;
PeriodosAquisitivos.buscaPeriodosComSaldo().each { periodos ->
    totalDias += periodos.saldo   
}
``` 

#### _buscaVencidos_
_Retorna uma lista de períodos aquisitivos de férias que estejam com a situação VENCIDOS_

```
Utilizado no evento : FÉRIAS VENCIDAS RESCISÃO
PeriodosAquisitivos.buscaVencidos();.each { feriasvenc ->
    def diasferias = feriasvenc.saldo
    ...
}
``` 

#### _buscaProporcional_
_Retorna um período aquisitivo de férias que esteja com a situação EM_ANDAMENTO_

```
Utilizado no evento : FÉRIAS PROPORCIONAIS RESCISÃO
def feriasprop = PeriodosAquisitivos.buscaProporcional();
def saldo = feriasprop.saldo
``` 

#### _quitaPorRescisao_
_Por meio deste método é possível realizar a baixa de um período aquisitivo de férias e também indicar o valor como parte da composição de uma média ou vantagem_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|periodoAquisitivo|O período aquisitivo que esta sendo calculado|Sim|
|valorReferencia|O valor de referência do evento que esta sendo calculado, caso sejam informados apenas dois parâmetros neste posição será considerado o valor calculado|Não|
|valorCalculado|O valor do evento que esta sendo calculado|Não|
|compoeMediaVantagem|Se este evento é uma média ou vantagem, usar true ou false, valor padrão é false|Não|
```
Utilizado no evento : MÉDIA HORAS FÉRIAS VENCIDAS RESCISÃO
PeriodosAquisitivos.buscaVencidos().each { feriasvenc ->
    ...
    vtot = valorMedia * diasferias / 30
    PeriodosAquisitivos.quitaPorRescisao(feriasvenc, 0, vtot, true)
    ...
}
```

<html><body><hr></body></html>
  
### *_PeriodosAquisitivosDecimoTerceiro_* <a name="PeriodosAquisitivosDecimoTerceiro"></a> 
#### _buscaPeriodosAquisitivosBySituacao_
_Retorna uma lista de períodos aquisitivos de décimo terceiro salário conforme a situação informada no argumento_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|situacao|A situação do período, use SituacaoPeriodoAquisitivoDecimoTerceiro.[situacao]|Sim|

```
int avos;
PeriodosAquisitivosDecimoTerceiro.buscaPeriodosAquisitivosBySituacao(SituacaoPeriodoAquisitivoDecimoTerceiro.EM_ANDAMENTO).each{ periodo ->
  avos += p.avosAdquiridos
}
```

#### _buscaPeriodosAquisitivos_
_Retorna uma lista de períodos aquisitivos de décimo terceiro salário indiferentemente da situação_

```
PeriodosAquisitivosDecimoTerceiro.buscaPeriodosAquisitivos().each { p ->
    if (p.anoExercicio == calculo.competencia.ano) {
        avos = p.avosAdquiridos
    }
}
```

#### _compoePagamento_
_Indica que o valor evento é referente a um período aquisitivo de décimo terceiro salário e realiza a baixa do mesmo_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|periodoAquisitivoDecimoTerceiro|o período aquisitivo e décimo terceiro salário que esta sendo baixado|Sim|
|valor|o valor calculado|Sim|

```
PeriodosAquisitivosDecimoTerceiro.buscaPeriodosAquisitivosBySituacao(SituacaoPeriodoAquisitivoDecimoTerceiro.EM_ANDAMENTO).each{ periodo ->
    valor = funcionario.salario
    PeriodosAquisitivosDecimoTerceiro.compoePagamento(periodo, valor)
}
```

<html><body><hr></body></html>

### *_ValesTransporte_* <a name="ValesTransporte"></a> 
#### _buscaPor_
_Retorna do RH o valor ou quantidade de vales transporte conforme argumento_
 
|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|tipoRetornoValeTransporte|Tipo de retorno do vale transporte|Sim|


```
Utilizado no evento : Vale transporte
if( vaux <= 0 ){
    vaux = ValesTransporte.busca(TipoRetornoValeTransporte.VALOR)
    if ( vaux <= 0 ){
        suspender 'Calculo do evento cancelado'
    }
}
```

<html><body><hr></body></html>

# *Variaveis reservadas* <a name="variaveisReservadas"></a> 

### *_aposentado_* <a name="aposentado"></a> 
#### _formaPagamento_
_Retorna a Forma de pagamento do aposentado_
```
if ( aposentado.formaPagamento == FormaPagamento.CHEQUE ){ 
    ...
``` 

#### _grupoFuncional_
_Retorna o Grupo funcional do aposentado_
```
def grupoFuncional =  aposentado.grupoFuncional
```

#### _dataAposentadoria_
_Retorna a Data de aposentadoria_
```
def dataAposentadoria =  aposentado.dataAposentadoria
if ( dataAposentadoria < calculo.competencia ){
    ...
``` 

#### _dataCessacaoAposentadoria_
_Retorna a Data de cessação da aposentadoria_
```
if ( aposentado.dataCessacaoAposentadoria != null){
    ...
``` 

#### _valorBeneficio_
_Retorna o Valor do benefício do aposentado_
```
valorCalculado = aposentado.valorBeneficio
``` 

#### _descricaoOrganograma_
_Retorna a Descrição do organograma do aposentado_
```
def descricaoOrganograma = aposentado.descricaoOrganograma
``` 

#### _codigoOrganograma_
_Retorna o código do organograma do aposentado_
```
def codigoOrganograma = aposentado.codigoOrganograma
if ( codigoOrganograma == '010102' ){
    ...
``` 

#### _agenciaPagamento_
_Retorna a Agência de pagamento do aposentado_
```
def agenciaPagamento = aposentado.agenciaPagamento
``` 

#### _bancoPagamento_
_Retorna o Banco de pagamento do aposentado_
```
def bancoPagamento = aposentado.bancoPagamento
``` 
<html><body><hr></body></html>

## *_calculo_* <a name="calculo"></a> 
_Retorna as informações do cálculo que esta sendo efetuado e dos parâmetros de cálculo_
#### _descontarEmprestimoRescisao_
_Indica se os valores de empréstimo devem ser descontados na rescisão, retorna true ou false_
```
if ( calculo.descontarEmprestimoRescisao ){ 
    ...
``` 

#### _competencia_
_Retorna uma data referênte ao último dia da competência que esta sendo calculada_
```
double base = Bases.valorCalculado(Bases.INSS, TipoProcessamento.FERIAS, SubTipoProcessamento.INTEGRAL, calculo.competencia)
``` 

#### _quantidadeDiasCompetencia_
_Retorna a quantidade de dias da competência que esta sendo calculada_
```
int dias = calculo.quantidadeDiasCompetencia
if ( dias < 30 ) dias = 30
``` 

#### _abonoSemGozo_
_Indica se permite abono de férias sem gozo, retorna true ou false_
```
if ( calculo.abonoSemGozo ){
    ...
``` 

#### _tipoProcessamento_
_Retorna o tipo de processamento do cálculo atual_
```
if ( calculo.tipoProcessamento == TipoProcessamento.MENSAL ){
    ...
``` 

#### _dataPagamento_
_Retorna a data de pagamento do cálculo atual_
```
dataPagamento = calculo.dataPagamento
if ( dataPagamento > calculo.competencia ){
    ...
``` 

#### _dataRescisao_
_Retorna a Data de rescisão informada, somente quando se esta calculando uma rescisão_
```
def dataRescisao = calculo.dataRescisao
``` 

#### _quantidadeDias_
_Retorna a Quantidade de dias de uma competência informada nos argumentos_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|mes|informe um mês de referência, use entre 1 e 12|Sim|
|ano|informe um ano de referência|Sim|

```
def data  = Datas.data(2015, 3, 5)
int dias1 = calculo.quantidadeDias(data.mes, data.ano)
int dias2 = calculo.quantidadeDias(3, 2015)
``` 

#### _unidade_
_Retorna a unidade de pagamento configurada nos parâmetros gerais de cálculo_

```
if ( calculo.unidade == UnidadeCalculo.DIAS ){
    ...
``` 

#### _pagarUmTercoIntegral_
_Indicativo se deve pagar um terço integral em férias parciais, retorna true ou false_

```
if ( calculo.pagarUmTercoIntegral ){
    ...
``` 

#### _anoDecimoTerceiro_
_Retorna o ano do cálculo atual para fins de décimo terceiro_

```
def situacao = SituacaoPeriodoAquisitivoDecimoTerceiro.QUITADO_PARCIALMENTE
PeriodosAquisitivosDecimoTerceiro.buscaPeriodosAquisitivosBySituacao(situacao).each{ p->
    if (p.anoExercicio == calculo.anoDecimoTerceiro){
        ...
``` 

#### _consideraAvosPerdidos_
_Indicativo se deve considerar avos perdidos na contagem de avos, retorna true ou false_

```
if ( ! calculo.consideraAvosPerdidos ){
    ...
``` 

#### _pagarDecimoTerceiroFerias_
_Indicativo se deve deve pagar décimo terceiro nas férias, retorna true ou false_

```
if ( calculo.pagarDecimoTerceiroFerias ){
    ...
``` 

#### _individual_
_Retorna verdadeiro se cálculo atual foi executado de forma individual_

```
if ( ! calculo.individual ){
    ...
``` 

#### _rescisaoAutomaticaVincTemp_
_Indicativo se o parâmetro geral de cálculo para gerar rescisão automática do vínculo temporário esta setado, retorna true ou false_

```
if ( calculo.rescisaoAutomaticaVincTemp ){
    ...
``` 

#### _descontarFaltasSobreFerias_
_Indicativo se o parâmetro de cálculo para descontar faltas sobre férias esta setado, retorna true ou false_

```
if ( calculo.descontarFaltasSobreFerias ){
    ...
``` 

#### _soma_
_Soma os valores totais do cálculo para um tipo de evento passado no argumento_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|TipoEvento|o tipo do evento. use TipoEvento.[tipo do evento] |Sim|

```
if ( calculo.descontarFaltasSobreFerias ){
    ...
``` 

<html><body><hr></body></html>

## *_estagiario_* <a name="estagiario"></a> 

#### _formaPagamento_
_Retorna a Forma de pagamento do estagiário_
```
if ( estagiario.formaPagamento == FormaPagamento.DINHEIRO ){ 
    ...
``` 

#### _grupoFuncional_
_Retorna o Grupo funcional do estagiário_
```
def grupoFuncional =  estagiario.grupoFuncional
```

#### _cargo_
_Retorna a descrição do Cargo do estagiário_
```
def cargo =  estagiario.cargo
if ( cargo == 'ESTAGIÁRIO SAÚDE' ){
    ...
```

#### _planoSalarial_
_Retorna o plano salarial do estagiário_
```
def planoSalarial =  estagiario.planoSalarial
```

#### _classeSalarial_
_Retorna a classe salarial do estagiário_
```
def classeSalarial =  estagiario.classeSalarial
```

#### _dataProrrogacao_
_Retorna a data da prorrogação do estágio_
```
if ( estagiario.dataProrrogacao != null ){
    ...
```

#### _nivelSalarial_
_Retorna o nível salarial do estagiário_
```
def nivel = estagiario.nivelSalarial
```

#### _quantidadeHorasMes_
_Retorna a quantidade de horas mês do estagiário_
```
def quantidadeHorasMes = estagiario.quantidadeHorasMes
if ( quantidadeHorasMes.equals(100) ){
    quantidadeHorasMes * vaux / 100;
}
```

#### _descricaoOrganograma_
_Retorna a descrição do organograma do estagiário_
```
def descricaoOrganograma = estagiario.descricaoOrganograma
```

#### _recebeDecimoTerceiro_
_Indicativo se o estagiário recebe décimo terceiro salário conforme a configuração do cargo, retorna true ou false_
```
if ( ! estagiario.recebeDecimoTerceiro ){
    suspender 'O estagiário não recebe décimo terceiro salário'
}
```

#### _diasDireitoFerias_
_Retorna os Dias de direito de férias conforme configuração de férias_
```
int diasDireitoFerias = estagiario.diasDireitoFerias
```

#### _mesesAquisicaoFerias_
_Retorna os Meses para aquisição de férias conforme configuração de férias_
```
int mesesAquisicaoFerias = estagiario.mesesAquisicaoFerias
```

#### _dataInicioEstagio_
_Retorna a Data de início do estágio_
```
def dataInicioEstagio = estagiario.dataInicioEstagio
if ( dataInicioEstagio > calculo.competencia ){
    ...
```

#### _bolsaEstudos_
_Retorna o valor da bolsa de estudos, essa é a remuneração do estagiário_
```
valorCalculado = estagiario.bolsaEstudos
```

#### _dataFinalEstagio_
_Retorna a Data final do estágio_
```
def dataFinalEstagio = estagiario.dataFinalEstagio
```

#### _agenciaPagamento_
_Retorna a Agencia de pagamento do estagiário_
```
def agenciaPagamento = estagiario.agenciaPagamento
```

#### _bancoPagamento_
_Retorna o Banco de pagamento do estagiário_
```
def bancoPagamento = estagiario.bancoPagamento
```

#### _nivelSalarialCoeficiente_
_Retorna o Coenficiente do nível salarial do estagiário_
```
def nivelSalarialCoeficiente = estagiario.nivelSalarialCoeficiente
```

<html><body><hr></body></html>

## *_evento_* <a name="event"></a> 

_Os dados de evento retornam informações do evento que esta sendo calculado mas também são as mesmas propriedade de quando percorremos dados de uma folha_

#### _codigo_
_Retorna o Código do evento_
```
//Dados do evento atual
if ( evento.codigo == 1 ){
    ...
}

//Percorrendo uma folha
folhasPeriodo.buscaFolhas().each { folha ->
    folha.eventos.each { evento ->
        if (evento.codigo == 1 ) {
            referencia += e.referencia
            valor += e.valor
        }
    }    
}
``` 

#### _taxa_
_Retorna a taxa do evento atual_
```
def taxa = evento.taxa
valorCalculado = funcionario.salario * taxa / 100
``` 

#### _getTaxa_
_Retorna a taxa de um outro evento passado por parâmetro_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|codigoEvento|código do evento que deseja buscar a taxa|Sim|

```
def taxa = evento.getTaxa(26)
valorCalculado = funcionario.salario * taxa / 100
``` 

#### _getTaxa_
_Retorna a taxa de um outro evento passado por parâmetro_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|codigoEvento|código do evento que deseja buscar a taxa|Sim|

```
def descricao = evento.descricao
if ( descricao.startsWith('HORAS EXTRAS'){
    ...
``` 

#### _descricao_
_Retorna a descrição do evento_

```
def descricao = evento.descricao
if ( descricao.startsWith('HORAS EXTRAS')){
    ...
``` 

#### _tipo_
_Retorna o tipo do evento_

```
if ( evento.tipo == TipoEvento.VENCIMENTO ){
    ...
``` 

#### _unidade_
_Retorna a unidade do evento_

```
if ( evento.unidade == UnidadeEvento.DIAS ){
    ...
``` 

#### _descricaoClassificacao_
_Retorna a descrição da classificação do evento_

```
def descricaoClassificacao = evento.descricaoClassificacao
``` 

#### _classificacao_
_Retorna a classificação do evento_

```
def classificacao = evento.classificacao
if ( classificacao == ClassificacaoEvento.INSS ){
    ...
``` 

<html><body><hr></body></html>

## *_folha_* <a name="folha"></a> 

_Permite buscar informações da folha atual, as propriedades são também as mesmas de quando se esta percorrendo uma folha_

#### _tipoProcessamento_
_Retorna o Tipo de processamento da folha_
```
//Dados da folha atual
if ( folha.tipoProcessamento == TipoProcessamento.MENSAL ){
    ...
}

//Percorrendo uma folha
folhasPeriodo.buscaFolhas().each { folha ->
    if ( folha.tipoProcessamento == TipoProcessamento.MENSAL ){
        ...
}
``` 

#### _subTipoProcessamento_
_Retorna o subtipo de processamento_
```
if ( folha.subTipoProcessamento == SubTipoProcessamento.INTEGRAL ){
    ...
``` 

#### _eventos_
_Retorna uma lista de eventos calculados, essa variável só terá o efeito desejado se o evento esta calculando por último_
```
folha.eventos.each{ e ->
    ... 
}
``` 

#### _diasGozo_
_Retorna os dias de gozo de férias quando o tipo de processamento é férias_
```
int diasGozo = folha.diasGozo
``` 

#### _diasAbono_
_Retorna os dias de abono de férias quando o tipo de processamento é férias_
```
int diasAbono = folha.diasAbono
``` 

#### _dataPagamento_
_Retorna a data de pagamento da folha_
```
def dataPagamento = folha.dataPagamento
``` 

#### _totalBruto_
_Retorna o total bruto da folha, essa variável só terá o efeito desejado se o evento esta calculando por último_
```
def totalBruto = folha.totalBruto 
``` 

#### _totalDesconto_
_Retorna o total de desconto da folha, essa variável só terá o efeito desejado se o evento esta calculando por último_
```
def totalDesconto = folha.totalDesconto 
``` 

#### _totalLiquido_
_Retorna o total líquido da folha, essa variável só terá o efeito desejado se o evento esta calculando por último_
```
def totalLiquido = folha.totalLiquido 
``` 

#### _competencia_
_Retorna a competência da folha_
```
def competencia = folha.competencia 
``` 

#### _folhaPagamento_
_Indica se é uma folha de pagamento, quando não é uma folha de pagamento esta será uma folha interna de férias_
```
if ( folha.folhaPagamento ){
    ...
}else{
    ...
``` 

<html><body><hr></body></html>

## *_folhas_* <a name="folhas"></a> 

_Permite buscar folhas tanto do cálculo atual como de outras competências e tipo de processamento conforme o método e parâmetros utilizados_

#### _valorCalculadoEvento_
_Retorna a soma de um evento em todos os cálculos da competência atual_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|codigo|código do evento que deseja buscar o valor calculado|Sim|


```
double valorCalculadoEvento = folhas.valorCalculadoEvento(22)
``` 

#### _valorReferenciaEvento_
_Retorna a soma da referência de um evento em todos os cálculos da competência atual_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|codigo|código do evento que deseja buscar o valor de referência|Sim|

```
double valorReferenciaEvento = folhas.valorReferenciaEvento(22)
``` 

#### _buscaFolhas_
_Busca dados da folha atual, deve ser usado marcando o evento para calcular por último caso queira buscar valores totalizados_

```
folhas.buscaFolhas().each{ folha ->
    ...
}
```

#### _buscaFolhasOutrasCompetencias_
_Busca dados de folhas de outras competências ou tipos de processamentos, não retorna dados da folha atual_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|competência|informe uma competência para buscar as folhas|Sim|
|tipoProcessamento|informe um tipo de processamento, caso não seja informado retornará todos os tipos de processamento|Não|
|subTipoProcessamento|informe um subtipo de processamento, caso não seja informado retornará todos os subtipos de processamento|Não|

```
def competenciaConsulta = Datas.data(2019, 1, 1)
def tipoProcessamento = TipoProcessamento.MENSAL
def subTipoProcessamento = SubTipoProcessamento.INTEGRAL
folhas.buscaFolhasOutrasCompetencias(competenciaConsulta,tipoProcessamento, subTipoProcessamento ).each{ folha ->
    ...
}
``` 

<html><body><hr></body></html>

## *_folhasPeriodo_* <a name="folhasPeriodo"></a> 
_Permite consultar folhas do período (competência atual)_

#### _buscaFolhas_
_Busca dados da folha atual, deve ser usado marcando o evento para calcular por último caso queira buscar valores totalizados_

```
folhasPeriodo.buscaFolhas().each{ folha ->
    ...
}
```

#### _buscaFolhasProcessamento_
_Busca de folhas de outros tipos de processamentos da mesma competência_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|tipoProcessamento|informe um tipo de processamento|Sim|

```
folhasPeriodo.buscaFolhasProcessamento(TipoProcessamento.FERIAS).each{ folha ->
    ...
}
```

#### _buscaFolhasInternas_
_Busca de folhas internas (folhas de férias) da mesma competência_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|tipoProcessamento|informe um tipo de processamento|Sim|

```
folhasPeriodo.buscaFolhasInternas(TipoProcessamento.FERIAS).each{ folha ->
    ...
}
```

<html><body><hr></body></html>

## *_funcionario_* <a name="funcionario"></a> 
_Retorna dados do funcionário que esta sendo calculado_

#### _cargoOrigemRendimento_
_Retorna o cargo conforme a origem do rendimento informada_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|OrigemRendimento|informe a origem do rendimento do cargo ou cargo comissionado|Sim|

```
def cargo = funcionario.cargoOrigemRendimento(OrigemRendimento.CARGO)
```

#### _planoSalarialOrigemRendimento_
_Retorna o plano salarial conforme a origem do rendimento informada_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|OrigemRendimento|informe a origem do rendimento do cargo ou cargo comissionado|Sim|

```
def plano = funcionario.planoSalarialOrigemRendimento(OrigemRendimento.CARGO)
```

#### _classeSalarialOrigemRendimento_
_Retorna a classe salarial conforme a origem do rendimento informada_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|OrigemRendimento|informe a origem do rendimento do cargo ou cargo comissionado|Sim|

```
def classe = funcionario.classeSalarialOrigemRendimento(OrigemRendimento.CARGO_COMISSIONADO)
```

#### _salarioOrigemRendimento_
_Retorna o salário conforme a origem do rendimento informada_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|OrigemRendimento|informe a origem do rendimento do cargo ou cargo comissionado|Sim|

```
def salario = funcionario.salarioOrigemRendimento(OrigemRendimento.CARGO_COMISSIONADO)
```

#### _nivelSalarialCoeficienteOrigemRendimento_
_Retorna o coeficiênte do nível salarial conforme a origem do rendimento informada_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|OrigemRendimento|informe a origem do rendimento do cargo ou cargo comissionado|Sim|

```
def coeficiente = funcionario.nivelSalarialCoeficienteOrigemRendimento(OrigemRendimento.CARGO_COMISSIONADO)
```

#### _nivelSalarialOrigemRendimento_
_Retorna o nível salarial conforme a origem do rendimento informada_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|OrigemRendimento|informe a origem do rendimento do cargo ou cargo comissionado|Sim|

```
def nivel = funcionario.nivelSalarialOrigemRendimento(OrigemRendimento.CARGO_COMISSIONADO)
```

#### _contaVagaOrigemRendimento_
_Indicativo se funcionário conta vaga considerando a origem do rendimento_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|OrigemRendimento|informe a origem do rendimento do cargo ou cargo comissionado|Sim|

```
boolean contaVaga = funcionario.contaVagaOrigemRendimento(OrigemRendimento.CARGO_COMISSIONADO)
```

#### _recebeDecimoTerceiroPorOrigem_
_Indicativo se funcionário recebe décimo terceiro salário considerando a origem do rendimento_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|OrigemRendimento|informe a origem do rendimento do cargo ou cargo comissionado|Sim|

```
boolean recebeDecimo = funcionario.recebeDecimoTerceiroPorOrigem(OrigemRendimento.CARGO_COMISSIONADO)
```

#### _ocorrenciaSefip_
_Retorna a Ocorrência sefip do funcionário_

```
if ( funcionario.ocorrenciaSefip == OcorrenciaSefip.EXPOSTO_APOSENTADORIA_15_ANOS ){
    ...
```

#### _classeSalarial_
_Retorna a Classe salarial do funcionário_

```
def classeSalarial = funcionario.classeSalarial
```

#### _mesContribuicaoSindical_
_Retorna o mês de contribuição sindical conforme configuração do sindicato_

```
if ( funcionario.mesContribuicaoSindical == MesContribuicaoSindical.MAIO ){
    ...
}
```

#### _tipoVinculo_
_Retorna o tipo de vínculo do funcionário_

```
if ( funcionario.tipoVinculo == TipoVinculo.CELETISTA ){
    ...
}
```

#### _categoriaSefipVinculo_
_Retorna a categoria sefip do vínculo do funcionário_

```
def categoria = funcionario.categoriaSefipVinculo
```

#### _descricaoOrganograma_
_Retorna a descrição do organograma do funcionário_

```
def descricaoOrganograma = funcionario.descricaoOrganograma
```

#### _descricaoOrganograma_
_Retorna o código do organograma do funcionário_

```
def codigoOrganograma = funcionario.codigoOrganograma
```

#### _contaVaga_
_Indicativo se funcionário conta vaga, retorna true ou false_

```
if ( funcionario.contaVaga ){
    ...
```

#### _recebeDecimoTerceiro_
_Indicativo se funcionário recebe décimo terceiro salario, retorna true ou false_

```
if ( funcionario.recebeDecimoTerceiro ){
    ...
```

#### _diasDireitoFerias_
_Retorna os dias de direito de férias conforme a configuração de férias_

```
int diasDireitoFerias = funcionario.diasDireitoFerias
```

#### _mesesAquisicaoFerias_
_Retorna os meses para aquisição de período férias conforme a configuração de férias_

```
int mesesAquisicaoFerias = funcionario.mesesAquisicaoFerias
```


#### _optanteFgts_
_Indicativo se funcionário é optante de FGTS_

```
if ( ! funcionario.optanteFgts ){
    ...
}
```

#### _dataOpcaoFgts_
_Retorna a data da opção de FGTS do funcionário, quando não optante retorna null, por isso verifique anteriormente se é optante_

```
if ( funcionario.optanteFgts ){
    dataOpcaoFgts = funcionario.dataOpcaoFgts
}
```

#### _dataFimVinculo_
_Retorna a data final de um vínculo temporário_

```
def dataFimVinculo = funcionario.dataFimVinculo
```

#### _salario_
_Retorna o salário do funcionário_

```
def salario = funcionario.salario;
valorCalculado = Funcoes.calcprop(salario, vaux);
```

#### _nivelSalarialCoeficiente_
_Retorna o Coeficente do nível salarial_

```
def nivel = funcionario.nivelSalarialCoeficiente;
```

#### _planoSalarial_
_Retorna o plano salarial do funcionário_

```
def planoSalarial = funcionario.planoSalarial;
```

#### _dataBase_
_Retorna a data base do funcionário_

```
def dataBase = funcionario.dataBase;
if ( dataBase < Datas.data(1993, 1 ,1 ){
    ...
```

#### _sindicato_
_Retorna o nome do sindicato do funcionário_

```
def sindicato = funcionario.sindicato;
```

#### _responsabilidadePagamento_
_Retorna a informação de reponsabilidade do pagamento de funcionário cedido_

```
if ( funcionario.responsabilidadePagamento = ResponsabilidadePagamento.PAGAMENTO_EXCLUSIVAMENTE_PELO_CEDENTE_ORIGEM ){
    ...
```

#### _nivelSalarial_
_Retorna o nível salarial do funcionário_

```
def nivelSalarial = funcionario.nivelSalarial
```

#### _estatutario_
_Indicativo se funcionário é estatutário, retorna true ou false_

```
if ( funcionario.estatutario ){
    ...
```

#### _dataRescisao_
_Retorna a data da rescisão do funcionário_

```
if ( funcionario.dataRescisao != null ){
    if ( funcionario.dataRescisao > calculo.competencia ){
        ...
```

#### _vinculoEmpregaticio_
_Retorna o vínculo empregatício do funcionário_

```
def vinculoEmpregaticio = funcionario.vinculoEmpregaticio
```

#### _grupoFuncional_
_Retorna o grupo funcional do funcionário_

```
def grupoFuncional = funcionario.grupoFuncional
```

#### _cargo_
_Retorna o cargo do funcionário_

```
def cargo = funcionario.cargo
if ( cargo == 'OPERADOR DE MÁQUINAS' ){
    ...
```

#### _dataAdmissao_
_Retorna a data de admissão do funcionário_

```
def dataAdmissao = funcionario.dataAdmissao
```

#### _possuiPrevidencia_
_Indicativo se funcionário possui o tipo de previdência (RPPS) passado por parâmetro_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|TipoPrevidencia|informe um tipo de previdência|Sim|

```
def tipoPrevidencia = funcionario.possuiPrevidencia(TipoPrevidencia.FUNDO_FINANCEIRO)
```


#### _possuiPrevidenciaFederal_
_Indicativo se funcionário possui previdência federal_


```
boolean previdenciaFederal = funcionario.possuiPrevidenciaFederal
```

#### _tipoAdmissao_
_Retorna o tipo de admissão do funcionário_

```
if ( funcionario.tipoAdmissao == TipoAdmissao.SUBSTITUICAO ){
    ...
```

#### _quantidadeHorasMes_
_Retorna a quantidade de horas mês do funcionário_

```
def quantidadeHorasMes = funcionario.quantidadeHorasMes
```

<html><body><hr></body></html>

## *_mediaVantagem_* <a name="mediaVantagem"></a> 
_Retorna os valores de média e vantagem em um evento deste tipo_

#### _calcular_
_Conforme o tipo de média e vantagem e sua configuração os parâmetros deverão se preeenchidos de forma diferente_

##### _Férias normais, onde o período de cálculo configurado em médias e vantagens é diferente de  "Definido em fórmula"_
|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|periodoAquisitivo|informar o período aquisitivo|Sim|

```
Utilizado no evento MÉDIA HORAS FÉRIAS
def valorMedia = mediaVantagem.calcular(periodoAquisitivo)
```

##### _Décimo terceiro salário, onde o período de cálculo configurado em médias e vantagens é diferente de  "Definido em fórmula"_
|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|avos|informar os avos para referência|Sim|

```
Utilizado no evento MÉDIA HORAS 13º SALÁRIO
valorReferencia = Funcoes.avos13(12)
def valorMedia = mediaVantagem.calcular(valorReferencia);
```

##### _Quando o período de cálculo configurado em médias e vantagens é diferente de  "Definido em fórmula"_
|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|dataInicial|Data inicial para média ou vantagem|Sim|
|dataFinal|Data final para média ou vantagem|Sim|

```
Utilizado no evento MÉDIA HORAS FÉRIAS PROPORCIONAL RESCISÃO
def periodo = PeriodosAquisitivos.buscaProporcional()
def valorMedia = mediaVantagem.calcular(periodo.dataInicial, calculo.dataRescisao)
```
<html><body><hr></body></html>

## *_matricula_* <a name="matricula"></a> 

#### _tipo_
_Retorna o tipo de matrícula, é útil quando precisamos saber o tipo de matrícula que esta sendo calculada para poder definir de onde buscar os demais dados_

```
double valorRemuneracao;
if ( matricula.tipo == TipoMatricula.FUNCIONARIO ){
    valorRemuneracao = funcionario.salario
}else{
    valorRemuneracao = estagiario.bolsaEstudos
}
```

#### _codigo_
_Retorna o código de matrícula_

```
if ( matricula.codigo.equals('100') ){
    ...
```

<html><body><hr></body></html>

## *_periodoAquisitivo_* <a name="periodoAquisitivo"></a> 
_Retorna dados do período aquisitivo de férias que esta sendo calculado / consultado, o período deve ser obtido pela função PeriodosAquisitivos ou estar em um cálculo de férias normais_

#### _configuracaoFerias_
_Retorna dados da configuração de férias do período_

#### _mesesParaAquisicao_
_Retorna os meses para aquisição da configuração de férias do período_

```
PeriodosAquisitivos.buscaVencidos().each { periodoAquisitivo ->
    mesesParaAquisicao = periodoAquisitivo.configuracaoFerias.mesesParaAquisicao
}
```

#### _diasParaAdquirirNoPeriodo_
_Retorna os dias para adquirir na configuração de férias do período_

```
PeriodosAquisitivos.buscaVencidos().each { periodoAquisitivo ->
    diasParaAdquirirNoPeriodo = periodoAquisitivo.configuracaoFerias.diasParaAdquirirNoPeriodo
}
```

#### _mesesParaConcessao_
_Retorna os meses para concessão na configuração de férias do período_

```
PeriodosAquisitivos.buscaVencidos().each { periodoAquisitivo ->
    mesesParaConcessao = periodoAquisitivo.configuracaoFerias.mesesParaConcessao
}
```

#### _diasAbono_
_Retorna os dias de abono permitidos na configuração de férias do período_

```
PeriodosAquisitivos.buscaVencidos().each { periodoAquisitivo ->
    mesesParaConcessao = periodoAquisitivo.configuracaoFerias.mesesParaConcessao
}
```

#### _situacao_
_Retorna a situação do período aquisitivos de férias_

```
//Férias normais
situacao = periodoAquisitivo.situacao

//Férias na rescisão
PeriodosAquisitivos.buscaPeriodosComSaldo().each { periodoAquisitivo ->
    if ( periodoAquisitivo.situacao == SituacaoPeriodoAquisitivo.ADQUIRIDO ){
        ...
}
```

#### _dataFinal_
_Retorna a Data final do período aquisitivo de férias_

```
PeriodosAquisitivos.buscaPeriodosComSaldo().each { periodoAquisitivo ->
    dataFinal = periodoAquisitivo.dataFinal
}
```

#### _dataInicial_
_Retorna a Data inicial do período aquisitivo de férias_

```
PeriodosAquisitivos.buscaPeriodosComSaldo().each { periodoAquisitivo ->
    dataInicial = periodoAquisitivo.dataInicial
}
```

#### _saldo_
_Retorna o saldo de dias para gozo do período aquisitivo de férias_

```
PeriodosAquisitivos.buscaPeriodosComSaldo().each { periodoAquisitivo ->
    saldo = periodoAquisitivo.saldo
}
```

#### _faltas_
_Retorna a quantidade de faltas do período aquisitivo de férias_

```
PeriodosAquisitivos.buscaPeriodosComSaldo().each { periodoAquisitivo ->
    faltas = periodoAquisitivo.faltas
}
```

#### _faltasBrutas_
_Retorna a quantidade de faltas brutas do período aquisitivo de férias_

```
PeriodosAquisitivos.buscaPeriodosComSaldo().each { periodoAquisitivo ->
    faltasBrutas = periodoAquisitivo.faltasBrutas
}
```

#### _faltasEnquadradas_
_Retorna a quantidade de faltas enquadradas do período aquisitivo de férias_

```
PeriodosAquisitivos.buscaPeriodosComSaldo().each { periodoAquisitivo ->
    faltasEnquadradas = periodoAquisitivo.faltasEnquadradas
}
```

#### _diasAdquiridos_
_Retorna os dias já adquiridos até o momento do período aquisitivo de férias_

```
PeriodosAquisitivos.buscaPeriodosComSaldo().each { periodoAquisitivo ->
    diasAdquiridos = periodoAquisitivo.diasAdquiridos
}
```

#### _cancelados_
_Retorna os dias cancelados do período aquisitivo de férias_

```
PeriodosAquisitivos.buscaPeriodosComSaldo().each { periodoAquisitivo ->
    cancelados = periodoAquisitivo.cancelados
}
```

#### _suspensos_
_Retorna os dias suspensos do período aquisitivo de férias_

```
PeriodosAquisitivos.buscaPeriodosComSaldo().each { periodoAquisitivo ->
    suspensos = periodoAquisitivo.suspensos
}
```

#### _diasFeriasPagosRescisao_
_Retorna os dias de férias que foram pagos em rescisão do período aquisitivo de férias_

```
PeriodosAquisitivos.buscaPeriodosComSaldo().each { periodoAquisitivo ->
    diasFeriasPagosRescisao = periodoAquisitivo.diasFeriasPagosRescisao
}
```

#### _pagouUmTercoIntegral_
_Indicativo se terço integral das férias já foram pagos anteriormente, referente ao período aquisitivo de férias_

```
PeriodosAquisitivos.buscaPeriodosComSaldo().each { periodoAquisitivo ->
    if ( periodoAquisitivo.pagouUmTercoIntegral
}
```

#### _pagoRescisao_
_Se o período aquisitivo já foi pago na rescisão_

```
PeriodosAquisitivos.buscaVencidos().each { periodoAquisitivo ->
    if ( periodoAquisitivo.pagoRescisao ){
        ...
}
```

#### _valorReferenciaPago_
_O valor de referência já pago no adiantamento das férias do período aquisitivo_

```
PeriodosAquisitivos.buscaPeriodosComSaldo().each { periodoAquisitivo ->
    valorReferenciaPago = periodoAquisitivo.valorReferenciaPago
}
```

#### _valorCalculadoPago_
_O valor de calculado já pago no adiantamento das férias do período aquisitivo_

```
PeriodosAquisitivos.buscaPeriodosComSaldo().each { periodoAquisitivo ->
    valorCalculadoPago = periodoAquisitivo.valorCalculadoPago
}
```

#### _valorCalculadoPagoMediaVantagem_
_O valor de calculado já pago no adiantamento das férias do período aquisitivo que foi pago em média ou vantagem_

```
PeriodosAquisitivos.buscaPeriodosComSaldo().each { periodoAquisitivo ->
    valorCalculadoPagoMediaVantagem = periodoAquisitivo.valorCalculadoPagoMediaVantagem
}
```

<html><body><hr></body></html>

## *_periodoConcessao_* <a name="periodoConcessao"></a> 
_Retorna dados da concessão das férias que esta sendo calculada_

#### _diasGozo_
_Retorna os dias de gozo de férias que esta sendo calculada _

```
int diasGozo = periodoConcessao.diasGozo
```

#### _diasFalta_
_Retorna os dias de faltas de férias que esta sendo calculada _

```
int diasFalta = periodoConcessao.diasFalta
```

#### _dataPagamento_
_Retorna a data do pagamento de férias que esta sendo calculada _

```
def dataPagamento = periodoConcessao.dataPagamento
```

#### _dataInicioGozo_
_Retorna a data do início de gozo de férias que esta sendo calculada _

```
def dataInicioGozo = periodoConcessao.dataInicioGozo
```

#### _dataFimGozo_
_Retorna a data do fim de gozo de férias que esta sendo calculada _

```
def dataFimGozo = periodoConcessao.dataFimGozo
```

#### _diasAbono_
_Retorna os dias de abono de férias que esta sendo calculada_

```
int diasAbono = periodoConcessao.diasAbono
```

<html><body><hr></body></html>

## *_pensionista_* <a name="pensionista"></a> 

#### _formaPagamento_
_Retorna a forma de pagamento do pensionista_

```
def formaPagamento = pensionista.formaPagamento
```

#### _grupoFuncional_
_Retorna o grupo funcional do pensionista_

```
def grupoFuncional = pensionista.grupoFuncional
```

#### _valorBeneficio_
_Retorna o valor do benefício do pensionista_

```
double valorBeneficio = pensionista.valorBeneficio
valorCalculado = valorBeneficio
```

#### _dataInicioBeneficio_
_Retorna a data do início do benefício do pensionista_

```
def dataInicioBeneficio = pensionista.dataInicioBeneficio
```

#### _dataCessacaoBeneficio_
_Retorna a data de cessação do benefício do pensionista_

```
if ( pensionista.dataCessacaoBeneficio != null ){
    dataCessacaoBeneficio = pensionista.dataCessacaoBeneficio
}
```

#### _descricaoOrganograma_
_Retorna a descrição do organograma do pensionista_

```
descricaoOrganograma = pensionista.descricaoOrganograma
```

#### _agenciaPagamento_
_Retorna a agência de pagamento do pensionista_

```
agenciaPagamento = pensionista.agenciaPagamento
```

#### _bancoPagamento_
_Retorna o banco de pagamento do pensionista_

```
bancoPagamento = pensionista.bancoPagamento
```

<html><body><hr></body></html>

## *_periodoAquisitivoDecimoTerceiro_* <a name="periodoAquisitivoDecimoTerceiro"></a> 
_Retorna dados do período aquisitivo de décimo terceiro que esta sendo calculado_

#### _avosAdquiridos_
_Retorna os avos adquiridos de décimo terceiro salário_

```
def avosAdquiridos = periodoAquisitivoDecimoTerceiro.avosAdquiridos
```

#### _avosAdquiridosFgts_
_Retorna os avos adquiridos para cálculo de FGTS de décimo terceiro salário_

```
def avosAdquiridosFgts = periodoAquisitivoDecimoTerceiro.avosAdquiridosFgts
```

#### _avosPerdidos_
_Retorna os avos perdidos de décimo terceiro salário_

```
def avosPerdidos = periodoAquisitivoDecimoTerceiro.avosPerdidos
```

#### _avosDireito_
_Retorna os avos de direito de décimo terceiro salário_

```
def avosDireito = periodoAquisitivoDecimoTerceiro.avosDireito
```

#### _anoExercicio_
_Retorna o ano de exercício de décimo terceiro salário_

```
int anoExercicio = periodoAquisitivoDecimoTerceiro.anoExercicio
```

#### _movimentacoes_
_Retorna uma lista de movimentações do período aquisitivo de décimo terceiro salário_

```
int movimentacoes = periodoAquisitivoDecimoTerceiro.movimentacoes
```

#### _situacao_
_Retorna a situação do período aquisitivo de décimo terceiro salário_

```
if ( periodoAquisitivoDecimoTerceiro.situacao == SituacaoPeriodoAquisitivoDecimoTerceiro.EM_ANDAMENTO ){
    ...
```

#### _dataInicial_
_Retorna a data inicial do período aquisitivo de décimo terceiro salário_

```
def dataInicial = periodoAquisitivoDecimoTerceiro.dataInicial
```

#### _dataFinal_
_Retorna a data final do período aquisitivo de décimo terceiro salário_

```
def dataFinal = periodoAquisitivoDecimoTerceiro.dataFinal
```

#### _totalMovimentacoes_
_Retorna o valor total de movimentações do período aquisitivo de décimo terceiro salário_

```
double totalMovimentacoes = periodoAquisitivoDecimoTerceiro.totalMovimentacoes
```

#### _totalMovimentacoesByMotivo_
_Retorna o valor total de movimentações do período aquisitivo de décimo terceiro salário por motivo_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|motivo|Motivo da movimentação|Sim|

```
def motivo = MotivoMovimentacaoPeriodoAquisitivoDecimoTerceiro.ADIANTAMENTO_DECIMO_TERCEIRO
double totalMovimentacoes = periodoAquisitivoDecimoTerceiro.totalMovimentacoesByMotivo(motivo)
```

<html><body><hr></body></html>

## *_servidor_* <a name="servidor"></a> 
_Retorna os dados do servidor (pessoa)_

#### _grauEscolaridade_
_Retorna o grau de escolaridade do servidor_

```
def grauEscolaridade = servidor.grauEscolaridade 
```

#### _dataNascimento_
_Retorna a data de nascimento do servidor_

```
def dataNascimento = servidor.dataNascimento
int idade = Datas.diferencaDias( dataNascimento, calculo.competencia ) / 365
```

#### _estadoCivil_
_Retorna o estado civil do servidor_

```
def estadoCivil = servidor.estadoCivil
```

#### _nacionalidade_
_Retorna a nacionalidade do servidor_

```
def nacionalidade = servidor.nacionalidade
```

#### _dataChegada_
_Retorna a data da chegada do servidor estrangeiro_

```
def dataChegada = servidor.dataChegada
```

#### _dependentes_
_Retorna a quantidade geral de dependentes do servidor_

```
int dependentes = servidor.dependentes
```

#### _buscaDependentes_
_Retorna a lista com todos os dados de dependentes do servidor_

```
int dependentesPensao = servidor.buscaDependentes.sum(0, { it.pensao ? 1 : 0 })

//Percorrendo...
servidor.buscaDependentes.each{ dep ->
    if ( dep.irrf ) {
        ...
}


```

#### _sexo_
_Retorna o sexo do servidor_

```
if ( servidor.sexo == Sexo.MASCULINO ){
    ...
```

#### _dependentesIrrf_
_Retorna a quantidade de dependentes de IRRF do servidor_

```
int dependentesIrrf = servidor.dependentesIrrf
```

#### _possuiMolestiaGrave_
_Indicativo se servidor possui moléstia grave_

```
boolean possuiMolestiaGrave = servidor.possuiMolestiaGrave
```

<html><body><hr></body></html>

### *_valorCalculado_* <a name="valorCalculado"></a> 
_É a variável de retorno para o cálculo do evento, o valor final deve ser atribuido a este_

```
vaux = Funcoes.calcprop(funcionario.salario, funcionario.quantidadeHorasMes)
valorCalculado = vaux  
```

<html><body><hr></body></html>

### *_valorReferencia_* <a name="valorReferencia"></a> 
_É a variável de retorno para a referência do evento, o valor de referência final deve ser atribuido a este_

```
vaux = Funcoes.calcprop(funcionario.salario, funcionario.quantidadeHorasMes)
valorReferencia = funcionario.quantidadeHorasMes  
```

<html><body><hr></body></html>

# *Enums* <a name="Enums"></a> 
_Os enums permitem acessar os valores de uma lista pré determinada, o uso mais comum é a comporação com variáveis que retornam este tipo de valor_ 

_Exemplo, servidor.sexo retorna uma constante do tipo Sexo, para compara-lo use por exemplo servidor.sexo == Sexo.FEMININO_

#### *_ClassificacaoEvento_* <a name="ClassificacaoEvento"></a> 
_Exemplo de uso : ClassificacaoEvento.ABATSALM_

|Valor|Descrição|
|----|----|
|ABATSALM|Abatimento salário maternidade|
|ABATSALM13|Abatimento salário maternidade 13º salário|
|ABONOTERCO|1/3 de abono|
|ADI13SAL|13º salário adiantado|
|ADIFERIAS|Adiantamento de férias|
|ADISALNDESC|Adiantamento salarial não descontado|
|AUXNAT|Auxílio natalidade|
|AVPREDESC|Aviso prévio descontado|
|AVPREIND|Aviso prévio indenizado|
|AVPREIND13SAL|13º salário aviso prévio indenizado|
|AVPREINDUMDOZE|1/12 aviso prévio indenizado|
|BASABATINSSDV|Base abatimento INSS - duplo vínculo|
|BASEINSSNEG|Base negativa INSS - Mensal|
|BASINSSDV|Base INSS - duplo vínculo|
|BASINSSDV13SAL|Base INSS 13º salário - duplo vínculo|
|BASINSSOUTEMP|Base INSS outras empresas|
|BASINSSOUTEMP13SAL|Base INSS outras empresas 13º salário|
|BASIRRFDV|Base IRRF - duplo vínculo|
|BASIRRFDV13SAL|Base IRRF 13º salário - duplo vínculo|
|BASIRRFFERIASANT|Base IRRF de férias anteriores|
|BASIRRFFERIASRESCDV|Base IRRF férias resc. - duplo vínculo|
|BASIRRFOUTEMP|Base IRRF outras empresas|
|BASIRRFOUTEMP13SAL|Base IRRF outras empresas 13º salário|
|DESC13SALADI|Desconto 13º salário adiantado|
|DESC13SALDEVREINTG|Desconto de 13º salário devido reintegração|
|DESCADISAL|Desconto adiantamento salarial|
|DESCDEP|Desconto por dependente|
|DESCHAUXMAT|Desc. horas aux. maternidade|
|DESCHAUXMAT13SAL|Desc. horas aux. maternidade 13º salário|
|DEVFGTS|Devolução FGTS 13º salário|
|DEVINSS|Devolução de INSS|
|DEVIRRF|Devolução de IRRF|
|EMPRESTIMO|Empréstimos|
|FALTADSR|Faltas DSR|
|FALTAS|Faltas|
|FERDOBROTERCO|1/3 de férias em dobro|
|FERIASADI|Férias adiantadas|
|FERIASTERCO|1/3 de férias|
|FERINDENTERCO|1/3 de férias indenizadas|
|FERPROPTERCO|1/3 de férias proporcionais|
|FERVENCTERCO|1/3 de férias vencidas|
|FGTS|FGTS|
|FGTS13SAL|FGTS 13º salário|
|FGTSAVPRE|FGTS aviso prévio |
|FGTSMESANT|FGTS mês anterior|
|FGTSSOBFERIAS|FGTS sobre férias|
|FUNDASS|Fundo assistência|
|FUNDASS13SAL|Fundo assistência 13º salário|
|FUNDFIN|Fundo financeiro|
|FUNDFIN13SAL|Fundo financeiro 13º salário|
|FUNDPREV|Fundo previdência|
|FUNDPREV13SAL|Fundo previdência 13º salário|
|HAUXMATNPAG|Horas aux. maternidade não pagas|
|HORASFERIAS|Horas férias|
|HORASFERIASAVPREVIND|Horas férias aviso prévio indenizado|
|HORASFERIASCOL|Horas férias coletivas|
|INSS|INSS|
|INSS13SAL|INSS 13º salário|
|INSSSOBHAUXMATNPAG|INSS sobre horas aux. matern. não pagas|
|INTEG13SAL|13º salário integral|
|IRRF|IRRF|
|IRRF13SAL|IRRF 13º salário|
|IRRFFERIASRESC|IRRF férias rescisão|
|ISS|ISS - Imposto Sobre Serviço|
|MULTAFGTS|Multa do FGTS|
|NENHUMA|Nenhuma|
|PARCISENFUNDFIN|Parcela isenta fundo financeiro|
|PARCISENFUNDFIN13SAL|Parcela isenta fundo financeiro 13º salário|
|PARCISENFUNDPREV|Parcela isenta fundo previdência|
|PARCISENFUNDPREV13SAL|Parcela isenta fundo previdência 13º salário|
|PARCISENIRRF|Parcela isenta IRRF|
|PARCISENIRRF13SAL|Parcela isenta IRRF 13º salário|
|PARCISENIRRFMOLGRV|Parcela isenta IRRF moléstia grave|
|PARCISENIRRFMOLGRV13SAL|Parcela isenta IRRF moléstia grave 13º salário|
|PARCISENIRRFMOLGRVFERIAS|Parcela isenta IRRF moléstia grave férias|
|PARCISENIRRFMOLGRVFERIASADI|Parc. isenta IRRF moléstia grave férias adiant|
|PARCISENIRRFMOLGRVFERIASRESC|Parc. isenta IRRF moléstia grave férias resc.|
|PARCISENIRRFSOBFERIASRESC|Parcela isenta IRRF sobre férias resc.|
|PENSJUDDESC|Pensão judicial - Desconto|
|PLANOSAUDE|Plano de saúde|
|PONTIDAO|Prontidão|
|PREVEST|Prev. estadual|
|PREVESTDECSAL|Prev. estadual 13º salário|
|PROCEDMED|Procedimentos médicos |
|PRORROGAUXMAT11770|Prorrog. do aux. maternidade - Lei 11770/2008|
|REDBASINSSTRANSPAUT|Redutor base INSS transportador autônomo|
|REDBASIRRFTRANSPAUT|Redutor base IRRF transportador autônomo|
|RPPSABAT|Abatimento para RPPS|
|RPPSABAT13|Abatimento para RPPS 13º salário|
|SALFAMAPOS|Salário família aposentado|
|SALFAMCEL|Salário família celetista|
|SALFAMESP|Salário família especial|
|SALFAMEST|Salário família estatutário|
|SALFAMPAGMAIOR|Salário família pago a maior|
|SENAT|SENAT|
|SEST|SEST|
|SOBREAVISO|Sobreaviso|
|VALETRANSP|Vale transporte - custo empregador|

#### *_TipoProcessamento_* <a name="TipoProcessamento"></a> 
_Exemplo de uso : TipoProcessamento.FERIAS_

|Valor|Descrição|
|----|----|
|MENSAL|Mensal|
|FERIAS|Férias|
|DECIMO_TERCEIRO_SALARIO|Décimo terceiro salário|
|RESCISAO|Rescisão|

#### *_SubTipoProcessamento_* <a name="SubTipoProcessamento"></a> 
_Exemplo de uso : SubTipoProcessamento.COMPLEMENTAR_

|Valor|Descrição|
|----|----|
|INTEGRAL|Integral|
|ADIANTAMENTO|Adiantamento|
|COMPLEMENTAR|Complementar|

#### *_TipoEvento_* <a name="TipoEvento"></a> 
_Exemplo de uso : TipoEvento.DESCONTO_

|Valor|Descrição|
|----|----|
|VENCIMENTO|Vencimento (provento)|
|DESCONTO|Desconto|
|INFORMATIVO_MAIS|Informativo mais (evento de vencimento que não compõe líquido)|
|INFORMATIVO_MENOS|Informativo menos (evento de desconto que não compõe líquido)|

#### *_UnidadeEvento_* <a name="UnidadeEvento"></a> 
_Exemplo de uso : UnidadeEvento.HORAS_

|Valor|Descrição|
|----|----|
|AUTOMATICO|Automático|
|AVOS|Avos|
|DIAS|Dias|
|HORAS|Horas|
|PERCENTUAL|Percentual|
|QUANTIDADE|Quantidade|
|VALOR|Valor|

#### *_FormaPagamento_* <a name="FormaPagamento"></a> 
_Exemplo de uso : FormaPagamento.CREDITO_EM_CONTA_

|Valor|Descrição|
|----|----|
|DINHEIRO|Dinheiro|
|CHEQUE|Cheque|
|CREDITO_EM_CONTA|Crédito em conta|

#### *_GrauDeficiencia_* <a name="GrauDeficiencia"></a> 
_Exemplo de uso : GrauDeficiencia.PARCIAL_

|Valor|Descrição|
|----|----|
|PARCIAL|Parcial|
|TOTAL|total|
|NAOINVALIDO|Não inválido|

#### *_MesContribuicaoSindical_* <a name="MesContribuicaoSindical"></a> 
_Exemplo de uso : MesContribuicaoSindical.MARCO_

|Valor|Descrição|
|----|----|
|JANEIRO|Janeiro|
|FEVEREIRO|Fevereiro|
|MARCO|Março|
|ABRIL|Abril|
|MAIO|Maio|
|JUNHO|Junho|
|JULHO|Julho|
|AGOSTO|Agosto|
|SETEMBRO|Setembro|
|OUTUBRO|Outubro|
|NOVEMBRO|Novembro|
|DEZEMBRO|Dezembro|

#### *_OrigemRendimento_* <a name="OrigemRendimento"></a> 
_Exemplo de uso : OrigemRendimento.CARGO_COMISSIONADO_

|Valor|Descrição|
|----|----|
|CARGO|Cargo|
|CARGO_COMISSIONADO|Cargo comissionado|

#### *_Sexo_* <a name="Sexo"></a> 
_Exemplo de uso : Sexo.FEMININO_

|Valor|Descrição|
|----|----|
|MASCULINO|Masculino|
|FEMININO|Feminino|

#### *_TipoAdmissao_* <a name="TipoAdmissao"></a> 
_Exemplo de uso : TipoAdmissao.TRANSFERENCIA_

|Valor|Descrição|
|----|----|
|ADMISSAO|Admissão|
|TRANSFERENCIA|Transferência|
|SUBSTITUICAO|Substituição|

#### *_TipoVinculo_* <a name="TipoVinculo"></a> 
_Exemplo de uso : TipoVinculo.CELETISTA_

|Valor|Descrição|
|----|----|
|CELETISTA|Celetista|
|ESTATUTARIO|Estatutário|
|OUTROS|Outros|

#### *_TipoMatricula_* <a name="TipoMatricula"></a> 
_Exemplo de uso : TipoMatricula.FUNCIONARIO_

|Valor|Descrição|
|----|----|
|FUNCIONARIO|Funcionário|
|ESTAGIARIO|Estagiário|
|AUTONOMO|Autônomo|
|APOSENTADO|Aposentado|
|PENSIONISTA|Pensionista|

#### *_ResponsabilidadePagamento_* <a name="ResponsabilidadePagamento"></a> 
_Exemplo de uso : ResponsabilidadePagamento.PAGAMENTO_EXCLUSIVAMENTE_PELO_CESSIONARIO_DESTINO_

|Valor|Descrição|
|----|----|
|PAGAMENTO_EXCLUSIVAMENTE_PELO_CEDENTE_ORIGEM|Pagamento exclusivamente feito pelo cedente (origem)|
|PAGAMENTO_EXCLUSIVAMENTE_PELO_CESSIONARIO_DESTINO|Pagamento exclusivamente feito pelo cessionário (destino)|
|PAGAMENTO_PELO_CEDENTE_ORIGEM_E_PELO_CESSIONARIO_DESTINO|Pagamento feito pelo cedente e pelo cessionário|
|PAGAMENTO_PELO_CEDENTE_ORIGEM_COM_RESSARCIMENTO_PELO_CESSIONARIO_DESTINO|Pagamento feito pelo cedente e ressarcimento pelo cessionário|

#### *_TipoOnus_* <a name="TipoOnus"></a> 
_Exemplo de uso : TipoOnus.CEDENTE_

|Valor|Descrição|
|----|----|
|CEDENTE|Cedente|
|CESSIONARIO|Cessionário|

#### *_TipoRegime_* <a name="TipoRegime"></a> 
_Exemplo de uso : TipoRegime.CAIXA_

|Valor|Descrição|
|----|----|
|CAIXA|Caixa|
|COMPETENCIA|Competência|

#### *_TipoValor_* <a name="TipoValor"></a> 
_Exemplo de uso : TipoValor.CALCULADO_

|Valor|Descrição|
|----|----|
|CALCULADO|Calculado|
|REFERENCIA|Referência|

#### *_TipoRegimePrevidenciario_* <a name="TipoRegimePrevidenciario"></a> 
_Exemplo de uso : TipoRegimePrevidenciario.REGIME_PROPRIO_

|Valor|Descrição|
|----|----|
|REGIME_PROPRIO|Regime prório|
|CLT|CLT|
|OUTROS|Outros|

#### *_UnidadeCalculo_* <a name="UnidadeCalculo"></a> 
_Exemplo de uso : UnidadeCalculo.HORAS_

|Valor|Descrição|
|----|----|
|DIAS|Dias|
|HORAS|Horas|

#### *_TipoDespesaPlanoSaude_* <a name="TipoDespesaPlanoSaude"></a> 
_Exemplo de uso : TipoDespesaPlanoSaude.MENSALIDADE_

|Valor|Descrição|
|----|----|
|MENSALIDADE|Mensalidade|
|ADESAO|Adesão|
|PROCEDIMENTOS|Procedimentos|

#### *_AplicacaoDesconto_* <a name="AplicacaoDesconto"></a> 
_Exemplo de uso : AplicacaoDesconto.VALOR_

|Valor|Descrição|
|----|----|
|PERCENTUAL|Percentual|
|VALOR|Valor|

#### *_ClassificacaoTipoAfastamento_* <a name="ClassificacaoTipoAfastamento"></a> 
_Exemplo de uso : ClassificacaoTipoAfastamento.ABORTO_NAO_CRIMINOSO_

|Valor|Descrição|
|----|----|
|ABORTO_NAO_CRIMINOSO|Aborto não criminoso|
|ACIDENTE_DE_TRABALHO_EMPREGADOR|Acidente de trabalho empregador|
|ACIDENTE_DE_TRABALHO_PREVIDENCIA|Acidente de trabalho previdência|
|ACIDENTE_DE_TRAJETO_EMPREGADOR|Acidente de trajeto empregador|
|ACIDENTE_DE_TRAJETO_PREVIDENCIA|Acidente de trajeto previdência|
|DOENCA_DO_TRABALHO_EMPREGADOR|Doença do trabalho empregador|
|DOENCA_DO_TRABALHO_PREVIDENCIA|Doença do trabalho previdência|
|AUXILIO_DOENCA_EMPREGADOR|Auxílio doença empregador|
|AUXILIO_DOENCA_PREVIDENCIA|Auxílio doença previdência|
|ACOMPANHAR_MEMBRO_DA_FAMILIA_ENFERMO|Acompanhar membro da família enfermo|
|ADOCAO_GUARDA_JUDICIAL_DE_CRIANCA|Adoção/guarda judicial de criança|
|APOSENTADORIA_POR_INVALIDEZ|Aposentadoria por invalidez|
|CANDIDATO_A_CARGO_ELETIVO|Candidato a cargo eletivo|
|CARCERE|Cárcere|
|CEDENCIA|Cedência|
|FALTA|Falta|
|FERIAS|Férias|
|LICENCA_COM_VENCIMENTOS|Licença COM vencimentos|
|LICENCA_SEM_VENCIMENTOS|Licença SEM vencimentos|
|LICENCA_MATERNIDADE|Licença maternidade|
|MANDATO_ELEITORAL_COM_REMUNERACAO|Mandato eleitoral COM remuneração|
|MANDATO_ELEITORAL_SEM_REMUNERACAO|Mandato eleitoral SEM remuneração|
|MANDATO_SINDICAL|Mandato sindical|
|MULHER_VITIMA_DE_VIOLENCIA_LEI_MARIA_DA_PENHA|Mulher vítima de violência (Lei Maria da Penha)|
|PRORROGACAO_DA_LICENCA_MATERNIDADE|Prorrogação da licença maternidade|
|SERVICO_MILITAR|Serviço militar|
|SERVIDOR_PUBLICO_EM_DISPONIBILIDADE|Servidor público em disponibilidade|
|SUSPENSAO_DISCIPLINAR_ART474_CLT|Suspensão disciplinar Art.474 CLT|
|SUSPENSAO_DO_CONTRATO_ART476_CLT|Suspensão do contrato Art.476 CLT|
|APOSENTADO|Aposentado|
|DEMITIDO|Demitido|
|AUSENCIA_LEGAL|Ausência Legal|
|PRORROGACAO_DA_LICENCA_MATERNIDADE_11_770|Prorrogação da licença maternidade lei 11.770|

#### *_SituacaoPeriodoAquisitivoDecimoTerceiro_* <a name="SituacaoPeriodoAquisitivoDecimoTerceiro"></a> 
_Exemplo de uso : SituacaoPeriodoAquisitivoDecimoTerceiro.ATRASADO_

|Valor|Descrição|
|----|----|
|ATRASADO|Atrasado|
|EM_ANDAMENTO|Em andamento|
|PERDA_DIREITO|Perda do direito|
|QUITADO|Quitado|
|QUITADO_PARCIALMENTE|Quitado parcialmente (quando houve adiantamento)|
|ANULADO|Anulado|

#### *_SituacaoPeriodoAquisitivo_* <a name="SituacaoPeriodoAquisitivo"></a> 
_Exemplo de uso : SituacaoPeriodoAquisitivo.EM_ANDAMENTO_

|Valor|Descrição|
|----|----|
|EM_ANDAMENTO|Em andamento|
|QUITADO|Quitado|
|CANCELADO|Cancelado|
|ADQUIRIDO|Adquirido|
|ANULADO|Anulado|

#### *_OcorrenciaSefip_* <a name="OcorrenciaSefip"></a> 
_Exemplo de uso : OcorrenciaSefip.EXPOSTO_APOSENTADORIA_15_ANOS_

|Valor|Descrição|
|----|----|
|NUNCA_EXPOSTO_AGENTES_NOCIVOS|Nunca teve exposto a agentes nocivos|
|EXPOSTO_ALGUMA_VEZ|Trabalhador já teve exposto alguma vez|
|EXPOSTO_APOSENTADORIA_15_ANOS|Exposto a agentes nocivos - aposentadoria 15 anos|
|EXPOSTO_APOSENTADORIA_20_ANOS|Exposto a agentes nocivos - aposentadoria 20 anos|
|EXPOSTO_APOSENTADORIA_25_ANOS|Exposto a agentes nocivos - aposentadoria 25 anos|

#### *_TipoSalarioFamilia_* <a name="TipoSalarioFamilia"></a> 
_Exemplo de uso : TipoSalarioFamilia.ESTATUTARIO_

|Valor|Descrição|
|----|----|
|ESTATUTARIO|Estatutário|
|APOSENTADO|Aposentado|
|ESPECIAL|Especial|
|CELETISTA|Celetista|

#### *_TipoRetornoValeTransporte_* <a name="TipoRetornoValeTransporte"></a> 
_Exemplo de uso : TipoRetornoValeTransporte.QUANTIDADE_

|Valor|Descrição|
|----|----|
|QUANTIDADE|Quantidade|
|VALOR|Valor|

#### *_ClassificacaoAdicional_* <a name="ClassificacaoAdicional"></a> 
_Exemplo de uso : ClassificacaoAdicional.ANUENIO_

|Valor|Descrição|
|----|----|
|ANUENIO|Anuênio|
|BIENIO|Biênio|
|TRIENIO|Triênio|
|QUADRIENIO|Quadriênio|
|QUINQUENIO|Quinquênio|

#### *_Bases_* <a name="Bases"></a> 
_Exemplo de uso : Bases.INSS_

|Valor|Descrição|
|----|----|
|PAGAPROP|Paga Proporcional|
|SALBASE|Salário Base|
|HORAEXTRA|Horas Extras|
|PERIC|Periculosidade|
|SIND|Sindicato|
|FGTS|F.G.T.S.|
|FGTS13|F.G.T.S. 13º Salário|
|IRRF|I.R.R.F.|
|IRRF13|I.R.R.F. 13º Salário|
|IRRFFERRESC|I.R.R.F. Férias Rescisão|
|INSS|I.N.S.S.|
|INSS13|I.N.S.S. 13º Salário|
|PREVEST|Prev. Estadual|
|PREVEST13|Prev. Estadual 13º Salário|
|FUNDASS|Fundo Assistência|
|FUNDASS13|Fundo Assistência 13º Salário|
|FUNDOPREV|Fundo Previdência|
|FUNDPREV13|Fundo Previdência 13º Salário|
|OUTRASBASES|Outras Bases|
|FGTSAVISO|F.G.T.S. Aviso Prévio|
|ABATIRRF|Abatimento I.R.R.F.|
|ABATIRRF13|Abatimento I.R.R.F. 13º Sal.|
|DESCIRRF|Desconto I.R.R.F.|
|DESCIRRF13|Desconto I.R.R.F. 13º Salário|
|DESCIRRFERES|Desconto I.R.R.F. Férias Resc.|
|EXCEINSS|Excedente I.N.S.S.|
|EXCEINSS13|Excedente I.N.S.S. 13º Salário|
|ABATINSS|Abatimento I.N.S.S.|
|DESCTERFER|Desconto 1/3 De Férias|
|SALAFAM|Salário Família Normal|
|INSSOUTRA|I.N.S.S. Outras Empresas|
|INSSOUTRA13|I.N.S.S. Outras Emp. 13º Sal|
|IRRFOUTRA|I.R.R.F. Outras Empresas|
|IRRFOUTRA13|I.R.R.F. Outras Emp. 13º Sal|
|IRRFFER|I.R.R.F. Férias|
|CONTSIND|Contrib. Sindical Anual|
|MEDIAUXMAT|Média Auxílio Maternidade|
|DESC13REINT|Desc. 13º Salário Reintegração|
|COMPHORAMES|Compõem Horas|
|TERFERVENRES|1/3 Férias Vencidas Resc.|
|FUNDFIN|Fundo Financeiro|
|FUNDFIN13|Fundo Financeiro 13º Salário|
|MEDAUXMATPR|Média Auxílio Maternidade Proporcional|
|IN13SADI|I.N.S.S. 13º Salário Distorção|
|FUPR13SAPR|Fundo Previdência 13º Salário Provisão|
|FUPR13SAAJPR|Fundo Previdência 13º Salário Ajuste Provisão|
|FUPR13SAESPR|Fundo Previdência 13º Salário Estorno Provisão|
|FUPR13SADI|Fundo Previdência 13º Salário Distorção|
|PRES13SAPR|Prev. Estadual 13º Salário Provisão|
|PRES13SAAJPR|Prev. Estadual 13º Salário Ajuste Provisão|
|PRES13SAESPR|Prev. Estadual 13º Salário Estorno Provisão|
|PRES13SADI|Prev. Estadual 13º Salário Distorção|
|FUAS13SAPR|Fundo Assistência 13º Salário Provisão|
|FUAS13SAAJPR|Fundo Assistência 13º Salário Ajuste Provisão|
|FUAS13SAESPR|Fundo Assistência 13º Salário Estorno Provisão|
|FUAS13SADI|Fundo Assistência 13º Salário Distorção|
|FG13SAPR|F.G.T.S. 13º Salário Provisão|
|FG13SAAJPR|F.G.T.S. 13º Salário Ajuste Provisão|
|FG13SAESPR|F.G.T.S. 13º Salário Estorno Provisão|
|INFEPR|I.N.S.S. Férias Provisão|
|INFEAJPR|I.N.S.S. Férias Ajuste Provisão|
|INFEESPR|I.N.S.S. Férias Estorno Provisão|
|INFEDI|I.N.S.S. Férias Distorção|
|FUPRFEPR|Fundo Previdência Férias Provisão|
|FUPRFEAJPR|Fundo Previdência Férias Ajuste Provisão|
|FUPRFEESPR|Fundo Previdência Férias Estorno Provisão|
|FUPRFEDI|Fundo Previdência Férias Distorção|
|PRESFEPR|Prev. Estadual Férias Provisão|
|PRESFEAJPR|Prev. Estadual Férias Ajuste Provisão|
|PRESFEESPR|Prev. Estadual Férias Estorno Provisão|
|PRESFEDI|Prev. Estadual Férias Distorção|
|FUASFEPR|Fundo Assistência Férias Provisão|
|FUASFEAJPR|Fundo Assistência Férias Ajuste Provisão|
|FUASFEESPR|Fundo Assistência Férias Estorno Provisão|
|FUASFEDI|Fundo Assistência Férias Distorção|
|FGFEPR|F.G.T.S. Férias Provisão|
|FGFEAJPR|F.G.T.S. Férias Ajuste Provisão|
|FGFEESPR|F.G.T.S. Férias Estorno Provisão|
|13DEFEPR|1/3 De Férias Provisão|
|13DEFEAJPR|1/3 De Férias Ajuste Provisão|
|PRBAAUMEHOFE|Provisão - Base Auxiliar Média Horas Férias|
|PRBAAUMEHO13|Provisão - Base Auxiliar Média Horas 13º Salário|
|PRBAAUDI13SA|Provisão - Base Auxiliar Distorções 13º Salário|
|PRBAAUDIFE|Provisão - Base Auxiliar Distorções Férias|
|DEVIRRF|Devolução I.R.R.F.|
|DEVINSS|Devolução I.N.S.S.|
|PAISIR|Parcela Isenta I.R.R.F.|
|PAISIR13SA|Parcela Isenta I.R.R.F. 13º Salário|
|INSSFER|I.N.S.S. DE FÉRIAS|


<html><body><hr></body></html>

# *Funções para fórmulas (mantidas pelo desenvolvimento)* <a name="funcoes-formulas"></a> 
_Em funções para fórmulas é possível criar funções para auxiliar no uso de fórmulas de eventos, diminuindo a complexidade deles e permitindo o re-uso de código, o desenvolvimento cria e mantém um pacote dessas funções, conforme segue_  
  
#### *_acumula_* <a name="acumula"></a> 
_Acumula a movimentação de um determinado evento_
 
|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|codigoEvento|Código do evento|Sim|
|tipo|se deseja retornar valor calculado ou de referência, use TipoValor.CALCULADO ou TipoValor.REFERENCIA|Sim|
|competenciaInicial|Competência inicial para acumular a movimentação|Sim|
|competenciaFinal|Competência final para acumular a movimentação|Sim|
|tiposProcessamentos|Uma lista de tipos de processamentos ex: ['MENSAL', 'MENSAL_ADIANTAMENTO' ], opções : 'MENSAL', 'MENSAL_ADIANTAMENTO', 'MENSAL_COMPLEMENTAR', 'FERIAS', 'DECIMO', 'DECIMO_ADIANTAMENTO', 'RESCISAO', 'RESCISAO_COMPLEMENTAR'  |Sim|

```
valorAcumulado = Funcoes.acumula(67, TipoValor.CALCULADO, competencia, competencia, ['MENSAL_ADIANTAMENTO'])
```

 
#### *_afasaborto_* <a name="afasaborto"></a> 
_Retorna os dias afastado na competência por aborto não criminoso_

```
int afasaborto = Funcoes.afasaborto()
```
 
#### *_afasacidtrab_* <a name="afasacidtrab"></a> 
_Retorna os dias afastado na competência por acidente de trabalho (previdência)_

```
int afasacidtrab = Funcoes.afasacidtrab()
```
 
#### *_afasacidtrabemp_* <a name="afasacidtrabemp"></a> 
_Retorna os dias afastado na competência por acidente de trabalho (empregador)_

```
int afasacidtrabemp = Funcoes.afasacidtrabemp()
```

#### *_afasadocao_* <a name="afasadocao"></a> 
_Retorna os dias afastado na competência por adoção_

```
int afasadocao = Funcoes.afasadocao()
```

#### *_afasauxdoenc_* <a name="afasauxdoenc"></a> 
_Retorna os dias afastado na competência por doença (previdência)_

```
int afasauxdoenc = Funcoes.afasauxdoenc()
```

#### *_afasauxdoencemp_* <a name="afasauxdoencemp"></a> 
_Retorna os dias afastado na competência por doença (empregador)_

```
int afasauxdoencemp = Funcoes.afasauxdoencemp()
```

#### *_afasdirinteg_* <a name="afasdirinteg"></a> 
_Retorna os dias afastado na competência com direitos integrais_

```
int afasdirinteg = Funcoes.afasdirinteg()
```

#### *_afaslicmat_* <a name="afaslicmat"></a> 
_Retorna os dias afastado na competência por licença maternidade_

```
int afaslicmat = Funcoes.afaslicmat()
```

#### *_afaslicsvenc_* <a name="afaslicsvenc"></a> 
_Retorna os dias afastado na competência por licença sem vencimentos_

```
int afaslicsvenc = Funcoes.afaslicsvenc()
```

#### *_afasprorroglicmat_* <a name="afasprorroglicmat"></a> 
_Retorna os dias afastado na competência por prorrogação da licença maternidade_

```
int afasprorroglicmat = Funcoes.afasprorroglicmat()
```

#### *_afasprorroglicmatlei11770_* <a name="afasprorroglicmatlei11770"></a> 
_Retorna os dias afastado na competência por prorrogação da licença maternidade conforme lei 11.770_

```
int afasprorroglicmatlei11770 = Funcoes.afasprorroglicmatlei11770()
```

#### *_afasservmil_* <a name="afasservmil"></a> 
_Retorna os dias afastado na competência por serviço militar_

```
int afasservmil = Funcoes.afasservmil()
```

#### *_avos13_* <a name="avos13"></a> 
_Quantidade de avos para cálculo de décimo terceiro salário_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|mes|Mês de referência|Sim|
|calculoFGTS|Se deseja retornar os avos para fins de cálculo de FGTS, se não for informado será considerado false|Não|

```
int avos13 = Funcoes.avos13(12, true)
```

#### *_buscaMes_* <a name="buscaMes"></a> 
_Retorna o nome do mês conforme o mês informado por parâmetro_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|mes|mês do ano, de 1 a 12|Sim|

```
def nomeMes = Funcoes.buscaMes(12)
//retorna 'DEZEMBRO'
```

#### *_calcexclusivo_* <a name="calcexclusivo"></a> 
_Calcula o evento exclusivamente no tipo de processamento com maior número de dias, se a quantidade de dias foram a mesma na comparação retirnar o tipo de processamento 1_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|valorReferencia|Valor de referência, esse é o valor que será retornado|Sim|
|tipoProcessamento1|Tipo de processamento 1|Sim|
|diasProcessamento1|Dias do tipo de processamento 1 (para comparação)|Sim|
|tipoProcessamento2|Tipo de processamento 2|Sim|
|diasProcessamento2|Dias do tipo de processamento 2 (para comparação)|Sim|

```
def diasTrabalhados = 18
def diasFerias = 12

Funcoes.calcexclusivo(funcionario.salario, TipoProcessamento.MENSAL, diasTrabalhados, TipoProcessamento.FERIAS, diasFerias)
//O cálculo da folha mensal será mantido e das férias cancelado
```

#### *_calcprop_* <a name="calcprop"></a> 
_Calcula um valor proporcionalmente ao número de dias ou horas passados por parâmetro. Esta proporção é feita em relação a carga horária do funcionário na unidade que está nos parâmetros do sistema_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|vlrCalc|Valor que deseja-se calcular a proporcionalidade|Sim|
|proprocional|Quantidade de horas ou dias a ser aplicada a proporção. Este valor deve estar na mesma unidade configurada em Parâmetros|Sim|

```
def salario = funcionario.salario;
def diastrab = Funcoes.diastrab()
valorCalculado = Funcoes.calcprop(salario, diastrab);
```

#### *_cedidocomonus_* <a name="cedidocomonus"></a> 
_Retorna os dias afastado na competência por cedência com ônus_

```
int cedidocomonus = Funcoes.cedidocomonus()
```

#### *_cedidosemonus_* <a name="cedidosemonus"></a> 
_Retorna os dias afastado na competência por cedência sem ônus_

```
int cedidosemonus = Funcoes.cedidosemonus()
```

#### *_cnvdpbase_* <a name="cnvdpbase"></a> 
_Converte um número de dias para a unidade de cálculo configurada em Parâmetros gerais de cálculo_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|dias|Converte uma quantidade de dias para a unidade configurada em Parâmetros. Quando já estiver configurado em dias, será retornado o próprio valor passado neste parâmetro|Sim|

```
vaux = Funcoes.cnvdpbase(Funcoes.afasservmil())
valorReferencia = vaux
```

#### *_dadosMatricula_* <a name="dadosMatricula"></a> 
_Retorna alguns dados de matrícula, a função verifica o tipo de matrícula que esta sendo calculada para buscar conforme o tipo_

_As propriedades para consulta são, a data de início (dataInicio), a data de saída (dataSaida), e o indicativo se existe saída (existeSaida)_

```
def dados = Funcoes.dadosMatricula()

def dataInicio = dados.dataInicio
def dataSaida = dados.dataSaida
boolean existeSaida = dados.existeSaida
```

#### *_deducauxmat13_* <a name="deducauxmat13"></a> 
_Calcula o valor de dedução do salário maternidade para o 13º salário, referente os meses afastados por auxílio maternidade no que está sendo calculado_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|base|Valor da base de cálculo da previdência federal no 13º salário|Sim|
|avos|Quantidade de avos de 13º salário na competência que esta sendo calculada|Sim|

```
def base = Bases.valor(Bases.FUNDFIN13) - Bases.valor(Bases.DESC13REINT)
valorCalculado = Funcoes.deducauxmat13(base, Funcoes.avos13(Datas.mes(calculo.competencia)) )
```

#### *_diasafast_* <a name="diasafast"></a> 
_Busca o número de dias afastados em um determinado período, para determinadas classificações de afastamentos, especificados por parâmetro_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|dataInicial|Data inicial para buscar os afastamentos|Sim|
|dataFinal|Data final para buscar os afastamentos|Sim|
|afastamentos|Lista de classificações de afastamentos|Sim|

```
def classificacoes = [
    ClassificacaoTipoAfastamento.LICENCA_MATERNIDADE, 
    ClassificacaoTipoAfastamento.ABORTO_NAO_CRIMINOSO, 
    ClassificacaoTipoAfastamento.PRORROGACAO_DA_LICENCA_MATERNIDADE]
int dias = Funcoes.diasafast(Funcoes.inicioCompetencia(), calculo.competencia, classificacoes)
```

#### *_diasafastcalc30_* <a name="diasafastcalc30"></a> 
_Esta função busca o número de dias afastados numa determinada competência, considerando que todos os meses sejam de trinta dias (mês para efeito de folha de pagamento), para determinados tipos de afastamentos, especificados por parâmetro_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|competencia|Competência para buscar os afastamentos|Sim|
|afastamentos|Lista de classificações de afastamentos|Sim|

```
def classificacoes = [
    ClassificacaoTipoAfastamento.LICENCA_COM_VENCIMENTOS,
    ClassificacaoTipoAfastamento.LICENCA_MATERNIDADE,
    ClassificacaoTipoAfastamento.ABORTO_NAO_CRIMINOSO,
    ClassificacaoTipoAfastamento.ADOCAO_GUARDA_JUDICIAL_DE_CRIANCA,
    ClassificacaoTipoAfastamento.PRORROGACAO_DA_LICENCA_MATERNIDADE,
    ClassificacaoTipoAfastamento.PRORROGACAO_DA_LICENCA_MATERNIDADE_11_770
]

int dias = Funcoes.diasafastcalc30(calculo.competencia, classificacoes)
```

#### *_diasaposent_* <a name="diasaposent"></a> 
_Retorna os dias de aposento na competência_

```
int diasaposent = Funcoes.diasaposent()
```

#### *_diasferias_* <a name="diasferias"></a> 
_Retorna os dias de férias na competência_

```
int diasferias = Funcoes.diasferias()
```

#### *_diastrab_* <a name="diastrab"></a> 
_Retorna os dias trabalhados na competência_

```
int diastrab = Funcoes.diastrab()
```

#### *_dtafast_* <a name="dtafast"></a> 
_Busca a última data de afastamento, na competência calculada de um determinado tipo de afastamento_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|classificacao|Classificação de afastamento|Sim|
|licencaMaternidadeOrgininal|Este argumento é opcional e só terá validade para afastamentos de classificação PRORROGACAO_DA_LICENCA_MATERNIDADE. Quando esse argumento não for informado, ou for passado false, será retornada a data do início da prorrogação. Caso seja informado true, será retornada a data de início da licença maternidade que originou a prorrogação|Não|

```
int dtafast = Funcoes.dtafast(ClassificacaoTipoAfastamento.PRORROGACAO_DA_LICENCA_MATERNIDADE, true)
```


#### *_dtrescisao_* <a name="dtrescisao"></a> 
_Retorna a data da final de uma matrícula de qualquer tipo, caso não exista retorna 0_

```
dtrescisao = Funcoes.dtrescisao()
```

#### *_faltas_* <a name="faltas"></a> 
_Busca o número de faltas em determinado período especificado. O número de faltas é buscado independentemente de ter sido processado o cálculo na época da falta, ou seja, mesmo que não exista cálculo nas competências das faltas lançadas no Cadastro de Afastamentos (decorrência faltas)_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|justificada|Se deseja retornar faltas justificadas. Informar true ou false|Sim|
|dataCompetenciaInicial|Competência inicial, caso não seja informada será considerada a competência atual|Sim|
|dataCompetenciaFinal|Competência final, caso não seja informada será considerada a competência atual|Sim|
|motivo|Informe a descrição do motivo de falta, para retornar de qualquer motivo informe 0 ou false|Não|
|abonada|Se deseja retornar faltas abonadas. Informar true ou false|Não|


```
if (vlraux <= 0) {
    def inicioCompetencia = Datas.data(Datas.ano(calculo.competencia), Datas.mes(calculo.competencia), 1)
    vlraux = Funcoes.faltas(false, inicioCompetencia, calculo.competencia, 0, false)
}
```

#### *_getfgtsFerias_* <a name="getfgtsFerias"></a> 
_Essa função busca o valor de FGTS do processamento férias e faz a proporcionalização com os dias de férias na competência_

```
def fgtsFerias = Funcoes.getfgtsFerias()
def referencia = fgtsFerias.referencia
def valor      = fgtsFerias.valor
```

#### *_getInssFerias_* <a name="getInssFerias"></a> 
_Essa função busca o valor de INSS do processamento férias e faz a proporcionalização com os dias de férias na competência_

```
def inssFerias = Funcoes.getInssFerias()
def referencia = inssFerias.referencia
def valor      = inssFerias.valor
```

#### *_getIrrfFerias_* <a name="getIrrfFerias"></a> 
_Essa função busca o valor de IRRF do processamento férias e faz a proporcionalização com os dias de férias na competência_

```
def irrfFerias = Funcoes.getIrrfFerias()
def referencia = irrfFerias.referencia
def valor      = irrfFerias.valor
```

#### *_getTotalFerias_* <a name="getTotalFerias"></a> 
_Retorna o total da folha de férias desconsiderando eventos de INSS e IRRF, essa função verifica eventos da folha interna de férias e eventos da folha de pagamento de férias que não existem na folha interna de férias_

```
def totalFerias = Funcoes.getTotalFerias()
def provento    = totalFerias.provento
def desconto    = totalFerias.desconto
def liquido     = totalFerias.liquido
```

#### *_getValorFerias_* <a name="getValorFerias"></a> 
_Retorna o valor de um evento da folha de férias, podendo definir se deseja buscar da folha interna ou da folha de pagamento_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|codigoEvento|código do evento|Sim|
|buscarFolhaPagamento|Se deseja busca da folha de pagamento informar true, se não for informado ou o valor ser false irá buscar da folha interna|Não|

```
def valorFerias   = Funcoes.getValorFerias()
def valor         = valorFerias.valor
def referencia    = valorFerias.referencia
```

#### *_idade_* <a name="idade"></a> 
_Retorna da idade comparando a diferença entre duas datas_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|menorData|Menor data|Sim|
|maiorData|Maior data|Sim|


```
int idade = Funcoes.idade(Datas.data(1970,1,1), Datas.hoje());
```

#### *_inicioCompetencia_* <a name="inicioCompetencia"></a> 
_Retorna uma data referente ao primeiro dia da competência que esta sendo calculada_

```
def inicioCompetencia = Funcoes.inicioCompetencia()
```

#### *_mesesafast_* <a name="mesesafast"></a> 
_Busca o número de meses afastados em um determinado período, para determinadas classificações de afastamentos, especificados por parâmetro_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|dataInicial|Data inicial para buscar os afastamentos|Sim|
|dataFinal|Data final para buscar os afastamentos|Sim|
|classificações|Lista de classificações de afastamentos|Sim|

```
def afastamentos = [ClassificacaoTipoAfastamento.AUXILIO_DOENCA_PREVIDENCIA, ClassificacaoTipoAfastamento.LICENCA_SEM_VENCIMENTOS]
int meses = Funcoes.mesesafast(dtbase, dfin, afastamentos)
```

#### *_mesesmat13_* <a name="mesesmat13"></a> 
_Busca o número de meses afastados no ano por auxílio maternidade, para desconto de 13º salário. A contagem destes meses será de acordo com a regra dos avos para o 13º salário (mais que 14 dias trabalhados no mês conta como avo de 13º)._

```
if (  funcionario.possuiPrevidenciaFederal ){
    def vaux =  Funcoes.mesesmat13()
```

#### *_ocorrenciaSefip_* <a name="ocorrenciaSefip"></a> 
_Retorna a ocorrência sefip da matrícula, caso seja um tipo de matrícula que não possua ocorrência retorna NENHUMA, essa função pode ser usada para evitar a checagem do tipo de matrícula_

```
def ocorrenciaSefip = Funcoes.ocorrenciaSefip()
```

#### *_optanteFgts_* <a name="optanteFgts"></a> 
_Retorna se a matrícula é optante de FGTS, caso seja um tipo de matrícula que não possua opção retornará false, essa função pode ser usada para evitar a checagem do tipo de matrícula_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|tipoMatricula|Tipo da matrícula|Sim|

```
if ( Funcoes.optanteFgts(matricula.tipo)) {
    ...
```

#### *_pagapensao_* <a name="pagapensao"></a> 
_Indicativo se servidor paga pensão alimentícia_

```
boolean pagapensao = Funcoes.pagapensao()
```

#### *_permitecalc13integral_* <a name="permitecalc13integral"></a> 
_Indicativo se pode ser realizado o cálculo de décimo terceiro salário integral_

```
boolean permitecalc13integral = Funcoes.permitecalc13integral()
```

#### *_possuiPrevidenciaFederal_* <a name="possuiPrevidenciaFederal"></a> 
_Retorna se a matrícula possui previdência federal caso seja um tipo de matrícula que não possua opção retornará false, essa função pode ser usada para evitar a checagem do tipo de matrícula_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|tipoMatricula|Tipo da matrícula|Sim|


```
boolean possuiPrevidenciaFederal = Funcoes.possuiPrevidenciaFederal(matricula.tipo)
```

#### *_primeiroDia_* <a name="primeiroDia"></a> 
_Retorna a data referente ao primeiro dia de uma competência passada por parâmetro_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|data|informe uma data|Sim|


```
def data = Funcoes.primeiroDia(funcionario.dataAdmissao)
```

#### *_recebeDecimoTerceiro_* <a name="recebeDecimoTerceiro"></a> 
_Retorna se a matrícula recebe décimo terceiro salário, caso seja um tipo de matrícula que não possua opção retornará false, essa função pode ser usada para evitar a checagem do tipo de matrícula_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|tipoMatricula|Tipo da matrícula|Sim|


```
boolean recebeDecimoTerceiro = Funcoes.recebeDecimoTerceiro(matricula.tipo)
```

#### *_recebidosemonus_* <a name="recebidosemonus"></a> 
_Retorna os dias recebido com ônus na competência, conforma o tipo de admissão e responsabilidade de pagamento_

```
int recebidosemonus = Funcoes.recebidosemonus()
```

#### *_remuneracao_* <a name="remuneracao"></a> 
_Retorna dados de remuneração da matrícula independentemente do tipo_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|tipo|Tipo da matrícula|Sim|


```
def remuneracao = Funcoes.remuneracao(matricula.tipo)
def valor               = remuneracao.valor
def unidade             = remuneracao.unidade
def quantidadeHorasMes  = remuneracao.quantidadeHorasMes

```

#### *_replicaFeriasNaFolhaMensal_* <a name="replicaFeriasNaFolhaMensal"></a> 
_Esta função é utilizada para realizar de forma simples a réplica de eventos de férias para o processamento mensal_

|Parâmetro|Descrição|Obrigatório|
|----|----|----|
|codigoEvento|Código do evento|Sim|
|listaComposicaoBasesValorCalculado|Uma lista de bases para incidência|Não|
|listaComposicaoBasesValorReferencia|Uma lista de bases para incidência|Não|
|listaComposicaoBasesSobreSalario|Uma lista de bases para incidência|Não|
|listaComposicaoBasesSobrePagaProporcional|Uma lista de bases para incidência|Não|


```
def valorFerias = Funcoes.replicaFeriasNaFolhaMensal(evento.codigo, [Bases.INSS, BASES.EXEMPLO])
valorCalculado = valorFerias.valor
valorReferencia = valorFerias.referencia
```

#### *_somenteAposentadosBeneficiarios_* <a name="somenteAposentadosBeneficiarios"></a> 
_Esta função suspende o cálculo do evento caso a matrícula não seja do tipo aposentado ou beneficiário, esta função não possui retorno_

```
Funcoes.somenteAposentadosBeneficiarios()
```

#### *_somenteFuncionarios_* <a name="somenteFuncionarios"></a> 
_Esta função suspende o cálculo do evento caso a matrícula não seja do tipo funcionário, esta função não possui retorno_

```
Funcoes.somenteFuncionarios()
```
