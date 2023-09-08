package f43;

import android.opengl.GLES20;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import p80.C110192a;
import p80.C110193b;
import p80.C110194c;
import rp3.C110608g;

/* renamed from: f43.c */
public class C107475c {

    /* renamed from: a */
    public int f321527a = 0;

    /* renamed from: b */
    public C110194c[] f321528b = new C110194c[3];

    /* renamed from: c */
    public int[] f321529c = new int[3];

    /* renamed from: d */
    public FloatBuffer f321530d;

    /* renamed from: e */
    public FloatBuffer f321531e;

    /* renamed from: f */
    public C107473a f321532f;

    /* renamed from: g */
    public C110608g f321533g;

    /* renamed from: h */
    public C110194c f321534h = null;

    /* renamed from: i */
    public C110194c f321535i = null;

    /* renamed from: j */
    public C110192a f321536j = null;

    /* renamed from: k */
    public boolean f321537k = false;

    /* renamed from: l */
    public boolean f321538l = false;

    /* renamed from: m */
    public boolean f321539m = false;

    /* renamed from: n */
    public boolean f321540n = false;

    /* renamed from: o */
    public int f321541o = 0;

    /* renamed from: p */
    public int f321542p = 0;

    /* renamed from: q */
    public int f321543q = 0;

    /* renamed from: r */
    public int f321544r = 0;

    /* renamed from: s */
    public FloatBuffer f321545s;

    /* renamed from: t */
    public FloatBuffer f321546t;

    /* renamed from: u */
    public float[] f321547u = new float[8];

