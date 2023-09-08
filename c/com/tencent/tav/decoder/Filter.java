package com.tencent.tav.decoder;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.opengl.GLES20;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.google.android.gms.gcm.Task;
import com.tencent.tav.C106896Utils;
import com.tencent.tav.coremedia.TextureInfo;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;

public class Filter {
    private static final int FLOAT_SIZE_BYTES = 4;
    private static final String FRAGMENT_SHADER = "#version 300 es\nprecision mediump float;\nin vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform float uAlpha;\nout vec4 outColor;\nvoid main() {\n   vec4 color = texture(sTexture, vTextureCoord);\n  outColor = mix(vec4(0,0,0,1), color, uAlpha);\n}\n";
    private static final String FRAGMENT_SHADER_2 = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform float uAlpha;\nvoid main() {\n   vec4 color = texture2D(sTexture, vTextureCoord);\n  gl_FragColor = mix(vec4(0,0,0,1), color, uAlpha);\n}\n";
    private static final String FRAGMENT_SHADER_OES = "#version 300 es\n#extension GL_OES_EGL_image_external : require\n#extension GL_OES_EGL_image_external_essl3 : enable\nuniform samplerExternalOES sTexture;\nprecision mediump float;\nin vec2 vTextureCoord;\nuniform float uAlpha;\nuniform int uIsCrop;\nuniform vec4 uCropRect;\nout vec4 outColor;\nvoid main() {\n  vec4 color;\n  if(uIsCrop == 1) {\n    ivec2 size = textureSize(sTexture, 0);\n    float cropWidth = uCropRect.z - uCropRect.x;\n    float cropHeight = uCropRect.w - uCropRect.y;\n    float sizeWidth = float(size.x);\n    float sizeHeight = float(size.y);\n    float pointX = vTextureCoord.x;\n    float pointY = vTextureCoord.y;\n    if(cropWidth <= sizeWidth) {\n        pointX = vTextureCoord.x * cropWidth / sizeWidth + (uCropRect.x / sizeWidth);\n    }\n    if(cropHeight <= sizeHeight) {\n        pointY = vTextureCoord.y * cropHeight / sizeHeight + (uCropRect.y / sizeHeight);\n    }\n    vec2 point = vec2(pointX, pointY);\n    color = texture(sTexture, point);\n  } else {\n    color = texture(sTexture, vTextureCoord);\n  }\n  outColor = mix(vec4(0,0,0,1), color, uAlpha);\n}\n";
    private static final String FRAGMENT_SHADER_OES_2 = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTextureOES;\nuniform float uAlpha;\nvoid main() {\n  vec4 color = texture2D(sTextureOES, vTextureCoord);\n  gl_FragColor = mix(vec4(0,0,0,1), color, uAlpha);\n}\n";
    private static final int TRIANGLE_VERTICES_DATA_POS_OFFSET = 0;
    private static final int TRIANGLE_VERTICES_DATA_STRIDE_BYTES = 8;
    private static final String VERTEX_SHADER = "#version 300 es\nuniform vec2 uScreenSize;\nuniform vec2 uTextureSize;\nuniform mat3 uMatrix;\nuniform mat3 stMatrix;\nin vec2 aPosition;\nout vec2 vTextureCoord;\nvoid main() {\n  vec3 position = uMatrix * vec3(aPosition, 1);\n  vec2 clipSpace = (position.xy / uScreenSize) * 2.0 - 1.0;\n  gl_Position = vec4(clipSpace, 0, 1);\n  vec3 coord = vec3(aPosition / uTextureSize, 1);\n  vTextureCoord = (stMatrix * coord).xy;\n}\n";
    private static final String VERTEX_SHADER_2 = "uniform vec2 uScreenSize;\nuniform vec2 uTextureSize;\nuniform mat3 uMatrix;\nuniform mat3 stMatrix;\nattribute vec2 aPosition;\nvarying vec2 vTextureCoord;\nvoid main() {\n  vec3 position = uMatrix * vec3(aPosition, 1);\n  vec2 clipSpace = (position.xy / uScreenSize) * 2.0 - 1.0;\n  gl_Position = vec4(clipSpace, 0, 1);\n  vec3 coord = vec3(aPosition / uTextureSize, 1);\n  vTextureCoord = (stMatrix * coord).xy;\n}\n";
    private TextureInfo _textureInfo = null;
    private int aPositionHandle;
    private int bgColor = -16777216;
    private int[] defaultViewport = new int[4];
    private int frameBuffer = -1;
    public int program;
    private boolean renderForScreen = true;
    private int rendererHeight;
    private int rendererWidth;
    private final int[] shaderIndexes = new int[2];
    private int stMatrixHandle;
    private FloatBuffer triangleVertices;
    private int uAlphaHandle;
    private int uCropHandle = -1;
    private int uCropRectHandle = -1;
    private int uMatrixHandle;
    private int uScreenSizeHandle;
    private int uTextureSizeHandle;

