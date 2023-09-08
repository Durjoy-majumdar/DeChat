package com.tencent.tavkit.ciimage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.opengl.EGL14;
import android.opengl.GLES20;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.tencent.tav.C106896Utils;
import com.tencent.tav.coremedia.CGRect;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.TextureInfo;
import com.tencent.tav.decoder.DecoderUtils;
import com.tencent.tav.decoder.Program;
import com.tencent.tav.decoder.RenderContext;
import com.tencent.tav.decoder.logger.Logger;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

class TextureFilter {
    private static final int FLOAT_SIZE_BYTES = 4;
    private static final String FRAGMENT_SHADER = "#version 300 es\nuniform sampler2D sTexture;\nprecision mediump float;\nin vec2 vTextureCoord;\nuniform float uAlpha;\nuniform int uIsCrop;\nuniform vec4 uCropRect;\nout vec4 outColor;\nvoid main() {\n  vec4 color;\n  if(uIsCrop == 1) {\n    ivec2 size = textureSize(sTexture, 0);\n    float cropWidth = uCropRect.z - uCropRect.x;\n    float cropHeight = uCropRect.w - uCropRect.y;\n    float sizeWidth = float(size.x);\n    float sizeHeight = float(size.y);\n    float pointX = vTextureCoord.x;\n    float pointY = vTextureCoord.y;\n    if(cropWidth <= sizeWidth) {\n        pointX = vTextureCoord.x * cropWidth / sizeWidth + (uCropRect.x / sizeWidth);\n    }\n    if(cropHeight <= sizeHeight) {\n        pointY = vTextureCoord.y * cropHeight / sizeHeight + (uCropRect.y / sizeHeight);\n    }\n    vec2 point = vec2(pointX, pointY);\n    color = texture(sTexture, point);\n  } else {\n    color = texture(sTexture, vTextureCoord);\n  }\n  outColor = mix(vec4(0,0,0,1), color, uAlpha);\n}\n";
    private static final String FRAGMENT_SHADER_2 = "uniform sampler2D sTexture;\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform float uAlpha;\nvoid main() {\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  gl_FragColor = mix(vec4(0,0,0,1), color, uAlpha);\n}\n";
    private static final String FRAGMENT_SHADER_END = "precision mediump float;\nin vec2 vTextureCoord;\nuniform float uAlpha;\nuniform int uIsCrop;\nuniform vec4 uCropRect;\nout vec4 outColor;\nvoid main() {\n  vec4 color;\n  if(uIsCrop == 1) {\n    ivec2 size = textureSize(sTexture, 0);\n    float cropWidth = uCropRect.z - uCropRect.x;\n    float cropHeight = uCropRect.w - uCropRect.y;\n    float sizeWidth = float(size.x);\n    float sizeHeight = float(size.y);\n    float pointX = vTextureCoord.x;\n    float pointY = vTextureCoord.y;\n    if(cropWidth <= sizeWidth) {\n        pointX = vTextureCoord.x * cropWidth / sizeWidth + (uCropRect.x / sizeWidth);\n    }\n    if(cropHeight <= sizeHeight) {\n        pointY = vTextureCoord.y * cropHeight / sizeHeight + (uCropRect.y / sizeHeight);\n    }\n    vec2 point = vec2(pointX, pointY);\n    color = texture(sTexture, point);\n  } else {\n    color = texture(sTexture, vTextureCoord);\n  }\n  outColor = mix(vec4(0,0,0,1), color, uAlpha);\n}\n";
    private static final String FRAGMENT_SHADER_END_2 = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform float uAlpha;\nvoid main() {\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  gl_FragColor = mix(vec4(0,0,0,1), color, uAlpha);\n}\n";
    private static final String FRAGMENT_SHADER_OES = "#version 300 es\n#extension GL_OES_EGL_image_external : require\n#extension GL_OES_EGL_image_external_essl3 : enable\nuniform samplerExternalOES sTexture;\nprecision mediump float;\nin vec2 vTextureCoord;\nuniform float uAlpha;\nuniform int uIsCrop;\nuniform vec4 uCropRect;\nout vec4 outColor;\nvoid main() {\n  vec4 color;\n  if(uIsCrop == 1) {\n    ivec2 size = textureSize(sTexture, 0);\n    float cropWidth = uCropRect.z - uCropRect.x;\n    float cropHeight = uCropRect.w - uCropRect.y;\n    float sizeWidth = float(size.x);\n    float sizeHeight = float(size.y);\n    float pointX = vTextureCoord.x;\n    float pointY = vTextureCoord.y;\n    if(cropWidth <= sizeWidth) {\n        pointX = vTextureCoord.x * cropWidth / sizeWidth + (uCropRect.x / sizeWidth);\n    }\n    if(cropHeight <= sizeHeight) {\n        pointY = vTextureCoord.y * cropHeight / sizeHeight + (uCropRect.y / sizeHeight);\n    }\n    vec2 point = vec2(pointX, pointY);\n    color = texture(sTexture, point);\n  } else {\n    color = texture(sTexture, vTextureCoord);\n  }\n  outColor = mix(vec4(0,0,0,1), color, uAlpha);\n}\n";
    private static final String FRAGMENT_SHADER_OES_2 = "#extension GL_OES_EGL_image_external : require\nuniform samplerExternalOES sTexture;\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform float uAlpha;\nvoid main() {\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  gl_FragColor = mix(vec4(0,0,0,1), color, uAlpha);\n}\n";
    private static final int TRIANGLE_VERTICES_DATA_POS_OFFSET = 0;
    private static final int TRIANGLE_VERTICES_DATA_STRIDE_BYTES = 8;
    private static final String VERTEX_SHADER = "#version 300 es\nuniform vec2 uScreenSize;\nuniform vec2 uTextureSize;\nuniform mat3 uMatrix;\nuniform mat3 stMatrix;\nin vec2 aPosition;\nout vec2 vTextureCoord;\nvoid main() {\n  vec3 position = uMatrix * vec3(aPosition, 1);\n  vec2 clipSpace = (position.xy / uScreenSize) * 2.0 - 1.0;\n  gl_Position = vec4(clipSpace, 0, 1);\n  vec3 coord = vec3(aPosition / uTextureSize, 1);\n  vTextureCoord = (stMatrix * coord).xy;\n}\n";
    private static final String VERTEX_SHADER_2 = "uniform vec2 uScreenSize;\nuniform vec2 uTextureSize;\nuniform mat3 uMatrix;\nuniform mat3 stMatrix;\nattribute vec2 aPosition;\nvarying vec2 vTextureCoord;\nvoid main() {\n  vec3 position = uMatrix * vec3(aPosition, 1);\n  vec2 clipSpace = (position.xy / uScreenSize) * 2.0 - 1.0;\n  gl_Position = vec4(clipSpace, 0, 1);\n  vec3 coord = vec3(aPosition / uTextureSize, 1);\n  vTextureCoord = (stMatrix * coord).xy;\n}\n";
    private final String TAG;
    private int aPositionHandle;
    private GLBlendStateCache glBlendStateCache;
    private int outputFrameBufferId = -1;
    private TextureInfo outputTextureInfo = null;
    public int program;
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

