package u80;

import android.opengl.GLES20;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.nio.ByteBuffer;
import p80.C110193b;
import p80.C110194c;
import w80.C111742d;

/* renamed from: u80.f */
public class C111144f extends C111139a {

    /* renamed from: B */
    public C110194c f332823B;

    /* renamed from: C */
    public C110194c f332824C;

    /* renamed from: D */
    public int f332825D;

    /* renamed from: E */
    public int f332826E;

    /* renamed from: F */
    public int f332827F;

    /* renamed from: G */
    public int f332828G;

    /* renamed from: H */
    public int f332829H;

    /* renamed from: I */
    public int f332830I;

    /* renamed from: J */
    public ByteBuffer f332831J;

    /* renamed from: K */
    public ByteBuffer f332832K;

    /* renamed from: L */
    public byte[] f332833L = new byte[0];

    public C111144f(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i, i2, i3, i4, i5, i6);
        int p = C111742d.f334647a.mo163470p("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform sampler2D y_texture;\n        uniform sampler2D uv_texture;\n\n        void main () {\n           float r, g, b, y, u, v;\n\n        //We had put the Y values of each pixel to the R,G,B components by GL_LUMINANCE,\n        //that's why we're pulling it from the R component, we could also use G or B\n           y = texture2D(y_texture, v_texCoord).r;\n\n        //We had put the U and V values of each pixel to the A and R,G,B components of the\n        //texture respectively using GL_LUMINANCE_ALPHA. Since U,V bytes are interspread\n        //in the texture, this is probably the fastest way to use them in the shader\n        //GL_LUMINANCE_ALPHA is a luminance/alpha pair, so r correspond to v, and\n        //a correspond to u\n        //NV21 is a VUVU pair\n           u = texture2D(uv_texture, v_texCoord).a;\n           v = texture2D(uv_texture, v_texCoord).r;\n           u = u - 0.5;\n           v = v - 0.5;\n\n        //The numbers are just YUV to RGB conversion constants\n        //https://en.wikipedia.org/wiki/YUV#Y.E2.80.B2UV420sp_.28NV21.29_to_RGB_conversion_.28Android.29\n           r = y + 1.370705 * v;\n           g = y - 0.337633 * u - 0.698001 * v;\n           b = y + 1.732446 * u;\n\n        //We finally set the RGB color of our pixel\n           gl_FragColor = vec4(r, g, b, 1.0);\n        }\n        ");
        this.f332825D = p;
        if (p == 0) {
            Log.m105920e("MicroMsg.GLTextureRenderProcYuvToRgb", "checkInit, load program failed!");
        }
        this.f332827F = GLES20.glGetAttribLocation(this.f332825D, "a_position");
        this.f332826E = GLES20.glGetAttribLocation(this.f332825D, "a_texCoord");
        this.f332828G = GLES20.glGetUniformLocation(this.f332825D, "y_texture");
        this.f332829H = GLES20.glGetUniformLocation(this.f332825D, "uv_texture");
        this.f332830I = GLES20.glGetUniformLocation(this.f332825D, "uMatrix");
        this.f332823B = C110193b.m149776b(true, 5);
        this.f332824C = C110193b.m149776b(true, 5);
    }

    /* renamed from: l */
    public void mo158471l() {
        super.mo158471l();
        GLES20.glDeleteProgram(this.f332825D);
        this.f332823B.close();
        this.f332824C.close();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r0.capacity() != ((r12.f332746a * r12.f332747b) / 2)) goto L_0x0043;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo158472n() {
        /*
            r12 = this;
            int r0 = r12.f332825D
            if (r0 == 0) goto L_0x0136
            int r0 = r12.f332748c
            if (r0 <= 0) goto L_0x0136
            int r0 = r12.f332749d
            if (r0 <= 0) goto L_0x0136
            byte[] r0 = r12.f332833L
            int r0 = r0.length
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0136
            java.nio.ByteBuffer r0 = r12.f332831J
            if (r0 == 0) goto L_0x0043
            java.nio.ByteBuffer r3 = r12.f332832K
            if (r3 == 0) goto L_0x0043
            gy3.C87412m.m108591d(r0)
            int r0 = r0.capacity()
            int r3 = r12.f332746a
            int r4 = r12.f332747b
            int r3 = r3 * r4
            if (r0 != r3) goto L_0x0043
            java.nio.ByteBuffer r0 = r12.f332832K
            gy3.C87412m.m108591d(r0)
            int r0 = r0.capacity()
            int r3 = r12.f332746a
            int r4 = r12.f332747b
            int r3 = r3 * r4
            int r3 = r3 / 2
            if (r0 == r3) goto L_0x0075
        L_0x0043:
            int r0 = r12.f332746a
            int r3 = r12.f332747b
            int r0 = r0 * r3
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            r12.f332831J = r0
            int r0 = r12.f332746a
            int r3 = r12.f332747b
            int r0 = r0 * r3
            int r0 = r0 / 2
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            r12.f332832K = r0
            java.nio.ByteBuffer r0 = r12.f332831J
            gy3.C87412m.m108591d(r0)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            r0.order(r3)
            java.nio.ByteBuffer r0 = r12.f332832K
            gy3.C87412m.m108591d(r0)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            r0.order(r3)
        L_0x0075:
            java.nio.ByteBuffer r0 = r12.f332831J
            gy3.C87412m.m108591d(r0)
            byte[] r3 = r12.f332833L
            int r4 = r12.f332746a
            int r5 = r12.f332747b
            int r4 = r4 * r5
            r0.put(r3, r2, r4)
            java.nio.ByteBuffer r0 = r12.f332831J
            gy3.C87412m.m108591d(r0)
            r0.position(r2)
            java.nio.ByteBuffer r0 = r12.f332832K
            gy3.C87412m.m108591d(r0)
            byte[] r3 = r12.f332833L
            int r4 = r12.f332746a
            int r5 = r12.f332747b
            int r6 = r4 * r5
            int r4 = r4 * r5
            int r4 = r4 / 2
            r0.put(r3, r6, r4)
            java.nio.ByteBuffer r0 = r12.f332832K
            gy3.C87412m.m108591d(r0)
            r0.position(r2)
            int r0 = r12.f332825D
            android.opengl.GLES20.glUseProgram(r0)
            r0 = 33984(0x84c0, float:4.7622E-41)
            android.opengl.GLES20.glActiveTexture(r0)
            p80.c r3 = r12.f332823B
            int r4 = r12.f332746a
            int r5 = r12.f332747b
            r6 = 6409(0x1909, float:8.981E-42)
            java.nio.ByteBuffer r7 = r12.f332831J
            r8 = 0
            r9 = 0
            r10 = 48
            r11 = 0
            p80.C110194c.m149779b(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            int r0 = r12.f332828G
            android.opengl.GLES20.glUniform1i(r0, r2)
            r0 = 33985(0x84c1, float:4.7623E-41)
            android.opengl.GLES20.glActiveTexture(r0)
            p80.c r3 = r12.f332824C
            int r0 = r12.f332746a
            int r4 = r0 / 2
            int r0 = r12.f332747b
            int r5 = r0 / 2
            r6 = 6410(0x190a, float:8.982E-42)
            java.nio.ByteBuffer r7 = r12.f332832K
            r8 = 0
            r9 = 0
            r10 = 48
            r11 = 0
            p80.C110194c.m149779b(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            int r0 = r12.f332829H
            android.opengl.GLES20.glUniform1i(r0, r1)
            int r0 = r12.f332830I
            float[] r3 = r12.f332757l
            android.opengl.GLES20.glUniformMatrix4fv(r0, r1, r2, r3, r2)
            java.nio.FloatBuffer r0 = r12.f332753h
            r0.position(r2)
            int r3 = r12.f332827F
            r4 = 2
            r5 = 5126(0x1406, float:7.183E-42)
            r6 = 0
            r7 = 0
            java.nio.FloatBuffer r8 = r12.f332753h
            android.opengl.GLES20.glVertexAttribPointer(r3, r4, r5, r6, r7, r8)
            int r0 = r12.f332827F
            android.opengl.GLES20.glEnableVertexAttribArray(r0)
            java.nio.FloatBuffer r0 = r12.f332752g
            r0.position(r2)
            int r3 = r12.f332826E
            r4 = 2
            r5 = 5126(0x1406, float:7.183E-42)
            r6 = 0
            r7 = 0
            java.nio.FloatBuffer r8 = r12.f332752g
            android.opengl.GLES20.glVertexAttribPointer(r3, r4, r5, r6, r7, r8)
            int r0 = r12.f332826E
            android.opengl.GLES20.glEnableVertexAttribArray(r0)
            r0 = 5
            r1 = 4
            android.opengl.GLES20.glDrawArrays(r0, r2, r1)
            int r0 = r12.f332827F
            android.opengl.GLES20.glDisableVertexAttribArray(r0)
            int r0 = r12.f332826E
            android.opengl.GLES20.glDisableVertexAttribArray(r0)
            r0 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r0, r2)
            android.opengl.GLES20.glFinish()
        L_0x0136:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u80.C111144f.mo158472n():void");
    }

    /* renamed from: o */
    public void mo162880o(byte[] bArr) {
        C87412m.m108594g(bArr, "frame");
        this.f332833L = bArr;
    }
}
