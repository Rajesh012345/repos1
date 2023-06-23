package in.riversidesolutions.commons.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.riversidesolutions.commons.entities.MetaDataBean;

@Repository
public interface MetadataKeyValueRepo extends JpaRepository<MetaDataBean, Integer>{

}
