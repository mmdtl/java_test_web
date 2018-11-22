package liulu.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index(){
        String a = "hello";
        return a;
    }

    public void setCityMapper(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    @Autowired
    private CityMapper cityMapper;

    public void setObjectMapper(ObjectMapper objectmapper) {
        this.objectMapper = objectmapper;
    }

    @Autowired
    private ObjectMapper objectMapper;


    @GetMapping("/outputTest/{status}/{message}")
    public City outputTest(@PathVariable int status, @PathVariable String message){
        ObjectNode node = this.objectMapper.createObjectNode();
        node.put("id","1");
        System.out.println(node);
        City city = this.cityMapper.findByState("CA");
        return city;
    }
}
