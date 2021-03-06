package mengine;

import java.util.ArrayList;
/**
 * @author Milan Savickij
 * 
 * <p> Hold information about scene, can be rendered on screen in <strong>Display</strong>
 * 
 * @since 27th August 2020
 * <p> Last updated on 3rd October 2020
 * @see Display
 */
public class Scene {
    
    /**
     * <p> Index with which this scene can be accessed
     */
    public int index;
    /**
     * <p> Name of this scene
     */
    public String name;
    
    public ArrayList<RenderObject> toRender = new ArrayList<>();
    /**
     * <p> Creates new scene with specified parameters
     * 
     * @param name Name of this scene
     */
    public Scene( String name)
    {
        this.name = name;
    }
    /**
     * <p>This function will add specified object to list of objects that will be rendered on screen
     * 
     * @param obj This object will be added
     */
    public void addObject(RenderObject obj)
    {
        toRender.add(obj);
        //obj.addComponent(new Transform(0,0,0,0,0));
        //sort();
    }
    /**
     * <p> This function will remove specified object from list of objects that will be rendered on screen
     * 
     * @param obj This object will be removed
     */
    public void removeObject(RenderObject obj)
    {
        toRender.remove(obj);
    }
    /**
     * <p> Sorts all elements according to z position to be rendered in correct order
     */
    public void sort()
    {
        /*int smallest = Integer.MIN_VALUE;
        ArrayList<RenderObject> objs = new ArrayList<>();
        
        for(int i = 0; i < toRender.size(); i++)
        {
            RenderObject obj = toRender.get(i);
            Transform t = (Transform) obj.getComponent(new Transform());
            if(t.position.z >= smallest)
            {
                
            }
        }
        
        toRender = objs;*/
    }

    /**
     * <p> Finds needed object by its name
     * @param name Name of the object
     * @return Object found
     */
    public RenderObject FindObject(String name)
    {
        for(RenderObject obj : toRender)
        {
            if(obj.name == name)
            {
                return obj;
            }
        }
        return null;
    }
}
