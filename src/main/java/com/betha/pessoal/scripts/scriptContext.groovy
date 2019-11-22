import java.text.SimpleDateFormat
import static enums.*

class Contexto {

    /**
     * Por meio da função bases é possível buscar e compor valores de bases de cálculo .
     * Para informar uma base use 'Bases.ABREVIATURA' use control + espaço para mostrar todas
     */
    class Bases {
        /**
         * Busca o valor de uma base passada por argumento do cálculo atual
         * @return Um valor numérico
         */
        public BigDecimal valor() {
            return BigDecimal.valueOf(1000)
        }
        //BigDecimal valor();
        /**
         * Busca o valor de uma base de uma competência e processamento passado por argumento, não retorna dados do cálculo atual
         * @return Um valor numérico
         */
        public BigDecimal valorCalculado(Enum base, Enum<TipoProcessamento> tipoProcessamento, subTipoProcessamento, competencia, tipoRegime) {
            return BigDecimal.valueOf(1000)
        }
        //BigDecimal valorCalculado(Enum base, Enum<TipoProcessamento> tipoProcessamento, subTipoProcessamento, competencia, tipoRegime);
        /**
         * Compõe bases do valor passado no primeiro argumento para as bases informadas nos demais argumentos.
         */
        public void compor(BigDecimal valor, List bases) {
            return;
        }


    }


    /**
     * Dados que retornam na busca de uma folha por meio das funções de busca
     */
    public class folha {

        /**
         * Lista de eventos calculados
         */
        public Object eventos = new Object(evento);
        /**
         * Dias de gozo de férias
         */
        private static Integer diasGozo = 0;
        /**
         * Total bruto da folha
         */
        private static BigDecimal totalBruto = BigDecimal.valueOf(1500);
        /**
         * Total de descontos da folha
         */
        private static BigDecimal totalDesconto = BigDecimal.valueOf(1500);
        /**
         * Total líquido da folha
         */
        private static BigDecimal totalLiquido = BigDecimal.valueOf(1500);
        /**
         * Tipo de processamento da folha
         */
        private static Enum tipoProcessamento = TipoProcessamento.MENSAL;
        /**
         * Subtipo de processamento da folha
         */
        private static Enum subTipoProcessamento = SubTipoProcessamento.INTEGRAL;
        /**
         * Competência de cálculo da folha
         */
        private static Date competencia = new Date();
        /**
         * Dias de abono de férias
         */
        private static Integer diasAbono = 0;
        /**
         * Retorna verdadeiro se é folha de pagamento (se retornar falso é uma folha interna de férias)
         */
        private static Boolean folhaPagamento = true;
    }

    /**
     * Retorna informações do evento que esta sendo calculado ou buscado na folha
     */
    public class evento {
        /**
         * Código do evento
         */
        private static Integer codigo = 1;
        /**
         * Taxa do evento
         */
        private static BigDecimal taxa = BigDecimal.valueOf(0);
        /**
         * Permite busca a taxa de um outro evento informando-o no argumento
         * @param codigoEvento
         * @return Taxa informada no evento
         */
        private static BigDecimal getTaxa(Integer codigoEvento) {
            return BigDecimal.valueOf(100)
        }
        /**
         * Nome/Descrição do evento
         */
        private static String descricao = 'HORAS NORMAIS';
        /**
         * Tipo do evento (VENCIMENTO/DESCONTO/INFORMATIVO + / INFORMATIVO -)
         */
        private static Enum tipo = TipoEvento.VENCIMENTO;
        /**
         * Unidade do evento
         */
        private static Enum unidade = UnidadeEvento.DIAS;
        /**
         * Descrição da classificação do evento
         */
        private static String descricaoClassificacao = 'NENHUMA';
        /**
         * Classificação do evento
         */
        private static Enum classificacao = ClassificacaoEvento.INSS
    }


    /**
     * Dados do dependente, pode ser acessado em servidor.buscaDependentes()
     */
    class dependente {


        /**
         * Tipo de pensão (PERCENTUAL / VALOR)
         */
        private static Enum aplicacaoDesconto = AplicacaoDesconto.PERCENTUAL;
        /**
         * Valor do desconto, quanto a aplicação do desconto é em VALOR
         */
        private static BigDecimal valorDesconto = BigDecimal.valueOf(300);
        /**
         * Percentual do desconto, quanto a aplicação do desconto é em PERCENTUAL
         */
        private static BigDecimal percentualDesconto = BigDecimal.valueOf(30);
        /**
         * Data de início da dependência
         */
        private Date dataInicio = funcionario.dataAdmissao;
        /**
         * Data final da dependência
         */
        private static Date dataTermino = null;
        /**
         * Se é dependente de salário família
         */
        private static Boolean salarioFamilia = true;
        /**
         * Se é dependente de IRRF
         */
        private static Boolean irrf = true;
        /**
         * Data de nascimento do dependente
         */
        private static Date dataNascimento = new Date(2015, 1, 1);
        /**
         * Se é dependente estuda
         */
        private static Boolean estuda = false;
        /**
         * Se é dependente de pensão
         */
        private static Boolean pensao = true;
        /**
         * Data de início do curso
         */
        private static Date dataInicioCurso = false;
        /**
         * Data final do curso
         */
        private static Date dataFinalCurso = null;
    }


    /**
     * Matrícula
     */
    class matricula {

        private static Integer getCodigo() {
            Contexto object = new Contexto();
            return object.data.matricula.codigo
        }
        /**
         * Código da matrícula
         */
        static codigo = getCodigo();


        private static Enum getTipo() {
            Contexto object = new Contexto();
            String value = object.data.matricula.tipo

            TipoMatricula convertedEnumValue = value as TipoMatricula
            return convertedEnumValue
        }
        /**
         * Tipo da matrícula
         * FUNCIONARIO / ESTAGIÁRIO / PENSIONISTA / APOSENTADO / AUTONOMO
         */
        static tipo = getTipo();


    }

    /*INTERFACES */


    /**
     * Retorna o valor de Lancamentos de eventos em variáveis
     */
    public class Lancamentos {
        /**
         * Valor do evento lançado em variáveis
         * @param evento
         * @return o valor do lançamento, caso não tenha valor lançado retorna -1
         */
        private static BigDecimal valor(Enum evento) {
            return -1
        }

        /**
         * Valor do evento lançado em variáveis
         * @param evento
         * @param valor padrão de retorno
         * @return o valor do lançamento, caso não tenha valor lançado o valor padrão
         */
        private static BigDecimal valor(Enum evento, BigDecimal valorPadrao) {
            return BigDecimal.valueOf(valorPadrao)
        }

        /**
         * Busca eventos que compões horas mês e estão lançados em variáveis
         * @return a soma do valor dos eventos que compõe horas mês
         */
        private static BigDecimal valorComposicaoMes() {
            return BigDecimal.valueOf(0)
        }
    }

    /**
     * Permite buscar afastamentos de um período passados por argumento
     */
    public class Afastamentos {
        /**
         * Busca afastamentos de um périodo informando a data inicial, data final e uma lista de classificações de afastamentos
         * @param dataInicial
         * @param dataFinal
         * @param classificacoes
         * @return Retorna um lista de afastamentos.
         */
        public ArrayList buscaPorPeriodo(Date dataInicial, Date dataFinal, String[] ClassificacaoTipoAfastamento) {
            return new ArrayList(afastamento)
        }

        /**
         * Busca afastamentos da competência passando uma lista de classificações de afastamentos
         * @param classificacoes
         * @return Retorna um lista de afastamentos.
         */
        public ArrayList buscaPorPeriodo(String[] ClassificacaoTipoAfastamento) {
            return new ArrayList(afastamento)
        }


        /**
         * Rertorna dados do afastamento, é o retorna do método Afastamentos.buscaPorPeriodo()
         */
        class afastamento {
            /**
             * Unidade do afastamento
             */
            private static Enum unidade = UnidadeCalculo.DIAS;

            /**
             * Decorrência do afastamento
             */
            private static Enum decorrente = 'LICENCA';

            /**
             * Competência de desconto. Apenas para caso de faltas.
             */
            private static Date competenciaDesconto = new Date();

            /**
             * Tipo de ônus. Apenas para cessão.
             */
            private static Enum tipoOnus = TipoOnus.CEDENTE;

            /**
             * Motivo do afastamento
             */
            private static String motivo = 'MOTIVO DO AFASTAMENTO';

            /**
             * Data inicial do afastamento
             */
            private static Date inicio = new Date();

            /**
             * Data final do afastamento.
             * Caso não tenha data final será retornado o que foi informado no argumento dataFinal em Afastamentos.buscaPorPeriodo()
             */
            private static Date fim = new Date();

            /**
             * Se a falta foi marcada como abonada. Apenas para faltas.
             */
            private static Boolean abonar = false;

            /**
             * A competência de abono, somente quando a falta foi abonada.
             * Essa propriedade retorna nulo quando não existe uma competência.
             */
            private static Date competenciaAbono = new Date();

            /**
             * Quantidade de afastamento conforme unidade (HORAS, DIAS)
             */
            private static BigDecimal quantidade = BigDecimal.valueOf(15);

            /**
             * Tipo de afastamento, retorna os dados do tipo de afastamento
             */
            private tipo = tipoAfastamento;

            /**
             * Tipo de afastamento, retorna os dados do tipo de afastamento
             */
            class tipoAfastamento {
                /**
                 * Descrição do tipo de afastamento.
                 */
                private static String descricao = 'LICENÇA SEM VENCIMENTOS';

                /**
                 * Classificação do tipo de afastamento
                 */
                private static Enum classificacao = ClassificacaoTipoAfastamento.LICENCA_SEM_VENCIMENTOS;

                /**
                 * Dias previstos conforme cadastro de tipo de afastamento
                 */
                private static Integer diasPrevistos = 0;

                /**
                 * Se perde tempo de serviço
                 */
                private static Boolean tempoServico = true;

                /**
                 * Se considera vencimentos no cálculo, indica se eventos em variáveis deverão ser calculados
                 */
                private static Boolean consideraVencimento = true;

                /**
                 * Se reduz tempo afastado nas férias
                 */
                private static Boolean reduzFerias = true;

                /**
                 * Se reduz tempo afastado em décimo terceiro salário
                 */
                private static Boolean reduz13Salario = true;

