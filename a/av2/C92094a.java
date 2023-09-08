package av2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53895h;
import a14.C53934p0;
import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.MaterialModel;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gq0.C45944i0;
import gy3.C87412m;
import gy3.C87413o;
import iq0.C98783b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kr0.C109033l0;
import qo3.C77407n;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13603j;
import rx3.C36568h;
import te3.C101804kv2;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: av2.a */
public final class C92094a {

    /* renamed from: a */
    public static final C92094a f263646a = new C92094a();

    /* renamed from: b */
    public static final C13601g f263647b = C36568h.m40985a(C28147g.f77613d);

    /* renamed from: av2.a$a */
    public static final class C28146a {

        /* renamed from: a */
        public final boolean f77611a;

        /* renamed from: b */
        public final List<C54340c.C54341a> f77612b;

        public C28146a(boolean z, List<? extends C54340c.C54341a> list) {
            C87412m.m108594g(list, "allNotReadyConditions");
            this.f77611a = z;
            this.f77612b = list;
        }

        public boolean equals(Object obj) {
            SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$CheckConditionsResult");
            if (this == obj) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$CheckConditionsResult");
                return true;
            } else if (!(obj instanceof C28146a)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$CheckConditionsResult");
                return false;
            } else {
                C28146a aVar = (C28146a) obj;
                if (this.f77611a != aVar.f77611a) {
                    SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$CheckConditionsResult");
                    return false;
                }
                boolean b = C87412m.m108589b(this.f77612b, aVar.f77612b);
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$CheckConditionsResult");
                return b;
            }
        }

        public int hashCode() {
            SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$CheckConditionsResult");
            boolean z = this.f77611a;
            if (z) {
                z = true;
            }
            int hashCode = ((z ? 1 : 0) * true) + this.f77612b.hashCode();
            SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$CheckConditionsResult");
            return hashCode;
        }

