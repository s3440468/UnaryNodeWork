package gp.functions.oneArg;

import gp.node.Node;
import gp.node.UnaryNode;

/**
 * @author Dorothea Baker
 */
public class Sin extends UnaryNode {
    // TODO in the real thing this will take only one node
    public Sin(Node left, Node right)
    {
        super(left, "sin");
    }
    
    public Sin(Node left) {
    	super(left, "sin");
    }


    public double evaluate(double[] programParameters)
    {
        return Math.sin(left.evaluate(programParameters));
    }


    public Node simplify()
    {
        return left.simplify();
    }
}
