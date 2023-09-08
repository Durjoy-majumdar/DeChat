package rp3;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: rp3.h */
public class C110609h extends C110611i {

    /* renamed from: o */
    public int f330921o;

    /* renamed from: p */
    public int f330922p;

    /* renamed from: q */
    public int f330923q;

    /* renamed from: r */
    public int f330924r = -1;

    /* renamed from: s */
    public Bitmap f330925s;

    /* renamed from: rp3.h$a */
    public class C110610a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f330926d;

        public C110610a(Bitmap bitmap) {
            this.f330926d = bitmap;
        }

        public void run() {
            Bitmap bitmap;
            if (C110609h.this.f330924r == -1 && (bitmap = this.f330926d) != null && !bitmap.isRecycled()) {
                GLES20.glActiveTexture(33987);
                C110609h.this.f330924r = C110613j.m150607b(this.f330926d, -1, false);
            }
        }
    }

    public C110609h(String str) {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\nattribute vec4 inputTextureCoordinate3;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\nvarying vec2 textureCoordinate3;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n    textureCoordinate3 = inputTextureCoordinate3.xy;\n}", str);
        mo162178l(C110614k.NORMAL, false, false);
    }

    /* renamed from: c */
    public void mo162162c() {
        super.mo162162c();
        GLES20.glDeleteTextures(1, new int[]{this.f330924r}, 0);
        this.f330924r = -1;
    }

    /* renamed from: d */
    public void mo162163d(int i, int i2, int i3, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        GLES20.glUseProgram(this.f330877d);
        mo162169j();
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
        FloatBuffer floatBuffer3 = floatBuffer2;
        GLES20.glVertexAttribPointer(this.f330928k, 2, 5126, false, 0, floatBuffer3);
        GLES20.glEnableVertexAttribArray(this.f330928k);
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(3553, i2);
        GLES20.glUniform1i(this.f330929l, 2);
        floatBuffer2.position(0);
        GLES20.glVertexAttribPointer(this.f330921o, 2, 5126, false, 0, floatBuffer3);
        GLES20.glEnableVertexAttribArray(this.f330921o);
        GLES20.glActiveTexture(33987);
        GLES20.glBindTexture(3553, i3);
        GLES20.glUniform1i(this.f330922p, 3);
        GLES20.glViewport(0, 0, this.f330881h, this.f330882i);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f330878e);
        GLES20.glDisableVertexAttribArray(this.f330880g);
        GLES20.glDisableVertexAttribArray(0);
        GLES20.glDisableVertexAttribArray(this.f330928k);
        GLES20.glDisableVertexAttribArray(this.f330923q);
        GLES20.glDisableVertexAttribArray(this.f330921o);
        GLES20.glBindTexture(3553, 0);
    }

    /* renamed from: g */
    public void mo162166g() {
        super.mo162166g();
        this.f330923q = GLES20.glGetAttribLocation(this.f330877d, "position");
        this.f330921o = GLES20.glGetAttribLocation(this.f330877d, "inputTextureCoordinate3");
        this.f330922p = GLES20.glGetUniformLocation(this.f330877d, "inputImageTexture3");
        GLES20.glEnableVertexAttribArray(this.f330921o);
        Bitmap bitmap = this.f330925s;
        if (bitmap != null && !bitmap.isRecycled()) {
            mo162177k(this.f330925s);
        }
    }

    /* renamed from: k */
    public void mo162177k(Bitmap bitmap) {
        if (bitmap == null || !bitmap.isRecycled()) {
            this.f330925s = bitmap;
            if (bitmap != null) {
                mo162168i(new C110610a(bitmap));
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
