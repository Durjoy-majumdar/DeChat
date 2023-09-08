package rp3;

import android.opengl.GLES20;
import com.tencent.liteav.videobase.p309a.C17189b;
import java.nio.FloatBuffer;
import java.util.LinkedList;

/* renamed from: rp3.c */
public class C110604c {

    /* renamed from: a */
    public final LinkedList<Runnable> f330874a;

    /* renamed from: b */
    public final String f330875b;

    /* renamed from: c */
    public final String f330876c;

    /* renamed from: d */
    public int f330877d;

    /* renamed from: e */
    public int f330878e;

    /* renamed from: f */
    public int f330879f;

    /* renamed from: g */
    public int f330880g;

    /* renamed from: h */
    public int f330881h;

    /* renamed from: i */
    public int f330882i;

    /* renamed from: j */
    public boolean f330883j;

    public C110604c() {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", C17189b.NO_FILTER_FRAGMENT_SHADER);
    }

    /* renamed from: a */
    public final void mo162160a() {
        this.f330883j = false;
        GLES20.glDeleteProgram(this.f330877d);
        mo162162c();
    }

    /* renamed from: b */
    public final void mo162161b() {
        mo162166g();
        this.f330883j = true;
    }

    /* renamed from: c */
    public void mo162162c() {
    }

    /* renamed from: d */
    public void mo162163d(int i, int i2, int i3, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        GLES20.glUseProgram(this.f330877d);
        mo162169j();
        if (this.f330883j) {
            floatBuffer.position(0);
            GLES20.glVertexAttribPointer(this.f330878e, 2, 5126, false, 8, floatBuffer);
            GLES20.glEnableVertexAttribArray(this.f330878e);
            floatBuffer2.position(0);
            GLES20.glVertexAttribPointer(this.f330880g, 2, 5126, false, 8, floatBuffer2);
            GLES20.glEnableVertexAttribArray(this.f330880g);
            if (i != -1) {
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, i);
                GLES20.glUniform1i(this.f330879f, 0);
            }
            mo162164e(i2, floatBuffer, floatBuffer2);
            mo162165f(i3, floatBuffer, floatBuffer2);
            GLES20.glViewport(0, 0, this.f330881h, this.f330882i);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f330878e);
            GLES20.glDisableVertexAttribArray(this.f330880g);
            GLES20.glBindTexture(3553, 0);
        }
    }

    /* renamed from: e */
    public void mo162164e(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
    }

    /* renamed from: f */
    public void mo162165f(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
    }

    /* renamed from: g */
    public void mo162166g() {
        int a;
        String str = this.f330875b;
        String str2 = this.f330876c;
        int[] iArr = new int[1];
        int a2 = C110613j.m150606a(str, 35633);
        int i = 0;
        if (!(a2 == 0 || (a = C110613j.m150606a(str2, 35632)) == 0)) {
            int glCreateProgram = GLES20.glCreateProgram();
            GLES20.glAttachShader(glCreateProgram, a2);
            GLES20.glAttachShader(glCreateProgram, a);
            GLES20.glLinkProgram(glCreateProgram);
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] > 0) {
                GLES20.glDeleteShader(a2);
                GLES20.glDeleteShader(a);
                i = glCreateProgram;
            }
        }
        this.f330877d = i;
        this.f330878e = GLES20.glGetAttribLocation(i, "position");
        this.f330879f = GLES20.glGetUniformLocation(this.f330877d, "inputImageTexture");
        this.f330880g = GLES20.glGetAttribLocation(this.f330877d, "inputTextureCoordinate");
        this.f330883j = true;
    }

    /* renamed from: h */
    public void mo162167h(int i, int i2) {
        this.f330881h = i;
        this.f330882i = i2;
    }

    /* renamed from: i */
    public void mo162168i(Runnable runnable) {
        synchronized (this.f330874a) {
            this.f330874a.addLast(runnable);
        }
    }

    /* renamed from: j */
    public void mo162169j() {
        while (!this.f330874a.isEmpty()) {
            this.f330874a.removeFirst().run();
        }
    }

    public C110604c(String str, String str2) {
        this.f330874a = new LinkedList<>();
        this.f330875b = str;
        this.f330876c = str2;
    }
}
