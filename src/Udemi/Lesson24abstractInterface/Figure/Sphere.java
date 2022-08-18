package Udemi.Lesson24abstractInterface.Figure;

public class Sphere extends Figura3D
{
    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public double getSurfaceSquare() {
        return 0;
    }

    @Override
    public double getVisibleHeight() {
        return 0;
    }

    @Override
    public double getVisibleWeight() {
        return 0;
    }

    @Override
    public String get() {
        return null;
    }

    @Override
    public void show() {
        super.show();
    }
}
