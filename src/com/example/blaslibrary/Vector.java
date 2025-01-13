package com.example.blaslibrary;

public class Vector {
	private double[] vector;
	private int dimension;
	
	// basic constructor for vector, dimension -> 1D, 2D, 3D
	public Vector(int dimension)
	{
		if(dimension <= 0) {
			throw new IllegalArgumentException("Invalid number of dimensions.");
		}
		
		this.dimension = dimension;
		this.vector = new double[dimension];
	}
	
	// init vector
	public Vector(double[] components) {
        this.dimension = components.length;
        this.vector = components.clone();
    }
	
	public void setVector(int index, double value)
	{
		if (index < 0 || index >= dimension) {
			throw new IndexOutOfBoundsException("Invalid index, out of bounds.");
	    }
		
		this.vector[index] = value;
	}
	
	public int getDimension()
	{
		return dimension;
	}
	
	public double getVector(int index)
	{
		if(index < 0 || index >= dimension) {
			throw new IndexOutOfBoundsException("Invalid index, out of bounds.");
		}
		
		return this.vector[index];
	}
	
	public Vector addVector(Vector vector2)
	{
		if (this.dimension != vector2.dimension) {
			throw new IllegalArgumentException("Invalid dimension, vectors must match dimensions.");
	    }
		 
		Vector result = new Vector(dimension);
		for (int x = 0; x < dimension; x++) {
			result.setVector(x, this.getVector(x) + vector2.getVector(x));
		}
		
		return result;
	}
	
	public Vector scalarMultiplication(double scalar)
	{
		Vector result = new Vector(dimension);
		for (int x = 0; x < dimension; x++) {
			result.setVector(x, this.getVector(x) * scalar);
		}
		
		return result;
	}
	
	public double dotProduct(Vector vector2)
	{
		if (this.dimension != vector2.dimension) {
			throw new IllegalArgumentException("Invalid dimension, vectors must match dimensions.");
	    }
		
		double sum = 0;
		for (int x = 0; x < dimension; x++) {
			sum += this.getVector(x) * vector2.getVector(x);
		}
		
		return sum;
	}
	
	public double Magnitude()
	{
		double sum = 0;
		for (int x = 0; x < dimension; x++) {
			sum += this.getVector(x) * this.getVector(x);
		}
		
		return Math.sqrt(sum);
	}
	
	public Vector normalize() 
	{
        double magnitude = this.Magnitude();
        if (magnitude == 0) {
            throw new ArithmeticException("Cannot normalize a zero vector.");
        }
        
        return this.scalarMultiplication(1 / magnitude);
    }
	
	public void printVector()
	{
		System.out.print("[");
		for (int x = 0; x < dimension; x++) {
			System.out.print(this.getVector(x) + ", ");
		}
		
		System.out.print("]");
	}
}
