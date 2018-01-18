package site.fish119.adminss.service.setting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.fish119.adminss.domain.sys.Role;
import site.fish119.adminss.repository.SysRoleRepository;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private SysRoleRepository roleRepository;

    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    public Role save(Role role){
        return roleRepository.save(role);
    }

    public void delRole(Long id){
        roleRepository.delete(id);
    }
}