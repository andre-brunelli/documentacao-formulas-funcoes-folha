import java.time.LocalDateTime

/**
 * Enum de ocorrências sefip
 */
enum OcorrenciaSefip {
    NUNCA_EXPOSTO_AGENTES_NOCIVOS(1, "Nunca teve exposto a agentes nocivos"),
    EXPOSTO_ALGUMA_VEZ(2, "Trabalhador já teve exposto alguma vez"),
    EXPOSTO_APOSENTADORIA_15_ANOS(3, "Exposto a agentes nocivos - aposentadoria 15 anos"),
    EXPOSTO_APOSENTADORIA_20_ANOS(4, "Exposto a agentes nocivos - aposentadoria 20 anos"),
    EXPOSTO_APOSENTADORIA_25_ANOS(5, "Exposto a agentes nocivos - aposentadoria 25 anos");
}

/**
 * Por meio da função bases é possível buscar e compor valores de bases de cálculo .
 * Para informar uma base use 'Bases.ABREVIATURA' use control + espaço para mostrar todas
 */
interface Bases {
    /**
     * Busca o valor de uma base passada por argumento do cálculo atual
     * @return Um valor numérico
     */
    BigDecimal valor();
    /**
     * Busca o valor de uma base de uma competência e processamento passado por argumento, não retorna dados do cálculo atual
     * @return Um valor numérico
     */
    BigDecimal valorCalculado(Enum base, Enum<TipoProcessamento> tipoProcessamento, subTipoProcessamento, competencia, tipoRegime);
    /**
     * Compõe bases do valor passado no primeiro argumento para as bases informadas nos demais argumentos.
     */
    void compor();
    /**
     * 1, "Paga Proporcional"
     */
    Enum PAGAPROP;
    /**
     * 2, "Salário Base"
     */
    Enum SALBASE;
    /**
     * 3, "Horas Extras"
     */
    Enum HORAEXTRA;
    /**
     * 4, "Periculosidade"
     */
    Enum PERIC;
    /**
     * 5, "Sindicato"
     */
    Enum SIND;
    /**
     * 6, "F.g.t.s."
     */
    Enum FGTS;
    /**
     * 7, "F.g.t.s. 13º Salário"
     */
    Enum FGTS13;
    /**
     * 8, "I.r.r.f."
     */
    Enum IRRF;
    /**
     * 9, "I.r.r.f. 13º Salário"
     */
    Enum IRRF13;
    /**
     * 10, "I.r.r.f. Férias Rescisão"
     */
    Enum IRRFFERRESC;
    /**
     * 11, "I.n.s.s."
     */
    Enum INSS;
    /**
     * 12, "I.n.s.s. 13º Salário"
     */
    Enum INSS13;
    /**
     * 13, "Prev. Estadual"
     */
    Enum PREVEST;
    /**
     * 14, "Prev. Estadual 13º Salário"
     */
    Enum PREVEST13;
    /**
     * 15, "Fundo Assistência"
     */
    Enum FUNDASS;
    /**
     * 16, "Fundo Assistência 13º Salário"
     */
    Enum FUNDASS13;
    /**
     * 17, "Fundo Previdência"
     */
    Enum FUNDOPREV;
    /**
     * 18, "Fundo Previdência 13º Salário"
     */
    Enum FUNDPREV13;
    /**
     * 19, "Outras Bases"
     */
    Enum OUTRASBASES;
    /**
     * 20, "F.g.t.s. Aviso Prévio"
     */
    Enum FGTSAVISO;
    /**
     * 21, "Abatimento I.r.r.f."
     */
    Enum ABATIRRF;
    /**
     * 22, "Abatimento I.r.r.f. 13º Sal."
     */
    Enum ABATIRRF13;
    /**
     * 23, "Desconto I.r.r.f."
     */
    Enum DESCIRRF;
    /**
     * 24, "Desconto I.r.r.f. 13º Salário"
     */
    Enum DESCIRRF13;
    /**
     * 25, "Desconto I.r.r.f. Férias Resc."
     */
    Enum DESCIRRFERES;
    /**
     * 26, "Excedente I.n.s.s."
     */
    Enum EXCEINSS;
    /**
     * 27, "Excedente I.n.s.s. 13º Salário"
     */
    Enum EXCEINSS13;
    /**
     * 28, "Abatimento I.n.s.s."
     */
    Enum ABATINSS;
    /**
     * 29, "Desconto 1/3 De Férias"
     */
    Enum DESCTERFER;
    /**
     * 30, "Salário Família Normal"
     */
    Enum SALAFAM;
    /**
     * 31, "I.n.s.s. Outras Empresas"
     */
    Enum INSSOUTRA;
    /**
     * 32, "I.n.s.s. Outras Emp. 13º Sal"
     */
    Enum INSSOUTRA13;
    /**
     * 33, "I.r.r.f. Outras Empresas"
     */
    Enum IRRFOUTRA;
    /**
     * 34, "I.r.r.f. Outras Emp. 13º Sal"
     */
    Enum IRRFOUTRA13;
    /**
     * 35, "I.r.r.f. Férias"
     */
    Enum IRRFFER;
    /**
     * 36, "Contrib. Sindical Anual"
     */
    Enum CONTSIND;
    /**
     * 37, "Média Auxílio Maternidade"
     */
    Enum MEDIAUXMAT;
    /**
     * 38, "Desc. 13º Salário Reintegração"
     */
    Enum DESC13REINT;
    /**
     * 39, "Compõem Horas"
     */
    Enum COMPHORAMES;
    /**
     * 40, "1/3 Férias Vencidas Resc."
     */
    Enum TERFERVENRES;
    /**
     * 201, "Fundo Financeiro"
     */
    Enum FUNDFIN;
    /**
     * 202, "Fundo Financeiro 13º Salário"
     */
    Enum FUNDFIN13;
    /**
     * 203, "Média Auxílio Maternidade Proporcional"
     */
    Enum MEDAUXMATPR;
    /**
     * 204, "I.n.s.s. 13º Salário Distorção"
     */
    Enum IN13SADI;
    /**
     * 205, "Fundo Previdência 13º Salário Provisão"
     */
    Enum FUPR13SAPR;
    /**
     * 206, "Fundo Previdência 13º Salário Ajuste Provisão"
     */
    Enum FUPR13SAAJPR;
    /**
     * 207, "Fundo Previdência 13º Salário Estorno Provisão"
     */
    Enum FUPR13SAESPR;
    /**
     * 208, "Fundo Previdência 13º Salário Distorção"
     */
    Enum FUPR13SADI;
    /**
     * 209, "Prev. Estadual 13º Salário Provisão"
     */
    Enum PRES13SAPR;
    /**
     * 210, "Prev. Estadual 13º Salário Ajuste Provisão"
     */
    Enum PRES13SAAJPR;
    /**
     * 211, "Prev. Estadual 13º Salário Estorno Provisão"
     */
    Enum PRES13SAESPR;
    /**
     * 212, "Prev. Estadual 13º Salário Distorção"
     */
    Enum PRES13SADI;
    /**
     * 213, "Fundo Assistência 13º Salário Provisão"
     */
    Enum FUAS13SAPR;
    /**
     * 214, "Fundo Assistência 13º Salário Ajuste Provisão"
     */
    Enum FUAS13SAAJPR;
    /**
     * 215, "Fundo Assistência 13º Salário Estorno Provisão"
     */
    Enum FUAS13SAESPR;
    /**
     * 216, "Fundo Assistência 13º Salário Distorção"
     */
    Enum FUAS13SADI;
    /**
     * 217, "F.g.t.s. 13º Salário Provisão"
     */
    Enum FG13SAPR;
    /**
     * 218, "F.g.t.s. 13º Salário Ajuste Provisão"
     */
    Enum FG13SAAJPR;
    /**
     * 219, "F.g.t.s. 13º Salário Estorno Provisão"
     */
    Enum FG13SAESPR;
    /**
     * 221, "I.n.s.s. Férias Provisão"
     */
    Enum INFEPR;
    /**
     * 222, "I.n.s.s. Férias Ajuste Provisão"
     */
    Enum INFEAJPR;
    /**
     * 223, "I.n.s.s. Férias Estorno Provisão"
     */
    Enum INFEESPR;
    /**
     * 224, "I.n.s.s. Férias Distorção"
     */
    Enum INFEDI;
    /**
     * 225, "Fundo Previdência Férias Provisão"
     */
    Enum FUPRFEPR;
    /**
     * 226, "Fundo Previdência Férias Ajuste Provisão"
     */
    Enum FUPRFEAJPR;
    /**
     * 227, "Fundo Previdência Férias Estorno Provisão"
     */
    Enum FUPRFEESPR;
    /**
     * 228, "Fundo Previdência Férias Distorção"
     */
    Enum FUPRFEDI;
    /**
     * 229, "Prev. Estadual Férias Provisão"
     */
    Enum PRESFEPR;
    /**
     * 230, "Prev. Estadual Férias Ajuste Provisão"
     */
    Enum PRESFEAJPR;
    /**
     * 231, "Prev. Estadual Férias Estorno Provisão"
     */
    Enum PRESFEESPR;
    /**
     * 232, "Prev. Estadual Férias Distorção"
     */
    Enum PRESFEDI;
    /**
     * 233, "Fundo Assistência Férias Provisão"
     */
    Enum FUASFEPR;
    /**
     * 234, "Fundo Assistência Férias Ajuste Provisão"
     */
    Enum FUASFEAJPR;
    /**
     * 235, "Fundo Assistência Férias Estorno Provisão"
     */
    Enum FUASFEESPR;
    /**
     * 236, "Fundo Assistência Férias Distorção"
     */
    Enum FUASFEDI;
    /**
     * 237, "F.g.t.s. Férias Provisão"
     */
    Enum FGFEPR;
    /**
     * 238, "F.g.t.s. Férias Ajuste Provisão"
     */
    Enum FGFEAJPR;
    /**
     * 239, "F.g.t.s. Férias Estorno Provisão"
     */
    Enum FGFEESPR;
    /**
     * 243, "Provisão - Base Auxiliar Média Horas Férias"
     */
    Enum PRBAAUMEHOFE;
    /**
     * 244, "Provisão - Base Auxiliar Média Horas 13º Salário"
     */
    Enum PRBAAUMEHO13;
    /**
     * 245, "Provisão - Base Auxiliar Distorções 13º Salário"
     */
    Enum PRBAAUDI13SA;
    /**
     * 246, "Provisão - Base Auxiliar Distorções Férias"
     */
    Enum PRBAAUDIFE;
    /**
     * 247, "Devolução I.r.r.f."
     */
    Enum DEVIRRF;
    /**
     * 248, "Devolução I.n.s.s.
     */
    Enum DEVINSS;


}


