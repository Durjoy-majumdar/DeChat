package com.tencent.p014mm.plugin.appbrand.jsapi.webrtc;

import a70.C112760b;
import android.graphics.Matrix;
import android.opengl.GLES20;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.tencent.p014mm.libmmwebrtc.MMGameSRBinding;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.webrtc.C83090m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import org.json.JSONObject;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.GlTextureFrameBuffer;
import org.webrtc.GlUtil;
import org.webrtc.IRenderer;
import org.webrtc.RendererCommon;
import org.webrtc.VideoFrame;
import org.webrtc.VideoFrameDrawer;
import org.webrtc.VideoSink;
import p156gj.C87203t;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.k */
public final class C83081k extends C83080j {

    /* renamed from: u */
    public static final C83082a f242843u = new C83082a((C8480h) null);

    /* renamed from: v */
    public static HashMap<Integer, Integer> f242844v = new HashMap<>();

    /* renamed from: g */
    public int f242845g;

    /* renamed from: h */
    public int f242846h;

    /* renamed from: i */
    public final C13601g f242847i = C36568h.m40985a(C83089h.f242864d);

    /* renamed from: j */
    public final C13601g f242848j = C36568h.m40985a(new C83085d(this));

    /* renamed from: n */
    public final C13601g f242849n = C36568h.m40985a(new C83084c(this));

    /* renamed from: o */
    public final C13601g f242850o = C36568h.m40985a(new C83083b(this));

    /* renamed from: p */
    public boolean f242851p;

    /* renamed from: q */
    public final C13601g f242852q = C36568h.m40985a(C83086e.f242859d);

    /* renamed from: r */
    public final C13601g f242853r = C36568h.m40985a(C83088g.f242863d);

    /* renamed from: s */
    public final float[] f242854s = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: t */
    public final GlTextureFrameBuffer f242855t = new GlTextureFrameBuffer(NativeBitmapStruct.GLFormat.GL_RGBA);

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.k$a */
    public static final class C83082a {
        public C83082a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo115331a() {
            String e = C112760b.m154227e();
            if (C87203t.m108279o()) {
                return e + "arm64-v8a/wz_720_7712_k5_crf.bin";
            }
            return e + "armeabi-v7a/wz_720_7712_k5_crf.bin";
        }