    public TextureFilter() {
        String str = "TextureFilter@" + Integer.toHexString(hashCode());
        this.TAG = str;
        Logger.m144641d(str, "TextureFilter() called");
    }

    private void checkAndInitFrameBuffer(TextureInfo textureInfo) {
        int frameBuffer = textureInfo.getFrameBuffer();
        if (frameBuffer == -1) {
            GLES20.glBindTexture(3553, textureInfo.textureID);
            GLES20.glTexImage2D(3553, 0, textureInfo.getFormat(), textureInfo.width, textureInfo.height, 0, textureInfo.getFormat(), NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, (Buffer) null);
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            frameBuffer = iArr[0];
            GLES20.glBindFramebuffer(36160, frameBuffer);
            RenderContext.checkEglError("glBindFramebuffer outputFrameBufferId");
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, textureInfo.textureID, 0);
            RenderContext.checkEglError("glCheckFramebufferStatus outputFrameBufferId");
            if (GLES20.glCheckFramebufferStatus(36160) != 36053) {
                new RuntimeException("EGL error encountered: FramebufferStatus is not complete.");
                return;
            }
            GLES20.glBindFramebuffer(36160, 0);
        }
        this.outputFrameBufferId = frameBuffer;
        textureInfo.setFrameBuffer(frameBuffer);
        this.outputTextureInfo = textureInfo;
    }

    private void finishDraw(TextureInfo textureInfo) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(textureInfo.textureType, 0);
    }

    private void initShaderForTextureInfo(TextureInfo textureInfo) {
        boolean z = textureInfo.getTextureRect() == null || C106896Utils.isOnlySupportLowVersionGl();
        if (textureInfo.textureType == 36197) {
            if (z) {
                initShaders(VERTEX_SHADER_2, FRAGMENT_SHADER_OES_2, true);
            } else {
                initShaders(VERTEX_SHADER, FRAGMENT_SHADER_OES, false);
            }
        } else if (z) {
            initShaders(VERTEX_SHADER_2, FRAGMENT_SHADER_2, true);
        } else {
            initShaders(VERTEX_SHADER, FRAGMENT_SHADER, false);
        }
    }

    private void initShaders(String str, String str2, boolean z) {
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
        if (!z) {
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
                return;
            }
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

    private boolean isEqualsCurrentOutputTexture(TextureInfo textureInfo) {
        TextureInfo textureInfo2 = this.outputTextureInfo;
        if (textureInfo2 == null) {
            return false;
        }
        if (textureInfo2.equals(textureInfo)) {
            return true;
        }
        TextureInfo textureInfo3 = this.outputTextureInfo;
        return textureInfo3.textureID == textureInfo.textureID && textureInfo3.width == textureInfo.width && textureInfo3.height == textureInfo.height;
    }

    private void prepareDraw(TextureInfo textureInfo, float[] fArr) {
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
    }

    public TextureInfo applyFilter(TextureInfo textureInfo, Matrix matrix, Matrix matrix2, float f, CGRect cGRect) {
        TextureInfo textureInfo2 = textureInfo;
        CGRect cGRect2 = cGRect;
        if (textureInfo2 == null) {
            return null;
        }
        if (this.glBlendStateCache == null) {
            this.glBlendStateCache = new GLBlendStateCache();
        }
        this.glBlendStateCache.cache();
        if (this.program == 0) {
            initShaderForTextureInfo(textureInfo);
        }
        RenderContext.checkEglError("onDrawFrame start");
        if (cGRect2 == null) {
            cGRect2 = new CGRect(0.0f, 0.0f, (float) textureInfo2.width, (float) textureInfo2.height);
        } else {
            CGSize cGSize = cGRect2.size;
            cGSize.width = Math.min((float) textureInfo2.width, cGSize.width);
            CGSize cGSize2 = cGRect2.size;
            cGSize2.height = Math.min((float) textureInfo2.height, cGSize2.height);
        }
        float f2 = cGRect2.origin.x + cGRect2.size.width;
        int i = textureInfo2.width;
        if (f2 > ((float) i)) {
            f2 = (float) i;
            Logger.m144643e(this.TAG, "applyFilter: crop right pixel exceed texture width");
        }
        float f3 = cGRect2.origin.y + cGRect2.size.height;
        int i2 = textureInfo2.height;
        if (f3 > ((float) i2)) {
            f3 = (float) i2;
            Logger.m144643e(this.TAG, "applyFilter: crop bottom pixel exceed texture height");
        }
        PointF pointF = cGRect2.origin;
        float f4 = pointF.x;
        float f5 = pointF.y;
        this.triangleVertices.rewind();
        this.triangleVertices.put(new float[]{f4, f3, f4, f5, f2, f3, f2, f5});
        int[] iArr = new int[4];
        GLES20.glGetIntegerv(2978, iArr, 0);
        int i3 = this.outputFrameBufferId;
        if (i3 != -1) {
            GLES20.glBindFramebuffer(36160, i3);
            GLES20.glGetIntegerv(2978, iArr, 0);
            GLES20.glViewport(0, 0, this.rendererWidth, this.rendererHeight);
        }
        GLES20.glUseProgram(this.program);
        RenderContext.checkEglError("glUseProgram");
        GLES20.glUniformMatrix3fv(this.stMatrixHandle, 1, false, DecoderUtils.toOpenGL2DMatrix(matrix2), 0);
        GLES20.glUniform1f(this.uAlphaHandle, f);
        Rect textureRect = textureInfo.getTextureRect();
        if (textureRect != null && textureRect.right > textureRect.left && textureRect.bottom > textureRect.top) {
            GLES20.glUniform1i(this.uCropHandle, 1);
            GLES20.glUniform4f(this.uCropRectHandle, (float) textureRect.left, (float) textureRect.top, (float) textureRect.right, (float) textureRect.bottom);
        }
        GLES20.glEnable(3042);
        if (!textureInfo.isMixAlpha()) {
            GLES20.glBlendEquationSeparate(32774, 32774);
            GLES20.glBlendFuncSeparate(1, 771, 1, 771);
        } else {
            GLES20.glBlendEquationSeparate(32774, 32774);
            GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        }
        prepareDraw(textureInfo2, DecoderUtils.toOpenGL2DMatrix(matrix));
        GLES20.glDrawArrays(5, 0, 4);
        RenderContext.checkEglError("glDrawArrays");
        finishDraw(textureInfo);
        if (this.outputFrameBufferId != -1) {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
        this.glBlendStateCache.restore();
        return this.outputTextureInfo;
    }

    public void clearBufferBuffer(int i) {
        clearBufferBuffer(i, 0.0f);
    }

    public void release() {
        String str = this.TAG;
        Logger.m144641d(str, "release: start, thread = " + Thread.currentThread().getName() + ", egl = " + EGL14.eglGetCurrentContext());
        TextureInfo textureInfo = this.outputTextureInfo;
        if (textureInfo != null) {
            GLES20.glDeleteTextures(1, new int[]{textureInfo.textureID}, 0);
            this.outputTextureInfo = null;
        }
        int i = this.outputFrameBufferId;
        if (i != -1) {
            GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
            this.outputFrameBufferId = -1;
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
                Logger.m144641d(this.TAG, "release: end");
                return;
            }
        }
    }

    public void setOutputTextureInfo(TextureInfo textureInfo) {
        if (textureInfo == null) {
            throw new RuntimeException("outputTextureInfo 为空");
        } else if (textureInfo.isReleased()) {
            throw new RuntimeException("outputTextureInfo 已经被释放了");
        } else if (textureInfo.textureType == 3553) {
            this.rendererWidth = textureInfo.width;
            this.rendererHeight = textureInfo.height;
            if (!isEqualsCurrentOutputTexture(textureInfo)) {
                checkAndInitFrameBuffer(textureInfo);
            }
        } else {
            throw new RuntimeException("目标纹理类型需要GLES20.GL_TEXTURE_2D");
        }
    }

    public String toString() {
        return "TextureFilter{program=" + this.program + ", rendererWidth=" + this.rendererWidth + ", rendererHeight=" + this.rendererHeight + ", outputTextureInfo=" + this.outputTextureInfo + ", outputFrameBufferId=" + this.outputFrameBufferId + '}';
    }

    public void clearBufferBuffer(int i, float f) {
        int i2 = this.outputFrameBufferId;
        if (i2 != -1) {
            GLES20.glBindFramebuffer(36160, i2);
            GLES20.glClearColor(((float) ((16711680 & i) >> 16)) / 255.0f, ((float) ((65280 & i) >> 8)) / 255.0f, ((float) (i & 255)) / 255.0f, f);
            GLES20.glClear(16384);
        }
    }
}
