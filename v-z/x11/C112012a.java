package x11;

import android.opengl.GLES20;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import u80.C111139a;
import w80.C111742d;

/* renamed from: x11.a */
public final class C112012a extends C111139a {

    /* renamed from: B */
    public int f335304B;

    /* renamed from: C */
    public int f335305C;

    /* renamed from: D */
    public int f335306D;

    /* renamed from: E */
    public int f335307E;

    /* renamed from: F */
    public int f335308F;

    /* renamed from: G */
    public int f335309G;

    /* renamed from: H */
    public int f335310H;

    /* renamed from: I */
    public C112016c f335311I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112012a(int i, int i2, int i3, int i4, int i5, int i6, int i7, C8480h hVar) {
        super(i, i2, (i7 & 4) != 0 ? i : i3, (i7 & 8) != 0 ? i2 : i4, (i7 & 16) != 0 ? 1 : i5, (i7 & 32) != 0 ? 1 : i6);
        int p = C111742d.f334647a.mo163470p("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform sampler2D y_texture;\n        uniform sampler2D u_texture;\n        uniform sampler2D v_texture;\n\n        void main () {\n           float r, g, b, y, u, v;\n\n        //We had put the Y values of each pixel to the R,G,B components by GL_LUMINANCE,\n        //that's why we're pulling it from the R component, we could also use G or B\n           y = texture2D(y_texture, v_texCoord).r;\n\n        //We had put the U and V values of each pixel to the A and R,G,B components of the\n        //texture respectively using GL_LUMINANCE_ALPHA. Since U,V bytes are interspread\n        //in the texture, this is probably the fastest way to use them in the shader\n        //GL_LUMINANCE_ALPHA is a luminance/alpha pair, so r correspond to v, and\n        //a correspond to u\n        //NV21 is a VUVU pair\n           v = texture2D(v_texture, v_texCoord).r;\n           u = texture2D(u_texture, v_texCoord).r;\n           u = u - 0.5;\n           v = v - 0.5;\n\n        //The numbers are just YUV to RGB conversion constants\n        //https://en.wikipedia.org/wiki/YUV#Y.E2.80.B2UV420sp_.28NV21.29_to_RGB_conversion_.28Android.29\n           r = y + 1.370705 * v;\n           g = y - 0.337633 * u - 0.698001 * v;\n           b = y + 1.732446 * u;\n\n        //We finally set the RGB color of our pixel\n           gl_FragColor = vec4(r, g, b, 1.0);\n        }\n        ");
        this.f335304B = p;
        if (p == 0) {
            Log.m105920e("MicroMsg.MTR.GLRenderProcI420ToRgb", "checkInit, load program failed!");
        }
        this.f335306D = GLES20.glGetAttribLocation(this.f335304B, "a_position");
        this.f335305C = GLES20.glGetAttribLocation(this.f335304B, "a_texCoord");
        this.f335307E = GLES20.glGetUniformLocation(this.f335304B, "y_texture");
        this.f335308F = GLES20.glGetUniformLocation(this.f335304B, "u_texture");
        this.f335309G = GLES20.glGetUniformLocation(this.f335304B, "v_texture");
        this.f335310H = GLES20.glGetUniformLocation(this.f335304B, "uMatrix");
    }

    /* renamed from: f */
    public void mo161601f() {
        super.mo161601f();
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
    }

