package com.javaguides.springbootfirstapp.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name="MOVIE")
public class Movie {

    @Id
    @Column(name="ID")
    private Long id;
    @Column(name="TITLE")
    private String title;
    @Column(name="Description")
    private String description;

    @Column(name="RealeaseDate")
    private LocalDate releaseDate;


    public Movie() {
        // Default constructor
    }
    public Movie(String title, String description,LocalDate releaseDate)
    {
        this.title=title;
        this.description=description;
        this.releaseDate=releaseDate;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
