package edu.neu.madcourse.raj__kukadia.ping;

class Activity{

    public String activityname;
    public long activitytimestamp;

    public String getActivityname() {
        return activityname;
    }

    public void setActivityname(String activityname) {
        this.activityname = activityname;
    }

    public long getActivitytimestamp() {
        return activitytimestamp;
    }

    public void setActivitytimestamp(long activitytimestamp) {
        this.activitytimestamp = activitytimestamp;
    }

    Activity(String activityname, long activitytimestamp){
        this.activityname = activityname;
        this.activitytimestamp = activitytimestamp;
    }
}