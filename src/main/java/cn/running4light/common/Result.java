package cn.running4light.common;

import java.io.Serializable;

/**
 *
 */
public class Result implements Serializable{
    private String status;
    private String msg;
    private Object data;
    public Result(){

    }
    public Result(String status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Result createSuccess(Object data){
        Result result = new Result();
        result.data = data;
        return result;
    }

    @Override
    public String toString() {
        return "Result{" +
                "status='" + status + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