interface ClassificacaoEvento {
    /**
     * 1, "1/12 aviso prévio indenizado"
     */
    Enum AVPREINDUMDOZE;
    /**
     * 2, "13º salário adiantado"
     */
    Enum ADI13SAL;
    /**
     * 3, "13º salário aviso prévio indenizado"
     */
    Enum AVPREIND13SAL;
    /**
     * 4, "13º salário integral"
     */
    Enum INTEG13SAL;
    /**
     * 5, "Abatimento para RPPS 13º salário"
     */
    Enum RPPSABAT13;
    /**
     * 6, "Abatimento para RPPS"
     */
    Enum RPPSABAT;
    /**
     * 7, "Abatimento salário maternidade 13º salário"
     */
    Enum ABATSALM13;
    /**
     * 8, "Abatimento salário maternidade"
     */
    Enum ABATSALM;
    /**
     * 9, "Adiantamento de férias"
     */
    Enum ADIFERIAS;
    /**
     * 10, "Adiantamento salarial não descontado"
     */
    Enum ADISALNDESC;
    /**
     * 11, "Auxílio natalidade"
     */
    Enum AUXNAT;
    /**
     * 12, "Aviso prévio descontado"
     */
    Enum AVPREDESC;
    /**
     * 13, "Aviso prévio indenizado"
     */
    Enum AVPREIND;
    /**
     * 14, "Base abatimento INSS - duplo vínculo"
     */
    Enum BASABATINSSDV;
    /**
     * 15, "Base INSS - duplo vínculo"
     */
    Enum BASINSSDV;
    /**
     * 16, "Base INSS 13º salário - duplo vínculo"
     */
    Enum BASINSSDV13SAL;
    /**
     * 17, "Base INSS outras empresas 13º salário"
     */
    Enum BASINSSOUTEMP13SAL;
    /**
     * 18, "Base INSS outras empresas"
     */
    Enum BASINSSOUTEMP;
    /**
     * 19, "Base IRRF - duplo vínculo"
     */
    Enum BASIRRFDV;
    /**
     * 20, "Base IRRF 13º salário - duplo vínculo"
     */
    Enum BASIRRFDV13SAL;
    /**
     * 21, "Base IRRF de férias anteriores"
     */
    Enum BASIRRFFERIASANT;
    /**
     * 22, "Base IRRF férias resc. - duplo vínculo"
     */
    Enum BASIRRFFERIASRESCDV;
    /**
     * 23, "Base IRRF outras empresas 13º salário"
     */
    Enum BASIRRFOUTEMP13SAL;
    /**
     * 24, "Base IRRF outras empresas"
     */
    Enum BASIRRFOUTEMP;
    /**
     * 25, "Desc. horas aux. maternidade 13º salário"
     */
    Enum DESCHAUXMAT13SAL;
    /**
     * 26, "Desc. horas aux. maternidade"
     */
    Enum DESCHAUXMAT;
    /**
     * 27, "Desconto 13º salário adiantado"
     */
    Enum DESC13SALADI;
    /**
     * 28, "Desconto adiantamento salarial"
     */
    Enum DESCADISAL;
    /**
     * 29, "Desconto de 13º salário devido reintegração"
     */
    Enum DESC13SALDEVREINTG;
    /**
     * 30, "Desconto por dependente"
     */
    Enum DESCDEP;
    /**
     * 31, "Devolução de INSS"
     */
    Enum DEVINSS;
    /**
     * 32, "Devolução de IRRF"
     */
    Enum DEVIRRF;
    /**
     * 33, "Devolução FGTS 13º salário"
     */
    Enum DEVFGTS;
    /**
     * 34, "Empréstimos"
     */
    Enum EMPRESTIMO;
    /**
     * 35, "Faltas DSR"
     */
    Enum FALTADSR;
    /**
     * 36, "Faltas"
     */
    Enum FALTAS;
    /**
     * 37, "FGTS 13º salário"
     */
    Enum FGTS13SAL;
    /**
     * 38, "FGTS aviso prévio "
     */
    Enum FGTSAVPRE;
    /**
     * 39, "FGTS mês anterior"
     */
    Enum FGTSMESANT;
    /**
     * 40, "FGTS sobre férias"
     */
    Enum FGTSSOBFERIAS;
    /**
     * 41, "FGTS"
     */
    Enum FGTS;
    /**
     * 42, "Fundo assistência 13º salário"
     */
    Enum FUNDASS13SAL;
    /**
     * 43, "Fundo assistência"
     */
    Enum FUNDASS;
    /**
     * 44, "Fundo financeiro 13º salário"
     */
    Enum FUNDFIN13SAL;
    /**
     * 45, "Fundo financeiro"
     */
    Enum FUNDFIN;
    /**
     * 46, "Fundo previdência 13º salário"
     */
    Enum FUNDPREV13SAL;
    /**
     * 47, "Fundo previdência"
     */
    Enum FUNDPREV;
    /**
     * 48, "Horas aux. maternidade não pagas"
     */
    Enum HAUXMATNPAG;
    /**
     * 49, "INSS 13º salário"
     */
    Enum INSS13SAL;
    /**
     * 50, "INSS sobre horas aux. matern. não pagas"
     */
    Enum INSSSOBHAUXMATNPAG;
    /**
     * 51, "INSS"
     */
    Enum INSS;
    /**
     * 52, "IRRF  13º salário"
     */
    Enum IRRF13SAL;
    /**
     * 53, "IRRF férias rescisão"
     */
    Enum IRRFFERIASRESC;
    /**
     * 54, "IRRF"
     */
    Enum IRRF;
    /**
     * 55, "ISS - Imposto Sobre Serviço"
     */
    Enum ISS;
    /**
     * 56, "Multa do FGTS"
     */
    Enum MULTAFGTS;
    /**
     * 57, "Nenhuma"
     */
    Enum NENHUMA;
    /**
     * 58, "Parc. isenta IRRF moléstia grave férias adiant"
     */
    Enum PARCISENIRRFMOLGRVFERIASADI;
    /**
     * 59, "Parc. isenta IRRF moléstia grave férias resc."
     */
    Enum PARCISENIRRFMOLGRVFERIASRESC;
    /**
     * 60, "Parcela isenta fundo financeiro 13º salário"
     */
    Enum PARCISENFUNDFIN13SAL;
    /**
     * 61, "Parcela isenta fundo financeiro"
     */
    Enum PARCISENFUNDFIN;
    /**
     * 62, "Parcela isenta fundo previdência 13º salário"
     */
    Enum PARCISENFUNDPREV13SAL;
    /**
     * 63, "Parcela isenta fundo previdência"
     */
    Enum PARCISENFUNDPREV;
    /**
     * 64, "Parcela isenta IRRF 13º salário"
     */
    Enum PARCISENIRRF13SAL;
    /**
     * 65, "Parcela isenta IRRF moléstia grave 13º salário"
     */
    Enum PARCISENIRRFMOLGRV13SAL;
    /**
     * 66, "Parcela isenta IRRF moléstia grave férias"
     */
    Enum PARCISENIRRFMOLGRVFERIAS;
    /**
     * 67, "Parcela isenta IRRF moléstia grave"
     */
    Enum PARCISENIRRFMOLGRV;
    /**
     * 68, "Parcela isenta IRRF sobre férias resc."
     */
    Enum PARCISENIRRFSOBFERIASRESC;
    /**
     * 69, "Parcela isenta IRRF"
     */
    Enum PARCISENIRRF;
    /**
     * 70, "Pensão judicial - Desconto"
     */
    Enum PENSJUDDESC;
    /**
     * 71, "Plano de saúde"
     */
    Enum PLANOSAUDE;
    /**
     * 72, "Prev. estadual 13º salário"
     */
    Enum PREVESTDECSAL;
    /**
     * 73, "Prev. estadual"
     */
    Enum PREVEST;
    /**
     * 74, "Procedimentos médicos "
     */
    Enum PROCEDMED;
    /**
     * 75, "Prontidão"
     */
    Enum PONTIDAO;
    /**
     * 76, "Prorrog. do aux. maternidade - Lei 11770/2008"
     */
    Enum PRORROGAUXMAT11770;
    /**
     * 77, "Redutor base INSS transportador autônomo"
     */
    Enum REDBASINSSTRANSPAUT;
    /**
     * 78, "Redutor base IRRF transportador autônomo"
     */
    Enum REDBASIRRFTRANSPAUT;
    /**
     * 79, "Salário família aposentado"
     */
    Enum SALFAMAPOS;
    /**
     * 80, "Salário família celetista"
     */
    Enum SALFAMCEL;
    /**
     * 81, "Salário família especial"
     */
    Enum SALFAMESP;
    /**
     * 82, "Salário família estatutário"
     */
    Enum SALFAMEST;
    /**
     * 83, "Salário família pago a maior"
     */
    Enum SALFAMPAGMAIOR;
    /**
     * 84, "SENAT"
     */
    Enum SENAT;
    /**
     * 85, "SEST"
     */
    Enum SEST;
    /**
     * 86, "Sobreaviso"
     */
    Enum SOBREAVISO;
    /**
     * 87, "Vale transporte - custo empregador"
     */
    Enum VALETRANSP;
    /**
     * 88, "Horas férias"
     */
    Enum HORASFERIAS;
    /**
     * 89, "Férias adiantadas"
     */
    Enum FERIASADI;
    /**
     * 90, "Horas férias coletivas"
     */
    Enum HORASFERIASCOL;
    /**
     * 91, "Horas férias aviso prévio indenizado"
     */
    Enum HORASFERIASAVPREVIND;
    /**
     * 92, "1/3 de férias"
     */
    Enum FERIASTERCO;
    /**
     * 93, "1/3 de abono"
     */
    Enum ABONOTERCO;
    /**
     * 94, "1/3 de férias em dobro"
     */
    Enum FERDOBROTERCO;
    /**
     * 95, "1/3 de férias indenizadas"
     */
    Enum FERINDENTERCO;
    /**
     * 96, "1/3 de férias proporcionais"
     */
    Enum FERPROPTERCO;
    /**
     * 97, "1/3 de férias vencidas"
     */
    Enum FERVENCTERCO;
    /**
     * 98, "Base negativa INSS - Mensal"
     */
    Enum BASEINSSNEG;
}


