package mz1;

import android.opengl.GLES20;
import com.google.android.gms.gcm.Task;
import u80.C111139a;
import w80.C111742d;

/* renamed from: mz1.f */
public class C109650f extends C111139a {

    /* renamed from: B */
    public int f328252B;

    /* renamed from: C */
    public int f328253C;

    /* renamed from: D */
    public int f328254D;

    /* renamed from: E */
    public int f328255E;

    /* renamed from: F */
    public int f328256F;

    /* renamed from: G */
    public int f328257G = -1;

    public C109650f(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i, i2, i3, i4, i5, i6);
        int p = C111742d.f334647a.mo163470p("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "#extension GL_OES_EGL_image_external : require\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform samplerExternalOES texture;\n\n        void main () {\n            gl_FragColor = texture2D(texture, v_texCoord);\n        }\n        ");
        this.f328252B = p;
        this.f328253C = GLES20.glGetAttribLocation(p, "a_position");
        this.f328254D = GLES20.glGetAttribLocation(this.f328252B, "a_texCoord");
        this.f328255E = GLES20.glGetUniformLocation(this.f328252B, "texture");
        this.f328256F = GLES20.glGetUniformLocation(this.f328252B, "uMatrix");
    }

    /* renamed from: l */
    public void mo158471l() {
        super.mo158471l();
        GLES20.glDeleteProgram(this.f328252B);
    }

    /* renamed from: n */
    public void mo158472n() {
        if (this.f328257G != -1) {
            GLES20.glUseProgram(this.f328252B);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, this.f328257G);
            GLES20.glTexParameterf(36197, 10241, 9729.0f);
            GLES20.glTexParameterf(36197, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
            GLES20.glTexParameterf(36197, 10242, 33071.0f);
            GLES20.glTexParameterf(36197, 10243, 33071.0f);
            GLES20.glUniform1i(this.f328255E, 0);
            GLES20.glUniformMatrix4fv(this.f328256F, 1, false, this.f332757l, 0);
            this.f332753h.position(0);
            GLES20.glVertexAttribPointer(this.f328253C, 2, 5126, false, 0, this.f332753h);
            GLES20.glEnableVertexAttribArray(this.f328253C);
            this.f332752g.position(0);
            GLES20.glVertexAttribPointer(this.f328254D, 2, 5126, false, 0, this.f332752g);
            GLES20.glEnableVertexAttribArray(this.f328254D);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f328253C);
            GLES20.glDisableVertexAttribArray(this.f328254D);
            GLES20.glBindTexture(36197, 0);
        }
    }

    /* renamed from: p */
    public void mo159578p(int i) {
        this.f328257G = i;
    }
}
