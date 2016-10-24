package gp.functions.oneArg;

import gp.node.Node;
import gp.node.UnaryNode;

/**
 * @author Dorothea Baker
 */
public class Cube extends UnaryNode {
    // TODO in the real thing this will take only one node
    public Cube(Node left, Node right)
    {
        super(left, "cube");
    }
    
    public Cube(Node left)
    {
        super(left, "cube");
    }


    public double evaluate(double[] programParameters)
    {
        return Math.pow(left.evaluate(programParameters), 3);
    }


    public Node simplify()
    {
        return left.simplify();
    }
}
