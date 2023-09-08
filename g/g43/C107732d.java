package g43;

import android.opengl.GLES20;
import com.google.android.gms.gcm.Task;
import java.nio.ByteBuffer;
import p80.C110193b;
import p80.C110194c;
import w80.C111742d;

/* renamed from: g43.d */
public final class C107732d {

    /* renamed from: a */
    public int f322376a;

    /* renamed from: b */
    public int f322377b;

    /* renamed from: c */
    public int f322378c = GLES20.glGetAttribLocation(this.f322376a, "a_texCoord");

    /* renamed from: d */
    public C110194c f322379d = C110193b.m149776b(true, 14);

    /* renamed from: e */
    public C110194c f322380e = C110193b.m149776b(true, 14);

    /* renamed from: f */
    public C110194c f322381f = C110193b.m149776b(true, 14);

    /* renamed from: g */
    public int f322382g = GLES20.glGetUniformLocation(this.f322376a, "samplerY");

    /* renamed from: h */
    public int f322383h = GLES20.glGetUniformLocation(this.f322376a, "samplerU");

    /* renamed from: i */
    public int f322384i = GLES20.glGetUniformLocation(this.f322376a, "samplerV");

    /* renamed from: j */
    public int f322385j = GLES20.glGetUniformLocation(this.f322376a, "uMatrix");

    /* renamed from: k */
    public ByteBuffer f322386k;

    /* renamed from: l */
    public ByteBuffer f322387l;

    /* renamed from: m */
    public ByteBuffer f322388m;

    /* renamed from: n */
    public int f322389n;

    public C107732d() {
        int p = C111742d.f334647a.mo163470p("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n                precision highp float;\n                uniform sampler2D samplerY;\n                uniform sampler2D samplerU;\n                uniform sampler2D samplerV;\n                varying vec2 v_texCoord;\n                void main() {\n                  vec4 c = vec4((texture2D(samplerY, v_texCoord).r - 16./255.) * 1.164);\n                  vec4 U; vec4 V;\n                  U = vec4(texture2D(samplerU, v_texCoord).r - 128./255.);\n                  V = vec4(texture2D(samplerV, v_texCoord).r - 128./255.);\n                  c += V * vec4(1.596, -0.813, 0, 0);\n                  c += U * vec4(0, -0.392, 2.017, 0);\n                  c.a = 1.0;\n                  gl_FragColor = c;\n                }\n            ");
        this.f322376a = p;
        this.f322377b = GLES20.glGetAttribLocation(p, "a_position");
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
    }
}
