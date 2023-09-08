package u80;

import android.opengl.GLES20;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.nio.ByteBuffer;
import p80.C110193b;
import p80.C110194c;
import w80.C111742d;

/* renamed from: u80.d */
public class C111142d extends C111139a {

    /* renamed from: B */
    public C110194c f332803B;

    /* renamed from: C */
    public C110194c f332804C;

    /* renamed from: D */
    public C110194c f332805D;

    /* renamed from: E */
    public int f332806E;

    /* renamed from: F */
    public int f332807F;

    /* renamed from: G */
    public int f332808G;

    /* renamed from: H */
    public int f332809H;

    /* renamed from: I */
    public int f332810I;

    /* renamed from: J */
    public int f332811J;

    /* renamed from: K */
    public int f332812K;

    /* renamed from: L */
    public ByteBuffer f332813L;

    /* renamed from: M */
    public ByteBuffer f332814M;

    /* renamed from: N */
    public ByteBuffer f332815N;

    /* renamed from: O */
    public byte[] f332816O;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111142d(int i, int i2, int i3, int i4, int i5, int i6, int i7, C8480h hVar) {
        super(i, i2, (i7 & 4) != 0 ? i : i3, (i7 & 8) != 0 ? i2 : i4, (i7 & 16) != 0 ? 1 : i5, (i7 & 32) != 0 ? 1 : i6);
        this.f332816O = new byte[0];
        int p = C111742d.f334647a.mo163470p("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform sampler2D y_texture;\n        uniform sampler2D u_texture;\n        uniform sampler2D v_texture;\n\n        void main () {\n           float r, g, b, y, u, v;\n\n        //We had put the Y values of each pixel to the R,G,B components by GL_LUMINANCE,\n        //that's why we're pulling it from the R component, we could also use G or B\n           y = texture2D(y_texture, v_texCoord).r;\n\n        //We had put the U and V values of each pixel to the A and R,G,B components of the\n        //texture respectively using GL_LUMINANCE_ALPHA. Since U,V bytes are interspread\n        //in the texture, this is probably the fastest way to use them in the shader\n        //GL_LUMINANCE_ALPHA is a luminance/alpha pair, so r correspond to v, and\n        //a correspond to u\n        //NV21 is a VUVU pair\n           v = texture2D(v_texture, v_texCoord).r;\n           u = texture2D(u_texture, v_texCoord).r;\n           u = u - 0.5;\n           v = v - 0.5;\n\n        //The numbers are just YUV to RGB conversion constants\n        //https://en.wikipedia.org/wiki/YUV#Y.E2.80.B2UV420sp_.28NV21.29_to_RGB_conversion_.28Android.29\n           r = y + 1.370705 * v;\n           g = y - 0.337633 * u - 0.698001 * v;\n           b = y + 1.732446 * u;\n\n        //We finally set the RGB color of our pixel\n           gl_FragColor = vec4(r, g, b, 1.0);\n        }\n        ");
        this.f332806E = p;
        if (p == 0) {
            Log.m105920e("MicroMsg.GLTextureRenderProcYuvToRgb", "checkInit, load program failed!");
        }
        this.f332808G = GLES20.glGetAttribLocation(this.f332806E, "a_position");
        this.f332807F = GLES20.glGetAttribLocation(this.f332806E, "a_texCoord");
        this.f332809H = GLES20.glGetUniformLocation(this.f332806E, "y_texture");
        this.f332810I = GLES20.glGetUniformLocation(this.f332806E, "u_texture");
        this.f332811J = GLES20.glGetUniformLocation(this.f332806E, "v_texture");
        this.f332812K = GLES20.glGetUniformLocation(this.f332806E, "uMatrix");
        this.f332803B = C110193b.m149776b(true, 5);
        this.f332804C = C110193b.m149776b(true, 5);
        this.f332805D = C110193b.m149776b(true, 5);
    }

    /* renamed from: f */
    public void mo161601f() {
        super.mo161601f();
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
    }

