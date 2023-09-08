package bh2;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.os.HandlerThread;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import eu3.C58834h;
import eu3.C97749e;
import tj3.C111010h;
import w80.C111742d;

/* renamed from: bh2.c */
public class C104110c {

    /* renamed from: a */
    public SurfaceTexture f308026a;

    /* renamed from: b */
    public Surface f308027b;

    /* renamed from: c */
    public C104136w f308028c;

    /* renamed from: d */
    public C111742d.C65942b f308029d;

    /* renamed from: e */
    public HandlerThread f308030e;

    /* renamed from: f */
    public MMHandler f308031f;

    /* renamed from: bh2.c$a */
    public class C104111a implements Runnable {
        public C104111a() {
        }

        public void run() {
            C104110c cVar = C104110c.this;
            cVar.getClass();
            Log.m105924i("MicroMsg.Story.GLThread", "initGL");
            cVar.f308029d = C111742d.f334647a.mo163466j(cVar.f308027b, cVar.f308026a, 0, 0, EGL14.EGL_NO_CONTEXT);
            C104136w wVar = cVar.f308028c;
            if (wVar != null) {
                Log.m105924i("MicroMsg.Story.StoryImageVideoRender", "initGL");
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                C92259v vVar = wVar.f308128e;
                vVar.f264059d = false;
                C104109b bVar = vVar.f264057b;
                bVar.getClass();
                Log.m105924i("MicroMsg.Story.FadeImageShader", "comipleAndLinkProgram");
                int[] iArr = new int[1];
                int a = bVar.mo145759a(35633, "attribute vec4 a_position;\nattribute vec2 a_texCoords;\nattribute vec2 a_texBgCoords;\nvarying vec2 v_texCoords;\nvarying vec2 v_texBgCoords;\nuniform mat4 uMVPMatrix; \nvoid main()\n{\n  gl_Position = uMVPMatrix * a_position;\n  v_texCoords = a_texCoords;\n  v_texBgCoords = a_texBgCoords;\n}");
                int a2 = bVar.mo145759a(35632, "precision mediump float;\nuniform sampler2D u_Texture;\nuniform sampler2D u_TextureBg;\nvarying vec2 v_texCoords;\nvarying vec2 v_texBgCoords;\nuniform float u_texAlphaRatio;\nuniform vec4 centerPic; // 按top bottom left right来传\nvoid main()\n{\n    vec4 fcolor = vec4(0.0);\n    if (gl_FragCoord.y > centerPic[0] || gl_FragCoord.y < centerPic[1] || \n        gl_FragCoord.x > centerPic[3] || gl_FragCoord.x < centerPic[2]) {\n        // >top <bottom >right <left, 不是中间的图片区域，取背景色\n        fcolor = texture2D(u_TextureBg, v_texBgCoords);\n    } else {\n        fcolor = texture2D(u_Texture, v_texCoords);\n    } \n    fcolor.a *= u_texAlphaRatio;\n    gl_FragColor = fcolor;\n}");
                int glCreateProgram = GLES20.glCreateProgram();
                if (glCreateProgram != 0) {
                    GLES20.glAttachShader(glCreateProgram, a);
                    GLES20.glAttachShader(glCreateProgram, a2);
                    GLES20.glBindAttribLocation(glCreateProgram, 0, "a_position");
                    GLES20.glBindAttribLocation(glCreateProgram, 1, "a_texCoords");
                    GLES20.glBindAttribLocation(glCreateProgram, 2, "a_texBgCoords");
                    GLES20.glLinkProgram(glCreateProgram);
                    GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
                    if (iArr[0] == 0) {
                        Log.m105920e("MicroMsg.Story.FadeImageShader", "Error linking program:");
                        Log.m105920e("MicroMsg.Story.FadeImageShader", GLES20.glGetProgramInfoLog(glCreateProgram));
                        GLES20.glDeleteProgram(glCreateProgram);
                    } else {
                        bVar.f308023h = GLES20.glGetUniformLocation(glCreateProgram, "uMVPMatrix");
                        bVar.f308024i = GLES20.glGetUniformLocation(glCreateProgram, "u_texAlphaRatio");
                        bVar.f308025j = GLES20.glGetUniformLocation(glCreateProgram, "centerPic");
                        bVar.f308021f = GLES20.glGetUniformLocation(glCreateProgram, "u_Texture");
                        bVar.f308022g = GLES20.glGetUniformLocation(glCreateProgram, "u_TextureBg");
                        bVar.f308016a = glCreateProgram;
                    }
                }
                GLES20.glEnable(3042);
                GLES20.glBlendFunc(770, 771);
                C111010h hVar = vVar.f264058c;
                if (hVar != null) {
                    hVar.destroy();
                }
                vVar.f264058c = new C111010h(MMApplicationContext.getContext());
                wVar.mo145780c();
                C104135u uVar = wVar.f308129f;
                int[] iArr2 = new int[1];
                int a3 = uVar.mo145759a(35633, "attribute vec4 a_position;    \nattribute vec2 a_texCoords; \nvarying vec2 v_texCoords; \nuniform mat4 uMVPMatrix; \nvoid main()                  \n{                            \n   gl_Position = uMVPMatrix * a_position;  \n    v_texCoords = a_texCoords; \n}                            \n");
                int a4 = uVar.mo145759a(35632, "precision mediump float;\t\t\t\t\t  \nuniform sampler2D u_Texture; \nvarying vec2 v_texCoords; \nvoid main()                                  \n{                                            \n  vec4 fcolor = texture2D(u_Texture, v_texCoords) ;\n  gl_FragColor = fcolor ;\n}                                            \n");
                int glCreateProgram2 = GLES20.glCreateProgram();
                if (glCreateProgram2 != 0) {
                    GLES20.glAttachShader(glCreateProgram2, a3);
                    GLES20.glAttachShader(glCreateProgram2, a4);
                    GLES20.glBindAttribLocation(glCreateProgram2, 0, "a_position");
                    GLES20.glBindAttribLocation(glCreateProgram2, 1, "a_texCoords");
                    GLES20.glLinkProgram(glCreateProgram2);
                    GLES20.glGetProgramiv(glCreateProgram2, 35714, iArr2, 0);
                    if (iArr2[0] == 0) {
                        GLES20.glGetProgramInfoLog(glCreateProgram2);
                        GLES20.glDeleteProgram(glCreateProgram2);
                    } else {
                        uVar.f308122g = GLES20.glGetUniformLocation(glCreateProgram2, "uMVPMatrix");
                        uVar.f308121f = GLES20.glGetUniformLocation(glCreateProgram2, "u_Texture");
                        uVar.f308016a = glCreateProgram2;
                    }
                }
            }
            Log.m105924i("MicroMsg.Story.GLThread", "initGL succ");
        }
    }

    public C104110c(SurfaceTexture surfaceTexture, C104136w wVar) {
        this.f308026a = surfaceTexture;
        this.f308028c = wVar;
    }

    /* renamed from: a */
    public void mo145762a(Runnable runnable) {
        Log.m105924i("MicroMsg.Story.GLThread", "postJob");
        MMHandler mMHandler = this.f308031f;
        if (mMHandler == null) {
            Log.m105924i("MicroMsg.Story.GLThread", "postJob but handler is null");
        } else {
            mMHandler.post(runnable);
        }
    }

    /* renamed from: b */
    public void mo145763b() {
        int i = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a("CameraPreviewTextureView_renderThread" + hashCode(), -2);
        this.f308030e = a;
        a.start();
        MMHandler mMHandler = new MMHandler(this.f308030e.getLooper());
        this.f308031f = mMHandler;
        mMHandler.post(new C104111a());
    }

    public C104110c(Surface surface, C104136w wVar) {
        this.f308027b = surface;
        this.f308028c = wVar;
    }
}
