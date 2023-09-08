package com.tencent.thumbplayer.core.postprocessor;

import android.graphics.SurfaceTexture;
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

public class OES2TextureFilter {
    private static final int FLOAT_SIZE_BYTES = 4;
    private static final String TAG = "sifeng: OES2Texture";
    private static final float[] positoins = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
    private static final float[] texcoords = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    private String FRAGMENT_SHADER;
    private String VERTEX_SHADER;
    private int[] mFrameBuffer;
    private int mHeight = 0;
    private float[] mMVPMatrix = new float[16];
    private int[] mOESTextureid;
    private FloatBuffer mPositoins;
    private int mProgramHandle = 0;
    private float[] mSTMatrix = new float[16];
    private FloatBuffer mTexcoords;
    private int[] mTextureid;
    private int mWidth = 0;
    private int minputImageTextureid = 0;
    private int mmodeid = 0;
    private int mpositionid = 0;
    private int mtexcoordid = 0;
    private int muMVPMatrixHandle;
    private int muSTMatrixHandle;

    public OES2TextureFilter(String str) {
        int[] iArr = new int[1];
        this.mFrameBuffer = iArr;
        iArr[0] = 0;
        int[] iArr2 = new int[1];
        this.mTextureid = iArr2;
        iArr2[0] = 0;
        int[] iArr3 = new int[1];
        this.mOESTextureid = iArr3;
        iArr3[0] = 0;
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
        InputStream resourceAsStream = classLoader.getResourceAsStream(str + "/vertex_general.glsl");
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
        InputStream resourceAsStream2 = classLoader2.getResourceAsStream(str + "/fragment_oes2texture.glsl");
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
        if (!compileShaders() || checkGlError("OES2TextureFilter") != 0) {
            throw new RuntimeException("sifeng: OES2TextureFilter create failed");
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
        this.minputImageTextureid = GLES20.glGetUniformLocation(this.mProgramHandle, "inputImageTexture");
        this.mmodeid = GLES20.glGetUniformLocation(this.mProgramHandle, "mode");
        this.muMVPMatrixHandle = GLES20.glGetUniformLocation(this.mProgramHandle, "uMVPMatrix");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.mProgramHandle, "uSTMatrix");
        this.muSTMatrixHandle = glGetUniformLocation;
        return (this.mpositionid == -1 || this.mtexcoordid == -1 || this.minputImageTextureid == -1 || this.muMVPMatrixHandle == -1 || glGetUniformLocation == -1) ? false : true;
    }

    public void destroyBuffers() {
        int[] iArr = this.mFrameBuffer;
        if (iArr[0] != 0) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.mFrameBuffer[0] = 0;
        }
        int[] iArr2 = this.mTextureid;
        if (iArr2[0] != 0) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.mTextureid[0] = 0;
        }
        int[] iArr3 = this.mOESTextureid;
        if (iArr3[0] != 0) {
            GLES20.glDeleteTextures(1, iArr3, 0);
            this.mOESTextureid[0] = 0;
        }
        int i = this.mProgramHandle;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            this.mProgramHandle = 0;
        }
    }

    public void genOESTexture() {
        GLES20.glGenTextures(1, this.mOESTextureid, 0);
        GLES20.glBindTexture(36197, this.mOESTextureid[0]);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, Task.EXTRAS_LIMIT_BYTES, 9729);
    }

    public int getOESTextureid() {
        return this.mOESTextureid[0];
    }

    public int process(SurfaceTexture surfaceTexture, int i, int i2, boolean z) {
        int i3 = i;
        int i4 = i2;
        if (!(this.mWidth == i3 && this.mHeight == i4)) {
            updatebuffer(i3, i4);
        }
        GLES20.glBindFramebuffer(36160, this.mFrameBuffer[0]);
        GLES20.glUseProgram(this.mProgramHandle);
        GLES20.glViewport(0, 0, i3, i4);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.mOESTextureid[0]);
        GLES20.glUniform1i(this.minputImageTextureid, 0);
        if (z) {
            GLES20.glUniform1i(this.mmodeid, 1);
        } else {
            GLES20.glUniform1i(this.mmodeid, 0);
        }
        Matrix.setIdentityM(this.mMVPMatrix, 0);
        surfaceTexture.getTransformMatrix(this.mSTMatrix);
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
        GLES20.glBindFramebuffer(36160, 0);
        if (checkGlError("OES2TextureFilter") == 0) {
            return this.mTextureid[0];
        }
        throw new RuntimeException("sifeng: OES2TextureFilter process failed");
    }

    public void updatebuffer(int i, int i2) {
        int[] iArr = this.mFrameBuffer;
        if (iArr[0] != 0) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.mFrameBuffer[0] = 0;
        }
        int[] iArr2 = this.mTextureid;
        if (iArr2[0] != 0) {
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.mTextureid[0] = 0;
        }
        GLES20.glGenFramebuffers(1, this.mFrameBuffer, 0);
        GLES20.glBindFramebuffer(36160, this.mFrameBuffer[0]);
        GLES20.glGenTextures(1, this.mTextureid, 0);
        GLES20.glBindTexture(3553, this.mTextureid[0]);
        GLES20.glTexImage2D(3553, 0, NativeBitmapStruct.GLFormat.GL_RGBA, i, i2, 0, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, (Buffer) null);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, Task.EXTRAS_LIMIT_BYTES, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.mTextureid[0], 0);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindFramebuffer(36160, 0);
        this.mWidth = i;
        this.mHeight = i2;
    }
}
