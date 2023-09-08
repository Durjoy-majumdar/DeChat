package u80;

import android.opengl.GLES20;
import com.google.android.gms.gcm.Task;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import w80.C111742d;

/* renamed from: u80.c */
public class C111141c extends C111139a {

    /* renamed from: B */
    public int f332796B;

    /* renamed from: C */
    public int f332797C;

    /* renamed from: D */
    public int f332798D;

    /* renamed from: E */
    public int f332799E;

    /* renamed from: F */
    public int f332800F;

    /* renamed from: G */
    public int f332801G;

    /* renamed from: H */
    public final String f332802H;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C111141c(int i, int i2, int i3, int i4, int i5, int i6, int i7, C8480h hVar) {
        this(i, i2, (i7 & 4) != 0 ? i : i3, (i7 & 8) != 0 ? i2 : i4, (i7 & 16) != 0 ? 1 : i5, (i7 & 32) != 0 ? 1 : i6);
    }

    /* renamed from: l */
    public void mo158471l() {
        super.mo158471l();
        GLES20.glDeleteProgram(this.f332796B);
    }

    /* renamed from: n */
    public void mo158472n() {
        int i = this.f332801G;
        if (i == -1 || !GLES20.glIsTexture(i)) {
            Log.m105920e(this.f332802H, "draw with invalid texture");
            return;
        }
        GLES20.glUseProgram(this.f332796B);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f332801G);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        GLES20.glTexParameterf(36197, 10242, 33071.0f);
        GLES20.glTexParameterf(36197, 10243, 33071.0f);
        GLES20.glUniform1i(this.f332799E, 0);
        GLES20.glUniformMatrix4fv(this.f332800F, 1, false, this.f332757l, 0);
        this.f332753h.position(0);
        GLES20.glVertexAttribPointer(this.f332797C, 2, 5126, false, 0, this.f332753h);
        GLES20.glEnableVertexAttribArray(this.f332797C);
        this.f332752g.position(0);
        GLES20.glVertexAttribPointer(this.f332798D, 2, 5126, false, 0, this.f332752g);
        GLES20.glEnableVertexAttribArray(this.f332798D);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f332797C);
        GLES20.glDisableVertexAttribArray(this.f332798D);
        GLES20.glBindTexture(36197, 0);
    }

    /* renamed from: p */
    public void mo159578p(int i) {
        this.f332801G = i;
    }

    public C111141c(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i, i2, i3, i4, i5, i6);
        this.f332801G = -1;
        this.f332802H = "MicroMsg.GLTextureRenderProcExternalTexture";
        int p = C111742d.f334647a.mo163470p("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "#extension GL_OES_EGL_image_external : require\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform samplerExternalOES texture;\n\n        void main () {\n            gl_FragColor = texture2D(texture, v_texCoord);\n        }\n        ");
        this.f332796B = p;
        this.f332797C = GLES20.glGetAttribLocation(p, "a_position");
        this.f332798D = GLES20.glGetAttribLocation(this.f332796B, "a_texCoord");
        this.f332799E = GLES20.glGetUniformLocation(this.f332796B, "texture");
        this.f332800F = GLES20.glGetUniformLocation(this.f332796B, "uMatrix");
    }
}