    /* renamed from: v */
    public float[] f321548v = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: w */
    public float[] f321549w = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: x */
    public float[] f321550x = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: y */
    public float[] f321551y = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    public C107475c() {
        mo157896f();
        this.f321527a = C107478e.m145592a("attribute vec4 vPosition;attribute vec2 vTexCoord;varying vec2 tc;void main() {  gl_Position = vPosition;  tc = vTexCoord;}", "precision highp float;uniform sampler2D samplerY;uniform sampler2D samplerU;uniform sampler2D samplerV;uniform sampler2D samplerUV;uniform int yuvType;varying vec2 tc;void main() {  vec4 c = vec4((texture2D(samplerY, tc).r - 16./255.) * 1.164);  vec4 U; vec4 V; if (yuvType == 0 || yuvType == 1){      U = vec4(texture2D(samplerU, tc).r - 128./255.);      V = vec4(texture2D(samplerV, tc).r - 128./255.);  } else {      U = vec4(texture2D(samplerUV, tc).a - 128./255.);      V = vec4(texture2D(samplerUV, tc).r - 128./255.);  }   c += V * vec4(1.596, -0.813, 0, 0);  c += U * vec4(0, -0.392, 2.017, 0);  c.a = 1.0;  gl_FragColor = c;}");
        int i = 0;
        while (true) {
            C110194c[] cVarArr = this.f321528b;
            if (i >= cVarArr.length) {
                break;
            }
            cVarArr[i] = C110193b.m149776b(true, 14);
            i++;
        }
        C107473a aVar = new C107473a();
        this.f321532f = aVar;
        aVar.mo157884e();
        aVar.f321500a = C107478e.m145592a("attribute vec4 vPosition;attribute vec2 vTexCoord;varying vec2 tc;void main() {  gl_Position = vPosition;  tc = vTexCoord;}", "varying highp vec2 tc;\nuniform sampler2D inputImageTexture;\nuniform mediump float smoothDegree;\nuniform mediump int showCounter;\nuniform mediump int showMode;\n\nuniform mediump float brightness;\nuniform mediump float texelWidth;\nuniform mediump float texelHeight;\n\nprecision highp float;\nconst mat3 RGBtoYUV = mat3(0.299,  0.587, 0.114, 0.5, -0.4187, -0.0813, -0.169, -0.3313,  0.5 );    //full range\nconst mat3 YUVtoRGB = mat3(1.1643, 1.5958, 0.0, 1.1643, -0.8129, -0.3917, 1.1643, 0.0, 2.017 );\n\nconst highp mat3 saturateMatrix = mat3(\n1.1102, -0.0598, -0.061,\n-0.0774, 1.0826, -0.1186,\n-0.0228, -0.0228, 1.1772);\n\n\nvec3 rgb2hsv(vec3 c)\n{\n    vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);\n    vec4 p = mix(vec4(c.bg, K.wz), vec4(c.gb, K.xy), step(c.b, c.g));\n    vec4 q = mix(vec4(p.xyw, c.r), vec4(c.r, p.yzx), step(p.x, c.r));\n\n    float d = q.x - min(q.w, q.y);\n    float e = 1.0e-10;\n    return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);\n}\n\nvec3 hsv2rgb(vec3 c)\n{\n    vec4 K = vec4(1.0, 2.0 / 3.0, 1.0 / 3.0, 3.0);\n    vec3 p = abs(fract(c.xxx + K.xyz) * 6.0 - K.www);\n    return c.z * mix(K.xxx, clamp(p - K.xxx, 0.0, 1.0), c.y);\n}\n\nvec3 yuv2rgb(vec3 c)\n{\n    vec3 rgb = YUVtoRGB*c;\n    return rgb;\n}\nvec3 rgb2yuv(vec3 c)\n{\n    vec3 yuv = c*RGBtoYUV;\n    return yuv;\n}\nmediump float hardLight(mediump float color){\n    if (color <= 0.5)\n    color = color * color * 2.0;\n    else\n    color = 1.0 - ((1.0 - color)*(1.0 - color) * 2.0);\n    return color;\n}\n\nfloat lum(vec3 v)\n{\n    return dot(v, vec3(0.299, 0.587, 0.114));\n}\n\nvec4 getValue(vec4 newValue, vec4 originValue)\n{\n    return mix(newValue, originValue, step(lum(newValue.rgb), lum(originValue.rgb)));\n}\n\nvec4 Sobel2()\n{\n    vec2 samplerSteps = vec2(1.0/texelWidth, 1.0/texelHeight);\n    vec2 coords[8];\n    coords[0] = tc - samplerSteps * 2.0;\n    coords[1] = tc + vec2(0.0, -samplerSteps.y) * 2.0;\n    coords[2] = tc + vec2(samplerSteps.x, -samplerSteps.y) * 2.0;\n\n    coords[3] = tc - vec2(samplerSteps.x, 0.0) * 2.0;\n    coords[4] = tc + vec2(samplerSteps.x, 0.0) * 2.0;\n\n    coords[5] = tc + vec2(-samplerSteps.x, samplerSteps.y) * 2.0;\n    coords[6] = tc + vec2(0.0, samplerSteps.y) * 2.0;\n    coords[7] = tc + vec2(samplerSteps.x, samplerSteps.y) * 2.0;\n\n    vec3 colors[8];\n    for(int i = 0; i < 8; ++i)\n    {\n        colors[i] = texture2D(inputImageTexture, coords[i]).rgb;\n    }\n\n    vec4 src = texture2D(inputImageTexture, tc);\n    vec3 h = -colors[0] - 2.0 * colors[1] - colors[2] + colors[5] + 2.0 * colors[6] + colors[7];\n    vec3 v = -colors[0] + colors[2] - 2.0 * colors[3] + 2.0 * colors[4] - colors[5] + colors[7];\n    return vec4(mix(src.rgb, sqrt(h * h + v * v), 1.0), src.a);\n}\n\nvec4 maxFilter()\n{\n    vec2 samplerSteps = vec2(1.0/texelWidth, 1.0/texelHeight);\n    vec2 texCoord[13];\n    vec4 vMin;\n    vec2 thisCoord = tc;\n\n    texCoord[0] = thisCoord + vec2(0, -samplerSteps.y * 2.0);\n    texCoord[1] = thisCoord - samplerSteps;\n    texCoord[2] = thisCoord + vec2(0, -samplerSteps.y);\n    texCoord[3] = thisCoord + vec2(samplerSteps.x, -samplerSteps.y);\n    texCoord[4] = thisCoord + vec2(-samplerSteps.x * 2.0, 0.0);\n    texCoord[5] = thisCoord + vec2(-samplerSteps.x, 0.0);\n    texCoord[6] = thisCoord;\n    texCoord[7] = thisCoord + vec2(samplerSteps.x, 0.0);\n    texCoord[8] = thisCoord + vec2(samplerSteps.x * 2.0, 0.0);\n    texCoord[9] = thisCoord + vec2(-samplerSteps.x, samplerSteps.y);\n    texCoord[10] = thisCoord + vec2(0.0, samplerSteps.y);\n    texCoord[11] = thisCoord + samplerSteps;\n    texCoord[12] = thisCoord + vec2(0.0, 2.0* samplerSteps.y);\n\n\n\n    {\n        vec4 vTemp;\n\n        vMin = texture2D(inputImageTexture, texCoord[0]);\n\n        vTemp = texture2D(inputImageTexture, texCoord[1]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[2]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[3]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[4]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[5]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[6]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[7]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[8]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[9]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[10]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[11]);\n        vMin = getValue(vTemp, vMin);\n\n        vTemp = texture2D(inputImageTexture, texCoord[12]);\n        vMin = getValue(vTemp, vMin);\n    }\n    return vMin;\n}\n\nvoid main()\n{\n    //highp vec4 smoothNew;\n    highp vec3 yuv;\n    highp vec3 rgb;\n\n    vec3 centralColor = texture2D(inputImageTexture,  tc ).rgb;\n    //vec3 maxFilt = texture2D(inputImageTexture3, tc).rgb;  //canny\n    //vec3 lunkuo  = texture2D(inputImageTexture3, tc).rgb;\n\n    vec2 blurCoordinates[20];\n    vec2 imageStep = vec2(1.5/texelWidth, 1.5/texelHeight);\n\n    //重新调整了滤波的范围和权重，减少水波纹\n    blurCoordinates[0] = tc + vec2(0.0, -4.0) * imageStep;\n    blurCoordinates[1] = tc + vec2(2.0, -3.0) * imageStep;\n    blurCoordinates[2] = tc + vec2(3.0, -2.0) * imageStep;\n    blurCoordinates[3] = tc + vec2(4.0, 0.0) * imageStep;\n    blurCoordinates[4] = tc + vec2(3.0, 2.0) * imageStep;\n    blurCoordinates[5] = tc + vec2(2.0, 3.0) * imageStep;\n    blurCoordinates[6] = tc + vec2(0.0, 4.0) * imageStep;\n    blurCoordinates[7] = tc + vec2(-2.0, 3.0) * imageStep;\n    blurCoordinates[8] = tc + vec2(-3.0, 2.0) * imageStep;\n    blurCoordinates[9] = tc + vec2(-4.0, 0.0) * imageStep;\n    blurCoordinates[10] = tc + vec2(-3.0, -2.0) * imageStep;\n    blurCoordinates[11] = tc + vec2(-2.0, -3.0) * imageStep;\n\n    blurCoordinates[12] = tc + vec2(0.0, -2.0) * imageStep;\n    blurCoordinates[13] = tc + vec2(-1.0, -1.0) * imageStep;\n    blurCoordinates[14] = tc + vec2(-2.0, 0.0) * imageStep;\n    blurCoordinates[15] = tc + vec2(-1.0, 1.0) * imageStep;\n    blurCoordinates[16] = tc + vec2(0.0, 2.0) * imageStep;\n    blurCoordinates[17] = tc + vec2(1.0, 1.0) * imageStep;\n    blurCoordinates[18] = tc + vec2(2.0, 0.0) * imageStep;\n    blurCoordinates[19] = tc + vec2(1.0, -1.0) * imageStep;\n\n    //vec3 centralColor = texture2D(inputImageTexture, tc).rgb;\n    //float sampleColor = centralColor.g * 24.0;\n    vec3 sampleColor = centralColor * 24.0;\n\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[0]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[1]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[2]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[3]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[4]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[5]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[6]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[7]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[8]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[9]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[10]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[11]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[12]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[13]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[14]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[15]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[16]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[17]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[18]).rgb;\n    sampleColor += texture2D(inputImageTexture, blurCoordinates[19]).rgb;\n\n    sampleColor = sampleColor/44.0;\n\n    float dis = centralColor.g - sampleColor.g + 0.5;   //high\n\n    for (int i = 0; i < 5; i++) {\n        dis = hardLight(dis);\n    }\n\n    // 0.065 -> 1.125, 加大滤波强度\n    vec3 result = centralColor * 1.125 - dis * 0.125; //central+(central-dis)*0.065\n\n    float hue = dot(result, vec3(0.299,0.587,0.114)) - 0.3;   //luminance\n    hue = pow(clamp(hue, 0.0, 1.0), 0.3);\n\n    yuv= rgb2yuv(sampleColor);\n    float cr=yuv.y-0.094;\n    float cb=yuv.z+0.0745;\n\n    float tx = ((25.59*cr-19.19*cb)*255.0 + 51.0)*0.04;\n    float ty = ((25.59*cr+19.19*cb)*255.0 + 77.0)*0.07;\n    float val0 = tx*tx + ty*ty;\n\n    float chroma_sum=yuv.y+yuv.z+1.0;\n    float chroma_diff=yuv.y-yuv.z;\n    float chroma_diff_th = 0.1-(yuv.x/10.0);\n\n    float face = 1.0;\n    if(yuv.z>-0.1667 && yuv.z<0.0294 && chroma_sum>0.7804 && chroma_sum<1.098 && chroma_diff>chroma_diff_th){\n        if(yuv.x<0.3922) {\n            if(val0<1700.0) {\n                face = 0.0;\n            } else {\n                hue = 0.0;\n            }\n        } else {\n            if(val0<3150.0) {\n                face = 0.0;\n            } else {\n                hue = 0.0;\n            }\n        }\n    } else {\n        hue = 0.0;\n    }\n\n    result = centralColor * (1.0 - hue) + result * hue;\n    result = result+vec3(brightness*0.1);\n\n    // 这里可以进一步简化计算\n    if(showMode == 1 /*|| showMode == 2*/)\n    {\n         result = vec3(hue);\n    }\n    else if(showMode == 0)\n    {\n        result = centralColor;\n    }\n\n    vec3 smoothNew = mix(centralColor, result, smoothDegree);\n\n\n//showCounter用于显示mask\nif(showCounter == 1)\n{\n    smoothNew =vec3(face);\n}\n\n//mode3:显示边缘\nif(showMode == 3)\n{\n    vec3 maxValue = maxFilter().rgb;\n    float lumOrigin = lum(centralColor);\n    float lumMax = lum(maxValue) + 0.001;\n    float blendColor = min(lumOrigin / lumMax, 1.0);\n\n    float smoothDegree2 =  0.8 + (smoothDegree/5.0); //约束范围：0.8~1.0\n    smoothNew =mix(centralColor, vec3(blendColor), smoothDegree2);\n}\n\n//mode4:显示轮廓\nif(showMode == 4)\n{\n    vec4 src  = Sobel2();\n    // saturation合并到level中\n    max(src.r, src.g);\n    float lum = (max(max(src.r, src.g),src.b) + min(min(src.r, src.g), src.b)) / 2.0;\n    src = vec4(mix(vec3(lum), src.rgb, 0.0), src.a);  //intensity = 0.0\n\n    // level filter: colorLevel.x = dark = 0.33, colorLevel.y = light = 0.60\n    float colorLevelx = 0.3;\n    float colorLevely = 0.60;\n    //float gamma = 0.99;\n    float gamma = smoothDegree;\n    src.rgb = clamp((src.rgb - colorLevelx) / (colorLevely - colorLevelx), 0.0, 1.0);\n    src.rgb = clamp(pow(src.rgb, vec3(gamma)), 0.0, 1.0);\n    smoothNew = src.rgb;\n}\n\ngl_FragColor = vec4(smoothNew, 1.0);\n}");
        aVar.f321501b = C107478e.m145592a("attribute vec4 vPosition;attribute vec2 vTexCoord;varying vec2 tc;void main() {  gl_Position = vPosition;  tc = vTexCoord;}", "precision mediump float;\nvarying vec2 tc;\nuniform sampler2D inputImageTexture;\nvoid main() {\n    vec4 color = texture2D(inputImageTexture, tc);\n    gl_FragColor = color;\n}");
        this.f321534h = C110193b.m149776b(true, 14);
        C110192a a = C110193b.f329648a.mo161592a(14);
        this.f321536j = a;
        Log.m105925i("MicroMsg.VoipGLSProgram", "initRenderOutputFbo, texture:%s, fbo:%s", this.f321534h, a);
        C110194c b = C110193b.m149776b(true, 14);
        this.f321535i = b;
        Log.m105925i("MicroMsg.VoipGLSProgram", "init stFilterOutputTexture, texture:%s ", b);
        C107473a aVar2 = this.f321532f;
        int i2 = this.f321535i.f329652e;
        aVar2.getClass();
        Log.m105925i("MicroMsg.VoipGLSProgram", "initData, texture:%s", Integer.valueOf(i2));
        aVar2.f321502c = i2;
        aVar2.mo157886g(2, aVar2.f321518s);
        float[] fArr = aVar2.f321517r;
        float[] fArr2 = aVar2.f321518s;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        aVar2.f321509j = asFloatBuffer;
        asFloatBuffer.put(fArr);
        aVar2.f321509j.position(0);
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        aVar2.f321519t = asFloatBuffer2;
        asFloatBuffer2.put(fArr2);
        aVar2.f321519t.position(0);
        C110608g gVar = new C110608g(false);
        this.f321533g = gVar;
        gVar.mo162166g();
        this.f321533g.mo162167h(this.f321543q, this.f321544r);
        C110608g gVar2 = this.f321533g;
        int i3 = this.f321535i.f329652e;
        if (!gVar2.f330901A) {
            gVar2.f330914t = i3;
            gVar2.mo162171k();
        }
    }

