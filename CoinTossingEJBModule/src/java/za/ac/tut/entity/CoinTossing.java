package za.ac.tut.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author yolan
 */
@Entity
public class CoinTossing implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String userid;
    
    private Integer gamesplayed;
    private Integer userScore;
    private Integer computerScore;
    
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private List<UserGuess> userguess;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private List<ComputerGuess> computerguess;

    public CoinTossing() {
    }

    public CoinTossing(Long id, String username, String userid, Integer gamesplayed, Integer userScore, Integer computerScore, List<UserGuess> userguess, List<ComputerGuess> computerguess) {
        this.id = id;
        this.username = username;
        this.userid = userid;
        this.gamesplayed = gamesplayed;
        this.userScore = userScore;
        this.computerScore = computerScore;
        this.userguess = userguess;
        this.computerguess = computerguess;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Integer getGamesplayed() {
        return gamesplayed;
    }

    public void setGamesplayed(Integer gamesplayed) {
        this.gamesplayed = gamesplayed;
    }

    public Integer getUserScore() {
        return userScore;
    }

    public void setUserScore(Integer userScore) {
        this.userScore = userScore;
    }

    public Integer getComputerScore() {
        return computerScore;
    }

    public void setComputerScore(Integer computerScore) {
        this.computerScore = computerScore;
    }

    public List<UserGuess> getUserguess() {
        return userguess;
    }

    public void setUserguess(List<UserGuess> userguess) {
        this.userguess = userguess;
    }

    public List<ComputerGuess> getComputerguess() {
        return computerguess;
    }

    public void setComputerguess(List<ComputerGuess> computerguess) {
        this.computerguess = computerguess;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CoinTossing)) {
            return false;
        }
        CoinTossing other = (CoinTossing) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.entity.CoinTossing[ id=" + id + " ]";
    }
    
}
