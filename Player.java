
/**
 *                 This class spcify the attributes (Player1  
 *  and player2) with the following fields:
 *  name, socre, guesses
 *  behaviours 
 *  @auther (Shangqing Song) 
 *  @version (20/04/2018) 
 */
public class Player
{
    // instance variables 
    private String name;
    private int score;
    private int guesses;
    /**
     * Default constructor which is used to
     * initialise instance variables 
     */
    public Player()
    {
        // initialise instance variable name
        name = "";
        // initialise instance variable score
        score = 0;
        // initialise instance variable guesses
        guesses = 0;
    }
    
    /**
     * Non-default constructor which is used to
     * initialise instance variables 
     */
    public Player(String playerName)
    {
        // initialise instance variable name
        name = playerName;
        // initialise instance variable score
        score = 0;
        // initialise instance variable guesses
        guesses = 0;
    }
    
    /**
     * This method will get value of the 
     * instance varible guesses
     * 
     * @param
     * @return      player's last guess
     */
    public int getGuesses()
    {
        // return player's last guess
        return guesses;
    }
    
    /**
     * This method will get value of the 
     * instance varible name
     * 
     * @param
     * @return      the name setted by user
     */
    public String getName()
    {   
        // return player's name
        return name;
    }
    
    /**
     * This method will get value of the 
     * instance varible score
     * 
     * @param
     * @return      the total score of player
     */
    public int getScore()
    {   
        // return player's score
        return score;
    }
    
    /**
     * This method will set value for the 
     * instance varible guesses
     * 
     * @param   guess  A int of player's
     *  last guess
     * @return  void    
     */
    public void setGuesses(int guess)
    {   
        // assign guess to variable guesses
        guesses = guess;
    }
    
    /**
     * This method will set value for the 
     * instance varible name
     * 
     * @param   nameInput  A String which entered 
     *  by user
     * @return   void  
     */
    public void setName(String nameInput)
    {   
        // assign nameInput to variable name
        name = nameInput;
    }
    
    /**
     * This method will set value for the 
     * instance varible score
     * 
     * @param   totalScore  A int of player's
     *  total score
     * @return   void   
     */
    public void setScore(int totalScore)
    {   
        // assign totalScore to variable score
        score = totalScore;
    }    
}
