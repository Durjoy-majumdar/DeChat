package y13;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.google.android.gms.gcm.Task;
import com.tencent.tav.decoder.RenderContext;
import gy3.C87412m;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import w80.C111742d;
import yp3.C112478a;

/* renamed from: y13.c */
public final class C112373c {

    /* renamed from: a */
    public int f336452a;

    /* renamed from: b */
    public int f336453b;

    /* renamed from: c */
    public int f336454c;

    /* renamed from: d */
    public int f336455d;

    /* renamed from: e */
    public int f336456e;

    /* renamed from: f */
    public int f336457f;

    /* renamed from: g */
    public int f336458g;

    /* renamed from: h */
    public int f336459h;

    /* renamed from: i */
    public int f336460i;

    /* renamed from: j */
    public int f336461j;

    /* renamed from: k */
    public int f336462k;

    /* renamed from: l */
    public int f336463l;

    /* renamed from: m */
    public float[] f336464m = new float[16];

    /* renamed from: n */
    public FloatBuffer f336465n;

    /* renamed from: o */
    public FloatBuffer f336466o;

    public C112373c() {
        float[] fArr = C111742d.f334650d;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        C87412m.m108593f(asFloatBuffer, "allocateDirect(GLEnviron…eOrder()).asFloatBuffer()");
        this.f336465n = asFloatBuffer;
        float[] fArr2 = C111742d.f334649c;
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        C87412m.m108593f(asFloatBuffer2, "allocateDirect(GLEnviron…eOrder()).asFloatBuffer()");
        this.f336466o = asFloatBuffer2;
        Matrix.setIdentityM(this.f336464m, 0);
        this.f336465n.position(0);
        this.f336465n.put(fArr);
        this.f336466o.position(0);
        this.f336466o.put(fArr2);
        int p = C111742d.f334647a.mo163470p("#version 300 es\n            precision highp float;\n            layout(location = 0) in vec4 a_position;\n            layout(location = 1) in vec2 a_texCoord;\n            uniform mat4 uMatrix;\n            out vec2 v_texCoord;\n            void main() {\n                v_texCoord = a_texCoord;\n                gl_Position = uMatrix * a_position;\n            }\n            ", "#version 300 es\n            precision highp float;\n            layout(location = 0) out vec4 outColor;\n            uniform sampler2D y_texture;\n            uniform sampler2D u_texture;\n            uniform sampler2D v_texture;\n            in vec2 v_texCoord;\n\n            void main() {\n                float r, g, b, y, u, v;\n                ivec2 ySize = textureSize(y_texture, 0);\n                ivec2 uvSize = textureSize(u_texture, 0);\n\n                y = texelFetch(y_texture, ivec2(int(gl_FragCoord.x), int(float(ySize.y) - gl_FragCoord.y)), 0).r;\n                u = texelFetch(u_texture, ivec2(int(gl_FragCoord.x / 2.0), int(float(uvSize.y) - gl_FragCoord.y / 2.0)), 0).r - 0.5;\n                v = texelFetch(v_texture, ivec2(int(gl_FragCoord.x / 2.0), int(float(uvSize.y) - gl_FragCoord.y / 2.0)), 0).r - 0.5;\n\n                r = y + 1.370705 * v;\n                g = y - 0.337633 * u - 0.698001 * v;\n                b = y + 1.732446 * u;\n\n                outColor = vec4(r, g, b, 1.0);\n\n            }\n        ");
        this.f336454c = p;
        if (p == 0) {
            C112478a.m153624b("GLRenderProc", "checkInit, load program failed!", new Object[0]);
        }
        this.f336456e = GLES20.glGetAttribLocation(this.f336454c, "a_position");
        this.f336455d = GLES20.glGetAttribLocation(this.f336454c, "a_texCoord");
        this.f336457f = GLES20.glGetUniformLocation(this.f336454c, "y_texture");
        this.f336458g = GLES20.glGetUniformLocation(this.f336454c, "u_texture");
        this.f336459h = GLES20.glGetUniformLocation(this.f336454c, "v_texture");
        this.f336460i = GLES20.glGetUniformLocation(this.f336454c, "uMatrix");
        this.f336461j = RenderContext.createTexture(3553);
        this.f336462k = RenderContext.createTexture(3553);
        this.f336463l = RenderContext.createTexture(3553);
    }

    /* renamed from: a */
    public static void m153316a(C112373c cVar, int i, int i2, int i3, Buffer buffer, int i4, int i5, int i6, Object obj) {
        int i7 = (i6 & 4) != 0 ? NativeBitmapStruct.GLFormat.GL_RGBA : i3;
        Buffer buffer2 = (i6 & 8) != 0 ? null : buffer;
        int i8 = (i6 & 16) != 0 ? 9729 : i4;
        int i9 = (i6 & 32) != 0 ? 10497 : i5;
        cVar.getClass();
        GLES20.glTexImage2D(3553, 0, i7, i, i2, 0, i7, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, buffer2);
        float f = (float) i8;
        GLES20.glTexParameterf(3553, 10241, f);
        GLES20.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, f);
        float f2 = (float) i9;
        GLES20.glTexParameterf(3553, 10242, f2);
        GLES20.glTexParameterf(3553, 10243, f2);
    }

    /* renamed from: b */
    public final void mo164095b(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            C112478a.m153624b("GLRenderProc", "gl error " + glGetError + ", " + str, new Object[0]);
        }
    }
}
