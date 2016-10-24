package gp.functions.oneArg;

import gp.node.Node;
import gp.node.UnaryNode;

/**
 * @author Dorothea Baker
 */
public class SquareRoot extends UnaryNode {
    // TODO in the real thing this will take only one node
    public SquareRoot(Node left, Node right)
    {
        super(left, "sqrt");
    }
    
    public SquareRoot(Node left)
    {
        super(left, "sqrt");
    }


    public double evaluate(double[] programParameters)
    {
        return Math.sqrt(left.evaluate(programParameters));
    }


    public Node simplify()
    {
        return left.simplify();
    }
}
