package br.com.fontana.loja.funcionario.dao.impl;

/**
 * Created by te40744 on 19/09/2017.
 */
public class ProceduresFec {

    private static final String CATALOG_NAME_PESQUISA = "PCK_PESQUISA_CLIENTE";
    private static final String CATALOG_NAME_GERENTE = "PCK_GERENTE";
    private static final String CATALOG_NAME_CLIENTE = "PCK_CLIENTE";
    private static final String CATALOG_NAME_HIERARQUIA = "PCK_HIERARQUIA";
    private static final String CATALOG_NAME_CONTATO = "PCK_CONTATO_CLIENTE";
    private static final String AGENDA_ADMIM = "PCK_AGENDA";
    private static final String GERENTE_ADMIM = "PCK_GERENTE";
    private static final String COMPARTILHA_CARTEIRA = "PCK_COMPART_CARTEIRA";
    private static final String CRELI = "PCK_CRELI";
    private static final String COMPROMISSOAGENDA = "PCK_COMPROMISSO";
    private static final String PLANEJAMENTO = "PCK_PLANEJAMENTO";
    private static final String CONTROLE_MALHA = "PCK_CTRL_MALHA";
    private static final String CARGA = "PCK_CARGA";
    private static final String LAYOUT_INFO = "PCK_LAYOUT_INFO";
    private static final String DISTRIB_CAMP = "PCK_DISTRIB_PUBL_CAMP";
    private static final String SAC = "PCK_SAC";
    private static final String CATALOG_NAME_PERGUNTA = "PCK_PERGUNTAS_RESPOSTAS";
    private static final String LOG = "PCK_LOG";
    private static final String PESQUISA_SATISFACAO = "PCK_PESQUISA_SATISFACAO";
    private static final String PIPELINE = "PCK_PIPELINE";
    private static final String PCK_DOWNLOAD_LANCAMENTO = "PCK_DOWNLOAD_LANCAMENTO";
    private static final String GESTAO_MANIFESTACAO = "PCK_GESTAO_MANIFESTACAO";
    private static final String PCK_PASTA_DIGITAL = "PCK_PASTA_DIGITAL";
    private static final String AQO  = "PCK_AQO";