/**
 * Tipos de processamento da folha de pagamento
 */
enum TipoProcessamento {
    FERIAS,
    MENSAL,
    DECIMO_TERCEIRO_SALARIO,
    RESCISAO
}

/**
 * Subtipos de processamentos da folha de pagamento
 */
enum SubTipoProcessamento {
    ADIANTAMENTO,
    INTEGRAL,
    COMPLEMENTAR
}

/**
 * Dados que retornam na busca de uma folha por meio das funções de busca
 */
interface folha {
    /**
     * Lista de eventos calculados
     */
    List<evento> eventos = evento;
    /**
     * Dias de gozo de férias
     */
    Integer diasGozo = 0;
    /**
     * Total bruto da folha
     */
    BigDecimal totalBruto = BigDecimal.valueOf(1500);
    /**
     * Total de descontos da folha
     */
    BigDecimal totalDesconto = BigDecimal.valueOf(1500);
    /**
     * Total líquido da folha
     */
    BigDecimal totalLiquido = BigDecimal.valueOf(1500);
    /**
     * Tipo de processamento da folha
     */
    Enum tipoProcessamento = TipoProcessamento.MENSAL;
    /**
     * Subtipo de processamento da folha
     */
    Enum subTipoProcessamento = SubTipoProcessamento.INTEGRAL;
    /**
     * Competência de cálculo da folha
     */
    Date competencia = new Date();
    /**
     * Dias de abono de férias
     */
    Integer diasAbono = 0;
    /**
     * Retorna verdadeiro se é folha de pagamento (se retornar falso é uma folha interna de férias)
     */
    Boolean folhaPagamento = true;
}

/**
 * Retorna informações do evento que esta sendo calculado ou buscado na folha
 */
interface evento {
    /**
     * Código do evento
     */
    Integer codigo = 1;
    /**
     * Taxa do evento
     */
    BigDecimal taxa = BigDecimal.valueOf(0);
    /**
     * Permite busca a taxa de um outro evento informando-o no argumento
     * @param codigoEvento
     * @return Taxa informada no evento
     */
    BigDecimal getTaxa(Integer codigoEvento);
    /**
     * Nome/Descrição do evento
     */
    String descricao = 'HORAS NORMAIS';
    /**
     * Tipo do evento (VENCIMENTO/DESCONTO/INFORMATIVO + / INFORMATIVO -)
     */
    Enum tipo = TipoEvento.VENCIMENTO;
    /**
     * Unidade do evento
     */
    Enum unidade = UnidadeEvento.DIAS;
    /**
     * Descrição da classificação do evento
     */
    String descricaoClassificacao = 'NENHUMA';
    /**
     * Classificação do evento
     */
    Enum classificacao = ClassificacaoEvento.INSS
}

