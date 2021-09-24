package nguyen.myserver.Repository;

import nguyen.myserver.Entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
    List<Company> findByCompany_name(String company_name);
    @Query("select Company from Field ,Company where (Company.field_id = Field .field_id) in (select field_name from Field where field_name:= field_name)")
    List<Company> findCompanyByField_name(String field_name);
}
