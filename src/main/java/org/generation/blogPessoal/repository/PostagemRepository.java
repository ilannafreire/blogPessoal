package org.generation.blogPessoal.repository;

import org.generation.blogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	
   //public List<Postagem> findAllbyTituloContainingIgnoreCase (String titulo);
   
	
}
