package org.tg.framewolk.Result;

public class Result {
    public boolean result;
    public String Comment ="";



    public Result()
    {
        this.result = false;

    }
    public Result(boolean result)
    {
        this.result = result;

    }

    public Result(Exception ex){
        result=false;
        this.Comment =ex.getMessage();
    }




}
