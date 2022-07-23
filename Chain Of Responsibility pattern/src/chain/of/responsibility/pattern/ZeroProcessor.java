/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain.of.responsibility.pattern;

/**
 *
 * @author ACER
 */
class ZeroProcessor extends Processor
{
    public ZeroProcessor(Processor nextProcessor){
        super(nextProcessor);
    }
 
    public void process(Number request)
    {
        if (request.getNumber() == 0)
        {
            System.out.println("ZeroProcessor : " + request.getNumber());
        }
        else
        {
            super.process(request);
        }
    }
}