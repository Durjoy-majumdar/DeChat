package j71;

import ac3.C103355g1;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.google.android.gms.gcm.Task;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p80.C110194c;
import q00.C110264g;
import rh3.C101383g;

/* renamed from: j71.i */
public final class C108591i implements GLSurfaceView.Renderer {

    /* renamed from: A */
    public int f325070A;

    /* renamed from: B */
    public C110194c f325071B;

    /* renamed from: C */
    public C110194c f325072C;

    /* renamed from: D */
    public final FloatBuffer f325073D;

    /* renamed from: E */
    public final FloatBuffer f325074E;

    /* renamed from: F */
    public final FloatBuffer f325075F = ByteBuffer.allocateDirect(8).order(ByteOrder.nativeOrder()).asFloatBuffer();

    /* renamed from: G */
    public final float[] f325076G = new float[16];

    /* renamed from: H */
    public boolean f325077H;

    /* renamed from: I */
    public boolean f325078I = true;

    /* renamed from: J */
    public ByteBuffer f325079J = ByteBuffer.allocate((this.f325082c * this.f325083d) * 4);

    /* renamed from: a */
    public final boolean f325080a;

    /* renamed from: b */
    public final C101383g f325081b;

    /* renamed from: c */
    public int f325082c;

    /* renamed from: d */
    public int f325083d;

    /* renamed from: e */
    public Bitmap f325084e;

    /* renamed from: f */
    public C110194c f325085f;

    /* renamed from: g */
    public SurfaceTexture f325086g;

    /* renamed from: h */
    public C110194c f325087h;

    /* renamed from: i */
    public boolean f325088i;

    /* renamed from: j */
    public int f325089j;

    /* renamed from: k */
    public int f325090k;

    /* renamed from: l */
    public int f325091l;

    /* renamed from: m */
    public int f325092m;

    /* renamed from: n */
    public int f325093n;

    /* renamed from: o */
    public int f325094o;

    /* renamed from: p */
    public int f325095p;

    /* renamed from: q */
    public int f325096q;

    /* renamed from: r */
    public int f325097r;

    /* renamed from: s */
    public int f325098s;

    /* renamed from: t */
    public int f325099t;

    /* renamed from: u */
    public int f325100u;

    /* renamed from: v */
    public int f325101v;

    /* renamed from: w */
    public int f325102w;

    /* renamed from: x */
    public int f325103x;

    /* renamed from: y */
    public int f325104y;

    /* renamed from: z */
    public C103355g1 f325105z;

    public C108591i(boolean z, C101383g gVar) {
        this.f325080a = z;
        this.f325081b = gVar;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        C87412m.m108593f(asFloatBuffer, "allocateDirect(EmojiCapt…eOrder()).asFloatBuffer()");
        this.f325073D = asFloatBuffer;
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        C87412m.m108593f(asFloatBuffer2, "allocateDirect(EmojiCapt…eOrder()).asFloatBuffer()");
        this.f325074E = asFloatBuffer2;
    }