    // Procedure
    private static final String SP_PESQUISA_NOME_CARTEIRA = "sp_PesquisaNomeCarteira";
    private static final String SP_PESQUISA_NOME = "sp_PesquisaNome";
    private static final String SP_PESQUISA_PENUMPER_CARTEIRA = "sp_PesquisaPenumperCarteira";
    private static final String SP_PESQUISA_CPF_CNPJ_CARTEIRA = "sp_PesquisaCpfCnpjCarteira";
    private static final String SP_PESQUISA_NM_GRUPO_CONGLOMERADO = "sp_PesquisaNmGrupoConglomerado";
    private static final String SP_GET_DADOS_GERENTE_CLIENTE = "sp_getDadosGerenteCliente";
    private static final String SP_CON_GERENTE_AGENCIA = "sp_ConGerenteAgencia";
    private static final String SP_GET_INDICADOR_GRUPO_ALVO = "sp_GetIndicadorGrupoAlvo";
    private static final String SP_GET_INDICADOR_VINCULACAO = "sp_GetIndicadorVinculacao";
    private static final String SP_GET_ABORDAGEM_GG_SELECT = "sp_GetAbordagemGGSelect";
    private static final String SP_GET_ABORDAGEM_COMPARTILHADA = "sp_GetAbordagemCompartilhada";
    private static final String SP_GET_AGENCIA_FUSIONADA = "sp_getagenciafusionada";
    private static final String SP_CON_TELEFONE_CONTATO = "sp_ConTelefoneContato";
    private static final String SP_CON_TELEFONE_CONTATO_NOVOS = "sp_ConTelefoneContatoNovos";
    private static final String SP_UPD_TELEFONE_CONTATO = "sp_UpdTelefoneContato";
    private static final String SP_CON_EMAIL_CONTATO = "sp_ConEmailContato";
    private static final String SP_CON_EMAIL_CONTATO_NOVOS = "sp_ConEmailContatoNovos";
    private static final String SP_UPD_EMAIL_CONTATO = "sp_UpdEmailContato";
    private static final String SP_CON_GRUPO_AGENDA = "sp_ConGrupoAgenda";
    private static final String SP_CON_BLOCO_AGENDA = "sp_ConBlocoAgenda";
    private static final String SP_CON_PARAMETRO_AGENDA = "sp_ConParametroAgenda";
    private static final String SP_UPDGRUPOAGENDA = "sp_UpdGrupoAgenda";
    private static final String SP_UPDBLOCOAGENDA = "sp_UpdBlocoAgenda";
    private static final String SP_UPDPARAMETROAGENDA = "sp_UpdParametroAgenda";
    private static final String SP_CONORDBLOCOGRUPO = "sp_ConOrdBlocoGrupo";
    private static final String SP_CONORDBLOCOGRUPOFUNC = "sp_ConOrdBlocoGrupoFunc";
    private static final String SP_UPDORDBLOCOGRUPO = "sp_UpdOrdBlocoGrupo";
    private static final String SP_DELGRUPOAGENDA = "sp_DelGrupoAgenda";
    private static final String SP_DELBLOCOAGENDA = "sp_DelBlocoAgenda";
    private static final String SP_REPLICALAYOUTAGENDA = "sp_ReplicaLayoutAgenda";
    private static final String SP_GETCATEGORIAGERENTE = "sp_GetCategoriaGerente";
    private static final String SP_CONCAMPANHAAGENDA = "sp_ConCampanhaAgenda";
    private static final String SP_CONDADOSLISTACLIENTES = "sp_ConDadosListaClientes";
    private static final String SP_GETHABILITA_LINK_DELEGACAO = "sp_GetHabilitaLinkDelegacao";
    private static final String SP_GETLISTA_FUNCIONARIO_ORIGEM = "sp_GetListaFuncionarioOrigem";
    private static final String SP_GETLISTA_FUNCIONARIO_DESTINO = "sp_GetListaFuncionarioDestino";
    private static final String SP_CON_COMPARTILHA_PORTAL = "sp_ConCompartilhamentoPortal";
    private static final String SP_INS_COMPARTILHA_PORTAL = "sp_InsCompartilhamentoPortal";
    private static final String SP_UP_COMPARTILHA_PORTAL = "sp_UpdCompartilhamentoPortal";
    private static final String SP_EXC_COMPARTILHA_PORTAL = "sp_ExcCompartilhamentoPortal";
    private static final String SP_CON_DELEGACAO_PORTAL = "sp_ConDelegacaoPortal";
    private static final String SP_INS_DELEGACAO_PORTAL = "sp_InsDelegacaoPortal";
    private static final String SP_UP_DELEGACAO_PORTAL = "sp_UpdDelegacaoPortal";
    private static final String SP_EXC_DELEGACAO_PORTAL = "sp_ExcDelegacaoPortal";
    private static final String SP_VISAOHIERARQUIA = "sp_GetVisaoHierarquia";
    private static final String SP_VISAOHIERARQUIA_REMOTA = "sp_GetVisaoHierarquiaRemota";
    private static final String SP_COMBOGERENTEAGENCIA = "sp_GetComboGerenteAgencia";
    private static final String SP_CONCRELICLIENTES = "sp_ConCreliClieAgenda";
    private static final String SP_CONCONTRATOSCRELICLIENTES = "sp_ConContratosCreliClieAgenda";
    private static final String SP_UPDGRAUPAGAMENTOCRELI = "sp_UpdGrauPgtoCreliAgenda";
    private static final String SP_UPDOBSERVACAOCRELI = "sp_UpdObsCreliAgenda";
    private static final String SP_UPDDTAGENDAMETOCRELI = "sp_UpdDtAgendadaCreliAgenda";
    private static final String SP_CONPRECRELICAPAAGENDA = "sp_ConPreCreliCapaAgenda";
    private static final String SP_GETCOMBOGERENTE = "sp_GetComboGerente";
    private static final String SP_GET_CLIENTESCOMPROMISSO = "sp_GetClientesCompromisso";
    private static final String SP_CONCOMPROMISSOCAPAAGENDA = "sp_ConCompromissoCapaAgenda";
    private static final String SP_CONMOTIVOJUSTIFAUSENCIAPLAN = "sp_ConMotivoJustifAusenciaPlan";
    private static final String SP_MANUTATIVIDADEPLAN = "sp_ManutAtividadePlan";
    private static final String SP_EXCJUSTIFAUSENCIAPLAN = "sp_ExcJustifAusenciaPlan";
    private static final String SP_INSJUSTIFAUSENCIAPLAN = "sp_InsJustifAusenciaPlan";
    private static final String SP_GET_HORARIO_CPRO_SISTEMA_ORIGEM = "sp_GetHorarioCproSistemaOrigem";
    private static final String SP_EXC_CPRO_SISTEMA_ORIGEM = "sp_ExcCproSistemaOrigem";
    private static final String SP_INS_CPRO_SISTEMA_ORIGEM = "sp_InsCproSistemaOrigem";
    private static final String SP_UPD_DATA_CPRO_SISTEMA_ORIGEM = "sp_UpdDataCproSistemaOrigem";
    private static final String SP_CONATIVIDADEPLAN = "sp_ConAtividadePlan";
    private static final String SP_CONTIPOATIVIDADEPLAN = "sp_ConTipoAtividadePlan";
    private static final String SP_CONDIASFERIADO = "sp_ConDiasFeriado";
    private static final String SP_CONGRIDPLANEJAMENTO = "sp_ConGridPlanejamento";
    private static final String SP_RELDINAMICO = "sp_RelDinamico";
    private static final String SP_RELDINAMICOEXEC = "sp_Exec_Cmd";
    private static final String SP_CON_GERENTES_DIA_PICO_PLAN = "sp_ConGerentesDiaPicoPlan";
    private static final String SP_CON_DIAS_PICO_PLAN = "sp_ConDiasPicoPlan";
    private static final String SP_EXC_TODOS_DIA_PICO_PLAN = "sp_ExcTodosDiaPicoPlan";
    private static final String SP_UPD_DIA_PICO_PLAN = "sp_UpdDiaPicoPlan";
    private static final String SP_CON_PARM_DIA_PICO = "sp_ConParmDiaPico";
    private static final String SP_GET_COMBO_GERENTE_PLAN = "sp_GetComboGerentePlan";
    private static final String SP_CON_PARM_LIMITE_DIARIO = "sp_ConParmLimiteDiario";
    private static final String SP_CON_PARM_LIMITE_DIARIO_ATVD = "sp_ConParmLimiteDiarioAtvd";
    private static final String SP_GET_COMBO_GERENTE_MATR_PLAN = "sp_GetComboGerenteMatrPlan";
    private static final String SP_GET_GERENTE_CLASSICO = "sp_GetGerenteClassico";
    private static final String SP_GET_PERMISSAO_ABORDAGEM = "sp_GetPermissaoAbordagem";
    private static final String SP_SET_MBS_GERENTE = "sp_SetMBSGerente";
    private static final String SP_CON_DADOS_CLIE = "sp_ConDadosCliente";
    private static final String SP_CON_CONTROLE_HORA_ATVD_ADM_PLAN = "sp_ConControleHoraAtvdADMPlan";
    private static final String SP_LIMPA_ATVD_PLAN = "sp_LimpaAtvdPlan";
    private static final String SP_CON_VIGENCIA_LABEL = "sp_ConvigenciaLabel";
    private static final String SP_EXC_VIGENCIA_LABEL = "sp_ExcVigenciaLabel";
    private static final String SP_UPD_VIGENCIA_LABEL = "sp_UpdVigenciaLabel";
    private static final String SP_UPD_VIGENCIA_LABEL_IMAGEM = "sp_UpdVigenciaLabelImagem";
    private static final String SP_COMBOFUNCIONALIDADE = "sp_ComboFuncionalidade";
    private static final String SP_CONASSOCINFOFUNCIONAL = "sp_Conassocinfofuncional";
    private static final String SP_GETLISTAVIGENCIAS = "sp_Getlistavigencias";
    private static final String SP_UPDASSOCINFOFUNCIONAL = "sp_Updassocinfofuncional";
    private static final String SP_CON_INFO_CLIENTE_COLUNAS = "sp_ConInfoClienteColunas";
    private static final String SP_COMBO_GET_CAMPANHA = "sp_combogetcampanha";
    private static final String SP_COMBO_GET_FUNC_ORIGEM = "sp_comboGetFuncOrigem";
    private static final String SP_COMBO_GET_FUNC_DESTINO = "sp_comboGetFuncDestino";
    private static final String SP_GETPERCENTUALCLIENTE = "sp_GetPercentualCliente";
    private static final String SP_FILTRO = "sp_Filtro";
    private static final String SP_REPLICA_PROXIMAS_SEMANAS = "sp_UpdSemanaPadraoPlan";
    private static final String SP_CON_DADOS_LOGIN = "sp_ConDadosLogin";
    private static final String SP_CARREGA_COMBO_REDE = "sp_CarregaComboRede";
    private static final String SP_CARREGA_COMBO_REGIONAL = "sp_CarregaComboRegional";
    private static final String SP_GET_AGENCIA_SAC = "sp_GetAgenciaSAC";
    private static final String SP_GET_LOCAL_FUNCIONARIO = "sp_GetLocalFuncionario";
    private static final String SP_UPD_DISTRIBUICAO = "sp_UpdDistribuicao";
    private static final String SP_DEL_DISTRIBUICAO = "sp_DelDistribuicao";
    private static final String SP_GET_REDISTRIBUICAO_DIA = "sp_GetRedistribuicaoDia";
    private static final String SP_CARREGA_COMBO_GERENTE = "sp_CarregaComboGerente";
    private static final String SP_GET_GERENTE_MANIFESTACAO = "SP_GETGERENTEMANIFESTACAO";
    private static final String SP_CONDELEGACAOPLAN = "sp_ConDelegacaoPlan";
    private static final String SP_UPDDELEGACAOPLAN = "sp_UpdDelegacaoPlan";
    private static final String SP_INSDELEGACAOPLAN = "sp_InsDelegacaoPlan";
    private static final String SP_EXCDELEGACAOPLAN = "sp_ExcDelegacaoPlan";
    private static final String SP_CONAVISODELEGACAOPLAN = "sp_ConAvisoDelegacaoPlan";
    private static final String SP_UPAVISODELEGACAOPLAN = "sp_UpdAvisoDelegacaoPlan";
    private static final String SP_GETAGENCIAMADRINHA = "sp_GetAgenciaMadrinha";
    private static final String SP_GETRESPOSTAS = "sp_GetRespostas";
    private static final String SP_GETRESPOSTASMAISACESSADAS = "sp_GetRespostasMaisAcessadas";
    private static final String SP_PERMISSAO_ABORDAGEM_CAMP = "sp_GetPermissaoAbordagemCamp";
    private static final String SP_CONTIMELINE = "SP_CONTIMELINE";
    private static final String SP_CONCALENDARIOMALHA = "SP_CONCALENDARIOMALHA";
    private static final String SP_CONVISAOMALHA = "SP_CONVISAOMALHA";
    private static final String SP_CONVISAOMALHADETALHE = "SP_CONVISAOMALHADETALHE";
    private static final String SP_CONPOPUPLOGDETALHE = "SP_CONPOPUPLOGDETALHE";
    private static final String SP_CONTEMPOMEDIO = "SP_CONTEMPOMEDIO";
    private static final String SP_GETLISTAPROCESSOS = "SP_GETLISTAPROCESSOS";
    private static final String SP_GETLISTASUBPROCESSOS = "SP_GETLISTASUBPROCESSOS";
    private static final String SP_UPDNOMEBLOCOAGENDA = "sp_UpdNomeBlocoAgenda";
    private static final String SP_CONCAPAAGENDA = "sp_ConCapaAgenda";
    private static final String SP_SETHISTORICOPESQUISA = "sp_SetHistoricoPesquisa";
    private static final String SP_GETHISTORICOPESQUISA = "sp_GetHistoricoPesquisa";
    private static final String SP_GETDADOSCONSISTGERENTE = "sp_GetDadosConsistGerente";
    private static final String SP_GETDADOSCARTEIRADETALHE = "sp_GetDadosCarteiraDetalhe";
    private static final String SP_GETDADOSGERENTE = "sp_GetDadosGerente";
    private static final String SP_CONDETALHEREGRACONTATOPLAN = "sp_ConDetalheRegraContatoPlan";
    private static final String SP_UPDNOMEGRUPOAGENDA = "sp_UpdNomeGrupoAgenda";
    private static final String SP_GETSTATUSCLIENTE =  "sp_GetStatusCliente";
    private static final String SP_GETPERMISSAOABORDAGEMREMOTO = "sp_GetPermissaoAbordagemRemoto";
    private static final String SP_LOGCOMPLETOAGRUP = "sp_LogCompletoAgrup";
    private static final String SP_GETTODASPESQUISAS = "sp_GetTodasPesquisas";
    private static final String SP_EXCPESQUISA = "sp_ExcPesquisa";
    private static final String SP_CONPESQUISA = "sp_ConPesquisa";
    private static final String SP_UPDPESQUISA = "sp_UpdPesquisa";
    private static final String SP_UPDPRORROGACAOPESQUISA = "sp_UpdProrrogacaoPesquisa";
    private static final String SP_VERIFICALOGINPESQUISA = "sp_VerificaLoginPesquisa";
    private static final String SP_UPDRESPQUESTIONARIOPESQUISA = "sp_UpdRespQuestionarioPesquisa";
    private static final String SP_UPDPESQUISAANDAMENTO = "sp_UpdPesquisaAndamento";
    private static final String SP_CONPIPELINE = "sp_ConPipeline";
    private static final String SP_INSUPDPIPELINE = "sp_InsUpdPipeline";
    private static final String SP_CONOBSPIPELINE = "sp_ConObsPipeline";
    private static final String SP_INSOBSPIPELINE = "sp_InsObsPipeline";
    private static final String SP_CONCOMBOPREVCREDITO = "sp_concomboprevcredito";
    private static final String SP_CONCOMBOETAPAIMPLANT = "sp_ConComboEtapaImplant";
    private static final String SP_CONMODULOHIER = "sp_ConModuloHier";
    private static final String SP_CONCOMBOPERIODO = "sp_ConComboPeriodo";
    private static final String SP_GETCOMBOGERENTEPIPELINE = "sp_GetComboGerente";
    private static final String SP_CONCOMBOSTATUSNEGOCIACAO = "sp_ConComboStatusNegociacao";
    private static final String SP_GETCPROBAIXADO = "sp_GetCproBaixado";
    private static final String SP_GETCOMBOGERENTEATIVIDADE = "sp_GetComboGerenteAtividades";
    private static final String SP_GETINFOCONSIGNADO = "sp_GetInfoConsignado";
    private static final String SP_GETAGENCIAINFO ="sp_GetAgenciaInfo";
    private static final String SP_GETEQUIPETEAMLEADER ="sp_GetEquipeTeamLeader";
    private static final String SP_EXCASSUNTO ="sp_ExcAssunto";
    private static final String SP_UPDASSUNTO = "sp_UpdAssunto";
    private static final String SP_CONASSUNTO = "sp_ConAssunto";
    private static final String SP_CONVERSAOASSUNTO = "sp_ConVersaoAssunto";
    private static final String SP_INSVERSAO_STEP01 = "sp_InsVersao_Step01";
    private static final String SP_CONVERSAO_STEP01 = "sp_ConVersao_Step01";
    private static final String SP_INSVERSAO_STEP02 = "sp_InsVersao_Step02";
    private static final String SP_CONVERSAO_STEP02 = "sp_ConVersao_Step02";
    private static final String SP_INSVERSAO_STEP03 = "sp_InsVersao_Step03";
    private static final String SP_CONVERSAO_STEP03 = "sp_ConVersao_Step03";
    private static final String SP_INSVERSAO_STEP04 = "sp_UpdStatusLancamento";
    private static final String SP_EXCVERSAO  ="sp_ExcVersaoLancamento";
    private static final String SP_CONVERSOES  ="sp_ConListaVersao";
    private static final String SP_CONATUALIZACOESPENDENTES = "sp_ConVerificaAtlzPend";
    private static final String SP_INSVISUALIZACAOFUNC = "sp_InsVisualizacaoFunc";
    private static final String SP_INSVERMAISTARDE = "sp_InsVerMaisTarde";
    private static final String SP_PESQ_MATRICULA = "sp_PesqMatricula";
    private static final String SP_PESQ_PALAVRA_CHAVE = "sp_PesqPalavraChave";
    private static final String SP_PESQ_ASSUNTO = "sp_PesqAssunto";
    private static final String SP_CONTIPOAGENCIA ="sp_ConTipoAgencia";
    private static final String SP_CONTIPOATENDREMOTO ="sp_ConTipoAtendRemoto";
    private static final String SP_ALTERAPROCESSOLOG ="sp_AlteraStatusProcessoLog";
    private static final String SP_CONSULTAPROCESSO = "sp_ConsultaProcesso";
    private static final String SP_GETVISAOCOMPARTILHADOS ="sp_GetVisaoCompartilhados";
    private static final String SP_GETCOMBOGERENTEREMOTO = "sp_GetComboGerenteRemoto";
    private static final String SP_CONPASTADIGITALAGENDA = "sp_ConPastaDigitalAgenda";
    private static final String SP_CONHIERTRATAMENTO = "sp_ConHierTratamento";
    private static final String SP_COMPRODUTO = "sp_ConProduto";
    private static final String SP_COMSINTOMA = "sp_ConSintoma";
    private static final String SP_CONGRUPOFAMILIA = "sp_ConGrupoFamilia";
    private static final String SP_CONANALITTRATAMENTO = "sp_ConAnalitTratamento";
    private static final String SP_CONRELATORIOTOTAL = "sp_ConRelatorioTotal";

