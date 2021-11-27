package repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voula.model.Avaliacao;

public interface AvaliacaoRespository  extends JpaRepository<Avaliacao, Long>{

	List <Avaliacao> findByAllGeralAvaliacaoContainingIgnoreCase (long geralavAliacao);
	
	Optional<Avaliacao> findById(long idAvaliacao);

	
}
