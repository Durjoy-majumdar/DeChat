package wk2;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53895h;
import a14.C53934p0;
import android.content.Context;
import bh3.C113177k;
import cc0.C92411b;
import com.tencent.p014mm.sdk.platformtools.LocationUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import kotlin.Result;
import kotlin.ResultKt;
import p447aw.C103918d;
import p702ts.C118505d;
import p702ts.C78083b;
import p702ts.C78085c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66218h;
import xk2.C15805b;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: wk2.f */
public final class C118764f extends C15805b {

    /* renamed from: f */
    public static final C118764f f355315f = new C118764f();

    /* renamed from: g */
    public static final String f355316g = "geoLocation";

    /* renamed from: h */
    public static final C13601g f355317h = C36568h.m40985a(C15490b.f42019d);

    /* renamed from: i */
    public static final C13601g f355318i = C36568h.m40985a(C102460d.f301716d);

    /* renamed from: j */
    public static C92411b.C92412a f355319j;

    /* renamed from: wk2.f$a */
    public static final class C15489a implements C113177k.C113181e {

        /* renamed from: a */
        public final /* synthetic */ C15601d<Integer> f42018a;

        public C15489a(C15601d<? super Integer> dVar) {
            this.f42018a = dVar;
        }

        public final void onOp(Boolean bool) {
            Log.m105924i("MicroMsg.JsApiGeoLocation", "geoLocation checkBusinessPermission callback: " + bool);
            if (C87412m.m108589b(bool, Boolean.TRUE)) {
                C15601d<Integer> dVar = this.f42018a;
                Result.Companion companion = Result.Companion;
                dVar.resumeWith(Result.m168114constructorimpl(0));
                return;
            }
            C15601d<Integer> dVar2 = this.f42018a;
            Result.Companion companion2 = Result.Companion;
            dVar2.resumeWith(Result.m168114constructorimpl(2));
        }
    }

    /* renamed from: wk2.f$b */
    public static final class C15490b extends C87413o implements C32224a<C92411b> {

        /* renamed from: d */
        public static final C15490b f42019d = new C15490b();

        public C15490b() {
            super(0);
        }

        public Object invoke() {
            return ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms();
        }
    }

    /* renamed from: wk2.f$d */
    public static final class C102460d extends C87413o implements C32224a<C78083b> {

        /* renamed from: d */
        public static final C102460d f301716d = new C102460d();

        public C102460d() {
            super(0);
        }

        public Object invoke() {
            return ((C78085c) C86312j.m106911c(C78085c.class)).oe0();
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.scanner.box.jsapi.JsApiGeoLocation$handleMsg$1", mo125469f = "JsApiGeoLocation.kt", mo125470l = {53}, mo125471m = "invokeSuspend")
    /* renamed from: wk2.f$c */
    public static final class C118765c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f355320d;

        /* renamed from: e */
        public final /* synthetic */ C13855j f355321e;

        /* renamed from: f */
        public final /* synthetic */ C13851h1 f355322f;

        /* renamed from: g */
        public final /* synthetic */ HashMap<String, Object> f355323g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C118765c(C13855j jVar, C13851h1 h1Var, HashMap<String, Object> hashMap, C15601d<? super C118765c> dVar) {
            super(2, dVar);
            this.f355321e = jVar;
            this.f355322f = h1Var;
            this.f355323g = hashMap;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C118765c(this.f355321e, this.f355322f, this.f355323g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C118765c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f355320d;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C118764f fVar = C118764f.f355315f;
                Context context = this.f355321e.f38998a;
                this.f355320d = 1;
                fVar.getClass();
                Class cls = C103918d.class;
                C66218h hVar = new C66218h(C66447b.m78392b(this));
                if (!LocationUtil.isGpsEnable()) {
                    Log.m105928w("MicroMsg.JsApiGeoLocation", "geoLocation gps service closed");
                    Result.Companion companion = Result.Companion;
                    hVar.resumeWith(Result.m168114constructorimpl(new Integer(4)));
                } else {
                    boolean Lb0 = ((C103918d) C86312j.m106911c(cls)).Lb0(context, "android.permission.ACCESS_FINE_LOCATION");
                    Log.m105924i("MicroMsg.JsApiGeoLocation", "geoLocation hasSystemLocationPermission: " + Lb0);
                    if (Lb0) {
                        fVar.mo183495f(hVar);
                    } else {
                        ((C103918d) C86312j.m106911c(cls)).Jg0(context, 76, new C111812g(hVar), new String[]{"android.permission.ACCESS_FINE_LOCATION"}, "", "");
                    }
                }
                obj = hVar.mo90314b();
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int intValue = ((Number) obj).intValue();
            if (intValue == 0) {
                C118764f fVar2 = C118764f.f355315f;
                C13855j jVar = this.f355321e;
                C13851h1 h1Var = this.f355322f;
                fVar2.getClass();
                String str = (String) h1Var.f38983a.get("type");
                if (str == null) {
                    str = "";
                }
                Log.m105924i("MicroMsg.JsApiGeoLocation", "startGeoLocation type: " + str);
                if (C87412m.m108589b(str, "wgs84")) {
                    C118764f.f355319j = new C118768j(jVar, h1Var);
                    fVar2.mo183496g().mo126409c(C118764f.f355319j, false, false);
                } else if (C87412m.m108589b(str, "gcj02")) {
                    fVar2.mo183496g().mo126412f(new C118767i(jVar, h1Var), false);
                } else {
                    Log.m105920e("MicroMsg.JsApiGeoLocation", "startGeoLocation invalid type");
                    z = false;
                }
                if (!z) {
                    this.f355323g.put("retCode", new Integer(-1));
                    C13849g gVar = this.f355321e.f39001d;
                    String str2 = this.f355322f.f38990c;
                    StringBuilder sb = new StringBuilder();
                    fVar2.getClass();
                    sb.append(C118764f.f355316g);
                    sb.append(":fail");
                    gVar.mo10774a(str2, sb.toString(), this.f355323g);
                }
            } else {
                this.f355323g.put("retCode", new Integer(intValue));
                C13849g gVar2 = this.f355321e.f39001d;
                String str3 = this.f355322f.f38990c;
                StringBuilder sb4 = new StringBuilder();
                C118764f.f355315f.getClass();
                sb4.append(C118764f.f355316g);
                sb4.append(":fail");
                gVar2.mo10774a(str3, sb4.toString(), this.f355323g);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: e */
    public static final void m167465e(C118764f fVar, C13855j jVar, C13851h1 h1Var, float f, float f2, float f3, float f4) {
        fVar.getClass();
        C118505d dVar = new C118505d((double) f2, (double) f);
        dVar.f354675g = true;
        ((C78083b) ((C36570n) f355318i).getValue()).mo108054a(dVar, new C118766h(jVar, h1Var, f, f2, f3, f4));
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C118765c(jVar, h1Var, new HashMap(), (C15601d<? super C118765c>) null), 3, (Object) null);
        return true;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f355316g;
    }

    /* renamed from: f */
    public final void mo183495f(C15601d<? super Integer> dVar) {
        boolean hg = ((C113177k) C86312j.m106911c(C113177k.class)).mo165712hg(C113177k.C113179b.LOCAION, C113177k.C113178a.SCAN, new C15489a(dVar));
        Log.m105924i("MicroMsg.JsApiGeoLocation", "geoLocation needCheckBusinessPermission: " + hg);
        if (!hg) {
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(0));
        }
    }

    /* renamed from: g */
    public final C92411b mo183496g() {
        return (C92411b) ((C36570n) f355317h).getValue();
    }
}
