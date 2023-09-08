package ug1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53965x0;
import ak1.C54067f0;
import ak1.C54116w;
import android.animation.Animator;
import cl1.C54951d;
import cl1.C54985m;
import com.tencent.p014mm.plugin.finder.live.infrastructure.livedata.LiveMutableData;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C7335d;
import di3.C86312j;
import f14.C58901s;
import fi1.C59098d;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import ok1.C62042e;
import org.json.JSONObject;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import p823sg.C90193h;
import rx3.C13598b0;
import te3.C64784vv;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.cheer.FinderLiveCheerAnimationPlugin$showCheerAnimation$1", mo125469f = "FinderLiveCheerAnimationPlugin.kt", mo125470l = {127, 132}, mo125471m = "invokeSuspend")
/* renamed from: ug1.c */
public final class C65353c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f188113d;

    /* renamed from: e */
    public Object f188114e;

    /* renamed from: f */
    public int f188115f;

    /* renamed from: g */
    public final /* synthetic */ C65348b f188116g;

    /* renamed from: h */
    public final /* synthetic */ C54985m.C54987c f188117h;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.cheer.FinderLiveCheerAnimationPlugin$showCheerAnimation$1$1", mo125469f = "FinderLiveCheerAnimationPlugin.kt", mo125470l = {161}, mo125471m = "invokeSuspend")
    /* renamed from: ug1.c$a */
    public static final class C65354a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f188118d;

        /* renamed from: e */
        public final /* synthetic */ C59098d.C59099a f188119e;

        /* renamed from: f */
        public final /* synthetic */ C64784vv f188120f;

        /* renamed from: g */
        public final /* synthetic */ String f188121g;

        /* renamed from: h */
        public final /* synthetic */ C65348b f188122h;

        /* renamed from: i */
        public final /* synthetic */ String f188123i;

        /* renamed from: j */
        public final /* synthetic */ C54985m.C54987c f188124j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65354a(C59098d.C59099a aVar, C64784vv vvVar, String str, C65348b bVar, String str2, C54985m.C54987c cVar, C15601d<? super C65354a> dVar) {
            super(2, dVar);
            this.f188119e = aVar;
            this.f188120f = vvVar;
            this.f188121g = str;
            this.f188122h = bVar;
            this.f188123i = str2;
            this.f188124j = cVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C65354a(this.f188119e, this.f188120f, this.f188121g, this.f188122h, this.f188123i, this.f188124j, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C65354a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Class cls = C54985m.class;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f188118d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Integer num = null;
                if (!(this.f188119e instanceof C59098d.C59099a.C59101b) || !C87412m.m108589b(this.f188120f.f185992e, this.f188121g)) {
                    this.f188124j.f154169b = false;
                    this.f188122h.mo89455Z0(true);
                    StringBuilder sb = new StringBuilder();
                    sb.append("showCheerAnimation load pag error, errCode:");
                    C59098d.C59099a aVar2 = this.f188119e;
                    C59098d.C59099a.C59100a aVar3 = aVar2 instanceof C59098d.C59099a.C59100a ? (C59098d.C59099a.C59100a) aVar2 : null;
                    if (aVar3 != null) {
                        num = new Integer(aVar3.f169062a);
                    }
                    sb.append(num);
                    Log.m105920e("FinderLiveCheerAnimationPlugin", sb.toString());
                    return C13598b0.f38549a;
                }
                this.f188122h.f188107p.setScaleMode(1);
                PAGView pAGView = this.f188122h.f188107p;
                PAGFile Load = PAGFile.Load(this.f188123i);
                C64784vv vvVar = this.f188120f;
                C54985m.C54987c cVar = this.f188124j;
                Load.setTimeStretchMode(1);
                double d = (double) 1000;
                long j = (long) (((double) vvVar.f185993f) * cVar.f154170c * d * d);
                Load.setDuration(j);
                Log.m105924i("FinderLiveCheerAnimationPlugin", "showCheerAnimation playing data.speed: " + cVar.f154170c + " duration: " + j);
                pAGView.setComposition(Load);
                this.f188122h.f188107p.setRepeatCount(-1);
                this.f188122h.f188107p.play();
                boolean z = this.f188122h.f188107p.getVisibility() == 8;
                this.f188122h.mo10792g(0);
                this.f188122h.f188107p.setVisibility(0);
                if (((C54951d) this.f188122h.mo87696x0(C54951d.class)).mo75869e3()) {
                    this.f188122h.f188107p.setAlpha(0.0f);
                } else if (z) {
                    this.f188122h.f188107p.setAlpha(0.0f);
                    this.f188122h.f188107p.animate().alpha(1.0f).setDuration(1000).setListener((Animator.AnimatorListener) null).start();
                } else {
                    this.f188122h.f188107p.setAlpha(1.0f);
                }
                C65348b bVar = this.f188122h;
                C54985m.C54987c cVar2 = this.f188124j;
                bVar.getClass();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", 1);
                jSONObject.put("fluorescent_sea_id", cVar2.f154171d);
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "json.toString()");
                String n = C112551y.m153814n(jSONObject2, ",", ";", false);
                Log.m105924i("FinderLiveCheerAnimationPlugin", "reportExpose json: " + jSONObject);
                C7335d c = C86312j.m106911c(C54116w.class);
                C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w.Ex0((C54116w) c, C54067f0.C54076o0.CHEER_ANIMATION, n, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
                if (C62042e.f176370a.mo87027N0()) {
                    LiveMutableData<C54985m.C54987c> liveMutableData = ((C54985m) this.f188122h.mo87696x0(cls)).f154165p;
                    C54985m.C54987c cVar3 = this.f188124j;
                    liveMutableData.postValue(new C54985m.C54987c(cVar3.f154168a, true, cVar3.f154170c, cVar3.f154171d));
                    this.f188118d = 1;
                    if (C53965x0.m60607b(this.f188124j.f154168a.f185692n * 1000, this) == aVar) {
                        return aVar;
                    }
                } else {
                    C54985m mVar = (C54985m) this.f188122h.mo87696x0(cls);
                    Log.m105924i("LiveCheerAnimationSlice", "notifyCheerBtnAnimationShow");
                    mVar.f154163n.postValue(mVar.f154161i.getValue());
                    return C13598b0.f38549a;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            LiveMutableData<C54985m.C54987c> liveMutableData2 = ((C54985m) this.f188122h.mo87696x0(cls)).f154165p;
            C54985m.C54987c cVar4 = this.f188124j;
            liveMutableData2.postValue(new C54985m.C54987c(cVar4.f154168a, false, cVar4.f154170c, cVar4.f154171d));
            this.f188122h.mo89455Z0(true);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65353c(C65348b bVar, C54985m.C54987c cVar, C15601d<? super C65353c> dVar) {
        super(2, dVar);
        this.f188116g = bVar;
        this.f188117h = cVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C65353c(this.f188116g, this.f188117h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C65353c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        C64784vv vvVar;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f188115f;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C64784vv vvVar2 = this.f188116g.mo82893g0() ? this.f188117h.f154168a.f185688g : this.f188117h.f154168a.f185689h;
            String c3 = ((C54985m) this.f188116g.mo87696x0(C54985m.class)).mo75949c3(vvVar2);
            if ((c3 == null || c3.length() == 0) || vvVar2 == null) {
                Log.m105920e("FinderLiveCheerAnimationPlugin", "getPagPath error : " + c3 + " resource: " + vvVar2);
                return C13598b0.f38549a;
            }
            String d = C90193h.m112876d(c3);
            if (C86013q1.m106450k(c3) && !C87412m.m108589b(vvVar2.f185992e, d)) {
                Log.m105924i("FinderLiveCheerAnimationPlugin", "showCheerAnimation delete file, md5 not match, tempMd5: " + d);
                C86013q1.m106447h(c3);
            }
            C59098d dVar = C59098d.f169061a;
            String str2 = vvVar2.f185991d;
            if (str2 == null) {
                str2 = "";
            }
            this.f188113d = vvVar2;
            this.f188114e = c3;
            this.f188115f = 1;
            Object a = dVar.mo84292a(str2, c3, this);
            if (a == aVar) {
                return aVar;
            }
            vvVar = vvVar2;
            str = c3;
            obj = a;
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            str = (String) this.f188114e;
            vvVar = (C64784vv) this.f188113d;
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C59098d.C59099a aVar2 = (C59098d.C59099a) obj;
        String d2 = C90193h.m112876d(str);
        StringBuilder sb = new StringBuilder();
        sb.append("showCheerAnimation load pag isAnchorLive: ");
        sb.append(C62042e.f176370a.mo87027N0());
        sb.append(" resource: ");
        C87412m.m108594g(vvVar, "<this>");
        sb.append("url: " + vvVar.f185991d + " duration: " + vvVar.f185993f + " md5: " + vvVar.f185992e);
        sb.append(" md5: ");
        sb.append(d2);
        sb.append(" result: ");
        sb.append(aVar2);
        sb.append(" getVisible: ");
        sb.append(this.f188116g.mo14483f0());
        Log.m105924i("FinderLiveCheerAnimationPlugin", sb.toString());
        C53896h0 h0Var = C53872d1.f151117a;
        C53915k2 k2Var = C58901s.f168555a;
        C65354a aVar3 = new C65354a(aVar2, vvVar, d2, this.f188116g, str, this.f188117h, (C15601d<? super C65354a>) null);
        this.f188113d = null;
        this.f188114e = null;
        this.f188115f = 2;
        if (C53895h.m60469g(k2Var, aVar3, this) == aVar) {
            return aVar;
        }
        return C13598b0.f38549a;
    }
}
