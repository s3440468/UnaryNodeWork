package gp.functions.oneArg;

import gp.node.Node;
import gp.node.UnaryNode;

/**
 * @author Dorothea Baker
 */
public class Square extends UnaryNode {
    // TODO in the real thing this will take only one node
    public Square(Node left, Node right)
    {
        super(left, "sqr");
    }
    
    public Square(Node left)
    {
        super(left, "sqr");
    }


    public double evaluate(double[] programParameters)
    {
        return Math.cos(left.evaluate(programParameters));
    }


    public Node simplify()
    {
        return left.simplify();
    }
}