/**
 * Classificações de tipos de afastamento conforme cadastro de tipos de afastamentos
 */
enum ClassificacaoTipoAfastamento {
    ABORTO_NAO_CRIMINOSO,
    ACIDENTE_DE_TRABALHO_EMPREGADOR,
    ACIDENTE_DE_TRABALHO_PREVIDENCIA,
    ACIDENTE_DE_TRAJETO_EMPREGADOR,
    ACIDENTE_DE_TRAJETO_PREVIDENCIA,
    DOENCA_DO_TRABALHO_EMPREGADOR,
    DOENCA_DO_TRABALHO_PREVIDENCIA,
    AUXILIO_DOENCA_EMPREGADOR,
    AUXILIO_DOENCA_PREVIDENCIA,
    ACOMPANHAR_MEMBRO_DA_FAMILIA_ENFERMO,
    ADOCAO_GUARDA_JUDICIAL_DE_CRIANCA,
    APOSENTADORIA_POR_INVALIDEZ,
    CANDIDATO_A_CARGO_ELETIVO,
    CARCERE,
    CEDENCIA,
    FALTA,
    FERIAS,
    LICENCA_COM_VENCIMENTOS,
    LICENCA_SEM_VENCIMENTOS,
    LICENCA_MATERNIDADE,
    MANDATO_ELEITORAL_COM_REMUNERACAO,
    MANDATO_ELEITORAL_SEM_REMUNERACAO,
    MANDATO_SINDICAL,
    MULHER_VITIMA_DE_VIOLENCIA_LEI_MARIA_DA_PENHA,
    PRORROGACAO_DA_LICENCA_MATERNIDADE,
    PRORROGACAO_DA_LICENCA_MATERNIDADE_11_770,
    SERVICO_MILITAR,
    SERVIDOR_PUBLICO_EM_DISPONIBILIDADE,
    SUSPENSAO_DISCIPLINAR_ART474_CLT,
    SUSPENSAO_DO_CONTRATO_ART476_CLT,
    APOSENTADO,
    DEMITIDO;
}

/**
 * Dados do dependente, pode ser acessado em servidor.buscaDependentes()
 */
interface dependente {
    /**
     * Tipo de pensão (PERCENTUAL / VALOR)
     */
    Enum aplicacaoDesconto;
    /**
     * Valor do desconto, quanto a aplicação do desconto é em VALOR
     */
    BigDecimal valorDesconto;
    /**
     * Percentual do desconto, quanto a aplicação do desconto é em PERCENTUAL
     */
    BigDecimal percentualDesconto;
    /**
     * Data de início da dependência
     */
    Date dataInicio;
    /**
     * Data final da dependência
     */
    Date dataTermino;
    /**
     * Se é dependente de salário família
     */
    Boolean salarioFamilia;
    /**
     * Se é dependente de IRRF
     */
    Boolean irrf;
    /**
     * Data de nascimento do dependente
     */
    Date dataNascimento;
    /**
     * Se é dependente estuda
     */
    Boolean estuda;
    /**
     * Se é dependente de pensão
     */
    Boolean pensao;
    /**
     * Data de início do curso
     */
    Date dataInicioCurso;
    /**
     * Data final do curso
     */
    Date dataFinalCurso;
}

/**
 * Tipo de onus referente a cessão
 */
enum TipoOnus {
    CEDENTE,
    CESSIONARIO;
}

/**
 * Unidade de tempo
 */
enum UnidadeTempo {
    NANOS, MICROS, MILLIS, SEGUNDOS, MINUTOS, HORAS, DIAS, SEMANAS, MESES, ANOS
}

/**
 * Tipo de regime
 */
enum TipoRegime {
    COMPETENCIA, CAIXA;
}

/**
 * Tipo de valor
 */
enum TipoValor {
    CALCULADO, REFERENCIA;
}

/**
 * Encargos sociaos Fpas do cadastro de manutenção da entidade
 */
enum EncargosSociaisFpas {
    EMPRESA_SERVICO_PROC_DADOS,
    SINDICATO_ASSOCIACAO_PROF_EMPREGADO,
    EMPRESA_COMUNICACAO,
    ESTABELECIMENTO_ENSINO,
    ORGAO_PODER_PUBLICO,
    CARTORIO,
    EMPRESA_TRANSP_RODOVIARIO,
    TOMADOR_SERVIDO_TRANSP_AUTONOMO,
    ENTIDADE_BENEFICENTE,
    ASSOCIACAO_DESPORTIVA,
    EMPRESA_TRABALHO_TEMPORARIO,
    TRATAMENTO_DISP_RESIDUOS,
    BANCOS_INST_FINANCEIRAS;
}


/**
 * Tipo de regime previdênciário
 */
enum TipoRegimePrevidenciario {
    CLT, REGIME_PROPRIO, OUTROS;
}

/**
 * Unidade de pagamento da matrícula
 */
enum UnidadePagamento {
    MENSALISTA, QUINZENALISTA, SEMANALISTA, DIARISTA, HORISTA, TAREFEIRO, OUTROS;
}

/**
 * Unidade de cálculo (parâmetros da entidade)
 */
enum UnidadeCalculo {
    DIAS, HORAS;
}

/**
 * Tipos de despesa de plano de saúde
 */
enum TipoDespesaPlanoSaude {
    MENSALIDADE, ADESAO, PROCEDIMENTOS;

}

/**
 * Tipo de evento
 */
interface TipoEvento {
    /**
     * Vencimento, provento ou pensão
     */
    Enum VENCIMENTO;
    /**
     * Desconto
     */
    Enum DESCONTO;
    /**
     * Informativo(+)
     */
    Enum INFORMATIVO_MAIS;
    /**
     * Informativo(-)
     * @return INFORMATIVO_MENOS
     */
    Enum INFORMATIVO_MENOS;
}

/**
 * Grau de escolaridade
 */
enum GrauEscolaridade {
    ENSINO_MEDIO
}


/**
 * Unidade do evento
 */
interface UnidadeEvento {
    /**
     * 1, "Automático", 4
     */
    Enum AUTOMATICO;
    /**
     * 2, "Avos", 4
     */
    Enum AVOS;
    /**
     * 3, "Dias", 2
     */
    Enum DIAS;
    /**
     * 4, "Horas", 2
     */
    Enum HORAS;
    /**
     * 5, "Percentual", 4
     */
    Enum PERCENTUAL;
    /**
     * 6, "Quantidade", 4
     */
    Enum QUANTIDADE;
    /**
     * 7, "Valor", 2
     */
    Enum VALOR;
}

/**
 * Forma de pagamento
 */
interface FormaPagamento {
    /**
     * Dinheiro
     */
    Enum DINHEIRO;
    /**
     * Cheque
     */
    Enum CHEQUE;
    /**
     * Crédito em conta
     */
    Enum CREDITO_EM_CONTA;
}

/**
 * Grau de deficiência
 */
interface GrauDeficiencia {
    /**
     * Parcial
     */
    Enum PARCIAL;
    /**
     * Total
     */
    Enum TOTAL;
    /**
     * Não inválido
     */
    Enum NAOINVALIDO;
}

/**
 * Mês de contribuição sindical
 */
enum MesContribuicaoSindical {
    JANEIRO, FEVEREIRO, MARCO, ABRIL, MAIO, JUNHO, JULHO, AGOSTO, SETEMBRO, OUTUBRO, NOVEMBRO, DEZEMBRO;
}

