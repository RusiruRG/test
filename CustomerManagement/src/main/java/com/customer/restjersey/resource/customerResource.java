package com.customer.restjersey.resource;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import com.customer.restjersey.model.customerModel;
import com.customer.restjersey.services.customerServices;

@Path("/customerEgrid")
public class customerResource {

	customerServices services = new customerServices();
	
	@Path("/insertion")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public customerModel addCustomer(customerModel cModel) {
		
		 return services.insertCustomer(cModel);
	}
	
	@Path("/retrieve")
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	public ArrayList<customerModel> getCustomer() throws SQLException {
		
		return services.getCustomer();
	}
	
	@Path("/updateCustomer")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public customerModel updateCustomer(customerModel cModel) {
		
		 return services.updateCustomer(cModel);
	}
	
	@Path("/deleteCustomer/{cus_id}")
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public int deleteCustomer(@PathParam("cus_id") int cus_id) {
		
		return services.deleteCustomer(cus_id);
	}
	
}
