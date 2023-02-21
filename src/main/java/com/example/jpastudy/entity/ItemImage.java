package com.example.jpastudy.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "item_img")
@Getter
@Setter
public class ItemImage extends BaseEntity{
    @Id
    @Column(name = "item_img_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String originalImageName;
    private String imageName;

    private String imageUrl;

    private String repImgYn; //대표 이미지 여부

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    public void updateItemImg(String originalImageName, String imageName,String imageUrl){
        this.originalImageName=originalImageName;
        this.imageName=imageName;
        this.imageUrl=imageUrl;
    }
}