                /**
                 * Se a falta é justificada
                 */
                private static Boolean justificado = true;
            }


        }

    }


/**
 * Retorna informações do servidor
 */
    class servidor {
        /**
         * Grau de escolaridade do servidor
         */
        private static Enum getGrauEscolaridade() {
            Contexto object = new Contexto();
            String value = object.data.servidor.grauEscolaridade
            GrauEscolaridade convertedEnumValue = value as GrauEscolaridade;
            return convertedEnumValue
        }

        static Enum grauEscolaridade = getGrauEscolaridade();

        /**
         * Data de nascimento do servidor
         */
        private static Date getDataNascimento() {
            Contexto object = new Contexto();
            Date data = new Date();
            try {
                String date = object.data.servidor.dataNascimento;
                data = new SimpleDateFormat("yyyy-MM-dd").parse(date);
            } catch (e) {
                return null
            }
            return data;
        }

        static Date dataNascimento = getDataNascimento();

        /**
         * Estado civil do servidor
         */
        private static Enum getEstadoCivil() {
            Contexto object = new Contexto();
            String value = object.data.servidor.estadoCivil
            EstadoCivil convertedEnumValue = value as EstadoCivil;
            return convertedEnumValue
        }
        static Enum estadoCivil = getEstadoCivil();
        /**
         * Nome do servidor
         */
        private static String getNome() {
            Contexto object = new Contexto();
            String value = object.data.servidor.nome
        }
        static String nome = getNome();

        /**
         * Nacionalidade do servidor
         */
        private static String getNacionalidade() {
            Contexto object = new Contexto();
            String value = object.data.servidor.nacionalidade
        }
        static String nacionalidade = getNacionalidade();

        /**
         * Data de chegada ao Brasil de pessoa estrangeira
         */
        private static Date getDataChegada() {
            if (getNacionalidade().equals("BRASIL")) return null
            Contexto object = new Contexto();
            Date data = new Date();
            try {
                String date = object.data.servidor.dataChegada;
                data = new SimpleDateFormat("yyyy-MM-dd").parse(date);
            } catch (e) {
                return null
            }
            return data;
        }
        static Date dataChegada = getDataChegada();

        /**
         * Quantidade gerais de dependentes
         */

        private static Integer getDependentes() {
            Contexto object = new Contexto();
            if (!object.data.servidor.dependentes) return 0;
            return object.data.servidor.dependentes
        }
        static Integer dependentes = 2;
        /**
         * Busca os dados do dependentes referente a IRRF, pensão e outras informações
         */
        static List getBuscaDependentes() {
            Contexto object = new Contexto();
            def dependentesLista = [];
            def dependentes = object.data.servidor.listaDependentes;
            dependentes.each { obj ->
                obj.each { entry ->
                    def campo = entry.value;

                    //println(campo)

                    boolean isDate = entry.value ==~ /\d{4}\-\d{2}\-\d{2}.*/
                    if (isDate) {
                        entry.value = getStringToDate(entry.value)
                    }

                    dependentesLista.push(entry)
                }

            }

            return dependentesLista;

        }

        static List buscaDependentes = getBuscaDependentes();

        /**
         * Sexo do servidor
         */
        Enum sexo = Sexo.MASCULINO;

        /**
         * Retorna os dependentes de um tipo de salário família informado
         * @param TipoSalarioFamilia
         * @return Quantidade de dependentes
         */
        private static Integer getDependenteSalarioFamilia(Enum TipoSalarioFamilia) {

        }

        /**
         * Quantidade de dependentes de IRRF
         */
        Integer dependentesIrrf = 2;

        /**
         * Se servidor possui moléstia grave
         */
        Boolean possuiMolestiaGrave;

        private static getStringToDate(date) {
            if (!date) return null;
            Date data = new Date();
            try {
                data = new SimpleDateFormat("yyyy-MM-dd").parse(date);
            } catch (e) {
                return null
            }
            return data;
        }

    }


/**
 * Informações do funcionário que esta sendo calculado
 */
    class funcionario {
        /**
         * Retorna o plano salarial da origem do rendimento
         * @param OrigemRendimento
         */
        private static String planoSalarialOrigemRendimento = OrigemRendimento.CARGO

        /**
         * Ocorrência sefip do funcionário
         */
        private static Enum ocorrenciaSefip = OcorrenciaSefip.EXPOSTO_APOSENTADORIA_15_ANOS;

        /**
         * Classe salarial do funcionário
         */
        private static final String classeSalarial = 'A-1'

        /**
         * Classe salarial conforme a origem do rendimento informada
         * @param OrigemRendimento
         * @return Retorna a classe salarial
         */
        private static String classeSalarialOrigemRendimento = 'A-1'

        /**
         * Mês de contribuição sindical configurado no cadastro do sindicato (cadastro de empresas)
         */
        private static Enum mesContribuicaoSindical = MesContribuicaoSindical.MAIO;


        private static Enum getTipoVinculo() {
            Contexto object = new Contexto();
            String value = object.data.funcionario.tipoVinculo

            TipoVinculo convertedEnumValue = value as TipoVinculo
            return convertedEnumValue
        }
        /**
         * Tipo do vínculo
         */
        static tipoVinculo = getTipoVinculo()


        private static String getCategoriaSefipVinculo() {
            Contexto object = new Contexto();
            return object.data.funcionario.categoriaSefipVinculo
        }
        /**
         * Categoria sefip do vínculo
         */
        static categoriaSefipVinculo = getCategoriaSefipVinculo();


        private static String getDescricaoOrganograma() {
            Contexto object = new Contexto();
            return object.data.funcionario.descricaoOrganograma
        }
        /**
         * Descrição do organograma
         */
        static String descricaoOrganograma = getDescricaoOrganograma();


        private static String getCodigoOrganograma() {
            Contexto object = new Contexto();
            return object.data.funcionario.codigoOrganograma
        }
        /**
         * Código do organograma
         */
        static String codigoOrganograma = getDescricaoOrganograma();


        private static Boolean getContaVaga() {
            Contexto object = new Contexto();
            return object.data.funcionario.contaVaga
        }
        /**
         * Se funcionario conta vaga
         */
        static Boolean contaVaga = getContaVaga();

        private static Boolean getContaVagaOrigemRendimento(Enum origem) {
            Contexto object = new Contexto();
            if (object.data.funcionario.contaVaga && origem.toString().equals("CARGO")) {
                return true
            }
            return false;
        }
        /**
         * Se funcionário conta vaga na origem de rendimento informada
         * @param OrigemRendimento
         */
        static Boolean contaVagaOrigemRendimento(Enum origem) {
            return getContaVagaOrigemRendimento(origem)
        }

        private static Boolean getRecebeDecimoTerceiro() {
            Contexto object = new Contexto();
            return object.data.funcionario.recebeDecimoTerceiro;
        }
        /**
         * Se funcionário recebe décimo terceiro, conforme cadastro de cargos
         */
        static Boolean recebeDecimoTerceiro = getRecebeDecimoTerceiro();


        /**
         * Se funcionário recebe décimo terceiro, conforme cadastro de cargos do cargo de origem de rendimento informado
         * @param OrigemRendimento
         * @return
         */
        private static Boolean recebeDecimoTerceiroPorOrigem(Enum OrigemRendimento) {
            return true
        }

        private static BigDecimal getDiasDireitoFerias() {
            Contexto object = new Contexto();
            return object.data.funcionario.diasDireitoFerias;
        }
        /**
         * Dias de direiro conforme a configuração de férias
         */
        static BigDecimal diasDireitoFerias = getDiasDireitoFerias();


        /**
         * Meses para aquisição conforme a configuração de férias
         */
        static Long getMesesAquisicaoFerias() {
            Contexto object = new Contexto();
            return object.data.funcionario.mesesAquisicaoFerias;
        }
        private static Long mesesAquisicaoFerias = getMesesAquisicaoFerias()

        /**
         * Data da opção de FGTS
         */
        private static Date getDataOpcaoFgts() {
            Contexto object = new Contexto();
            Date dataOpcao = new Date();
            try {
                String date = object.data.funcionario.dataOpcaoFgts;
                dataOpcao = new SimpleDateFormat("yyyy-MM-dd").parse(date);
            } catch (e) {
                return null
            }
            return dataOpcao;
        }
        static Date dataOpcaoFgts = getDataOpcaoFgts();

        /**
         * Data final do vínculo temporário, para data de rescisão use funcionario.dataRescisao
         */
        private static Date getDataFimVinculo() {
            Contexto object = new Contexto();
            Date data = new Date();
            try {
                String date = object.data.funcionario.dataFimVinculo;
                data = new SimpleDateFormat("yyyy-MM-dd").parse(date);
            } catch (e) {
                return null
            }
            return data;
        }
        static Date dataFimVinculo = getDataFimVinculo();


        private static BigDecimal getSalario() {
            Contexto object = new Contexto();
            return object.data.funcionario.salario;
        }
        /**
         * Salário do funcionário
         */
        private BigDecimal salario = getSalario();


        /**
         * Coeficente do nível salarial
         */
        private static BigDecimal nivelSalarialCoeficiente = BigDecimal.valueOf(0.1);

        /**
         * Unidade de pagamento
         */
        private static Enum getUnidadePagamento() {
            Contexto object = new Contexto();
            String value = object.data.funcionario.unidadePagamento

            UnidadePagamento convertedEnumValue = value as UnidadePagamento
            return convertedEnumValue
        }
        static unidadePagamento = getUnidadePagamento();

        /**
         * Quantidade de horas semanais
         */
        private static BigDecimal getQuantidadeHorasSemana() {
            Contexto object = new Contexto();
            return object.data.funcionario.quantidadeHorasSemana
        }
        static BigDecimal quantidadeHorasSemana = getQuantidadeHorasSemana();

        /**
         * Coeficente do nível salarial conforme origem de rendimento
         * @param OrigemRendimento
         * @return
         */
        private static BigDecimal nivelSalarialCoeficienteOrigemRendimento(Enum OrigemRendimento) {
            return BigDecimal.valueOf(0.1)
        }

        /**
         * Plano salarial
         */
        private static String getPlanoSalarial() {
            Contexto object = new Contexto();
            return object.data.funcionario.planoSalarial
        }
        static String planoSalarial = getPlanoSalarial();

        /**
         * Se é optante do FGTS
         */
        private static Boolean getOptanteFgts() {
            Contexto object = new Contexto();
            return object.data.funcionario.optanteFgts
        }
        static Boolean optanteFgts = getOptanteFgts();