        /* renamed from: b */
        public final String mo115332b() {
            String e = C112760b.m154227e();
            if (C87203t.m108279o()) {
                return e + "arm64-v8a/libtpmonet.so";
            }
            return e + "armeabi-v7a/libtpmonet.so";
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.k$b */
    public static final class C83083b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C83081k f242856d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83083b(C83081k kVar) {
            super(0);
            this.f242856d = kVar;
        }

        public Object invoke() {
            return Boolean.valueOf(C86013q1.m106450k((String) ((C36570n) this.f242856d.f242852q).getValue()));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.k$c */
    public static final class C83084c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C83081k f242857d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83084c(C83081k kVar) {
            super(0);
            this.f242857d = kVar;
        }

        public Object invoke() {
            boolean z;
            if (C86013q1.m106450k((String) ((C36570n) this.f242857d.f242853r).getValue())) {
                System.load((String) ((C36570n) this.f242857d.f242853r).getValue());
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.k$d */
    public static final class C83085d extends C87413o implements C32224a<MMGameSRBinding> {

        /* renamed from: d */
        public final /* synthetic */ C83081k f242858d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83085d(C83081k kVar) {
            super(0);
            this.f242858d = kVar;
        }

        public Object invoke() {
            return new MMGameSRBinding((String) ((C36570n) this.f242858d.f242852q).getValue());
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.k$e */
    public static final class C83086e extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C83086e f242859d = new C83086e();

        public C83086e() {
            super(0);
        }

        public Object invoke() {
            return C83081k.f242843u.mo115331a();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.k$f */
    public static final class C83087f implements EglRenderer.OnFrameInGLEnv {

        /* renamed from: a */
        public final /* synthetic */ boolean f242860a;

        /* renamed from: b */
        public final /* synthetic */ int f242861b;

        /* renamed from: c */
        public final /* synthetic */ C83081k f242862c;

        public C83087f(boolean z, int i, C83081k kVar) {
            this.f242860a = z;
            this.f242861b = i;
            this.f242862c = kVar;
        }

        public boolean doOnDrawFrameWithEGL(EglBase eglBase, VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer, VideoFrameDrawer videoFrameDrawer, Matrix matrix) {
            C87412m.m108594g(eglBase, "eglBase");
            C87412m.m108594g(glDrawer, "drawer");
            if (!this.f242860a) {
                C83081k.f242844v.put(Integer.valueOf(this.f242861b), 0);
                return false;
            }
            if (((Boolean) ((C36570n) this.f242862c.f242849n).getValue()).booleanValue() && ((Boolean) ((C36570n) this.f242862c.f242850o).getValue()).booleanValue()) {
                if (videoFrame == null || videoFrameDrawer == null) {
                    C83082a aVar = C83081k.f242843u;
                    Log.m105924i("MicroMsg.JsApiUpdateWebRTCRendererViewWC", "johnjh jsapiwc postUpdateview | frame or framedrawer is null");
                } else {
                    C83082a aVar2 = C83081k.f242843u;
                    Log.m105924i("MicroMsg.JsApiUpdateWebRTCRendererViewWC", "johnjh jsapiwc postUpdateview | beigin set size");
                    this.f242862c.f242855t.setSize(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
                    GLES20.glBindFramebuffer(36160, this.f242862c.f242855t.getFrameBufferId());
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f242862c.f242855t.getTextureId(), 0);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(16384);
                    videoFrameDrawer.drawFrame(videoFrame, glDrawer, matrix, 0, 0, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, ((Number) ((C36570n) this.f242862c.f242847i).getValue()).intValue());
                    Log.m105924i("MicroMsg.JsApiUpdateWebRTCRendererViewWC", "johnjh jsapiwc postUpdateview | beigin run sr");
                    this.f242862c.f242845g = (videoFrame.getRotatedWidth() * 3) / 2;
                    this.f242862c.f242846h = (videoFrame.getRotatedHeight() * 3) / 2;
                    C83081k kVar = this.f242862c;
                    int i = kVar.f242845g;
                    int i2 = i % 8;
                    if (i2 != 0) {
                        kVar.f242845g = i - i2;
                    }
                    int i3 = kVar.f242846h;
                    int i4 = i3 % 8;
                    if (i4 != 0) {
                        kVar.f242846h = i3 - i4;
                    }
                    Log.m105924i("MicroMsg.JsApiUpdateWebRTCRendererViewWC", "johnjh out width : " + this.f242862c.f242845g + "height: " + this.f242862c.f242846h);
                    C83081k kVar2 = this.f242862c;
                    int textureId = this.f242862c.f242855t.getTextureId();
                    int rotatedWidth = videoFrame.getRotatedWidth();
                    int rotatedHeight = videoFrame.getRotatedHeight();
                    int intValue = ((Number) ((C36570n) this.f242862c.f242847i).getValue()).intValue();
                    C83081k kVar3 = this.f242862c;
                    kVar2.f242851p = ((MMGameSRBinding) ((C36570n) kVar2.f242848j).getValue()).mo112747a(textureId, rotatedWidth, rotatedHeight, intValue, kVar3.f242845g, kVar3.f242846h);
                    Log.m105924i("MicroMsg.JsApiUpdateWebRTCRendererViewWC", "johnjh jsapiwc postUpdateview | after runsr, return :" + this.f242862c.f242851p);
                    if (this.f242862c.f242851p) {
                        C83081k.f242844v.put(Integer.valueOf(this.f242861b), 1);
                    } else {
                        C83081k.f242844v.put(Integer.valueOf(this.f242861b), -1);
                    }
                    glDrawer.drawRgb(((Number) ((C36570n) this.f242862c.f242847i).getValue()).intValue(), this.f242862c.f242854s, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), 0, 0, eglBase.surfaceWidth(), eglBase.surfaceHeight());
                    return this.f242862c.f242851p;
                }
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.k$g */
    public static final class C83088g extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C83088g f242863d = new C83088g();

        public C83088g() {
            super(0);
        }

        public Object invoke() {
            return C83081k.f242843u.mo115332b();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.k$h */
    public static final class C83089h extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C83089h f242864d = new C83089h();

        public C83089h() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(GlUtil.generateTexture(3553));
        }
    }

    /* renamed from: G */
    public void mo115330G(C82381f fVar, VideoSink videoSink, C83090m.C83091a aVar, JSONObject jSONObject) {
        C87412m.m108594g(fVar, "appBrandComponent");
        C87412m.m108594g(videoSink, "videoSink");
        C87412m.m108594g(aVar, "videoSinkErrCode");
        super.mo115330G(fVar, videoSink, aVar, jSONObject);
        boolean z = false;
        if (jSONObject != null) {
            z = jSONObject.optBoolean("useSR", false);
        }
        int i = -1;
        if (jSONObject != null) {
            i = jSONObject.optInt("mediaStreamTrackId", -1);
        }
        if (videoSink instanceof IRenderer) {
            IRenderer iRenderer = (IRenderer) videoSink;
            if (iRenderer.getFrameWithGLCallback() == null) {
                iRenderer.setFrameWithGLCallback(new C83087f(z, i, this));
            }
        }
    }
}
