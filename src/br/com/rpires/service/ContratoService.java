package br.com.rpires.service;

import br.com.rpires.dao.IContratoDao;

/**
 * @author rodrigo.pires
 */
public class ContratoService implements IContratoService {

  private IContratoDao contratoDao;

  public ContratoService(IContratoDao dao) {
    this.contratoDao = dao;
  }

  @Override
  public String salvar() {
    contratoDao.salvar();
    return "Sucesso";
  }

  @Override
  public Boolean buscar() {
    return contratoDao.buscar();
  }

  @Override
  public Boolean atualizar() {
    return contratoDao.atualizar();
  }

  @Override
  public Boolean excluir() {
    return contratoDao.excluir();
  }
}