        /**
         * Data base
         */
        private static Date getDataBase() {
            Contexto object = new Contexto();
            Date data = new Date();
            try {
                String date = object.data.funcionario.dataBase;
                data = new SimpleDateFormat("yyyy-MM-dd").parse(date);
            } catch (e) {
                return null
            }
            return data;
        }
        private static Date dataBase = getDataBase();

        /**
         * Sindicato do funcionário
         */
        private static String getSindicato() {
            Contexto object = new Contexto();
            return object.data.funcionario.sindicato
        }
        static String sindicato = getSindicato();

        /**
         * Responsabilidade do pagamento
         */
        private static Enum getResponsabilidadePagamento() {
            Contexto object = new Contexto();
            def value = object.data.funcionario.responsabilidadePagamento

            ResponsabilidadePagamento convertedEnumValue = value as ResponsabilidadePagamento
            return convertedEnumValue

            return responsabilidadePagamento
        }

        static Enum responsabilidadePagamento = getResponsabilidadePagamento();


        /**
         * Nível salarial
         */
        static String getNivelSalarial() {
            Contexto object = new Contexto();
            return object.data.funcionario.nivelSalarial
        }
        static String nivelSalarial = getNivelSalarial();

        /**
         * Se é estatutário
         */
        private static Boolean getEstatutario() {
            Contexto object = new Contexto();
            return object.data.funcionario.estatutario
        }

        static Boolean estatutario = getEstatutario()

        /**
         * Data da rescisção, se não existir retorna null
         */
        static Date getDataRescisao() {
            Contexto object = new Contexto();
            Date data = new Date();
            try {
                String date = object.data.funcionario.dataRescisao;
                data = new SimpleDateFormat("yyyy-MM-dd").parse(date);
            } catch (e) {
                return null
            }
            return data;
        }
        static Date dataRescisao = getDataRescisao();

        /**
         * Nível salarial conforme origem de rendimento
         * @param OrigemRendimento
         * @return
         */
        private static String getNivelSalarialOrigemRendimento(Enum origemRendimento) {
            Contexto object = new Contexto();
            if (origemRendimento.toString() == "CARGO_COMISSIONADO") {
                return object.data.funcionario.nivelSalarialComissionado
            }
            return object.data.funcionario.nivelSalarial
        }

        static nivelSalarialOrigemRendimento(Enum origemRendimento) {
            return getNivelSalarialOrigemRendimento(origemRendimento)
        }

        /**
         * Salário conforme origem de rendimento
         * @param OrigemRendimento
         * @return
         */
        private static BigDecimal getSalarioOrigemRendimento(Enum origemRendimento) {
            Contexto object = new Contexto();
            if (origemRendimento.toString() == "CARGO_COMISSIONADO") {
                return object.data.funcionario.salarioComissionado
            }
            return object.data.funcionario.salario
        }

        static BigDecimal salarioOrigemRendimento(Enum origemRendimento) {
            return getSalarioOrigemRendimento(origemRendimento);
        }

        /**
         * Vínculo empregatício do funcionário
         */
        private static String getVinculoEmpregaticio() {
            Contexto object = new Contexto();
            return object.data.funcionario.vinculoEmpregaticio
        }
        static String vinculoEmpregaticio = getVinculoEmpregaticio();

        /**
         * Grupo funcional
         */
        private static String getGrupoFuncional() {
            Contexto object = new Contexto();
            return object.data.funcionario.grupoFuncional
        }
        private static String grupoFuncional = getGrupoFuncional();

        /**
         * Cargo do funcionário (descrição)
         */
        private static String getCargo() {
            Contexto object = new Contexto();
            return object.data.funcionario.cargo
        }
        static String cargo = getCargo();

        /**
         * Data de admissão
         */
        private static Date getDataAdmissao() {
            Contexto object = new Contexto();
            Date data = new Date();
            try {
                String date = object.data.funcionario.dataAdmissao;
                data = new SimpleDateFormat("yyyy-MM-dd").parse(date);
            } catch (e) {
                return null
            }
            return data;
        }
        static Date dataAdmissao = getDataAdmissao();

        /**
         * Se possui previdência
         * @param TipoPrevidencia
         * @return verdadeiro ou falso
         */
        private static Boolean getPossuiPrevidencia(Enum TipoPrevidencia) {
            Contexto object = new Contexto();
            String tipo = object.data.funcionario.previdencia;
            if (TipoPrevidencia.toString() == tipo) {
                return true
            }

            return false;
        }

        static boolean possuiPrevidencia(Enum TipoPrevidencia) {
            return getPossuiPrevidencia(TipoPrevidencia)
        }

        /**
         * Se possui previdência federal
         */
        private static Boolean getPossuiPrevidenciaFederal() {
            Contexto object = new Contexto();
            String tipo = object.data.funcionario.previdencia;
            if (tipo.equals("CELETISTA")) {
                return true
            }
            return false;
        }

        static Boolean possuiPrevidenciaFederal = getPossuiPrevidenciaFederal();

        /**
         * Tipo de admissão
         */
        private static Enum getTipoAdmissao() {
            Contexto object = new Contexto();
            String value = object.data.funcionario.tipoAdmissao

            TipoAdmissao convertedEnumValue = value as TipoAdmissao
            return convertedEnumValue
        }

        static Enum tipoAdmissao = getTipoAdmissao();

        /**
         * Quantidade de horas mensais
         */
        private static BigDecimal getQuantidadeHorasMes() {
            Contexto object = new Contexto();
            return object.data.funcionario.quantidadeHorasMes
        }

        static BigDecimal quantidadeHorasMes = getQuantidadeHorasMes();

        /**
         * Cargo conforme a origem do rendimento
         * @param OrigemRendimento
         * @return um cargo
         */
        private static String getCargoOrigemRendimento(Enum origemRendimento) {
            Contexto object = new Contexto();
            if (origemRendimento.toString() == "CARGO_COMISSIONADO") {
                return object.data.funcionario.cargoComissionado
            }
            return object.data.funcionario.cargo
        }

        static String cargoOrigemRendimento(Enum OrigemRendimento) {
            return getCargoOrigemRendimento(OrigemRendimento)
        }
    }

/**
 * Retorna informações do autônomo que esta sendo calculado
 */
    interface autonomo {
        /**
         * Forma de pagamento do autônomo
         */
        Enum formaPagamento = FormaPagamento.CREDITO_EM_CONTA;
        /**
         * Grupo funcional do autônomo
         */
        String grupoFuncional = 'GERAL';
        /**
         * Data de início do serviço do autônomo
         */
        Date dataInicioServico = new Date();
        /**
         * Data final do serviço
         */
        Date dataFimServico = new Date();

        /**
         * Valor total do serviço do autônomo na competência que esta sendo calculada
         */
        BigDecimal totalServicosAutonomo = BigDecimal.valueOf(1500);

        /**
         * Descrição do orgranograma do autônomo
         */
        String descricaoOrganograma = 'SECRETARIA DE EDUCAÇÃO';

        /**
         * Agencia de pagamento do autônomo
         */
        String agenciaPagamento = 'CENTRO';

        /**
         * Banco de pagamento do autônomo
         */
        String bancoPagamento = 'BANCO DO BRASIL';
    }

/**
 * Retorna informações do estagiário que esta sendo calculado
 */
    interface estagiario {
        /**
         * Forma de pagamento do estagiário
         */
        Enum formaPagamento;

        /**
         * Grupo funcional do estagiário
         */
        String grupoFuncional;

        /**
         * Cargo do estagiário
         */
        String cargo;

        /**
         * Plano salarial do estagiário
         */
        String planoSalarial;

        /**
         * Classe salarial do estagiário
         */
        String classeSalarial;

        /**
         * Data de prorrogação do estágio
         */
        Date dataProrrogacao;

        /**
         * Nível salarial do estagiário
         */
        String nivelSalarial;

        /**
         * Quantidade de horas mês do estagiário
         */
        BigDecimal quantidadeHorasMes;

        /**
         * Descrição do organograma do estagiário
         */
        String descricaoOrganograma;

        /**
         * Se estagiário recebe décimo terceiro salário
         */
        Boolean recebeDecimoTerceiro;

        /**
         * Dias de direito de férias conforme configuração de férias
         */
        Integer diasDireitoFerias;

        /**
         * Meses para aquisição de férias conforme configuração de férias
         */
        Integer mesesAquisicaoFerias;

        /**
         * Data de início do estágio
         */
        Date dataInicioEstagio;

        /**
         * Se estagiário recebe bolsa de estudos
         */
        Boolean bolsaEstudos;

        /**
         * Data final do estágio
         */
        Date dataFinalEstagio;

        /**
         * Agencia de pagamento do estagiário
         */
        String agenciaPagamento;

        /**
         * Banco de pagamento do do estagiário
         */
        String bancoPagamento;

        /**
         * Coenficiente do nível salarial do estagiário
         */
        BigDecimal nivelSalarialCoeficiente
    }


/**
 * Retorna informações do aposentado que esta sendo calculado
 */
    interface aposentado {
        /**
         * Forma de pagamento do aposentado
         */
        Enum formaPagamento;

        /**
         * Grupo funcional do aposentado
         */
        String grupoFuncional;

        /**
         * Data de aposentadoria
         */
        Date dataAposentadoria;

        /**
         * Data de cessação da aposentadoria
         */
        Date dataCessacaoAposentadoria;

        /**
         * Valor do benefício do aposentado
         */
        BigDecimal valorBeneficio;

        /**
         * Descrição do organograma do aposentado
         */
        String descricaoOrganograma;

        /**
         * Código do organograma do aposentado
         */
        String codigoOrganograma;

        /**
         * Agência de pagamento do aposentado
         */
        String agenciaPagamento;

        /**
         * Banco de pagamento do aposentado
         */
        String bancoPagamento;
    }

    interface pensionista {
        /**
         * Forma de pagamento do pensionista
         */
        Enum formaPagamento;

        /**
         * Grupo funcional do pensionista
         */
        String grupoFuncional;

        /**
         * Valor do benefício
         */
        BigDecimal valorBeneficio;
        /**
         * Data de início do benefício do pensionista
         */
        Date dataInicioBeneficio;
        /**
         * Data de cessação do benefício do pensionista
         */
        Date dataCessacaoBeneficio;
        /**
         * Descrição do organograma do pensionista
         */
        String descricaoOrganograma;
        /**
         * Agência de pagamento do pensionista
         */
        String agenciaPagamento;

