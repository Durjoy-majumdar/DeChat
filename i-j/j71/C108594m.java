package j71;

import android.opengl.GLES20;
import com.google.android.gms.gcm.Task;
import gy3.C87412m;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import u80.C111139a;

/* renamed from: j71.m */
public final class C108594m extends C111139a {

    /* renamed from: B */
    public final int f325107B;

    /* renamed from: C */
    public final int f325108C;

    /* renamed from: D */
    public final int f325109D;

    /* renamed from: E */
    public final int f325110E;

    /* renamed from: F */
    public final int f325111F;

    /* renamed from: G */
    public final int f325112G;

    /* renamed from: H */
    public final int f325113H;

    /* renamed from: I */
    public final int f325114I;

    /* renamed from: J */
    public FloatBuffer f325115J;

    /* renamed from: K */
    public int f325116K = -1;

    public C108594m(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i, i2, i3, i4, i5, i6);
        int b = C108585b.f325048a.mo159580b("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform sampler2D texture;\n        uniform vec2 size;\n        uniform float radius;\n        uniform int calcRoundCorner;\n\n        void main () {\n            if (calcRoundCorner == 1) {\n                // round corner\n                vec2 bottomLeftCenter = vec2(radius, radius);\n                vec2 bottomRightCenter = vec2(size.x - radius, radius);\n                vec2 topLeftCenter = vec2(radius, size.y - radius);\n                vec2 topRightCenter = vec2(size.x - radius, size.y - radius);\n                if ((gl_FragCoord.x < bottomLeftCenter.x && gl_FragCoord.y < bottomLeftCenter.y && distance(gl_FragCoord.xy, bottomLeftCenter) > radius) ||\n                    (gl_FragCoord.x > bottomRightCenter.x && gl_FragCoord.y < bottomRightCenter.y && distance(gl_FragCoord.xy, bottomRightCenter) > radius) ||\n                    (gl_FragCoord.x < topLeftCenter.x && gl_FragCoord.y > topLeftCenter.y && distance(gl_FragCoord.xy, topLeftCenter) > radius) ||\n                    (gl_FragCoord.x > topRightCenter.x && gl_FragCoord.y > topRightCenter.y && distance(gl_FragCoord.xy, topRightCenter) > radius))  {\n//                   gl_FragColor = vec4(0.95, 0.95, 0.95, 1.0);\n                    discard;\n                } else {\n                   gl_FragColor = texture2D(texture, v_texCoord);\n                }\n            } else {\n                gl_FragColor = texture2D(texture, v_texCoord);\n            }\n        }\n        ");
        this.f325107B = b;
        this.f325109D = GLES20.glGetAttribLocation(b, "a_position");
        this.f325108C = GLES20.glGetAttribLocation(b, "a_texCoord");
        this.f325112G = GLES20.glGetUniformLocation(b, "size");
        this.f325113H = GLES20.glGetUniformLocation(b, "radius");
        this.f325110E = GLES20.glGetUniformLocation(b, "texture");
        this.f325111F = GLES20.glGetUniformLocation(b, "uMatrix");
        this.f325114I = GLES20.glGetUniformLocation(b, "calcRoundCorner");
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(16).order(ByteOrder.nativeOrder()).asFloatBuffer();
        C87412m.m108593f(asFloatBuffer, "allocateDirect(4 * 4).or…eOrder()).asFloatBuffer()");
        this.f325115J = asFloatBuffer;
    }

    /* renamed from: g */
    public void mo158521g() {
        super.mo158521g();
        this.f325115J.position(0);
        this.f325115J.put((float) this.f332748c);
        this.f325115J.put((float) this.f332749d);
    }

    /* renamed from: n */
    public void mo158472n() {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.f325107B);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f325116K);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glUniform1i(this.f325110E, 0);
        GLES20.glUniformMatrix4fv(this.f325111F, 1, false, this.f332757l, 0);
        this.f325115J.position(0);
        GLES20.glUniform2fv(this.f325112G, 1, this.f325115J);
        GLES20.glUniform1f(this.f325113H, ((float) Math.max(this.f332748c, this.f332749d)) * 0.06666667f);
        GLES20.glUniform1i(this.f325114I, 1);
        this.f332753h.position(0);
        GLES20.glVertexAttribPointer(this.f325109D, 2, 5126, false, 0, this.f332753h);
        GLES20.glEnableVertexAttribArray(this.f325109D);
        this.f332752g.position(0);
        GLES20.glVertexAttribPointer(this.f325108C, 2, 5126, false, 0, this.f332752g);
        GLES20.glEnableVertexAttribArray(this.f325108C);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f325109D);
        GLES20.glDisableVertexAttribArray(this.f325108C);
        GLES20.glBindTexture(3553, 0);
        GLES20.glFinish();
    }

    /* renamed from: p */
    public void mo159578p(int i) {
        this.f325116K = i;
    }
}
