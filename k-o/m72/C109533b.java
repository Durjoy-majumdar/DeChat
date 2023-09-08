package m72;

import android.graphics.Point;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.google.android.gms.gcm.Task;
import com.tencent.p014mm.plugin.api.recordView.C104724b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f72.C97842b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: m72.b */
public class C109533b implements GLSurfaceView.Renderer {

    /* renamed from: x */
    public static float[] f327817x = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: y */
    public static float[] f327818y = {-1.0f, -0.5f, 1.0f, -0.5f, -1.0f, 0.5f, 1.0f, 0.5f};

    /* renamed from: z */
    public static final float[] f327819z = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: a */
    public int f327820a = 0;

    /* renamed from: b */
    public int f327821b = 0;

    /* renamed from: c */
    public boolean f327822c = false;

    /* renamed from: d */
    public byte[] f327823d = null;

    /* renamed from: e */
    public int f327824e = 0;

    /* renamed from: f */
    public int f327825f = 0;

    /* renamed from: g */
    public int f327826g = 0;

    /* renamed from: h */
    public ByteBuffer f327827h;

    /* renamed from: i */
    public ByteBuffer f327828i;

    /* renamed from: j */
    public int f327829j;

    /* renamed from: k */
    public int f327830k;

    /* renamed from: l */
    public int f327831l;

    /* renamed from: m */
    public int f327832m;

    /* renamed from: n */
    public int f327833n;

    /* renamed from: o */
    public int f327834o;

    /* renamed from: p */
    public int f327835p;

    /* renamed from: q */
    public int f327836q;

    /* renamed from: r */
    public FloatBuffer f327837r;

    /* renamed from: s */
    public FloatBuffer f327838s;

    /* renamed from: t */
    public float[] f327839t = new float[16];

    /* renamed from: u */
    public boolean f327840u = false;

    /* renamed from: v */
    public float[] f327841v = f327817x;

    /* renamed from: w */
    public boolean f327842w = false;

