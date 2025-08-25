
 class Box
{
    double Width;
    double Height;
    double Length;

    Box() {
        Width = 9;
        Height = 11;
        Length = 12;
    }

    double Value() {
        return (Width * Height * Length);
    }

}



class BoxWeight extends Box {
    double Weight;
    BoxWeight() {

        super();
        Weight = 8;
    }
    void ShowWeight()
    {
        double vol;
        vol = Value();
        System.out.println("Volume of Box is: " + vol);
        System.out.println("Weight of Box is: " + Weight);


    }
}
class boxDemo {
    public static void main(String[] args) {
        BoxWeight b = new BoxWeight();
        b.ShowWeight();
        System.out.println("Mohd Nomaan Atiq-2337435");
    }
}

