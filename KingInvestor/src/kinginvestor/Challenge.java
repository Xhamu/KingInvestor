/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kinginvestor;

import java.util.ArrayList;

/**
 *
 * @author srodgro
 */
public class Challenge {

    private String type;
    private String difficulty;
    private int cost;

    public Challenge(String type, String difficulty, int cost) {
        this.type = type;
        this.difficulty = difficulty;
        this.cost = cost;
    }

    public boolean handle(Business business, String strategy) {
        switch (type) {
            case "competition":
                return handleCompetition(business, strategy);
            case "lack of capital":
                return handleLackOfCapital(business, strategy);
            case "personnel problems":
                return handlePersonnelProblems(business, strategy);
            default:
                return false;
        }
    }

    private boolean handleCompetition(Business business, String strategy) {
        switch (strategy) {
            case "improve quality":
                business.setQuality(business.getQuality() + 1);
                return true;
            case "lower prices":
                business.setPrice(business.getPrice() - 1);
                return true;
            default:
                return false;
        }
    }

    private boolean handleLackOfCapital(Business business, String strategy) {
        switch (strategy) {
            case "get loan":
                business.getLoan(cost, 0.1);
                return true;
            case "sell assets":
                business.setPrice(business.getPrice() - cost);
                return true;
            default:
                return false;
        }
    }

    private boolean handlePersonnelProblems(Business business, String strategy) {
        switch (strategy) {
            case "train employees":
                for (Employee employee : business.getEmployees()) {
                    employee.setSkill(employee.getSkill() + 1);
                }
                return true;
            case "replace employees":
                business.setEmployees(new ArrayList<>());
                return true;
            default:
                return false;
        }
    }
}
