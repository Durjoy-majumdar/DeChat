package j71;

import android.graphics.Rect;
import android.opengl.GLES20;
import com.google.android.gms.gcm.Task;
import gy3.C8480h;
import gy3.C87412m;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import u80.C111139a;
import w80.C111742d;

/* renamed from: j71.q */
public final class C108597q extends C111139a {

    /* renamed from: B */
    public final int f325125B;

    /* renamed from: C */
    public final int f325126C;

    /* renamed from: D */
    public final int f325127D;

    /* renamed from: E */
    public final int f325128E;

    /* renamed from: F */
    public final int f325129F;

    /* renamed from: G */
    public final int f325130G;

    /* renamed from: H */
    public final int f325131H;

    /* renamed from: I */
    public final int f325132I;

    /* renamed from: J */
    public int f325133J;

    /* renamed from: K */
    public boolean f325134K;

    /* renamed from: L */
    public float f325135L;

    /* renamed from: M */
    public final FloatBuffer f325136M;

    /* renamed from: N */
    public final Rect f325137N;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108597q(int i, int i2, int i3, int i4, int i5, int i6, int i7, C8480h hVar) {
        super(i, i2, (i7 & 4) != 0 ? i : i3, (i7 & 8) != 0 ? i : i4, i5, (i7 & 32) != 0 ? 1 : i6);
        this.f325133J = -1;
        this.f325137N = new Rect();
        int p = C111742d.f334647a.mo163470p("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform sampler2D texture;\n        uniform vec4 rect;\n        uniform float radius;\n        uniform int calcRoundCorner;\n\n        void main () {\n            if (calcRoundCorner == 1) {\n                // round corner\n                vec2 bottomLeftCenter = vec2(rect.x + radius, rect.y + radius);\n                vec2 bottomRightCenter = vec2(rect.z - radius, rect.y + radius);\n                vec2 topLeftCenter = vec2(rect.x + radius, rect.w - radius);\n                vec2 topRightCenter = vec2(rect.z - radius, rect.w - radius);\n                if ((gl_FragCoord.x < bottomLeftCenter.x && gl_FragCoord.y < bottomLeftCenter.y && distance(gl_FragCoord.xy, bottomLeftCenter) > radius) ||\n                    (gl_FragCoord.x > bottomRightCenter.x && gl_FragCoord.y < bottomRightCenter.y && distance(gl_FragCoord.xy, bottomRightCenter) > radius) ||\n                    (gl_FragCoord.x < topLeftCenter.x && gl_FragCoord.y > topLeftCenter.y && distance(gl_FragCoord.xy, topLeftCenter) > radius) ||\n                    (gl_FragCoord.x > topRightCenter.x && gl_FragCoord.y > topRightCenter.y && distance(gl_FragCoord.xy, topRightCenter) > radius))  {\n//                   gl_FragColor = vec4(0.95, 0.95, 0.95, 1.0);\n                    discard;\n                } else {\n                   gl_FragColor = vec4(texture2D(texture, v_texCoord).rgb, 1.0);\n                }\n            } else {\n                gl_FragColor = texture2D(texture, v_texCoord);\n            }\n        }\n        ");
        this.f325125B = p;
        this.f325126C = GLES20.glGetAttribLocation(p, "a_position");
        this.f325127D = GLES20.glGetAttribLocation(p, "a_texCoord");
        this.f325128E = GLES20.glGetUniformLocation(p, "uMatrix");
        this.f325129F = GLES20.glGetUniformLocation(p, "texture");
        this.f325130G = GLES20.glGetUniformLocation(p, "rect");
        this.f325131H = GLES20.glGetUniformLocation(p, "radius");
        this.f325132I = GLES20.glGetUniformLocation(p, "calcRoundCorner");
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(16).order(ByteOrder.nativeOrder()).asFloatBuffer();
        C87412m.m108593f(asFloatBuffer, "allocateDirect(4 * 4).or…eOrder()).asFloatBuffer()");
        this.f325136M = asFloatBuffer;
    }

    /* renamed from: g */
    public void mo158521g() {
        super.mo158521g();
        this.f325136M.position(0);
        this.f325136M.put((float) this.f325137N.left);
        this.f325136M.put((float) (this.f332749d - this.f325137N.bottom));
        this.f325136M.put((float) this.f325137N.right);
        this.f325136M.put((float) (this.f332749d - this.f325137N.top));
    }

    /* renamed from: n */
    public void mo158472n() {
        if (this.f325133J != -1) {
            Rect rect = this.f325137N;
            GLES20.glViewport(rect.left, this.f332749d - rect.bottom, rect.width(), this.f325137N.height());
            GLES20.glUseProgram(this.f325125B);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f325133J);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLES20.glUniform1i(this.f325129F, 0);
            GLES20.glUniformMatrix4fv(this.f325128E, 1, false, this.f332757l, 0);
            this.f332753h.position(0);
            GLES20.glVertexAttribPointer(this.f325126C, 2, 5126, false, 0, this.f332753h);
            GLES20.glEnableVertexAttribArray(this.f325126C);
            this.f332752g.position(0);
            GLES20.glVertexAttribPointer(this.f325127D, 2, 5126, false, 0, this.f332752g);
            GLES20.glEnableVertexAttribArray(this.f325127D);
            this.f325136M.position(0);
            GLES20.glUniform4fv(this.f325130G, 1, this.f325136M);
            GLES20.glUniform1f(this.f325131H, this.f325135L);
            GLES20.glUniform1i(this.f325132I, this.f325134K ? 1 : 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f325126C);
            GLES20.glDisableVertexAttribArray(this.f325127D);
            GLES20.glBindTexture(3553, 0);
            GLES20.glFinish();
        }
    }

    /* renamed from: p */
    public void mo159578p(int i) {
        this.f325133J = i;
    }
}
