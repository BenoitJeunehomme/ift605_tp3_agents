package com.ift605.tp3.jade.agents.dispatch.behaviors;

import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.ift605.tp3.jade.messages.MessageReceiver.listen;

/**
 * Created by Bruno-Pier on 2015-11-16.
 */
public class InformDispatchBehaviour extends Behaviour {
    private static final Logger logger = LoggerFactory.getLogger(InformDispatchBehaviour.class);

    @Override
    public void action() {
        listen(myAgent, this, MessageTemplate.MatchPerformative(ACLMessage.INFORM)).forEquation(equation -> {

        });
    }

    @Override
    public boolean done() {
        return false;
    }
}
