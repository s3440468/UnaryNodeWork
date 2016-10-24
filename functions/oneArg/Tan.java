package gp.functions.oneArg;

import gp.node.Node;
import gp.node.UnaryNode;

/**
 * @author Dorothea Baker
 */
public class Tan extends UnaryNode {
    // TODO in the real thing this will take only one node
    public Tan(Node left, Node right)
    {
        super(left, "tan");
    }
    
    public Tan(Node left)
    {
        super(left, "tan");
    }


    public double evaluate(double[] programParameters)
    {
        return Math.tan(left.evaluate(programParameters));
    }


    public Node simplify()
    {
        return left.simplify();
    }
}