    /* renamed from: a */
    public final void mo159583a(boolean z) {
        C110194c cVar = this.f325071B;
        if (cVar != null && this.f325072C != null) {
            int i = this.f325070A;
            int i2 = cVar != null ? cVar.f329652e : 0;
            GLES20.glBindFramebuffer(36160, i);
            GLES20.glBindTexture(3553, i2);
            GLES20.glTexImage2D(3553, 0, NativeBitmapStruct.GLFormat.GL_RGBA, 640, 640, 0, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, (Buffer) null);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glViewport(0, 0, 640, 640);
            C110194c cVar2 = this.f325085f;
            if (cVar2 != null) {
                GLES20.glUseProgram(this.f325101v);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(36197, cVar2.f329652e);
                GLES20.glTexParameterf(36197, 10241, 9729.0f);
                GLES20.glTexParameterf(36197, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
                GLES20.glTexParameterf(36197, 10242, 33071.0f);
                GLES20.glTexParameterf(36197, 10243, 33071.0f);
                GLES20.glUniform1i(this.f325104y, 0);
                this.f325073D.position(0);
                GLES20.glVertexAttribPointer(this.f325102w, 2, 5126, false, 0, this.f325073D);
                GLES20.glEnableVertexAttribArray(this.f325102w);
                this.f325074E.position(0);
                this.f325074E.put(C108585b.f325051d);
                this.f325074E.position(0);
                GLES20.glVertexAttribPointer(this.f325103x, 2, 5126, false, 0, this.f325074E);
                GLES20.glEnableVertexAttribArray(this.f325103x);
                GLES20.glDrawArrays(5, 0, 4);
                GLES20.glDisableVertexAttribArray(this.f325102w);
                GLES20.glDisableVertexAttribArray(this.f325103x);
                GLES20.glBindTexture(3553, 0);
                GLES20.glBindTexture(36197, 0);
                GLES20.glFinish();
            }
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glFinish();
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16640);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, 640, 640);
            C103355g1 g1Var = this.f325105z;
            if (g1Var != null) {
                C110194c cVar3 = this.f325071B;
                C110264g.C110265b.m149906a(g1Var, cVar3 != null ? cVar3.f329652e : 0, 0, false, 6, (Object) null);
            }
            if (this.f325078I) {
                this.f325078I = false;
                C103355g1 g1Var2 = this.f325105z;
                if (g1Var2 != null) {
                    C110194c cVar4 = this.f325071B;
                    C110264g.C110265b.m149906a(g1Var2, cVar4 != null ? cVar4.f329652e : 0, 0, false, 6, (Object) null);
                }
            }
            C110194c cVar5 = this.f325072C;
            if (cVar5 != null) {
                C110194c.m149779b(cVar5, 640, 640, 0, (Buffer) null, 0, 0, 60, (Object) null);
            }
            C103355g1 g1Var3 = this.f325105z;
            if (g1Var3 != null) {
                C110194c cVar6 = this.f325071B;
                int i3 = cVar6 != null ? cVar6.f329652e : 0;
                C110194c cVar7 = this.f325072C;
                C110264g.C110265b.m149907b(g1Var3, i3, cVar7 != null ? cVar7.f329652e : 0, 0, 0, false, false, false, 124, (Object) null);
            }
            C110194c cVar8 = this.f325072C;
            GLES20.glFinish();
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16640);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, this.f325082c, this.f325083d);
            if (cVar8 != null) {
                GLES20.glViewport(0, 0, this.f325082c, this.f325083d);
                GLES20.glUseProgram(this.f325089j);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, cVar8.f329652e);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
                GLES20.glUniform1i(this.f325093n, 0);
                GLES20.glUniform1i(this.f325092m, 2);
                GLES20.glUniform1i(this.f325098s, 1);
                GLES20.glUniform1i(this.f325100u, this.f325080a ? 1 : 0);
                if (this.f325084e != null) {
                    GLES20.glActiveTexture(33985);
                    C110194c cVar9 = this.f325087h;
                    if (cVar9 != null) {
                        Bitmap bitmap = this.f325084e;
                        C87412m.m108591d(bitmap);
                        C110194c.m149780c(cVar9, bitmap, 0, 0, 6, (Object) null);
                    }
                    GLES20.glUniform1i(this.f325094o, 1);
                } else {
                    GLES20.glUniform1i(this.f325094o, 1);
                }
                this.f325073D.position(0);
                GLES20.glVertexAttribPointer(this.f325090k, 2, 5126, false, 0, this.f325073D);
                GLES20.glEnableVertexAttribArray(this.f325090k);
                this.f325074E.position(0);
                this.f325074E.put(C108585b.f325050c);
                this.f325074E.position(0);
                GLES20.glVertexAttribPointer(this.f325091l, 2, 5126, false, 0, this.f325074E);
                GLES20.glEnableVertexAttribArray(this.f325091l);
                this.f325075F.put((float) this.f325082c);
                this.f325075F.put((float) this.f325083d);
                this.f325075F.position(0);
                GLES20.glUniform2fv(this.f325095p, 1, this.f325075F);
                GLES20.glUniform1f(this.f325096q, ((float) Math.max(this.f325082c, this.f325083d)) * 0.06666667f);
                Matrix.setIdentityM(this.f325076G, 0);
                Matrix.scaleM(this.f325076G, 0, 1.0f, -1.0f, 1.0f);
                GLES20.glUniformMatrix4fv(this.f325099t, 1, false, this.f325076G, 0);
                if (this.f325084e != null) {
                    GLES20.glUniform1i(this.f325097r, 1);
                } else {
                    GLES20.glUniform1i(this.f325097r, 0);
                }
                GLES20.glDrawArrays(5, 0, 4);
                GLES20.glDisableVertexAttribArray(this.f325090k);
                GLES20.glDisableVertexAttribArray(this.f325091l);
                GLES20.glBindTexture(3553, 0);
                GLES20.glBindTexture(36197, 0);
                GLES20.glFinish();
                this.f325079J.position(0);
                int i4 = this.f325082c;
                GLES20.glReadPixels(0, 0, i4, i4, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, this.f325079J);
                GLES20.glUseProgram(0);
            }
        }
    }

    public void onDrawFrame(GL10 gl10) {
        try {
            long currentTicks = Util.currentTicks();
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16640);
            GLES20.glBindFramebuffer(36160, 0);
            SurfaceTexture surfaceTexture = this.f325086g;
            if (surfaceTexture != null) {
                surfaceTexture.updateTexImage();
                mo159583a(this.f325088i);
                Log.m105924i("MicroMsg.EmojiCaptureMixRenderer", "draw frame used " + Util.ticksToNow(currentTicks) + LocaleUtil.MALAY);
                return;
            }
            C87412m.m108603p("videoDecodeSurfaceTexture");
            throw null;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.EmojiCaptureMixRenderer", e, "EmojiCaptureMixRenderer draw frame failed", new Object[0]);
            Log.m105924i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markMixFrameDrawFailed");
            C115669n.INSTANCE.mo175913w(1012, 27, 1);
        }
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        Log.m105924i("MicroMsg.EmojiCaptureMixRenderer", "onSurfaceChanged, width:" + i + ", height:" + i2);
        this.f325082c = i;
        this.f325083d = i2;
        this.f325079J = ByteBuffer.allocate(i * i2 * 4);
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Log.m105924i("MicroMsg.EmojiCaptureMixRenderer", "onSurfaceCreated");
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glDisable(2929);
    }
}
