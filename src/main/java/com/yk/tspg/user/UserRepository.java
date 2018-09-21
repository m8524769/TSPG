package com.yk.tspg.user;

import com.yk.tspg.user.dto.UserDto;
import org.springframework.data.domain.*;
import org.springframework.data.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.data.rest.core.annotation.*;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    @RestResource(path = "nickname", rel = "nickname")
    public Page findByNickname(@Param("nickname") String nickname, Pageable pageable);

}