    /* renamed from: l */
    public void mo158471l() {
        super.mo158471l();
        this.f332803B.close();
        this.f332804C.close();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006c, code lost:
        if (r0 != false) goto L_0x00b5;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo158472n() {
        /*
            r14 = this;
            r0 = 16640(0x4100, float:2.3318E-41)
            android.opengl.GLES20.glClear(r0)
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            android.opengl.GLES20.glClearColor(r0, r0, r0, r1)
            int r0 = r14.f332806E
            if (r0 == 0) goto L_0x01af
            int r0 = r14.f332748c
            if (r0 <= 0) goto L_0x01af
            int r0 = r14.f332749d
            if (r0 <= 0) goto L_0x01af
            byte[] r0 = r14.f332816O
            int r0 = r0.length
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x01af
            java.nio.ByteBuffer r0 = r14.f332813L
            r3 = 4
            if (r0 == 0) goto L_0x006e
            java.nio.ByteBuffer r4 = r14.f332814M
            if (r4 == 0) goto L_0x006e
            java.nio.ByteBuffer r4 = r14.f332815N
            if (r4 == 0) goto L_0x006e
            if (r0 == 0) goto L_0x0041
            int r0 = r0.capacity()
            int r4 = r14.f332746a
            int r5 = r14.f332747b
            int r4 = r4 * r5
            if (r0 != r4) goto L_0x0041
            r0 = 1
            goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            if (r0 == 0) goto L_0x006e
            java.nio.ByteBuffer r0 = r14.f332814M
            if (r0 == 0) goto L_0x0057
            int r0 = r0.capacity()
            int r4 = r14.f332746a
            int r5 = r14.f332747b
            int r4 = r4 * r5
            int r4 = r4 / r3
            if (r0 != r4) goto L_0x0057
            r0 = 1
            goto L_0x0058
        L_0x0057:
            r0 = 0
        L_0x0058:
            if (r0 == 0) goto L_0x006e
            java.nio.ByteBuffer r0 = r14.f332815N
            if (r0 == 0) goto L_0x006b
            int r0 = r0.capacity()
            int r4 = r14.f332746a
            int r4 = r4 * r4
            int r4 = r4 / r3
            if (r0 != r4) goto L_0x006b
            r0 = 1
            goto L_0x006c
        L_0x006b:
            r0 = 0
        L_0x006c:
            if (r0 != 0) goto L_0x00b5
        L_0x006e:
            int r0 = r14.f332746a
            int r4 = r14.f332747b
            int r0 = r0 * r4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            r14.f332813L = r0
            int r0 = r14.f332746a
            int r4 = r14.f332747b
            int r0 = r0 * r4
            int r0 = r0 / r3
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            r14.f332814M = r0
            int r0 = r14.f332746a
            int r4 = r14.f332747b
            int r0 = r0 * r4
            int r0 = r0 / r3
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            r14.f332815N = r0
            java.nio.ByteBuffer r0 = r14.f332813L
            if (r0 == 0) goto L_0x009f
            java.nio.ByteOrder r4 = java.nio.ByteOrder.nativeOrder()
            r0.order(r4)
        L_0x009f:
            java.nio.ByteBuffer r0 = r14.f332814M
            if (r0 == 0) goto L_0x00aa
            java.nio.ByteOrder r4 = java.nio.ByteOrder.nativeOrder()
            r0.order(r4)
        L_0x00aa:
            java.nio.ByteBuffer r0 = r14.f332815N
            if (r0 == 0) goto L_0x00b5
            java.nio.ByteOrder r4 = java.nio.ByteOrder.nativeOrder()
            r0.order(r4)
        L_0x00b5:
            java.nio.ByteBuffer r0 = r14.f332813L
            if (r0 == 0) goto L_0x00c4
            byte[] r4 = r14.f332816O
            int r5 = r14.f332746a
            int r6 = r14.f332747b
            int r5 = r5 * r6
            r0.put(r4, r2, r5)
        L_0x00c4:
            java.nio.ByteBuffer r0 = r14.f332813L
            if (r0 == 0) goto L_0x00cb
            r0.position(r2)
        L_0x00cb:
            java.nio.ByteBuffer r0 = r14.f332814M
            if (r0 == 0) goto L_0x00dd
            byte[] r4 = r14.f332816O
            int r5 = r14.f332746a
            int r6 = r14.f332747b
            int r7 = r5 * r6
            int r5 = r5 * r6
            int r5 = r5 / r3
            r0.put(r4, r7, r5)
        L_0x00dd:
            java.nio.ByteBuffer r0 = r14.f332814M
            if (r0 == 0) goto L_0x00e4
            r0.position(r2)
        L_0x00e4:
            java.nio.ByteBuffer r0 = r14.f332815N
            if (r0 == 0) goto L_0x00fa
            byte[] r4 = r14.f332816O
            int r5 = r14.f332746a
            int r6 = r14.f332747b
            int r7 = r5 * r6
            int r8 = r5 * r6
            int r8 = r8 / r3
            int r7 = r7 + r8
            int r5 = r5 * r6
            int r5 = r5 / r3
            r0.put(r4, r7, r5)
        L_0x00fa:
            java.nio.ByteBuffer r0 = r14.f332815N
            if (r0 == 0) goto L_0x0101
            r0.position(r2)
        L_0x0101:
            int r0 = r14.f332806E
            android.opengl.GLES20.glUseProgram(r0)
            r0 = 33984(0x84c0, float:4.7622E-41)
            android.opengl.GLES20.glActiveTexture(r0)
            p80.c r4 = r14.f332803B
            int r5 = r14.f332746a
            int r6 = r14.f332747b
            r7 = 6409(0x1909, float:8.981E-42)
            java.nio.ByteBuffer r8 = r14.f332813L
            r9 = 0
            r10 = 0
            r11 = 48
            r12 = 0
            p80.C110194c.m149779b(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            int r0 = r14.f332809H
            android.opengl.GLES20.glUniform1i(r0, r2)
            r0 = 33985(0x84c1, float:4.7623E-41)
            android.opengl.GLES20.glActiveTexture(r0)
            p80.c r4 = r14.f332804C
            int r0 = r14.f332746a
            r13 = 2
            int r5 = r0 / 2
            int r0 = r14.f332747b
            int r6 = r0 / 2
            r7 = 6409(0x1909, float:8.981E-42)
            java.nio.ByteBuffer r8 = r14.f332814M
            r9 = 0
            r10 = 0
            r11 = 48
            r12 = 0
            p80.C110194c.m149779b(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            int r0 = r14.f332810I
            android.opengl.GLES20.glUniform1i(r0, r1)
            r0 = 33986(0x84c2, float:4.7625E-41)
            android.opengl.GLES20.glActiveTexture(r0)
            p80.c r4 = r14.f332805D
            int r0 = r14.f332746a
            int r5 = r0 / 2
            int r0 = r14.f332747b
            int r6 = r0 / 2
            r7 = 6409(0x1909, float:8.981E-42)
            java.nio.ByteBuffer r8 = r14.f332815N
            r9 = 0
            r10 = 0
            r11 = 48
            r12 = 0
            p80.C110194c.m149779b(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            int r0 = r14.f332811J
            android.opengl.GLES20.glUniform1i(r0, r13)
            int r0 = r14.f332812K
            float[] r4 = r14.f332757l
            android.opengl.GLES20.glUniformMatrix4fv(r0, r1, r2, r4, r2)
            java.nio.FloatBuffer r0 = r14.f332753h
            r0.position(r2)
            int r4 = r14.f332808G
            r5 = 2
            r6 = 5126(0x1406, float:7.183E-42)
            r7 = 0
            r8 = 0
            java.nio.FloatBuffer r9 = r14.f332753h
            android.opengl.GLES20.glVertexAttribPointer(r4, r5, r6, r7, r8, r9)
            int r0 = r14.f332808G
            android.opengl.GLES20.glEnableVertexAttribArray(r0)
            java.nio.FloatBuffer r0 = r14.f332752g
            r0.position(r2)
            int r4 = r14.f332807F
            r5 = 2
            r6 = 5126(0x1406, float:7.183E-42)
            r7 = 0
            r8 = 0
            java.nio.FloatBuffer r9 = r14.f332752g
            android.opengl.GLES20.glVertexAttribPointer(r4, r5, r6, r7, r8, r9)
            int r0 = r14.f332807F
            android.opengl.GLES20.glEnableVertexAttribArray(r0)
            r0 = 5
            android.opengl.GLES20.glDrawArrays(r0, r2, r3)
            int r0 = r14.f332808G
            android.opengl.GLES20.glDisableVertexAttribArray(r0)
            int r0 = r14.f332807F
            android.opengl.GLES20.glDisableVertexAttribArray(r0)
            r0 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r0, r2)
            android.opengl.GLES20.glFinish()
        L_0x01af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u80.C111142d.mo158472n():void");
    }

    /* renamed from: o */
    public void mo162880o(byte[] bArr) {
        C87412m.m108594g(bArr, "frame");
        this.f332816O = bArr;
    }
}
