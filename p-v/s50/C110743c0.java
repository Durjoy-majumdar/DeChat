package s50;

import ac3.C0031n;
import ac3.C54009m;
import ac3.C54010o;
import ac3.C54011p;
import android.opengl.GLES20;
import com.google.android.gms.gcm.Task;
import com.tencent.p014mm.xeffect.IWeJsonMessageCallback;
import gy3.C8480h;
import p80.C110194c;
import u80.C111143e;
import w80.C111742d;

/* renamed from: s50.c0 */
public final class C110743c0 {

    /* renamed from: a */
    public C110194c f331215a;

    /* renamed from: b */
    public volatile C110742c f331216b;

    /* renamed from: c */
    public C111143e f331217c;

    /* renamed from: d */
    public int f331218d;

    /* renamed from: e */
    public int f331219e;

    /* renamed from: f */
    public int f331220f;

    /* renamed from: g */
    public boolean f331221g;

    /* renamed from: h */
    public IWeJsonMessageCallback f331222h;

    /* renamed from: i */
    public C54011p f331223i;

    /* renamed from: j */
    public C54010o f331224j;

    /* renamed from: k */
    public C54009m f331225k;

    /* renamed from: l */
    public C0031n f331226l;

    public C110743c0() {
        int p = C111742d.f334647a.mo163470p("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        void main() {\n            gl_Position = a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "#extension GL_OES_EGL_image_external : require\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform samplerExternalOES texture;\n\n        void main () {\n            gl_FragColor = texture2D(texture, v_texCoord);\n        }\n        ");
        this.f331218d = p;
        GLES20.glGetAttribLocation(p, "a_position");
        GLES20.glGetAttribLocation(this.f331218d, "a_texCoord");
        GLES20.glGetUniformLocation(this.f331218d, "texture");
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        GLES20.glTexParameterf(36197, 10242, 33071.0f);
        GLES20.glTexParameterf(36197, 10243, 33071.0f);
        if (this.f331217c == null) {
            this.f331217c = new C111143e(0, 0, 0, 0, 2, 0, 32, (C8480h) null);
        }
    }
}
