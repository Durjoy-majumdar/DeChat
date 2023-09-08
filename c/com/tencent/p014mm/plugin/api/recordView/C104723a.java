package com.tencent.p014mm.plugin.api.recordView;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mm.plugin.api.recordView.a */
public class C104723a implements GLSurfaceView.Renderer {

    /* renamed from: h */
    public static float[] f310975h = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: i */
    public static final float[] f310976i = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: a */
    public int f310977a = 0;

    /* renamed from: b */
    public int f310978b = 0;

    /* renamed from: c */
    public int f310979c;

    /* renamed from: d */
    public int f310980d;

    /* renamed from: e */
    public int f310981e;

    /* renamed from: f */
    public FloatBuffer f310982f;

    /* renamed from: g */
    public FloatBuffer f310983g;

    public C104723a() {
        Arrays.copyOf(f310976i, 8);
    }

    public void onDrawFrame(GL10 gl10) {
        Util.currentTicks();
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16640);
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        Log.m105925i("MicroMsg.MMSightCameraGLRenderer", "onSurfaceChanged, surfaceWidth: %s, height: %s this %s", Integer.valueOf(i), Integer.valueOf(i2), this);
        if (i != this.f310977a || i2 != this.f310978b) {
            Log.m105924i("MicroMsg.MMSightCameraGLRenderer", "onSurfaceChanged change viewpoint");
            GLES20.glViewport(0, 0, i, i2);
            this.f310977a = i;
            this.f310978b = i2;
        }
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Log.m105925i("MicroMsg.MMSightCameraGLRenderer", "onSurfaceCreated this %s", this);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glDisable(2929);
        int c = C104724b.m140341c("attribute vec4 a_position;                         \nattribute vec2 a_texCoord;                         \nvarying vec2 v_texCoord;                           \nuniform mat4 uMatrix;                              \nvoid main() {                                      \n   gl_Position = uMatrix * a_position;             \n   v_texCoord = a_texCoord;                        \n}                                                  \n", "#ifdef GL_ES                                       \nprecision highp float;                             \n#endif                                             \nvarying vec2 v_texCoord;                           \nuniform sampler2D y_texture;                       \nuniform sampler2D uv_texture;                      \nvoid main (void) {                                 \n   float r, g, b, y, u, v;                         \n   y = texture2D(y_texture, v_texCoord).r;         \n   u = texture2D(uv_texture, v_texCoord).a;        \n   v = texture2D(uv_texture, v_texCoord).r;        \n   u = u - 0.5;                                    \n   v = v - 0.5;                                    \n   r = y + 1.370705 * v;                           \n   g = y - 0.337633 * u - 0.698001 * v;            \n   b = y + 1.732446 * u;                           \n   gl_FragColor = vec4(r, g, b, 1.0);              \n}                                                  \n");
        this.f310981e = c;
        if (c == 0) {
            Log.m105920e("MicroMsg.MMSightCameraGLRenderer", "onSurfaceCreated, load program failed!");
        }
        GLES20.glGetAttribLocation(this.f310981e, "a_position");
        GLES20.glGetAttribLocation(this.f310981e, "a_texCoord");
        GLES20.glGetUniformLocation(this.f310981e, "y_texture");
        GLES20.glGetUniformLocation(this.f310981e, "uv_texture");
        GLES20.glGetUniformLocation(this.f310981e, "uMatrix");
        this.f310979c = C104724b.m140339a();
        this.f310980d = C104724b.m140339a();
        float[] fArr = f310975h;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f310982f = asFloatBuffer;
        asFloatBuffer.put(fArr);
        this.f310982f.position(0);
        float[] fArr2 = f310976i;
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f310983g = asFloatBuffer2;
        asFloatBuffer2.put(fArr2);
        this.f310983g.position(0);
        Log.m105925i("MicroMsg.MMSightCameraGLRenderer", "onSurfaceCreated, yTextureId: %s, uvTextureId: %s this %s", Integer.valueOf(this.f310979c), Integer.valueOf(this.f310980d), this);
    }
}
