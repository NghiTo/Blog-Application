package com.vti.blogapp.Repository;

import com.vti.blogapp.Entity.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CommentRepository extends JpaRepository<Comment, Long>, JpaSpecificationExecutor<Comment>
{
//    Method name
//    Page<Comment> findByPostId(Long postId, Pageable pageable);

//    Query Annotation
//    @Query("FROM Comment WHERE postId = ?1")
//    @Query("FROM Comment WHERE postId = :postId")
//    @Query(value = "SELECT * FROM comment WHERE post_id = ?1", nativeQuery = true)
    @Query(value = "SELECT * FROM comment WHERE post_id = :postId", nativeQuery = true)
    Page<Comment> findByPostId(@Param("postId") Long postId, Pageable pageable);

    @Query("DELETE Comment WHERE email = ?1")
    @Modifying
    void deleteByEmail(String email);
}
