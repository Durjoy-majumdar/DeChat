package com.tencent.xweb.skia_canvas.external_texture;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.SystemClock;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.List;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public class SurfaceTextureRenderDelegate implements Runnable, SurfaceTexture.OnFrameAvailableListener {
    private static final String LOG_TAG = "STRenderDelegate";
    private static final short[] drawOrder = {0, 1, 2, 0, 2, 3};
    private static final String fragmentShaderCode = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;uniform samplerExternalOES texture;varying vec2 v_TexCoordinate;void main () {    vec4 color = texture2D(texture, v_TexCoordinate);    gl_FragColor = color;}";
    private static final float[] squareCoords = {-1.0f, 1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
    private static float squareSize = 1.0f;
    private static final String vertexShaderCode = "attribute vec4 vPosition;attribute vec4 vTexCoordinate;uniform mat4 textureTransform;varying vec2 v_TexCoordinate;void main() {   v_TexCoordinate = (textureTransform * vTexCoordinate).xy;   gl_Position = vPosition;}";
    private ShortBuffer drawListBuffer;
    private EGL10 egl;
    private EGLConfig eglConfig;
    private EGLContext eglContext;
    private EGLDisplay eglDisplay;
    private EGLSurface fakeEglSurface;
    private volatile boolean frameAvailable;
    private List<SurfaceRender> mDownStreamSurfaceRenderList;
    private List<Surface> mPendingRemoveSurfaceList;
    private List<Runnable> mReleaseRunnableList;
    private volatile boolean mShouldRun;
    private SurfaceTexture mUpstreamSurfaceTexture;
    private boolean mUseFakeSurface;
    private Thread mWorkThread;
    private int shaderProgram;
    private FloatBuffer textureBuffer;
    private final float[] textureCoords;
    private int[] textures;
    private FloatBuffer vertexBuffer;
    private float[] videoTextureTransform;

    public SurfaceTextureRenderDelegate(SurfaceTexture surfaceTexture) {
        this.textureCoords = new float[]{0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
        this.textures = new int[1];
        this.videoTextureTransform = new float[16];
        this.mUpstreamSurfaceTexture = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.mReleaseRunnableList = new ArrayList();
        this.mDownStreamSurfaceRenderList = new ArrayList();
        this.mPendingRemoveSurfaceList = new ArrayList();
        this.mShouldRun = true;
        Thread thread = new Thread(this);
        this.mWorkThread = thread;
        thread.start();
    }

    private EGLConfig chooseEglConfig() {
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!this.egl.eglChooseConfig(this.eglDisplay, getConfig(), eGLConfigArr, 1, iArr)) {
            throw new IllegalArgumentException("Failed to choose config: " + GLUtils.getEGLErrorString(this.egl.eglGetError()));
        } else if (iArr[0] > 0) {
            return eGLConfigArr[0];
        } else {
            return null;
        }
    }

    private EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
    }

    private void deinitGL() {
        EGLSurface eGLSurface = this.fakeEglSurface;
        if (eGLSurface != EGL10.EGL_NO_SURFACE) {
            this.egl.eglDestroySurface(this.eglDisplay, eGLSurface);
        }
        EGL10 egl10 = this.egl;
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
        synchronized (this) {
            for (SurfaceRender deinitGL : this.mDownStreamSurfaceRenderList) {
                deinitGL.deinitGL();
            }
        }
        this.egl.eglDestroyContext(this.eglDisplay, this.eglContext);
        this.egl.eglTerminate(this.eglDisplay);
    }

    private void eglMakeCurrentContextWithoutSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext, EGLConfig eGLConfig) {
        if (!this.mUseFakeSurface) {
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
                return;
            }
        }
        if (!this.mUseFakeSurface) {
            egl10.eglGetError();
        }
        if (this.fakeEglSurface == EGL10.EGL_NO_SURFACE) {
            this.fakeEglSurface = egl10.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344});
            this.mUseFakeSurface = true;
        }
        EGLSurface eGLSurface2 = this.fakeEglSurface;
        if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, eGLContext)) {
            egl10.eglGetError();
        }
    }

    private int[] getConfig() {
        return new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    }

    private void initGL() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.egl = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.eglDisplay = eglGetDisplay;
        this.fakeEglSurface = EGL10.EGL_NO_SURFACE;
        this.egl.eglInitialize(eglGetDisplay, new int[2]);
        EGLConfig chooseEglConfig = chooseEglConfig();
        this.eglConfig = chooseEglConfig;
        EGLContext createContext = createContext(this.egl, this.eglDisplay, chooseEglConfig);
        this.eglContext = createContext;
        eglMakeCurrentContextWithoutSurface(this.egl, this.eglDisplay, createContext, this.eglConfig);
    }

    private void initOffScreenGL() {
        if (this.egl == null) {
            initGL();
            setupVertexBuffer();
            setupTexture();
            loadShaders();
        }
    }

    private void loadShaders() {
        int glCreateShader = GLES20.glCreateShader(35633);
        GLES20.glShaderSource(glCreateShader, vertexShaderCode);
        GLES20.glCompileShader(glCreateShader);
        checkGlError("Vertex shader compile");
        int glCreateShader2 = GLES20.glCreateShader(35632);
        GLES20.glShaderSource(glCreateShader2, fragmentShaderCode);
        GLES20.glCompileShader(glCreateShader2);
        checkGlError("Pixel shader compile");
        int glCreateProgram = GLES20.glCreateProgram();
        this.shaderProgram = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, glCreateShader);
        GLES20.glAttachShader(this.shaderProgram, glCreateShader2);
        GLES20.glLinkProgram(this.shaderProgram);
        checkGlError("Shader program compile");
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.shaderProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            GLES20.glGetProgramInfoLog(this.shaderProgram);
        }
    }

    private void setupTexture() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.textureCoords.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.textureBuffer = asFloatBuffer;
        asFloatBuffer.put(this.textureCoords);
        this.textureBuffer.position(0);
        GLES20.glActiveTexture(33984);
        GLES20.glGenTextures(1, this.textures, 0);
        checkGlError("Texture generate");
        GLES20.glBindTexture(36197, this.textures[0]);
        checkGlError("Texture bind");
        this.mUpstreamSurfaceTexture.attachToGLContext(this.textures[0]);
    }

    private void setupVertexBuffer() {
        short[] sArr = drawOrder;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(sArr.length * 2);
        allocateDirect.order(ByteOrder.nativeOrder());
        ShortBuffer asShortBuffer = allocateDirect.asShortBuffer();
        this.drawListBuffer = asShortBuffer;
        asShortBuffer.put(sArr);
        this.drawListBuffer.position(0);
        float[] fArr = squareCoords;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect2.asFloatBuffer();
        this.vertexBuffer = asFloatBuffer;
        asFloatBuffer.put(fArr);
        this.vertexBuffer.position(0);
    }

    private void transferToDownStream(List<SurfaceRender> list) {
        for (SurfaceRender next : list) {
            next.init(this.egl, this.eglContext, this.eglDisplay, this.eglConfig);
            next.makeCurrent();
            next.adjustViewPort();
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
            GLES20.glUseProgram(this.shaderProgram);
            int glGetUniformLocation = GLES20.glGetUniformLocation(this.shaderProgram, "texture");
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.shaderProgram, "vTexCoordinate");
            checkGlError("glGetAttribLocation");
            int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.shaderProgram, "vPosition");
            int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.shaderProgram, "textureTransform");
            GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
            GLES20.glVertexAttribPointer(glGetAttribLocation2, 3, 5126, false, 12, this.vertexBuffer);
            GLES20.glBindTexture(36197, this.textures[0]);
            GLES20.glActiveTexture(33984);
            GLES20.glUniform1i(glGetUniformLocation, 0);
            GLES20.glEnableVertexAttribArray(glGetAttribLocation);
            GLES20.glVertexAttribPointer(glGetAttribLocation, 4, 5126, false, 0, this.textureBuffer);
            GLES20.glUniformMatrix4fv(glGetUniformLocation2, 1, false, this.videoTextureTransform, 0);
            GLES20.glDrawElements(4, drawOrder.length, 5123, this.drawListBuffer);
            GLES20.glDisableVertexAttribArray(glGetAttribLocation2);
            GLES20.glDisableVertexAttribArray(glGetAttribLocation);
            next.swapBuffer();
        }
    }

    public synchronized void addDownStreamSurface(Surface surface) {
        this.mDownStreamSurfaceRenderList.add(new SurfaceRender(surface));
        this.mDownStreamSurfaceRenderList.size();
    }

    public void addReleaseCallback(Runnable runnable) {
        this.mReleaseRunnableList.add(runnable);
    }

    public void checkGlError(String str) {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                GLUtils.getEGLErrorString(glGetError);
            } else {
                return;
            }
        }
    }

    public void destroy() {
        this.mShouldRun = false;
    }

    public synchronized int getAvailableDownStreamCount() {
        return this.mDownStreamSurfaceRenderList.size() - this.mPendingRemoveSurfaceList.size();
    }

    public synchronized void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.frameAvailable = true;
    }

    public synchronized void removeDownStreamSurface(Surface surface) {
        this.mPendingRemoveSurfaceList.add(surface);
    }

    public void run() {
        initOffScreenGL();
        while (this.mShouldRun) {
            long uptimeMillis = SystemClock.uptimeMillis();
            eglMakeCurrentContextWithoutSurface(this.egl, this.eglDisplay, this.eglContext, this.eglConfig);
            synchronized (this) {
                ArrayList arrayList = new ArrayList();
                for (SurfaceRender next : this.mDownStreamSurfaceRenderList) {
                    if (this.mPendingRemoveSurfaceList.contains(next.getSurface())) {
                        arrayList.add(next);
                    }
                }
                this.mDownStreamSurfaceRenderList.removeAll(arrayList);
                this.mPendingRemoveSurfaceList.clear();
                if (this.frameAvailable) {
                    this.mUpstreamSurfaceTexture.updateTexImage();
                    this.mUpstreamSurfaceTexture.getTransformMatrix(this.videoTextureTransform);
                    this.frameAvailable = false;
                    ArrayList arrayList2 = new ArrayList(this.mDownStreamSurfaceRenderList);
                    transferToDownStream(arrayList2);
                    try {
                        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                        Thread.sleep(uptimeMillis2 > 16 ? 0 : 16 - uptimeMillis2);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        deinitGL();
        for (Runnable run : this.mReleaseRunnableList) {
            run.run();
        }
    }

    public SurfaceTextureRenderDelegate(SurfaceTexture surfaceTexture, Surface surface) {
        this(surfaceTexture);
        addDownStreamSurface(surface);
    }
}