/**
 * Origem do rendimento
 */
enum OrigemRendimento {
    CARGO, CARGO_COMISSIONADO;
}

/**
 * Sexo
 */
enum Sexo {
    MASCULINO, FEMININO;
}

/**
 * Tipo de admissão
 */
enum TipoAdmissao {
    ADMISSAO,
    TRANSFERENCIA,
    SUBSTITUICAO;
}

/**
 * Tipo de matrícula
 */
enum TipoMatricula {
    FUNCIONARIO("Funcionário"),
    ESTAGIARIO("Estagiário"),
    AUTONOMO("Autônomo"),
    APOSENTADO("Aposentado"),
    PENSIONISTA("Pensionista");
}

/**
 * Responsabilidade do pagamento
 */
enum ResponsabilidadePagamento {
    PAGAMENTO_EXCLUSIVAMENTE_PELO_CEDENTE_ORIGEM,
    PAGAMENTO_EXCLUSIVAMENTE_PELO_CESSIONARIO_DESTINO,
    PAGAMENTO_PELO_CEDENTE_ORIGEM_E_PELO_CESSIONARIO_DESTINO,
    PAGAMENTO_PELO_CEDENTE_ORIGEM_COM_RESSARCIMENTO_PELO_CESSIONARIO_DESTINO;
}

/**
 * Estado civil
 */
enum EstadoCivil {
    SOLTEIRO, CASADO, DIVORCIADO, VIUVO, SEPARADO_CONSENSUALMENTE, SEPARADO_JUDICIALMENTE, UNIAO_ESTAVEL;
}

/**
 * Matrícula
 */
enum matricula {
    codigo,
    tipo
}

/**
 * Grau de dependência
 */
enum GrauDependencia {
    FILHO(true),
    CONJUGE(false),
    PAI_MAE(false),
    IRMAO(true),
    AVO(false),
    NETO(true),
    ENTEADO(true),
    MENOR_TUTELADO(true),
    COMPANHEIRO(false),
    BISNETO(true),
    BISAVO(false);
}

/*INTERFACES */


/**
 * Retorna o valor de Lancamentos de eventos em variáveis
 */
interface Lancamentos {
    /**
     * Valor do evento lançado em variáveis
     * @param evento
     * @return o valor do lançamento, caso não tenha valor lançado retorna -1
     */
    public BigDecimal valor(Enum evento);

    /**
     * Valor do evento lançado em variáveis
     * @param evento
     * @param valor padrão de retorno
     * @return o valor do lançamento, caso não tenha valor lançado o valor padrão
     */
    public BigDecimal valor(Enum evento, Boolean valorPadrao);

    /**
     * Busca eventos que compões horas mês e estão lançados em variáveis
     * @return a soma do valor dos eventos que compõe horas mês
     */
    public BigDecimal valorComposicaoMes();
}

/**
 * Permite buscar afastamentos de um período passados por argumento
 */
interface Afastamentos {
    /**
     * Busca afastamentos de um périodo informando a data inicial, data final e uma lista de classificações de afastamentos
     * @param dataInicial
     * @param dataFinal
     * @param classificacoes
     * @return Retorna um lista de afastamentos.
     */
    public List buscaPorPeriodo(Date dataInicial, Date dataFinal, List[] classificacoes)

    /**
     * Busca afastamentos da competência passando uma lista de classificações de afastamentos
     * @param classificacoes
     * @return Retorna um lista de afastamentos.
     */
    public List buscaPorPeriodo(List[] classificacoes)
}

/**
 * Retorna informações do servidor
 */
interface servidor {
    /**
     * Grau de escolaridade do servidor
     */
    Enum grauEscolaridade = GrauEscolaridade.ENSINO_MEDIO;
    /**
     * Data de nascimento do servidor
     */
    Date dataNascimento = new Date();
    /**
     * Estado civil do servidor
     */
    Enum estadoCivil = EstadoCivil.SOLTEIRO;
    /**
     * Nome do servidor
     */
    String nome = 'JOÃO DA SILVA';
    /**
     * Nacionalidade do servidor
     */
    String nacionalidade = 'BRASIL';
    /**
     * Data de chegada ao Brasil de pessoa estrangeira
     */
    Date dataChegada = new Date();

    /**
     * Quantidade gerais de dependentes
     */
    Integer dependentes = 2;

    /**
     * Busca os dados do dependentes referente a IRRF, pensão e outras informações
     */
    List<dependente> buscaDependentes = []

    /**
     * Sexo do servidor
     */
    Enum sexo = Sexo.MASCULINO;

    /**
     * Retorna os dependentes de um tipo de salário família informado
     * @param TipoSalarioFamilia
     * @return Quantidade de dependentes
     */
    Integer getDependenteSalarioFamilia(Enum TipoSalarioFamilia);

    /**
     * Quantidade de dependentes de IRRF
     */
    Integer dependentesIrrf = 2;

    /**
     * Se servidor possui moléstia grave
     */
    Boolean possuiMolestiaGrave;

}


/**
 * Informações do funcionário que esta sendo calculado
 */
interface funcionario {
    /**
     * Retorna o plano salarial da origem do rendimento
     * @param OrigemRendimento
     */
    public String planoSalarialOrigemRendimento(Enum OrigemRendimento);

    /**
     * Ocorrência sefip do funcionário
     */
    public Enum ocorrenciaSefip;

    /**
     * Classe salarial do funcionário
     */
    public Enum classeSalarial;

    /**
     * Classe salarial conforme a origem do rendimento informada
     * @param OrigemRendimento
     * @return Retorna a classe salarial
     */
    public String classeSalarialOrigemRendimento(Enum OrigemRendimento);

    /**
     * Mês de contribuição sindical configurado no cadastro do sindicato (cadastro de empresas)
     */
    public Enum mesContribuicaoSindical;
    /**
     * Tipo do vínculo
     */
    public Enum tipoVinculo;

    /**
     * Categoria sefip do vínculo
     */
    public Enum categoriaSefipVinculo;

    /**
     * Descrição do organograma
     */
    public String descricaoOrganograma;

    /**
     * Código do organograma
     */
    public String codigoOrganograma;

    /**
     * Se funcionario conta vaga
     */
    public Boolean contaVaga;

    /**
     * Se funcionário conta vaga na origem de rendimento informada
     * @param OrigemRendimento
     */
    public Boolean contaVagaOrigemRendimento(Enum OrigemRendimento);

    /**
     * Se funcionário recebe décimo terceiro, conforme cadastro de cargos
     */
    public Boolean recebeDecimoTerceiro = true;

    /**
     * Se funcionário recebe décimo terceiro, conforme cadastro de cargos do cargo de origem de rendimento informado
     * @param OrigemRendimento
     * @return
     */
    public Boolean recebeDecimoTerceiroPorOrigem(Enum OrigemRendimento);

    /**
     * Dias de direiro conforme a configuração de férias
     */
    public Long diasDireitoFerias = 30L;

    /**
     * Meses para aquisição conforme a configuração de férias
     */
    public Long mesesAquisicaoFerias = 12L;

    /**
     * Data da opção de FGTS
     */
    public Date dataOpcaoFgts;

    /**
     * Data final do vínculo temporário, para data de rescisão use funcionario.dataRescisao
     */
    public Date dataFimVinculo;

    /**
     * Salário do funcionário
     */
    public Double salario;

    /**
     * Coeficente do nível salarial
     */
    public String nivelSalarialCoeficiente;

    /**
     * Unidade de pagamento
     */
    public Enum unidadePagamento;

    /**
     * Quantidade de horas semanais
     */
    public Double quantidadeHorasSemana;

