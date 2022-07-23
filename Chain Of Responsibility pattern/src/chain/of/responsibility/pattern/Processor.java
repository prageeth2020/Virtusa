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
abstract class Processor
{
    private Processor nextProcessor;
 
    public Processor(Processor nextProcessor){
        this.nextProcessor = nextProcessor;
    };
     
    public void process(Number request){
        if(nextProcessor != null)
            nextProcessor.process(request);
    };
}
