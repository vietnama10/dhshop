package vn.dhteams.service.onlineshop.service;

import java.util.List;
import java.util.Map;

import vn.dhteams.service.onlineshop.domain.User;

public interface UserService {
	Map<String, Object> getAllUser(Integer page, Integer pageSize, String sortData, String searchData);
	
	Map<String, Object> getById(Long id);
	
	Map<String, Object> getByUserName(String userName);

	Map<String, Object> createUser(User user);

	Map<String, Object> updateUser(User user);

	Map<String, Object> deleteUser(List<Long> userIds);
}
