package u80;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.google.android.gms.gcm.Task;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C8480h;
import gy3.C87412m;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import p80.C110193b;
import p80.C110194c;
import w80.C111742d;

/* renamed from: u80.b */
public class C111140b extends C111139a {

    /* renamed from: B */
    public final String f332772B;

    /* renamed from: C */
    public int f332773C;

    /* renamed from: D */
    public Bitmap f332774D;

    /* renamed from: E */
    public C110194c f332775E;

    /* renamed from: F */
    public Bitmap f332776F;

    /* renamed from: G */
    public C110194c f332777G;

    /* renamed from: H */
    public final float[] f332778H;

    /* renamed from: I */
    public int f332779I;

    /* renamed from: J */
    public int f332780J;

    /* renamed from: K */
    public int f332781K;

    /* renamed from: L */
    public int f332782L;

    /* renamed from: M */
    public int f332783M;

    /* renamed from: N */
    public int f332784N;

    /* renamed from: O */
    public int f332785O;

    /* renamed from: P */
    public int f332786P;

    /* renamed from: Q */
    public int f332787Q;

    /* renamed from: R */
    public int f332788R;

    /* renamed from: S */
    public int f332789S;

    /* renamed from: T */
    public int f332790T;

    /* renamed from: U */
    public int f332791U;

    /* renamed from: V */
    public int f332792V;

    /* renamed from: W */
    public FloatBuffer f332793W;

    /* renamed from: X */
    public FloatBuffer f332794X;

    /* renamed from: Y */
    public int f332795Y;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C111140b(int i, int i2, int i3, int i4, int i5, int i6, int i7, C8480h hVar) {
        this(i, i2, (i7 & 4) != 0 ? i : i3, (i7 & 8) != 0 ? i2 : i4, (i7 & 16) != 0 ? 1 : i5, (i7 & 32) != 0 ? 1 : i6);
    }

    /* renamed from: v */
    public static void m151568v(C111140b bVar, Bitmap bitmap, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            bVar.getClass();
            C87412m.m108594g(bitmap, "bitmap");
            bVar.f332774D = bitmap;
            if (z) {
                bVar.f332793W.position(0);
                bVar.f332793W.put(C111742d.f334651e);
                bVar.f332793W.position(0);
                return;
            }
            bVar.f332793W.position(0);
            bVar.f332793W.put(C111742d.f334650d);
            bVar.f332793W.position(0);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBlendBitmap");
    }

    /* renamed from: l */
    public void mo158471l() {
        super.mo158471l();
        this.f332775E.close();
        this.f332777G.close();
    }