    /**
     * Coeficente do nível salarial conforme origem de rendimento
     * @param OrigemRendimento
     * @return
     */
    public Double nivelSalarialCoeficienteOrigemRendimento(Enum OrigemRendimento);

    /**
     * Plano salarial
     */
    public String planoSalarial;

    /**
     * Se é optante do FGTS
     */
    public Boolean optanteFgts;

    /**
     * Data base
     */
    public Date dataBase;

    /**
     * Sindicato do funcionário
     */
    public String sindicato;

    /**
     * Responsabilidade do pagamento
     */
    public Enum responsabilidadePagamento;

    /**
     * Nível salarial
     */
    public Enum nivelSalarial;

    /**
     * Se é estatutário
     */
    public Boolean estatutario;

    /**
     * Data da rescisção, se não existir retorna null
     */
    public Date dataRescisao;

    /**
     * Nível salarial conforme origem de rendimento
     * @param OrigemRendimento
     * @return
     */
    public String nivelSalarialOrigemRendimento(Enum OrigemRendimento);

    /**
     * Salário conforme origem de rendimento
     * @param OrigemRendimento
     * @return
     */
    public Double salarioOrigemRendimento(Enum OrigemRendimento);

    /**
     * Vínculo empregatício
     */
    public String vinculoEmpregaticio;

    /**
     * Grupo funcional
     */
    public String grupoFuncional;

    /**
     * Cargo do funcionário (descrição)
     */
    public String cargo;

    /**
     * Data de admissão
     */
    public Date dataAdmissao;

    /**
     * Se possui previdência
     * @param TipoPrevidencia
     * @return verdadeiro ou falso
     */
    public Boolean possuiPrevidencia(Enum TipoPrevidencia);

    /**
     * Se possui previdência federal
     */
    public Boolean possuiPrevidenciaFederal;

    /**
     * Tipo de admissão
     */
    public Enum tipoAdmissao;

    /**
     * Quantidade de horas mensais
     */
    public Double quantidadeHorasMes;

    public String cargoOrigemRendimento(Enum OrigemRendimento);
}

interface autonomo {
    Enum formaPagamento = FormaPagamento.CREDITO_EM_CONTA;
    String grupoFuncional = 'GERAL';
    Date dataInicioServico = new Date();
    Date dataFimServico = new Date();
    BigDecimal totalServicosAutonomo = BigDecimal.valueOf(1500);
    String descricaoOrganograma = 'SECRETARIA DE EDUCAÇÃO';
    String agenciaPagamento = 'CENTRO';
    String bancoPagamento = 'BANCO DO BRASIL';
}

enum estagiario {
    formaPagamento,
    grupoFuncional,
    cargo,
    planoSalarial,
    classeSalarial,
    dataProrrogacao,
    nivelSalarial,
    quantidadeHorasMes,
    descricaoOrganograma,
    recebeDecimoTerceiro,
    diasDireitoFerias,
    mesesAquisicaoFerias,
    dataInicioEstagio,
    bolsaEstudos,
    dataFinalEstagio,
    agenciaPagamento,
    bancoPagamento,
    nivelSalarialCoeficiente
}

enum aposentado {
    formaPagamento,
    grupoFuncional,
    dataAposentadoria,
    dataCessacaoAposentadoria,
    valorBeneficio,
    descricaoOrganograma,
    codigoOrganograma,
    agenciaPagamento,
    bancoPagamento
}

enum pensionista {
    formaPagamento,
    grupoFuncional,
    valorBeneficio,
    dataInicioBeneficio,
    dataCessacaoBeneficio,
    descricaoOrganograma,
    agenciaPagamento,
    bancoPagamento
}


public interface calculo {
    public Boolean descontarEmprestimoRescisao = true; ;
    public Date competencia = new Date();
    public Long quantidadeDiasCompetencia = 31L;
    public Boolean abonoSemGozo = false;
    public Enum tipoProcessamento = TipoProcessamento.MENSAL;
    public Date dataPagamento = new Date();
    public Date dataRescisao = new Date();

    public Long quantidadeDias(Integer mes, Integer ano);
    public Date dataReferenciaRescisao = new Date();
    public Object periodoAquisitivoDecimoTerceiro = new Object();
    public Enum subTipoProcessamento = SubTipoProcessamento.INTEGRAL;
    public Enum unidade = UnidadeCalculo.DIAS;
    public Boolean pagarUmTercoIntegral = false;
    public Integer anoDecimoTerceiro = 2019;
    public Boolean consideraAvosPerdidos = true;
    public Boolean pagarDecimoTerceiroFerias = true;
    public Boolean individual = true;
    public Boolean rescisaoAutomaticaVincTemp = false;
    public Boolean descontarFaltasSobreFerias = true;

    public BigDecimal soma(Enum TipoEvento);
}

interface Numeros {
    BigDecimal absoluto(BigDecimal valor);

    Double arredonda(BigDecimal valor, Integer casasDecimais);

    BigDecimal coseno(BigDecimal valor);

    Boolean ehNumero(String texto);

    BigDecimal exponencial(Double numero);

    BigDecimal fatorial(Double numero);

    BigDecimal logaritmo(BigDecimal valor);

    BigDecimal logaritmo10(BigDecimal valor);

    BigDecimal maximo(BigDecimal valor1, BigDecimal valor2);

    BigDecimal minimo(BigDecimal valor1, BigDecimal valor2);

    BigDecimal numero(String texto);

    BigDecimal pi(BigDecimal valorMultiplicar);

    BigDecimal piso(BigDecimal valor);

    BigDecimal potencia(BigDecimal valor1, BigDecimal valor2);

    BigDecimal raiz(BigDecimal valor);

    BigDecimal randomico(BigDecimal numeroDelimitador);

    BigDecimal resto(BigDecimal valorDividendo, BigDecimal valorDivisor);

    BigDecimal seno(BigDecimal valor);

    BigDecimal seZero(BigDecimal valor1, BigDecimal valor2, List[] valorN);

    BigDecimal tangente(BigDecimal valor);

    BigDecimal teto(BigDecimal valor);

    Double trunca(BigDecimal valor, Integer casasDecimais);
}


interface folhasPeriodo {
    List<folha> buscaFolhasProcessamento(Enum TipoProcessamento);

    List<folha> buscaFolhas();

    List<folha> buscaFolhasInternas(Enum TipoProcessamento);


}


interface Eventos {
    BigDecimal valor(Integer codigo);

    BigDecimal valorReferencia(Integer codigo);

    BigDecimal valorCalculado(Integer codigo, Enum TipoValor, Enum TipoProcessamento, Enum SubTipoProcessamento, Enum competencia, Enum TipoRegime);

    BigDecimal valorCalculado(Integer codigo, Enum TipoValor, Enum TipoProcessamento, Enum SubTipoProcessamento, Enum competencia);

    BigDecimal valorCalculado(Integer codigo, Enum TipoValor, Enum TipoProcessamento, Enum SubTipoProcessamento);

}


interface Datas {
    Date adicionaDias(Date data, Integer quantidadedeDias);

    Date adicionaHoras(Date data, Integer quantidadeHoras);

    Date adicionaMeses(Date data, Integer quantidadeMeses);

    Date adicionaMinutos(Date data, Integer quantidadeMinutos);

    Date adicionaSegundos(Date data, Integer quantidadeSegundos);

    Date ano(Date data);

    Date data(Integer ano, Integer mes, Integer dia);

    LocalDateTime dataHora(Integer ano, Integer mes, Integer dia, Integer hora, Integer minuto);

    Long dia(Date data);

    String diaSemana(Date data);

    Long diferencaAnos(Date menorData, Date maiorData);

    Long diferencaDias(Date menorData, Date maiorData);

    Long diferencaHoras(Date menorData, Date maiorData);

    Long diferencaMeses(Date menorData, Date maiorData);

