package za.ac.tut.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.ac.tut.entity.ComputerGuess;
import za.ac.tut.entity.UserGuess;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-07-01T11:20:47")
@StaticMetamodel(CoinTossing.class)
public class CoinTossing_ { 

    public static volatile ListAttribute<CoinTossing, UserGuess> userguess;
    public static volatile SingularAttribute<CoinTossing, Integer> computerScore;
    public static volatile SingularAttribute<CoinTossing, Integer> gamesplayed;
    public static volatile SingularAttribute<CoinTossing, Long> id;
    public static volatile SingularAttribute<CoinTossing, Integer> userScore;
    public static volatile SingularAttribute<CoinTossing, String> userid;
    public static volatile ListAttribute<CoinTossing, ComputerGuess> computerguess;
    public static volatile SingularAttribute<CoinTossing, String> username;

}