    /* renamed from: n */
    public void mo158472n() {
        long currentTicks = Util.currentTicks();
        GLES20.glUseProgram(this.f332779I);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(this.f332795Y, this.f332773C);
        GLES20.glTexParameterf(this.f332795Y, 10241, 9729.0f);
        GLES20.glTexParameterf(this.f332795Y, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        GLES20.glTexParameterf(this.f332795Y, 10242, 10497.0f);
        GLES20.glTexParameterf(this.f332795Y, 10243, 10497.0f);
        if (this.f332795Y == 3553) {
            GLES20.glUniform1i(this.f332787Q, 1);
            GLES20.glUniform1i(this.f332784N, 0);
            GLES20.glUniform1i(this.f332783M, 3);
        } else {
            GLES20.glUniform1i(this.f332787Q, 0);
            GLES20.glUniform1i(this.f332784N, 3);
            GLES20.glUniform1i(this.f332783M, 0);
        }
        if (this.f332774D != null) {
            GLES20.glActiveTexture(33985);
            Bitmap bitmap = this.f332774D;
            if (bitmap != null) {
                C110194c.m149780c(this.f332775E, bitmap, 0, 0, 6, (Object) null);
            }
            GLES20.glUniform1i(this.f332785O, 1);
            GLES20.glUniform1i(this.f332786P, 1);
        } else {
            GLES20.glUniform1i(this.f332785O, 1);
            GLES20.glUniform1i(this.f332786P, 0);
        }
        if (this.f332776F != null) {
            GLES20.glActiveTexture(33986);
            Bitmap bitmap2 = this.f332776F;
            if (bitmap2 != null) {
                C110194c.m149780c(this.f332777G, bitmap2, 0, 0, 6, (Object) null);
            }
            GLES20.glUniform1i(this.f332790T, 2);
            GLES20.glUniform1i(this.f332789S, 1);
            FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(this.f332778H.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            asFloatBuffer.put(this.f332778H).position(0);
            GLES20.glUniform4fv(this.f332791U, 1, asFloatBuffer);
            this.f332794X.position(0);
            GLES20.glVertexAttribPointer(this.f332792V, 2, 5126, false, 0, this.f332794X);
            GLES20.glEnableVertexAttribArray(this.f332792V);
        } else {
            GLES20.glUniform1i(this.f332789S, 0);
            GLES20.glUniform1i(this.f332790T, 2);
        }
        this.f332753h.position(0);
        GLES20.glVertexAttribPointer(this.f332780J, 2, 5126, false, 0, this.f332753h);
        GLES20.glEnableVertexAttribArray(this.f332780J);
        this.f332752g.position(0);
        this.f332793W.position(0);
        GLES20.glVertexAttribPointer(this.f332782L, 2, 5126, false, 0, this.f332793W);
        GLES20.glEnableVertexAttribArray(this.f332782L);
        GLES20.glVertexAttribPointer(this.f332781K, 2, 5126, false, 0, this.f332752g);
        GLES20.glEnableVertexAttribArray(this.f332781K);
        GLES20.glUniformMatrix4fv(this.f332788R, 1, false, this.f332757l, 0);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f332780J);
        GLES20.glDisableVertexAttribArray(this.f332781K);
        GLES20.glDisableVertexAttribArray(this.f332782L);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindTexture(36197, 0);
        GLES20.glFinish();
        GLES20.glUseProgram(0);
        this.f332774D = null;
        this.f332776F = null;
        String str = this.f332772B;
        Log.m105924i(str, "draw frame used " + Util.ticksToNow(currentTicks) + LocaleUtil.MALAY);
    }

    /* renamed from: p */
    public void mo159578p(int i) {
        this.f332773C = i;
    }

    public C111140b(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i, i2, i3, i4, i5, i6);
        this.f332772B = "MircoMsg.GLTextureRenderProcBlend";
        this.f332778H = new float[4];
        ByteBuffer.allocateDirect(8).order(ByteOrder.nativeOrder()).asFloatBuffer();
        C111742d.C111743a aVar = C111742d.f334647a;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        C87412m.m108593f(asFloatBuffer, "allocateDirect(GLEnviron…eOrder()).asFloatBuffer()");
        this.f332793W = asFloatBuffer;
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        C87412m.m108593f(asFloatBuffer2, "allocateDirect(GLEnviron…eOrder()).asFloatBuffer()");
        this.f332794X = asFloatBuffer2;
        this.f332795Y = 36197;
        this.f332775E = C110193b.m149776b(true, 4);
        this.f332777G = C110193b.m149776b(true, 4);
        int p = C111742d.f334647a.mo163470p("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        attribute vec2 a_texBlurBgCoord;\n        attribute vec2 a_texEmojiCoord;\n        varying vec2 v_texCoord;\n        varying vec2 v_texBlurBgCoord;\n        varying vec2 v_texEmojiCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n            v_texBlurBgCoord = a_texBlurBgCoord;\n            v_texEmojiCoord = a_texEmojiCoord;\n        }\n        ", "\n        #extension GL_OES_EGL_image_external : require\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        varying vec2 v_texBlurBgCoord;\n        varying vec2 v_texEmojiCoord;\n        uniform samplerExternalOES videoExternalTexture;\n        uniform sampler2D videoNormalTexture;\n        uniform sampler2D emojiTexture;\n        uniform sampler2D blurBgTexture;\n        uniform int hasEmojiTexture;\n        uniform int useNormalVideoTexture;\n        uniform int hasBlurBgTexture;\n        uniform vec4 centerLocation; //按top bottom left right来传\n\n        vec4 blendTexture(vec4 source, vec4 blend) {\n            if (blend.a <= 0.0) {\n                return source;\n            }\n            float sourceAlpha = 1.0 - blend.a;\n            float alpha = max(source.a, blend.a);\n            float r = max(0.0, min(sourceAlpha * source.r + blend.r, 1.0));\n            float g = max(0.0, min(sourceAlpha * source.g + blend.g, 1.0));\n            float b = max(0.0, min(sourceAlpha * source.b + blend.b, 1.0));\n            vec4 result = vec4(r, g, b, alpha);\n            if (alpha != 1.0) {\n                r = r + (1.0 - alpha) * 0.95;\n                g = g + (1.0 - alpha) * 0.95;\n                b = b + (1.0 - alpha) * 0.95;\n                r = max(0.0, min(r, 1.0));\n                g = max(0.0, min(g, 1.0));\n                b = max(0.0, min(b, 1.0));\n                return vec4(r, g, b, 1.0);\n            } else {\n                return vec4(r, g, b, alpha);\n            }\n        }\n\n        void main () {\n            vec4 videoColor;\n            vec4 blendElementsColor;\n\n            if (hasBlurBgTexture == 1) {\n                if (useNormalVideoTexture == 1) {\n                    videoColor = texture2D(videoNormalTexture, v_texBlurBgCoord);\n                } else {\n                    videoColor = texture2D(videoExternalTexture, v_texBlurBgCoord);\n                }\n                if (videoColor.a != 1.0) {\n                    videoColor.a = 0.0;\n                }\n                if (gl_FragCoord.y > centerLocation[0] || gl_FragCoord.y < centerLocation[1] ||\n                    gl_FragCoord.x > centerLocation[3] || gl_FragCoord.x < centerLocation[2]) {\n                    if (hasEmojiTexture == 1) {\n                        gl_FragColor = blendTexture(texture2D(blurBgTexture, v_texCoord), texture2D(emojiTexture, v_texEmojiCoord));\n                    } else {\n                        gl_FragColor = texture2D(blurBgTexture, v_texCoord);\n                    }\n                } else {\n                    if (hasEmojiTexture == 1) {\n                        gl_FragColor = blendTexture(videoColor, texture2D(emojiTexture, v_texEmojiCoord));\n                    } else {\n                        gl_FragColor = videoColor;\n                    }\n                }\n            } else {\n                if (useNormalVideoTexture == 1) {\n                    videoColor = texture2D(videoNormalTexture, v_texCoord);\n                } else {\n                    videoColor = texture2D(videoExternalTexture, v_texCoord);\n                }\n                if (videoColor.a != 1.0) {\n                    videoColor.a = 0.0;\n                }\n                if (hasEmojiTexture == 1) {\n                    gl_FragColor = blendTexture(videoColor, texture2D(emojiTexture, v_texEmojiCoord));\n                } else {\n                    gl_FragColor = videoColor;\n                }\n            }\n        }\n        ");
        this.f332779I = p;
        this.f332780J = GLES20.glGetAttribLocation(p, "a_position");
        this.f332781K = GLES20.glGetAttribLocation(this.f332779I, "a_texCoord");
        this.f332782L = GLES20.glGetAttribLocation(this.f332779I, "a_texEmojiCoord");
        this.f332792V = GLES20.glGetAttribLocation(this.f332779I, "a_texBlurBgCoord");
        this.f332783M = GLES20.glGetUniformLocation(this.f332779I, "videoExternalTexture");
        this.f332784N = GLES20.glGetUniformLocation(this.f332779I, "videoNormalTexture");
        this.f332785O = GLES20.glGetUniformLocation(this.f332779I, "emojiTexture");
        this.f332786P = GLES20.glGetUniformLocation(this.f332779I, "hasEmojiTexture");
        this.f332788R = GLES20.glGetUniformLocation(this.f332779I, "uMatrix");
        this.f332787Q = GLES20.glGetUniformLocation(this.f332779I, "useNormalVideoTexture");
        this.f332790T = GLES20.glGetUniformLocation(this.f332779I, "blurBgTexture");
        this.f332789S = GLES20.glGetUniformLocation(this.f332779I, "hasBlurBgTexture");
        this.f332791U = GLES20.glGetUniformLocation(this.f332779I, "centerLocation");
        this.f332793W.position(0);
        this.f332793W.put(C111742d.f334651e);
        this.f332793W.position(0);
    }
}