    public C109533b() {
        Point k = C97842b.m126294k();
        float f = (((float) k.x) / ((float) k.y)) / 2.0f;
        float f2 = -f;
        f327818y = new float[]{-1.0f, f2, 1.0f, f2, -1.0f, f, 1.0f, f};
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x001b A[Catch:{ Exception -> 0x00ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0055 A[Catch:{ Exception -> 0x00ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0097 A[Catch:{ Exception -> 0x00ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo160755a(byte[] r10, int r11, int r12, int r13, boolean r14) {
        /*
            r9 = this;
            java.lang.String r0 = "MicroMsg.MMSightCameraGLRenderer"
            r1 = 1
            r2 = 0
            int r3 = r9.f327825f     // Catch:{ Exception -> 0x00ae }
            if (r3 != r12) goto L_0x0017
            int r3 = r9.f327824e     // Catch:{ Exception -> 0x00ae }
            if (r3 != r11) goto L_0x0017
            int r3 = r9.f327826g     // Catch:{ Exception -> 0x00ae }
            if (r3 != r13) goto L_0x0017
            boolean r3 = r9.f327842w     // Catch:{ Exception -> 0x00ae }
            if (r3 == r14) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r3 = 0
            goto L_0x0018
        L_0x0017:
            r3 = 1
        L_0x0018:
            r4 = 2
            if (r3 == 0) goto L_0x0049
            java.lang.String r5 = "setDrawFrame, frameData: %s, frameWidth: %s, frameHeight: %s, rotate: %s, isLandScape, frameSizeChange: %s, this %s"
            r6 = 7
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x00ae }
            r6[r2] = r10     // Catch:{ Exception -> 0x00ae }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x00ae }
            r6[r1] = r7     // Catch:{ Exception -> 0x00ae }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x00ae }
            r6[r4] = r7     // Catch:{ Exception -> 0x00ae }
            r7 = 3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x00ae }
            r6[r7] = r8     // Catch:{ Exception -> 0x00ae }
            r7 = 4
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r14)     // Catch:{ Exception -> 0x00ae }
            r6[r7] = r8     // Catch:{ Exception -> 0x00ae }
            r7 = 5
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x00ae }
            r6[r7] = r8     // Catch:{ Exception -> 0x00ae }
            r7 = 6
            r6[r7] = r9     // Catch:{ Exception -> 0x00ae }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r5, r6)     // Catch:{ Exception -> 0x00ae }
        L_0x0049:
            r9.f327823d = r10     // Catch:{ Exception -> 0x00ae }
            r9.f327824e = r11     // Catch:{ Exception -> 0x00ae }
            r9.f327825f = r12     // Catch:{ Exception -> 0x00ae }
            r9.f327826g = r13     // Catch:{ Exception -> 0x00ae }
            r9.f327842w = r14     // Catch:{ Exception -> 0x00ae }
            if (r3 == 0) goto L_0x008f
            int r13 = r12 * r11
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocateDirect(r13)     // Catch:{ Exception -> 0x00ae }
            r9.f327827h = r3     // Catch:{ Exception -> 0x00ae }
            int r13 = r13 / r4
            java.nio.ByteBuffer r13 = java.nio.ByteBuffer.allocateDirect(r13)     // Catch:{ Exception -> 0x00ae }
            r9.f327828i = r13     // Catch:{ Exception -> 0x00ae }
            java.nio.ByteBuffer r13 = r9.f327827h     // Catch:{ Exception -> 0x00ae }
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()     // Catch:{ Exception -> 0x00ae }
            r13.order(r3)     // Catch:{ Exception -> 0x00ae }
            java.nio.ByteBuffer r13 = r9.f327828i     // Catch:{ Exception -> 0x00ae }
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()     // Catch:{ Exception -> 0x00ae }
            r13.order(r3)     // Catch:{ Exception -> 0x00ae }
            if (r14 != 0) goto L_0x007d
            float[] r13 = f327817x     // Catch:{ Exception -> 0x00ae }
            r9.f327841v = r13     // Catch:{ Exception -> 0x00ae }
            goto L_0x0081
        L_0x007d:
            float[] r13 = f327818y     // Catch:{ Exception -> 0x00ae }
            r9.f327841v = r13     // Catch:{ Exception -> 0x00ae }
        L_0x0081:
            float[] r13 = r9.f327841v     // Catch:{ Exception -> 0x00ae }
            if (r13 == 0) goto L_0x008f
            java.nio.FloatBuffer r14 = r9.f327837r     // Catch:{ Exception -> 0x00ae }
            r14.put(r13)     // Catch:{ Exception -> 0x00ae }
            java.nio.FloatBuffer r13 = r9.f327837r     // Catch:{ Exception -> 0x00ae }
            r13.position(r2)     // Catch:{ Exception -> 0x00ae }
        L_0x008f:
            java.nio.ByteBuffer r13 = r9.f327827h     // Catch:{ Exception -> 0x00ae }
            if (r13 == 0) goto L_0x00bc
            java.nio.ByteBuffer r14 = r9.f327828i     // Catch:{ Exception -> 0x00ae }
            if (r14 == 0) goto L_0x00bc
            int r11 = r11 * r12
            r13.put(r10, r2, r11)     // Catch:{ Exception -> 0x00ae }
            java.nio.ByteBuffer r12 = r9.f327827h     // Catch:{ Exception -> 0x00ae }
            r12.position(r2)     // Catch:{ Exception -> 0x00ae }
            java.nio.ByteBuffer r12 = r9.f327828i     // Catch:{ Exception -> 0x00ae }
            int r13 = r11 / 2
            r12.put(r10, r11, r13)     // Catch:{ Exception -> 0x00ae }
            java.nio.ByteBuffer r10 = r9.f327828i     // Catch:{ Exception -> 0x00ae }
            r10.position(r2)     // Catch:{ Exception -> 0x00ae }
            goto L_0x00bc
        L_0x00ae:
            r10 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r1]
            java.lang.String r10 = r10.getMessage()
            r11[r2] = r10
            java.lang.String r10 = "setDrawFrame error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r10, r11)
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m72.C109533b.mo160755a(byte[], int, int, int, boolean):void");
    }

    public void onDrawFrame(GL10 gl10) {
        Util.currentTicks();
        this.f327822c = true;
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16640);
        if (this.f327840u) {
            Log.m105924i("MicroMsg.MMSightCameraGLRenderer", "clearFrameRequest");
            this.f327840u = false;
            this.f327822c = false;
            this.f327823d = null;
            this.f327824e = -1;
            this.f327825f = -1;
            return;
        }
        int i = this.f327831l;
        if (!(i == 0 || this.f327829j == -1 || this.f327830k == -1 || this.f327824e <= 0 || this.f327825f <= 0 || this.f327823d == null)) {
            GLES20.glUseProgram(i);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f327829j);
            GLES20.glTexImage2D(3553, 0, 6409, this.f327824e, this.f327825f, 0, 6409, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, this.f327827h);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLES20.glUniform1i(this.f327834o, 0);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, this.f327830k);
            GLES20.glTexImage2D(3553, 0, 6410, this.f327824e / 2, this.f327825f / 2, 0, 6410, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, this.f327828i);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLES20.glUniform1i(this.f327835p, 1);
            Matrix.setIdentityM(this.f327839t, 0);
            Matrix.setRotateM(this.f327839t, 0, (float) this.f327826g, 0.0f, 0.0f, -1.0f);
            GLES20.glUniformMatrix4fv(this.f327836q, 1, false, this.f327839t, 0);
            this.f327837r.position(0);
            GLES20.glVertexAttribPointer(this.f327833n, 2, 5126, false, 0, this.f327837r);
            GLES20.glEnableVertexAttribArray(this.f327833n);
            this.f327838s.position(0);
            GLES20.glVertexAttribPointer(this.f327832m, 2, 5126, false, 0, this.f327838s);
            GLES20.glEnableVertexAttribArray(this.f327832m);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f327833n);
            GLES20.glDisableVertexAttribArray(this.f327832m);
            GLES20.glBindTexture(3553, 0);
        }
        this.f327822c = false;
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        Log.m105925i("MicroMsg.MMSightCameraGLRenderer", "onSurfaceChanged, surfaceWidth: %s, height: %s this %s", Integer.valueOf(i), Integer.valueOf(i2), this);
        if (i != this.f327820a || i2 != this.f327821b) {
            Log.m105924i("MicroMsg.MMSightCameraGLRenderer", "onSurfaceChanged change viewpoint");
            GLES20.glViewport(0, 0, i, i2);
            this.f327820a = i;
            this.f327821b = i2;
        }
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Log.m105925i("MicroMsg.MMSightCameraGLRenderer", "onSurfaceCreated this %s", this);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glDisable(2929);
        int c = C104724b.m140341c("attribute vec4 a_position;                         \nattribute vec2 a_texCoord;                         \nvarying vec2 v_texCoord;                           \nuniform mat4 uMatrix;                              \nvoid main() {                                      \n   gl_Position = uMatrix * a_position;             \n   v_texCoord = a_texCoord;                        \n}                                                  \n", "#ifdef GL_ES                                       \nprecision highp float;                             \n#endif                                             \nvarying vec2 v_texCoord;                           \nuniform sampler2D y_texture;                       \nuniform sampler2D uv_texture;                      \nvoid main (void) {                                 \n   float r, g, b, y, u, v;                         \n   y = texture2D(y_texture, v_texCoord).r;         \n   u = texture2D(uv_texture, v_texCoord).a;        \n   v = texture2D(uv_texture, v_texCoord).r;        \n   u = u - 0.5;                                    \n   v = v - 0.5;                                    \n   r = y + 1.370705 * v;                           \n   g = y - 0.337633 * u - 0.698001 * v;            \n   b = y + 1.732446 * u;                           \n   gl_FragColor = vec4(r, g, b, 1.0);              \n}                                                  \n");
        this.f327831l = c;
        if (c == 0) {
            Log.m105920e("MicroMsg.MMSightCameraGLRenderer", "onSurfaceCreated, load program failed!");
        }
        this.f327833n = GLES20.glGetAttribLocation(this.f327831l, "a_position");
        this.f327832m = GLES20.glGetAttribLocation(this.f327831l, "a_texCoord");
        this.f327834o = GLES20.glGetUniformLocation(this.f327831l, "y_texture");
        this.f327835p = GLES20.glGetUniformLocation(this.f327831l, "uv_texture");
        this.f327836q = GLES20.glGetUniformLocation(this.f327831l, "uMatrix");
        this.f327829j = C104724b.m140339a();
        this.f327830k = C104724b.m140339a();
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(this.f327841v.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f327837r = asFloatBuffer;
        asFloatBuffer.put(this.f327841v);
        this.f327837r.position(0);
        float[] fArr = f327819z;
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f327838s = asFloatBuffer2;
        asFloatBuffer2.put(fArr);
        this.f327838s.position(0);
        Log.m105925i("MicroMsg.MMSightCameraGLRenderer", "onSurfaceCreated, yTextureId: %s, uvTextureId: %s this %s", Integer.valueOf(this.f327829j), Integer.valueOf(this.f327830k), this);
    }
}
