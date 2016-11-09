package com.vl.lms.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import com.vl.lms.dto.EmployeeDTO;

/**
 * @author hari.polnati
 * 
 */
@Path("employee")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmployeeResource {

	private static final Logger LOGGER = Logger.getLogger(EmployeeResource.class);

	/**
	 * <b> http://serverIp:port/<contextpath>(lms-ws)/webapi/employee/</b>
	 *
	 * This method is used for add an employee
	 *
	 * @param employeeDTO
	 *            which contains employee info
	 * @return Response object either with success or error message
	 */
	@POST
	public Response add(EmployeeDTO employeeDTO) {
		try {
			LOGGER.info("employee data:" + employeeDTO);
			return Response.ok(employeeDTO, MediaType.APPLICATION_JSON).build();
		} catch (Exception exception) {
			return Response.serverError().entity(exception.getMessage()).build();
		}
	}

	/**
	 * <b> http://serverIp:port/<contextpath>(lms-ws)/webapi/employee/</b>
	 *
	 * This method is used for update an employee
	 *
	 * @param employeeDTO
	 *            which contains employee info
	 * @return Response object either with success or error message
	 */
	@PUT
	public Response update(EmployeeDTO employeeDTO) {

		try {
			return Response.ok(employeeDTO, MediaType.APPLICATION_JSON).build();
		} catch (Exception exception) {
			return Response.serverError().entity(exception.getMessage()).build();
		}
	}

	/**
	 * <b> http://serverIp:port/<contextpath>(lms-ws)/webapi/employee/</b>
	 *
	 * This method is used for get all employees data which contains employee
	 * info
	 * 
	 * @return Response object either with success or error message
	 */

	@GET
	public Response getAll() {
		try {
			EmployeeDTO employeeDTO = new EmployeeDTO();
			employeeDTO.setId(1L);
			employeeDTO.setFirstName("Hari");
			employeeDTO.setLastName("nani");
			return Response.ok(employeeDTO, MediaType.APPLICATION_JSON).build();
		} catch (Exception exception) {
			return Response.serverError().entity(exception.getMessage()).build();
		}
	}

	/**
	 * <b> http://serverIp:port/<contextpath>(lms-ws)/webapi/employee</b>
	 *
	 * This method is used for delete all employees
	 * 
	 * @param empid
	 * 
	 * @return Response object either with success or error message
	 */
	@DELETE
	public Response deleteAll() {
		try {
			return Response.ok().build();
		} catch (Exception exception) {
			return Response.serverError().entity(exception.getMessage()).build();
		}
	}

	/**
	 * <b>
	 * http://serverIp:port/<contextpath>(lms-ws)/webapi/employee/{empid}</b>
	 *
	 * This method is used for get a particular employee based on employee id
	 * 
	 * @param empid  
	 * 
	 * @return Response object either with success or error message
	 */
	@GET
	@Path("/{empid}")
	public Response getById(@PathParam("empid") Long empid) {
		try {
			return Response.ok().build();
		} catch (Exception exception) {
			return Response.serverError().entity(exception.getMessage()).build();
		}
	}

	/**
	 * <b>
	 * http://serverIp:port/<contextpath>(lms-ws)/webapi/employee/{empid}</b>
	 *
	 * This method is used for delete a particular employee based on employee id
	 * 
	 * @param empid
	 * 
	 * @return Response object either with success or error message /
	 */
	@DELETE
	@Path("/{empid}")
	public Response deleteById(@PathParam("empid") Long empid) {
		try {
			return Response.ok().build();
		} catch (Exception exception) {
			return Response.serverError().entity(exception.getMessage()).build();
		}
	}

}
