package gp.functions.oneArg;

import gp.node.Node;
import gp.node.UnaryNode;

/**
 * @author Dorothea Baker
 */
public class CubeRoot extends UnaryNode {
    // TODO in the real thing this will take only one node
    public CubeRoot(Node left, Node right)
    {
        super(left, "cbrt");
    }
    
    public CubeRoot(Node left)
    {
        super(left, "cbrt");
    }


    public double evaluate(double[] programParameters)
    {
        return Math.cbrt(left.evaluate(programParameters));
    }


    public Node simplify()
    {
        return left.simplify();
    }
}
