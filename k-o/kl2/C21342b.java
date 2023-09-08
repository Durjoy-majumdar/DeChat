package kl2;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.C19706a;
import com.tencent.p014mm.p136ui.base.WxImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.scanner.box.BaseBoxDialogView;
import com.tencent.p014mm.plugin.scanner.box.ScanOCRDialogBackgroundOpView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kl2.C21352g;
import kl2.C21354h;
import ll2.C21444d;
import ll2.C76702a;
import nj3.C109752f;
import nj3.C76879j;
import sk2.C101643c;
import sk2.C101644d;
import sk2.C101645e;
import sk2.C101647f;
import sk2.C101648g;
import tk2.C101903a;
import tk2.C22543c;
import vk2.C111550g;
import vk2.C111553h;
import vk2.C52943a0;
import vk2.C52949l;
import vk2.C52958x;

/* renamed from: kl2.b */
public final class C21342b implements C101903a, C21352g {

    /* renamed from: a */
    public final Context f60346a;

    /* renamed from: b */
    public final int f60347b;

    /* renamed from: c */
    public C101644d f60348c;

    /* renamed from: d */
    public View f60349d;

    /* renamed from: e */
    public View f60350e;

    /* renamed from: f */
    public long f60351f;

    /* renamed from: g */
    public boolean f60352g;

    /* renamed from: h */
    public C22543c f60353h;

    /* renamed from: i */
    public C21349c f60354i = new C21350d();

    /* renamed from: j */
    public C21351f f60355j;

    /* renamed from: k */
    public C21354h f60356k = new C21354h(this);

    /* renamed from: l */
    public C52958x f60357l;

    /* renamed from: m */
    public final C52949l f60358m = new C21344c(this);

    /* renamed from: n */
    public C111550g f60359n;

    /* renamed from: o */
    public final C21343b f60360o = new C21343b(this);

    /* renamed from: p */
    public final C19706a.C19707a f60361p = new C21346e(this);

    /* renamed from: q */
    public boolean f60362q;

    /* renamed from: r */
    public final C21345d f60363r = new C21345d(this);

    /* renamed from: kl2.b$b */
    public static final class C21343b implements C111550g.C111551a {

        /* renamed from: a */
        public final /* synthetic */ C21342b f60364a;

        public C21343b(C21342b bVar) {
            this.f60364a = bVar;
        }

        public void onClick(View view) {
            C21351f fVar;
            C21342b bVar = this.f60364a;
            if ((bVar.f60349d instanceof C19706a) && (fVar = bVar.f60355j) != null) {
                C21354h hVar = bVar.f60356k;
                C87412m.m108591d(fVar);
                hVar.mo33424c(((float) fVar.mo33417k()) / 2.0f, 0.0f);
            }
        }
    }

    /* renamed from: kl2.b$c */
    public static final class C21344c implements C52949l {

        /* renamed from: a */
        public final /* synthetic */ C21342b f60365a;

        public C21344c(C21342b bVar) {
            this.f60365a = bVar;
        }

        /* renamed from: a */
        public void mo24321a(DialogInterface dialogInterface, int i) {
            C22543c cVar = this.f60365a.f60353h;
            if (cVar != null) {
                cVar.mo35641d(dialogInterface);
            }
            C21349c cVar2 = this.f60365a.f60354i;
            if (cVar2 != null) {
                C21350d dVar = (C21350d) cVar2;
                if (!dVar.f60372b) {
                    int i2 = 5;
                    if (i != 2) {
                        i2 = i != 4 ? i != 5 ? -1 : 4 : 3;
                    }
                    if (i2 != -1) {
                        C115669n.INSTANCE.mo160131h(21699, String.valueOf(dVar.f60371a), Integer.valueOf(i2));
                    }
                }
            }
            this.f60365a.release();
        }

        public void onCancel(DialogInterface dialogInterface) {
            C22543c cVar = this.f60365a.f60353h;
            if (cVar != null) {
                cVar.mo35638a(dialogInterface);
            }
            C21342b bVar = this.f60365a;
            C21349c cVar2 = bVar.f60354i;
            bVar.release();
        }

