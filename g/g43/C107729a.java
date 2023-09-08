package g43;

import android.opengl.GLES20;
import bc3.C104079c;
import com.google.android.gms.gcm.Task;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.nio.FloatBuffer;
import w80.C111742d;

/* renamed from: g43.a */
public final class C107729a {

    /* renamed from: a */
    public C104079c f322355a;

    /* renamed from: b */
    public int f322356b;

    /* renamed from: c */
    public int f322357c;

    /* renamed from: d */
    public int f322358d;

    /* renamed from: e */
    public boolean f322359e;

    /* renamed from: f */
    public int f322360f;

    /* renamed from: g */
    public int f322361g;

    /* renamed from: h */
    public int f322362h = GLES20.glGetAttribLocation(this.f322360f, "a_texCoord");

    /* renamed from: i */
    public int f322363i = GLES20.glGetUniformLocation(this.f322360f, "texture");

    /* renamed from: j */
    public final float[] f322364j;

    /* renamed from: k */
    public final float[] f322365k;

    /* renamed from: l */
    public FloatBuffer f322366l;

    /* renamed from: m */
    public FloatBuffer f322367m;

    public C107729a() {
        int p = C111742d.f334647a.mo163470p("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        void main() {\n            gl_Position = a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform sampler2D texture;\n\n        void main () {\n            gl_FragColor = texture2D(texture, v_texCoord);\n        }\n        ");
        this.f322360f = p;
        this.f322361g = GLES20.glGetAttribLocation(p, "a_position");
        GLES20.glGetUniformLocation(this.f322360f, "uMatrix");
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 10497.0f);
        GLES20.glTexParameterf(3553, 10243, 10497.0f);
        try {
            this.f322355a = new C104079c(4);
            Log.m105924i("MicroMsg.VoipSharperRendererProgram", "sifeng sharpen shader create success");
        } catch (Exception unused) {
            this.f322355a = null;
            Log.m105924i("MicroMsg.VoipSharperRendererProgram", "sifeng sharpen shader create failed");
        }
        this.f322364j = new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        this.f322365k = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    }
}