    private static final String SP_CONAQOAGENDA = "sp_ConAQOAgenda";
    private static final String SP_CONOBSAQOAGENDA = "sp_ConObsAQOAgenda";
    private static final String SP_UPDAQOAGENDA = "sp_UpdAQOAgenda";
    private static final String SP_CONRELPASTADIGITALGERENTE = "sp_ConRelPastaDigitalGerente";
    private static final String SP_CONHIERRELPASTADIGITAL = "sp_ConHierRelPastaDigital";

    
    public static String getSpPesquisaNomeCarteira() {
        return CATALOG_NAME_PESQUISA+"."+SP_PESQUISA_NOME_CARTEIRA;
    }

    public static String getSpPesquisaNome() {
        return CATALOG_NAME_PESQUISA+"."+SP_PESQUISA_NOME;
    }

    public static String getSpDadosGerenteCliente() {
        return CATALOG_NAME_GERENTE+"."+SP_GET_DADOS_GERENTE_CLIENTE;
    }

    public static String getSpConGerenteAgencia() {
        return CATALOG_NAME_GERENTE+"."+SP_CON_GERENTE_AGENCIA;
    }

    public static String getSpIndicadorGrupoAlvo() {
        return CATALOG_NAME_CLIENTE+"."+SP_GET_INDICADOR_GRUPO_ALVO;
    }

