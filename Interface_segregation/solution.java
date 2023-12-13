public class solution {
    public static void main(String[] args) {
        
    }
}
// you are creating a UI Library
interface IWidget {
    void onClickEvent();
    void onKeyboardEvent();
}

class TextInput implements IWidget{

    @Override
    public void onClickEvent() {
       System.out.println("I can click");
    }

    @Override
    public void onKeyboardEvent() {
        System.out.println("I can type");
    }

}

class Button implements IWidget {

    @Override
    public void onClickEvent() {
        System.out.println("I can click");
    }

    @Override
    public void onKeyboardEvent() {
        // voilation of the rule
        throw new UnsupportedOperationException("Unimplemented method 'onKeyboardEvent'");
    }

}


// interface IClickableWidget {
//     void onClickEvent();
// }

// interface IKeyboardWidget {
//      void keyBoardEvent();
// }

// class TextInput implements IClickableWidget,IKeyboardWidget{

//     @Override
//     public void keyBoardEvent() {
//         System.out.println("I can use keyboard");
//     }

//     @Override
//     public void onClickEvent() {
//        System.out.println("I can use mouse ");
//     }

// }

// class Button implements IClickableWidget {

//     @Override
//     public void onClickEvent() {
//         System.out.println("I can click");
//     }

// }