package com.tuya.smart.android.demo.Datos;

import java.sql.SQLException;
import java.util.ArrayList;

import com.tuya.smart.android.demo.Modelo.LogSistema;
import com.tuya.smart.android.demo.Modelo.Operador;
import com.tuya.smart.android.demo.Modelo.QueryEjecutada;

public class OpMobile implements IOperaciones<Object,Integer> {
    /*Estado*/
    private static Database database;
    private OpLogSistema logging;
    private Operador usuarioSistema;
    /*Estado*/
    @Override
    public LogSistema guardar(Object cAnterior, Object c) throws Exception, SQLException {
        return null;
    }

    @Override
    public LogSistema insertar(Object c) throws Exception, SQLException {
        return null;
    }

    @Override
    public LogSistema modificar(Object cAnterior, Object c) throws Exception, SQLException {
        return null;
    }

    @Override
    public LogSistema borrar(Object c) throws Exception, SQLException {
        return null;
    }

    @Override
    public ArrayList<Object> obtenerTodos() throws Exception, SQLException {
        return null;
    }

    @Override
    public ArrayList<Object> buscar(String filtro, String extras) throws Exception, SQLException {
        return null;
    }

    @Override
    public LogSistema borradoMultiplePorIds(ArrayList<Integer> listaIds) throws Exception, SQLException {
        return null;
    }

    @Override
    public LogSistema registroConsola(String usuarioSistema, ArrayList<String> listaSQL, String operacion, String textoError) throws Exception, SQLException {
        LogSistema log = new LogSistema(usuarioSistema, operacion, textoError, new ArrayList<>());
        System.out.println("----------------------------------");
        System.out.println("Usuario: " + usuarioSistema + "\nOperación: " + operacion + "\nTexto Error: " + textoError);
        System.out.println("Listado de Sentencias SQL:");
        for (String sentencia : listaSQL) {
            log.getListaQuerys().add(new QueryEjecutada(sentencia));
            System.out.println(sentencia);
        }
        logging.insertar(log);
        System.out.println("----------------------------------");
        /*Evidencia en consola*/
        return log;
    }
}
