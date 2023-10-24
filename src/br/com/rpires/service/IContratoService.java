package br.com.rpires.service;

/**
 * @author rodrigo.pires
 */
public interface IContratoService {
  //Create
  String salvar();

  //Read
  Boolean buscar();

  //Update
  Boolean atualizar();

  //Delete
  Boolean excluir();
}
