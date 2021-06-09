package MyBatis;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {

   // public int insertRole(Role role);

    //public int deleteRole(Long id);

    //public int updateRole(Role role);

    Role getRole(@Param("id") Long id);



    //public List<Role> findRoles(String roleName);

}
