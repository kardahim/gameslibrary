package pl.pollub.gameslibrary.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Data
@ToString
@Component
public class Review {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long appId;

    @Column(nullable = false)
    private String textReview;

    @Column(nullable = false)
    private Integer rating;

//    @ManyToOne
//    @JoinColumn(name="userId",referencedColumnName="id")
//    private User userId;

    @JsonIgnore
    @ManyToOne()
    @JoinColumn(name="userId")
//    @JsonProperty("userId")
    private User user;

}