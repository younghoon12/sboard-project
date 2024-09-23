package com.sboard.dto;


import com.sboard.entity.Terms;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TermsDTO {

    private int seq;
    private String terms;
    private String privacy;

    public Terms toEntity() {
        return Terms.builder()
                .seq(seq)
                .terms(terms)
                .privacy(privacy)
                .build();
    }


}