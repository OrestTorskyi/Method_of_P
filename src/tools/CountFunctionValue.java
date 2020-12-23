package tools;

import tools.DifferentialEquation;
public class CountFunctionValue {

    public double countOuterValue(double h, double x_i, double y_i)
    {
        DifferentialEquation function = new DifferentialEquation();
        double x_changed = x_i + h / 2;
        double y_changed = y_i + h / 2 * function.differentialEquationCount(x_i,y_i);

        double delta_y = h * function.differentialEquationCount(x_changed,y_changed);

        return delta_y;
    }
}
