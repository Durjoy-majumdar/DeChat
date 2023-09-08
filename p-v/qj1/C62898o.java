package qj1;

import a14.C0000n0;
import a14.C53934p0;
import ak1.C54066f;
import ak1.C54067f0;
import ak1.C54116w;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.C0120a0;
import bl3.C39818r;
import cl1.C0680q1;
import cl1.C54951d;
import cl1.C54991o;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import eb0.C31543z5;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import k60.C60979d;
import kotlin.ResultKt;
import nk1.C11207i;
import ok1.C62042e;
import org.json.JSONObject;
import ph1.C62293i;
import ph1.C62297m;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C50516na1;
import te3.C51665v91;
import te3.C51803w91;
import up1.C27696y;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

/* renamed from: qj1.o */
public final class C62898o extends C62660c {

    /* renamed from: p */
    public final ViewGroup f178495p;

    /* renamed from: q */
    public final C58124b f178496q;

    /* renamed from: r */
    public long f178497r = -1;

    /* renamed from: s */
    public FrameLayout f178498s;

    /* renamed from: t */
    public C54066f f178499t;

    /* renamed from: u */
    public C32224a<C13598b0> f178500u;

    /* renamed from: v */
    public final C32227p<Integer, Integer, C13598b0> f178501v;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveAdVideoPlugin$statusChange$1", mo125469f = "FinderLiveAdVideoPlugin.kt", mo125470l = {177}, mo125471m = "invokeSuspend")
    /* renamed from: qj1.o$e */
    public static final class C12564e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f36060d;

