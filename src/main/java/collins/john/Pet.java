package collins.john;

/**
 * Created by johncollins on 1/31/17.
 */
public abstract class Pet implements Comparable {


    String name;

    public String speak() {
        return "I am a Pet.";
    }

    public int compareTo(Pet pet) {
        char otherPet = pet.name.charAt(0);
        char thisPet = this.name.charAt(0);
        int result = 0;

        if(thisPet > otherPet){
            result = 1;
        }
        else if(thisPet < otherPet){
            result = -1;
        }
        else if(thisPet == otherPet){
            //tie breaker by class type
                thisPet = this.toString().charAt(14);
                otherPet = pet.toString().charAt(14);

            if(thisPet > otherPet){
                result = 1;
            }
            else if(thisPet < otherPet){
                result = -1;
            }
            else{
                result = 0;
            }
        }
        return result;
    }
}