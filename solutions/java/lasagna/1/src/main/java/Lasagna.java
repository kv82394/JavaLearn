public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    int Time= 40;
    public int expectedMinutesInOven(){
        return this.Time;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int x){
        return (this.Time- x);
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int x){
        return x*2;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int x,int y){
        return (x*2) + (y);
    }
}