    public static String getSpIndicadorVinculacao() {
        return CATALOG_NAME_CLIENTE+"."+SP_GET_INDICADOR_VINCULACAO;
    }

    public static String getSpGetAbordagemGGSelect() {
        return CATALOG_NAME_CLIENTE+"."+SP_GET_ABORDAGEM_GG_SELECT;
    }

    public static String getSpGetAbordagemCompartilhada() {
        return CATALOG_NAME_CLIENTE+"."+SP_GET_ABORDAGEM_COMPARTILHADA;
    }

    public static String getSpAgenciafusionada() {
        return CATALOG_NAME_HIERARQUIA+"."+SP_GET_AGENCIA_FUSIONADA;
    }

    public static String getSpPesquisaNmGrupoConglomerado() {
        return CATALOG_NAME_PESQUISA+"."+SP_PESQUISA_NM_GRUPO_CONGLOMERADO;
    }

    public static String getSpConTelefoneContato() {
        return CATALOG_NAME_CONTATO+"."+SP_CON_TELEFONE_CONTATO;
    }

    public static String getSpConTelefoneContatoNovos() {
        return CATALOG_NAME_CONTATO+"."+SP_CON_TELEFONE_CONTATO_NOVOS;
    }

    public static String getSpUpdTelefoneContato() {
        return CATALOG_NAME_CONTATO+"."+SP_UPD_TELEFONE_CONTATO;
    }

    public static String getSpConEmailContato() {
        return CATALOG_NAME_CONTATO+"."+SP_CON_EMAIL_CONTATO;
    }

    public static String getSpConEmailContatoNovos() {
        return CATALOG_NAME_CONTATO+"."+SP_CON_EMAIL_CONTATO_NOVOS;
    }

    public static String getSpUpdEmailContato() {
        return CATALOG_NAME_CONTATO+"."+SP_UPD_EMAIL_CONTATO;
    }

    public static String getSpConGrupoAgenda() {
        return AGENDA_ADMIM+"."+SP_CON_GRUPO_AGENDA;
    }

    public static String getSpConBlocoAgenda() {
        return AGENDA_ADMIM+"."+SP_CON_BLOCO_AGENDA;
    }

    public static String getSpConParametroAgenda() {
        return AGENDA_ADMIM+"."+SP_CON_PARAMETRO_AGENDA;
    }

    public static String getSpUpdGrupoAgenda() {
        return AGENDA_ADMIM+"."+SP_UPDGRUPOAGENDA;
    }

    public static String getSpUpdBlocoAgenda() {
        return AGENDA_ADMIM+"."+SP_UPDBLOCOAGENDA;
    }

    public static String getSpUpdParametroAgenda() {
        return AGENDA_ADMIM+"."+SP_UPDPARAMETROAGENDA;
    }

    public static String getSpDelGrupoAgenda() {
        return AGENDA_ADMIM+"."+SP_DELGRUPOAGENDA;
    }

    public static String getSpDelBlocoAgenda() {
        return AGENDA_ADMIM+"."+SP_DELBLOCOAGENDA;
    }

    public static String getSpReplicaLayoutAgenda() {
        return AGENDA_ADMIM+"."+SP_REPLICALAYOUTAGENDA;
    }

    public static String getSpGetCategoriaGerente() {
        return GERENTE_ADMIM+"."+SP_GETCATEGORIAGERENTE;
    }