        public void onShow(DialogInterface dialogInterface) {
            C22543c cVar = this.f60365a.f60353h;
            if (cVar != null) {
                cVar.mo35640c(dialogInterface);
            }
            C21349c cVar2 = this.f60365a.f60354i;
            if (cVar2 != null) {
                long j = ((C21350d) cVar2).f60371a;
                C115669n.INSTANCE.mo160131h(21699, String.valueOf(j), 2);
            }
        }
    }

    /* renamed from: kl2.b$d */
    public static final class C21345d implements C111553h {

        /* renamed from: a */
        public final /* synthetic */ C21342b f60366a;

        public C21345d(C21342b bVar) {
            this.f60366a = bVar;
        }

        /* renamed from: a */
        public boolean mo33400a(MotionEvent motionEvent, int i) {
            boolean z;
            C21342b bVar = this.f60366a;
            View view = bVar.f60350e;
            if (view == null) {
                return false;
            }
            if (bVar.f60362q) {
                C87412m.m108591d(view);
                z = view.dispatchTouchEvent(motionEvent);
            } else if (motionEvent == null || motionEvent.getRawY() > ((float) i)) {
                z = false;
            } else {
                View view2 = this.f60366a.f60350e;
                C87412m.m108591d(view2);
                z = view2.dispatchTouchEvent(motionEvent);
                if (z) {
                    this.f60366a.f60362q = true;
                }
            }
            if (motionEvent != null) {
                C21342b bVar2 = this.f60366a;
                int action = motionEvent.getAction() & 255;
                if (action == 1 || action == 6) {
                    bVar2.f60362q = false;
                }
            }
            return z;
        }
    }

    /* renamed from: kl2.b$e */
    public static final class C21346e implements C19706a.C19707a {

        /* renamed from: a */
        public final /* synthetic */ C21342b f60367a;

        public C21346e(C21342b bVar) {
            this.f60367a = bVar;
        }

