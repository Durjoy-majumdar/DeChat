package com.tencent.p014mm.plugin.sns.p104ad.widget.gllib;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.util.AttributeSet;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import zq2.C103062a;
import zq2.C103067e;
import zq2.C112668f;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer */
public class GLViewContainer extends GLSurfaceView implements C103067e {

    /* renamed from: r */
    public static final /* synthetic */ int f274388r = 0;

    /* renamed from: d */
    public Context f274389d;

    /* renamed from: e */
    public int f274390e;

    /* renamed from: f */
    public int f274391f;

    /* renamed from: g */
    public boolean f274392g = false;

    /* renamed from: h */
    public int f274393h;

    /* renamed from: i */
    public HashMap<Integer, Integer> f274394i = new HashMap<>();

    /* renamed from: j */
    public ArrayList<C103062a> f274395j = new ArrayList<>();

    /* renamed from: n */
    public boolean f274396n = true;

    /* renamed from: o */
    public final float[] f274397o = new float[16];

    /* renamed from: p */
    public final float[] f274398p = new float[16];

    /* renamed from: q */
    public final float[] f274399q = new float[16];

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$a */
    public class C94759a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C103062a f274400d;

        public C94759a(C103062a aVar) {
            this.f274400d = aVar;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$1");
            GLViewContainer.m120017a(GLViewContainer.this).add(this.f274400d);
            GLViewContainer gLViewContainer = GLViewContainer.this;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            boolean z = gLViewContainer.f274392g;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            if (z) {
                C103062a aVar = this.f274400d;
                GLViewContainer gLViewContainer2 = GLViewContainer.this;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
                int i = gLViewContainer2.f274393h;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
                aVar.mo142767d(gLViewContainer2, i);
                if (!(GLViewContainer.m120018b(GLViewContainer.this) == 0 || GLViewContainer.m120019c(GLViewContainer.this) == 0)) {
                    this.f274400d.mo142770g(GLViewContainer.m120018b(GLViewContainer.this), GLViewContainer.m120019c(GLViewContainer.this));
                }
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$b */
    public class C94760b implements GLSurfaceView.Renderer {

        /* renamed from: a */
        public Context f274402a;

        /* renamed from: b */
        public int f274403b = 0;

        /* renamed from: c */
        public long f274404c = 0;

        public C94760b(Context context) {
            this.f274402a = context;
        }

        public void onDrawFrame(GL10 gl10) {
            Bitmap bitmap;
            SnsMethodCalculate.markStartTimeMs("onDrawFrame", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$GLViewRenderer");
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(1, 771);
            Iterator it = GLViewContainer.m120017a(GLViewContainer.this).iterator();
            while (it.hasNext()) {
                C103062a aVar = (C103062a) it.next();
                GLViewContainer gLViewContainer = GLViewContainer.this;
                SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
                float[] fArr = gLViewContainer.f274397o;
                SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
                aVar.getClass();
                SnsMethodCalculate.markStartTimeMs("onDrawFrame", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                if (aVar.f304091u != 0) {
                    SnsMethodCalculate.markEndTimeMs("onDrawFrame", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                } else if (aVar.f304080j == null || aVar.f304081k == null) {
                    SnsMethodCalculate.markEndTimeMs("onDrawFrame", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                } else {
                    boolean z = aVar.f304088r;
                    if (!z) {
                        SnsMethodCalculate.markEndTimeMs("onDrawFrame", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                    } else {
                        if (z && (bitmap = aVar.f304078h) != null && aVar.f304084n == 0) {
                            aVar.f304084n = C112668f.m154045b(bitmap);
                        }
                        float[] f = aVar.mo142769f(fArr);
                        if (f == null) {
                            SnsMethodCalculate.markEndTimeMs("onDrawFrame", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                        } else {
                            GLES20.glUseProgram(aVar.f304085o);
                            int glGetAttribLocation = GLES20.glGetAttribLocation(aVar.f304085o, "aPosition");
                            aVar.f304082l = glGetAttribLocation;
                            GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                            GLES20.glVertexAttribPointer(aVar.f304082l, 3, 5126, false, 12, aVar.f304080j);
                            int glGetAttribLocation2 = GLES20.glGetAttribLocation(aVar.f304085o, "aTextureCoord");
                            aVar.f304083m = glGetAttribLocation2;
                            GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                            GLES20.glVertexAttribPointer(aVar.f304083m, 2, 5126, false, 8, aVar.f304081k);
                            GLES20.glUniformMatrix4fv(GLES20.glGetUniformLocation(aVar.f304085o, "uMVPMatrix"), 1, false, f, 0);
                            GLES20.glUniform1f(GLES20.glGetUniformLocation(aVar.f304085o, "uAlpha"), aVar.mo142768e());
                            GLES20.glActiveTexture(33984);
                            GLES20.glBindTexture(3553, aVar.f304084n);
                            GLES20.glDrawArrays(5, 0, 4);
                            GLES20.glDisableVertexAttribArray(aVar.f304082l);
                            SnsMethodCalculate.markEndTimeMs("onDrawFrame", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                        }
                    }
                }
            }
            if (this.f274403b == 0) {
                this.f274404c = System.currentTimeMillis();
            }
            int i = this.f274403b + 1;
            this.f274403b = i;
            if (i == 20) {
                long currentTimeMillis = System.currentTimeMillis() - this.f274404c;
                Log.m105924i("GLViewContainer", "FrameRate=" + ((((float) this.f274403b) * 1000.0f) / ((float) currentTimeMillis)));
                this.f274404c = 0;
                this.f274403b = 0;
            }
            SnsMethodCalculate.markEndTimeMs("onDrawFrame", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$GLViewRenderer");
        }

        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            int i3 = i;
            int i4 = i2;
            SnsMethodCalculate.markStartTimeMs("onSurfaceChanged", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$GLViewRenderer");
            Log.m105924i("GLViewContainer", "onSurfaceChanged, w=" + i3 + ", h=" + i4);
            GLES20.glViewport(0, 0, i3, i4);
            float f = ((float) i3) / ((float) i4);
            GLViewContainer gLViewContainer = GLViewContainer.this;
            int i5 = GLViewContainer.f274388r;
            SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            float[] fArr = gLViewContainer.f274398p;
            SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            Matrix.orthoM(fArr, 0, -f, f, -1.0f, 1.0f, -10.0f, 10.0f);
            GLViewContainer gLViewContainer2 = GLViewContainer.this;
            SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            float[] fArr2 = gLViewContainer2.f274399q;
            SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            Matrix.setLookAtM(fArr2, 0, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
            GLViewContainer gLViewContainer3 = GLViewContainer.this;
            SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            float[] fArr3 = gLViewContainer3.f274397o;
            SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            GLViewContainer gLViewContainer4 = GLViewContainer.this;
            SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            float[] fArr4 = gLViewContainer4.f274398p;
            SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            GLViewContainer gLViewContainer5 = GLViewContainer.this;
            SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            float[] fArr5 = gLViewContainer5.f274399q;
            SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            Matrix.multiplyMM(fArr3, 0, fArr4, 0, fArr5, 0);
            GLViewContainer gLViewContainer6 = GLViewContainer.this;
            SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            gLViewContainer6.f274390e = i3;
            SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            GLViewContainer gLViewContainer7 = GLViewContainer.this;
            SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            gLViewContainer7.f274391f = i4;
            SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            GLViewContainer.this.mo130532g(i3, i4);
            if (!(i3 == 0 || i4 == 0)) {
                Iterator it = GLViewContainer.m120017a(GLViewContainer.this).iterator();
                while (it.hasNext()) {
                    ((C103062a) it.next()).mo142770g(i3, i4);
                }
            }
            SnsMethodCalculate.markEndTimeMs("onSurfaceChanged", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$GLViewRenderer");
        }

        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            SnsMethodCalculate.markStartTimeMs("onSurfaceCreated", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$GLViewRenderer");
            Log.m105924i("GLViewContainer", "onSurfaceCreated");
            GLViewContainer gLViewContainer = GLViewContainer.this;
            SnsMethodCalculate.markStartTimeMs("loadProgram", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLProgramLoader");
            long currentTimeMillis = System.currentTimeMillis();
            SnsMethodCalculate.markStartTimeMs("loadShader", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
            int glCreateShader = GLES20.glCreateShader(35633);
            GLES20.glShaderSource(glCreateShader, "attribute vec4 aPosition;attribute vec2 aTextureCoord;uniform mat4 uMVPMatrix;varying vec2 vTextureCoord;void main(){gl_Position = uMVPMatrix * aPosition;\nvTextureCoord = aTextureCoord;\n}");
            GLES20.glCompileShader(glCreateShader);
            SnsMethodCalculate.markEndTimeMs("loadShader", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
            SnsMethodCalculate.markStartTimeMs("loadShader", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
            int glCreateShader2 = GLES20.glCreateShader(35632);
            GLES20.glShaderSource(glCreateShader2, "precision lowp float;varying vec2 vTextureCoord;uniform float uAlpha;uniform sampler2D uTexture;void main() {gl_FragColor = texture2D(uTexture, vTextureCoord);float alpha = uAlpha;gl_FragColor.a = gl_FragColor.a * alpha;gl_FragColor.r = gl_FragColor.r * alpha;gl_FragColor.g = gl_FragColor.g * alpha;gl_FragColor.b = gl_FragColor.b * alpha;}");
            GLES20.glCompileShader(glCreateShader2);
            SnsMethodCalculate.markEndTimeMs("loadShader", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
            int glCreateProgram = GLES20.glCreateProgram();
            GLES20.glAttachShader(glCreateProgram, glCreateShader);
            GLES20.glAttachShader(glCreateProgram, glCreateShader2);
            GLES20.glLinkProgram(glCreateProgram);
            long currentTimeMillis2 = System.currentTimeMillis();
            Log.m105924i("GLProgramLoader", "loadProgram, cost=" + (currentTimeMillis2 - currentTimeMillis) + ", progrom=" + glCreateProgram);
            SnsMethodCalculate.markEndTimeMs("loadProgram", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLProgramLoader");
            int i = GLViewContainer.f274388r;
            SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            gLViewContainer.f274393h = glCreateProgram;
            SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            GLViewContainer gLViewContainer2 = GLViewContainer.this;
            SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            HashMap<Integer, Integer> hashMap = gLViewContainer2.f274394i;
            SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            hashMap.clear();
            GLViewContainer gLViewContainer3 = GLViewContainer.this;
            SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            gLViewContainer3.f274392g = true;
            SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
            Iterator it = GLViewContainer.m120017a(GLViewContainer.this).iterator();
            while (it.hasNext()) {
                GLViewContainer gLViewContainer4 = GLViewContainer.this;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
                int i2 = gLViewContainer4.f274393h;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
                ((C103062a) it.next()).mo142767d(gLViewContainer4, i2);
            }
            SnsMethodCalculate.markEndTimeMs("onSurfaceCreated", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer$GLViewRenderer");
        }
    }

    public GLViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f274389d = context;
        setEGLContextClientVersion(2);
        if (this.f274396n) {
            setZOrderOnTop(true);
            setEGLConfigChooser(8, 8, 8, 8, 16, 0);
            getHolder().setFormat(1);
        }
        setRenderer(new C94760b(context));
        setRenderMode(0);
    }

    /* renamed from: a */
    public static /* synthetic */ ArrayList m120017a(GLViewContainer gLViewContainer) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        ArrayList<C103062a> arrayList = gLViewContainer.f274395j;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        return arrayList;
    }

    /* renamed from: b */
    public static /* synthetic */ int m120018b(GLViewContainer gLViewContainer) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        int i = gLViewContainer.f274390e;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        return i;
    }

    /* renamed from: c */
    public static /* synthetic */ int m120019c(GLViewContainer gLViewContainer) {
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        int i = gLViewContainer.f274391f;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        return i;
    }

    /* renamed from: d */
    public void mo130529d(C103062a aVar) {
        SnsMethodCalculate.markStartTimeMs("addView", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        queueEvent(new C94759a(aVar));
        SnsMethodCalculate.markEndTimeMs("addView", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
    }

    /* renamed from: e */
    public C103062a mo130530e(int i) {
        SnsMethodCalculate.markStartTimeMs("getChildAt", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        if (i < 0 || i >= getChildCount()) {
            SnsMethodCalculate.markEndTimeMs("getChildAt", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
            return null;
        }
        C103062a aVar = this.f274395j.get(i);
        SnsMethodCalculate.markEndTimeMs("getChildAt", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        return aVar;
    }

    /* renamed from: f */
    public int mo130531f(Bitmap bitmap) {
        SnsMethodCalculate.markStartTimeMs("getTextureId", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        int i = -1;
        if (bitmap != null) {
            int hashCode = bitmap.hashCode();
            if (this.f274394i.containsKey(Integer.valueOf(hashCode))) {
                i = this.f274394i.get(Integer.valueOf(hashCode)).intValue();
            }
            if (i <= 0 && (i = C112668f.m154045b(bitmap)) > 0) {
                this.f274394i.put(Integer.valueOf(hashCode), Integer.valueOf(i));
            }
        }
        SnsMethodCalculate.markEndTimeMs("getTextureId", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        return i;
    }

    /* renamed from: g */
    public void mo130532g(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("glOnSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        SnsMethodCalculate.markEndTimeMs("glOnSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
    }

    public int getChildCount() {
        SnsMethodCalculate.markStartTimeMs("getChildCount", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        int size = this.f274395j.size();
        SnsMethodCalculate.markEndTimeMs("getChildCount", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        return size;
    }

    public Rect getGlobalVisibleRect() {
        SnsMethodCalculate.markStartTimeMs("getGlobalVisibleRect", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        Rect rect = new Rect();
        getGlobalVisibleRect(rect);
        SnsMethodCalculate.markEndTimeMs("getGlobalVisibleRect", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        return rect;
    }

    public void invalidate() {
        SnsMethodCalculate.markStartTimeMs("invalidate", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
        requestRender();
        SnsMethodCalculate.markEndTimeMs("invalidate", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
    }
}
