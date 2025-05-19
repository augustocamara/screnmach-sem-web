package br.com.rootnet.screnmach3.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
