package com.tencent.magicbrush;

import android.os.Handler;
import com.github.henryye.nativeiv.BaseImageDecodeService;
import com.github.henryye.nativeiv.ImageDecodeConfig;
import com.github.henryye.nativeiv.api.IImageDecodeService;
import com.github.henryye.nativeiv.bitmap.IBitmap;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.magicbrush.ext_texture.MBExternalTextureMgr;
import com.tencent.magicbrush.handler.glfont.IMBFontHandler;
import com.tencent.magicbrush.internal.EventDispatcher;
import com.tencent.magicbrush.p941ui.MBViewManager;
import com.tencent.magicbrush.p941ui.MagicBrushView;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import p1017od.C89154b;
import p1017od.C89157e;
import p1017od.C89162h;
import p1017od.C89163i;
import p1017od.C89166m;
import p1017od.C89167n;
import p1017od.C89201o;
import p1017od.k$$a;
import p1017od.k$$b;
import p1019p6.C89314a;
import p1027rd.C89927b;
import p1033sd.C90171a;
import p1033sd.C90172b;
import p1059wd.C90954a;
import p416qd.C89590b;
import p416qd.C89598h;
import p419td.C26307i;
import p748xd.C91170c;

/* renamed from: com.tencent.magicbrush.a */
public final class C80301a extends MBRuntime {

    /* renamed from: p */
    public static final /* synthetic */ int f235092p = 0;

    /* renamed from: i */
    public final C89167n f235093i;

    /* renamed from: j */
    public final C91170c<C80304c> f235094j = new C91170c<>();

    /* renamed from: k */
    public final C91170c<C80302a> f235095k = new C91170c<>();

    /* renamed from: l */
    public final MBViewManager f235096l = new MBViewManager();

    /* renamed from: m */
    public final MBExternalTextureMgr f235097m;

    /* renamed from: n */
    public final C89154b f235098n;

    /* renamed from: o */
    public final C80305d f235099o;

    /* renamed from: com.tencent.magicbrush.a$a */
    public interface C80302a {
        /* renamed from: b */
        void mo111581b(int i);
    }

    /* renamed from: com.tencent.magicbrush.a$b */
    public final class C80303b implements IImageDecodeService.C80188b {
        public C80303b() {
        }

        /* renamed from: a */
        public void mo109472a(String str, Object obj, IImageDecodeService.C80190c cVar, ImageDecodeConfig imageDecodeConfig) {
            C87412m.m108594g(str, "path");
            C87412m.m108594g(cVar, "recycleHandler");
            C87412m.m108594g(imageDecodeConfig, "config");
            C80301a aVar = C80301a.this;
            if (aVar.f235052a != 0) {
                C90172b bVar = aVar.f235057f;
                if (bVar != null) {
                    bVar.mo123773p(new C89162h(aVar, cVar, str, obj, imageDecodeConfig), false);
                } else if (obj != null) {
                    ((IBitmap) obj).recycle();
                }
            } else if (obj != null) {
                ((IBitmap) obj).recycle();
            }
        }

        /* renamed from: b */
        public void mo109473b(String str, IImageDecodeService.C80188b.C80189a aVar, C89314a aVar2) {
            C87412m.m108594g(str, "path");
            C87412m.m108594g(aVar, "event");
            C87412m.m108594g(aVar2, "decodeInfo");
        }
    }

    /* renamed from: com.tencent.magicbrush.a$c */
    public interface C80304c {
        /* renamed from: a */
        void mo111582a(String str, String str2, int i);

        /* renamed from: c */
        void mo111583c(String str);
    }

    /* renamed from: com.tencent.magicbrush.a$d */
    public interface C80305d {
        /* renamed from: M */
        void mo111584M(MagicBrushView magicBrushView, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4);

        /* renamed from: P */
        void mo111585P(MagicBrushView magicBrushView, int i, int i2, int i3, int i4, int i5);

        /* renamed from: W */
        void mo111586W(MagicBrushView magicBrushView, int i, int i2, int i3, int i4, int i5);

        /* renamed from: c0 */
        void mo111587c0(MagicBrushView magicBrushView);

        /* renamed from: q */
        MagicBrushView mo111588q();
    }

