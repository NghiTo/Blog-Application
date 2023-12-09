package com.vti.blogapp.Repository;

import com.vti.blogapp.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long>
{

}
