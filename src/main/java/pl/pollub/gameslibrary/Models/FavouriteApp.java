package pl.pollub.gameslibrary.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Data
@ToString
@Component
public class FavouriteApp {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="appId",referencedColumnName="id")
    private App appId;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="userId",referencedColumnName="id")
    private User userId;
}