    Long diferencaMinutos(Date menorData, Date maiorData);

    Long diferencaSegundos(Date menorData, Date maiorData);

    Boolean ehData(String texto);

    String extenso(Date data);

    Date hoje();

    Date hora(Date data);

    Date mes(Date data);

    Date minuto(Date data);

    Date nomeDiaSemana(Date data);

    String nomeMes(Date data);

    Date periodo(Date dataInicial, Date dataFinal);

    Date removeDias(Date data, Integer quantidadedeDias);

    Date removeMeses(Date data, Integer quantidadeMeses);

    Date segundo(Date data);

    String formatar(Date data, String formato);
}

/**
 * Permite buscar dados de períodos aquisitivos de férias
 */
interface PeriodosAquisitivos {
    /**
     * Retorna apenas períodos aquisitivos de férias com saldo
     * @return Lista de períodos com saldo
     */
    List<periodoAquisitivo> buscaPeriodosComSaldo();

    /**
     * Retorna apenas períodos aquisitivos de férias com saldo
     * (Ver fórmula do evento FERIAS VENCIDAS NA RESCISÃO)
     * @return Lista de períodos vencidos
     */
    List<periodoAquisitivo> buscaVencidos();

    /**
     * Retorna o período proporcional de férias (o que esta em andamento na rescisão)
     * (Ver fórmula do evento FERIAS PROPORCIONAIS NA RESCISÃO)
     * @return Um periodo aquisitivo em andamento
     */
    List<periodoAquisitivo> buscaProporcional();

    /**
     * Por meio do "quitaPorRescisao" é possível gravar os valores quitados em cada período e fazer a baixa dos periodos de férias
     * @param periodo - Informe o período aquisitivo
     * @param valorCalculado - Informe um valor calcularo
     * @return Esta função não tem retorno
     */
    def quitaPorRescisao(Object periodo, BigDecimal valorCalculado)
}

interface periodoAquisitivoDecimoTerceiro {
    Integer avosAdquiridos = 12;
    Integer avosAdquiridosFgts = 12;
    Integer avosPerdidos = 0;
    Integer avosDireito = 12;
    List<movimentacaoPagamentoPeriodoAquisitivo> movimentacoes = movimentacaoPagamentoPeriodoAquisitivo;
    Integer anoExercicio = 2019;
    Enum situacao = SituacaoPeriodoAquisitivoDecimoTerceiro.EM_ANDAMENTO;
    Date dataFinal = new Date();
    Date dataInicial = new Date();
    BigDecimal totalMovimentacoes = BigDecimal.valueOf(2000);

    BigDecimal totalMovimentacoesByMotivo(Enum motivo);

    List<movimentacaoPagamentoPeriodoAquisitivo> movimentacoesByMotivo(Enum motivo);

    interface movimentacaoPagamentoPeriodoAquisitivo {
        Date competencia;
        Boolean consideraAvosPerdidos = true;
        BigDecimal valor = BigDecimal.valueOf(2000);
        Enum motivo = motivoMovimentacaoPeriodoAquisitivoDecimoTerceiro.ADIANTAMENTO_DECIMO_TERCEIRO

        enum motivoMovimentacaoPeriodoAquisitivoDecimoTerceiro {
            ADIANTAMENTO_DECIMO_TERCEIRO
        }
    }

}

enum SituacaoPeriodoAquisitivoDecimoTerceiro {
    ATRASADO,
    EM_ANDAMENTO,
    PERDA_DIREITO,
    QUITADO,
    QUITADO_PARCIALMENTE,
    ANULADO
}

interface periodoConcessao {
    Integer diasGozo = 30;
    Integer diasFalta = 0;
    Date dataPagamento = new Date();
    Date dataFimGozo = new Date();
    Integer diasAbono = 0;
    Date dataInicioGozo = new Date();
}


interface periodoAquisitivo {
    Object configuracaoFerias = periodoAquisitivo.configuracaoFerias;
    Enum situacao = SituacaoPeriodoAquisitivo.EM_ANDAMENTO;
    Date dataFinal = new Date('2019-01-01');
    Date dataInicial = new Date('2019-12-31');
    Integer saldo = 30;
    Integer faltas = 0;
    Integer faltasBrutas = 0;
    Integer faltasEnquadradas = 0;
    Integer diasAdquiridos = 30;
    Integer cancelados = 0;
    Integer suspensos = 0;
    Integer diasFeriasPagosRescisao = 0;
    Boolean pagouUmTercoIntegral = false;
    Boolean pagoRescisao = false;

    enum SituacaoPeriodoAquisitivo {
        EM_ANDAMENTO(1, "Em andamento"),
        QUITADO(2, "Quitado(s)"),
        CANCELADO(3, "Cancelado(s)"),
        ADQUIRIDO(4, "Adquiridos(s)"),
        ANULADO(5, "Anulado em rescisão",);
    }

    interface configuracaoFerias {
        Integer diasParaAdquirirNoPeriodo = 30;
        Integer mesesParaAquisicao = 12;
        Integer mesesParaConcessao = 12;
        Integer diasAbono = 10;
    }
}

interface afastamento {
    Enum unidade = UnidadeCalculo.DIAS;
    Enum decorrente = 'LICENCA';
    Date competenciaDesconto = new Date();
    Enum tipoOnus = TipoOnus.CEDENTE;
    String motivo = 'MOTIVO DO AFASTAMENTO';
    Date inicio = new Date();
    Date fim = new Date();
    Boolean abonar = false;
    Date competenciaAbono = new Date();
    BigDecimal quantidade = BigDecimal.valueOf(15);
    Object tipo = tipoAfastamento;

    interface tipoAfastamento {
        String descricao = 'LICENÇA SEM VENCIMENTOS';
        Enum classificacao = ClassificacaoTipoAfastamento.LICENCA_SEM_VENCIMENTOS;
        Integer diasPrevistos = 0;
        Boolean tempoServico = true;
        Boolean consideraVencimento = true;
        Boolean reduzFerias = true;
        Boolean reduz13Salario = true;
        Boolean justificado = true;
    }
}

interface PeriodosAquisitivosDecimoTerceiro {
    List<periodoAquisitivoDecimoTerceiro> buscaPeriodosAquisitivosBySituacao(Enum SituacaoPeriodoAquisitivoDecimoTerceiro);

    List<periodoAquisitivoDecimoTerceiro> buscaPeriodosAquisitivos();

    def compoePagamento(Object periodo, BigDecimal valorCalculado);
}


interface EncargosSociais {
    BigDecimal tetoSalarial = BigDecimal.valueOf(15000);
    BigDecimal pisoSalarial = BigDecimal.valueOf(1000);
    BigDecimal salarioMinimo = BigDecimal.valueOf(999);
    Date inicioVigencia = new Date();
    Enum RPPS = EncargosSociais.RPPS;
    Enum RGPS = EncargosSociais.RGPS;
    Enum IRRF = EncargosSociais.IRRF;
    Enum FGTS = EncargosSociais.FGTS;
    Enum SalarioFamilia = EncargosSociais.SalarioFamilia;

    interface IRRF {
        BigDecimal buscaContribuicao(BigDecimal base, Integer coluna);

        BigDecimal buscaMaior();
        BigDecimal parcelaIsentaAposentadoria = BigDecimal.valueOf(0);
        BigDecimal minimoIrrfDarf = BigDecimal.valueOf(10);
        BigDecimal deducaoPorDependente = BigDecimal.valueOf(189);
    }

    interface FGTS {
        Long multaFgts = 40L; //Percentual
        String codigoFgts = '123456';
    }

    interface SalarioFamilia {
        interface Celetista {
            BigDecimal buscaContribuicao(BigDecimal base, Integer coluna);

            BigDecimal buscaMaior();
        }

        interface Estatutario {
            BigDecimal buscaContribuicao(BigDecimal base, Integer coluna);

