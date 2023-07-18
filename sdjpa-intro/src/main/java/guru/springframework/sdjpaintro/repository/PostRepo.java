package guru.springframework.sdjpaintro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.sdjpaintro.domain.Post;

public interface PostRepo extends JpaRepository<Post, Long>{

}