        /**
         * Banco de pagamento do pensionista
         */
        String bancoPagamento;
    }


/**
 * Retorno as informações do cálculo que esta sendo efetuado e dos parâmetros de cálculo
 */
    public interface calculo {
        /**
         * Indica se os valores de empréstimo devem ser descontados na rescisão
         */
        public Boolean descontarEmprestimoRescisao = true; ;

        /**
         * Retorna a competência que esta sendo calculada
         */
        public Date competencia = new Date();

        /**
         * Retorna a quantidade de dias da competência que esta sendo calculada
         */
        public Long quantidadeDiasCompetencia = 31L;

        /**
         * Se permite abono de férias sem gozo
         */
        public Boolean abonoSemGozo = false;

        /**
         * Tipo de processamento atual
         */
        public Enum tipoProcessamento = TipoProcessamento.MENSAL;

        /**
         * Data de pagamento informada para cálculo atual
         */
        public Date dataPagamento = new Date();

        /**
         * Data de rescisão informada, somente quando se esta calculando uma rescisão
         */
        public Date dataRescisao = new Date();

        /**
         * Quantidade de dias de uma competência informada nos argumentos
         * @param mes
         * @param ano
         * @return Quantidade de dias
         */
        public Long quantidadeDias(Integer mes, Integer ano);

        /**
         * Data de referência da rescisão
         */
        public Date dataReferenciaRescisao = new Date();

        /**
         * Retorna o período aquisitivo de décimo terceiro. Apenas quando o tipo de processamento é décimo terceiro
         */
        public Object periodoAquisitivoDecimoTerceiro = new Object();

        /**
         * Sub tipo de processamento
         */
        public Enum subTipoProcessamento = SubTipoProcessamento.INTEGRAL;

        /**
         * Unidade de pagamento dos parâmetros de cálculo
         */
        public Enum unidade = UnidadeCalculo.DIAS;

        /**
         * Se deverá pagar um terço de férias integral em férias parcial, conforme parametrização do cálculo
         */
        public Boolean pagarUmTercoIntegral = false;

        /**
         * O ano de referência do décimo terceiro salário
         * @return O ano atual
         * */
        public Integer anoDecimoTerceiro = 2019;

        /**
         * Se deve considerar os avos perdidos para contar os avos de direito
         */
        public Boolean consideraAvosPerdidos = true;

        /**
         * Se deve pagar o décimo terceiro no cálculo de férias. Conforme parametrização.
         */
        public Boolean pagarDecimoTerceiroFerias = true;

        /**
         * Se o cálculo é individual, se coletivo retorna falso.
         */
        public Boolean individual = true;

        /**
         * Se é uma rescisão automática de vínculo temporário
         */
        public Boolean rescisaoAutomaticaVincTemp = false;

        /**
         * Se deve descontar faltas sobre as férias na rescisão. Conforma parametrização
         */
        public Boolean descontarFaltasSobreFerias = true;

        /**
         * Soma os valores totais do cálculo para um tipo de evento passado no argumento
         * @param TipoEvento
         * @return O valor total da soma dos eventos do tipo informado
         */
        public BigDecimal soma(Enum TipoEvento);
    }

/**
 * Funções utilitárias de números
 */
    interface Numeros {
        /**
         * Calcula o valor absoluto de um número.
         * @param valor
         * @return retorna um valor positivo (absoluto)
         */
        BigDecimal absoluto(BigDecimal valor);

        /**
         *
         * @param Arredonda um valor.
         * @param casasDecimais
         * @return retorna um valor arredondado conforme as casas decimais
         */
        Double arredonda(BigDecimal valor, Integer casasDecimais);

        /**
         * Calcula o co-seno de um ângulo.
         * @param valor
         * @return
         */
        BigDecimal coseno(BigDecimal valor);

        /**
         * Verifica se um texto é um número válido.
         * @param texto
         * @return
         */
        Boolean ehNumero(String texto);

        /**
         * Obtem o exponencial de um número específico.
         * @param numero
         * @return
         */
        BigDecimal exponencial(Double numero);

        /**
         * Obtem o fatorial de um número.
         * @param numero
         * @return
         */
        BigDecimal fatorial(Double numero);

        /**
         * Informa o logaritmo natural de um número.
         * @param valor
         * @return
         */
        BigDecimal logaritmo(BigDecimal valor);

        /**
         * Informa logaritmo de base 10 de um número.
         * @param valor
         * @return
         */
        BigDecimal logaritmo10(BigDecimal valor);

        /**
         * Obtem o maior valor entre dois números.
         * @param valor1
         * @param valor2
         * @return
         */
        BigDecimal maximo(BigDecimal valor1, BigDecimal valor2);

        /**
         * Obtem o menor valor entre dois números.
         * @param valor1
         * @param valor2
         * @return
         */
        BigDecimal minimo(BigDecimal valor1, BigDecimal valor2);

        /**
         * Converte um texto(de um número válido) para um valor numérico
         * @param texto
         * @return
         */
        BigDecimal numero(String texto);

        /**
         * Multiplica o valor de PI pelo número especificado.
         * @param valorMultiplicar
         * @return
         */
        BigDecimal pi(BigDecimal valorMultiplicar);

        /**
         * Obtem o maior número que é menor ou igual ao número espedificado, sendo este número inteiro.
         * @param valor
         * @return
         */
        BigDecimal piso(BigDecimal valor);


        /**
         * Calcula a potência
         * @param valor1
         * @param valor2
         * @return
         */
        BigDecimal potencia(BigDecimal valor1, BigDecimal valor2);

        /**
         * Calcula a raiz quadrada de um número.
         * @param valor
         * @return
         */
        BigDecimal raiz(BigDecimal valor);

        /**
         * Obtem um número aleatório entre 1 a um valor limite especificado.
         * @param numeroDelimitador
         * @return
         */
        BigDecimal randomico(BigDecimal numeroDelimitador);

        /**
         * Retorna o resto da divisão realizada entre o dividendo e o divisor, que são passados porparâmetro.
         * @param valorDividendo
         * @param valorDivisor
         * @return
         */
        BigDecimal resto(BigDecimal valorDividendo, BigDecimal valorDivisor);

        /**
         * Calcula o seno de um ângulo.
         * @param valor
         * @return
         */
        BigDecimal seno(BigDecimal valor);

        /**
         * Testa os valores passados como parâmetro e retorna o primeiro diferente de zero.
         * @param valor1
         * @param valor2
         * @param valorN
         * @return retorna o primeiro diferente de zero
         */
        BigDecimal seZero(BigDecimal valor1, BigDecimal valor2, List[] valorN);

        /**
         * Calcula a tangente de um ângulo.
         * @param valor
         * @return
         */
        BigDecimal tangente(BigDecimal valor);

        /**
         * Obtem o menor número que é maior ou igual ao número espedificado, sendo este número inteiro.
         * @param valor
         * @return
         */
        BigDecimal teto(BigDecimal valor);

        /**
         * Trunca um valor de acordo com o número de casas decimais especificadas.
         * @param valor
         * @param casasDecimais
         * @return
         */
        Double trunca(BigDecimal valor, Integer casasDecimais);
    }


/**
 * Busca as folhas de um tipo de processamento passado por argumento, da folha interna e da folha atual
 */
    interface folhasPeriodo {
        /**
         * Busca as folhas da competência atual de outro tipo de processamento. Não retorna a folha que esta sendo calculada
         * @param TipoProcessamento
         * @return retorna folhas de pagamento
         */
        List<folha> buscaFolhasProcessamento(Enum TipoProcessamento);

        /**
         * Busca dados da folha atual, deve ser usado marcando o evento para calcular por último caso queira buscar valores totalizados
         * @return retorna folhas de pagamento
         */
        List<folha> buscaFolhas();

        /**
         * Busca dados das folhas internas de férias da mesma competência
         * @param TipoProcessamento
         * @return retorna as folhas internas (folhaPagamento = false)
         */
        List<folha> buscaFolhasInternas(Enum TipoProcessamento);


    }

/**
 * Esta função permite buscar valores de eventos do cálculo atual ou de folhas calculadas
 */
    interface Eventos {
        /**
         * Busca o valor do evento informado na folha atual
         * @param codigo
         * @return valor calculado do evento
         */
        BigDecimal valor(Integer codigo);

        /**
         * Busca a referência do evento informado na folha atual
         * @param codigo
         * @return valor referência do evento
         */
        BigDecimal valorReferencia(Integer codigo);

        /**
         * Busca o valor do evento informado, de refência ou calculado, conforme os argumentos informados
         * @param codigo
         * @param TipoValor
         * @param TipoProcessamento
         * @param SubTipoProcessamento
         * @param competencia
         * @param TipoRegime
         * @return
         */
        BigDecimal valorCalculado(Integer codigo, Enum TipoValor, Enum TipoProcessamento, Enum SubTipoProcessamento, Enum competencia, Enum TipoRegime);

        /**
         * Busca o valor do evento informado, de refência ou calculado, conforme os argumentos informados em qualquer competência para regime de competência
         * @param codigo
         * @param TipoValor
         * @param TipoProcessamento
         * @param SubTipoProcessamento
         * @param competencia
         * @return
         */
        BigDecimal valorCalculado(Integer codigo, Enum TipoValor, Enum TipoProcessamento, Enum SubTipoProcessamento, Enum competencia);

        /**
         * Busca o valor do evento informado, de refência ou calculado, conforme os argumentos informados na competência atual
         * @param codigo
         * @param TipoValor
         * @param TipoProcessamento
         * @param SubTipoProcessamento
         * @return
         */
        BigDecimal valorCalculado(Integer codigo, Enum TipoValor, Enum TipoProcessamento, Enum SubTipoProcessamento);

    }


/**
 * Funções utilitárias de datas
 */
    interface Datas {
        /**
         * Adiciona dias a partir de uma data informada
         * @param data
         * @param quantidadedeDias
         * @return
         */
        Date adicionaDias(Date data, Integer quantidadedeDias);

        /**
         * Adiciona horas a partir de uma data informada
         * @param data
         * @param quantidadeHoras
         * @return
         */
        Date adicionaHoras(Date data, Integer quantidadeHoras);

        /**
         * Adiciona meses a partir de uma data informada
         * @param data
         * @param quantidadeMeses
         * @return
         */
        Date adicionaMeses(Date data, Integer quantidadeMeses);

        /**
         * Adiciona minutos a partir de uma data informada
         * @param data
         * @param quantidadeMinutos
         * @return
         */
        Date adicionaMinutos(Date data, Integer quantidadeMinutos);

        /**
         * Adiciona segundos a partir de uma data informada
         * @param data
         * @param quantidadeSegundos
         * @return
         */
        Date adicionaSegundos(Date data, Integer quantidadeSegundos);

