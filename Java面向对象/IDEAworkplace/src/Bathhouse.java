public class Bathhouse {
    public void  manBathhouse(Person person) throws GenderException{
        if(person.gender.equals("男")){
            System.out.println("欢迎来到男浴室");  //如果是男，欢迎来到男浴室。
        }else {       //否则抛出异常
            throw new GenderException("走错了");
        }
    }
}
