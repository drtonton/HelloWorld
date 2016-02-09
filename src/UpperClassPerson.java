/**
 * Created by noellemachin on 2/9/16.
 */
public class UpperClassPerson extends Person {
    @Override
    public void setName(String name) {
        super.setName(name.toUpperCase());
    }
}