    public static String getSpConCampanhaAgenda() {
        return AGENDA_ADMIM+"."+SP_CONCAMPANHAAGENDA;
    }

    public static String getSpGetSpConDadosListaClientes() {
        return AGENDA_ADMIM+"."+SP_CONDADOSLISTACLIENTES;
    }

    public static String getSpConOrdBlocoGrupo() {
        return AGENDA_ADMIM+"."+SP_CONORDBLOCOGRUPO;
    }

    public static String getSpConOrdBlocoGrupoFunc() {
        return AGENDA_ADMIM+"."+SP_CONORDBLOCOGRUPOFUNC;
    }

    public static String getSpUpdOrdBlocoGrupo(){
        return AGENDA_ADMIM+"."+SP_UPDORDBLOCOGRUPO;
    }

    public static String getSpGetHabilitaLinkDelegacao() {
        return COMPARTILHA_CARTEIRA+"."+SP_GETHABILITA_LINK_DELEGACAO;
    }

    public static String getSpGetListaFuncionarioOrigem() {
        return COMPARTILHA_CARTEIRA+"."+SP_GETLISTA_FUNCIONARIO_ORIGEM;
    }

    public static String getSpGetListaFuncionarioDestino() {
        return COMPARTILHA_CARTEIRA+"."+SP_GETLISTA_FUNCIONARIO_DESTINO;
    }

    public static String getSpConCompartilhamentoPortal() {
        return COMPARTILHA_CARTEIRA+"."+SP_CON_COMPARTILHA_PORTAL;
    }

    public static String getSpInsCompartilhamentoPortal() {
        return COMPARTILHA_CARTEIRA+"."+SP_INS_COMPARTILHA_PORTAL;
    }

    public static String getSpUpdCompartilhamentoPortal() {
        return COMPARTILHA_CARTEIRA+"."+SP_UP_COMPARTILHA_PORTAL;
    }

    public static String getSpExcCompartilhamentoPortal() {
        return COMPARTILHA_CARTEIRA+"."+SP_EXC_COMPARTILHA_PORTAL;
    }

    public static String getSpConDelegacaoPortal() {
        return COMPARTILHA_CARTEIRA+"."+SP_CON_DELEGACAO_PORTAL;
    }

    public static String getSpInsDelegacaoPortal() {
        return COMPARTILHA_CARTEIRA+"."+SP_INS_DELEGACAO_PORTAL;
    }

    public static String getSpUpdDelegacaoPortal() {
        return COMPARTILHA_CARTEIRA+"."+SP_UP_DELEGACAO_PORTAL;
    }

    public static String getSpExcDelegacaoPortal() {
        return COMPARTILHA_CARTEIRA+"."+SP_EXC_DELEGACAO_PORTAL;
    }

    public static String getSpGetVisaoHierarquia() {
        return CATALOG_NAME_HIERARQUIA+"."+SP_VISAOHIERARQUIA;
    }

    public static String getSpGetComboGerenteAgencia() {
        return CATALOG_NAME_HIERARQUIA+"."+SP_COMBOGERENTEAGENCIA;
    }

    public static String getSpConCreliClientes() {
        return CRELI+"."+SP_CONCRELICLIENTES;
    }

    public static String getSpConContratosCreliClientes() {
        return CRELI+"."+SP_CONCONTRATOSCRELICLIENTES;
    }

    public static String updGrauPgtoCreliAgenda() {
        return CRELI+"."+SP_UPDGRAUPAGAMENTOCRELI;
    }

    public static String updObsCreliAgenda() {
        return CRELI+"."+SP_UPDOBSERVACAOCRELI;
    }

    public static String updDataAgendamentoCreliAgenda() {
        return CRELI+"."+SP_UPDDTAGENDAMETOCRELI;
    }

    public static String getSpConPreCreliCapaAgenda() {
        return CRELI+"."+SP_CONPRECRELICAPAAGENDA;
    }

    public static String getSpGetComboGerente() {
        return CATALOG_NAME_HIERARQUIA+"."+SP_GETCOMBOGERENTE;
    }

    public static String getSpClientesCompromisso() {
        return COMPROMISSOAGENDA+"."+SP_GET_CLIENTESCOMPROMISSO;
    }

    public static String getSpConCompromissoCapaAgenda() {
        return COMPROMISSOAGENDA+"."+SP_CONCOMPROMISSOCAPAAGENDA;
    }

    public static String getSpConMotivoJustifAusenciaPlan() {
        return PLANEJAMENTO+"."+SP_CONMOTIVOJUSTIFAUSENCIAPLAN;
    }

    public static String getSpManutAtividadePlan() {
        return PLANEJAMENTO+"."+SP_MANUTATIVIDADEPLAN;
    }

    public static String getSpExcJustifAusenciaPlan() {
        return PLANEJAMENTO+"."+SP_EXCJUSTIFAUSENCIAPLAN;
    }

    public static String getSpInsJustifAusenciaPlan() {
        return PLANEJAMENTO+"."+SP_INSJUSTIFAUSENCIAPLAN;
    }

    public static String getSpGetHorarioCproSistemaOrigem() {
        return COMPROMISSOAGENDA+"."+SP_GET_HORARIO_CPRO_SISTEMA_ORIGEM;
    }

    public static String getSpExcCproSistemaOrigem() {
        return COMPROMISSOAGENDA+"."+SP_EXC_CPRO_SISTEMA_ORIGEM;
    }

    public static String getSpInsCproSistemaOrigem() {
        return COMPROMISSOAGENDA+"."+SP_INS_CPRO_SISTEMA_ORIGEM;
    }

    public static String getSpUpdDataCproSistemaOrigem() {
        return COMPROMISSOAGENDA+"."+SP_UPD_DATA_CPRO_SISTEMA_ORIGEM;
    }

    public static String getSpConAtividadePlan() {
        return PLANEJAMENTO+"."+SP_CONATIVIDADEPLAN;
    }

    public static String getSpConTipoAtividadePlan() {
        return PLANEJAMENTO+"."+SP_CONTIPOATIVIDADEPLAN;
    }

    public static String getSpConDiasFeriado() {
        return PLANEJAMENTO+"."+SP_CONDIASFERIADO;
    }

    public static String getSpConGridPlanejamento() {

        return PLANEJAMENTO+"."+SP_CONGRIDPLANEJAMENTO;
    }

    public static String getSpRelDinamico() {
        return CONTROLE_MALHA+"."+SP_RELDINAMICO;
    }

    public static String getSpRelDinamicoExecFecProc() {
        return CARGA+"."+SP_RELDINAMICOEXEC;
    }

    public static String getSpConGerentesDiaPicoPlan() {
        return PLANEJAMENTO+"."+SP_CON_GERENTES_DIA_PICO_PLAN;
    }

