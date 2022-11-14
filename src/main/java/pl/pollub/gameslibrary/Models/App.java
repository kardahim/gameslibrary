package pl.pollub.gameslibrary.Models;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Data
@ToString
@Component
public class App {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false,columnDefinition="TEXT")
    private String description;

    @Column(nullable = false,columnDefinition="TEXT")
    private String shortDescription;

    @Column(nullable = false)
    private String screenshotLink;

    @Column(nullable = false,columnDefinition="TEXT")
    private String developers;

    @Column(nullable = false,columnDefinition="TEXT")
    private String publishers;
}