        /* renamed from: e */
        public final /* synthetic */ C62898o f36061e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12564e(C62898o oVar, C15601d<? super C12564e> dVar) {
            super(2, dVar);
            this.f36061e = oVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C12564e(this.f36061e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C12564e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f36060d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f36060d = 1;
                if (((C0680q1) this.f36061e.mo87696x0(C0680q1.class)).mo644c3(this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveAdVideoPlugin$statusChange$2", mo125469f = "FinderLiveAdVideoPlugin.kt", mo125470l = {186}, mo125471m = "invokeSuspend")
    /* renamed from: qj1.o$f */
    public static final class C12565f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f36062d;

        /* renamed from: e */
        public final /* synthetic */ C62898o f36063e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12565f(C62898o oVar, C15601d<? super C12565f> dVar) {
            super(2, dVar);
            this.f36063e = oVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C12565f(this.f36063e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C12565f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f36062d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f36062d = 1;
                if (((C0680q1) this.f36063e.mo87696x0(C0680q1.class)).mo644c3(this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.o$a */
    public static final class C62899a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62898o f178502d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f178503e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62899a(C62898o oVar, C32224a<C13598b0> aVar) {
            super(0);
            this.f178502d = oVar;
            this.f178503e = aVar;
        }

        public Object invoke() {
            C54951d.C54953c b1 = this.f178502d.mo87843b1();
            ViewGroup viewGroup = null;
            ViewParent parent = b1 != null ? b1.getParent() : null;
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            }
            if (viewGroup != null) {
                viewGroup.removeView(this.f178502d.mo87843b1());
            }
            C54951d.C54953c b15 = this.f178502d.mo87843b1();
            if (b15 != null) {
                b15.setOnVideoSizeChange(this.f178502d.f178501v);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            C62898o oVar = this.f178502d;
            oVar.f178498s.addView(oVar.mo87843b1(), layoutParams);
            this.f178502d.f178498s.requestLayout();
            this.f178503e.invoke();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.o$b */
    public static final class C62900b<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C62898o f178504d;

        /* renamed from: qj1.o$b$a */
        public /* synthetic */ class C62901a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f178505a;

            static {
                int[] iArr = new int[C54951d.C54952a.values().length];
                iArr[4] = 1;
                iArr[2] = 2;
                iArr[1] = 3;
                iArr[3] = 4;
                f178505a = iArr;
            }
        }

        public C62900b(C62898o oVar) {
            this.f178504d = oVar;
        }

        public void onChanged(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            C54951d.C54952a aVar = (C54951d.C54952a) obj;
            String str8 = ((C54951d) this.f178504d.mo87696x0(C54951d.class)).f154006n;
            Log.m105924i("FinderLiveAdVideoPlugin", "liveAdId:" + str8 + " onVideoPlayStateChange: " + aVar);
            int i = aVar == null ? -1 : C62901a.f178505a[aVar.ordinal()];
            if (i == 1) {
                this.f178504d.f178499t.mo74750a(str8);
            } else if (i == 2) {
                C54066f fVar = this.f178504d.f178499t;
                fVar.getClass();
                C54067f0.C54076o0 o0Var = C54067f0.C54076o0.LIVE_AD_VIDEO;
                Class cls = C54116w.class;
                C87412m.m108594g(str8, "adVideoId");
                if (TextUtils.isEmpty(str8)) {
                    Log.m105924i("FinderAdVideoReporter", "reportStartupVideoExit return for adVideoId:" + str8);
                } else if (fVar.f151417a == 0) {
                    Log.m105924i("FinderAdVideoReporter", "reportStartupVideoExit return for startupVideoEnter:" + fVar.f151417a);
                } else {
                    if (TextUtils.isEmpty(str8)) {
                        Log.m105924i("FinderAdVideoReporter", "reportStartupVideoEnterInternal return for adVideoId:" + str8);
                        str7 = "type";
                        str6 = "advertise_id";
                        str4 = "advertise_type";
                        str = ",";
                        str3 = "json.toString()";
                        str2 = ";";
                        str5 = "getService(HellLiveVisitorReoprter::class.java)";
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("type", 1);
                        jSONObject.put("advertise_id", str8);
                        jSONObject.put("advertise_type", 1);
                        String jSONObject2 = jSONObject.toString();
                        C87412m.m108593f(jSONObject2, "json.toString()");
                        String n = C112551y.m153814n(jSONObject2, ",", ";", false);
                        Log.m105924i("FinderAdVideoReporter", "reportStartupVideoEnterInternal json: " + jSONObject);
                        C7335d c = C86312j.m106911c(cls);
                        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                        str7 = "type";
                        C54116w wVar = (C54116w) c;
                        str6 = "advertise_id";
                        str4 = "advertise_type";
                        str3 = "json.toString()";
                        str2 = ";";
                        str5 = "getService(HellLiveVisitorReoprter::class.java)";
                        str = ",";
                        C54116w.Ex0(wVar, o0Var, n, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
                    }
                    fVar.f151417a = 0;
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(str7, 2);
                    jSONObject3.put(str6, str8);
                    jSONObject3.put(str4, 1);
                    jSONObject3.put("watch_duration", C31543z5.m39453c() - fVar.f151417a);
                    String jSONObject4 = jSONObject3.toString();
                    C87412m.m108593f(jSONObject4, str3);
                    String n2 = C112551y.m153814n(jSONObject4, str, str2, false);
                    Log.m105924i("FinderAdVideoReporter", "reportStartupVideoExit json: " + jSONObject3);
                    C7335d c2 = C86312j.m106911c(cls);
                    C87412m.m108593f(c2, str5);
                    C54116w.Ex0((C54116w) c2, o0Var, n2, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
                }
                C62898o oVar = this.f178504d;
                C11207i.m11072h(oVar, (C66212f) null, (C53934p0) null, new C12591p(oVar, (C15601d<? super C12591p>) null), 3, (Object) null);
            } else if (i == 3) {
                C54066f fVar2 = this.f178504d.f178499t;
                fVar2.getClass();
                C87412m.m108594g(str8, "adVideoId");
                if (TextUtils.isEmpty(str8)) {
                    Log.m105924i("FinderAdVideoReporter", "reportStartupVideoEnter return for adVideoId:" + str8);
                    return;
                }
                fVar2.f151417a = C31543z5.m39453c();
            } else if (i == 4) {
                this.f178504d.f178499t.mo74750a(str8);
            }
        }
    }

    /* renamed from: qj1.o$c */
    public static final class C62902c<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C62898o f178506d;

        public C62902c(C62898o oVar) {
            this.f178506d = oVar;
        }

        public void onChanged(Object obj) {
            Log.m105924i("FinderLiveAdVideoPlugin", "liveToNormalMode : " + ((Integer) obj));
            this.f178506d.mo87841Z0();
        }
    }

    /* renamed from: qj1.o$d */
    public static final class C62903d extends C87413o implements C32227p<Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62898o f178507d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62903d(C62898o oVar) {
            super(2);
            this.f178507d = oVar;
        }

        public Object invoke(Object obj, Object obj2) {
            int i;
            int i2;
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            Class cls = C54991o.class;
            Class cls2 = C54951d.class;
            C54951d dVar = (C54951d) this.f178507d.mo87696x0(cls2);
            ((C54951d) this.f178507d.mo87696x0(cls2)).f154009q = intValue;
            ((C54951d) this.f178507d.mo87696x0(cls2)).f154010r = intValue2;
            C62042e eVar = C62042e.f176370a;
            Context context = this.f178507d.f178495p.getContext();
            C87412m.m108593f(context, "rootView.context");
            int i3 = ((C54991o) this.f178507d.mo87696x0(cls)).f154335l1;
            int i4 = ((C54991o) this.f178507d.mo87696x0(cls)).f154338m1;
            eVar.getClass();
            int i5 = C75044y4.m89990b(context).x;
            int i6 = C75044y4.m89990b(context).y;
            Rect rect = new Rect(0, 0, i5, i6);
            if (intValue2 <= 0 || intValue <= 0) {
                Log.m105920e("FinderLiveUtil", "getTargetLiveViewRect video size = 0");
            } else {
                int i7 = context.getResources().getConfiguration().orientation;
                boolean e1 = eVar.mo87075e1(intValue, intValue2);
                if (e1 && 1 == i7) {
                    i = (int) (((float) i5) * ((((float) intValue2) * 1.0f) / ((float) intValue)));
                    if (((float) i) <= ((float) i6) * 0.68799996f) {
                        i2 = eVar.mo87089j0(i3, i4);
                        rect.left = 0;
                        rect.top = i2;
                        rect.right = i5;
                        rect.bottom = i + i2;
                        Log.m105924i("FinderLiveUtil", "getTargetLiveViewRect fitLandscapeVideo:" + e1 + ",curOrientation:" + i7 + " screenSize:" + i5 + " x " + i6 + " targetRect:" + rect);
                    }
                }
                i = i6;
                i2 = 0;
                rect.left = 0;
                rect.top = i2;
                rect.right = i5;
                rect.bottom = i + i2;
                Log.m105924i("FinderLiveUtil", "getTargetLiveViewRect fitLandscapeVideo:" + e1 + ",curOrientation:" + i7 + " screenSize:" + i5 + " x " + i6 + " targetRect:" + rect);
            }
            if (eVar.mo87075e1(intValue, intValue2)) {
                C54951d.C54953c b1 = this.f178507d.mo87843b1();
                if (b1 != null) {
                    b1.setScaleType(1);
                }
            } else {
                C54951d.C54953c b15 = this.f178507d.mo87843b1();
                if (b15 != null) {
                    b15.setScaleType(0);
                }
            }
            Log.m105924i("FinderLiveAdVideoPlugin", "onVideoSizeChange [" + intValue + " x " + intValue2 + "] targetRect:" + rect);
            ViewGroup.LayoutParams layoutParams = this.f178507d.f178498s.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = rect.width();
            layoutParams2.height = rect.height();
            layoutParams2.topMargin = rect.top;
            this.f178507d.f178498s.requestLayout();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62898o(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "rootView");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178495p = viewGroup;
        this.f178496q = bVar;
        this.f178498s = (FrameLayout) viewGroup.findViewById(C0966R.C0970id.nfv);
        this.f178499t = new C54066f();
        C54951d dVar = (C54951d) mo87696x0(C54951d.class);
        Log.m105924i("LiveAdVideoSlice", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        mo10792g(8);
        this.f178501v = new C62903d(this);
    }

    /* renamed from: c1 */
    public static void m74037c1(C62898o oVar, String str, boolean z, int i, Object obj) {
        C63170ze zeVar;
        C54951d.C54952a aVar = C54951d.C54952a.LIVING_VIDEO_COMPLETE;
        oVar.mo87847g1(aVar);
        Log.m105928w("FinderLiveAdVideoPlugin", "loadStartupVideo come complete.");
        oVar.mo10792g(8);
        C54951d dVar = (C54951d) oVar.mo87696x0(C54951d.class);
        C54951d.C54952a value = dVar.f154007o.getValue();
        if (value == C54951d.C54952a.LIVING_VIDEO_PLAYING || value == aVar) {
            Log.m105924i("LiveAdVideoSlice", "stopLivingVideoPlayer state:" + value);
            dVar.mo75872i3();
        } else {
            Log.m105928w("LiveAdVideoSlice", "stopLivingVideoPlayer return for invalid state:" + value);
        }
        oVar.f178498s.removeAllViews();
        C63064w wVar = (C63064w) oVar.mo87687E0(C63064w.class);
        if (wVar != null) {
            Log.m105924i("FinderLiveAdVideoTimerPlugin", "hideProgressTimerTv");
            wVar.f178968r.setVisibility(8);
            if (wVar.f178969s.getVisibility() == 8) {
                wVar.mo10792g(8);
            }
        }
        if (!FinderLiveService.f159376d.mo77644r() && (zeVar = (C63170ze) oVar.mo87687E0(C63170ze.class)) != null) {
            zeVar.mo88094f1(false);
        }
        oVar.f178498s.setOnTouchListener((View.OnTouchListener) null);
    }

    /* renamed from: Z0 */
    public final boolean mo87841Z0() {
        Class cls = C54951d.class;
        if (mo87842a1() != C54951d.C54952a.LIVING_VIDEO_PLAYING) {
            Log.m105928w("FinderLiveAdVideoPlugin", "checkResumeVideoView return for state:" + mo87842a1());
            return false;
        }
        C54951d.C54953c cVar = ((C54951d) mo87696x0(cls)).f154008p;
        if (cVar == null) {
            return false;
        }
        Class cls2 = C63064w.class;
        Log.m105924i("FinderLiveAdVideoPlugin", "reUsePlayerView view" + cVar);
        ViewParent parent = cVar.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            Log.m105924i("FinderLiveAdVideoPlugin", "reUsePlayerView remove view:" + cVar);
            viewGroup.removeAllViews();
        }
        cVar.setOnVideoSizeChange(this.f178501v);
        cVar.setOnProgressChange(new C62929q(this));
        cVar.setOnFirstFrameRendered(new C62946r(this));
        cVar.setOnVideoError(new C62967s(this));
        cVar.setOnVideoComplete(new C62985t(this));
        mo10792g(0);
        this.f178498s.addView(cVar, new FrameLayout.LayoutParams(-1, -1));
        this.f178498s.requestLayout();
        ((C62903d) this.f178501v).invoke(Integer.valueOf(((C54951d) mo87696x0(cls)).f154009q), Integer.valueOf(((C54951d) mo87696x0(cls)).f154010r));
        C63064w wVar = (C63064w) mo87687E0(cls2);
        if (wVar != null) {
            ValueAnimator valueAnimator = wVar.f178973w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            wVar.mo88000Z0();
        }
        C63064w wVar2 = (C63064w) mo87687E0(cls2);
        if (wVar2 != null) {
            ValueAnimator valueAnimator2 = wVar2.f178973w;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            wVar2.mo88000Z0();
        }
        return true;
    }

    /* renamed from: a1 */
    public final C54951d.C54952a mo87842a1() {
        C54951d.C54952a value = ((C54951d) mo87696x0(C54951d.class)).f154007o.getValue();
        return value == null ? C54951d.C54952a.IDLE : value;
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: b1 */
    public final C54951d.C54953c mo87843b1() {
        C54951d.C54953c cVar = ((C54951d) mo87696x0(C54951d.class)).f154008p;
        if (cVar instanceof C54951d.C54953c) {
            return cVar;
        }
        return null;
    }

    /* renamed from: d1 */
    public final void mo87844d1(String str, boolean z) {
        C63170ze zeVar = (C63170ze) mo87687E0(C63170ze.class);
        if (zeVar != null) {
            zeVar.mo88094f1(false);
        }
        C54951d.C54952a aVar = C54951d.C54952a.STARTUP_VIDEO_COMPLETE;
        mo87847g1(aVar);
        C32224a<C13598b0> aVar2 = this.f178500u;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        this.f178500u = null;
        mo10792g(8);
        C62297m e = C62293i.f177081a.mo87360e(mo87686C0().f151977d.f157075s);
        if (e != null) {
            e.mo84322g();
        }
        C54951d dVar = (C54951d) mo87696x0(C54951d.class);
        C54951d.C54952a value = dVar.f154007o.getValue();
        if (value == C54951d.C54952a.STARTUP_VIDEO_PLAYING || value == C54951d.C54952a.STARTUP_VIDEO_PLAYING_FIRST_FRAME || value == aVar) {
            Log.m105924i("LiveAdVideoSlice", "stopStartupVideoPlayer state:" + value);
            dVar.mo75872i3();
        } else {
            Log.m105928w("LiveAdVideoSlice", "stopStartupVideoPlayer return for invalid state:" + value);
        }
        this.f178498s.removeAllViews();
        this.f178498s.setOnTouchListener((View.OnTouchListener) null);
    }

    /* renamed from: e1 */
    public final void mo87845e1(C50516na1 na12) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        if (na12 == null) {
            Log.m105928w("FinderLiveAdVideoPlugin", "loadLiveBg return for loadVideo:" + na12);
            return;
        }
        String str = na12.f138508h;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            Log.m105928w("FinderLiveAdVideoPlugin", "loadLiveBg return for url:" + str);
            return;
        }
        ImageView imageView = (ImageView) this.f178495p.findViewById(C0966R.C0970id.n_n);
        C60979d<C100810g0> f2 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2();
        C11984n0 n0Var = new C11984n0(str, C27696y.THUMB_IMAGE);
        C87412m.m108593f(imageView, "imageView");
        f2.mo85957c(n0Var, imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.TIMELINE));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        r3 = r3.f172989A;
     */
    /* renamed from: f1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo87846f1(te3.C50516na1 r8, long r9, fy3.C32224a<rx3.C13598b0> r11) {
        /*
            r7 = this;
            java.lang.Class<cl1.d> r0 = cl1.C54951d.class
            r1 = 0
            java.lang.String r2 = "FinderLiveAdVideoPlugin"
            if (r8 != 0) goto L_0x001c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "loadVideo return for loadVideo:"
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r8)
            return r1
        L_0x001c:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r3.getClass()
            j50.a r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            r4 = 1
            if (r3 == 0) goto L_0x0032
            d50.i r3 = r3.f172989A
            if (r3 == 0) goto L_0x0032
            boolean r3 = r3.mo82886h()
            if (r3 != 0) goto L_0x0032
            r3 = 1
            goto L_0x0033
        L_0x0032:
            r3 = 0
        L_0x0033:
            if (r3 == 0) goto L_0x003b
            java.lang.String r8 = "loadVideo return for liveState nor normal mode"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r8)
            return r1
        L_0x003b:
            java.lang.String r3 = r8.f138507g
            java.lang.String r5 = ""
            if (r3 != 0) goto L_0x0042
            r3 = r5
        L_0x0042:
            int r6 = r3.length()
            if (r6 != 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r4 = 0
        L_0x004a:
            if (r4 == 0) goto L_0x0061
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "loadVideo return for url:"
            r8.append(r9)
            r8.append(r3)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r8)
            return r1
        L_0x0061:
            androidx.lifecycle.i0 r4 = r7.mo87696x0(r0)
            cl1.d r4 = (cl1.C54951d) r4
            java.lang.String r6 = r8.f138504d
            if (r6 != 0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r5 = r6
        L_0x006d:
            r4.f154006n = r5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "loadVideo start play startPositionMs:"
            r4.append(r5)
            r4.append(r9)
            java.lang.String r5 = " duration:"
            r4.append(r5)
            long r5 = r8.f138506f
            r4.append(r5)
            java.lang.String r5 = " url:"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r7.mo10792g(r1)
            cl1.d$c r2 = r7.mo87843b1()
            if (r2 != 0) goto L_0x00b4
            androidx.lifecycle.i0 r0 = r7.mo87696x0(r0)
            cl1.d r0 = (cl1.C54951d) r0
            cl1.d$c r2 = new cl1.d$c
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r4 = "getContext()"
            gy3.C87412m.m108593f(r3, r4)
            r2.<init>(r3)
            r0.f154008p = r2
        L_0x00b4:
            cl1.d$c r0 = r7.mo87843b1()
            if (r0 == 0) goto L_0x00c7
            long r2 = java.lang.System.currentTimeMillis()
            r0.f154021B = r2
            u62.d r0 = r0.getPlayer()
            r0.mo35687b(r1)
        L_0x00c7:
            cl1.d$c r0 = r7.mo87843b1()
            if (r0 == 0) goto L_0x00d6
            qj1.o$a r1 = new qj1.o$a
            r1.<init>(r7, r11)
            boolean r1 = r0.mo75883q(r8, r9, r1)
        L_0x00d6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62898o.mo87846f1(te3.na1, long, fy3.a):boolean");
    }

    /* renamed from: g1 */
    public final void mo87847g1(C54951d.C54952a aVar) {
        Log.m105924i("FinderLiveAdVideoPlugin", "setAdVideoState value:" + aVar);
        ((C54951d) mo87696x0(C54951d.class)).f154007o.setValue(aVar);
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return false;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        Class cls = C54951d.class;
        super.mo8357i0();
        ((C54951d) mo87696x0(cls)).f154001f.observe(this, new C63002u(this));
        ((C54951d) mo87696x0(cls)).f154007o.observe(this, new C62900b(this));
        ((C54951d) mo87696x0(cls)).f154005j.observe(this, new C62902c(this));
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C54067f0.C54076o0 o0Var = C54067f0.C54076o0.LIVE_AD_VIDEO;
        Class cls = C54116w.class;
        Class cls2 = C54951d.class;
        C87412m.m108594g(bVar, "status");
        super.mo3210u0(bVar, bundle);
        int ordinal = bVar.ordinal();
        if (ordinal == 7) {
            C51665v91 v912 = new C51665v91();
            FinderLiveService.f159376d.getClass();
            FinderLiveService.f159383n.mo75799e(16, v912, new C63041v(this, C51803w91.class), true);
            if (!((C54951d) mo87696x0(cls2)).mo75870f3()) {
                C11207i.m11072h(this, (C66212f) null, (C53934p0) null, new C12565f(this, (C15601d<? super C12565f>) null), 3, (Object) null);
            }
        } else if (ordinal == 79) {
            C54066f fVar = this.f178499t;
            fVar.getClass();
            fVar.f151418b = C31543z5.m39453c();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", 1);
            jSONObject.put("advertise_type", 3);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "json.toString()");
            String n = C112551y.m153814n(jSONObject2, ",", ";", false);
            Log.m105924i("FinderAdVideoReporter", "reportStartupVideoEnter json: " + jSONObject);
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w.Ex0((C54116w) c, o0Var, n, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
        } else if (ordinal != 118) {
            switch (ordinal) {
                case 20:
                    C54066f fVar2 = this.f178499t;
                    if (fVar2.f151418b == 0) {
                        Log.m105924i("FinderAdVideoReporter", "reportBannerExit return for bannerEnter:" + fVar2.f151418b);
                    } else {
                        fVar2.f151418b = 0;
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("type", 2);
                        jSONObject3.put("advertise_type", 3);
                        jSONObject3.put("watch_duration", C31543z5.m39453c() - fVar2.f151418b);
                        String jSONObject4 = jSONObject3.toString();
                        C87412m.m108593f(jSONObject4, "json.toString()");
                        String n2 = C112551y.m153814n(jSONObject4, ",", ";", false);
                        Log.m105924i("FinderAdVideoReporter", "reportStartupVideoExit json: " + jSONObject3);
                        C7335d c2 = C86312j.m106911c(cls);
                        C87412m.m108593f(c2, "getService(HellLiveVisitorReoprter::class.java)");
                        C54116w.Ex0((C54116w) c2, o0Var, n2, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
                    }
                    return;
                case 21:
                    ((C54951d) mo87696x0(cls2)).f154004i = C54951d.C54954d.MIN;
                    if (((C54951d) mo87696x0(cls2)).f154008p != null) {
                        this.f178498s.removeAllViews();
                        return;
                    }
                    return;
                case 22:
                    ((C54951d) mo87696x0(cls2)).f154004i = C54951d.C54954d.MAX;
                    return;
                default:
                    return;
            }
        } else {
            if ((((C0680q1) mo87696x0(C0680q1.class)).f1602f.size() > 0) && !((C54951d) mo87696x0(cls2)).mo75870f3()) {
                C11207i.m11072h(this, (C66212f) null, (C53934p0) null, new C12564e(this, (C15601d<? super C12564e>) null), 3, (Object) null);
            }
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        Class cls = C54951d.class;
        super.mo3211w0();
        mo10792g(8);
        if (((C54951d) mo87696x0(cls)).mo75870f3()) {
            Log.m105924i("FinderLiveAdVideoPlugin", "unMount handleStartupVideoStop");
            mo87844d1(((C54951d) mo87696x0(cls)).f154006n, false);
        }
        this.f178498s.removeAllViews();
    }
}