    /* renamed from: a */
    public final void mo157891a() {
        GLES20.glFinish();
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glUseProgram(0);
    }

    /* renamed from: b */
    public void mo157892b(float[] fArr, float[] fArr2) {
        FloatBuffer floatBuffer = this.f321530d;
        if (floatBuffer == null || floatBuffer.capacity() != fArr.length) {
            this.f321530d = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        this.f321530d.put(fArr);
        this.f321530d.position(0);
        FloatBuffer floatBuffer2 = this.f321531e;
        if (floatBuffer2 == null || floatBuffer2.capacity() != fArr2.length) {
            this.f321531e = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        this.f321531e.put(fArr2);
        this.f321531e.position(0);
    }

    /* renamed from: c */
    public void mo157893c(float[] fArr, float[] fArr2, float[] fArr3) {
        FloatBuffer floatBuffer = this.f321545s;
        if (floatBuffer == null || floatBuffer.capacity() != fArr.length) {
            this.f321545s = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        this.f321545s.put(fArr);
        this.f321545s.position(0);
        this.f321533g.mo162174n(2, fArr2, fArr3);
        FloatBuffer floatBuffer2 = this.f321546t;
        if (floatBuffer2 == null || floatBuffer2.capacity() != fArr3.length) {
            this.f321546t = ByteBuffer.allocateDirect(fArr3.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        this.f321546t.put(fArr3);
        this.f321546t.position(0);
    }

    /* renamed from: d */
    public void mo157894d(int i, int i2, int i3, boolean z) {
        boolean z2;
        if (i == 0 || i == 1) {
            this.f321537k = false;
            this.f321539m = false;
        } else {
            this.f321537k = (i2 & 8) != 0;
            this.f321539m = (i2 & 32) != 0;
        }
        if (z && !((z2 = this.f321537k) == this.f321538l && this.f321539m == this.f321540n)) {
            this.f321538l = z2;
            boolean z3 = this.f321539m;
            this.f321540n = z3;
            if (z3 && z2) {
                C107473a aVar = this.f321532f;
                int i4 = this.f321535i.f329652e;
                aVar.getClass();
                Log.m105925i("MicroMsg.VoipGLSProgram", "set input texture:%s", Integer.valueOf(i4));
                aVar.f321502c = i4;
                C110608g gVar = this.f321533g;
                int i5 = this.f321535i.f329652e;
                if (!gVar.f330901A) {
                    gVar.f330914t = i5;
                    gVar.mo162171k();
                }
                this.f321533g.mo162175o(false);
            } else if (z3 && !z2) {
                this.f321533g.mo162175o(true);
            } else if (!z3 && z2) {
                C107473a aVar2 = this.f321532f;
                int i6 = this.f321534h.f329652e;
                aVar2.getClass();
                Log.m105925i("MicroMsg.VoipGLSProgram", "set input texture:%s", Integer.valueOf(i6));
                aVar2.f321502c = i6;
            }
        }
        boolean z4 = this.f321539m;
        if (z4 && this.f321537k) {
            this.f321534h.mo161597e(this.f321536j, this.f321543q, this.f321544r);
            mo157892b(this.f321550x, this.f321551y);
            GLES20.glViewport(0, 0, this.f321543q, this.f321544r);
            mo157895e(i);
            mo157891a();
            C110608g gVar2 = this.f321533g;
            int i7 = this.f321535i.f329652e;
            if (!gVar2.f330901A) {
                gVar2.f330914t = i7;
                gVar2.mo162171k();
            }
            int i8 = this.f321534h.f329652e;
            mo157893c(this.f321548v, this.f321549w, this.f321547u);
            this.f321533g.mo162163d(this.f321534h.f329652e, i8, i8, this.f321545s, this.f321546t);
            mo157891a();
            this.f321532f.mo157887h(this.f321548v, this.f321549w);
            this.f321532f.mo157882c();
            mo157891a();
        } else if (z4 && !this.f321537k) {
            this.f321534h.mo161597e(this.f321536j, this.f321543q, this.f321544r);
            mo157892b(this.f321550x, this.f321551y);
            GLES20.glViewport(0, 0, this.f321543q, this.f321544r);
            mo157895e(i);
            mo157891a();
            int i9 = this.f321534h.f329652e;
            mo157893c(this.f321548v, this.f321549w, this.f321547u);
            this.f321533g.mo162163d(this.f321534h.f329652e, i9, i9, this.f321545s, this.f321546t);
            mo157891a();
        } else if (z4 || !this.f321537k) {
            mo157895e(i);
        } else {
            this.f321534h.mo161597e(this.f321536j, this.f321543q, this.f321544r);
            mo157892b(this.f321550x, this.f321551y);
            GLES20.glViewport(0, 0, this.f321543q, this.f321544r);
            mo157895e(i);
            mo157891a();
            this.f321532f.mo157887h(this.f321548v, this.f321549w);
            this.f321532f.mo157882c();
            mo157891a();
        }
        mo157891a();
    }

    /* renamed from: e */
    public final void mo157895e(int i) {
        GLES20.glUseProgram(this.f321527a);
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f321527a, "vPosition");
        if (glGetAttribLocation < 0) {
            Log.m105921e("MicroMsg.VoipGLSProgram", "int mPositionHandle error: %s, reinit program", Integer.valueOf(glGetAttribLocation));
            GLES20.glDeleteProgram(this.f321527a);
            int a = C107478e.m145592a("attribute vec4 vPosition;attribute vec2 vTexCoord;varying vec2 tc;void main() {  gl_Position = vPosition;  tc = vTexCoord;}", "precision highp float;uniform sampler2D samplerY;uniform sampler2D samplerU;uniform sampler2D samplerV;uniform sampler2D samplerUV;uniform int yuvType;varying vec2 tc;void main() {  vec4 c = vec4((texture2D(samplerY, tc).r - 16./255.) * 1.164);  vec4 U; vec4 V; if (yuvType == 0 || yuvType == 1){      U = vec4(texture2D(samplerU, tc).r - 128./255.);      V = vec4(texture2D(samplerV, tc).r - 128./255.);  } else {      U = vec4(texture2D(samplerUV, tc).a - 128./255.);      V = vec4(texture2D(samplerUV, tc).r - 128./255.);  }   c += V * vec4(1.596, -0.813, 0, 0);  c += U * vec4(0, -0.392, 2.017, 0);  c.a = 1.0;  gl_FragColor = c;}");
            this.f321527a = a;
            glGetAttribLocation = GLES20.glGetAttribLocation(a, "vPosition");
        }
        int i2 = glGetAttribLocation;
        GLES20.glEnableVertexAttribArray(i2);
        GLES20.glVertexAttribPointer(i2, 2, 5126, false, 8, this.f321530d);
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f321527a, "vTexCoord");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
        GLES20.glVertexAttribPointer(glGetAttribLocation2, 2, 5126, false, 8, this.f321531e);
        int i3 = 2;
        if (i == 0 || i == 1) {
            this.f321529c[0] = GLES20.glGetUniformLocation(this.f321527a, "samplerY");
            this.f321529c[1] = GLES20.glGetUniformLocation(this.f321527a, "samplerU");
            this.f321529c[2] = GLES20.glGetUniformLocation(this.f321527a, "samplerV");
            i3 = 3;
        } else if (i == 3) {
            this.f321529c[0] = GLES20.glGetUniformLocation(this.f321527a, "samplerY");
            this.f321529c[1] = GLES20.glGetUniformLocation(this.f321527a, "samplerUV");
        } else {
            i3 = 0;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            GLES20.glActiveTexture(33984 + i4);
            GLES20.glBindTexture(3553, this.f321528b[i4].f329652e);
            GLES20.glUniform1i(this.f321529c[i4], i4);
        }
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f321527a, "yuvType");
        if (glGetUniformLocation >= 0) {
            GLES20.glUniform1i(glGetUniformLocation, i);
        }
        GLES20.glDrawArrays(5, 0, 4);
    }

    /* renamed from: f */
    public synchronized void mo157896f() {
        Log.m105925i("MicroMsg.VoipGLSProgram", "%s do destroy", Integer.valueOf(hashCode()));
        C110194c cVar = this.f321534h;
        if (cVar != null) {
            cVar.close();
        }
        C110194c cVar2 = this.f321535i;
        if (cVar2 != null) {
            cVar2.close();
        }
        for (C110194c cVar3 : this.f321528b) {
            if (cVar3 != null) {
                cVar3.close();
            }
        }
        C110192a aVar = this.f321536j;
        if (aVar != null) {
            aVar.close();
        }
        GLES20.glDeleteProgram(this.f321527a);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16640);
        GLES20.glFinish();
        FloatBuffer floatBuffer = this.f321531e;
        if (floatBuffer != null) {
            floatBuffer.clear();
        }
        FloatBuffer floatBuffer2 = this.f321530d;
        if (floatBuffer2 != null) {
            floatBuffer2.clear();
        }
        this.f321534h = null;
        this.f321535i = null;
        this.f321536j = null;
        this.f321530d = null;
        this.f321531e = null;
        this.f321527a = 0;
        C107473a aVar2 = this.f321532f;
        if (aVar2 != null) {
            aVar2.mo157884e();
        }
        C110608g gVar = this.f321533g;
        if (gVar != null) {
            gVar.mo162162c();
        }
    }

    /* renamed from: g */
    public final void mo157897g(ByteBuffer byteBuffer, int i, int i2, int i3) {
        this.f321528b[i3].mo161594a(i, i2, 6409, byteBuffer, 9729, 33071);
    }
}
