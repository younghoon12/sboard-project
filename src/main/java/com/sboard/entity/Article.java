package com.sboard.entity;


import com.sboard.dto.ArticleDTO;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "article")
public class Article {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private int no;
      private String cate = "free";
      private String title;
      private String content;
      private int comment;
      private int file;
      private int hit;
      private String writer;
      private String regip;

      @CreationTimestamp
      private LocalDateTime rdate;

      /*
      DTO 변환 메서드 대신 ModerMapper 사용
       */






}
