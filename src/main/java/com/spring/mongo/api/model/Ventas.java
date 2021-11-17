package com.spring.mongo.api.model;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection="Ventas")
public class Ventas {

	private int id; 
	private int codigo_venta;
	private int usuarios_cedula_usuarios;
	private String ciudad_usuario;
	private int clientes_cedula_cliente;
	private String ciudad_cliente;
	private String valor_venta;
	private String iva_venta;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCodigo_venta() {
		return codigo_venta;
	}
	public void setCodigo_venta(int codigo_venta) {
		this.codigo_venta = codigo_venta;
	}
	public int getUsuarios_cedula_usuarios() {
		return usuarios_cedula_usuarios;
	}
	public void setUsuarios_cedula_usuarios(int usuarios_cedula_usuarios) {
		this.usuarios_cedula_usuarios = usuarios_cedula_usuarios;
	}
	public int getClientes_cedula_cliente() {
		return clientes_cedula_cliente;
	}
	public void setClientes_cedula_cliente(int clientes_cedula_cliente) {
		this.clientes_cedula_cliente = clientes_cedula_cliente;
	}
	public String getValor_venta() {
		return valor_venta;
	}
	public void setValor_venta(String valor_venta) {
		this.valor_venta = valor_venta;
	}
	public String getIva_venta() {
		return iva_venta;
	}
	public void setIva_venta(String iva_venta) {
		this.iva_venta = iva_venta;
	}
	
	
	
}
