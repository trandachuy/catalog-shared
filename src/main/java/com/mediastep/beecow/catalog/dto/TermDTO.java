/*
 * Copyright 2017 (C) Mediastep Software Inc.
 *
 * Created on : 12/1/2017
 * Author: Loi Tran <email:loi.tran@mediastep.com>
 *
 */

package com.mediastep.beecow.catalog.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.mediastep.beecow.common.dto.AbstractAuditingDTO;


/**
 * A DTO for the Term entity.
 */
public class TermDTO extends AbstractAuditingDTO implements Serializable {

    private static final long serialVersionUID = -3846716954854515272L;

    private Long id;

    private String name;

    private String displayName;

    private Integer termLevel;

    private Integer termOrder;

    private List<TermDTO> children = new ArrayList<>();

    private Map<String, Object> metadata = new HashMap<>();

    private Long taxonomyId;

    private String taxonomy;

    private String slug;

    private String seoDescription;

    private String seoKeyword;

    private Long parentId;

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets display name.
     *
     * @return the display name
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets display name.
     *
     * @param displayName the display name
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Gets term level.
     *
     * @return the term level
     */
    public Integer getTermLevel() {
        return termLevel;
    }

    /**
     * Sets term level.
     *
     * @param termLevel the term level
     */
    public void setTermLevel(Integer termLevel) {
        this.termLevel = termLevel;
    }

    /**
     * Gets term order.
     *
     * @return the term order
     */
    public Integer getTermOrder() {
        return termOrder;
    }

    /**
     * Sets term order.
     *
     * @param termOrder the term order
     */
    public void setTermOrder(Integer termOrder) {
        this.termOrder = termOrder;
    }

    /**
     * Gets children.
     *
     * @return the children
     */
    public List<TermDTO> getChildren() {
        return children;
    }

    /**
     * Sets children.
     *
     * @param children the children
     */
    public void setChildren(List<TermDTO> children) {
        this.children = children;
    }

    /**
     * Gets metadata.
     *
     * @return the metadata
     */
    public Map<String, Object> getMetadata() {
        return metadata;
    }

    /**
     * Sets metadata.
     *
     * @param metadata the metadata
     */
    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    /**
     * Gets taxonomy id.
     *
     * @return the taxonomy id
     */
    public Long getTaxonomyId() {
        return taxonomyId;
    }

    /**
     * Sets taxonomy id.
     *
     * @param taxonomyId the taxonomy id
     */
    public void setTaxonomyId(Long taxonomyId) {
        this.taxonomyId = taxonomyId;
    }

    /**
     * Gets taxonomy.
     *
     * @return the taxonomy
     */
    public String getTaxonomy() {
        return taxonomy;
    }

    /**
     * Sets taxonomy.
     *
     * @param taxonomy the taxonomy
     */
    public void setTaxonomy(String taxonomy) {
        this.taxonomy = taxonomy;
    }

    /**
     * Gets parent id.
     *
     * @return the parent id
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * Sets parent id.
     *
     * @param termId the term id
     */
    public void setParentId(Long termId) {
        this.parentId = termId;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getSeoDescription() {
        return seoDescription;
    }

    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription;
    }

    public String getSeoKeyword() {
        return seoKeyword;
    }

    public void setSeoKeyword(String seoKeyword) {
        this.seoKeyword = seoKeyword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TermDTO termDTO = (TermDTO) o;

        if ( ! Objects.equals(id, termDTO.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "TermDTO{" +
            "id=" + id +
            ", name='" + name + "'" +
            ", displayName='" + displayName + "'" +
            ", termLevel='" + termLevel + "'" +
            ", termOrder='" + termOrder + "'" +
                ", slug='" + slug + "'" +
                ", seoDescription='" + seoDescription + "'" +
                ", seoKeyword='" + seoKeyword + "'" +
            '}';
    }
}
