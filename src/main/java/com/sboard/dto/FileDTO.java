package com.sboard.dto;

import lombok.*;

@Getter
@AllArgsConstructor
@Setter
@ToString
@RequiredArgsConstructor
@Builder
public class FileDTO {

    private int fno;

    private int ano;
    private String oName;
    private String sName;
    private int download;
    private String rdate;
}
