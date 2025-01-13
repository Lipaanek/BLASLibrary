package com.example.blaslibrary;

public class Matrix {
	private double[][] matrix;
	private int rows;
	private int cols;
	
	
	public Matrix(int rows, int cols)
	{
		if(rows <= 0 || cols <= 0) { throw new IllegalArgumentException("Wrong matrix dimensions."); }
		
		this.matrix = new double[rows][cols];
		this.rows = rows;
		this.cols = cols;
	}
	
	public Matrix(double[][] data) {
        this.rows = data.length;
        this.cols = data[0].length;

        for (int x = 1; x < rows; x++) {
            if (data[x].length != cols) {
                throw new IllegalArgumentException("All rows must have the same number of columns.");
            }
        }
        this.matrix = data;
    }
	
	public int getRows()
	{
		return rows;
	}
	
	public int getCols()
	{
		return cols;
	}
	
	public void setMatrixValue(int row, int col, double value)
	{
		if (row < 0 || row >= rows || col < 0 || col >= cols) {
			throw new ArrayIndexOutOfBoundsException("Invalid index, array out of bounds.");
		}
		
		matrix[row][col] = value;
	}
	
	public double getMatrixValue(int row, int col)
	{
		if (row < 0 || row >= rows || col < 0 || col >= cols) {
			throw new ArrayIndexOutOfBoundsException("Invalid index, value out of bounds.");
		}
		
		return matrix[row][col];
	}
	
	public Matrix scalarMultiplication(double scalar)
	{
		Matrix result = new Matrix(rows, cols);
		
		for (int x = 0; x < rows; x++) {
			for (int y = 0; y < cols; y++) {
				result.setMatrixValue(y, x, this.getMatrixValue(y, x) * scalar);
			}
		}
		
		return result;
	}
	
	public Matrix addMatrix(Matrix matrix2)
	{
		if (this.rows != matrix2.rows || this.cols != matrix2.cols) {
            throw new IllegalArgumentException("Invalid dimensions, Matrix dimensions must match for addition.");
        }
		
		Matrix result = new Matrix(rows, cols);
		
		for (int x = 0; x < rows; x++) {
			for (int y = 0; y < cols; y++) {
				result.setMatrixValue(y, x, this.getMatrixValue(y, x) + matrix2.getMatrixValue(y, x));
			}
		}
		
		return result;
	}
	
	public Matrix subMatrix(Matrix matrix2)
	{
		if (this.rows != matrix2.rows || this.cols != matrix2.cols) {
            throw new IllegalArgumentException("Invalid dimensions, Matrix dimensions must match.");
        }
		
		Matrix result = new Matrix(rows, cols);
		
		for (int x = 0; x < rows; x++) {
			for (int y = 0; y < cols; y++) {
				result.setMatrixValue(y, x, this.getMatrixValue(y, x) - matrix2.getMatrixValue(y, x));
			}
		}
		
		return result;
	}
	
	public Matrix multiplyMatrix(Matrix matrix2)
	{
		if (this.cols != matrix2.rows) {
            throw new IllegalArgumentException("Invalid dimension, number of columns in the first matrix must equal the number of rows in the second.");
        }
		
		Matrix result = new Matrix(this.rows, matrix2.cols);
		for (int x = 0; x < result.rows; x++) {
			for (int y = 0; y < result.cols; y++) {
				double sum = 0;
				for (int z = 0; z < this.cols; z++) {
					sum += this.getMatrixValue(x, z) * matrix2.getMatrixValue(z, y);
				}
				result.setMatrixValue(x, y, sum);
			}
		}
		
		return result;
	}
	
	public Matrix transposeMatrix()
	{
		Matrix result = new Matrix(rows, cols);
		
		for (int x = 0; x < rows; x++) {
			for (int y = 0; y < cols; y++) {
				result.setMatrixValue(y, x, this.getMatrixValue(x, y));
			}
		}
		
		return result;
	}
	
	public void printMatrix()
	{
		for (int x = 0; x < rows; x++) {
			for (int y = 0; y < cols; y++) {
				System.out.print(this.getMatrixValue(x, y) + " ");
			}
			System.out.println();
		}
	}
	
}
