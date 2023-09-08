package qo0;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.utils.C84725c;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import dj0.C86324a;
import dj0.C86325b;
import dj0.C86326c;
import dj0.C86333i;
import dj0.C86335k;
import ej0.C58608e;
import ej0.C86525c;
import ej0.C86530d;
import ej0.C86531f;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gj0.C87227a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hj0.C87535e;
import jj0.C87971a;
import js0.C88024r;
import jy3.C88045a;
import kg3.C76577a;
import l34.C117453e;
import n34.C88900c;
import o34.C89113c;
import o34.C89114l;
import p224ra.C89909e;
import p830xc.C91165a;
import p910lj.C76701a;
import p975hd.C87476a;
import po0.C89392a;
import po0.C89402b;
import q34.C118150a;
import q34.C89451c;
import rx3.C13598b0;

/* renamed from: qo0.q */
public final class C89750q {

    /* renamed from: a */
    public final C91165a f258090a;

    /* renamed from: b */
    public final C87476a f258091b;

    /* renamed from: c */
    public final C89402b f258092c;

    /* renamed from: d */
    public int f258093d = -1;

    /* renamed from: e */
    public final C89731d0 f258094e = new C89731d0();

    /* renamed from: f */
    public C89741g f258095f;

    /* renamed from: g */
    public C89727c f258096g = ((C89727c) C89909e.m112436a(C89727c.class));

    /* renamed from: h */
    public C32224a<C13598b0> f258097h;

    /* renamed from: i */
    public int f258098i;

    /* renamed from: j */
    public boolean f258099j;

    /* renamed from: k */
    public final MTimerHandler f258100k = new MTimerHandler(new C89757f(this), false);

    /* renamed from: l */
    public C32224a<C13598b0> f258101l;

    /* renamed from: m */
    public final C89767m f258102m = new C89767m(this);

    /* renamed from: n */
    public final MTimerHandler f258103n = new MTimerHandler(new C89758g(this), true);

    /* renamed from: o */
    public boolean f258104o;

    /* renamed from: p */
    public final MTimerHandler f258105p = new MTimerHandler(new C89755e(this), true);

    /* renamed from: qo0.q$b */
    public class C89752b implements C87227a {
        public C89752b(C89750q qVar) {
        }
    }

    /* renamed from: qo0.q$c */
    public static final class C89753c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C89750q f258108d;

        public C89753c(C89750q qVar) {
            this.f258108d = qVar;
        }