        /* renamed from: a */
        public void mo26082a(float f, float f2) {
            Float valueOf = Float.valueOf(f);
            Float valueOf2 = Float.valueOf(f2);
            if (valueOf != null && valueOf2 != null) {
                C21354h hVar = this.f60367a.f60356k;
                float floatValue = valueOf.floatValue();
                float floatValue2 = valueOf2.floatValue();
                if (hVar.f60394b != null) {
                    if (hVar.f60396d == null) {
                        hVar.f60396d = hVar.f60393a.mo33391h();
                    }
                    int i = 1;
                    View view = hVar.f60394b;
                    C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
                    Log.m105927v("MicroMsg.ImageOCRZoomHelper", "alvinluo onScaleChanged old: %s, new: %s, targetScale: %s, scaleRate: %s, isZoomAnimating: %s", Float.valueOf(floatValue), Float.valueOf(floatValue2), Float.valueOf(hVar.f60400h.f60402b), Float.valueOf(((C19706a) view).getScaleRate()), Boolean.valueOf(hVar.mo33422a()));
                    Log.m105927v("MicroMsg.ImageOCRZoomHelper", "alvinluo onZoomScaleChanged currentScale: %s, currentZoomScale: %s, curretnZooming: %s, isZoomAnimating: %s", Float.valueOf(floatValue2), Float.valueOf(hVar.f60398f), Integer.valueOf(hVar.f60399g), Boolean.valueOf(hVar.mo33422a()));
                    float f3 = hVar.f60398f;
                    if (floatValue2 - f3 > 0.01f) {
                        hVar.f60398f = floatValue2;
                        if (hVar.f60399g != 1) {
                            hVar.f60399g = 1;
                            C21349c cVar = hVar.f60395c;
                            if (cVar != null) {
                                if (!hVar.mo33422a()) {
                                    i = 2;
                                }
                                cVar.mo33406b(i);
                            }
                        }
                    } else if (f3 - floatValue2 > 0.01f) {
                        hVar.f60398f = floatValue2;
                        if (hVar.f60399g != 2) {
                            hVar.f60399g = 2;
                            C21349c cVar2 = hVar.f60395c;
                            if (cVar2 != null) {
                                if (!hVar.mo33422a()) {
                                    i = 2;
                                }
                                cVar2.mo33405a(i);
                            }
                        }
                    } else {
                        Log.m105919d("MicroMsg.ImageOCRZoomHelper", "alvinluo onZoomScaleChanged ignore, %s, %s", Float.valueOf(floatValue2), Float.valueOf(hVar.f60398f));
                    }
                    C21354h.C21355a aVar = hVar.f60400h;
                    if (aVar.f60401a && ((double) Math.abs(aVar.f60402b - floatValue2)) <= 0.001d) {
                        hVar.f60400h.f60401a = false;
                        hVar.f60399g = 0;
                    }
                    View view2 = hVar.f60394b;
                    C87412m.m108592e(view2, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
                    float scaleRate = ((C19706a) view2).getScaleRate();
                    C21356i iVar = new C21356i(hVar);
                    C21357j jVar = new C21357j(hVar);
                    C21352g.C21353a aVar2 = hVar.f60396d;
                    C87412m.m108591d(aVar2);
                    if (aVar2.f60390a) {
                        C21352g.C21353a aVar3 = hVar.f60396d;
                        C87412m.m108591d(aVar3);
                        if (floatValue2 - aVar3.f60392c > 0.01f) {
                            iVar.invoke();
                            return;
                        }
                        C21352g.C21353a aVar4 = hVar.f60396d;
                        C87412m.m108591d(aVar4);
                        if (floatValue2 - aVar4.f60391b > 0.01f) {
                            iVar.invoke();
                        } else {
                            jVar.invoke();
                        }
                    } else if (floatValue2 - scaleRate > 0.01f) {
                        iVar.invoke();
                    } else {
                        jVar.invoke();
                    }
                }
            }
        }
    }

    /* renamed from: kl2.b$f */
    public static final class C21347f implements C101648g {

        /* renamed from: a */
        public final /* synthetic */ C21342b f60368a;

        /* renamed from: b */
        public final /* synthetic */ C101645e f60369b;

        public C21347f(C21342b bVar, C101645e eVar) {
            this.f60368a = bVar;
            this.f60369b = eVar;
        }

