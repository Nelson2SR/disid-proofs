package org.springframework.roo.clinictests.domain;
import org.springframework.roo.addon.dto.annotations.RooDTO;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.format.annotation.NumberFormat;

/**
 * = PetNameAndWeightFormBean
 *
 * TODO Auto-generated class documentation
 *
 */
@RooDTO
@RooJavaBean
public class PetNameAndWeightFormBean {

    /**
     * TODO Auto-generated field documentation
     *
     */
    private String name;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @NumberFormat
    private Float weight;
}