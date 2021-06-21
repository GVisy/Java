package Marathon.competitor;

public class Team {
    private String title;
    private Competitior[] members;

    public Competitior[] getMembers() {
        return members;
    }
    public Team(String title, Competitior...members){
        this.title=title;
        this.members=members;
    }
    public void showWinners(){
        System.out.println("win");
        for (Competitior o:members){
            if (o.isOnDistance()){
                o.info();
            }
        }
    }
}
