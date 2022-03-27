package dao;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

  @Autowired
  private SqlSessionTemplate mybatis;
  
  public int login(String name, String pass) {
	  System.out.println("쉬바이거까지 작동되나?");
	  Map<String, String> map = new HashMap<>();
	  map.put("name", name);
	  map.put("pass", pass);
	  return mybatis.selectOne("member.login", map);
  }
}