    public static String spConDiasPicoPlan() {
        return PLANEJAMENTO+"."+SP_CON_DIAS_PICO_PLAN;
    }

    public static String getSpExcTodosDiaPicoPlan() {
        return PLANEJAMENTO+"."+SP_EXC_TODOS_DIA_PICO_PLAN;
    }

    public static String getSpUpdDiaPicoPlan() {
        return PLANEJAMENTO+"."+SP_UPD_DIA_PICO_PLAN;
    }

    public static String getSpConParmDiaPico() {
        return PLANEJAMENTO+"."+SP_CON_PARM_DIA_PICO;
    }

    public static String getSpGetBuscaGerentePlan() {
        return PLANEJAMENTO+"."+SP_GET_COMBO_GERENTE_PLAN;
    }

    public static String getSpConParmLimiteDiario() {
        return PLANEJAMENTO+"."+SP_CON_PARM_LIMITE_DIARIO;
    }

    public static String getSpConParmLimiteDiarioAtvd() {
        return PLANEJAMENTO+"."+SP_CON_PARM_LIMITE_DIARIO_ATVD;
    }

    public static String getSpComboGerenteMatrPlan() {
        return PLANEJAMENTO+"."+SP_GET_COMBO_GERENTE_MATR_PLAN;
    }

    public static String getGerenteClassico() {

        return GERENTE_ADMIM+"."+SP_GET_GERENTE_CLASSICO;
    }

    public static String getPermissaoAbordagem() {

        return GERENTE_ADMIM+"."+SP_GET_PERMISSAO_ABORDAGEM;
    }

    public static String setMBSGerente() {

        return GERENTE_ADMIM+"."+SP_SET_MBS_GERENTE;
    }

    public static String getSpConDadosClie() {
        return CATALOG_NAME_CLIENTE+"."+SP_CON_DADOS_CLIE;
    }

    public static String getSpConControleHoraAtvdADMPlan() {
        return PLANEJAMENTO+"."+SP_CON_CONTROLE_HORA_ATVD_ADM_PLAN;
    }

    public static String getSpLimpaAtvdPlan() {

        return PLANEJAMENTO+"."+SP_LIMPA_ATVD_PLAN;
    }

    public static String getSpConVigenciaLabel() {
        return LAYOUT_INFO+"."+SP_CON_VIGENCIA_LABEL;
    }

    public static String getSpExcVigenciaLabel() {
        return LAYOUT_INFO+"."+SP_EXC_VIGENCIA_LABEL;
    }

    public static String getSpUpdVigenciaLabel() {
        return LAYOUT_INFO+"."+SP_UPD_VIGENCIA_LABEL;

    }

    public static String getSpUpdVigenciaLabelImagem() {
        return LAYOUT_INFO+"."+SP_UPD_VIGENCIA_LABEL_IMAGEM;
    }

    public static String getSpComboFuncionalidade() {

        return LAYOUT_INFO+"."+SP_COMBOFUNCIONALIDADE;
    }

    public static String getSpConAssocInfoFuncional() {

        return LAYOUT_INFO+"."+SP_CONASSOCINFOFUNCIONAL;
    }

    public static String getSpGetListaVigencias() {

        return LAYOUT_INFO+"."+SP_GETLISTAVIGENCIAS;
    }

    public static String getSpUpdAssocInfoFuncional() {

        return LAYOUT_INFO+"."+SP_UPDASSOCINFOFUNCIONAL;
    }

    public static String getSpConInfoClienteColunas() {
        return LAYOUT_INFO+"."+SP_CON_INFO_CLIENTE_COLUNAS;
    }

    public static String getSpComboGetCampanha() {
        return DISTRIB_CAMP+"."+SP_COMBO_GET_CAMPANHA;
    }

    public static String getSpComboGetFuncOrigem() {
        return DISTRIB_CAMP+"."+SP_COMBO_GET_FUNC_ORIGEM;
    }

    public static String getSpComboGetFuncDestino() {
        return DISTRIB_CAMP+"."+SP_COMBO_GET_FUNC_DESTINO;
    }

    public static String getSpReplicarProximasSemanas() {
        return PLANEJAMENTO+"."+SP_REPLICA_PROXIMAS_SEMANAS;
    }

    public static String getSpPercentualCliente() {
        return DISTRIB_CAMP+"."+SP_GETPERCENTUALCLIENTE;
    }

    public static String getSpFiltro() {
        return DISTRIB_CAMP+"."+SP_FILTRO;
    }

    public static String getSpConDadosLogin() {
        return CATALOG_NAME_HIERARQUIA+"."+SP_CON_DADOS_LOGIN;
    }

    public static String getSpCarregaComboRede() {
        return SAC+"."+SP_CARREGA_COMBO_REDE;
    }

    public static String getSpCarregaComboRegional() {
        return SAC+"."+SP_CARREGA_COMBO_REGIONAL;
    }

    public static String getSpGetLocalFuncionario() {
        return SAC+"."+SP_GET_LOCAL_FUNCIONARIO;
    }

    public static String getSpUpdDistribuicao() {
        return DISTRIB_CAMP+"."+SP_UPD_DISTRIBUICAO;
    }

    public static String getSpRedistribuicaoDia() {
        return DISTRIB_CAMP+"."+SP_GET_REDISTRIBUICAO_DIA;
    }

    public static String getSpAgenciaSac() {
        return CATALOG_NAME_HIERARQUIA+"."+SP_GET_AGENCIA_SAC;
    }

    public static String getSpCarregaComboGerente() {
        return SAC+"."+SP_CARREGA_COMBO_GERENTE;
    }

    public static String getSpGetGerenteManisfestacao() {
        return SAC+"."+SP_GET_GERENTE_MANIFESTACAO;
    }

    public static String getSpConDelegacaoPlan() {
        return PLANEJAMENTO+"."+SP_CONDELEGACAOPLAN;
    }

    public static String getSpUpdDelegacaoPlan() {
        return PLANEJAMENTO+"."+SP_UPDDELEGACAOPLAN;
    }

    public static String getSpInsDelegacaoPlan() {
        return PLANEJAMENTO+"."+SP_INSDELEGACAOPLAN;
    }

    public static String getSpExcDelegacaoPlan() {
        return PLANEJAMENTO+"."+SP_EXCDELEGACAOPLAN;
    }

    public static String getSpConAvisoDelegacaoPlan() {
        return PLANEJAMENTO+"."+SP_CONAVISODELEGACAOPLAN;
    }

    public static String getSpDelDistribuicao() {
        return DISTRIB_CAMP+"."+SP_DEL_DISTRIBUICAO;
    }

    public static String getSpUpdAvisoDelegacaoPlan() {
        return PLANEJAMENTO+"."+SP_UPAVISODELEGACAOPLAN;
    }

