package guru.springframework.sdjpaintro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.sdjpaintro.domain.PostComment;

public interface PostCommentRepo extends JpaRepository<PostComment, Long>{

}
