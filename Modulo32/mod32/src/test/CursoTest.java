package test;

import br.com.daniel.dao.CursoDao;
import br.com.daniel.dao.ICursoDao;
import br.com.daniel.domain.Curso;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CursoTest {

    private ICursoDao cursoDao;

    public CursoTest() {
        cursoDao = new CursoDao();
    }

    @Test
    public void cadastrar() {
        Curso curso = new Curso();
        curso.setCodigo("A2");
        curso.setDescricao("CURSO TESTE");
        curso.setNome("CURSO JAVA BACK END");
        cursoDao.cadastrar(curso);

        assertNotNull(curso);
        assertNotNull(curso.getId());
    }
}

