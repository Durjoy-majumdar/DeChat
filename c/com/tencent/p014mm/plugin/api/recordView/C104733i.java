package com.tencent.p014mm.plugin.api.recordView;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.google.android.gms.gcm.Task;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wxmm.v2helper;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mm.plugin.api.recordView.i */
public class C104733i implements GLSurfaceView.Renderer {

    /* renamed from: x */
    public static float[] f311025x = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: y */
    public static final float[] f311026y = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: a */
    public int f311027a = 0;

    /* renamed from: b */
    public int f311028b = 0;

    /* renamed from: c */
    public byte[] f311029c = null;

    /* renamed from: d */
    public int f311030d = 0;

    /* renamed from: e */
    public int f311031e = 0;

    /* renamed from: f */
    public int f311032f = 0;

    /* renamed from: g */
    public ByteBuffer f311033g;

    /* renamed from: h */
    public ByteBuffer f311034h;

    /* renamed from: i */
    public int f311035i;

    /* renamed from: j */
    public int f311036j;

    /* renamed from: k */
    public int f311037k;

    /* renamed from: l */
    public int f311038l;

    /* renamed from: m */
    public int f311039m;

    /* renamed from: n */
    public int f311040n;

    /* renamed from: o */
    public int f311041o;

    /* renamed from: p */
    public int f311042p;

    /* renamed from: q */
    public FloatBuffer f311043q;

    /* renamed from: r */
    public FloatBuffer f311044r;

    /* renamed from: s */
    public float[] f311045s = new float[16];

    /* renamed from: t */
    public int f311046t;

    /* renamed from: u */
    public int f311047u;

    /* renamed from: v */
    public int f311048v;

    /* renamed from: w */
    public ByteBuffer f311049w;

    /* renamed from: com.tencent.mm.plugin.api.recordView.i$a */
    public interface C104734a {
        /* renamed from: a */
        void mo148407a();

        ByteBuffer getBuffer();
    }

