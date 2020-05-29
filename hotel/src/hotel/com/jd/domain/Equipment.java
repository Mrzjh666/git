package hotel.com.jd.domain;

public class Equipment{
    private int equ_id;
    private String equ_name;
    private String equ_type;
    private int equ_num;
    private String equ_explain;
    private String equ_mark;
    private String equ_picpath;
    private int emp_id;

    public int getEqu_id() {
        return equ_id;
    }

    public void setEqu_id(int equ_id) {
        this.equ_id = equ_id;
    }

    public String getEqu_name() {
        return equ_name;
    }

    public void setEqu_name(String equ_name) {
        this.equ_name = equ_name;
    }

    public String getEqu_type() {
        return equ_type;
    }

    public void setEqu_type(String equ_type) {
        this.equ_type = equ_type;
    }

    public int getEqu_num() {
        return equ_num;
    }

    public void setEqu_num(int equ_num) {
        this.equ_num = equ_num;
    }

    public String getEqu_explain() {
        return equ_explain;
    }

    public void setEqu_explain(String equ_explain) {
        this.equ_explain = equ_explain;
    }

    public String getEqu_mark() {
        return equ_mark;
    }

    public void setEqu_mark(String equ_mark) {
        this.equ_mark = equ_mark;
    }

    public String getEqu_picpath() {
        return equ_picpath;
    }

    public void setEqu_picpath(String equ_picpath) {
        this.equ_picpath = equ_picpath;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    @Override
    public java.lang.String toString() {
        return "Equipment{" +
                "equ_id=" + equ_id +
                ", equ_name='" + equ_name + '\'' +
                ", equ_type='" + equ_type + '\'' +
                ", equ_num=" + equ_num +
                ", equ_explain='" + equ_explain + '\'' +
                ", equ_mark='" + equ_mark + '\'' +
                ", equ_picpath='" + equ_picpath + '\'' +
                ", emp_id=" + emp_id +
                '}';
    }
}