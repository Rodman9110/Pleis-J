package com.regue.excepciones;

public class AlmancenExcepcion extends RuntimeException {
	
	private static final long serilaVersionUID = 1L;


	public AlmancenExcepcion(String mensaje) {
		super(mensaje);
	}
	
	public AlmancenExcepcion(String mensaje, Throwable exception) {
		super(mensaje,exception);
	}

}