        /**
         * Retorna o ano de uma data informada
         * @param data
         * @return
         */
        Date ano(Date data);

        /**
         * Permite compor uma data informando ano, mês e dia
         * @param ano
         * @param mes
         * @param dia
         * @return uma data
         */
        Date data(Integer ano, Integer mes, Integer dia);

        /**
         * Permite compor uma data hora informando ano, mês, dia, hora e minuto
         * @param ano
         * @param mes
         * @param dia
         * @param hora
         * @param minuto
         * @return uma data e hora
         */
        Date dataHora(Integer ano, Integer mes, Integer dia, Integer hora, Integer minuto);

        /**
         * Retorna o dia de uma data informada
         * @param data
         * @return
         */
        Date dia(Date data);

        /**
         * Retorna o dia da semana de uma data informada
         * @param data
         * @return
         */
        Date diaSemana(Date data);

        /**
         * Calcula a diferença de anos entre duas datas
         * @param menorData
         * @param maiorData
         * @return a quantidade de anos
         */
        Date diferencaAnos(Date menorData, Date maiorData);

        /**
         * Calcula a diferença de dias entre duas datas
         * @param menorData
         * @param maiorData
         * @return a quantidade de dias
         */
        Date diferencaDias(Date menorData, Date maiorData);

        /**
         * Calcula a diferença de horas entre duas datas
         * @param menorData
         * @param maiorData
         * @return a quantidade de horas
         */
        Date diferencaHoras(Date menorData, Date maiorData);

        /**
         * Calcula a diferença de meses entre duas datas
         * @param menorData
         * @param maiorData
         * @return a quantidade de meses
         */
        Date diferencaMeses(Date menorData, Date maiorData);

        /**
         * Calcula a diferença de minutos entre duas datas
         * @param menorData
         * @param maiorData
         * @return a quantidade de minutos
         */
        Date diferencaMinutos(Date menorData, Date maiorData);

        /**
         * Calcula a diferença de segundos entre duas datas
         * @param menorData
         * @param maiorData
         * @return a quantidade de segundos
         */
        Date diferencaSegundos(Date menorData, Date maiorData);

        /**
         * Verifica se um texto é uma data
         * @param texto
         * @return verdadeiro ou falso (true or false)
         */
        Date ehData(String texto);

        /**
         * Retorna o texto por extenso de uma data
         * @param data
         * @return uma data por extenso
         */
        Date extenso(Date data);

        /**
         * Retorna a data atual
         * @return
         */
        Date hoje();

        /**
         * Retorna a hora atual
         * @param data
         * @return
         */
        Date hora(Date data);

        /**
         * Retorna o mês de uma data
         * @param data
         * @return mês do ano
         */
        Date mes(Date data);

        /**
         * Retorno o minuto de uma data hora
         * @param data
         * @return
         */
        Date minuto(Date data);

        /**
         * Retorna o nome do dia da semana
         * @param data
         * @return nome do dia da semana
         */
        Date nomeDiaSemana(Date data);

        /**
         * Retorna o nome do mês
         * @param data
         * @return nome do mês
         */
        Date nomeMes(Date data);

        /**
         * Retorna um período
         * @param dataInicial
         * @param dataFinal
         * @return
         */
        Date periodo(Date dataInicial, Date dataFinal);

        /**
         * Remove uma quantidade de dias de uma data
         * @param data
         * @param quantidadedeDias
         * @return uma data
         */
        Date removeDias(Date data, Integer quantidadedeDias);

        /**
         * Remove uma quantidade de meses de uma data
         * @param data
         * @param quantidadeMeses
         * @return uma data
         */
        Date removeMeses(Date data, Integer quantidadeMeses);

        /**
         * Retorna os segundos de uma data hora
         * @param data
         * @return segundos
         */
        Date segundo(Date data);

        /**
         * Formata uma data passada por argumento conforme o formato informado
         * @param data
         * @param formato (ex: 'yyyy-MM-dd', 'MM/yyyy', 'EEEE' )
         * @return retorna uma data formatada (string)
         */
        Date formatar(Date data, String formato);
    }

/**
 * Busca dos de períodos aquisitivos de férias
 */
    interface PeriodosAquisitivos {
        /**
         * Busca todos os períodos com saldo
         * @return retorna uma lista de períodos aquisitivos
         */
        List<periodoAquisitivo> buscaPeriodosComSaldo();

        /**
         * Busca todos os períodos vencidos
         * @return retorna uma lista de períodos aquisitivos
         */
        List<periodoAquisitivo> buscaVencidos();

        /**
         * Busca o período proporcional de férias (que esta em andamento na rescisão)
         * @return retorna um período aquisitivo
         */
        List<periodoAquisitivo> buscaProporcional();

        /**
         * Informa os período que esta sendo quitado e o valor pago no evento
         * @param periodo
         * @param valorCalculado
         * @return
         */
        def quitaPorRescisao(Object periodo, BigDecimal valorCalculado)
    }

/**
 * Retorna o período aquisitivo de décimo terceiro salário
 */
    interface periodoAquisitivoDecimoTerceiro {
        /**
         * Avos aquiridos de décimo terceiro salário
         */
        Integer avosAdquiridos = 12;

        /**
         * Avos para fgts adquiridos de décimo terceiro salário
         */
        Integer avosAdquiridosFgts = 12;

        /**
         * Avos perdidos de décimo terceiro salário
         */
        Integer avosPerdidos = 0;

        /**
         * Avos de direito de décimo terceiro salário.
         * São os avos totais que podem ser adquiridos quando não houver perda
         */
        Integer avosDireito = 12;

        /**
         * As movimentações de pagamento do período aquisitivo
         */
        List<movimentacaoPagamentoPeriodoAquisitivo> movimentacoes = movimentacaoPagamentoPeriodoAquisitivo;

        /**
         * Ano de exercício do período aquisitivo de décimo terceiro salário
         */
        Integer anoExercicio = 2019;

        /**
         * Situação do período aquisitivo de décimo terceiro salário
         */
        Enum situacao = SituacaoPeriodoAquisitivoDecimoTerceiro.EM_ANDAMENTO;

        /**
         * A data final do período aquisitivo de décimo terceiro salário
         */
        Date dataFinal = new Date();

        /**
         * A data inicial do período aquisitivo de décimo terceiro salário
         */
        Date dataInicial = new Date();

        /**
         * O valor total das movimentações do período aquisitivo de décimo terceiro salário
         * @return retorna o valor total de movimentação
         */
        BigDecimal totalMovimentacoes = BigDecimal.valueOf(2000);

        /**
         * O valor total das movimentações do período aquisitivo de décimo terceiro salário conforme o motivo de movimentação informado
         * @param motivo
         * @return retorna o valor total de movimentação por motivo
         */
        BigDecimal totalMovimentacoesByMotivo(Enum motivo);

        /**
         * As movimentações do período aquisitivo de décimo terceiro salário conforme o motivo de movimentação informado
         * @param motivo
         * @return retorna uma lista de movimentações
         */
        List<movimentacaoPagamentoPeriodoAquisitivo> movimentacoesByMotivo(Enum motivo);

        /**
         * Retorna as movimentações do período aquisitivo de décimo terceiro salário
         */
        interface movimentacaoPagamentoPeriodoAquisitivo {
            /**
             * Competência da movimentação
             */
            Date competencia;

            /**
             * Se na movimentação foi marcado o parâmetro considera avos perdidos
             */
            Boolean consideraAvosPerdidos = true;

            /**
             * O valor da movimentação
             */
            BigDecimal valor = BigDecimal.valueOf(2000);

            /**
             * O motivo da movimentação
             */
            Enum motivo = motivoMovimentacaoPeriodoAquisitivoDecimoTerceiro.ADIANTAMENTO_DECIMO_TERCEIRO

            /**
             * Motivos de movimentação de décimo terceiro salário
             */
            enum motivoMovimentacaoPeriodoAquisitivoDecimoTerceiro {
                ADIANTAMENTO_DECIMO_TERCEIRO
            }
        }

    }


/**
 * Retorna dados da concessão das férias que esta sendo calculada
 */
    class periodoConcessao {
        /**
         * Dias de gozo
         * @return Os dias totais de gozo de férias
         */
        private static Integer diasGozo = 30;

        /**
         * Dias de falta
         * @return Os dias totais de falta do período
         */
        private static Integer diasFalta = 0;

        /**
         * Data de pagamento das férias
         */
        private static Date dataPagamento = new Date(2019, 10, 1);

        /**
         * Data final do gozo de férias
         */
        private static Date dataFimGozo = new Date(2019, 10, 30);

        /**
         * Dias de abono
         */
        private static Integer diasAbono = 0;

        /**
         * Data inicial do gozo de férias
         */
        private static Date dataInicioGozo = new Date();
    }

/**
 * Informações do período aquisitivo de férias
 */
    class periodoAquisitivo {
        /**
         * Retorna as informações da configuração de férias
         */
        public configuracaoFerias = new Object(configuracaoFerias)

        /**
         * Situação do período aquisitivo de férias
         */
        private static Enum situacao = SituacaoPeriodoAquisitivo.EM_ANDAMENTO;

        /**
         * Data final do período aquisitivo de férias
         */
        private static Date dataFinal = new Date(2019, 1, 1);

        /**
         * Data inicial do período aquisitivo de férias
         */
        private static Date dataInicial = new Date(2019, 12, 31);

        /**
         * Saldo de dias de férias
         * @return retorna os dias de saldo de férias
         */
        private static Integer saldo = 30;

        /**
         * Quantidade total de faltas do período aquisitivo de férias
         */
        private static Integer faltas = 0;

        /**
         * Quantidade de faltas brutas do período aquisitivo de férias
         */
        private static Integer faltasBrutas = 0;

        /**
         * Quantidade de faltas enquadradas do período aquisitivo de férias
         */
        private static Integer faltasEnquadradas = 0;

        /**
         * Quantidade de dias adquiridos do período aquisitivo de férias
         */
        private static Integer diasAdquiridos = 30;

        /**
         * Quantidade de dias cancelados do período aquisitivo de férias
         */
        private static Integer cancelados = 0;

        /**
         * Quantidade de dias suspensos do período aquisitivo de férias
         */
        private static Integer suspensos = 0;

        /**
         * Dias de férias pagos na rescisão
         */
        private static Integer diasFeriasPagosRescisao = 0;

