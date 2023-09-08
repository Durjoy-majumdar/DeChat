package u80;

import android.opengl.GLES20;
import com.google.android.gms.gcm.Task;

/* renamed from: u80.g */
public final class C111145g extends C111139a {

    /* renamed from: B */
    public final Float[][] f332834B;

    /* renamed from: C */
    public final Float[][] f332835C;

    /* renamed from: D */
    public Float[][] f332836D;

    /* renamed from: E */
    public final int f332837E;

    /* renamed from: F */
    public final int f332838F;

    /* renamed from: G */
    public final int f332839G;

    /* renamed from: H */
    public final int f332840H;

    /* renamed from: I */
    public final int f332841I;

    /* renamed from: J */
    public final int f332842J;

    /* renamed from: K */
    public final int f332843K;

    /* renamed from: L */
    public final int f332844L;

    /* renamed from: M */
    public final int f332845M;

    /* renamed from: N */
    public final int f332846N;

    /* renamed from: O */
    public final int f332847O;

    /* renamed from: P */
    public final int f332848P;

    /* renamed from: Q */
    public final int f332849Q;

    /* renamed from: R */
    public final int f332850R;

    /* renamed from: S */
    public final int f332851S;

    /* renamed from: T */
    public int f332852T;

    /* renamed from: U */
    public boolean f332853U;

