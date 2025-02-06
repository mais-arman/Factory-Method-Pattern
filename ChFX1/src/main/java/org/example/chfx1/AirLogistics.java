package org.example.chfx1;

public class AirLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Airplane();
    }
}