            BigDecimal buscaMaior();
        }

        interface Aposentado {
            BigDecimal buscaContribuicao(BigDecimal base, Integer coluna);

            BigDecimal buscaMaior();
        }

        interface Especial {
            BigDecimal buscaContribuicao(BigDecimal base, Integer coluna);

            BigDecimal buscaMaior();
        }
    }

    interface RGPS {
        BigDecimal buscaMaior();

        BigDecimal buscaContribuicao(BigDecimal base, Integer coluna);
        BigDecimal percentualIsencaoFilantropia = 0; //Percentual
        BigDecimal percentualTerceiros = 0; //Percentual
        String codigoTerceiros = '12345';
        Long percentualFap = 0; //Percentual
        Long percentualGilRat = 0; //Percentual
        String cnaePreponderante = '123456';
        BigDecimal percentualInssEmpregador = 0; //Percentual
        String codigoFpas = '12345';
    }

    interface RPPS {
        interface FundoFinanceiro {
            BigDecimal buscaMaior();

            BigDecimal buscaContribuicao(BigDecimal base, Integer coluna);
            BigDecimal taxaAdministrativa = 0;
            BigDecimal indiceAporte = 0;
            BigDecimal minimo = 0;
            BigDecimal maximo = BigDecimal.valueOf(999999)
        }

        interface PrevidenciaPropria {
            BigDecimal buscaMaior();

            BigDecimal buscaContribuicao(BigDecimal base, Integer coluna);
            BigDecimal taxaAdministrativa = 0;
            BigDecimal indiceAporte = 0;
            BigDecimal minimo = 0;
            BigDecimal maximo = BigDecimal.valueOf(999999)
        }

        interface PrevidenciaEstadual {
            BigDecimal buscaMaior();

            BigDecimal buscaContribuicao(BigDecimal base, Integer coluna);
            BigDecimal taxaAdministrativa = 0;
            BigDecimal indiceAporte = 0;
            BigDecimal minimo = 0;
            BigDecimal maximo = BigDecimal.valueOf(999999)
        }

        interface FundoAssistencia {
            BigDecimal buscaMaior();

            BigDecimal buscaContribuicao(BigDecimal base, Integer coluna);
            BigDecimal taxaAdministrativa = 0;
            BigDecimal indiceAporte = 0;
            BigDecimal minimo = 0;
            BigDecimal maximo = BigDecimal.valueOf(999999)
        }
    }

}

//FUNCOES PARA FORMULAS


/**
 * Em funções teremos as funções criadas para auxiliar a construção das fórmulas de eventos
 * Use Funcoes.nome_da_funcao(argumentos (quando houver) )
 */
interface Funcoes {
    Boolean pagapensao();

    Integer mesestrab();

    BigDecimal percsestautonomo();

    BigDecimal percsenatautonomo();

    BigDecimal abonocompens();

    Boolean temoutrosfun();

    Boolean recebepensao();

    Boolean possuiPrevidenciaFederalPrincipal();

    BigDecimal totalPensaoAlimeticia();

    Boolean possuiPrevidenciaFederal(Enum TipoMatricula);

    BigDecimal liquido();

    Boolean pagto13salad();

    BigDecimal salcptant();

    Boolean existerescisao();

    Boolean descfal13resc();

    Date dtreintegra();

    Boolean mantemvinc();

    Boolean recalculo();

    BigDecimal adicionais();

    Enum ocorrenciaSefip();

    Boolean conselheirotutelar();

    Boolean optanteFgts(Enum TipoMatricula);

    BigDecimal acumula(Integer codigoEvento, Enum TipoValor, Date competenciaInicial, Date competenciaFinal, List<TipoProcessamento> TipoProcessamentos);

    BigDecimal acumulaClassif(Enum ClassificacaoEvento);

    Integer afasaborto();

    Integer afasacidtrab();

    Integer afasacidtrabemp();

    Integer afasadocao();

    Integer afasauxdoenc();

    Integer afasauxdoencemp();

    Integer afasdirinteg();

    Integer afaslicmat();

    Integer afaslicsvenc();

    Integer afasprorroglicmat();

    Integer afasprorroglicmatlei11770();

    Integer afasservmil();

    Integer aquisiniprop();

    Integer avos13(Integer mes, Boolean calculoFGTS);

    String buscaMes(Integer mes);

    BigDecimal calcexclusivo(BigDecimal valorReferencia, Enum<TipoProcessamento> tipoProcessamento1, Integer diasProcessamento1, Enum<TipoProcessamento> tipoProcessamento2, Integer diasProcessamento2);

    BigDecimal calcprop();

    Integer cedidocomonus();

    Integer cedidosemonus();

    BigDecimal cnvdpbase();

    Integer cnvParaDias();

    Date competenciaInicioFerias();

    String configorgan();

    Boolean contavaga();

    Boolean contrcargniv();

    Date cptabono();

    Date cptcomunic();

    List criaMapa();

    void dadosadic();

    List<getDados> dadosMatricula();

    Date dataNascimentoDependente();

    BigDecimal deducauxmat13();

    BigDecimal descant();

    Integer diasafast(Date dataInicial, Date dataFinal, List<ClassificacaoTipoAfastamento> ClassificacaoTipoAfastamento);

    Integer diasafastcalc30(Date competencia, List<ClassificacaoTipoAfastamento> ClassificacaoTipoAfastamento);

    Integer diasafastcalc30PorDescricao(Enum ClassificacaoTipoAfastamento, String descricao);

    Integer diasaposent();

    Integer diasatestado();

    Integer diasferias();

    Integer diastrab();

    Date dtafast(Enum ClassificacaoTipoAfastamento, Boolean licencaMaternidadeOriginal);

    Date dtrescisao();

    Boolean existePagamento13Salario();

    Integer getDependenteSalarioFamilia();

    BigDecimal getfgtsFerias();

    BigDecimal getFolhaFerias(Integer codigoEvento);

    BigDecimal getInssFerias();

    BigDecimal getIrrfFerias();

    BigDecimal getTotalFerias();

    BigDecimal getValorFerias(Integer codigoEvento, Boolean buscaFolhaPagamento);

    Integer idade();

    List<ClassificacaoTipoAfastamento> listaafastamentos();

    String locaistrabfunc();

    Integer mesesmat13();

    Boolean nivelSalarialCoeficiente();

    String paraString(valor);

    Boolean permitecalc13integral();

    Boolean possuiContribuicaoSindical();

    Boolean recebeDecimoTerceiro();

    Integer recebidosemonus();

    List<getRemuneracao> remuneracao();

    BigDecimal salario(Enum TipoMatricula);

    void semFuncaoExistenteNoFolhaCloud();

    void somenteFuncionarios();

    String tipoRescisao();

    List<TipoProcessamento> tiposProcessamentosEnum();

    BigDecimal faltas(Boolean justificada, Date dataCompetenciaInicial, Date dataCompetenciaFinal, String motivo, Boolean abonada);


}

/**
 * Use dadosMatricula.dataInicio, dadosMatricula.dataSaida e dadosMatricula.existe saída
 * para obter as informações de qualquer tipo de matrícula
 */
interface getDados {
    /**
     * Data de início da matrícula
     */
    Date dataInicio;
    /**
     * Data de saída da matrícula
     */
    Date dataSaida;
    /**
     * Indicativo da existência de uma data de saída da matrícula
     */
    Boolean existeSaida;
}

interface getRemuneracao {
    /**
     * valor da remuneração da matrícula
     */
    BigDecimal valor;
    /**
     * Unidade de pagamento da matrícula da matrícula.
     * Quando não existir retorna MENSALISTA
     */
    Enum unidade;
    /**
     * Quantidade de horas mês da matrícula
     */
    BigDecimal quantidadeHorasMes;
}