    /* renamed from: l */
    public void mo158471l() {
        super.mo158471l();
        GLES20.glDeleteProgram(this.f335304B);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0079  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo158472n() {
        /*
            r10 = this;
            r0 = 16640(0x4100, float:2.3318E-41)
            android.opengl.GLES20.glClear(r0)
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            android.opengl.GLES20.glClearColor(r0, r0, r0, r1)
            int r0 = r10.f335304B
            r1 = 0
            if (r0 == 0) goto L_0x00c4
            int r2 = r10.f332748c
            if (r2 <= 0) goto L_0x00c4
            int r2 = r10.f332749d
            if (r2 <= 0) goto L_0x00c4
            android.opengl.GLES20.glUseProgram(r0)
            x11.c r0 = r10.f335311I
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0082
            r4 = 33984(0x84c0, float:4.7622E-41)
            android.opengl.GLES20.glActiveTexture(r4)
            y11.b$c r4 = r0.f335320c
            boolean r5 = r4.f336409d
            if (r5 == 0) goto L_0x0036
            y11.b$b r4 = r4.f336406a
            boolean r5 = r4.f336404b
            if (r5 == 0) goto L_0x0036
            p80.c r4 = r4.f336403a
            goto L_0x0037
        L_0x0036:
            r4 = r1
        L_0x0037:
            if (r4 == 0) goto L_0x003c
            r4.mo161596d()
        L_0x003c:
            int r4 = r10.f335307E
            android.opengl.GLES20.glUniform1i(r4, r3)
            r4 = 33985(0x84c1, float:4.7623E-41)
            android.opengl.GLES20.glActiveTexture(r4)
            y11.b$c r4 = r0.f335320c
            boolean r5 = r4.f336409d
            if (r5 == 0) goto L_0x0056
            y11.b$b r4 = r4.f336407b
            boolean r5 = r4.f336404b
            if (r5 == 0) goto L_0x0056
            p80.c r4 = r4.f336403a
            goto L_0x0057
        L_0x0056:
            r4 = r1
        L_0x0057:
            if (r4 == 0) goto L_0x005c
            r4.mo161596d()
        L_0x005c:
            int r4 = r10.f335308F
            android.opengl.GLES20.glUniform1i(r4, r2)
            r4 = 33986(0x84c2, float:4.7625E-41)
            android.opengl.GLES20.glActiveTexture(r4)
            y11.b$c r0 = r0.f335320c
            boolean r4 = r0.f336409d
            if (r4 == 0) goto L_0x0076
            y11.b$b r0 = r0.f336408c
            boolean r4 = r0.f336404b
            if (r4 == 0) goto L_0x0076
            p80.c r0 = r0.f336403a
            goto L_0x0077
        L_0x0076:
            r0 = r1
        L_0x0077:
            if (r0 == 0) goto L_0x007c
            r0.mo161596d()
        L_0x007c:
            int r0 = r10.f335309G
            r4 = 2
            android.opengl.GLES20.glUniform1i(r0, r4)
        L_0x0082:
            int r0 = r10.f335310H
            float[] r4 = r10.f332757l
            android.opengl.GLES20.glUniformMatrix4fv(r0, r2, r3, r4, r3)
            java.nio.FloatBuffer r0 = r10.f332753h
            r0.position(r3)
            int r4 = r10.f335306D
            r5 = 2
            r6 = 5126(0x1406, float:7.183E-42)
            r7 = 0
            r8 = 0
            java.nio.FloatBuffer r9 = r10.f332753h
            android.opengl.GLES20.glVertexAttribPointer(r4, r5, r6, r7, r8, r9)
            int r0 = r10.f335306D
            android.opengl.GLES20.glEnableVertexAttribArray(r0)
            java.nio.FloatBuffer r0 = r10.f332752g
            r0.position(r3)
            int r4 = r10.f335305C
            java.nio.FloatBuffer r9 = r10.f332752g
            android.opengl.GLES20.glVertexAttribPointer(r4, r5, r6, r7, r8, r9)
            int r0 = r10.f335305C
            android.opengl.GLES20.glEnableVertexAttribArray(r0)
            r0 = 5
            r2 = 4
            android.opengl.GLES20.glDrawArrays(r0, r3, r2)
            int r0 = r10.f335306D
            android.opengl.GLES20.glDisableVertexAttribArray(r0)
            int r0 = r10.f335305C
            android.opengl.GLES20.glDisableVertexAttribArray(r0)
            r0 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r0, r3)
        L_0x00c4:
            r10.f335311I = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x11.C112012a.mo158472n():void");
    }
}
