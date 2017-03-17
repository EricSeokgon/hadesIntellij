package tk.hadeslee.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Project: hadesIntellij
 * FileName: UserRepository
 * Date: 2017-03-17
 * Time: 오후 5:37
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
