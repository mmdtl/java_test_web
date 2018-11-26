package liulu.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JsonContent;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void index() throws Exception {
        this.mvc.perform(get("/")).andExpect(status()
                .isOk()).andExpect(content().string("hello"));
    }
    @Autowired
    private ObjectMapper objectMapper;
    @Test
    public void outputTest() throws Exception{
        ObjectNode node = this.objectMapper.createObjectNode();
        node.put("id","1").toString();
        String requestParam1 = "1";
        String requestParam2 = "dfsdf";
        this.mvc.perform(get("/outputTest/"+requestParam1+"/"+requestParam2+"/"))
                .andExpect(status().isOk()).andExpect(content().json(""));
    }
}