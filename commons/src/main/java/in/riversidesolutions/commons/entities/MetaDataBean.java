package in.riversidesolutions.commons.entities;

import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureParameter;

@NamedStoredProcedureQuery(name = "getMetaData",procedureName = "getMetaData",
parameters = @StoredProcedureParameter(mode = ParameterMode.IN,)


)
//                                resultClasses=MetaDataInterface.class)





public class MetaDataBean {

	@Id
	private int id;
	
}
