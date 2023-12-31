package br.com.rpires;

import br.com.rpires.dao.ContratoDao;
import br.com.rpires.dao.IContratoDao;
import br.com.rpires.dao.mocks.ContratoDaoMock;
import br.com.rpires.service.ContratoService;
import br.com.rpires.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author rodrigo.pires
 */
public class ContratoServiceTest {

  @Test
  public void salvarTest() {
    IContratoDao dao = new ContratoDaoMock();
    IContratoService service = new ContratoService(dao);
    String retorno = service.salvar();
    Assert.assertEquals("Sucesso", retorno);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void esperadoErroNoSalvarComBancoDeDadosTest() {
    IContratoDao dao = new ContratoDao();
    IContratoService service = new ContratoService(dao);
    String retorno = service.salvar();
    Assert.assertEquals("Sucesso", retorno);
  }

  @Test
  public void buscarSucessoTest() {
    IContratoDao dao = new ContratoDaoMock();
    IContratoService service = new ContratoService(dao);
    Boolean sucesso = service.buscar();
    Assert.assertTrue(sucesso);
  }

  @Test
  public void atualizarSucessoTest() {
    IContratoDao dao = new ContratoDaoMock();
    IContratoService service = new ContratoService(dao);
    Boolean sucesso = service.atualizar();
    Assert.assertTrue(sucesso);
  }

  @Test
  public void excluirSucessoTest() {
    IContratoDao dao = new ContratoDaoMock();
    IContratoService service = new ContratoService(dao);
    Boolean sucesso = service.excluir();
    Assert.assertTrue(sucesso);
  }
}
