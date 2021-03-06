package dmacc.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long>{
	
}


