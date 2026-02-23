public class jug {
    int capacity;
    int content = 0;
    
    void state()
    {
        System.out.println("Capacity: " + capacity);
        System.out.println("Content: " + content);
    }
    
    void fill(int filler)
    {
        content=capacity;
    }

    void empty()
    {
        content=0;
    }

    boolean isEmpty()
    {
        return (content==0);
    }

    void pourFrom(jug j)
    {
        int remaining = capacity-content;
        if(remaining>j.content)
        {
            content+=j.content;
        }
        else
        {
            content=capacity;
            j.content-=remaining;
        }
    }    
}

