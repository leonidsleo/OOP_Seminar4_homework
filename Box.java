package OOPsem4homework;

import java.util.ArrayList;

public class Box<T extends Fruct> {
    ArrayList<T> fructs;

    public Box() {
        this.fructs = new ArrayList<T>();
    }

    //суммарный вес коробки
    public float getWeight() {
        float sumWeightBox = 0.0f;
        for (T a : fructs) {
            sumWeightBox += a.getWeight();
        }
        return sumWeightBox;
    }    

    public Boolean compare(Box<?> boxs) {
        if (this.getWeight() == boxs.getWeight()) {
            return true;
        }
        return false;
    }

    public void addFruct(T fruct) {
        fructs.add(fruct);
    }

    public void boxTransfer(Box<T> otherBox) {
        for (T fruct : fructs) {
            otherBox.addFruct(fruct);
        }
        fructs.clear();
    }

    
}
