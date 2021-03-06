import java.io.*;
import java.util.Scanner;

/**
* Classe que permite obter os menus, consoante o estado do programa
*/

public class Menu implements Serializable{
    
    private static String[][] operacoes = { // Menu inicial
                                    { "1 - Login", 
                                      "2 - Registar Contribuinte", 
                                      "3 - Registar Empresa",
                                      "0 - Sair"},
                                     // Menu contribuinte 
                                    { "1 - Consultar Faturas", 
                                      "2 - Total Deduzido", 
                                      "3 - Deduções Agregado Familiar", 
                                      "4 - Atribuir Setor de Atividade Económica a uma Fatura",
                                      "5 - Alterar Setor de Atividade Económica de uma Fatura",
                                      "0 - Voltar Atrás"},
                                     // Menu empresa 
                                    { "1 - Emitir Fatura", 
                                      "2 - Consultar Faturas (por data de emissão)",
                                      "3 - Consultar Faturas (por valor)",
                                      "4 - Consultar Faturas (de um cliente em específico)",
                                      "5 - Consultar Faturas emitidas entre determinada data",
                                      "6 - Consultar Faturas emitidas entre determinada data (por valor)", 
                                      "7 - Consultar Faturas de um cliente específico, entre determinada data",
                                      "8 - Total Faturado",
                                      "0 - Sair"},
                                    // Menu admin
                                    { "1 - Top 10 Contribuintes: total do valor das faturas",
                                      "2 - Top X Empresas: relação entre o nº de faturas emitidas \ne o montante de deduções fiscais que as despesas registadas representam",
                                      "3 - Adicionar novo setor de despesa",
                                      "0 - Sair"}
                                    };
                            
    /**
     * Método que retorna o conjunto de operações possíveis no Menu Inicial
     */                                
    public static String[] getMainMenu(){
        return operacoes[0];
    }
    
    /**
     * Método que retorna o conjunto de operações possíveis no Menu dos Contribuintes
     */
    public static String[] getMenuContribuinte(){
        return operacoes[1];
    }
    
    /**
     * Método que retorna o conjunto de operações possíveis no Menu das Empresas
     */
    public static String[] getMenuEmpresa(){
        return operacoes[2];
    }
    
    /**
     * Método que retorna o conjunto de operações possíveis no Menu do Modo Administrador
     */
    public static String[] getMenuAdmin(){
        return operacoes[3];
    }
    




}
