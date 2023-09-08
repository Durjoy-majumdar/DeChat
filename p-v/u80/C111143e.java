package u80;

import android.opengl.GLES20;
import com.google.android.gms.gcm.Task;
import gy3.C8480h;
import w80.C111742d;

/* renamed from: u80.e */
public class C111143e extends C111139a {

    /* renamed from: B */
    public int f332817B;

    /* renamed from: C */
    public int f332818C;

    /* renamed from: D */
    public int f332819D;

    /* renamed from: E */
    public int f332820E;

    /* renamed from: F */
    public int f332821F;

    /* renamed from: G */
    public int f332822G;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C111143e(int i, int i2, int i3, int i4, int i5, int i6, int i7, C8480h hVar) {
        this(i, i2, (i7 & 4) != 0 ? i : i3, (i7 & 8) != 0 ? i2 : i4, (i7 & 16) != 0 ? 1 : i5, (i7 & 32) != 0 ? 1 : i6);
    }

    /* renamed from: l */
    public void mo158471l() {
        super.mo158471l();
        GLES20.glDeleteProgram(this.f332817B);
    }

    /* renamed from: n */
    public void mo158472n() {
        int i = this.f332822G;
        if (i != -1 && GLES20.glIsTexture(i)) {
            GLES20.glUseProgram(this.f332817B);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f332822G);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 10497.0f);
            GLES20.glTexParameterf(3553, 10243, 10497.0f);
            GLES20.glUniform1i(this.f332820E, 0);
            GLES20.glUniformMatrix4fv(this.f332821F, 1, false, this.f332757l, 0);
            this.f332753h.position(0);
            GLES20.glVertexAttribPointer(this.f332818C, 2, 5126, false, 0, this.f332753h);
            GLES20.glEnableVertexAttribArray(this.f332818C);
            this.f332752g.position(0);
            GLES20.glVertexAttribPointer(this.f332819D, 2, 5126, false, 0, this.f332752g);
            GLES20.glEnableVertexAttribArray(this.f332819D);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f332818C);
            GLES20.glDisableVertexAttribArray(this.f332819D);
            GLES20.glBindTexture(3553, 0);
            GLES20.glBindTexture(36197, 0);
        }
    }

    /* renamed from: p */
    public void mo159578p(int i) {
        this.f332822G = i;
    }

    public C111143e(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i, i2, i3, i4, i5, i6);
        this.f332822G = -1;
        int p = C111742d.f334647a.mo163470p("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform sampler2D texture;\n\n        void main () {\n            gl_FragColor = texture2D(texture, v_texCoord);\n        }\n        ");
        this.f332817B = p;
        this.f332818C = GLES20.glGetAttribLocation(p, "a_position");
        this.f332819D = GLES20.glGetAttribLocation(this.f332817B, "a_texCoord");
        this.f332820E = GLES20.glGetUniformLocation(this.f332817B, "texture");
        this.f332821F = GLES20.glGetUniformLocation(this.f332817B, "uMatrix");
    }
}
