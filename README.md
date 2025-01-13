# BLASLibrary
Open source 'Basic Linear Algebra Sourcer'

## Features
- Matrix manipulation
- Vector manipulation

## What is it good for?
- Fast and efficient java 3D game development

# Documentation - Matrix
### 1. new Matrix()
   
Create matrix using Matrix datatype
```java
Matrix m1 = new Matrix(new double[][] {{1, 2},{1, 2}});
```
Matrix numbers and size can be changed.

### 2. Matrix.setMatrixValue()

Setter for matrix values using `setMatrixValue` function.
```java
m1.setMatrixValue(row, column, value);
```

### 3. Matrix.getMatrixValue()

Getter for matrix values using `getMatrixValue` function.
```java
m1.getMatrixValue(row, column);
```

Returns `double` value.

### 4. Matrix.scalarMultiplication()

Scales up Matrix by scalar value.
```java
m1.scalarMultiplication(scalar);
```

Returns a new scaled Matrix.

### 5. Matrix.addMatrix()

Adds up two matricies (requires two instances of class Matrix).
```java
m1.addMatrix(m2);
```

Returns new Matrix that is the sum of two matricies.

### 6. Matrix.subMatrix()

Subtracts two matricies (requires two instances of class Matrix).
```java
m1.subMatrix(m2);
```

Returns new Matrix that is the sub of two matricies.

### 7. Matrix.multiplyMatrix()

Multiplies two matricies (requires two instances of class Matrix).
```java
m1.multiplyMatrix(m2);
```

Returns new Matrix that is the dot product of two matricies.

### 8. Matrix.transposeMatrix()

Transpose of Matrix.
```java
m1.transposeMatrix();
```

Returns new Matrix, transposed.

### 9. Matrix.printMatrix()

Prints out the Matrix.
```java
m1.printMatrix();
```

# Documentation - Vector
### 1. new Vector()
   
Create vector using Vector datatype
```java
Vector v1 = new Vector(dimension);
```
Requires dimension count -> 1D, 2D, 3D...

### 2. Vector.setVector()

Setter for vector values using `setVector` function.
```java
v1.setVector(index, value);
```

### 3. Vector.getVector()

Getter for vector values using `getVector` function.
```java
v1.getVector(index);
```

Returns `double` value.

### 4. Vector.scalarMultiplication()

Scales up Vector by scalar value.
```java
v1.scalarMultiplication(scalar);
```

Returns a new scaled Vector.

### 5. Vector.addVector()

Adds up two vectors (requires two instances of class Vector).
```java
v1.addVector(v2);
```

Returns new Vector that is the sum of two vectors.

### 6. Vector.subVector()

Subtracts two vectors (requires two instances of class Vector).
```java
v1.subVector(v2);
```

Returns new Vector that is the sub of two vectors.

### 7. Vector.dotProduct()

Multiplies two vectors (requires two instances of class Vector).
```java
v1.dotProduct(v2);
```

Returns new Vector that is the dot product of two vectors.

### 8. Vector.Magnitude()

Magnitude of Vector.
```java
v1.Magnitude();
```

Returns magnitude of Vector.

### 9. Vector.Normalize()

Normalization of Vector.
```java
v1.Normalize();
```

Returns normalized Vector.

### 10. Vector.printVector()

Prints out the Vector.
```java
v1.printVector();
```


> [!NOTE]
> There might not be listed all the functions, only the most important ones.