        /* renamed from: c */
        public final void mo33401c(long j, C101647f fVar) {
            C87412m.m108594g(fVar, "result");
            boolean z = false;
            Log.m105925i("MicroMsg.ImageGalleryImageOCRHelper", "alvinluo dealWithImageOcr onCallback session: %s, success: %b, errType: %s, errCode: %s, errMsg: %s, result: %s, reqKey: %s", Long.valueOf(j), Boolean.valueOf(fVar.f297549c), Integer.valueOf(fVar.f297550d), Integer.valueOf(fVar.f297551e), fVar.f297552f, fVar.f297558l, fVar.f297554h);
            C21342b bVar = this.f60368a;
            bVar.f60352g = true;
            if (bVar.f60354i != null) {
                Log.m105919d("MicroMsg.ImageOCRListenerImpl", "alvinluo onGetOCRResult session: %s, success: %s", Long.valueOf(fVar.f297548b), Boolean.valueOf(fVar.f297549c));
            }
            if (fVar.f297549c) {
                C21342b bVar2 = this.f60368a;
                C101645e eVar = this.f60369b;
                bVar2.getClass();
                String str = fVar.f297558l;
                if ((str == null || str.length() == 0) || fVar.f297559m) {
                    bVar2.mo33393j(4, 202);
                    return;
                }
                boolean z2 = bVar2.f60346a.getResources().getConfiguration().orientation == 2;
                float f = !z2 ? 0.7f : 1.0f;
                int i = !z2 ? 1 : 2;
                Log.m105925i("MicroMsg.ImageGalleryImageOCRHelper", "alvinluo showImageOCRResult isLandscape: %s, dialogHeightRate: %f, animationType: %s", Boolean.valueOf(z2), Float.valueOf(f), Integer.valueOf(i));
                Bundle bundle = new Bundle();
                bundle.putLong("session_id", fVar.f297548b);
                bundle.putString("req_key", fVar.f297554h);
                bundle.putInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, eVar.f297543l);
                bundle.putInt("template_type", 2);
                bundle.putFloat("fixed_dialog_height_rate", f);
                bundle.putBoolean("enable_dialog_scroll", false);
                bundle.putBoolean("enable_cancel_outside", false);
                bundle.putBoolean("show_after_webview_ready", true);
                C101644d dVar = bVar2.f60348c;
                bundle.putBoolean("enable_full_screen", dVar != null ? dVar.f297530a : true);
                C101644d dVar2 = bVar2.f60348c;
                if (dVar2 != null) {
                    z = dVar2.f297531b;
                }
                bundle.putBoolean("enable_scroll_right_close", z);
                C21351f fVar2 = bVar2.f60355j;
                if (fVar2 != null) {
                    View view = bVar2.f60350e;
                    fVar2.f60377h = view;
                    if (view != null) {
                        fVar2.f60379j = view.getMeasuredWidth();
                        fVar2.f60378i = view.getMeasuredHeight();
                    }
                    fVar2.f60376g = bVar2.f60349d;
                    fVar2.f60386t = i;
                    fVar2.f60385s = i != 1 ? i != 2 ? null : new C76702a(i) : new C21444d(fVar2.f60373d, i);
                    fVar2.f60375f = bVar2.f60348c;
                }
                C52958x b = C52943a0.m59244b(bVar2.f60346a, bundle, bVar2.f60358m);
                C21351f fVar3 = bVar2.f60355j;
                C87412m.m108591d(fVar3);
                BaseBoxDialogView baseBoxDialogView = b.f147817s;
                if (baseBoxDialogView != null) {
                    baseBoxDialogView.setBackgroundListener(fVar3);
                }
                C21345d dVar3 = bVar2.f60363r;
                C87412m.m108594g(dVar3, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                BaseBoxDialogView baseBoxDialogView2 = b.f147817s;
                if (baseBoxDialogView2 != null) {
                    baseBoxDialogView2.setBackgroundTouchListener(dVar3);
                }
                if (i == 1) {
                    Context context = b.getContext();
                    C87412m.m108593f(context, "context");
                    ScanOCRDialogBackgroundOpView scanOCRDialogBackgroundOpView = new ScanOCRDialogBackgroundOpView(context, (AttributeSet) null);
                    bVar2.f60359n = scanOCRDialogBackgroundOpView;
                    scanOCRDialogBackgroundOpView.setOpListener(bVar2.f60360o);
                    C111550g gVar = bVar2.f60359n;
                    C87412m.m108591d(gVar);
                    BaseBoxDialogView baseBoxDialogView3 = b.f147817s;
                    if (baseBoxDialogView3 != null) {
                        baseBoxDialogView3.setBackgroundOpView(gVar);
                    }
                }
                bVar2.f60357l = b;
                return;
            }
            this.f60368a.mo33393j(fVar.f297550d, fVar.f297551e);
        }
    }

    /* renamed from: kl2.b$a */
    public static final class C21348a implements GestureDetector.OnDoubleTapListener {

        /* renamed from: d */
        public final /* synthetic */ C21342b f60370d;

        public C21348a(C21342b bVar) {
            this.f60370d = bVar;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/scanner/ocr/ImageGalleryImageOCRHelper$attachImageView$1", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onDoubleTap = this.f60370d.onDoubleTap(motionEvent);
            C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/plugin/scanner/ocr/ImageGalleryImageOCRHelper$attachImageView$1", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return onDoubleTap;
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return false;
        }
    }

    public C21342b(Context context, int i) {
        C87412m.m108594g(context, "context");
        this.f60346a = context;
        this.f60347b = i;
        this.f60355j = new C21351f(context, this);
    }

