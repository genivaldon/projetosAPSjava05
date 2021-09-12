package br.ufpb.dcx.aps.atividades.atv05;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Formulario {

    private String titulo;
    private Map<String, Campo> campos = new HashMap<>();

    public void addCampo(Campo campo) {
        if (!campos.containsKey(campo.getId())) {
            campos.put(campo.getId(), campo);
        } else {
            throw new RuntimeException("Já existe um campo com este id:'" + campo.getId() + "'");
        }
    }

    public Formulario() {
        this.titulo = "";
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Campo getCampo(String id) {
        if (campos.containsKey(id)) {
            return campos.get(id);
        } else {
            throw new IllegalArgumentException("Não existe campo com esse id");
        }

    }

    public Collection<Campo> getCampos() {
        return campos.values();
    }

}