        /**
         * Se pagou um terço de férias integral no cálculo de outra férias referente a este período aquisitivo
         */
        private static Boolean pagouUmTercoIntegral = false;

        /**
         * Se este período foi pago na rescisão
         */
        private static Boolean pagoRescisao = false;

        /**
         * Valor referência pago em rescisão
         */
        private static BigDecimal valorReferenciaPago;

        /**
         * Valor calculado pago em rescisão
         */
        private static BigDecimal valorCalculadoPago;

        /**
         * Valor de média e vantagem pago em rescisão
         */
        private static BigDecimal valorCalculadoPagoMediaVantagem;


        /**
         * Configuração de férias
         */
        class configuracaoFerias {
            /**
             * Dias para adquirir no período
             */
            private static Integer diasParaAdquirirNoPeriodo = 30;

            /**
             * Meses para aquisição
             */
            private static Integer mesesParaAquisicao = 12;

            /**
             * Meses para concessão
             */
            private static Integer mesesParaConcessao = 12;

            /**
             * Dias máximo para abono
             */
            private static Integer diasAbono = 10;
        }


    }


/**
 * Método de busca de períodos de décimo terceiro salário
 */
    public class PeriodosAquisitivosDecimoTerceiro {
        /**
         * Busca os períodos aquisitivos da matrícula conforme a situação passada por parâmetros
         * @param SituacaoPeriodoAquisitivoDecimoTerceiro
         * @return uma lista de períodos aquisitivos de décimo terceiro salário
         */
        private Object buscaPeriodosAquisitivosBySituacao(Enum SituacaoPeriodoAquisitivoDecimoTerceiro) {
            return periodoAquisitivoDecimoTerceiro
        }

        /**
         * Busca todos os períodos aquisitivos da matrícula
         * @param SituacaoPeriodoAquisitivoDecimoTerceiro
         * @return uma lista de períodos aquisitivos de décimo terceiro salário
         */
        private Object buscaPeriodosAquisitivos() {
            return periodoAquisitivoDecimoTerceiro
        }

        /**
         * Permite compor o valor de pagamento do período aquisitivo de décimo terceiro salário
         * @param SituacaoPeriodoAquisitivoDecimoTerceiro
         * @param Valor Calculado
         * @return uma lista de períodos aquisitivos de décimo terceiro salário
         */
        public static compoePagamento(Object periodoAquisitivoDecimoTerceiro, BigDecimal valor) {
            return;
        }
    }

/**
 * Este método permite buscar informações das configurações de manutenção de estabelecimento sobre encargos sociais
 */
    interface EncargosSociais {
        /**
         * O valor do teto salarial da entidade
         */
        BigDecimal tetoSalarial = BigDecimal.valueOf(15000);

        /**
         * O valor do piso salarial da entidade
         */
        BigDecimal pisoSalarial = BigDecimal.valueOf(1000);

        /**
         * O valor do salário mínimo
         */
        BigDecimal salarioMinimo = BigDecimal.valueOf(999);

        /**
         * O início da vigência da configuração de manutenção de estabelecimento vigente
         */
        Date inicioVigencia = new Date();

        /**
         * Retorna dados do RPPS
         */
        List<RPPS> RPPS;

        /**
         * Retorna dados do RGPS
         */
        List<RGPS> RGPS;

        /**
         * Retorna dados do IRRF
         */
        List<IRRF> IRRF;

        /**
         * Retorna dados do FGTS
         */
        List<FGTS> FGTS;

        /**
         * Retorna dados das configurações de salário família
         */
        List<SalarioFamilia> SalarioFamilia;


    }

/**
 * Dados de IRRF da configuração de manutenção de estabelecimento vigente
 */
    interface IRRF {
        /**
         * Busca a faixa de contribuição de IRRF conforme um valor passado por parâmetro, retorna o valor conforme a coluna do argumento 2 ;
         * @param base
         * @param coluna
         * @return retorna o valor conforme a coluna do argumento 2 ;
         */
        BigDecimal buscaContribuicao(BigDecimal base, Integer coluna);

        /**
         * Busca a maior faixa de contribuição de IRRF. Retorna o valor conforme a coluna do argumento 2 ;
         * @param coluna
         * @return retorna o valor conforme a coluna do argumento coluna ;
         */
        BigDecimal buscaMaior(Integer coluna);

        /**
         * Retorna o valor da parcela isenta de aposentadoria, ou seja, a primeira faixa de IRRF.
         */
        BigDecimal parcelaIsentaAposentadoria = BigDecimal.valueOf(0);

        /**
         * Valor mínio de IRRF. Serve para verificar se o valor de imposto é menor que o valor mínimo para não reter na fonte.
         */
        BigDecimal minimoIrrfDarf = BigDecimal.valueOf(10);

        /**
         * O valor de desconto por dependente na base de IRRF.
         */
        BigDecimal deducaoPorDependente = BigDecimal.valueOf(189);
    }

/**
 * Dados de FGTS da configuração de manutenção de estabelecimento vigente
 */
    interface FGTS {
        /**
         * Percentual de multa do FGTS (manutenção de estabelecimentos > FGTS)
         */
        Long multaFgts = 40L; //Percentual

        /**
         * Código do FGTS da entidade (manutenção de estabelecimentos > FGTS)
         */
        String codigoFgts = '123456';
    }


/**
 * Dados do RGPS da configuração de manutenção de estabelecimento vigente
 */
    interface RGPS {
        /**
         * Busca a faixa de contribuição de RGPS conforme um valor passado por parâmetro, retorna o valor conforme a coluna do argumento 2 ;
         * @param base
         * @param coluna
         * @return retorna o valor conforme a coluna do argumento 2 ;
         */
        BigDecimal buscaContribuicao(BigDecimal base, Integer coluna);

        /**
         * Busca a maior faixa de contribuição de RGPS. Retorna o valor conforme a coluna do argumento 2 ;
         * @param coluna
         * @return retorna o valor conforme a coluna do argumento coluna ;
         */
        BigDecimal buscaMaior(Integer coluna);

        /**
         * Percentual de isenção da entidade filantrópica
         */
        BigDecimal percentualIsencaoFilantropia = 0; //Percentual

        /**
         * Percentual de terceiros
         */
        BigDecimal percentualTerceiros = 0; //Percentual

        /**
         * Código de terceiros
         */
        String codigoTerceiros = '12345';

        /**
         * Percentual do FAP da entidade
         */
        Long percentualFap = 0; //Percentual

        /**
         * Percentual do RAT da entidade
         */
        Long percentualGilRat = 0; //Percentual

        /**
         * CNAE preponderante
         */
        String cnaePreponderante = '123456';

        /**
         * Percentual de INSS empregador (patronal)
         */
        BigDecimal percentualInssEmpregador = 0; //Percentual

        /**
         * Código do FPAS
         */
        String codigoFpas = '12345';
    }

/**
 * Dados do RPPS da configuração de manutenção de estabelecimento vigente
 */
    interface RPPS {
        /**
         * Dados do fundo financeiro
         */
        interface FundoFinanceiro {
            /**
             * Busca a faixa de contribuição de Fundo Financeiro conforme um valor passado por parâmetro, retorna o valor conforme a coluna do argumento 2 ;
             * @param base
             * @param coluna
             * @return retorna o valor conforme a coluna do argumento 2 ;
             */
            BigDecimal buscaContribuicao(BigDecimal base, Integer coluna);

            /**
             * Busca a maior faixa de contribuição de Fundo Financeiro . Retorna o valor conforme a coluna do argumento 2 ;
             * @param coluna
             * @return retorna o valor conforme a coluna do argumento coluna ;
             */
            BigDecimal buscaMaior(Integer coluna);

            /**
             * Percentual da taxa administrativa
             */
            BigDecimal taxaAdministrativa = 0;

            /**
             * Percentual do aporte
             */
            BigDecimal indiceAporte = 0;

            /**
             * Mínimo para desconto do segurado
             */
            BigDecimal minimo = 0;

            /**
             * Máximo para desconto do segurado
             */
            BigDecimal maximo = BigDecimal.valueOf(999999)
        }

        /**
         * Dados da previdência própria
         */
        interface PrevidenciaPropria {
            /**
             * Busca a faixa de contribuição de previdência própria conforme um valor passado por parâmetro, retorna o valor conforme a coluna do argumento 2 ;
             * @param base
             * @param coluna
             * @return retorna o valor conforme a coluna do argumento 2 ;
             */
            BigDecimal buscaContribuicao(BigDecimal base, Integer coluna);

            /**
             * Busca a maior faixa de contribuição de previdência própria. Retorna o valor conforme a coluna do argumento 2 ;
             * @param coluna
             * @return retorna o valor conforme a coluna do argumento coluna ;
             */
            BigDecimal buscaMaior(Integer coluna);

            /**
             * Percentual da taxa administrativa
             */
            BigDecimal taxaAdministrativa = 0;

            /**
             * Percentual do aporte
             */
            BigDecimal indiceAporte = 0;

            /**
             * Mínimo para desconto do segurado
             */
            BigDecimal minimo = 0;

            /**
             * Máximo para desconto do segurado
             */
            BigDecimal maximo = BigDecimal.valueOf(999999)
        }

        /**
         * Dados da previdência estadual
         */
        interface PrevidenciaEstadual {
            /**
             * Busca a faixa de contribuição de previdência estadual conforme um valor passado por parâmetro, retorna o valor conforme a coluna do argumento 2 ;
             * @param base
             * @param coluna
             * @return retorna o valor conforme a coluna do argumento 2 ;
             */
            BigDecimal buscaContribuicao(BigDecimal base, Integer coluna);

            /**
             * Busca a maior faixa de contribuição de previdência estadual. Retorna o valor conforme a coluna do argumento 2 ;
             * @param coluna
             * @return retorna o valor conforme a coluna do argumento coluna ;
             */
            BigDecimal buscaMaior(Integer coluna);

            /**
             * Percentual da taxa administrativa
             */
            BigDecimal taxaAdministrativa = 0;

            /**
             * Percentual do aporte
             */
            BigDecimal indiceAporte = 0;

            /**
             * Mínimo para desconto do segurado
             */
            BigDecimal minimo = 0;

            /**
             * Máximo para desconto do segurado
             */
            BigDecimal maximo = BigDecimal.valueOf(999999)
        }