    /* renamed from: a */
    public C111550g mo33384a() {
        return this.f60359n;
    }

    /* renamed from: b */
    public long mo33385b(C101645e eVar, C101644d dVar, C22543c cVar) {
        if (eVar == null) {
            return 0;
        }
        this.f60352g = false;
        this.f60348c = dVar;
        this.f60353h = cVar;
        long j = eVar.f297532a;
        this.f60351f = j;
        if (cVar != null) {
            cVar.mo35639b(j);
        }
        C21349c cVar2 = this.f60354i;
        if (cVar2 != null) {
            long j2 = this.f60351f;
            C21350d dVar2 = (C21350d) cVar2;
            dVar2.f60371a = j2;
            dVar2.f60372b = false;
            Log.m105919d("MicroMsg.ImageOCRListenerImpl", "alvinluo onStart session: %s", Long.valueOf(j2));
        }
        if (!(C86709a0.m107524d().mo123467m() == 6 || C86709a0.m107524d().mo123467m() == 4)) {
            mo33393j(3, 301);
            return 0;
        }
        C21354h hVar = this.f60356k;
        View view = this.f60349d;
        hVar.f60394b = view;
        hVar.f60395c = this.f60354i;
        if (view instanceof C19706a) {
            C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            ((C19706a) view).mo26059d();
        }
        long qe = ((C101643c) C86312j.m106911c(C101643c.class)).mo140878qe(eVar, new C21347f(this, eVar));
        this.f60351f = qe;
        Log.m105925i("MicroMsg.ImageGalleryImageOCRHelper", "alvinluo startImageOCR uploadSessionId: %s, scene: %s", Long.valueOf(qe), Integer.valueOf(this.f60347b));
        return this.f60351f;
    }

    /* renamed from: c */
    public void mo33386c(View view) {
        this.f60350e = view;
    }

    /* renamed from: d */
    public boolean mo33387d(long j) {
        boolean z;
        boolean z2;
        C21349c cVar;
        C21350d dVar;
        Log.m105925i("MicroMsg.ImageGalleryImageOCRHelper", "alvinluo cancelImageOCR sessionId: %s, uploadFinish: %s", Long.valueOf(j), Boolean.valueOf(this.f60352g));
        if (j == 0 || this.f60352g) {
            z = false;
        } else {
            ((C101643c) C86312j.m106911c(C101643c.class)).mo140880x0(j);
            z = true;
        }
        C52958x xVar = this.f60357l;
        if (xVar != null) {
            C87412m.m108591d(xVar);
            if (xVar.mo73697E()) {
                C52958x xVar2 = this.f60357l;
                C87412m.m108591d(xVar2);
                boolean isShowing = xVar2.isShowing();
                Log.m105925i("MicroMsg.ImageGalleryImageOCRHelper", "alvinluo cancelImageOCR dismiss dialog handled: %s", Boolean.valueOf(isShowing));
                C52958x xVar3 = this.f60357l;
                C87412m.m108591d(xVar3);
                xVar3.dismiss();
                z2 = isShowing;
                z = true;
                if (z && (cVar = this.f60354i) != null) {
                    dVar = (C21350d) cVar;
                    Log.m105919d("MicroMsg.ImageOCRListenerImpl", "alvinluo onCancel session: %s, isCancel: %s", Long.valueOf(j), Boolean.valueOf(dVar.f60372b));
                    if (dVar.f60371a == j && !dVar.f60372b) {
                        dVar.f60372b = true;
                        C115669n.INSTANCE.mo160131h(21699, String.valueOf(j), 1);
                    }
                }
                return z2;
            }
        }
        z2 = false;
        dVar = (C21350d) cVar;
        Log.m105919d("MicroMsg.ImageOCRListenerImpl", "alvinluo onCancel session: %s, isCancel: %s", Long.valueOf(j), Boolean.valueOf(dVar.f60372b));
        dVar.f60372b = true;
        C115669n.INSTANCE.mo160131h(21699, String.valueOf(j), 1);
        return z2;
    }

