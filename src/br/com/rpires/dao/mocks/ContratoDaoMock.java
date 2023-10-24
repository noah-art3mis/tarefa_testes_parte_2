package br.com.rpires.dao.mocks;

import br.com.rpires.dao.IContratoDao;

/**
 * @author rodrigo.pires
 */
public class ContratoDaoMock implements IContratoDao {

  @Override
  public Boolean salvar() {
    return true;
  }

  @Override
  public Boolean buscar() {
    return true;
  }

  @Override
  public Boolean excluir() {
    return true;
  }

  @Override
  public Boolean atualizar() {
    return true;
  }
}