        public String toString() {
            SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$CheckConditionsResult");
            String str = "CheckConditionsResult(allConditionsGranted=" + this.f77611a + ", allNotReadyConditions=" + this.f77612b + ')';
            SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$CheckConditionsResult");
            return str;
        }
    }

    /* renamed from: av2.a$g */
    public static final class C28147g extends C87413o implements C32224a<C109033l0> {

        /* renamed from: d */
        public static final C28147g f77613d = new C28147g();

        public C28147g() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$openMaterialService$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$openMaterialService$2");
            C109033l0 l0Var = (C109033l0) C86312j.m106911c(C109033l0.class);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$openMaterialService$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$openMaterialService$2");
            return l0Var;
        }
    }

    /* renamed from: av2.a$c */
    public interface C54340c {

        /* renamed from: av2.a$c$a */
        public interface C54341a extends C54340c {
            /* renamed from: a */
            Object mo75114a(C109033l0 l0Var, C92098f fVar, C15601d<? super Boolean> dVar);

            /* renamed from: c */
            Boolean mo75115c(C109033l0 l0Var, C92098f fVar);
        }

        /* renamed from: av2.a$c$b */
        public interface C54342b extends C54340c {
            /* renamed from: b */
            boolean mo75116b(C109033l0 l0Var, C92098f fVar);
        }

        String getName();
    }

    /* renamed from: av2.a$i */
    public static final class C54343i implements C45944i0 {

        /* renamed from: b */
        public final /* synthetic */ String f152482b;

        /* renamed from: c */
        public final /* synthetic */ C92098f f152483c;

        /* renamed from: d */
        public final /* synthetic */ C109033l0 f152484d;

        /* renamed from: e */
        public final /* synthetic */ List<C54340c.C54341a> f152485e;

        /* renamed from: f */
        public final /* synthetic */ C92100j f152486f;

        /* renamed from: g */
        public final /* synthetic */ C32224a<C13598b0> f152487g;

        /* renamed from: av2.a$i$b */
        public static final class C28148b extends C87413o implements C32226l<Throwable, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ String f77614d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C28148b(String str) {
                super(1);
                this.f77614d = str;
            }

            public Object invoke(Object obj) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$2");
                Throwable th = (Throwable) obj;
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$2");
                if (th != null) {
                    Log.printErrStackTrace(this.f77614d, th, "tryEnable, open fail", new Object[0]);
                }
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$2");
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$2");
                return b0Var;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$1", mo125469f = "AppBrandOpenMaterials.kt", mo125470l = {226}, mo125471m = "invokeSuspend")
        /* renamed from: av2.a$i$a */
        public static final class C54344a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f152488d;

            /* renamed from: e */
            public final /* synthetic */ C109033l0 f152489e;

            /* renamed from: f */
            public final /* synthetic */ C92098f f152490f;

            /* renamed from: g */
            public final /* synthetic */ List<C54340c.C54341a> f152491g;

            /* renamed from: h */
            public final /* synthetic */ String f152492h;

            /* renamed from: i */
            public final /* synthetic */ C92100j f152493i;

            /* renamed from: j */
            public final /* synthetic */ C32224a<C13598b0> f152494j;

            /* renamed from: n */
            public final /* synthetic */ Runnable f152495n;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C54344a(C109033l0 l0Var, C92098f fVar, List<? extends C54340c.C54341a> list, String str, C92100j jVar, C32224a<C13598b0> aVar, Runnable runnable, C15601d<? super C54344a> dVar) {
                super(2, dVar);
                this.f152489e = l0Var;
                this.f152490f = fVar;
                this.f152491g = list;
                this.f152492h = str;
                this.f152493i = jVar;
                this.f152494j = aVar;
                this.f152495n = runnable;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$1");
                C54344a aVar = new C54344a(this.f152489e, this.f152490f, this.f152491g, this.f152492h, this.f152493i, this.f152494j, this.f152495n, dVar);
                SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$1");
                return aVar;
            }

            public Object invoke(Object obj, Object obj2) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$1");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$1");
                Object invokeSuspend = ((C54344a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$1");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$1");
                return invokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$1");
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f152488d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C92094a aVar2 = C92094a.f263646a;
                    C109033l0 l0Var = this.f152489e;
                    C92098f fVar = this.f152490f;
                    List<C54340c.C54341a> list = this.f152491g;
                    this.f152488d = 1;
                    SnsMethodCalculate.markStartTimeMs("access$checkNotReadyConditions", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
                    aVar2.getClass();
                    SnsMethodCalculate.markStartTimeMs("checkNotReadyConditions", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
                    Object g = C53895h.m60469g(C53872d1.f151117a, new C54346b(list, l0Var, fVar, (C15601d<? super C54346b>) null), this);
                    SnsMethodCalculate.markEndTimeMs("checkNotReadyConditions", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
                    SnsMethodCalculate.markEndTimeMs("access$checkNotReadyConditions", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
                    if (g == aVar) {
                        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$1");
                        return aVar;
                    }
                    obj = g;
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$1");
                    throw illegalStateException;
                }
                if (!((Boolean) obj).booleanValue()) {
                    Log.m105928w(this.f152492h, "executeOrDefer, not allNotReadyOpenConditionsGranted");
                    C13598b0 b0Var = C13598b0.f38549a;
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$1");
                    return b0Var;
                }
                Log.m105924i(this.f152492h, "tryEnable, allNotReadyOpenConditionsGranted");
                if (!this.f152493i.mo75116b(this.f152489e, this.f152490f)) {
                    Log.m105928w(this.f152492h, "executeOrDefer, conditionAfterLongTimesWork not granted");
                    C13598b0 b0Var2 = C13598b0.f38549a;
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$1");
                    return b0Var2;
                }
                C32224a<C13598b0> aVar3 = this.f152494j;
                if (aVar3 != null) {
                    aVar3.invoke();
                }
                this.f152495n.run();
                Log.m105924i(this.f152492h, "tryEnable, opened");
                C13598b0 b0Var3 = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$1");
                return b0Var3;
            }
        }

        public C54343i(String str, C92098f fVar, C109033l0 l0Var, List<? extends C54340c.C54341a> list, C92100j jVar, C32224a<C13598b0> aVar) {
            this.f152482b = str;
            this.f152483c = fVar;
            this.f152484d = l0Var;
            this.f152485e = list;
            this.f152486f = jVar;
            this.f152487g = aVar;
        }

        /* renamed from: a */
        public final void mo71346a(Runnable runnable) {
            SnsMethodCalculate.markStartTimeMs("executeOrDefer", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2");
            C87412m.m108594g(runnable, "openTask");
            Log.m105924i(this.f152482b, "tryEnable, open");
            C92098f fVar = this.f152483c;
            fVar.getClass();
            SnsMethodCalculate.markStartTimeMs("getCoroutineScope", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$Params");
            C0000n0 n0Var = fVar.f263650a;
            SnsMethodCalculate.markEndTimeMs("getCoroutineScope", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$Params");
            ((C53884f2) C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C54344a(this.f152484d, this.f152483c, this.f152485e, this.f152482b, this.f152486f, this.f152487g, runnable, (C15601d<? super C54344a>) null), 3, (Object) null)).mo74515E(new C28148b(this.f152482b));
            SnsMethodCalculate.markEndTimeMs("executeOrDefer", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2");
        }
    }

    /* renamed from: av2.a$b */
    public interface C92095b {
        C77407n provide();
    }

    /* renamed from: av2.a$d */
    public interface C92096d {
        String provide();
    }

    /* renamed from: av2.a$e */
    public static final class C92097e {

        /* renamed from: a */
        public final MaterialModel f263648a;

        /* renamed from: b */
        public final C98783b f263649b;

        public C92097e(MaterialModel materialModel, C98783b bVar) {
            C87412m.m108594g(materialModel, "model");
            C87412m.m108594g(bVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            this.f263648a = materialModel;
            this.f263649b = bVar;
        }

        /* renamed from: a */
        public final MaterialModel mo126089a() {
            SnsMethodCalculate.markStartTimeMs("getModel", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
            MaterialModel materialModel = this.f263648a;
            SnsMethodCalculate.markEndTimeMs("getModel", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
            return materialModel;
        }

        /* renamed from: b */
        public final C98783b mo126090b() {
            SnsMethodCalculate.markStartTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
            C98783b bVar = this.f263649b;
            SnsMethodCalculate.markEndTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
            return bVar;
        }

        public boolean equals(Object obj) {
            SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
            if (this == obj) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
                return true;
            } else if (!(obj instanceof C92097e)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
                return false;
            } else {
                C92097e eVar = (C92097e) obj;
                if (!C87412m.m108589b(this.f263648a, eVar.f263648a)) {
                    SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
                    return false;
                }
                C98783b bVar = this.f263649b;
                C98783b bVar2 = eVar.f263649b;
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
                return bVar == bVar2;
            }
        }

        public int hashCode() {
            SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
            int hashCode = (this.f263648a.hashCode() * 31) + this.f263649b.hashCode();
            SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
            return hashCode;
        }

        public String toString() {
            SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
            String str = "MaterialInfo(model=" + this.f263648a + ", scene=" + this.f263649b + ')';
            SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
            return str;
        }
    }

    /* renamed from: av2.a$f */
    public static final class C92098f {

        /* renamed from: a */
        public final C0000n0 f263650a;

        /* renamed from: b */
        public final Context f263651b;

        /* renamed from: c */
        public final C92097e f263652c;

        /* renamed from: d */
        public final C92095b f263653d;

        /* renamed from: e */
        public final C92096d f263654e;

        public C92098f(C0000n0 n0Var, Context context, C92097e eVar, C92095b bVar, C92096d dVar) {
            C87412m.m108594g(n0Var, "coroutineScope");
            C87412m.m108594g(context, "context");
            C87412m.m108594g(eVar, "materialInfo");
            C87412m.m108594g(bVar, "bottomSheetProvider");
            C87412m.m108594g(dVar, "curMaterialPathProvider");
            this.f263650a = n0Var;
            this.f263651b = context;
            this.f263652c = eVar;
            this.f263653d = bVar;
            this.f263654e = dVar;
        }

        /* renamed from: a */
        public final C92095b mo126094a() {
            SnsMethodCalculate.markStartTimeMs("getBottomSheetProvider", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$Params");
            C92095b bVar = this.f263653d;
            SnsMethodCalculate.markEndTimeMs("getBottomSheetProvider", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$Params");
            return bVar;
        }

        /* renamed from: b */
        public final C92097e mo126095b() {
            SnsMethodCalculate.markStartTimeMs("getMaterialInfo", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$Params");
            C92097e eVar = this.f263652c;
            SnsMethodCalculate.markEndTimeMs("getMaterialInfo", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$Params");
            return eVar;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials", mo125469f = "AppBrandOpenMaterials.kt", mo125470l = {182, 198}, mo125471m = "tryEnable")
    /* renamed from: av2.a$h */
    public static final class C92099h extends C66704d {

        /* renamed from: d */
        public Object f263655d;

        /* renamed from: e */
        public Object f263656e;

        /* renamed from: f */
        public Object f263657f;

        /* renamed from: g */
        public Object f263658g;

        /* renamed from: h */
        public Object f263659h;

        /* renamed from: i */
        public Object f263660i;

        /* renamed from: j */
        public Object f263661j;

        /* renamed from: n */
        public Object f263662n;

        /* renamed from: o */
        public /* synthetic */ Object f263663o;

        /* renamed from: p */
        public final /* synthetic */ C92094a f263664p;

        /* renamed from: q */
        public int f263665q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92099h(C92094a aVar, C15601d<? super C92099h> dVar) {
            super(dVar);
            this.f263664p = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$1");
            this.f263663o = obj;
            this.f263665q |= Integer.MIN_VALUE;
            Object c = this.f263664p.mo126086c((C92098f) null, (List<? extends C54340c.C54342b>) null, (List<? extends C54340c>) null, (List<? extends C54340c>) null, (C32224a<C13598b0>) null, this);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$1");
            return c;
        }
    }

    /* renamed from: av2.a$j */
    public static final class C92100j implements C54340c.C54342b {

        /* renamed from: a */
        public final /* synthetic */ String f263666a;

        public C92100j(String str) {
            this.f263666a = str;
        }

        /* renamed from: b */
        public boolean mo75116b(C109033l0 l0Var, C92098f fVar) {
            SnsMethodCalculate.markStartTimeMs("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$conditionAfterLongTimesWork$1");
            C87412m.m108594g(l0Var, "openMaterialService");
            C87412m.m108594g(fVar, "params");
            if (fVar.mo126094a().provide() == null) {
                Log.m105924i(this.f263666a, "tryEnable, bottomSheet is null");
                SnsMethodCalculate.markEndTimeMs("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$conditionAfterLongTimesWork$1");
                return false;
            }
            String str = fVar.mo126095b().mo126089a().f267606f;
            SnsMethodCalculate.markStartTimeMs("getCurMaterialPathProvider", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$Params");
            C92096d dVar = fVar.f263654e;
            SnsMethodCalculate.markEndTimeMs("getCurMaterialPathProvider", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$Params");
            if (!C87412m.m108589b(str, dVar.provide())) {
                Log.m105924i(this.f263666a, "tryEnable, materialPath changed");
                SnsMethodCalculate.markEndTimeMs("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$conditionAfterLongTimesWork$1");
                return false;
            }
            SnsMethodCalculate.markEndTimeMs("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$conditionAfterLongTimesWork$1");
            return true;
        }

        public String getName() {
            SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$conditionAfterLongTimesWork$1");
            SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$conditionAfterLongTimesWork$1");
            return "OpenMaterials$Check";
        }
    }

    /* renamed from: a */
    public static final C92097e m115772a(SnsInfo snsInfo, C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("buildMaterialInfo", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
        if (snsInfo == null) {
            Log.m105924i("MicroMsg.AppBrandOpenMaterials", "buildMaterialInfo, snsInfo is null");
            SnsMethodCalculate.markEndTimeMs("buildMaterialInfo", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
            return null;
        } else if (kv22 == null) {
            Log.m105924i("MicroMsg.AppBrandOpenMaterials", "buildMaterialInfo, mediaObj is null");
            SnsMethodCalculate.markEndTimeMs("buildMaterialInfo", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
            return null;
        } else {
            boolean e = C92125p.m115800e(snsInfo);
            String c = C92125p.m115798c(e, kv22);
            Log.m105924i("MicroMsg.AppBrandOpenMaterials", "buildMaterialInfo, isImage: " + e + ", mediaPath: " + c);
            C92097e eVar = new C92097e(MaterialModel.m117225b(c, e ? "jpg" : "mp4"), e ? C98783b.SNS_IMAGE : C98783b.SNS_VIDEO);
            SnsMethodCalculate.markEndTimeMs("buildMaterialInfo", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
            return eVar;
        }
    }

    /* renamed from: d */
    public static /* synthetic */ Object m115773d(C92094a aVar, C92098f fVar, List list, List list2, List list3, C32224a aVar2, C15601d dVar, int i, Object obj) {
        SnsMethodCalculate.markStartTimeMs("tryEnable$default", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
        Object c = aVar.mo126086c(fVar, list, list2, list3, (i & 16) != 0 ? null : aVar2, dVar);
        SnsMethodCalculate.markEndTimeMs("tryEnable$default", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
        return c;
    }

    /* renamed from: b */
    public final C28146a mo126085b(C109033l0 l0Var, C92098f fVar, List<? extends C54340c> list) {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("checkConditions", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C54340c cVar = (C54340c) it.next();
                Log.m105924i("MicroMsg.AppBrandOpenMaterials", "checkConditions, condition: " + cVar.getName());
                if (cVar instanceof C54340c.C54342b) {
                    z = ((C54340c.C54342b) cVar).mo75116b(l0Var, fVar);
                    continue;
                } else if (cVar instanceof C54340c.C54341a) {
                    Boolean c = ((C54340c.C54341a) cVar).mo75115c(l0Var, fVar);
                    if (C87412m.m108589b(Boolean.FALSE, c)) {
                        z = false;
                        continue;
                    } else {
                        if (c == null) {
                            arrayList.add(cVar);
                        }
                        z = true;
                        continue;
                    }
                } else {
                    C13603j jVar = new C13603j();
                    SnsMethodCalculate.markEndTimeMs("checkConditions", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
                    throw jVar;
                }
                if (!z) {
                    break;
                }
            }
            C28146a aVar = new C28146a(z2, arrayList);
            SnsMethodCalculate.markEndTimeMs("checkConditions", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
            return aVar;
        }
        z2 = true;
        C28146a aVar2 = new C28146a(z2, arrayList);
        SnsMethodCalculate.markEndTimeMs("checkConditions", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
        return aVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0039  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo126086c(av2.C92094a.C92098f r33, java.util.List<? extends av2.C92094a.C54340c.C54342b> r34, java.util.List<? extends av2.C92094a.C54340c> r35, java.util.List<? extends av2.C92094a.C54340c> r36, fy3.C32224a<rx3.C13598b0> r37, wx3.C15601d<? super gq0.C107885g0> r38) {
        /*
            r32 = this;
            r1 = r32
            r0 = r33
            r2 = r38
            java.lang.String r3 = "tryEnable"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            boolean r5 = r2 instanceof av2.C92094a.C92099h
            if (r5 == 0) goto L_0x0021
            r5 = r2
            av2.a$h r5 = (av2.C92094a.C92099h) r5
            int r6 = r5.f263665q
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x0021
            int r6 = r6 - r7
            r5.f263665q = r6
            goto L_0x0026
        L_0x0021:
            av2.a$h r5 = new av2.a$h
            r5.<init>(r1, r2)
        L_0x0026:
            java.lang.Object r2 = r5.f263663o
            xx3.a r6 = xx3.C15911a.COROUTINE_SUSPENDED
            int r7 = r5.f263665q
            java.lang.String r8 = "tryEnable, conditionAfterLongTimesWork not granted"
            java.lang.String r9 = "component2"
            java.lang.String r10 = "component1"
            r11 = 1
            r12 = 2
            java.lang.String r13 = "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$CheckConditionsResult"
            if (r7 == 0) goto L_0x00af
            if (r7 == r11) goto L_0x0079
            if (r7 != r12) goto L_0x006e
            java.lang.Object r0 = r5.f263662n
            com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection r0 = (com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection) r0
            java.lang.Object r6 = r5.f263661j
            av2.a$j r6 = (av2.C92094a.C92100j) r6
            java.lang.Object r7 = r5.f263660i
            kr0.l0 r7 = (kr0.C109033l0) r7
            java.lang.Object r11 = r5.f263659h
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r5.f263658g
            fy3.a r12 = (fy3.C32224a) r12
            java.lang.Object r15 = r5.f263657f
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r14 = r5.f263656e
            av2.a$f r14 = (av2.C92094a.C92098f) r14
            java.lang.Object r5 = r5.f263655d
            av2.a r5 = (av2.C92094a) r5
            kotlin.ResultKt.throwOnFailure(r2)
            r24 = r0
            r17 = r9
            r18 = r10
            r0 = r11
            r31 = r12
            r1 = r14
            r11 = r6
            r14 = r7
            goto L_0x0246
        L_0x006e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            throw r0
        L_0x0079:
            java.lang.Object r0 = r5.f263662n
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r7 = r5.f263661j
            av2.a$j r7 = (av2.C92094a.C92100j) r7
            java.lang.Object r11 = r5.f263660i
            kr0.l0 r11 = (kr0.C109033l0) r11
            java.lang.Object r14 = r5.f263659h
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r5.f263658g
            fy3.a r15 = (fy3.C32224a) r15
            java.lang.Object r12 = r5.f263657f
            java.util.List r12 = (java.util.List) r12
            r33 = r0
            java.lang.Object r0 = r5.f263656e
            av2.a$f r0 = (av2.C92094a.C92098f) r0
            r34 = r0
            java.lang.Object r0 = r5.f263655d
            av2.a r0 = (av2.C92094a) r0
            kotlin.ResultKt.throwOnFailure(r2)     // Catch:{ Exception -> 0x00ac }
            r1 = r33
            r17 = r9
            r9 = r14
            r14 = r11
            r11 = r7
            r7 = r0
            r0 = r34
            goto L_0x01d1
        L_0x00ac:
            r0 = move-exception
            goto L_0x02de
        L_0x00af:
            kotlin.ResultKt.throwOnFailure(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "MicroMsg.AppBrandOpenMaterials#"
            r2.append(r7)
            long r14 = android.os.SystemClock.uptimeMillis()
            r2.append(r14)
            java.lang.String r14 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r3)
            av2.a$b r2 = r33.mo126094a()
            qo3.n r2 = r2.provide()
            if (r2 != 0) goto L_0x00df
            java.lang.String r0 = "tryEnable, bottomSheet is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            r2 = 0
            return r2
        L_0x00df:
            java.lang.String r2 = "getOpenMaterialService"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)
            rx3.g r7 = f263647b
            rx3.n r7 = (rx3.C36570n) r7
            java.lang.Object r7 = r7.getValue()
            kr0.l0 r7 = (kr0.C109033l0) r7
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            if (r7 != 0) goto L_0x00fe
            java.lang.String r0 = "tryEnable, openMaterialService is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            r2 = 0
            return r2
        L_0x00fe:
            r2 = 0
            av2.a$e r12 = r33.mo126095b()
            iq0.b r12 = r12.mo126090b()
            boolean r12 = r7.mo158321RB(r12)
            if (r12 != 0) goto L_0x0117
            java.lang.String r0 = "tryEnable, not need"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r2
        L_0x0117:
            av2.a$j r2 = new av2.a$j
            r2.<init>(r14)
            r12 = r34
            boolean r15 = r12 instanceof java.util.Collection
            if (r15 == 0) goto L_0x0129
            boolean r15 = r34.isEmpty()
            if (r15 == 0) goto L_0x0129
            goto L_0x0141
        L_0x0129:
            java.util.Iterator r12 = r34.iterator()
        L_0x012d:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L_0x0141
            java.lang.Object r15 = r12.next()
            av2.a$c$b r15 = (av2.C92094a.C54340c.C54342b) r15
            boolean r15 = r15.mo75116b(r7, r0)
            if (r15 != 0) goto L_0x012d
            r12 = 0
            goto L_0x0142
        L_0x0141:
            r12 = 1
        L_0x0142:
            if (r12 != 0) goto L_0x014f
            java.lang.String r0 = "tryEnable, not allPreConditionsGranted"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            r2 = 0
            return r2
        L_0x014f:
            java.lang.String r12 = "tryEnable, allPreConditionsGranted"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r12)
            r12 = r35
            av2.a$a r12 = r1.mo126085b(r7, r0, r12)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r13)
            boolean r15 = r12.f77611a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r13)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r13)
            java.util.List<av2.a$c$a> r12 = r12.f77612b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r13)
            if (r15 != 0) goto L_0x0178
            java.lang.String r0 = "tryEnable, not allFetchConditionsGranted"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            r2 = 0
            return r2
        L_0x0178:
            java.lang.String r15 = "tryEnable, allFetchConditionsGranted"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r15)
            av2.a$e r15 = r33.mo126095b()     // Catch:{ Exception -> 0x00ac }
            r5.f263655d = r1     // Catch:{ Exception -> 0x00ac }
            r5.f263656e = r0     // Catch:{ Exception -> 0x00ac }
            r11 = r36
            r5.f263657f = r11     // Catch:{ Exception -> 0x00ac }
            r0 = r37
            r5.f263658g = r0     // Catch:{ Exception -> 0x00ac }
            r5.f263659h = r14     // Catch:{ Exception -> 0x00ac }
            r5.f263660i = r7     // Catch:{ Exception -> 0x00ac }
            r5.f263661j = r2     // Catch:{ Exception -> 0x00ac }
            r5.f263662n = r12     // Catch:{ Exception -> 0x00ac }
            r0 = 1
            r5.f263665q = r0     // Catch:{ Exception -> 0x00ac }
            java.lang.String r0 = "doFetch"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r4)     // Catch:{ Exception -> 0x00ac }
            wx3.h r1 = new wx3.h     // Catch:{ Exception -> 0x00ac }
            r17 = r2
            wx3.d r2 = xx3.C66447b.m78392b(r5)     // Catch:{ Exception -> 0x00ac }
            r1.<init>(r2)     // Catch:{ Exception -> 0x00ac }
            com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel r2 = r15.mo126089a()     // Catch:{ Exception -> 0x00ac }
            av2.c r11 = new av2.c     // Catch:{ Exception -> 0x00ac }
            r11.<init>(r1, r15)     // Catch:{ Exception -> 0x00ac }
            r7.mo158324aj(r2, r11)     // Catch:{ Exception -> 0x00ac }
            java.lang.Object r2 = r1.mo90314b()     // Catch:{ Exception -> 0x00ac }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)     // Catch:{ Exception -> 0x00ac }
            if (r2 != r6) goto L_0x01c2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r6
        L_0x01c2:
            r0 = r33
            r15 = r37
            r1 = r12
            r11 = r17
            r12 = r36
            r17 = r9
            r9 = r14
            r14 = r7
            r7 = r32
        L_0x01d1:
            com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection r2 = (com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection) r2     // Catch:{ Exception -> 0x02d9 }
            r18 = r10
            java.lang.String r10 = "tryEnable, fetched"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            boolean r10 = r11.mo75116b(r14, r0)
            if (r10 != 0) goto L_0x01e9
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            r10 = 0
            return r10
        L_0x01e9:
            r10 = 0
            av2.a$b r19 = r0.mo126094a()
            qo3.n r10 = r19.provide()
            gy3.C87412m.m108591d(r10)
            boolean r10 = r14.mo158325ic(r10, r2)
            if (r10 != 0) goto L_0x0206
            java.lang.String r0 = "tryEnable, not need enhance"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
        L_0x0204:
            r1 = 0
            return r1
        L_0x0206:
            r5.f263655d = r7
            r5.f263656e = r0
            r5.f263657f = r12
            r5.f263658g = r15
            r5.f263659h = r9
            r5.f263660i = r14
            r5.f263661j = r11
            r5.f263662n = r2
            r10 = 2
            r5.f263665q = r10
            r7.getClass()
            java.lang.String r10 = "checkNotReadyConditions"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r4)
            r33 = r2
            a14.h0 r2 = a14.C53872d1.f151117a
            r16 = r7
            av2.b r7 = new av2.b
            r19 = r9
            r9 = 0
            r7.<init>(r1, r14, r0, r9)
            java.lang.Object r2 = a14.C53895h.m60469g(r2, r7, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r4)
            if (r2 != r6) goto L_0x023c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r6
        L_0x023c:
            r24 = r33
            r1 = r0
            r31 = r15
            r5 = r16
            r0 = r19
            r15 = r12
        L_0x0246:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0259
            java.lang.String r1 = "tryEnable, not allNotReadyFetchConditionsGranted"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            r2 = 0
            return r2
        L_0x0259:
            r2 = 0
            java.lang.String r6 = "tryEnable, allNotReadyFetchConditionsGranted"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            boolean r6 = r11.mo75116b(r14, r1)
            if (r6 != 0) goto L_0x026d
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r2
        L_0x026d:
            av2.a$a r2 = r5.mo126085b(r14, r1, r15)
            r5 = r18
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r13)
            boolean r6 = r2.f77611a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r13)
            r5 = r17
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r13)
            java.util.List<av2.a$c$a> r2 = r2.f77612b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r13)
            if (r6 != 0) goto L_0x0292
            java.lang.String r1 = "tryEnable, not allOpenConditionsGranted"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            goto L_0x0204
        L_0x0292:
            java.lang.String r5 = "tryEnable, allOpenConditionsGranted"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            av2.a$e r5 = r1.mo126095b()
            iq0.b r21 = r5.mo126090b()
            java.lang.String r5 = "getContext"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$Params"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            android.content.Context r7 = r1.f263651b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            av2.a$b r5 = r1.mo126094a()
            qo3.n r23 = r5.provide()
            gy3.C87412m.m108591d(r23)
            r5 = 0
            av2.a$i r6 = new av2.a$i
            r25 = r6
            r26 = r0
            r27 = r1
            r28 = r14
            r29 = r2
            r30 = r11
            r25.<init>(r26, r27, r28, r29, r30, r31)
            r20 = r14
            r22 = r7
            r25 = r5
            r26 = r6
            gq0.g0 r0 = r20.mo158322RD(r21, r22, r23, r24, r25, r26)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r0
        L_0x02d9:
            r0 = move-exception
            r19 = r9
            r14 = r19
        L_0x02de:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "tryEnable, doFetch failure since "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            goto L_0x0204
        */
        throw new UnsupportedOperationException("Method not decompiled: av2.C92094a.mo126086c(av2.a$f, java.util.List, java.util.List, java.util.List, fy3.a, wx3.d):java.lang.Object");
    }
}
