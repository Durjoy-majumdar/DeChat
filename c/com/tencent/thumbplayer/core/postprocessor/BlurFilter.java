package com.tencent.thumbplayer.core.postprocessor;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.google.android.gms.gcm.Task;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class BlurFilter {
    private static final int FLOAT_SIZE_BYTES = 4;
    private static final String TAG = "sifeng: BlurFilter";
    private static final float[] positoins = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
    private static final float[] texcoords = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    private String FRAGMENT_SHADER;
    private String VERTEX_SHADER;
    private int[] mFrameBuffer = new int[3];
    private int mHeight = 0;
    private float[] mMVPMatrix = new float[16];
    private int mOffsetid = 0;
    private FloatBuffer mPositoins;
    private int mProgramHandle = 0;
    private float[] mSTMatrix = new float[16];
    private FloatBuffer mTexcoords;
    private int[] mTextureid = new int[3];
    private int mWidth = 0;
    private int minputImageTextureid = 0;
    private int mpositionid = 0;
    private int mtexSizeid = 0;
    private int mtexcoordid = 0;
    private int muMVPMatrixHandle;
    private int muSTMatrixHandle;

    public BlurFilter(String str) {
        for (int i = 0; i < 3; i++) {
            this.mFrameBuffer[i] = 0;
            this.mTextureid[i] = 0;
        }
        float[] fArr = positoins;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.mPositoins = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        float[] fArr2 = texcoords;
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.mTexcoords = asFloatBuffer2;
        asFloatBuffer2.put(fArr2).position(0);
        Matrix.setIdentityM(this.mSTMatrix, 0);
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream(str + "/vertex_blur.glsl");
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (resourceAsStream != null) {
            while (true) {
                int read = resourceAsStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        }
        resourceAsStream.close();
        byteArrayOutputStream.close();
        this.VERTEX_SHADER = new String(byteArrayOutputStream.toByteArray());
        ClassLoader classLoader2 = getClass().getClassLoader();
        InputStream resourceAsStream2 = classLoader2.getResourceAsStream(str + "/fragment_blur.glsl");
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        if (resourceAsStream2 != null) {
            while (true) {
                int read2 = resourceAsStream2.read(bArr);
                if (read2 == -1) {
                    break;
                }
                byteArrayOutputStream2.write(bArr, 0, read2);
            }
        }
        resourceAsStream2.close();
        byteArrayOutputStream2.close();
        this.FRAGMENT_SHADER = new String(byteArrayOutputStream2.toByteArray());
        if (!compileShaders() || checkGlError("BlurFilter") != 0) {
            throw new RuntimeException("sifeng: BlurFilter create failed");
        }
    }

    private int checkGlError(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return 0;
        }
        Integer.toHexString(glGetError);
        return glGetError;
    }

    public int compileShader(String str, int i) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public boolean compileShaders() {
        int compileShader;
        int compileShader2 = compileShader(this.VERTEX_SHADER, 35633);
        if (compileShader2 == 0 || (compileShader = compileShader(this.FRAGMENT_SHADER, 35632)) == 0) {
            return false;
        }
        this.mProgramHandle = GLES20.glCreateProgram();
        if (checkGlError("glCreateProgram") != 0) {
            return false;
        }
        GLES20.glAttachShader(this.mProgramHandle, compileShader2);
        if (checkGlError("glAttachShader") != 0) {
            return false;
        }
        GLES20.glAttachShader(this.mProgramHandle, compileShader);
        if (checkGlError("glAttachShader") != 0) {
            return false;
        }
        GLES20.glLinkProgram(this.mProgramHandle);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.mProgramHandle, 35714, iArr, 0);
        if (iArr[0] != 1) {
            GLES20.glGetProgramInfoLog(this.mProgramHandle);
            GLES20.glDeleteProgram(this.mProgramHandle);
            this.mProgramHandle = 0;
            return false;
        }
        GLES20.glUseProgram(this.mProgramHandle);
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.mProgramHandle, "position");
        this.mpositionid = glGetAttribLocation;
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.mProgramHandle, "texCoord");
        this.mtexcoordid = glGetAttribLocation2;
        GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
        this.mtexSizeid = GLES20.glGetUniformLocation(this.mProgramHandle, "texSize");
        this.mOffsetid = GLES20.glGetUniformLocation(this.mProgramHandle, "Offset");
        this.minputImageTextureid = GLES20.glGetUniformLocation(this.mProgramHandle, "inputImageTexture");
        this.muMVPMatrixHandle = GLES20.glGetUniformLocation(this.mProgramHandle, "uMVPMatrix");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.mProgramHandle, "uSTMatrix");
        this.muSTMatrixHandle = glGetUniformLocation;
        return (this.mpositionid == -1 || this.mtexcoordid == -1 || this.minputImageTextureid == -1 || this.muMVPMatrixHandle == -1 || glGetUniformLocation == -1 || this.mtexSizeid == -1 || this.mOffsetid == -1) ? false : true;
    }

    public void destroyBuffers() {
        for (int i = 0; i < 3; i++) {
            int[] iArr = this.mFrameBuffer;
            if (iArr[i] != 0) {
                GLES20.glDeleteFramebuffers(1, iArr, i);
                this.mFrameBuffer[i] = 0;
            }
            int[] iArr2 = this.mTextureid;
            if (iArr2[i] != 0) {
                GLES20.glDeleteTextures(1, iArr2, i);
                this.mTextureid[i] = 0;
            }
        }
        int i2 = this.mProgramHandle;
        if (i2 != 0) {
            GLES20.glDeleteProgram(i2);
            this.mProgramHandle = 0;
        }
    }

    public int getTexid(int i) {
        return this.mTextureid[i];
    }

    public void process(int i, int i2, int i3) {
        int i4 = i2;
        int i5 = i3;
        if (!(this.mWidth == i4 && this.mHeight == i5)) {
            updatebuffer(i4, i5);
        }
        int i6 = i;
        int i7 = 0;
        int i8 = 1;
        while (i7 < 3) {
            i8 = (i7 != 0 || i4 * i5 >= 921600) ? i8 * 2 : i8 * 1;
            GLES20.glBindFramebuffer(36160, this.mFrameBuffer[i7]);
            GLES20.glUseProgram(this.mProgramHandle);
            int i9 = i4 / i8;
            int i15 = i5 / i8;
            GLES20.glViewport(0, 0, i9, i15);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16384);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, i6);
            GLES20.glUniform1i(this.minputImageTextureid, 0);
            GLES20.glUniform2f(this.mtexSizeid, (float) (i9 * 2), (float) (i15 * 2));
            GLES20.glUniform1f(this.mOffsetid, 1.0f);
            Matrix.setIdentityM(this.mMVPMatrix, 0);
            GLES20.glUniformMatrix4fv(this.muMVPMatrixHandle, 1, false, this.mMVPMatrix, 0);
            GLES20.glUniformMatrix4fv(this.muSTMatrixHandle, 1, false, this.mSTMatrix, 0);
            GLES20.glEnableVertexAttribArray(this.mpositionid);
            GLES20.glEnableVertexAttribArray(this.mtexcoordid);
            this.mPositoins.position(0);
            this.mTexcoords.position(0);
            GLES20.glVertexAttribPointer(this.mpositionid, 3, 5126, false, 0, this.mPositoins);
            GLES20.glVertexAttribPointer(this.mtexcoordid, 2, 5126, false, 0, this.mTexcoords);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.mpositionid);
            GLES20.glDisableVertexAttribArray(this.mtexcoordid);
            i6 = this.mTextureid[i7];
            if (checkGlError("BlurFilter") == 0) {
                GLES20.glBindFramebuffer(36160, 0);
                i7++;
            } else {
                throw new RuntimeException("sifeng: BlurFilter process failed");
            }
        }
    }

    public void updatebuffer(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        int i5 = 0;
        int i6 = 1;
        while (i5 < 3) {
            int[] iArr = this.mFrameBuffer;
            if (iArr[i5] != 0) {
                GLES20.glDeleteFramebuffers(1, iArr, i5);
                this.mFrameBuffer[i5] = 0;
            }
            int[] iArr2 = this.mTextureid;
            if (iArr2[i5] != 0) {
                GLES20.glDeleteTextures(1, iArr2, i5);
                this.mTextureid[i5] = 0;
            }
            i6 = (i5 != 0 || i3 * i4 >= 921600) ? i6 * 2 : i6 * 1;
            GLES20.glGenFramebuffers(1, this.mFrameBuffer, i5);
            GLES20.glBindFramebuffer(36160, this.mFrameBuffer[i5]);
            GLES20.glGenTextures(1, this.mTextureid, i5);
            GLES20.glBindTexture(3553, this.mTextureid[i5]);
            GLES20.glTexImage2D(3553, 0, NativeBitmapStruct.GLFormat.GL_RGBA, i3 / i6, i4 / i6, 0, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, (Buffer) null);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, Task.EXTRAS_LIMIT_BYTES, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.mTextureid[i5], 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glBindFramebuffer(36160, 0);
            i5++;
        }
        this.mWidth = i3;
        this.mHeight = i4;
    }
}