    private void initFrameBuffer() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        GLES20.glBindTexture(3553, i);
        RenderContext.checkEglError("glBindTexture mTextureID");
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        RenderContext.checkEglError("glTexParameter");
        GLES20.glTexImage2D(3553, 0, NativeBitmapStruct.GLFormat.GL_RGB, this.rendererWidth, this.rendererHeight, 0, NativeBitmapStruct.GLFormat.GL_RGB, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, (Buffer) null);
        this._textureInfo = new TextureInfo(i, 3553, this.rendererWidth, this.rendererHeight, (Matrix) null, 0);
        int[] iArr2 = new int[1];
        GLES20.glGenFramebuffers(1, iArr2, 0);
        int i2 = iArr2[0];
        GLES20.glBindFramebuffer(36160, i2);
        RenderContext.checkEglError("glBindFramebuffer frameBuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        RenderContext.checkEglError("glCheckFramebufferStatus frameBuffer");
        if (GLES20.glCheckFramebufferStatus(36160) != 36053) {
            new RuntimeException("EGL error encountered: FramebufferStatus is not complete.");
            return;
        }
        GLES20.glBindFramebuffer(36160, 0);
        this.frameBuffer = i2;
    }

    private void initOESShaderExtraInfo() {
        this.uCropHandle = GLES20.glGetUniformLocation(this.program, "uIsCrop");
        RenderContext.checkEglError("glGetUniformLocation uCropHandle");
        if (this.uCropHandle == -1) {
            new RuntimeException("Could not get uniform location for uCropHandle");
            return;
        }
        this.uCropRectHandle = GLES20.glGetUniformLocation(this.program, "uCropRect");
        RenderContext.checkEglError("glGetUniformLocation uCropRectHandle");
        if (this.uCropRectHandle == -1) {
            new RuntimeException("Could not get uniform location for uCropRectHandle");
        }
    }

    public TextureInfo applyFilter(TextureInfo textureInfo) {
        return applyFilter(textureInfo, (Matrix) null, (Matrix) null, 1.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Filter filter = (Filter) obj;
        return this.rendererHeight == filter.rendererHeight && this.rendererWidth == filter.rendererWidth && this.renderForScreen == filter.renderForScreen;
    }

    public void finishDraw(TextureInfo textureInfo) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(textureInfo.textureType, 0);
    }

    public int getFrameBuffer() {
        return this.frameBuffer;
    }

    public int getRendererHeight() {
        return this.rendererHeight;
    }

    public int getRendererWidth() {
        return this.rendererWidth;
    }

    public int hashCode() {
        return ((((((((((((((((((((((0 + this.program) * 31) + this.uScreenSizeHandle) * 31) + this.uTextureSizeHandle) * 31) + this.uMatrixHandle) * 31) + this.uAlphaHandle) * 31) + this.stMatrixHandle) * 31) + this.aPositionHandle) * 31) + this.rendererWidth) * 31) + this.rendererHeight) * 31) + (this.renderForScreen ? 1 : 0)) * 31) + this.frameBuffer) * 31) + Arrays.hashCode(this.defaultViewport);
    }