    public C80301a(C89166m mVar, C8480h hVar) {
        this.f235093i = mVar;
        MBExternalTextureMgr mBExternalTextureMgr = new MBExternalTextureMgr();
        mBExternalTextureMgr.mo111603b("video", new C89927b(this, "video"));
        mBExternalTextureMgr.mo111603b("camera", new C89927b(this, "camera"));
        this.f235097m = mBExternalTextureMgr;
        this.f235098n = new C89154b(this);
        MBRuntime.MBParams mBParams = mVar.f256967K;
        this.f235053b = mBParams;
        this.f235052a = nativeCreate(mBParams);
        nativeSetEventListener(this.f235052a, new EventDispatcher(this));
        C90171a aVar = mVar.f256969b;
        C87412m.m108591d(aVar);
        C89598h.m112045b("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.set_jsthread_handler ", new Object[0]);
        if (this.f235057f != null) {
            C89598h.m112044a("MicroMsg.MagicBrush.MBRuntime", "Why you set_jsthread_handler twice, unexpected behaviour.", new Object[0]);
        } else {
            this.f235057f = new C90172b(this.f235052a, aVar);
        }
        BaseImageDecodeService baseImageDecodeService = mVar.f256976i.f257000e;
        if (baseImageDecodeService != null) {
            baseImageDecodeService.addDecodeEventListener(new C80303b());
        }
        this.f235055d = baseImageDecodeService;
        nativeSetImageHandler(this.f235052a, baseImageDecodeService);
        IMBFontHandler iMBFontHandler = mVar.f256977j;
        this.f235056e = iMBFontHandler;
        nativeSetFontHandler(this.f235052a, iMBFontHandler);
        this.f235099o = mVar.f256978k;
        if (this.f235053b.enable_request_animation_frame) {
            this.f235058g = C90954a.f260997h.mo125033a(this, this.f235057f, this.f235053b.animationFrameHandlerStrategy);
        }
        if (this.f235056e == null) {
            this.f235056e = new C26307i();
            nativeSetFontHandler(this.f235052a, this.f235056e);
        }
        if (this.f235057f == null) {
            throw new IllegalStateException("[MBRuntime] JsThreadHandler not registered.");
        } else if (this.f235055d == null) {
            throw new IllegalStateException("[MBRuntime] ImageHandler not registered.");
        } else if (this.f235056e != null) {
            if (this.f235052a == 0) {
                C89598h.m112045b("MicroMsg.MagicBrush.MBRuntime", "init. mNativeInst == 0", new Object[0]);
            } else {
                mo111515k(new C89163i(this));
            }
            C32224a<C89201o> aVar2 = mVar.f256970c;
            C87412m.m108591d(aVar2);
            mo111515k(new k$$b(aVar2, this));
            nativeBindExtTextureManager(this.f235052a, mBExternalTextureMgr);
        } else {
            throw new IllegalStateException("[MBRuntime] FontHandler not registered.");
        }
    }

    /* renamed from: b */
    public C89154b mo111502b() {
        return this.f235098n;
    }

    /* renamed from: m */
    public C80305d mo111517m() {
        return this.f235099o;
    }

    /* renamed from: o */
    public MBViewManager mo111559o() {
        return this.f235096l;
    }

    /* renamed from: p */
    public void mo111578p() {
        C89598h.m112045b("MagicBrush", "MagicBrush is destroying...", new Object[0]);
        C89598h.m112045b("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.destroy", new Object[0]);
        C89157e eVar = this.f235059h;
        Handler handler = eVar.f256901d;
        if (handler != null) {
            handler.removeCallbacks(eVar.f256902e);
            eVar.f256901d = null;
        }
        if (this.f235052a == 0) {
            C89598h.m112045b("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.destroy skip outside", new Object[0]);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                if (this.f235052a == 0) {
                    C89598h.m112045b("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.destroy skip inside, lock [%d]ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                } else {
                    if (this.f235053b.enable_request_animation_frame) {
                        this.f235058g.mo125024a();
                    }
                    nativeDestroy(this.f235052a);
                    this.f235057f = null;
                    this.f235055d = null;
                    this.f235056e = null;
                    this.f235052a = 0;
                }
            }
        }
        this.f235096l.clear$lib_magicbrush_nano_release();
        this.f235094j.mo125230b();
        this.f235095k.mo125230b();
        C89598h.m112045b("MagicBrush", "MagicBrush is destroying...[done]", new Object[0]);
    }

    /* renamed from: q */
    public final void mo111579q(String str) {
        C87412m.m108594g(str, "name");
        C89598h.m112045b("MagicBrush", "hy: trigger load " + str, new Object[0]);
        C89590b.m112028b(str);
        String a = C89590b.f257788b.mo123712a(str);
        if (a != null) {
            if (!(a.length() == 0)) {
                if (C87412m.m108589b(str, "mmbox2d")) {
                    nativeLazyLoadBox2D(this.f235052a, a);
                    return;
                } else if (C87412m.m108589b(str, "mmphysx")) {
                    nativeLazyLoadPhysx(this.f235052a, a);
                    return;
                } else {
                    C89598h.m112044a("MagicBrush", "hy: not support", new Object[0]);
                    return;
                }
            }
        }
        C89598h.m112044a("MagicBrush", "hy: can not find " + str + " path", new Object[0]);
    }

    /* renamed from: r */
    public final void mo111580r(C90954a.C90956b bVar) {
        C87412m.m108594g(bVar, "strategy");
        if (this.f235058g.mo125025b() != bVar) {
            C89598h.m112045b("MagicBrush", "MagicBrush is changing AnimationFrameHandler strategy from " + this.f235058g.mo125025b() + " to " + bVar, new Object[0]);
            C90954a.C90955a aVar = C90954a.f260997h;
            C90172b bVar2 = this.f235057f;
            C87412m.m108593f(bVar2, "jsThreadHandler");
            mo111515k(new k$$a(this, aVar.mo125033a(this, bVar2, bVar)));
        }
    }
}