    public static String getSpSelAgenciaMadrinha() {
        return CATALOG_NAME_HIERARQUIA+"."+SP_GETAGENCIAMADRINHA;
    }

    public static String getSpGetRespostas() {
        return CATALOG_NAME_PERGUNTA+"."+SP_GETRESPOSTAS;
    }

    public static String getSpConsultarTimeLine() {
        return CONTROLE_MALHA+"."+SP_CONTIMELINE;
    }

    public static String getSpConsultarCalendarioMalha() {
        return CONTROLE_MALHA+"."+SP_CONCALENDARIOMALHA;
    }

    public static String getSpConsultarMalha() {
        return CONTROLE_MALHA+"."+SP_CONVISAOMALHA;
    }

    public static String getSpConsultarDetalheMalha() {
        return CONTROLE_MALHA+"."+SP_CONVISAOMALHADETALHE;
    }

    public static String getSpConsultarPopUpDetalheMalha() {
        return CONTROLE_MALHA+"."+SP_CONPOPUPLOGDETALHE;
    }

    public static String getSpGetVisaoGeralGerente() {
        return GERENTE_ADMIM+"."+SP_GETDADOSCONSISTGERENTE;
    }

    public static String getSpGetDadosCarteiraDetalhe() {
        return GERENTE_ADMIM+"."+SP_GETDADOSCARTEIRADETALHE;
    }

    public static String getSpPermissaoAbordagemCamp() {
        return CATALOG_NAME_CLIENTE+"."+SP_PERMISSAO_ABORDAGEM_CAMP;
    }

    public static String getSpAtualizaNmBlocoAgenda() {

        return AGENDA_ADMIM+"."+SP_UPDNOMEBLOCOAGENDA;
    }

    public static String getSpConsultaCapaAgenda() {

        return AGENDA_ADMIM+"."+SP_CONCAPAAGENDA;
    }

    public static String getSpConsultarTempoMedioMalha() {

        return CONTROLE_MALHA+"."+SP_CONTEMPOMEDIO;
    }

    public static String getSpListarProcessosMalha() {

        return CONTROLE_MALHA+"."+SP_GETLISTAPROCESSOS;
    }

    public static String getSpListarSubProcessosMalha() {

        return CONTROLE_MALHA+"."+SP_GETLISTASUBPROCESSOS;
    }

    public static String getSpSetHistoricoPesquisaCpfCnpj() {
        return CATALOG_NAME_PESQUISA+"."+SP_SETHISTORICOPESQUISA;
    }

    public static String getSpGetHistoricoPesquisaCpfCnpj() {
        return CATALOG_NAME_PESQUISA+"."+SP_GETHISTORICOPESQUISA;
    }

    public static String getSpLogCompletoAgrup() {

        return LOG+"."+SP_LOGCOMPLETOAGRUP;
    }

    public static String getRespostasMaisAcessadas() {
        return CATALOG_NAME_PERGUNTA+"."+SP_GETRESPOSTASMAISACESSADAS;
    }

    public static String getDadosGerente() {
        return GERENTE_ADMIM+"."+SP_GETDADOSGERENTE;
    }

    public static String getSpAtualizaNmGrupoAgenda() {
        return AGENDA_ADMIM+"."+SP_UPDNOMEGRUPOAGENDA;
    }

    public static String getSpGetVisaoHierarquiaRemota() {
        return CATALOG_NAME_HIERARQUIA+"."+SP_VISAOHIERARQUIA_REMOTA;
    }

    public static String getSpConDetalheRegraContatoPlan() {
        return PLANEJAMENTO+"."+SP_CONDETALHEREGRACONTATOPLAN;
    }

    public static String getSpComboGerente() {
        return COMPROMISSOAGENDA+"."+SP_GETCOMBOGERENTE;
    }

    public static String getSpPesquisaPenumperCarteira() {
        return CATALOG_NAME_PESQUISA+"."+SP_PESQUISA_PENUMPER_CARTEIRA;
    }

    public static String getSpPesquisaCpfCnpjCarteira() {
        return CATALOG_NAME_PESQUISA+"."+SP_PESQUISA_CPF_CNPJ_CARTEIRA;
    }

    public static String getSpGetStatusCliente() {
        return CATALOG_NAME_CLIENTE+"."+SP_GETSTATUSCLIENTE;
    }

    public static String getSpGetTodasPesquisas() {
        return PESQUISA_SATISFACAO+"."+SP_GETTODASPESQUISAS;
    }

    public static String getSpExcPesquisa() {
        return PESQUISA_SATISFACAO+"."+SP_EXCPESQUISA;
    }

    public static String getSpConPesquisa() {
        return PESQUISA_SATISFACAO+"."+SP_CONPESQUISA;
    }

    public static String getSpUpdPesquisa() {
        return PESQUISA_SATISFACAO+"."+SP_UPDPESQUISA;
    }

    public static String getSpUpdProrrogacaoPesquisa() {
        return PESQUISA_SATISFACAO+"."+SP_UPDPRORROGACAOPESQUISA;
    }

    public static String getSpVerificaLoginPesquisa() {
        return PESQUISA_SATISFACAO+"."+SP_VERIFICALOGINPESQUISA;
    }

    public static String getSpUpdRespQuestionarioPesquisa() {
        return PESQUISA_SATISFACAO+"."+SP_UPDRESPQUESTIONARIOPESQUISA;
    }

    public static String getSpUpdPesquisaAndamento() {
        return PESQUISA_SATISFACAO+"."+SP_UPDPESQUISAANDAMENTO;
    }

    public static String getSpInsUpdPipeLine() {
        return PIPELINE+"."+SP_INSUPDPIPELINE;
    }

    public static String getSpConPipeLine() {
        return PIPELINE+"."+SP_CONPIPELINE;
    }

    public static String getSpConObsPipeLine() {
        return PIPELINE+"."+SP_CONOBSPIPELINE;
    }

    public static String getSpInsObsPipeLine() {
        return PIPELINE+"."+SP_INSOBSPIPELINE;
    }
    public static String getSpConComboPrevCredito() {
        return PIPELINE+"."+SP_CONCOMBOPREVCREDITO;
    }

    public static String getSpConComboEtapaImplant() {
        return PIPELINE+"."+SP_CONCOMBOETAPAIMPLANT;
    }

    public static String getSpConModuloHier() {
        return PIPELINE+"."+SP_CONMODULOHIER;
    }

