package rp3;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: rp3.i */
public class C110611i extends C110604c {

    /* renamed from: k */
    public int f330928k;

    /* renamed from: l */
    public int f330929l;

    /* renamed from: m */
    public int f330930m = -1;

    /* renamed from: n */
    public Bitmap f330931n;

    /* renamed from: rp3.i$a */
    public class C110612a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f330932d;

        public C110612a(Bitmap bitmap) {
            this.f330932d = bitmap;
        }

        public void run() {
            Bitmap bitmap;
            if (C110611i.this.f330930m == -1 && (bitmap = this.f330932d) != null && !bitmap.isRecycled()) {
                GLES20.glActiveTexture(33986);
                C110611i.this.f330930m = C110613j.m150607b(this.f330932d, -1, false);
            }
        }
    }

    public C110611i(String str, String str2) {
        super(str, str2);
        mo162178l(C110614k.NORMAL, false, false);
    }

    /* renamed from: c */
    public void mo162162c() {
        GLES20.glDeleteTextures(1, new int[]{this.f330930m}, 0);
        this.f330930m = -1;
    }

    /* renamed from: d */
    public void mo162163d(int i, int i2, int i3, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        GLES20.glUseProgram(this.f330877d);
        mo162169j();
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        floatBuffer.position(0);
        GLES20.glVertexAttribPointer(this.f330878e, 2, 5126, false, 0, floatBuffer);
        GLES20.glEnableVertexAttribArray(this.f330878e);
        floatBuffer2.position(0);
        GLES20.glVertexAttribPointer(this.f330880g, 2, 5126, false, 0, floatBuffer2);
        GLES20.glEnableVertexAttribArray(this.f330880g);
        if (i != -1) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, i);
            GLES20.glUniform1i(this.f330879f, 0);
        }
        floatBuffer2.position(0);
        GLES20.glVertexAttribPointer(this.f330928k, 2, 5126, false, 0, floatBuffer2);
        GLES20.glEnableVertexAttribArray(this.f330928k);
        if (i2 != -1) {
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(3553, i2);
            GLES20.glUniform1i(this.f330929l, 3);
        }
        GLES20.glViewport(0, 0, this.f330881h, this.f330882i);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f330878e);
        GLES20.glDisableVertexAttribArray(this.f330880g);
        GLES20.glDisableVertexAttribArray(0);
        GLES20.glDisableVertexAttribArray(this.f330928k);
        GLES20.glBindTexture(3553, 0);
    }

    /* renamed from: e */
    public void mo162164e(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        GLES20.glEnableVertexAttribArray(this.f330928k);
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(3553, this.f330930m);
        GLES20.glUniform1i(this.f330929l, 2);
        floatBuffer2.position(0);
        GLES20.glVertexAttribPointer(this.f330928k, 2, 5126, false, 0, floatBuffer2);
    }

    /* renamed from: f */
    public void mo162165f(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
    }

    /* renamed from: g */
    public void mo162166g() {
        super.mo162166g();
        this.f330928k = GLES20.glGetAttribLocation(this.f330877d, "inputTextureCoordinate2");
        this.f330929l = GLES20.glGetUniformLocation(this.f330877d, "inputImageTexture2");
        GLES20.glEnableVertexAttribArray(this.f330928k);
        Bitmap bitmap = this.f330931n;
        if (bitmap != null && !bitmap.isRecycled()) {
            mo162177k(this.f330931n);
        }
    }

    /* renamed from: k */
    public void mo162177k(Bitmap bitmap) {
        if (bitmap == null || !bitmap.isRecycled()) {
            this.f330931n = bitmap;
            if (bitmap != null) {
                mo162168i(new C110612a(bitmap));
            }
        }
    }

    /* renamed from: l */
    public void mo162178l(C110614k kVar, boolean z, boolean z2) {
        float[] b = C110617n.m150612b(kVar, z, z2);
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(b);
        asFloatBuffer.flip();
    }
}
