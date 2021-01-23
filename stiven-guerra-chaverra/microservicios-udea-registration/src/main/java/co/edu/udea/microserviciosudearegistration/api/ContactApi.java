package co.edu.udea.microserviciosudearegistration.api;

import co.edu.udea.microserviciosudearegistration.dto.Contact;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class ContactApi {

    @GetMapping(value = "/contact")
    public Contact GenerateContact()
    {
        return new Contact(10L, "Stiven", "Guerra", "+57 123 456 78 90", "stiven.guerra@udea.edu.co");
    }

}
