package pvb.blog.repository;

import pvb.blog.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {

    Tag findByNameIgnoreCase(String name);
}
