/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagenes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class LogicaNegocio {
    
    private static List<Usuario> listaUsuarios = new ArrayList<>();
    private static List<Rol> listaRoles = new ArrayList<>();
    private static List<Permiso> listaPermisos = new ArrayList<>();
    private static List<Producto> listaProductos = new ArrayList<>();
    private static List<Colaborador> listaColaboradores = new ArrayList<>();
    private static List<Categoria> listaCategorias = new ArrayList<>();
    
    public static void añadirUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public static List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
    
    public static void añadirRol(Rol rol) {
        listaRoles.add(rol);
    }

    public static List<Rol> getListaRoles() {
        return listaRoles;
    }
    public static void añadirPermiso(Permiso permiso) {
        listaPermisos.add(permiso);
    }

    public static List<Permiso> getListaPermisos() {
        return listaPermisos;
    }
    public static void añadirProducto(Producto producto) {
        listaProductos.add(producto);
    }

    public static List<Producto> getListaProductos() {
        return listaProductos;
    }
    public static void añadirColaborador(Colaborador colaborador) {
        listaColaboradores.add(colaborador);
    }

    public static List<Colaborador> getListaColaboradores() {
        return listaColaboradores;
    }
    
    public static void añadirCategoria(Categoria categoria) {
        listaCategorias.add(categoria);
    }

    public static List<Categoria> getListaCategorias() {
        return listaCategorias;
    }
}
