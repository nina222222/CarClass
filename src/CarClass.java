public class CarClass {
    private String m_make;
    private String m_model;
    private double m_fuelCapacity;
    private double m_currentFuel;//means the fuel Capacity, like how much fuel is the capacity
    private double m_mpg;//miles per gallon

    public CarClass(String make, String model, double fuelCapacity, double mpg){
        m_make = make;
        m_model = model;
        m_fuelCapacity = fuelCapacity;
        m_currentFuel = fuelCapacity;
        m_mpg = mpg;

    }

    public String getMake() {
        return m_make;
    }

    public String getModel() {
        return m_model;
    }

    public double getMpg() {
        return m_mpg;
    }

    public double getFuelCapacity() {
        return m_fuelCapacity;
    }

    public void setCurrentFuel(double currentFuel) {
         if (currentFuel >= 0 && currentFuel <= m_fuelCapacity) {
            m_currentFuel = currentFuel;
         }
    }
    
    public void drive(double miles) {
        if (m_currentFuel <= (miles/ m_mpg)) {
           miles = m_currentFuel * m_mpg;
           setCurrentFuel(0);
        } else {
            setCurrentFuel(m_currentFuel - (miles/ m_mpg));
        }
        System.out.println(m_make + " " + m_model + " drove " + miles + " miles.");
    }

    public void refuel(double fuel) {
        setCurrentFuel(m_currentFuel + fuel);
        System.out.println(m_make + " " + m_model + " refueled. Current fuel: " + fuel + " gallons.");
    }

}
