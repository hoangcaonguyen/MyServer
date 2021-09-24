package nguyen.myserver.Controller;

import nguyen.myserver.Entity.Company;
import nguyen.myserver.Entity.Field;
import nguyen.myserver.Entity.Post;
import nguyen.myserver.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/company")
public class CompanyController {
    private CompanyService companyService;
    @Autowired
    public CompanyController(CompanyService companyService){this.companyService = companyService;}
    @GetMapping("/id")
    public Optional<Company> findCompanyById(@RequestParam Integer company_id){
        return companyService.findCompanyById(company_id);
    }
    @GetMapping
    public List<Company> getAllCompany(){
        return companyService.getAllCompany();
    }
    @DeleteMapping(value = "/delete/{id}")
    public Company DeleteData(@PathVariable(name = "id") Integer company_id, Company company){
        companyService.DeleteCompany(company);
        return company;
    }
    @PostMapping(value = "/add_company", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Company SaveCompany(@RequestBody Company company){
        companyService.SaveCompany(company);
        return company;
    }
    @GetMapping("/company_name")
    public List<Company> findCompanyByName(@RequestParam String company_name){
        return companyService.findByCompanyName(company_name);
    }
    @GetMapping("/field")
    public Optional<Field> findFieldById(@RequestParam Integer field_id){
        return companyService.findFieldById(field_id);
    }
    @GetMapping("/field")
    public List<Field> getAllField(){
        return companyService.getAllField();
    }
    @DeleteMapping(value = "/delete/field/{id}")
    public Field DeleteField(@PathVariable(name = "id") Integer field_id, Field field){
        companyService.DeleteCField(field);
        return field;
    }
    @PostMapping(value = "/add/field", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Field SaveField(@RequestBody Field field){
        companyService.SaveField(field);
        return field;
    }
    @GetMapping("/company/field")
    public List<Company> findCompanyByField(@RequestParam String field_name){
        return companyService.findCompanyByFieldName(field_name);
    }
}