    public C104733i(int i, int i2, int i3, int i4) {
        Arrays.copyOf(f311026y, 8);
        this.f311046t = 0;
        this.f311047u = 0;
        this.f311048v = 0;
        this.f311049w = null;
        this.f311047u = C104724b.m140339a();
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        int i5 = iArr[0];
        if (i5 == 0) {
            Log.m105920e("MicroMsg.MMSightCameraGLUtil", "gen frame buffer error");
            i5 = 0;
        }
        this.f311048v = i5;
        GLES20.glBindFramebuffer(36160, i5);
        GLES20.glBindTexture(3553, this.f311047u);
        GLES20.glTexImage2D(3553, 0, NativeBitmapStruct.GLFormat.GL_RGBA, i3, i4, 0, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, (Buffer) null);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f311047u, 0);
        GLES20.glBindTexture(3553, 0);
        GLES20.glViewport(0, 0, i3, i4);
    }

    public void onDrawFrame(GL10 gl10) {
        if (this.f311049w != null) {
            Util.currentTicks();
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16640);
            if (!(this.f311037k == 0 || this.f311035i == -1 || this.f311036j == -1 || this.f311030d <= 0 || this.f311031e <= 0 || this.f311029c == null)) {
                GLES20.glBindFramebuffer(36160, this.f311048v);
                GLES20.glBindTexture(3553, this.f311047u);
                GLES20.glTexImage2D(3553, 0, NativeBitmapStruct.GLFormat.GL_RGBA, this.f311027a, this.f311028b, 0, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, (Buffer) null);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f311047u, 0);
                GLES20.glBindTexture(3553, 0);
                GLES20.glViewport(0, 0, this.f311027a, this.f311028b);
                GLES20.glUseProgram(this.f311037k);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, this.f311035i);
                GLES20.glTexImage2D(3553, 0, 6409, this.f311030d, this.f311031e, 0, 6409, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, this.f311033g);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
                GLES20.glUniform1i(this.f311040n, 0);
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, this.f311036j);
                GLES20.glTexImage2D(3553, 0, 6410, this.f311030d / 2, this.f311031e / 2, 0, 6410, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, this.f311034h);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
                GLES20.glUniform1i(this.f311041o, 1);
                Matrix.setIdentityM(this.f311045s, 0);
                int i = this.f311032f;
                int i2 = this.f311046t;
                if (i2 == 90 || i2 == 270) {
                    i = (((i - i2) + v2helper.VOIP_ENC_HEIGHT_LV1) + 180) % v2helper.VOIP_ENC_HEIGHT_LV1;
                }
                Matrix.setRotateM(this.f311045s, 0, (float) i, 0.0f, 0.0f, -1.0f);
                int i3 = this.f311032f;
                if (i3 == 90 || i3 == 270) {
                    Matrix.scaleM(this.f311045s, 0, -1.0f, 1.0f, 1.0f);
                } else {
                    Matrix.scaleM(this.f311045s, 0, 1.0f, -1.0f, 1.0f);
                }
                GLES20.glUniformMatrix4fv(this.f311042p, 1, false, this.f311045s, 0);
                this.f311043q.position(0);
                GLES20.glVertexAttribPointer(this.f311039m, 2, 5126, false, 0, this.f311043q);
                GLES20.glEnableVertexAttribArray(this.f311039m);
                this.f311044r.position(0);
                GLES20.glVertexAttribPointer(this.f311038l, 2, 5126, false, 0, this.f311044r);
                GLES20.glEnableVertexAttribArray(this.f311038l);
                GLES20.glDrawArrays(5, 0, 4);
                GLES20.glDisableVertexAttribArray(this.f311039m);
                GLES20.glDisableVertexAttribArray(this.f311038l);
                GLES20.glBindTexture(3553, 0);
                GLES20.glFinish();
                this.f311049w.position(0);
                GLES20.glReadPixels(0, 0, this.f311027a, this.f311028b, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, this.f311049w);
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glUseProgram(0);
            }
            Log.m105919d("MicroMsg.YUVDateRenderToRGBBufferRenderer", "time cost : %d", Long.valueOf(Util.ticksToNow(Util.currentTicks())));
        }
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        Log.m105925i("MicroMsg.YUVDateRenderToRGBBufferRenderer", "onSurfaceChanged, surfaceWidth: %s, height: %s this %s", Integer.valueOf(i), Integer.valueOf(i2), this);
        if (i != this.f311027a || i2 != this.f311028b) {
            Log.m105924i("MicroMsg.YUVDateRenderToRGBBufferRenderer", "onSurfaceChanged change viewpoint");
            GLES20.glViewport(0, 0, i, i2);
            this.f311027a = i;
            this.f311028b = i2;
        }
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Log.m105925i("MicroMsg.YUVDateRenderToRGBBufferRenderer", "onSurfaceCreated this %s", this);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glDisable(2929);
        int c = C104724b.m140341c("attribute vec4 a_position;                         \nattribute vec2 a_texCoord;                         \nvarying vec2 v_texCoord;                           \nuniform mat4 uMatrix;                              \nvoid main() {                                      \n   gl_Position = uMatrix * a_position;             \n   v_texCoord = a_texCoord;                        \n}                                                  \n", "#ifdef GL_ES                                       \nprecision highp float;                             \n#endif                                             \nvarying vec2 v_texCoord;                           \nuniform sampler2D y_texture;                       \nuniform sampler2D uv_texture;                      \nvoid main (void) {                                 \n   float r, g, b, y, u, v;                         \n   y = texture2D(y_texture, v_texCoord).r;         \n   u = texture2D(uv_texture, v_texCoord).a;        \n   v = texture2D(uv_texture, v_texCoord).r;        \n   u = u - 0.5;                                    \n   v = v - 0.5;                                    \n   r = y + 1.370705 * v;                           \n   g = y - 0.337633 * u - 0.698001 * v;            \n   b = y + 1.732446 * u;                           \n   gl_FragColor = vec4(r, g, b, 1.0);              \n}                                                  \n");
        this.f311037k = c;
        if (c == 0) {
            Log.m105920e("MicroMsg.YUVDateRenderToRGBBufferRenderer", "onSurfaceCreated, load program failed!");
        }
        this.f311039m = GLES20.glGetAttribLocation(this.f311037k, "a_position");
        this.f311038l = GLES20.glGetAttribLocation(this.f311037k, "a_texCoord");
        this.f311040n = GLES20.glGetUniformLocation(this.f311037k, "y_texture");
        this.f311041o = GLES20.glGetUniformLocation(this.f311037k, "uv_texture");
        this.f311042p = GLES20.glGetUniformLocation(this.f311037k, "uMatrix");
        this.f311035i = C104724b.m140339a();
        this.f311036j = C104724b.m140339a();
        float[] fArr = f311025x;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f311043q = asFloatBuffer;
        asFloatBuffer.put(fArr);
        this.f311043q.position(0);
        float[] fArr2 = f311026y;
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f311044r = asFloatBuffer2;
        asFloatBuffer2.put(fArr2);
        this.f311044r.position(0);
        Log.m105925i("MicroMsg.YUVDateRenderToRGBBufferRenderer", "onSurfaceCreated, yTextureId: %s, uvTextureId: %s this %s", Integer.valueOf(this.f311035i), Integer.valueOf(this.f311036j), this);
    }
}
