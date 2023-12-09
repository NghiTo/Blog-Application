package com.vti.blogapp.Service;

import com.vti.blogapp.Dto.PostDto;
import com.vti.blogapp.Form.PostCreateForm;
import com.vti.blogapp.Form.PostUpdateForm;
import com.vti.blogapp.Mapper.PostMapper;
import com.vti.blogapp.Repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService
{
    private final PostRepository postRepository;
    @Override
    public Page<PostDto> findAll(Pageable pageable)
    {
        return postRepository.findAll(pageable).map(PostMapper::map);
    }
    @Override
    public PostDto findById(Long id)
    {
        var post = postRepository.findById(id).get();
        return PostMapper.map(post);
    }
    @Override
    public PostDto create(PostCreateForm form)
    {
        var post = PostMapper.map(form);
        var savePost = postRepository.save(post);
        return PostMapper.map(savePost);
    }
    @Override
    public PostDto update(PostUpdateForm form, Long id)
    {
        var post = PostMapper.map(form);
        post.setId(id);
        var savedPost = postRepository.save(post);
        return PostMapper.map(savedPost);
    }
    @Override
    public void deleteById(Long id)
    {
        postRepository.deleteById(id);
    }
}
