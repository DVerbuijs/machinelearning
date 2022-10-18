package com.example.ml.dataset;

public class DataString implements  IDataValue {
    public String data;

    @Override
    public void addFloat(float value) throws Exception {
        try {
            Float temp = Float.parseFloat(data);
            temp+=value;
            data = String.valueOf(temp);

        } catch (Exception e) {
            throw new Exception("Current value could not be converted to float");
        }
        
    }

    @Override
    public void addInt(int value)throws Exception {
        try {
            int temp = Integer.parseInt(data);
            temp+=value;
            data = String.valueOf(temp);

        } catch (Exception e) {
            throw new Exception("Current value could not be converted to int");
        }
    }

    @Override
    public void divede(float value) throws Exception{
        try {
            Float temp = Float.parseFloat(data);
            temp/=value;
            data = String.valueOf(temp);

        } catch (Exception e) {
            throw new Exception("Current value could not be converted to float");
        }
        
    }

    @Override
    public void multiply(float value) throws Exception{
        try {
            Float temp = Float.parseFloat(data);
            temp*=value;
            data = String.valueOf(temp);

        } catch (Exception e) {
            throw new Exception("Current value could not be converted to float");
        }
    }

    @Override
    public float toFloat() throws Exception{
        try {
            return Float.parseFloat(data);
        } catch (Exception e) {
            throw new Exception("Current value could not be converted to float");
        }
        
    }

    @Override
    public int toInt() throws Exception{
        try {
            return Integer.parseInt(data);
        } catch (Exception e) {
            throw new Exception("Current value could not be converted to int");
        }
    }
    @Override
    public String toString(){
        return data;
        
    }
}
