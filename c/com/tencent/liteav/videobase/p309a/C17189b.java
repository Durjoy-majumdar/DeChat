package com.tencent.liteav.videobase.p309a;

import android.opengl.GLES20;
import com.tencent.liteav.base.util.C104507p;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.frame.C17221c;
import com.tencent.liteav.videobase.frame.C17222d;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.utils.C104521h;
import com.tencent.liteav.videobase.utils.C17244c;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.tencent.liteav.videobase.a.b */
public class C17189b {
    private static final float[] IDENTITY_MATRIX = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    public static final String NO_FILTER_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}";
    public static final String NO_FILTER_VERTEX_SHADER = "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nuniform mat4 textureTransform;\nvarying highp vec2 textureCoordinate;\nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n}";
    private static final String TAG = "TXCGPUImageFilter";
    private static final AtomicInteger sFilterCount = new AtomicInteger();
    public int mGLAttribPosition;
    public int mGLAttribTextureCoord;
    private final C17221c mGLFrameBuffer;
    public int mGLUniformTexture;
    private boolean mIsInitialized;
    public final C104507p mOutputSize;
    private final C104521h mProgram;
    private int mProgramId;
    private final C17244c mRunOnDrawQueue;
    private float[] mTextureMatrix;
    public C17223e mTexturePool;
    private int mUniformTextureTransform;

    public C17189b() {
        this(NO_FILTER_VERTEX_SHADER, NO_FILTER_FRAGMENT_SHADER);
    }

    public static /* synthetic */ void lambda$runOnDrawAndWaitDone$4(Runnable runnable, CountDownLatch countDownLatch) {
        runnable.run();
        countDownLatch.countDown();
    }

    public void afterDrawArrays() {
    }

    public void beforeDrawArrays(int i) {
    }

    public int buildProgram() {
        C104521h hVar = this.mProgram;
        int a = C104521h.m139838a(hVar.f309806a, 35633);
        if (a == 0) {
            LiteavLog.m16898e("Program", "load vertex shader failed.");
            return -1;
        }
        int a2 = C104521h.m139838a(hVar.f309807b, 35632);
        if (a2 == 0) {
            LiteavLog.m16898e("Program", "load fragment shader failed.");
            GLES20.glDeleteShader(a);
            return -1;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, a);
        GLES20.glAttachShader(glCreateProgram, a2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 0) {
            LiteavLog.m16898e("Program", "link program failed. status: " + iArr[0]);
            GLES20.glDeleteShader(a);
            GLES20.glDeleteShader(a2);
            GLES20.glDeleteProgram(glCreateProgram);
            return -1;
        }
        GLES20.glDeleteShader(a);
        GLES20.glDeleteShader(a2);
        return glCreateProgram;
    }

    public boolean canBeSkipped() {
        return false;
    }

    public C104507p getOutputSize() {
        return this.mOutputSize;
    }

    public final int getProgramId() {
        return this.mProgramId;
    }

    public int getTarget() {
        return 3553;
    }

    public final void initialize(C17223e eVar) {
        if (!this.mIsInitialized) {
            this.mGLFrameBuffer.mo20190a();
            this.mProgramId = buildProgram();
            this.mGLAttribPosition = GLES20.glGetAttribLocation(getProgramId(), "position");
            this.mGLUniformTexture = GLES20.glGetUniformLocation(getProgramId(), "inputImageTexture");
            this.mGLAttribTextureCoord = GLES20.glGetAttribLocation(getProgramId(), "inputTextureCoordinate");
            this.mUniformTextureTransform = GLES20.glGetUniformLocation(getProgramId(), "textureTransform");
            onInit(eVar);
            this.mIsInitialized = true;
            LiteavLog.m16897d(TAG, "%s initialized, count: %d", this, Integer.valueOf(sFilterCount.incrementAndGet()));
        }
    }

    public boolean isInitialized() {
        return this.mIsInitialized;
    }

    public void onDraw(int i, C17222d dVar, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (this.mIsInitialized) {
            GLES20.glUseProgram(getProgramId());
            runPendingOnDrawTasks();
            floatBuffer.position(0);
            GLES20.glVertexAttribPointer(this.mGLAttribPosition, 2, 5126, false, 0, floatBuffer);
            GLES20.glEnableVertexAttribArray(this.mGLAttribPosition);
            floatBuffer2.position(0);
            GLES20.glVertexAttribPointer(this.mGLAttribTextureCoord, 2, 5126, false, 0, floatBuffer2);
            GLES20.glEnableVertexAttribArray(this.mGLAttribTextureCoord);
            if (i != -1) {
                GLES20.glActiveTexture(33984);
                OpenGlUtils.bindTexture(getTarget(), i);
                GLES20.glUniform1i(this.mGLUniformTexture, 0);
            }
            if (dVar != null) {
                this.mGLFrameBuffer.mo20191a(dVar.mo20195a());
                this.mGLFrameBuffer.mo20192b();
            } else {
                OpenGlUtils.bindFramebuffer(36160, 0);
            }
            float[] fArr = this.mTextureMatrix;
            if (fArr == null) {
                fArr = IDENTITY_MATRIX;
            }
            GLES20.glUniformMatrix4fv(this.mUniformTextureTransform, 1, false, fArr, 0);
            beforeDrawArrays(i);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.mGLAttribPosition);
            GLES20.glDisableVertexAttribArray(this.mGLAttribTextureCoord);
            afterDrawArrays();
            GLES20.glActiveTexture(33984);
            OpenGlUtils.bindTexture(getTarget(), 0);
            if (dVar != null) {
                OpenGlUtils.bindFramebuffer(36160, 0);
                this.mGLFrameBuffer.mo20193c();
            }
        }
    }

    public void onFilterBeenSkipped() {
        if (this.mIsInitialized) {
            GLES20.glUseProgram(getProgramId());
            runPendingOnDrawTasks();
        }
    }

    public void onInit(C17223e eVar) {
        this.mTexturePool = eVar;
    }

    public void onOutputSizeChanged(int i, int i2) {
        C104507p pVar = this.mOutputSize;
        pVar.f309736a = i;
        pVar.f309737b = i2;
    }

    public void onUninit() {
    }

    public final void runOnDraw(Runnable runnable) {
        this.mRunOnDrawQueue.mo20221a(runnable);
    }

    public void runOnDrawAndWaitDone(Runnable runnable) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.mRunOnDrawQueue.mo20221a(C17194g.m17034a(runnable, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public void runPendingOnDrawTasks() {
        this.mRunOnDrawQueue.mo20220a();
    }

    public void setFloatOnDraw(int i, float f) {
        runOnDraw(C17190c.m17030a(i, f));
    }

    public void setFloatVec2OnDraw(int i, float[] fArr) {
        runOnDraw(C17192e.m17032a(i, fArr));
    }

    public void setFloatVec3OnDraw(int i, float[] fArr) {
        runOnDraw(C17191d.m17031a(i, fArr));
    }

    public void setFloatVec4OnDraw(int i, float[] fArr) {
        runOnDraw(C17193f.m17033a(i, fArr));
    }

    public void setTexutreTransform(float[] fArr) {
        this.mTextureMatrix = fArr;
    }

    public final void uninitialize() {
        if (this.mIsInitialized) {
            runPendingOnDrawTasks();
            onUninit();
            this.mIsInitialized = false;
            this.mGLFrameBuffer.mo20194d();
            int i = this.mProgramId;
            if (i != -1) {
                GLES20.glDeleteProgram(i);
                this.mProgramId = -1;
            }
            LiteavLog.m16897d(TAG, "%s uninitialized, count: %d", this, Integer.valueOf(sFilterCount.decrementAndGet()));
        }
    }

    public C17189b(String str, String str2) {
        this.mOutputSize = new C104507p(-1, -1);
        this.mProgramId = -1;
        this.mGLFrameBuffer = new C17221c();
        this.mRunOnDrawQueue = new C17244c();
        this.mProgram = new C104521h(str, str2);
    }
}
