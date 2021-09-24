package nguyen.myserver.Service;


import nguyen.myserver.Entity.Company;
import nguyen.myserver.Entity.Field;
import nguyen.myserver.Repository.CompanyRepository;
import nguyen.myserver.Repository.FieldRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {
    private final CompanyRepository companyRepository;
    private final FieldRepository fieldRepository;

    public CompanyService(CompanyRepository companyRepository, FieldRepository fieldRepository) {
        this.companyRepository = companyRepository;
        this.fieldRepository = fieldRepository;
    }

    public Optional<Company> findCompanyById(Integer company_id){return companyRepository.findById(company_id);}
    public List<Company> getAllCompany(){return companyRepository.findAll();}
    public void SaveCompany (Company company){companyRepository.save(company);}
    public void DeleteCompany (Company company){companyRepository.delete(company);}
    public Optional<Field> findFieldById(Integer field_id){return fieldRepository.findById(field_id);}
    public List<Field> getAllField(){return fieldRepository.findAll();}
    public void SaveField (Field field){fieldRepository.save(field);}
    public void DeleteCField (Field field){fieldRepository.delete(field);}
    public List<Company> findByCompanyName(String company_name){return companyRepository.findByCompany_name(company_name);}
    public List<Company> findCompanyByFieldName(String field_name){return companyRepository.findCompanyByField_name(field_name);}
}
