package MyBatis;

import org.apache.ibatis.session.SqlSession;
//import org.apache.logging.log4j.Logger;

public class TestMyBatis {

    public static void main(String[] args) {

//        Logger log = Logger.getLogger(TestMyBatis.class);

        SqlSession sqlSession = null;

        try {

            sqlSession = SqlSessionFactoryUtils.openSqlSession();

            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);

            Role role = roleMapper.getRole(1L);

            System.out.println(role.getRoleName());

//            log.info(role.getRoleName());

        } catch (Exception e) {
            throw (e);

        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

}
