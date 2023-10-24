package br.com.rpires.dao;

/**
 * @author rodrigo.pires
 */
public interface IContratoDao {
  Boolean salvar();

  Boolean buscar();

  Boolean excluir();

  Boolean atualizar();
}
