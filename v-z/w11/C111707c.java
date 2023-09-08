package w11;

import android.opengl.GLES20;
import com.google.android.gms.gcm.Task;
import e43.C107226d;
import w80.C111742d;

/* renamed from: w11.c */
public final class C111707c {

    /* renamed from: a */
    public volatile C107226d f334382a;

    /* renamed from: b */
    public int f334383b;

    public C111707c() {
        int p = C111742d.f334647a.mo163470p("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        void main() {\n            gl_Position = a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "#extension GL_OES_EGL_image_external : require\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform samplerExternalOES texture;\n\n        void main () {\n            gl_FragColor = texture2D(texture, v_texCoord);\n        }\n        ");
        this.f334383b = p;
        GLES20.glGetAttribLocation(p, "a_position");
        GLES20.glGetAttribLocation(this.f334383b, "a_texCoord");
        GLES20.glGetUniformLocation(this.f334383b, "texture");
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        GLES20.glTexParameterf(36197, 10242, 33071.0f);
        GLES20.glTexParameterf(36197, 10243, 33071.0f);
    }
}
