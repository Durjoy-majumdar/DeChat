package av2;

import a14.C0000n0;
import a14.C53869d;
import a14.C53895h;
import a14.C53934p0;
import av2.C92094a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kr0.C109033l0;
import rx3.C13598b0;
import sx3.C36907w;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2", mo125469f = "AppBrandOpenMaterials.kt", mo125470l = {282}, mo125471m = "invokeSuspend")
/* renamed from: av2.b */
public final class C54346b extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

    /* renamed from: d */
    public int f152496d;

    /* renamed from: e */
    public /* synthetic */ Object f152497e;

    /* renamed from: f */
    public final /* synthetic */ List<C92094a.C54340c.C54341a> f152498f;

    /* renamed from: g */
    public final /* synthetic */ C109033l0 f152499g;

    /* renamed from: h */
    public final /* synthetic */ C92094a.C92098f f152500h;

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2$1$1", mo125469f = "AppBrandOpenMaterials.kt", mo125470l = {280}, mo125471m = "invokeSuspend")
    /* renamed from: av2.b$a */
    public static final class C54347a extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public int f152501d;

        /* renamed from: e */
        public final /* synthetic */ C92094a.C54340c.C54341a f152502e;

        /* renamed from: f */
        public final /* synthetic */ C109033l0 f152503f;

        /* renamed from: g */
        public final /* synthetic */ C92094a.C92098f f152504g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54347a(C92094a.C54340c.C54341a aVar, C109033l0 l0Var, C92094a.C92098f fVar, C15601d<? super C54347a> dVar) {
            super(2, dVar);
            this.f152502e = aVar;
            this.f152503f = l0Var;
            this.f152504g = fVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2$1$1");
            C54347a aVar = new C54347a(this.f152502e, this.f152503f, this.f152504g, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2$1$1");
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2$1$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2$1$1");
            Object invokeSuspend = ((C54347a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2$1$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2$1$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2$1$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f152501d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C92094a.C54340c.C54341a aVar2 = this.f152502e;
                C109033l0 l0Var = this.f152503f;
                C92094a.C92098f fVar = this.f152504g;
                this.f152501d = 1;
                obj = aVar2.mo75114a(l0Var, fVar, this);
                if (obj == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2$1$1");
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2$1$1");
                throw illegalStateException;
            }
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2$1$1");
            return obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54346b(List<? extends C92094a.C54340c.C54341a> list, C109033l0 l0Var, C92094a.C92098f fVar, C15601d<? super C54346b> dVar) {
        super(2, dVar);
        this.f152498f = list;
        this.f152499g = l0Var;
        this.f152500h = fVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2");
        C54346b bVar = new C54346b(this.f152498f, this.f152499g, this.f152500h, dVar);
        bVar.f152497e = obj;
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2");
        return bVar;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2");
        Object invokeSuspend = ((C54346b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2");
        return invokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2");
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f152496d;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var = (C0000n0) this.f152497e;
            List<C92094a.C54340c.C54341a> list = this.f152498f;
            C109033l0 l0Var = this.f152499g;
            C92094a.C92098f fVar = this.f152500h;
            ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
            for (C92094a.C54340c.C54341a aVar2 : list) {
                Log.m105924i("MicroMsg.AppBrandOpenMaterials", "checkNotReadyConditions, condition: " + aVar2.getName());
                arrayList.add(C53895h.m60464b(n0Var, (C66212f) null, (C53934p0) null, new C54347a(aVar2, l0Var, fVar, (C15601d<? super C54347a>) null), 3, (Object) null));
            }
            this.f152496d = 1;
            obj = C53869d.m60385a(arrayList, this);
            if (obj == aVar) {
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2");
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2");
            throw illegalStateException;
        }
        Iterable iterable = (Iterable) obj;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((Boolean) it.next()).booleanValue()) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        Boolean valueOf = Boolean.valueOf(z);
        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2");
        return valueOf;
    }
}
