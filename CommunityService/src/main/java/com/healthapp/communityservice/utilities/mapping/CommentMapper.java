package com.healthapp.communityservice.utilities.mapping;

import com.healthapp.communityservice.entities.Comment;
import com.healthapp.communityservice.models.commentdt.CommentReadDTO;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class CommentMapper {
    public CommentReadDTO getCommentRead(Comment comment) {
        CommentReadDTO commentReadDTO = new CommentReadDTO();
        commentReadDTO.setCommentId(comment.getCommentId());
        commentReadDTO.setUserFullName(comment.getUserFullName());
        commentReadDTO.setContent(comment.getContent());
        commentReadDTO.setTimeCreated(comment.getTimeCreated());
        commentReadDTO.setLikes(comment.getLikes() != null ? comment.getLikes().size() : 0);
        commentReadDTO.setDislikes(comment.getDislikes() != null ? comment.getDislikes().size() : 0);

        // Mapping replies recursively
        List<CommentReadDTO> replyDTOs = new ArrayList<>();
        for (Comment reply : comment.getReplies()) {
            replyDTOs.add(getCommentRead(reply));
        }
        commentReadDTO.setReplies(replyDTOs);
        return commentReadDTO;
    }
}