        /**
         * Dados do fundo de assistência
         */
        interface FundoAssistencia {
            /**
             * Busca a faixa de contribuição de fundo de assistência conforme um valor passado por parâmetro, retorna o valor conforme a coluna do argumento 2 ;
             * @param base
             * @param coluna
             * @return retorna o valor conforme a coluna do argumento 2 ;
             */
            BigDecimal buscaContribuicao(BigDecimal base, Integer coluna);

            /**
             * Busca a maior faixa de contribuição de fundo de assistência. Retorna o valor conforme a coluna do argumento 2 ;
             * @param coluna
             * @return retorna o valor conforme a coluna do argumento coluna ;
             */
            BigDecimal buscaMaior(Integer coluna);

            /**
             * Percentual da taxa administrativa
             */
            BigDecimal taxaAdministrativa = 0;

            /**
             * Percentual do aporte
             */
            BigDecimal indiceAporte = 0;

            /**
             * Mínimo para desconto do segurado
             */
            BigDecimal minimo = 0;

            /**
             * Máximo para desconto do segurado
             */
            BigDecimal maximo = BigDecimal.valueOf(999999)
        }
    }

/**
 * Permite buscar dados de salário família conforme configurado na manutenção de estabelecimento
 * Exemplo : EncargosSociais.SalarioFamilia.Celetista.buscaContribuicao(valorBase, 2)
 */
    interface SalarioFamilia {
        interface Celetista {
            /**
             * Busca a faixa de contribuição de salário família celetista conforme um valor passado por parâmetro, retorna o valor conforme a coluna do argumento 2 ;
             * @param base
             * @param coluna
             * @return retorna o valor conforme a coluna do argumento 2 ;
             */
            BigDecimal buscaContribuicao(BigDecimal base, Integer coluna);

            /**
             * Busca a maior faixa de contribuição de salário família celetista. Retorna o valor conforme a coluna do argumento 2 ;
             * @param coluna
             * @return retorna o valor conforme a coluna do argumento coluna ;
             */
            BigDecimal buscaMaior(Integer coluna);
        }

        interface Estatutario {
            /**
             * Busca a faixa de contribuição de salário família estatutário conforme um valor passado por parâmetro, retorna o valor conforme a coluna do argumento 2 ;
             * @param base
             * @param coluna
             * @return retorna o valor conforme a coluna do argumento 2 ;
             */
            BigDecimal buscaContribuicao(BigDecimal base, Integer coluna);

            /**
             * Busca a maior faixa de contribuição de salário família estatutário. Retorna o valor conforme a coluna do argumento 2 ;
             * @param coluna
             * @return retorna o valor conforme a coluna do argumento coluna ;
             */
            BigDecimal buscaMaior(Integer coluna);
        }

        interface Aposentado {
            /**
             * Busca a faixa de contribuição de salário família aposentado conforme um valor passado por parâmetro, retorna o valor conforme a coluna do argumento 2 ;
             * @param base
             * @param coluna
             * @return retorna o valor conforme a coluna do argumento 2 ;
             */
            BigDecimal buscaContribuicao(BigDecimal base, Integer coluna);

            /**
             * Busca a maior faixa de contribuição de salário família aposentado. Retorna o valor conforme a coluna do argumento 2 ;
             * @param coluna
             * @return retorna o valor conforme a coluna do argumento coluna ;
             */
            BigDecimal buscaMaior(Integer coluna);
        }

        interface Especial {
            /**
             * Busca a faixa de contribuição de salário família especial conforme um valor passado por parâmetro, retorna o valor conforme a coluna do argumento 2 ;
             * @param base
             * @param coluna
             * @return retorna o valor conforme a coluna do argumento 2 ;
             */
            BigDecimal buscaContribuicao(BigDecimal base, Integer coluna);

            /**
             * Busca a maior faixa de contribuição de salário família especial. Retorna o valor conforme a coluna do argumento 2 ;
             * @param coluna
             * @return retorna o valor conforme a coluna do argumento coluna ;
             */
            BigDecimal buscaMaior(Integer coluna);
        }
    }

//FUNCOES PARA FORMULAS


/**
 * Em funções teremos as funções criadas para auxiliar a construção das fórmulas de eventos
 * Use Funcoes.nome_da_funcao(argumentos (quando houver) )
 */
    interface Funcoes {

        /**
         * Se o funcionário paga pensão
         * @return verdadeiro ou falso
         */
        Boolean pagapensao();

        /**
         * Os meses trabalhados no ano da rescisão
         * @return um valor inteiro
         */
        Integer mesestrab();

        /**
         * Percentual sest de autônomos
         * @return
         */
        BigDecimal percsestautonomo();

        /**
         * Percentual senat de autônomos
         * @return
         */
        BigDecimal percsenatautonomo();

        /**
         * O valor total de pensão alimentícia
         * Obs : Usada apenas para conversão
         * @return um valor de pensão
         */
        BigDecimal totalPensaoAlimeticia();

        /**
         * Se matrícula passada por parâmetro possui previdência federal
         * @param TipoMatricula
         * @return verdadeiro ou falso
         */
        Boolean possuiPrevidenciaFederal(Enum TipoMatricula);

        /**
         * O valor líquido da folha atual, deve ser utilizada em evento que esteja marcado com a opção de calcular por último
         * @return
         */
        BigDecimal liquido();

        /**
         * Se já pagou décimo terceiro salário adiantado
         * @return
         */
        Boolean pagto13salad();

        /**
         * Salário da competência anterior ao do cálculo
         * @return valor do salário anterior
         */
        BigDecimal salcptant();

        /**
         * Se existe rescisão para a matrícula
         * @return verdadeiro ou falso
         */
        Boolean existerescisao();

        /**
         * Se deve descontar faltas no décimo terceiro na rescisão
         * @return verdadeiro ou falso
         */
        Boolean descfal13resc();

        /**
         * Data da reintegração
         * Pendente
         * @return a data de reintegração
         */
        Date dtreintegra();

        /**
         * Se rescisão mantem vínculo
         * @return
         */
        Boolean mantemvinc();

        /**
         * Retorna os adicionais adquiridos conforme o tipo
         * @param tipoAdicional
         */
        BigDecimal adicionais(Enum tipoAdicional);

        /**
         * Ocorrência sefip da matrícula
         * @return
         */
        Enum ocorrenciaSefip();

        /**
         * Se funcionário é conselheiro tutelar
         * @return verdadeiro ou falso
         */
        Boolean conselheirotutelar();

        /**
         * Se matrícula é optante de FGTS
         * @param TipoMatricula
         * @return verdadeiro ou falso
         */
        Boolean optanteFgts(Enum TipoMatricula);

        /**
         * O valor acumulado de uma evento em um determinado período e tipos de processamentos
         * @param codigoEvento - Código do evento
         * @param TipoValor - TipoValor.CALCULADO ou TipoValor.REFERENCIA
         * @param competenciaInicial - Competência inicial para busca
         * @param competenciaFinal - Competência final para busca
         * @param TipoProcessamentos - Lista de tipos de processamentos (MENSAL,MENSAL_ADIANTAMENTO,MENSAL_COMPLEMENTAR,FERIAS,DECIMO,DECIMO_ADIANTAMENTO,DECIMO_COMPLEMENTAR,RESCISAO,RESCISAO_COMPLEMENTAR )
         * @return retorna a soma dos valores do evento no período
         */
        BigDecimal acumula(Integer codigoEvento, Enum TipoValor, Date competenciaInicial, Date competenciaFinal, List<TipoProcessamento> TipoProcessamentos);

        /**
         * (PENDENTE) O valor acumulado de uma evento em um determinado período e tipos de processamentos por classificação do evento
         * @param ClassificacaoEvento
         * @return retorna a soma dos valores da classificação do evento no período
         */
        BigDecimal acumulaClassif(Enum ClassificacaoEvento);

        /**
         * Dias de afastamento na competência por aborto
         * @return quantidade de dias afastado
         */
        Integer afasaborto();

        /**
         * Dias de afastamento na competência por acidente de trabalho previdência
         * @return quantidade de dias afastado
         */
        Integer afasacidtrab();

        /**
         * Dias de afastamento na competência por acidente de trabalho empregador
         * @return quantidade de dias afastado
         */
        Integer afasacidtrabemp();

        /**
         * Dias de afastamento na competência por adoção
         * @return quantidade de dias afastado
         */
        Integer afasadocao();

        /**
         * Dias de afastamento na competência por auxílio doença previdência
         * @return quantidade de dias afastado
         */
        Integer afasauxdoenc();

        /**
         * Dias de afastamento na competência por auxílio doença empregador
         * @return quantidade de dias afastado
         */
        Integer afasauxdoencemp();

        /**
         * Dias de afastamento na competência por licença com vencimentos
         * @return quantidade de dias afastado
         */
        Integer afasdirinteg();

        /**
         * Dias de afastamento na competência por licença maternidade
         * @return quantidade de dias afastado
         */
        Integer afaslicmat();

        /**
         * Dias de afastamento na competência por licença sem vencimentos
         * @return quantidade de dias afastado
         */
        Integer afaslicsvenc();

        /**
         * Dias de afastamento na competência por prorrogação da licença maternidade
         * @return quantidade de dias afastado
         */
        Integer afasprorroglicmat();

        /**
         * Dias de afastamento na competência por prorrogação da licença maternidade (lei 11770)
         * @return quantidade de dias afastado
         */
        Integer afasprorroglicmatlei11770();

        /**
         * Dias de afastamento na competência por serviço militar
         * @return quantidade de dias afastado
         */
        Integer afasservmil();

        /**
         * Data inicio de período aquisitivo de férias. Usar somente para conversão folha desktop
         * @return quantidade de dias afastado
         */
        Integer aquisiniprop();

        /**
         * Retorna a quantidade de avos de décimo terceiro salário do ano exercício
         * @param mes - Mês de referência
         * @param calculoFGTS - Se é para cálculo de FGTS
         * @return a quantidade de avos
         */
        Integer avos13(Integer mes, Boolean calculoFGTS);

        /**
         * Retorna o enum do mês (JANEIRO, FEVEIRO ... )
         * @param mes - Número referênte ao mês
         * @return
         */
        String buscaMes(Integer mes);

        /**
         * Suspende o cálculo na tipo de processamento com menos dias conforme argumentos, retorna o dias de processamento da tipo de processamento com maior número de dias
         * Caso tenham mesma quantidade de dias será considerado o tipo de processamento do primeiro argumento
         * @param valorReferencia
         * @param tipoProcessamento1
         * @param diasProcessamento1
         * @param tipoProcessamento2
         * @param diasProcessamento2
         * @return retorna a quantidade de dias
         */
        BigDecimal calcexclusivo(BigDecimal valorReferencia, Enum<TipoProcessamento> tipoProcessamento1, Integer diasProcessamento1, Enum<TipoProcessamento> tipoProcessamento2, Integer diasProcessamento2);