    public void initShaderForTextureInfo(TextureInfo textureInfo) {
        boolean z = textureInfo.getTextureRect() == null || C106896Utils.isOnlySupportLowVersionGl();
        if (textureInfo.textureType == 36197) {
            if (z) {
                initShaders(VERTEX_SHADER_2, FRAGMENT_SHADER_OES_2);
                return;
            }
            initShaders(VERTEX_SHADER, FRAGMENT_SHADER_OES);
            initOESShaderExtraInfo();
        } else if (z) {
            initShaders(VERTEX_SHADER_2, FRAGMENT_SHADER_2);
        } else {
            initShaders(VERTEX_SHADER, FRAGMENT_SHADER);
        }
    }

    public void initShaders(String str, String str2) {
        this.triangleVertices = ByteBuffer.allocateDirect(64).order(ByteOrder.nativeOrder()).asFloatBuffer();
        int createProgram = Program.createProgram(str, str2, this.shaderIndexes);
        this.program = createProgram;
        if (createProgram == 0) {
            new RuntimeException("failed creating program");
            return;
        }
        this.aPositionHandle = GLES20.glGetAttribLocation(createProgram, "aPosition");
        RenderContext.checkEglError("glGetAttribLocation aPosition");
        if (this.aPositionHandle == -1) {
            new RuntimeException("Could not get attribute location for aPosition");
            return;
        }
        this.uMatrixHandle = GLES20.glGetUniformLocation(this.program, "uMatrix");
        RenderContext.checkEglError("glGetUniformLocation uMatrix");
        if (this.uMatrixHandle == -1) {
            new RuntimeException("Could not get uniform location for uMatrix");
            return;
        }
        this.uAlphaHandle = GLES20.glGetUniformLocation(this.program, "uAlpha");
        RenderContext.checkEglError("glGetUniformLocation uAlpha");
        if (this.uAlphaHandle == -1) {
            new RuntimeException("Could not get uniform location for uAlpha");
            return;
        }
        this.stMatrixHandle = GLES20.glGetUniformLocation(this.program, "stMatrix");
        RenderContext.checkEglError("glGetUniformLocation stMatrix");
        if (this.stMatrixHandle == -1) {
            new RuntimeException("Could not get uniform location for stMatrix");
            return;
        }
        this.uScreenSizeHandle = GLES20.glGetUniformLocation(this.program, "uScreenSize");
        RenderContext.checkEglError("glGetUniformLocation uScreenSize");
        if (this.uScreenSizeHandle == -1) {
            new RuntimeException("Could not get uniform location for uScreenSize");
            return;
        }
        this.uTextureSizeHandle = GLES20.glGetUniformLocation(this.program, "uTextureSize");
        RenderContext.checkEglError("glGetUniformLocation uTextureSize");
        if (this.uTextureSizeHandle == -1) {
            new RuntimeException("Could not get uniform location for uTextureSize");
        }
    }

