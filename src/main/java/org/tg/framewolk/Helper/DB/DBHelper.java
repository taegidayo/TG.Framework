package org.tg.framewolk.Helper.DB;

import com.mongodb.client.*;
import com.mongodb.client.model.FindOneAndReplaceOptions;
import com.mongodb.client.model.ReplaceOneModel;
import org.tg.framewolk.Result.Result;

public class DBHelper {

    private DatabaseType _type;
    private String _dbPath="";
    private String _userID="";
    private String _password="";

    private boolean _isConnected=false;

    public DBHelper(DatabaseType type){
        _type=type;
    }

    public MongoClient mongoClient = null;


    public boolean Connect(String path){
        _dbPath=path;
        if(path==null){
            path="test";
        }
        try {
            switch (_type) {
                case MongoDB ->{
                        mongoClient = MongoClients.create(path);
                        if (mongoClient != null) {
                            _isConnected = false;
                            return false;
                        }
                        _isConnected = true;
                        return true;
                    }

                case SQLite -> {

                }
                default -> {
                    return false;
                }
            }
        }
        catch (Exception ex){
            return false;
        }
        return false;
    }

    public boolean Connect(String path,String id,String password) {
        _dbPath=path;
        _userID=id;
        _password=password;
        try {
            switch (_type) {
                case MySQL -> {

                }


                default -> {
                    return false;
                }
            }
        }
        catch (Exception ex){
            return false;
        }
return false;
    }

    public Result Insert(Object data)
    {
        Result res= new Result();



        return  res;
    }


}