        /**
         * Retorna o valor proporcional
         * @param valor
         * @param valorProporicional
         * @return
         */
        BigDecimal calcprop(BigDecimal valor, BigDecimal valorProporicional);

        /**
         * Dias de afastamento na competência por cedência com ônus
         * @return quantidade de dias afastado
         */
        Integer cedidocomonus();

        /**
         * Dias de afastamento na competência por cedência sem ônus
         * @return quantidade de dias afastado
         */
        Integer cedidosemonus();

        /**
         * Converte uma quantidade de dias passado por parâmetro para horas, caso a parâtrização do cálculo seja em horas, do contrário retorna a mesma quantidade de dias informados.
         * @param dias
         */
        BigDecimal cnvdpbase(Integer dias);

        /**
         * Converte uma quantidade de horas para dias considerando a carga horária mensal
         * @param horas
         * @return quantidade de dias
         */
        Integer cnvParaDias(BigDecimal horas);

        /**
         * Competência de início da férias (usar apenas para conversão)
         * @return
         */
        Date competenciaInicioFerias();

        /**
         * A configuração do organograma da matrícula
         */
        String configorgan();

        /**
         * Se matrícula conta vaga
         * @return verdadeiro ou falso
         */
        Boolean contavaga();

        /**
         * Se está configurado, no plano salarial, para controlar  automaticamente a carga horária do nível
         * @return verdadeiro ou falso
         */
        Boolean contrcargniv();

        /**
         * Competência do abono de férias
         * @return uma data
         */
        Date cptabono();

        /**
         * Retorna uma lista de itens ou chave e valor de itens passado no argumento lista
         * @param lista
         * @param tipo
         * @return
         */
        List criaMapa(String lista, Integer tipo);

        /**
         * (PENDENTE) Retorna o valor do campo adicional
         * @param nomeVariavelCampoAdicional
         */
        void dadosadic(String nomeVariavelCampoAdicional);

        /**
         * Retorna alguns dados da matrícula atual
         * Use Funcoes.dadosMatricula(matricula.tipo).dataInicio ou .dataSaida ou .existeSaida
         * @return retorna um objeto, use .dataInicio ou .dataSaida ou .existeSaida
         */
        List<getDados> dadosMatricula(Enum<TipoMatricula> TipoMatricula);

        /**
         * Retorna o valor de dedução de auxilio maternidade no décimo terceiro salário
         * @param base
         * @param avos
         * @return um valor de dedução
         */
        BigDecimal deducauxmat13(BigDecimal base, Integer avos);

        /**
         * Quantidade de dias afastado em um determinado período
         * @param dataInicial
         * @param dataFinal
         * @param ClassificacaoTipoAfastamento - Uma lista de classificações
         * @return quantidade de dias afastado
         */
        Integer diasafast(Date dataInicial, Date dataFinal, List<ClassificacaoTipoAfastamento> ClassificacaoTipoAfastamento);

        /**
         * Quantidade de dias afastado na competência
         * @param dataInicial
         * @param dataFinal
         * @param ClassificacaoTipoAfastamento - Uma lista de classificações
         * @return quantidade de dias afastado
         */
        Integer diasafastcalc30(Date competencia, List<ClassificacaoTipoAfastamento> ClassificacaoTipoAfastamento);

        /**
         * Quantidade de dias afastado na competência por uma determinada classificação
         * @param ClassificacaoTipoAfastamento
         * @param descricao
         * @return quantidade de dias afastado
         */
        Integer diasafastcalc30PorDescricao(Enum ClassificacaoTipoAfastamento, String descricao);

        /**
         * Dias de aposento na competência
         * @return quantidade de dias
         */
        Integer diasaposent();

        /**
         * (PENDENTE) Dias de atestado na competência
         * @return quantidade de dias
         */
        Integer diasatestado();

        /**
         * Dias de férias na competência
         * @return quantidade de dias de férias
         */
        Integer diasferias();

        /**
         * Dias trabalhados na competência
         * @return quantidade de dias trabalhados
         */
        Integer diastrab();

        /**
         * Data inicial do afastamento passado por argumento
         * @param ClassificacaoTipoAfastamento
         * @param licencaMaternidadeOriginal - Se deve considerar a licença maternidade original quando o afastamento é uma prorrogação
         * @return retorna a data de início de um afastamento
         */
        Date dtafast(Enum ClassificacaoTipoAfastamento, Boolean licencaMaternidadeOriginal);

        /**
         * Data da rescisão
         * @return uma data ou null
         */
        Date dtrescisao();

        /**
         * Se existe pagamento de décimo terceiro salário
         * @return verdadeiro ou falso
         */
        Boolean existePagamento13Salario();

        /**
         * Quantidade de quantidade de dependentes conforme o tipo de salário família
         * @return
         */
        Integer getDependenteSalarioFamilia(Enum<TipoSalarioFamilia> TipoSalarioFamilia);

        /**
         * Retorna no cálculo da mensal o valor de FGTS de férias proporcional a competência
         * @return um valor de FGTS
         */
        BigDecimal getfgtsFerias();

        /**
         * Retorna no cálculo da mensal o valor de um evento calculado nas férias
         * @param codigoEvento
         * @return um valor de evento de folha interna de férias
         */
        BigDecimal getFolhaFerias(Integer codigoEvento);

        /**
         * Retorna no cálculo da mensal o valor de INSS de férias proporcional a competência
         * @return um valor de INSS
         */
        BigDecimal getInssFerias();

        /**
         * Retorna no cálculo da mensal o valor de IRRF de férias proporcional a competência
         * @return um valor de IRRF
         */
        BigDecimal getIrrfFerias();

        /**
         * Retorna o valor de proventos, descontos e líquido de férias na competência da mensal
         * Use Funcoes.getTotalFerias() .liquido, .provento ou .desconto
         * @return .liquido, .provento e .desconto da folha de férias
         */
        BigDecimal getTotalFerias();

        /**
         * Retorna o total de uma evento na folha de férias da competência
         * @param codigoEvento
         * @param buscaFolhaPagamento - Caso não encontre na folha interna procurar na folha do recibo
         * @return o valor do evento calculado nas férias
         */
        BigDecimal getValorFerias(Integer codigoEvento, Boolean buscaFolhaPagamento);

        /**
         * Idade do servidor
         * @return idade atual
         */
        Integer idade();

        /**
         * Retorna uma lista de classificações de afastamentos (mapa) de uma string informada , se informado "T" no argumento retorna todas as classificações
         * @param ClassificacaoOuTipo
         * @return uma lista de classificação de afastamentos
         */
        List<ClassificacaoTipoAfastamento> listaafastamentos(Integer ClassificacaoOuTipo);

        /**
         * (PENDENTE) Local de trabalho da matrícula
         * @return
         */
        String locaistrabfunc();

        /**
         * Meses de licença maternidade no ano do décimo terceiro salário
         * @return
         */
        Integer mesesmat13();

        /**
         * Converte um valor para uma string
         * @param valor
         * @return uma string (texto)
         */
        String paraString(valor);

        /**
         * Se permite calcular décimo terceiro integral, caso já exista calculado retorna falso
         * @return verdadeiro ou falso
         */
        Boolean permitecalc13integral();

        /**
         * Se possui sindicado configurado na matrícula
         * @return verdadeiro ou falso
         */
        Boolean possuiContribuicaoSindical();

        /**
         * Se matrícula recebe décimo terceiro salário
         * @return verdadeiro ou falso
         */
        Boolean recebeDecimoTerceiro();

        /**
         * Quantidade de dias recebido com ônus na competência
         * @return
         */
        Integer recebidosemonus();

        /**
         * Dados de remuneração da matrículas
         * Use Funcoes.remuneracao(matricula.tipo).valor .unidade .quantidadeHorasMes
         * @param TipoMatricula
         * @return .valor .unidade .quantidadeHorasMes
         */
        List<getRemuneracao> remuneracao(Enum<TipoMatricula> TipoMatricula);

        /**
         * Retorna o salário conforme o tipo de matrícula
         * @param TipoMatricula
         * @return
         */
        BigDecimal salario(Enum TipoMatricula);

        /**
         * Suspende cálculo do evento caso seja diferente de funcionário. Essa função não possui retorno.
         */
        void somenteFuncionarios();

        /**
         * (PENDENTE) Tipo de rescisão
         * @return
         */
        String tipoRescisao();

        /**
         * Retorna uma mapa da tipos de processamentos
         * Essa função auxilia na criação de outras funções que recebem o tipo de processamento em forma de string
         * @return uma mapa de tipos de processamentos
         */
        List<TipoProcessamento> tiposProcessamentosEnum();

        /**
         * Retorna a quantida de faltas conforme argumentos
         * @param justificada - Se deve retornar faltas justificadas, não justificadas ou todas
         * @param dataCompetenciaInicial - Competência ou data inicial das faltas
         * @param dataCompetenciaFinal - Competência ou data final das faltas
         * @param motivo - Motivo da falta (descrição)
         * @param abonada - Se deve retornar faltas abonadas, não abonadas ou todas
         * @return retorna uma quantidade de faltas
         */
        BigDecimal faltas(Boolean justificada, Date dataCompetenciaInicial, Date dataCompetenciaFinal, String motivo, Boolean abonada);


    }

/**
 * Use dadosMatricula.dataInicio, dadosMatricula.dataSaida e dadosMatricula.existe saída
 * para obter as informações de qualquer tipo de matrícula
 */
    public class getDados {
        /**
         * Data de início da matrícula
         */
        public Date dataInicio = funcionario.dataAdmissao;
        /**
         * Data de saída da matrícula
         */
        private static Date dataSaida = null;
        /**
         * Indicativo da existência de uma data de saída da matrícula
         */
        private static Boolean existeSaida = false;
    }

    public class getRemuneracao {
        /**
         * valor da remuneração da matrícula
         */
        private static BigDecimal valor = BigDecimal.valueOf(1500.99)
        /**
         * Unidade de pagamento da matrícula da matrícula.
         * Quando não existir retorna MENSALISTA
         */
        private static Enum unidade = UnidadePagamento.MENSALISTA;
        /**
         * Quantidade de horas mês da matrícula
         */
        private static BigDecimal quantidadeHorasMes = BigDecimal.valueOf(200);
    }


}