    public void prepareDraw(TextureInfo textureInfo, float[] fArr) {
        Rect textureRect;
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(textureInfo.textureType, textureInfo.textureID);
        this.triangleVertices.position(0);
        GLES20.glVertexAttribPointer(this.aPositionHandle, 2, 5126, false, 8, this.triangleVertices);
        RenderContext.checkEglError("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.aPositionHandle);
        RenderContext.checkEglError("glEnableVertexAttribArray aPositionHandle");
        GLES20.glUniformMatrix3fv(this.uMatrixHandle, 1, false, fArr, 0);
        GLES20.glUniform2f(this.uTextureSizeHandle, (float) textureInfo.width, (float) textureInfo.height);
        GLES20.glUniform2f(this.uScreenSizeHandle, (float) this.rendererWidth, (float) this.rendererHeight);
        if (textureInfo.textureType == 36197 && this.uCropHandle != -1 && this.uCropRectHandle != -1 && (textureRect = textureInfo.getTextureRect()) != null && textureRect.right > textureRect.left && textureRect.bottom > textureRect.top) {
            GLES20.glUniform1i(this.uCropHandle, 1);
            GLES20.glUniform4f(this.uCropRectHandle, (float) textureRect.left, (float) textureRect.top, (float) textureRect.right, (float) textureRect.bottom);
        }
    }

    public void release() {
        int i = this.frameBuffer;
        if (i != -1) {
            GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
            this.frameBuffer = -1;
        }
        TextureInfo textureInfo = this._textureInfo;
        if (textureInfo != null) {
            GLES20.glDeleteTextures(1, new int[]{textureInfo.textureID}, 0);
            this._textureInfo = null;
        }
        int i2 = this.program;
        if (i2 > 0) {
            GLES20.glDeleteProgram(i2);
            this.program = 0;
        }
        int i3 = 0;
        while (true) {
            int[] iArr = this.shaderIndexes;
            if (i3 < iArr.length) {
                int i4 = iArr[i3];
                if (i4 > 0) {
                    GLES20.glDeleteShader(i4);
                    this.shaderIndexes[i3] = 0;
                }
                i3++;
            } else {
                return;
            }
        }
    }

    public void setBgColor(int i) {
        this.bgColor = i;
    }

    public void setRenderForScreen(boolean z) {
        this.renderForScreen = z;
    }

    public void setRendererHeight(int i) {
        this.rendererHeight = i;
    }

    public void setRendererWidth(int i) {
        this.rendererWidth = i;
    }

    public TextureInfo textureInfo() {
        return this._textureInfo;
    }

    public TextureInfo applyFilter(TextureInfo textureInfo, Matrix matrix, Matrix matrix2) {
        return applyFilter(textureInfo, matrix, matrix2, 1.0f);
    }

    public Filter clone() {
        return new Filter();
    }

    public TextureInfo applyFilter(TextureInfo textureInfo, Matrix matrix, Matrix matrix2, float f) {
        TextureInfo textureInfo2 = textureInfo;
        if (!this.renderForScreen && this.frameBuffer == -1) {
            initFrameBuffer();
        }
        if (this.program == 0) {
            initShaderForTextureInfo(textureInfo);
        }
        RenderContext.checkEglError("onDrawFrame start");
        Rectangle rectangle = new Rectangle(0.0f, 0.0f, (float) textureInfo2.width, (float) textureInfo2.height);
        float f2 = rectangle.f320108x;
        float f3 = rectangle.f320109y;
        float f4 = rectangle.height;
        float f5 = rectangle.width;
        this.triangleVertices.rewind();
        this.triangleVertices.put(new float[]{f2, f3 + f4, f2, f3, f2 + f5, f4 + f3, f2 + f5, f3});
        GLES20.glGetIntegerv(2978, this.defaultViewport, 0);
        int i = this.frameBuffer;
        if (i != -1) {
            GLES20.glBindFramebuffer(36160, i);
            GLES20.glGetIntegerv(2978, this.defaultViewport, 0);
            GLES20.glViewport(0, 0, this.rendererWidth, this.rendererHeight);
        }
        GLES20.glUseProgram(this.program);
        RenderContext.checkEglError("glUseProgram");
        GLES20.glUniformMatrix3fv(this.stMatrixHandle, 1, false, DecoderUtils.toOpenGL2DMatrix(matrix2), 0);
        GLES20.glUniform1f(this.uAlphaHandle, f);
        prepareDraw(textureInfo2, DecoderUtils.toOpenGL2DMatrix(matrix));
        int i2 = this.bgColor;
        GLES20.glClearColor(((float) ((16711680 & i2) >> 16)) / 255.0f, ((float) ((65280 & i2) >> 8)) / 255.0f, ((float) (i2 & 255)) / 255.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glDrawArrays(5, 0, 4);
        RenderContext.checkEglError("glDrawArrays");
        finishDraw(textureInfo);
        if (this.frameBuffer != -1) {
            GLES20.glBindFramebuffer(36160, 0);
            int[] iArr = this.defaultViewport;
            GLES20.glViewport(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
        if (!this.renderForScreen) {
            return this._textureInfo;
        }
        return null;
    }
}
