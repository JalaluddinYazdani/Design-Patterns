package Prototype;

public class IntelligentStudent extends Student{
    int IQ;

    IntelligentStudent(){}
    IntelligentStudent(IntelligentStudent st){
        super(st);
        this.IQ= st.IQ;
    }
    @Override
    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }
}