    public static String getSpConComboPeriodo() {
        return PIPELINE+"."+SP_CONCOMBOPERIODO;
    }
    public static String getSpGetComboGerentePipeLine() {
        return PIPELINE+"."+SP_GETCOMBOGERENTEPIPELINE;
    }
    public static String getSpConComboStatusNegociacao() {
        return PIPELINE+"."+SP_CONCOMBOSTATUSNEGOCIACAO;
    }
    public static String getSpGetCproBaixado() {
        return PIPELINE+"."+SP_GETCPROBAIXADO;
    }
    public static String getSpGetPermissaoAbordagemRemoto() {
        return CATALOG_NAME_CLIENTE+"."+SP_GETPERMISSAOABORDAGEMREMOTO;
    }

    public static String getSpExcAssunto() {
        return PCK_DOWNLOAD_LANCAMENTO+"."+SP_EXCASSUNTO;
    }

    public static String getSpUpdAssunto() {
        return PCK_DOWNLOAD_LANCAMENTO+"."+SP_UPDASSUNTO;
    }


    public static String getSpConAssunto(){
        return PCK_DOWNLOAD_LANCAMENTO+"."+SP_CONASSUNTO;
    }

    public static String getSpConVersaoAssunto(){
        return PCK_DOWNLOAD_LANCAMENTO+"."+SP_CONVERSAOASSUNTO;
    }

    public static String getSpInsVersaoStep01(){
        return PCK_DOWNLOAD_LANCAMENTO+"."+SP_INSVERSAO_STEP01;
    }

    public static String getSpConVersaoStep01(){
        return PCK_DOWNLOAD_LANCAMENTO+"."+SP_CONVERSAO_STEP01;
    }

    public static String getSpInsVersaoStep02(){
        return PCK_DOWNLOAD_LANCAMENTO+"."+SP_INSVERSAO_STEP02;
    }

    public static String getSpConVersaoStep02(){
        return PCK_DOWNLOAD_LANCAMENTO+"."+SP_CONVERSAO_STEP02;
    }


    public static String getSpInsVersaoStep03(){
        return PCK_DOWNLOAD_LANCAMENTO+"."+SP_INSVERSAO_STEP03;
    }

    public static String getSpConVersaoStep03(){
        return PCK_DOWNLOAD_LANCAMENTO+"."+SP_CONVERSAO_STEP03;
    }

    public static String getSpInsVersaoStep04() {
        return PCK_DOWNLOAD_LANCAMENTO+"."+SP_INSVERSAO_STEP04;
    }

    public static String getSpExcVersao() {
        return PCK_DOWNLOAD_LANCAMENTO+"."+SP_EXCVERSAO;
    }

    public static String getSpConVersoes() {
        return PCK_DOWNLOAD_LANCAMENTO+"."+SP_CONVERSOES;
    }

    public static String getSpConAtualizacoesPendentes() {
        return PCK_DOWNLOAD_LANCAMENTO+"."+SP_CONATUALIZACOESPENDENTES;
    }

    public static String getSpInsVisualizacaoFunc() {
        return PCK_DOWNLOAD_LANCAMENTO+"."+SP_INSVISUALIZACAOFUNC;
    }

    public static String getSpInsVerMaisTarde(){
        return PCK_DOWNLOAD_LANCAMENTO+"."+SP_INSVERMAISTARDE;
    }

    public static String getSpComboGerenteAtividade() {
        return COMPROMISSOAGENDA+"."+SP_GETCOMBOGERENTEATIVIDADE;
    }

    public static String getSpPesqMatricula() {
        return PCK_DOWNLOAD_LANCAMENTO+"."+SP_PESQ_MATRICULA;
    }

    public static String getSpPesqPalavraChave() {
        return PCK_DOWNLOAD_LANCAMENTO+"."+SP_PESQ_PALAVRA_CHAVE;
    }

    public static String getSpPesqAssunto() {
        return PCK_DOWNLOAD_LANCAMENTO+"."+SP_PESQ_ASSUNTO;
    }


    public static String getSpConTipoAgencia(){
        return PCK_DOWNLOAD_LANCAMENTO+"."+SP_CONTIPOAGENCIA;
    }


    public static String getSpConTipoAtendRemto(){
        return PCK_DOWNLOAD_LANCAMENTO+"."+SP_CONTIPOATENDREMOTO;
    }
    public static String getSpGetInfoConsignado() {
        return CATALOG_NAME_CLIENTE+"."+SP_GETINFOCONSIGNADO;
    }

    public static String getSpGetInfoAgencia() {
        return CATALOG_NAME_HIERARQUIA+"."+SP_GETAGENCIAINFO;
    }

    public static String getSpGetEquipeTeamLeader() {
        return PLANEJAMENTO+"."+SP_GETEQUIPETEAMLEADER;
    }

    public static String getSpComboGerenteRemoto() {
        return COMPROMISSOAGENDA+"."+SP_GETCOMBOGERENTEREMOTO;
    }

    public static String getSpConHierTratamento() {
        return GESTAO_MANIFESTACAO+"."+SP_CONHIERTRATAMENTO;
    }

    public static String getSpConGrupoFamilia() {
        return GESTAO_MANIFESTACAO+"."+SP_CONGRUPOFAMILIA;
    }


    public static String getSpConProduto() {
        return GESTAO_MANIFESTACAO+"."+SP_COMPRODUTO;
    }


    public static String getSpConSintoma() {
        return GESTAO_MANIFESTACAO+"."+SP_COMSINTOMA;
    }


    public static String getSpConAnalitTratamento() {
        return GESTAO_MANIFESTACAO+"."+SP_CONANALITTRATAMENTO;
    }

    public static String getSpConRelatorioTotal() {
        return GESTAO_MANIFESTACAO+"."+SP_CONRELATORIOTOTAL;
    }

    public static String getSpAlteraProcessoLog(){
        return LOG+"."+SP_ALTERAPROCESSOLOG;
    }

    public static String getSpConsultaProcessoLog(){
        return LOG+"."+SP_CONSULTAPROCESSO;
    }

    public static String getSpGetVisaoCompartilhados() {
        return CATALOG_NAME_HIERARQUIA+"."+SP_GETVISAOCOMPARTILHADOS;
    }

    public static String getSpConPastaDigitalAgenda() {
        return PCK_PASTA_DIGITAL+"."+SP_CONPASTADIGITALAGENDA;
    }

    public static String getSpConAQOAgenda() {
        return AQO+"."+SP_CONAQOAGENDA;
    }

    public static String getSpConObsAQOAgenda() {
        return AQO+"."+SP_CONOBSAQOAGENDA;
    }

    public static String getSpUpdAQOAgenda() {
        return AQO+"."+SP_UPDAQOAGENDA;
    }


    public static String getSpConHierRelPastaDigital() {
        return PCK_PASTA_DIGITAL+"."+SP_CONHIERRELPASTADIGITAL;
    }


    public static String getSpConRelPastaDigitalGerente() {
        return PCK_PASTA_DIGITAL+"."+SP_CONRELPASTADIGITALGERENTE;
    }
}
