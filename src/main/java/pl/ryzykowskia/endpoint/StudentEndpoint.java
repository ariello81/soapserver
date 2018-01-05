package pl.ryzykowskia.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.concretepage.soap.GetStudentRequest;
import com.concretepage.soap.GetStudentResponse;

import pl.ryzykowskia.soapserver.repository.StudentRepository;
@Endpoint
public class StudentEndpoint {
	private static final String NAMESPACE_URI = "http://concretepage.com/soap";
	
	@Autowired	
	private StudentRepository studentRepository;	
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getStudentRequest")
	@ResponsePayload
	public GetStudentResponse getStudent(@RequestPayload GetStudentRequest request) {
		GetStudentResponse response = new GetStudentResponse();
		response.setStudent(studentRepository.getStudent(request.getStudentId()));
		return response;
	}
} 
