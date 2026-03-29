import java.util.Stack;

public class RemoteControl {

    //4 Slots to be assigned as we have on off option
    //for both AC and light
    private Command[] buttons= new Command[4];

    //This will store all the commands that will be executed
    //it is most useful when undo method will be called
    //when we will undo we will get the object of the concerete class
    //and with that object undo method will be called
    private Stack<Command> commands= new Stack<>();

    //Assigning the slots to commands throught setter;

    public void setCommand(int slot ,Command command)
    {
        buttons[slot]=command;
    }

    //Press the button to execute the command

    public void pressButton(int slot)
    {
        if(buttons[slot]!=null)
        {
            buttons[slot].execute();
            //Store the command into stack
            commands.push(buttons[slot]);
        }
        else
        {
            System.out.println("No commands to undo.");
        }
    }

    public void pressUndo() {
        if (!commands.isEmpty()) {
            commands.pop().undo();
        } else {
            System.out.println("No commands to undo.");
        }
    }
}
