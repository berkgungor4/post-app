package com.youngadessi.app.post.entity;

import com.youngadessi.app.common.sql.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tbl_tag")
@Getter
@Setter
public class Tag extends BaseEntity {

    @NotNull
    @NotBlank
    @Column(name = "tag_name")
    private String tagName;

}