    /* renamed from: V */
    public boolean f332854V;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C111145g(int r9, int r10, int r11, int r12, int r13, int r14, gy3.C8480h r15) {
        /*
            r8 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r2 = 0
            goto L_0x0008
        L_0x0007:
            r2 = r9
        L_0x0008:
            r9 = r14 & 2
            if (r9 == 0) goto L_0x000e
            r3 = 0
            goto L_0x000f
        L_0x000e:
            r3 = r10
        L_0x000f:
            r9 = r14 & 4
            if (r9 == 0) goto L_0x0015
            r4 = r2
            goto L_0x0016
        L_0x0015:
            r4 = r11
        L_0x0016:
            r9 = r14 & 8
            if (r9 == 0) goto L_0x001c
            r5 = r3
            goto L_0x001d
        L_0x001c:
            r5 = r12
        L_0x001d:
            r9 = r14 & 16
            r10 = 2
            if (r9 == 0) goto L_0x0024
            r6 = 2
            goto L_0x0025
        L_0x0024:
            r6 = r13
        L_0x0025:
            r7 = 1
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r9 = 3
            java.lang.Float[][] r11 = new java.lang.Float[r9][]
            r12 = 4
            java.lang.Float[] r13 = new java.lang.Float[r12]
            r14 = 1050220167(0x3e991687, float:0.299)
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            r13[r0] = r14
            r14 = 1058424226(0x3f1645a2, float:0.587)
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            r15 = 1
            r13[r15] = r14
            r14 = 1038710997(0x3de978d5, float:0.114)
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            r13[r10] = r14
            r14 = 0
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            r13[r9] = r14
            r11[r0] = r13
            java.lang.Float[] r13 = new java.lang.Float[r12]
            r1 = -1104343466(0xffffffffbe2d0e56, float:-0.169)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r13[r0] = r1
            r1 = -1096189739(0xffffffffbea978d5, float:-0.331)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r13[r15] = r1
            r1 = 1056964608(0x3f000000, float:0.5)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r13[r10] = r1
            r13[r9] = r14
            r11[r15] = r13
            java.lang.Float[] r13 = new java.lang.Float[r12]
            r13[r0] = r1
            r2 = -1093236949(0xffffffffbed6872b, float:-0.419)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r13[r15] = r2
            r2 = -1113201836(0xffffffffbda5e354, float:-0.081)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r13[r10] = r2
            r13[r9] = r14
            r11[r10] = r13
            r8.f332834B = r11
            java.lang.Float[][] r13 = new java.lang.Float[r9][]
            java.lang.Float[] r2 = new java.lang.Float[r12]
            r3 = 1046066128(0x3e59b3d0, float:0.2126)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r2[r0] = r3
            r3 = 1060575065(0x3f371759, float:0.7152)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r2[r15] = r3
            r3 = 1033100696(0x3d93dd98, float:0.0722)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r2[r10] = r3
            r2[r9] = r14
            r13[r0] = r2
            java.lang.Float[] r2 = new java.lang.Float[r12]
            r3 = -1108692120(0xffffffffbdeab368, float:-0.1146)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r2[r0] = r3
            r3 = -1094364378(0xffffffffbec55326, float:-0.3854)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r2[r15] = r3
            r2[r10] = r1
            r2[r9] = r14
            r13[r15] = r2
            java.lang.Float[] r12 = new java.lang.Float[r12]
            r12[r0] = r1
            r0 = -1092055833(0xffffffffbee88ce7, float:-0.4542)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r12[r15] = r0
            r0 = -1119899301(0xffffffffbd3fb15b, float:-0.0468)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r12[r10] = r0
            r12[r9] = r14
            r13[r10] = r12
            r8.f332835C = r13
            r8.f332836D = r11
            r9 = -1
            r8.f332852T = r9
            w80.d$a r9 = w80.C111742d.f334647a
            java.lang.String r10 = "#version 300 es\n            precision highp float;\n\n            layout(location = 0) in vec4 a_position;\n            layout(location = 1) in vec2 a_texCoord;\n\n            uniform mat4 uMatrix;\n\n            out vec2 v_texCoord;\n            out float nextLine;\n\n            void main() {\n                v_texCoord = a_texCoord;\n                gl_Position = uMatrix * a_position;\n                nextLine = gl_Position.x;\n            }\n            "
            java.lang.String r11 = "#version 300 es\n            precision highp float;\n            layout(location = 0) out vec4 outColor;\n\n            uniform int yoffset;\n            uniform vec4 preMultip;\n            uniform float inTextureWidth;\n            uniform float inTextureHeight;\n\n            uniform sampler2D inTexture;\n            in vec2 v_texCoord;\n            in float nextLine;\n\n            float getPointValue(float xCoord, int yCoord, int xOffset) {\n                vec4 color0 = texelFetch(inTexture, ivec2(int(xCoord - 1.0) + xOffset, yCoord), 0);\n                vec4 color1 = texelFetch(inTexture, ivec2(int(xCoord) + xOffset, yCoord), 0);\n                vec4 color2 = texelFetch(inTexture, ivec2(int(xCoord - 1.0) + xOffset, yCoord - 1), 0);\n                vec4 color3 = texelFetch(inTexture, ivec2(int(xCoord) + xOffset, yCoord - 1), 0);\n                vec4 values = preMultip * mat4(color0, color1, color2, color3);\n                float res = 0.0;\n                for (int i = 0; i < 4; i++) {\n                    res += values[i];\n                }\n                return res / 4.0;\n            }\n\n            void main() {\n                float nl = step(0.0, nextLine);\n                int yCoord = int((gl_FragCoord.y - float(yoffset)) * 4.0 - 1.0 + (nl * 2.0));\n                float xCoord = (gl_FragCoord.x * 8.0) - (nl * inTextureWidth);\n\n                outColor[0] = getPointValue(xCoord, yCoord, -3);\n                outColor[1] = getPointValue(xCoord, yCoord, -1);\n                outColor[2] = getPointValue(xCoord, yCoord, 1);\n                outColor[3] = getPointValue(xCoord, yCoord, 3);\n\n                outColor = outColor + 0.5;\n            }\n        "
            int r10 = r9.mo163470p(r10, r11)
            r8.f332837E = r10
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "init programIdUV:"
            r11.append(r12)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "RGB2YUVI420RenderProc"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)
            java.lang.String r11 = "yoffset"
            int r13 = android.opengl.GLES20.glGetUniformLocation(r10, r11)
            r8.f332838F = r13
            java.lang.String r13 = "inTexture"
            int r14 = android.opengl.GLES20.glGetUniformLocation(r10, r13)
            r8.f332839G = r14
            java.lang.String r14 = "preMultip"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r10, r14)
            r8.f332840H = r0
            java.lang.String r0 = "uMatrix"
            int r1 = android.opengl.GLES20.glGetUniformLocation(r10, r0)
            r8.f332841I = r1
            java.lang.String r1 = "inTextureWidth"
            int r2 = android.opengl.GLES20.glGetUniformLocation(r10, r1)
            r8.f332842J = r2
            java.lang.String r2 = "inTextureHeight"
            int r10 = android.opengl.GLES20.glGetUniformLocation(r10, r2)
            r8.f332843K = r10
            java.lang.String r10 = "#version 300 es\n            precision highp float;\n            layout(location = 0) in vec4 a_position;\n            layout(location = 1) in vec2 a_texCoord;\n            uniform mat4 uMatrix;\n            out vec2 v_texCoord;\n            void main() {\n                v_texCoord = a_texCoord;\n                gl_Position = uMatrix * a_position;\n            }\n            "
            java.lang.String r3 = "#version 300 es\n            precision highp float;\n            layout(location = 0) out vec4 outColor;\n            uniform int yoffset;\n            uniform vec4 preMultip;\n\n            uniform sampler2D inTexture;\n            in vec2 v_texCoord;\n            uniform float inTextureWidth;\n            uniform float inTextureHeight;\n\n            void main() {\n                float xCoord = v_texCoord.x;\n                float yCoord = v_texCoord.y;\n                vec4 color;\n\n                float realx = gl_FragCoord.x * 4.0 - 0.5;\n                int realY = int(gl_FragCoord.y - float(yoffset));\n                vec4 color0 = texelFetch(inTexture, ivec2(int(realx - 1.5), realY), 0);\n\n                vec4 color1 = texelFetch(inTexture, ivec2(int(realx - 0.5), realY), 0);\n\n                vec4 color2 = texelFetch(inTexture, ivec2(int(realx + 0.5), realY), 0);\n\n                vec4 color3 = texelFetch(inTexture, ivec2(int(realx + 1.5), realY), 0);\n                outColor = preMultip * mat4(color0, color1, color2, color3);\n            }\n        "
            int r9 = r9.mo163470p(r10, r3)
            r8.f332844L = r9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r3 = "init programIdY:"
            r10.append(r3)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r10)
            int r10 = android.opengl.GLES20.glGetUniformLocation(r9, r13)
            r8.f332845M = r10
            int r10 = android.opengl.GLES20.glGetUniformLocation(r9, r0)
            r8.f332846N = r10
            int r10 = android.opengl.GLES20.glGetUniformLocation(r9, r11)
            r8.f332847O = r10
            int r10 = android.opengl.GLES20.glGetUniformLocation(r9, r14)
            r8.f332848P = r10
            int r10 = android.opengl.GLES20.glGetUniformLocation(r9, r1)
            r8.f332849Q = r10
            int r9 = android.opengl.GLES20.glGetUniformLocation(r9, r2)
            r8.f332850R = r9
            r8.f332851S = r15
            r8.mo162883v()
            r8.f332759n = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u80.C111145g.<init>(int, int, int, int, int, int, gy3.h):void");
    }

    /* renamed from: n */
    public void mo158472n() {
        if (this.f332852T != -1) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f332852T);
            GLES20.glTexParameteri(3553, 10241, 9728);
            GLES20.glTexParameteri(3553, Task.EXTRAS_LIMIT_BYTES, 9728);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            mo162884w(true);
            mo162884w(false);
            int i = this.f332749d / 3;
            GLES20.glViewport(0, i + 0, this.f332748c, i * 2);
            GLES20.glUseProgram(this.f332844L);
            GLES20.glUniform1i(this.f332845M, 0);
            GLES20.glUniform1f(this.f332849Q, (float) this.f332746a);
            GLES20.glUniform1f(this.f332850R, (float) this.f332747b);
            GLES20.glUniform1i(this.f332847O, (this.f332749d / 3) + 0);
            GLES20.glUniform4f(this.f332848P, this.f332836D[0][0].floatValue(), this.f332836D[0][1].floatValue(), this.f332836D[0][2].floatValue(), this.f332836D[0][3].floatValue());
            GLES20.glUniformMatrix4fv(this.f332846N, 1, false, this.f332757l, 0);
            this.f332753h.position(0);
            GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, this.f332753h);
            GLES20.glEnableVertexAttribArray(0);
            this.f332752g.position(0);
            GLES20.glVertexAttribPointer(this.f332851S, 2, 5126, false, 0, this.f332752g);
            GLES20.glEnableVertexAttribArray(this.f332851S);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(0);
            GLES20.glDisableVertexAttribArray(this.f332851S);
            GLES20.glBindTexture(3553, 0);
            GLES20.glBindTexture(36197, 0);
        }
    }

    /* renamed from: p */
    public void mo159578p(int i) {
        this.f332852T = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Float[][]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo162883v() {
        /*
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "refreshCalculateParams: fullRange "
            r0.append(r1)
            boolean r1 = r11.f332853U
            r0.append(r1)
            java.lang.String r1 = ", 709 "
            r0.append(r1)
            boolean r1 = r11.f332854V
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RGB2YUVI420RenderProc"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            boolean r0 = r11.f332854V
            if (r0 == 0) goto L_0x0029
            java.lang.Float[][] r0 = r11.f332835C
            goto L_0x002b
        L_0x0029:
            java.lang.Float[][] r0 = r11.f332834B
        L_0x002b:
            boolean r1 = r11.f332853U
            if (r1 == 0) goto L_0x0030
            goto L_0x006f
        L_0x0030:
            java.lang.Object r1 = r0.clone()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r2 = r0.length
            r3 = 0
            r4 = 0
        L_0x0039:
            if (r4 >= r2) goto L_0x0061
            r5 = r0[r4]
            java.lang.Object r6 = r5.clone()
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            int r7 = r5.length
            r8 = 0
        L_0x0045:
            if (r8 >= r7) goto L_0x005a
            r9 = r5[r8]
            float r9 = r9.floatValue()
            r10 = 1063256064(0x3f600000, float:0.875)
            float r9 = r9 * r10
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            r6[r8] = r9
            int r8 = r8 + 1
            goto L_0x0045
        L_0x005a:
            java.lang.Float[] r6 = (java.lang.Float[]) r6
            r1[r4] = r6
            int r4 = r4 + 1
            goto L_0x0039
        L_0x0061:
            r0 = r1
            java.lang.Float[][] r0 = (java.lang.Float[][]) r0
            r1 = r0[r3]
            r2 = 3
            r3 = 1031798784(0x3d800000, float:0.0625)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r1[r2] = r3
        L_0x006f:
            r11.f332836D = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u80.C111145g.mo162883v():void");
    }

    /* renamed from: w */
    public final void mo162884w(boolean z) {
        GLES20.glViewport(0, (z ? this.f332749d / 6 : 0) + 0, this.f332748c, this.f332749d / 6);
        GLES20.glUseProgram(this.f332837E);
        GLES20.glUniform1i(this.f332839G, 0);
        GLES20.glUniform1i(this.f332838F, (z ? this.f332749d / 6 : 0) + 0);
        GLES20.glUniform1f(this.f332842J, (float) this.f332746a);
        GLES20.glUniform1f(this.f332843K, (float) this.f332747b);
        if (z) {
            GLES20.glUniform4f(this.f332840H, this.f332836D[1][0].floatValue(), this.f332836D[1][1].floatValue(), this.f332836D[1][2].floatValue(), this.f332836D[1][3].floatValue());
        } else {
            GLES20.glUniform4f(this.f332840H, this.f332836D[2][0].floatValue(), this.f332836D[2][1].floatValue(), this.f332836D[2][2].floatValue(), this.f332836D[2][3].floatValue());
        }
        GLES20.glUniformMatrix4fv(this.f332841I, 1, false, this.f332757l, 0);
        this.f332753h.position(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, this.f332753h);
        GLES20.glEnableVertexAttribArray(0);
        this.f332752g.position(0);
        GLES20.glVertexAttribPointer(this.f332851S, 2, 5126, false, 0, this.f332752g);
        GLES20.glEnableVertexAttribArray(this.f332851S);
        GLES20.glDrawArrays(5, 0, 4);
    }
}
