package org.example.matrices;

import org.example.vectors.Vector4d;

public class Matrix4d extends AbstractSquareMatrix<Matrix4d, Vector4d> {
    public Matrix4d(double[][] data) {
        super(4, data);
    }

    public Matrix4d() {
        super(4);
    }

    @Override
    protected Matrix4d initialReturnThis() {
        return this;
    }

    @Override
    protected Vector4d initialCreateVector(double[] data) {
        return new Vector4d(data);
    }
}
