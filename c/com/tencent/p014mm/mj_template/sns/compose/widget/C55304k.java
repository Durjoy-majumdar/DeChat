package com.tencent.p014mm.mj_template.sns.compose.widget;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C60690y0;
import rx3.C13598b0;
import sx3.C64186f0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.k */
public final class C55304k {

    /* renamed from: a */
    public final C0000n0 f157514a;

    /* renamed from: b */
    public C32224a<C13598b0> f157515b = C55305a.f157523d;

    /* renamed from: c */
    public C32226l<? super C55319n1.C55323d, C13598b0> f157516c = C55307c.f157524d;

    /* renamed from: d */
    public C32227p<? super String, ? super C15601d<? super Boolean>, ? extends Object> f157517d = new C55306b((C15601d<? super C55306b>) null);

    /* renamed from: e */
    public C60690y0<List<C1288t0>> f157518e;

    /* renamed from: f */
    public final C60690y0 f157519f;

    /* renamed from: g */
    public String f157520g;

    /* renamed from: h */
    public C60690y0<Boolean> f157521h;

    /* renamed from: i */
    public final C60690y0 f157522i;

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.k$a */
    public static final class C55305a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C55305a f157523d = new C55305a();

        public C55305a() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.sns.compose.widget.MoreTemplateBottomSheetState$onSelectedTemplateChanged$1", mo125469f = "SnsMoreTemplateWidget.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.k$b */
    public static final class C55306b extends C91594j implements C32227p<String, C15601d<? super Boolean>, Object> {
        public C55306b(C15601d<? super C55306b> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C55306b(dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            new C55306b((C15601d) obj2);
            ResultKt.throwOnFailure(C13598b0.f38549a);
            return Boolean.FALSE;
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            return Boolean.FALSE;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.k$c */
    public static final class C55307c extends C87413o implements C32226l<C55319n1.C55323d, C13598b0> {

        /* renamed from: d */
        public static final C55307c f157524d = new C55307c();

        public C55307c() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C55319n1.C55323d) obj, "templateData");
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.sns.compose.widget.MoreTemplateBottomSheetState$onTemplateSelected$1", mo125469f = "SnsMoreTemplateWidget.kt", mo125470l = {99}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.k$d */
    public static final class C55308d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f157525d;

        /* renamed from: e */
        public final /* synthetic */ C55304k f157526e;

        /* renamed from: f */
        public final /* synthetic */ String f157527f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55308d(C55304k kVar, String str, C15601d<? super C55308d> dVar) {
            super(2, dVar);
            this.f157526e = kVar;
            this.f157527f = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C55308d(this.f157526e, this.f157527f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C55308d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f157525d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C32227p<? super String, ? super C15601d<? super Boolean>, ? extends Object> pVar = this.f157526e.f157517d;
                String str = this.f157527f;
                this.f157525d = 1;
                obj = pVar.invoke(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((Boolean) obj).booleanValue()) {
                C55304k kVar = this.f157526e;
                kVar.getClass();
                Iterator it = ((Iterable) ((C108494d2) kVar.f157518e).getValue()).iterator();
                if (it.hasNext()) {
                    ((C1288t0) it.next()).getClass();
                    throw null;
                }
            } else {
                Log.m105920e("MicroMsg.SnsTemplate.MoreTemplateBottomSheetState", "onSelectedTemplateChanged error");
            }
            return C13598b0.f38549a;
        }
    }

    public C55304k(C0000n0 n0Var) {
        C87412m.m108594g(n0Var, "scope");
        this.f157514a = n0Var;
        C60690y0<List<C1288t0>> c = C108500f2.m146996c(C64186f0.f181907d, (C108497e2) null, 2, (Object) null);
        this.f157518e = c;
        this.f157519f = c;
        this.f157520g = "";
        C60690y0<Boolean> c2 = C108500f2.m146996c(Boolean.FALSE, (C108497e2) null, 2, (Object) null);
        this.f157521h = c2;
        this.f157522i = c2;
    }

    /* renamed from: a */
    public final void mo76614a(String str) {
        C87412m.m108594g(str, "templateId");
        Log.m105924i("MicroMsg.SnsTemplate.MoreTemplateBottomSheetState", "onTemplateSelected: " + str);
        C53895h.m60466d(this.f157514a, (C66212f) null, (C53934p0) null, new C55308d(this, str, (C15601d<? super C55308d>) null), 3, (Object) null);
    }
}
