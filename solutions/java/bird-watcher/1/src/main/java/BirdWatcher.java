
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        int n = birdsPerDay.length;
        return birdsPerDay[n-1];
    }

    public void incrementTodaysCount() {
        int n = birdsPerDay.length;
        birdsPerDay[n-1]++;
    }

    public boolean hasDayWithoutBirds() {
        int n = birdsPerDay.length;
        for(int i = 0 ;i<n;i++){
            if(birdsPerDay[i]==0)return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        if(numberOfDays>birdsPerDay.length){
            numberOfDays= birdsPerDay.length;
        }
        for(int i = 0 ;i<numberOfDays;i++){
            count += birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        int n = birdsPerDay.length;
        int count = 0;
        for(int i = 0 ;i<n;i++){
            if(birdsPerDay[i]>=5)count++;
        }
        return count;
    }
}