    /* renamed from: e */
    public boolean mo33388e() {
        C21351f fVar = this.f60355j;
        if (fVar == null) {
            return false;
        }
        C87412m.m108591d(fVar);
        return fVar.f60389w;
    }

    /* renamed from: f */
    public void mo33389f(boolean z) {
        View view;
        C111550g gVar = this.f60359n;
        if ((gVar instanceof View) && (view = (View) gVar) != null) {
            int i = z ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ocr/ImageGalleryImageOCRHelper", "showBackgroundOpView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/scanner/ocr/ImageGalleryImageOCRHelper", "showBackgroundOpView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: g */
    public void mo33390g(View view) {
        this.f60349d = view;
        if (view instanceof WxImageView) {
            C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.ui.base.WxImageView");
            ((WxImageView) view).setOnDoubleTapListener(new C21348a(this));
        }
        View view2 = this.f60349d;
        if (view2 instanceof C19706a) {
            C87412m.m108592e(view2, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            ((C19706a) view2).setOnZoomScaleChangedListener(this.f60361p);
        }
    }

    /* renamed from: h */
    public C21352g.C21353a mo33391h() {
        C21351f fVar = this.f60355j;
        if (fVar == null) {
            return new C21352g.C21353a();
        }
        C87412m.m108591d(fVar);
        return fVar.f60384r;
    }

    /* renamed from: i */
    public boolean mo33392i() {
        C52958x xVar = this.f60357l;
        if (xVar != null) {
            C87412m.m108591d(xVar);
            if (xVar.isShowing()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final void mo33393j(int i, int i2) {
        Log.m105920e("MicroMsg.ImageGalleryImageOCRHelper", "alvinluo onError errType: " + i + ", errCode: " + i2);
        C22543c cVar = this.f60353h;
        if (cVar != null) {
            cVar.onError(i, i2);
        }
        C21349c cVar2 = this.f60354i;
        boolean z = false;
        if (cVar2 != null) {
            C21350d dVar = (C21350d) cVar2;
            if (i2 == 202) {
                C115669n.INSTANCE.mo160131h(21699, String.valueOf(dVar.f60371a), 7);
            } else if (i == 4) {
                C115669n.INSTANCE.mo160131h(21699, String.valueOf(dVar.f60371a), 6);
            } else if (i2 == 301 || i2 == 201) {
                C115669n.INSTANCE.mo160131h(21699, String.valueOf(dVar.f60371a), 6);
            } else {
                C115669n.INSTANCE.mo160131h(21699, String.valueOf(dVar.f60371a), 99);
            }
        }
        if (C86709a0.m107524d().mo123467m() == 6 || C86709a0.m107524d().mo123467m() == 4) {
            if (i2 == 101 || i2 == 102 || i2 == 999) {
                z = true;
            }
            if (i == 4) {
                if (z) {
                    String string = this.f60346a.getString(C0966R.string.ico);
                    C87412m.m108593f(string, "context.getString(R.stri…an_image_ocr_local_error)");
                    mo33394k(string);
                    return;
                }
                String string2 = this.f60346a.getString(C0966R.string.icq);
                C87412m.m108593f(string2, "context.getString(R.stri…image_ocr_result_invalid)");
                mo33394k(string2);
            } else if (i != 3 || !z) {
                String string3 = this.f60346a.getString(C0966R.string.icp);
                C87412m.m108593f(string3, "context.getString(R.stri…image_ocr_network_failed)");
                mo33394k(string3);
            } else {
                String string4 = this.f60346a.getString(C0966R.string.ico);
                C87412m.m108593f(string4, "context.getString(R.stri…an_image_ocr_local_error)");
                mo33394k(string4);
            }
        } else {
            String string5 = this.f60346a.getString(C0966R.string.icp);
            C87412m.m108593f(string5, "context.getString(R.stri…image_ocr_network_failed)");
            mo33394k(string5);
        }
    }

    /* renamed from: k */
    public final void mo33394k(String str) {
        Context context = this.f60346a;
        C76879j.m92711E(context, str, "", context.getResources().getString(C0966R.string.f8029zr), false, (DialogInterface.OnClickListener) null);
    }

    public void onConfigurationChanged(Configuration configuration) {
        Object[] objArr = new Object[1];
        ViewGroup.LayoutParams layoutParams = null;
        objArr[0] = configuration != null ? Integer.valueOf(configuration.orientation) : null;
        Log.m105919d("MicroMsg.ImageGalleryImageOCRHelper", "alvinluo onConfigurationChanged new: %s", objArr);
        C52958x xVar = this.f60357l;
        if (xVar != null) {
            C87412m.m108591d(xVar);
            if (xVar.mo73697E()) {
                C21351f fVar = this.f60355j;
                if (fVar != null) {
                    if (configuration != null && configuration.orientation == 2) {
                        fVar.mo33420n(false);
                        int i = fVar.f60386t;
                        if (i == 1) {
                            View view = fVar.f60376g;
                            if (view instanceof C19706a) {
                                C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
                                ((C19706a) view).mo26074m();
                            }
                            fVar.mo33415i(-1, -1);
                        } else if (i == 2) {
                            fVar.mo33415i(-1, -1);
                        }
                        if (fVar.f60376g instanceof C19706a) {
                            fVar.mo33419m(true);
                            View view2 = fVar.f60376g;
                            C87412m.m108592e(view2, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
                            ((C19706a) view2).mo26059d();
                            return;
                        }
                        return;
                    }
                    if (configuration != null && configuration.orientation == 1) {
                        int i2 = fVar.f60386t;
                        if (i2 == 1) {
                            fVar.mo33421o();
                            fVar.mo33414h();
                            fVar.mo33420n(true);
                            fVar.mo33415i(fVar.mo33417k(), fVar.mo33416j());
                        } else if (i2 == 2) {
                            fVar.mo33420n(false);
                            fVar.mo33415i(-1, -1);
                        }
                        if (fVar.f60376g instanceof C19706a) {
                            fVar.mo33419m(true);
                            View view3 = fVar.f60376g;
                            C87412m.m108592e(view3, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
                            ((C19706a) view3).mo26059d();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        View view4 = this.f60350e;
        if (view4 != null) {
            ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                layoutParams = layoutParams2;
            }
            view4.setLayoutParams(layoutParams);
        }
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        C52958x xVar;
        if (!(motionEvent == null || (xVar = this.f60357l) == null)) {
            C87412m.m108591d(xVar);
            if (xVar.isShowing() && (this.f60349d instanceof C19706a)) {
                this.f60356k.mo33424c(C109752f.m149072b(motionEvent, 0), C109752f.m149073c(motionEvent, 0));
                return true;
            }
        }
        return false;
    }

    public void release() {
        C21351f fVar = this.f60355j;
        if (fVar != null) {
            fVar.f60388v = false;
        }
        C21354h hVar = this.f60356k;
        hVar.f60398f = 0.0f;
        hVar.f60397e = 0;
        hVar.f60399g = 0;
        C111550g gVar = this.f60359n;
        if (gVar != null) {
            gVar.release();
        }
        this.f60359n = null;
        this.f60357l = null;
        View view = this.f60349d;
        if (view instanceof WxImageView) {
            C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.ui.base.WxImageView");
            ((WxImageView) view).setOnDoubleTapListener((GestureDetector.OnDoubleTapListener) null);
        }
        View view2 = this.f60349d;
        if (view2 instanceof C19706a) {
            C87412m.m108592e(view2, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            ((C19706a) view2).setOnZoomScaleChangedListener((C19706a.C19707a) null);
        }
        this.f60349d = null;
        if (this.f60351f != 0) {
            ((C101643c) C86312j.m106911c(C101643c.class)).mo140880x0(this.f60351f);
            this.f60351f = 0;
        }
    }

    public void reset() {
        this.f60362q = false;
    }
}
