package g43;

import android.opengl.GLES20;
import com.google.android.gms.gcm.Task;
import gy3.C87412m;
import java.nio.FloatBuffer;
import w80.C111742d;

/* renamed from: g43.b */
public final class C107730b {

    /* renamed from: a */
    public boolean f322368a;

    /* renamed from: b */
    public int f322369b;

    /* renamed from: c */
    public int f322370c;

    /* renamed from: d */
    public int f322371d;

    /* renamed from: e */
    public int f322372e;

    /* renamed from: f */
    public int f322373f;

    public C107730b(boolean z) {
        this.f322368a = z;
        if (z) {
            int p = C111742d.f334647a.mo163470p("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "#extension GL_OES_EGL_image_external : require\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform samplerExternalOES texture;\n\n        void main () {\n            gl_FragColor = texture2D(texture, v_texCoord);\n        }\n        ");
            this.f322369b = p;
            this.f322370c = GLES20.glGetAttribLocation(p, "a_position");
            this.f322371d = GLES20.glGetAttribLocation(this.f322369b, "a_texCoord");
            this.f322372e = GLES20.glGetUniformLocation(this.f322369b, "texture");
            this.f322373f = GLES20.glGetUniformLocation(this.f322369b, "uMatrix");
            GLES20.glTexParameterf(36197, 10241, 9729.0f);
            GLES20.glTexParameterf(36197, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
            GLES20.glTexParameterf(36197, 10242, 33071.0f);
            GLES20.glTexParameterf(36197, 10243, 33071.0f);
            return;
        }
        int p2 = C111742d.f334647a.mo163470p("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform sampler2D texture;\n\n        void main () {\n            gl_FragColor = texture2D(texture, v_texCoord);\n        }\n        ");
        this.f322369b = p2;
        this.f322370c = GLES20.glGetAttribLocation(p2, "a_position");
        this.f322371d = GLES20.glGetAttribLocation(this.f322369b, "a_texCoord");
        this.f322372e = GLES20.glGetUniformLocation(this.f322369b, "texture");
        this.f322373f = GLES20.glGetUniformLocation(this.f322369b, "uMatrix");
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 10497.0f);
        GLES20.glTexParameterf(3553, 10243, 10497.0f);
    }

    /* renamed from: a */
    public final void mo158147a(FloatBuffer floatBuffer, FloatBuffer floatBuffer2, int i, float[] fArr) {
        FloatBuffer floatBuffer3 = floatBuffer;
        FloatBuffer floatBuffer4 = floatBuffer2;
        int i2 = i;
        float[] fArr2 = fArr;
        C87412m.m108594g(floatBuffer, "cubeBuffer");
        C87412m.m108594g(floatBuffer4, "textureCoordBuff");
        C87412m.m108594g(fArr2, "transformMatrix");
        if (this.f322368a) {
            if (i2 != -1) {
                GLES20.glUseProgram(this.f322369b);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(36197, i2);
                GLES20.glUniform1i(this.f322372e, 0);
                GLES20.glUniformMatrix4fv(this.f322373f, 1, false, fArr2, 0);
                floatBuffer.position(0);
                GLES20.glVertexAttribPointer(this.f322370c, 2, 5126, false, 8, floatBuffer);
                GLES20.glEnableVertexAttribArray(this.f322370c);
                floatBuffer4.position(0);
                GLES20.glVertexAttribPointer(this.f322371d, 2, 5126, false, 8, floatBuffer2);
                GLES20.glEnableVertexAttribArray(this.f322371d);
                GLES20.glDrawArrays(5, 0, 4);
                GLES20.glDisableVertexAttribArray(this.f322370c);
                GLES20.glDisableVertexAttribArray(this.f322371d);
            }
        } else if (i2 != -1 && GLES20.glIsTexture(i)) {
            GLES20.glUseProgram(this.f322369b);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, i2);
            GLES20.glUniform1i(this.f322372e, 0);
            GLES20.glUniformMatrix4fv(this.f322373f, 1, false, fArr2, 0);
            GLES20.glVertexAttribPointer(this.f322370c, 2, 5126, false, 0, floatBuffer);
            GLES20.glEnableVertexAttribArray(this.f322370c);
            GLES20.glVertexAttribPointer(this.f322371d, 2, 5126, false, 0, floatBuffer2);
            GLES20.glEnableVertexAttribArray(this.f322371d);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f322370c);
            GLES20.glDisableVertexAttribArray(this.f322371d);
            GLES20.glBindTexture(3553, 0);
            GLES20.glBindTexture(36197, 0);
        }
    }
}
