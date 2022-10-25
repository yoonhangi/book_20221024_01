package com.icia.book.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class BookDTO {
    private Long bookId;
    private String bookName;
    private String bookAuthor;
    private int bookPrice;
    private String bookPublisher;


}