        public final void run() {
            C89741g gVar = this.f258108d.f258095f;
            if (gVar == null) {
                return;
            }
            if (gVar != null) {
                gVar.mo124036e();
            } else {
                C87412m.m108603p("selectDeviceBottomSheet");
                throw null;
            }
        }
    }

    /* renamed from: qo0.q$d */
    public static final class C89754d extends C89752b {

        /* renamed from: a */
        public final /* synthetic */ C32226l<C89740f<Integer>, C13598b0> f258109a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89754d(C89750q qVar, C32226l<? super C89740f<Integer>, C13598b0> lVar) {
            super(qVar);
            this.f258109a = lVar;
        }

        /* renamed from: a */
        public void mo88410a(C87535e eVar) {
            if (eVar != null) {
                Log.m105920e("MicroMsg.VideoCast.VideoCastController", "get volume  fail" + eVar.f253592c);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
            r3 = r3.get("CurrentVolume");
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo88411b(hj0.C87535e r3) {
            /*
                r2 = this;
                java.lang.String r0 = "response"
                gy3.C87412m.m108594g(r3, r0)
                java.util.Map<java.lang.String, hj0.a> r3 = r3.f253594b
                if (r3 == 0) goto L_0x0017
                java.lang.String r0 = "CurrentVolume"
                java.lang.Object r3 = r3.get(r0)
                hj0.a r3 = (hj0.C87531a) r3
                if (r3 == 0) goto L_0x0017
                java.lang.String r3 = r3.f253586a
                goto L_0x0018
            L_0x0017:
                r3 = 0
            L_0x0018:
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                if (r0 != 0) goto L_0x0036
                qo0.f r0 = new qo0.f
                r1 = 1
                r0.<init>(r1)
                gy3.C87412m.m108591d(r3)
                int r1 = java.lang.Integer.parseInt(r3)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.f258050a = r1
                fy3.l<qo0.f<java.lang.Integer>, rx3.b0> r1 = r2.f258109a
                r1.invoke(r0)
            L_0x0036:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "get volume success : "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r0 = "MicroMsg.VideoCast.VideoCastController"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qo0.C89750q.C89754d.mo88411b(hj0.e):void");
        }
    }

    /* renamed from: qo0.q$e */
    public static final class C89755e implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C89750q f258110d;

        /* renamed from: qo0.q$e$a */
        public static final class C89756a implements C87227a {

            /* renamed from: a */
            public final /* synthetic */ C89750q f258111a;

            public C89756a(C89750q qVar) {
                this.f258111a = qVar;
            }

            /* renamed from: a */
            public void mo88410a(C87535e eVar) {
                Log.m105924i("MicroMsg.VideoCast.VideoCastController", "getMediaInfo fail");
                this.f258111a.f258104o = true;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
                r3 = (r3 = r3.f253594b).get("CurrentURI");
             */
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo88411b(hj0.C87535e r3) {
                /*
                    r2 = this;
                    qo0.q r0 = r2.f258111a
                    boolean r0 = r0.f258104o
                    if (r0 == 0) goto L_0x0007
                    return
                L_0x0007:
                    if (r3 == 0) goto L_0x001a
                    java.util.Map<java.lang.String, hj0.a> r3 = r3.f253594b
                    if (r3 == 0) goto L_0x001a
                    java.lang.String r0 = "CurrentURI"
                    java.lang.Object r3 = r3.get(r0)
                    hj0.a r3 = (hj0.C87531a) r3
                    if (r3 == 0) goto L_0x001a
                    java.lang.String r3 = r3.f253586a
                    goto L_0x001b
                L_0x001a:
                    r3 = 0
                L_0x001b:
                    java.lang.String r3 = java.lang.String.valueOf(r3)
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "getMediaInfo: currentUrl = "
                    r0.append(r1)
                    r0.append(r3)
                    java.lang.String r0 = r0.toString()
                    java.lang.String r1 = "MicroMsg.VideoCast.VideoCastController"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                    java.lang.CharSequence r0 = z04.C112550d0.m153799i0(r3)
                    java.lang.String r0 = r0.toString()
                    boolean r0 = z04.C112551y.m153811k(r0)
                    if (r0 != 0) goto L_0x007d
                    java.lang.String r0 = "null"
                    boolean r0 = gy3.C87412m.m108589b(r3, r0)
                    if (r0 == 0) goto L_0x004c
                    goto L_0x007d
                L_0x004c:
                    qo0.q r0 = r2.f258111a
                    po0.b r0 = r0.f258092c
                    java.lang.String r0 = r0.f257411f
                    boolean r3 = gy3.C87412m.m108589b(r3, r0)
                    if (r3 != 0) goto L_0x007d
                    qo0.q r3 = r2.f258111a
                    hd.a r3 = r3.f258091b
                    po0.a r3 = (po0.C89392a) r3
                    r3.getClass()
                    org.json.JSONObject r0 = r3.mo123728b()     // Catch:{ JSONException -> 0x006e }
                    po0.a$a r1 = new po0.a$a     // Catch:{ JSONException -> 0x006e }
                    r1.<init>()     // Catch:{ JSONException -> 0x006e }
                    r3.mo123727a(r1, r0)     // Catch:{ JSONException -> 0x006e }
                    goto L_0x007d
                L_0x006e:
                    r3 = move-exception
                    r0 = 1
                    java.lang.Object[] r0 = new java.lang.Object[r0]
                    r1 = 0
                    r0[r1] = r3
                    java.lang.String r3 = "MicroMsg.SameLayer.AppBrandVideoCastEventHandler"
                    java.lang.String r1 = "onXWebCastingInterrupt fail"
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r1, r0)
                L_0x007d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: qo0.C89750q.C89755e.C89756a.mo88411b(hj0.e):void");
            }
        }

        public C89755e(C89750q qVar) {
            this.f258110d = qVar;
        }

        public final boolean onTimerExpired() {
            C86525c b = this.f258110d.f258094e.mo124027b();
            C89756a aVar = new C89756a(this.f258110d);
            C86531f fVar = b.f251384c;
            if (fVar == null) {
                return true;
            }
            b.f251383b.mo121351g(new C86324a(b.mo120999a(fVar), b.f251384c.f251396a), aVar);
            return true;
        }
    }

    /* renamed from: qo0.q$f */
    public static final class C89757f implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C89750q f258112d;

        public C89757f(C89750q qVar) {
            this.f258112d = qVar;
        }

        public final boolean onTimerExpired() {
            C89750q qVar = this.f258112d;
            if (qVar.f258099j) {
                return false;
            }
            ((C89392a) qVar.f258091b).mo123731e(false);
            return true;
        }
    }

    /* renamed from: qo0.q$g */
    public static final class C89758g implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C89750q f258113d;

        public C89758g(C89750q qVar) {
            this.f258113d = qVar;
        }

        public final boolean onTimerExpired() {
            C89750q qVar = this.f258113d;
            C86525c b = qVar.f258094e.mo124027b();
            C89768r rVar = new C89768r(qVar);
            C86531f fVar = b.f251384c;
            if (fVar == null) {
                return true;
            }
            b.f251383b.mo121351g(new C86325b(b.mo120999a(fVar), b.f251384c.f251396a), rVar);
            return true;
        }
    }

    /* renamed from: qo0.q$h */
    public static final class C89759h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C89750q f258114d;

        /* renamed from: e */
        public final /* synthetic */ boolean f258115e;

        /* renamed from: f */
        public final /* synthetic */ boolean f258116f;

        /* renamed from: qo0.q$h$a */
        public static final class C89760a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C89750q f258117d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C89760a(C89750q qVar) {
                super(0);
                this.f258117d = qVar;
            }

            public Object invoke() {
                C89727c cVar = this.f258117d.f258096g;
                if (cVar != null) {
                    cVar.mo116774es(7);
                }
                String str = HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.f360885fm3) + "/mp/readtemplate?t=weapp/airplay_intro_tmpl&appid=" + C89730d.m112186a(this.f258117d.f258090a).f238147j;
                C89726b bVar = (C89726b) C89909e.m112436a(C89726b.class);
                if (bVar != null) {
                    C82381f g = this.f258117d.f258090a.mo62544g();
                    C87412m.m108593f(g, "invokeContext.component");
                    Context context = this.f258117d.f258090a.getContext();
                    C87412m.m108593f(context, "invokeContext.context");
                    bVar.mo117509V5(g, str, context);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: qo0.q$h$b */
        public static final class C89761b extends C87413o implements C32226l<Integer, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ boolean f258118d;

            /* renamed from: e */
            public final /* synthetic */ C89750q f258119e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C89761b(boolean z, C89750q qVar) {
                super(1);
                this.f258118d = z;
                this.f258119e = qVar;
            }

            public Object invoke(Object obj) {
                int intValue = ((Number) obj).intValue();
                int i = this.f258118d ? 4 : 2;
                C89727c cVar = this.f258119e.f258096g;
                if (cVar != null) {
                    cVar.Wp0(intValue, i);
                }
                this.f258119e.f258094e.f258036g.mo183371b();
                return C13598b0.f38549a;
            }
        }

        /* renamed from: qo0.q$h$c */
        public static final class C89762c extends C87413o implements C32227p<C86525c, Integer, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C89750q f258120d;

            /* renamed from: e */
            public final /* synthetic */ boolean f258121e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C89762c(C89750q qVar, boolean z) {
                super(2);
                this.f258120d = qVar;
                this.f258121e = z;
            }

            public Object invoke(Object obj, Object obj2) {
                C86525c cVar = (C86525c) obj;
                ((Number) obj2).intValue();
                if (cVar == null) {
                    ((C89392a) this.f258120d.f258091b).mo123730d(false);
                    C89741g gVar = this.f258120d.f258095f;
                    if (gVar != null) {
                        gVar.f258066v = null;
                        gVar.mo124036e();
                    } else {
                        C87412m.m108603p("selectDeviceBottomSheet");
                        throw null;
                    }
                } else {
                    ((C89392a) this.f258120d.f258091b).mo123730d(true);
                    C32224a<C13598b0> aVar = this.f258120d.f258097h;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    C89731d0 d0Var = this.f258120d.f258094e;
                    d0Var.getClass();
                    ((C88045a) d0Var.f258032c).mo122487d(d0Var, C89731d0.f258029k[0], cVar);
                    C89750q qVar = this.f258120d;
                    qVar.f258093d = 3;
                    if (this.f258121e) {
                        C88024r.m109572b(new C89776y(qVar));
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C89759h(C89750q qVar, boolean z, boolean z2) {
            this.f258114d = qVar;
            this.f258115e = z;
            this.f258116f = z2;
        }

        public final void run() {
            C89750q qVar = this.f258114d;
            Context context = qVar.f258090a.getContext();
            C87412m.m108593f(context, "invokeContext.context");
            C89750q qVar2 = this.f258114d;
            qVar.f258095f = new C89741g(context, false, qVar2.f258092c, qVar2.f258094e, this.f258115e, 2, (C8480h) null);
            C89750q qVar3 = this.f258114d;
            C89741g gVar = qVar3.f258095f;
            if (gVar != null) {
                gVar.f258068x = new C89760a(qVar3);
                C89750q qVar4 = this.f258114d;
                C89741g gVar2 = qVar4.f258095f;
                if (gVar2 != null) {
                    gVar2.f258067w = new C89761b(this.f258115e, qVar4);
                    C89750q qVar5 = this.f258114d;
                    C89741g gVar3 = qVar5.f258095f;
                    if (gVar3 != null) {
                        gVar3.f258066v = new C89762c(qVar5, this.f258116f);
                        C89741g gVar4 = this.f258114d.f258095f;
                        if (gVar4 != null) {
                            gVar4.f258060p = gVar4.mo124034c();
                            gVar4.f258061q = gVar4.mo124033b();
                            if (gVar4.f258054g != null) {
                                View view = gVar4.f258056i;
                                if (view != null) {
                                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                    C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                                    if (gVar4.f258065u) {
                                        gVar4.f258058n = (int) (((double) C74942w4.m89786c(gVar4.f258055h, C0966R.dimen.f4182vc)) * 6.5d);
                                    }
                                    layoutParams2.height = gVar4.f258058n;
                                    if (gVar4.f258060p && gVar4.f258062r != null) {
                                        Rect rect = new Rect();
                                        View view2 = gVar4.f258062r;
                                        C87412m.m108591d(view2);
                                        view2.getWindowVisibleDisplayFrame(rect);
                                        if (gVar4.f258065u) {
                                            layoutParams2.width = (int) (((((float) rect.right) * 1.0f) * ((float) 4)) / ((float) 10));
                                            if (C75044y4.m89999k(gVar4.f258055h)) {
                                                layoutParams2.height = rect.bottom - C75044y4.m89996h(gVar4.f258055h);
                                            } else {
                                                layoutParams2.height = rect.bottom;
                                            }
                                        } else {
                                            layoutParams2.width = rect.right;
                                        }
                                    }
                                    View view3 = gVar4.f258056i;
                                    if (view3 != null) {
                                        view3.setLayoutParams(layoutParams2);
                                        Dialog dialog = gVar4.f258054g;
                                        if (dialog != null) {
                                            Window window = dialog.getWindow();
                                            if (window != null) {
                                                window.addFlags(Integer.MIN_VALUE);
                                            }
                                            boolean z = false;
                                            if (C84725c.f247120e.isEnable() || !gVar4.f258064t) {
                                                Dialog dialog2 = gVar4.f258054g;
                                                if (dialog2 != null) {
                                                    Window window2 = dialog2.getWindow();
                                                    if (window2 != null) {
                                                        window2.clearFlags(8);
                                                    }
                                                    Dialog dialog3 = gVar4.f258054g;
                                                    if (dialog3 != null) {
                                                        Window window3 = dialog3.getWindow();
                                                        if (window3 != null) {
                                                            window3.clearFlags(131072);
                                                        }
                                                        Dialog dialog4 = gVar4.f258054g;
                                                        if (dialog4 != null) {
                                                            Window window4 = dialog4.getWindow();
                                                            if (window4 != null) {
                                                                window4.clearFlags(128);
                                                            }
                                                            Dialog dialog5 = gVar4.f258054g;
                                                            if (dialog5 != null) {
                                                                Window window5 = dialog5.getWindow();
                                                                View decorView = window5 != null ? window5.getDecorView() : null;
                                                                if (decorView != null) {
                                                                    decorView.setSystemUiVisibility(0);
                                                                }
                                                            } else {
                                                                C87412m.m108603p("mBottomSheetDialog");
                                                                throw null;
                                                            }
                                                        } else {
                                                            C87412m.m108603p("mBottomSheetDialog");
                                                            throw null;
                                                        }
                                                    } else {
                                                        C87412m.m108603p("mBottomSheetDialog");
                                                        throw null;
                                                    }
                                                } else {
                                                    C87412m.m108603p("mBottomSheetDialog");
                                                    throw null;
                                                }
                                            } else {
                                                Dialog dialog6 = gVar4.f258054g;
                                                if (dialog6 != null) {
                                                    Window window6 = dialog6.getWindow();
                                                    if (window6 != null) {
                                                        window6.setFlags(8, 8);
                                                    }
                                                    Dialog dialog7 = gVar4.f258054g;
                                                    if (dialog7 != null) {
                                                        Window window7 = dialog7.getWindow();
                                                        if (window7 != null) {
                                                            window7.addFlags(131200);
                                                        }
                                                        Dialog dialog8 = gVar4.f258054g;
                                                        if (dialog8 != null) {
                                                            Window window8 = dialog8.getWindow();
                                                            View decorView2 = window8 != null ? window8.getDecorView() : null;
                                                            if (decorView2 != null) {
                                                                decorView2.setSystemUiVisibility(6);
                                                            }
                                                        } else {
                                                            C87412m.m108603p("mBottomSheetDialog");
                                                            throw null;
                                                        }
                                                    } else {
                                                        C87412m.m108603p("mBottomSheetDialog");
                                                        throw null;
                                                    }
                                                } else {
                                                    C87412m.m108603p("mBottomSheetDialog");
                                                    throw null;
                                                }
                                            }
                                            BottomSheetBehavior<?> bottomSheetBehavior = gVar4.f258059o;
                                            if (bottomSheetBehavior != null) {
                                                bottomSheetBehavior.f309230p = false;
                                            }
                                            View view4 = gVar4.f258062r;
                                            if (view4 != null) {
                                                if (gVar4.f258063s == null) {
                                                    z = true;
                                                }
                                                ViewTreeObserver viewTreeObserver = view4.getViewTreeObserver();
                                                gVar4.f258063s = viewTreeObserver;
                                                if (z) {
                                                    C87412m.m108591d(viewTreeObserver);
                                                    viewTreeObserver.addOnGlobalLayoutListener(gVar4);
                                                }
                                            }
                                            Context context2 = gVar4.f258055h;
                                            if (context2 instanceof Activity) {
                                                C87412m.m108592e(context2, "null cannot be cast to non-null type android.app.Activity");
                                                if (!((Activity) context2).isFinishing()) {
                                                    Dialog dialog9 = gVar4.f258054g;
                                                    if (dialog9 != null) {
                                                        dialog9.show();
                                                    } else {
                                                        C87412m.m108603p("mBottomSheetDialog");
                                                        throw null;
                                                    }
                                                }
                                            }
                                        } else {
                                            C87412m.m108603p("mBottomSheetDialog");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("rootView");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("rootView");
                                    throw null;
                                }
                            }
                        } else {
                            C87412m.m108603p("selectDeviceBottomSheet");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("selectDeviceBottomSheet");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("selectDeviceBottomSheet");
                    throw null;
                }
            } else {
                C87412m.m108603p("selectDeviceBottomSheet");
                throw null;
            }
        }
    }

    /* renamed from: qo0.q$i */
    public static final class C89763i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C89750q f258122d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89763i(C89750q qVar) {
            super(0);
            this.f258122d = qVar;
        }

        public Object invoke() {
            MMHandlerThread.postToMainThread(new C89777z(this.f258122d));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qo0.q$j */
    public static final class C89764j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C89750q f258123d;

        public C89764j(C89750q qVar) {
            this.f258123d = qVar;
        }

        public final void run() {
            Context context = this.f258123d.f258090a.getContext();
            C87412m.m108593f(context, "invokeContext.context");
            Context context2 = this.f258123d.f258090a.getContext();
            C87412m.m108593f(context2, "invokeContext.context");
            C76701a.makeText(context, (CharSequence) C76577a.m92166q(context2, C0966R.string.f7919w5), 0).show();
        }
    }

    /* renamed from: qo0.q$k */
    public static final class C89765k extends C89752b {

        /* renamed from: a */
        public final /* synthetic */ String f258124a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89765k(C89750q qVar, String str) {
            super(qVar);
            this.f258124a = str;
        }

        /* renamed from: a */
        public void mo88410a(C87535e eVar) {
            Log.m105924i("MicroMsg.VideoCast.VideoCastController", "seek fail");
        }

        /* renamed from: b */
        public void mo88411b(C87535e eVar) {
            C87412m.m108594g(eVar, "response");
            Log.m105924i("MicroMsg.VideoCast.VideoCastController", "seek to " + this.f258124a + " success");
        }
    }

    /* renamed from: qo0.q$l */
    public static final class C89766l extends C89752b {
        public C89766l(C89750q qVar) {
            super(qVar);
        }

        /* renamed from: a */
        public void mo88410a(C87535e eVar) {
            if (eVar != null) {
                Log.m105920e("MicroMsg.VideoCast.VideoCastController", "setVolume fail:" + eVar.f253592c);
                Log.m105920e("MicroMsg.VideoCast.VideoCastController", "setVolume fail:" + eVar.f253592c);
            }
        }

        /* renamed from: b */
        public void mo88411b(C87535e eVar) {
            C87412m.m108594g(eVar, "response");
            Log.m105924i("MicroMsg.VideoCast.VideoCastController", "setVolume success");
        }
    }

    /* renamed from: qo0.q$m */
    public static final class C89767m implements C86530d {

        /* renamed from: a */
        public final /* synthetic */ C89750q f258125a;

        public C89767m(C89750q qVar) {
            this.f258125a = qVar;
        }

        /* renamed from: a */
        public void mo80108a(C86525c cVar, boolean z) {
            C87412m.m108594g(cVar, TPReportKeys.Common.COMMON_DEVICE_NAME);
            if (C87412m.m108589b(cVar, this.f258125a.f258094e.mo124027b())) {
                C89750q.m112209a(this.f258125a, new C89751a(C89724a.ACTION_MUTE, Boolean.valueOf(z)));
            }
        }

        /* renamed from: b */
        public void mo80109b(C86525c cVar) {
            C87412m.m108594g(cVar, TPReportKeys.Common.COMMON_DEVICE_NAME);
            if (C87412m.m108589b(cVar, this.f258125a.f258094e.mo124027b())) {
                C89750q.m112209a(this.f258125a, new C89751a(C89724a.ACTION_PLAYING));
            }
        }

        /* renamed from: c */
        public void mo80110c(C86525c cVar) {
            C87412m.m108594g(cVar, TPReportKeys.Common.COMMON_DEVICE_NAME);
            if (C87412m.m108589b(cVar, this.f258125a.f258094e.mo124027b())) {
                C89750q.m112209a(this.f258125a, new C89751a(C89724a.ACTION_PAUSED));
            }
        }

        /* renamed from: d */
        public void mo80111d(C86525c cVar) {
            C87412m.m108594g(cVar, TPReportKeys.Common.COMMON_DEVICE_NAME);
            if (C87412m.m108589b(cVar, this.f258125a.f258094e.mo124027b())) {
                C89750q.m112209a(this.f258125a, new C89751a(C89724a.ACTION_STOPPED));
            }
        }

        /* renamed from: e */
        public void mo80112e(C86525c cVar, int i) {
            C87412m.m108594g(cVar, TPReportKeys.Common.COMMON_DEVICE_NAME);
            if (C87412m.m108589b(cVar, this.f258125a.f258094e.mo124027b())) {
                C89750q.m112209a(this.f258125a, new C89751a(C89724a.ACTION_VOLUME, Integer.valueOf(i)));
            }
        }

        /* renamed from: f */
        public void mo80113f(C86525c cVar, int i) {
            C87412m.m108594g(cVar, TPReportKeys.Common.COMMON_DEVICE_NAME);
            if (C87412m.m108589b(cVar, this.f258125a.f258094e.mo124027b())) {
                C89750q.m112209a(this.f258125a, new C89751a(C89724a.ACTION_PROGRESS, Integer.valueOf(i)));
            }
        }
    }

    public C89750q(C91165a aVar, C87476a aVar2, C89402b bVar) {
        C87412m.m108594g(aVar, "invokeContext");
        C87412m.m108594g(aVar2, "eventHandler");
        C87412m.m108594g(bVar, "videoCastHandler");
        this.f258090a = aVar;
        this.f258091b = aVar2;
        this.f258092c = bVar;
    }

    /* renamed from: a */
    public static final void m112209a(C89750q qVar, C89751a aVar) {
        qVar.getClass();
        synchronized (C89750q.class) {
            C117453e<Object> e = C89113c.f256764d.mo182154e(C87971a.m109468a());
            C89725a0 a0Var = new C89725a0(qVar, aVar);
            e.getClass();
            C88900c.C88901a aVar2 = C88900c.f256399a;
            e.mo182153d(new C89114l(new C118150a(aVar2, aVar2, a0Var))).mo182155f(new C118150a(aVar2, C89451c.f257493d, aVar2));
        }
    }

    /* renamed from: b */
    public final void mo124045b() {
        Log.m105924i("MicroMsg.VideoCast.VideoCastController", "onDestroy");
        MMHandlerThread.postToMainThread(new C89753c(this));
        this.f258094e.mo124027b().mo121007h();
        this.f258094e.mo124027b().mo121008i();
        this.f258094e.mo124027b().f251389h = null;
        this.f258103n.stopTimer();
        this.f258094e.mo124026a();
        mo124051h();
        this.f258100k.stopTimer();
    }

    /* renamed from: c */
    public final void mo124046c(C32226l<? super C89740f<Integer>, C13598b0> lVar) {
        C87412m.m108594g(lVar, "action");
        C86525c b = this.f258094e.mo124027b();
        C89754d dVar = new C89754d(this, lVar);
        C86531f fVar = b.f251385d;
        if (fVar != null) {
            b.f251383b.mo121351g(new C86326c(b.mo120999a(fVar), b.f251385d.f251396a), dVar);
        }
    }

    /* renamed from: d */
    public final void mo124047d(int i, int i2) {
        this.f258093d = i2;
        this.f258099j = false;
        if (this.f258094e.mo124027b().f251386e.f167798a == C58608e.C58609a.Paused) {
            Log.m105924i("MicroMsg.VideoCast.VideoCastController", "play: continue");
            this.f258094e.mo124027b().mo121001c(new C89770u(this, i, i2));
            ((C89392a) this.f258091b).mo123729c();
            return;
        }
        Log.m105924i("MicroMsg.VideoCast.VideoCastController", "play: playNew");
        this.f258094e.mo124027b().mo121003e(new C89771v(this, i, i2));
        ((C89392a) this.f258091b).mo123729c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        r3 = r3.getNetworkInfo(1);
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo124048e(boolean r3, boolean r4) {
        /*
            r2 = this;
            qo0.q$h r0 = new qo0.q$h
            r0.<init>(r2, r4, r3)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            if (r4 != 0) goto L_0x000f
            qo0.d0 r3 = r2.f258094e
            r3.mo124026a()
        L_0x000f:
            qo0.d0 r3 = r2.f258094e
            qo0.q$i r4 = new qo0.q$i
            r4.<init>(r2)
            r3.f258035f = r4
            com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r4 = "connectivity"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3
            r4 = 1
            if (r3 == 0) goto L_0x0035
            android.net.NetworkInfo r3 = r3.getNetworkInfo(r4)
            if (r3 == 0) goto L_0x0035
            boolean r3 = r3.isConnected()
            goto L_0x0036
        L_0x0035:
            r3 = 0
        L_0x0036:
            if (r3 != 0) goto L_0x004c
            zt3.t r3 = zt3.C119157j.f356862d
            qo0.q$j r0 = new qo0.q$j
            r0.<init>(r2)
            zt3.j r3 = (zt3.C119157j) r3
            r3.mo183895z(r0)
            java.lang.String r3 = "MicroMsg.VideoCast.VideoCastController"
            java.lang.String r0 = "searchDevice: wifi is not connected"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
        L_0x004c:
            qo0.d0 r3 = r2.f258094e
            r3.getClass()
            java.lang.String r0 = "MicroMsg.VideoCast.VideoCastDeviceManager"
            java.lang.String r1 = "prepare"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            boolean r0 = r3.mo124029e()
            if (r0 != 0) goto L_0x0060
            goto L_0x0070
        L_0x0060:
            ej0.a r0 = ej0.C58606a.m68054a()
            qo0.d0$a r1 = r3.f258039j
            r0.mo83497b(r1)
            r3.mo124028c()
            r0 = 0
            qo0.C89731d0.m112187d(r3, r0, r4, r0)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qo0.C89750q.mo124048e(boolean, boolean):void");
    }

    /* renamed from: f */
    public final void mo124049f(String str) {
        C87412m.m108594g(str, "moment");
        C86525c b = this.f258094e.mo124027b();
        C89765k kVar = new C89765k(this, str);
        C86531f fVar = b.f251384c;
        if (fVar != null) {
            b.f251383b.mo121351g(new C86333i(b.mo120999a(fVar), b.f251384c.f251396a, str), kVar);
        }
    }

    /* renamed from: g */
    public final void mo124050g(int i) {
        Log.m105924i("MicroMsg.VideoCast.VideoCastController", "setVolume: " + i);
        C86525c b = this.f258094e.mo124027b();
        C89766l lVar = new C89766l(this);
        C86531f fVar = b.f251385d;
        if (fVar != null) {
            b.f251383b.mo121351g(new C86335k(b.mo120999a(fVar), b.f251385d.f251396a, i), lVar);
        }
    }

    /* renamed from: h */
    public final void mo124051h() {
        if (!this.f258105p.stopped()) {
            this.f258105p.stopTimer();
            this.f258104o = true;
        }
    }

    /* renamed from: qo0.q$a */
    public static final class C89751a {

        /* renamed from: a */
        public C89724a f258106a;

        /* renamed from: b */
        public Object f258107b;

        public C89751a(C89724a aVar) {
            C87412m.m108594g(aVar, "eventType");
            this.f258106a = aVar;
        }

        public C89751a(C89724a aVar, Object obj) {
            C87412m.m108594g(aVar, "eventType");
            C87412m.m108594g(obj, "obj");
            this.f258106a = aVar;
            this.f258107b = obj;
        }
    }
}
