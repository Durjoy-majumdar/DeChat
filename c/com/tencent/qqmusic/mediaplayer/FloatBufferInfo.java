package com.tencent.qqmusic.mediaplayer;

public class FloatBufferInfo {
    public int bufferSize;
    public float[] floatBuffer;
    public float[] tempFloatBuffer;

    public void appendFloat(float[] fArr, int i, int i2) {
        if (fArr != null && i >= 0 && i2 > 0 && i + i2 <= fArr.length) {
            setFloatBufferCapacity(this.bufferSize + i2);
            System.arraycopy(fArr, i, this.floatBuffer, this.bufferSize, i2);
        }
    }

    public FloatBufferInfo copy(FloatBufferInfo floatBufferInfo) {
        floatBufferInfo.bufferSize = this.bufferSize;
        floatBufferInfo.floatBuffer = this.floatBuffer;
        floatBufferInfo.tempFloatBuffer = this.tempFloatBuffer;
        return floatBufferInfo;
    }

    public void fillFloat(float[] fArr, int i) {
        if (fArr != null && i > 0 && i <= fArr.length) {
            this.floatBuffer = fArr;
            this.bufferSize = i;
        }
    }

    public void setFloatBufferCapacity(int i) {
        float[] fArr = this.floatBuffer;
        if (fArr == null || fArr.length < i) {
            this.floatBuffer = new float[i];
        }
    }

    public void setTempFloatBufferCapacity(int i) {
        float[] fArr = this.tempFloatBuffer;
        if (fArr == null || fArr.length < i) {
            this.tempFloatBuffer = new float[i];
        }
    }
}
