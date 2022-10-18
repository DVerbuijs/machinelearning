package com.example.ml.dataset;

/**
 * Interface for all posible types that the dataset needs.
 */
public interface IDataValue {
    /**
     * Adds a Float value to existend value.
     * If the derived allows it.
     * @param value
     */
    public void addFloat(float value)throws Exception;
     /**
     * Adds a Integer value to existend value.
     * If the derived allows it.
     * @param value
     */ 
    public void addInt(int value)throws Exception;
     /**
     * Divedes the existend value by param value.
     * If the derived allows it.
     * @param value
     */
    public void divede(float value)throws Exception;
     /**
     * Multiplies the existend value by param value.
     * If the derived allows it.
     * @param value
     */
    public void multiply(float value)throws Exception;

    /**
     * If the derived can convert it to a float.
     * @return a float of value.
     */
    public float toFloat()throws Exception;
    
    /**
     * If the derived can convert it to a int.
     * @return a int of value.
     */
    public int toInt()throws Exception;
    /**
     * convert its value to a String type.
     * @return a string of value.
     */
    @Override public String toString();
}
