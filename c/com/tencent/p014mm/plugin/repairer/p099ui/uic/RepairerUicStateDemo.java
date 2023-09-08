package com.tencent.p014mm.plugin.repairer.p099ui.uic;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.C39622i0;
import bl3.C0317e;
import bl3.C39818r;
import bl3.C54491d;
import bl3.C54498z;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45253g;
import d14.C58052j1;
import d14.C58056k1;
import d14.C58085t0;
import d14.C58087u0;
import el3.C58629a;
import el3.C58635b;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ij2.C60306a;
import ij2.C60327j;
import ij2.C60328k;
import ij2.C60329l;
import ij2.C60330m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C13600d;
import rx3.C36570n;
import sx3.C110826x0;
import wb2.C65946a;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/uic/RepairerUicStateDemo;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.uic.RepairerUicStateDemo */
public final class RepairerUicStateDemo extends MMActivity {

    @C91590f(mo125468c = "com.tencent.mm.plugin.repairer.ui.uic.RepairerUicStateDemo$onCreate$1", mo125469f = "RepairerUicStateDemo.kt", mo125470l = {62}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.repairer.ui.uic.RepairerUicStateDemo$a */
    public static final class C57265a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f164035d;

        /* renamed from: e */
        public final /* synthetic */ C58085t0<String> f164036e;

        /* renamed from: f */
        public final /* synthetic */ C58087u0<String> f164037f;

        /* renamed from: com.tencent.mm.plugin.repairer.ui.uic.RepairerUicStateDemo$a$a */
        public static final class C57266a implements C45253g<String> {

            /* renamed from: d */
            public final /* synthetic */ C58087u0<String> f164038d;

            public C57266a(C58087u0<String> u0Var) {
                this.f164038d = u0Var;
            }

            public Object emit(Object obj, C15601d dVar) {
                Log.m105924i("RepairerUicStateDemo", String.valueOf((String) obj));
                Log.m105924i("RepairerUicStateDemo", String.valueOf(this.f164038d.getValue()));
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57265a(C58085t0<String> t0Var, C58087u0<String> u0Var, C15601d<? super C57265a> dVar) {
            super(2, dVar);
            this.f164036e = t0Var;
            this.f164037f = u0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C57265a(this.f164036e, this.f164037f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            ((C57265a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            return C15911a.COROUTINE_SUSPENDED;
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f164035d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C58085t0<String> t0Var = this.f164036e;
                C57266a aVar2 = new C57266a(this.f164037f);
                this.f164035d = 1;
                if (t0Var.mo31880a(aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            throw new C13600d();
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.uic.RepairerUicStateDemo$b */
    public static final class C57267b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60327j f164039d;

        public C57267b(C60327j jVar) {
            this.f164039d = jVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/uic/RepairerUicStateDemo$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C60327j jVar = this.f164039d;
            jVar.f171976e++;
            ((C58085t0) ((C36570n) jVar.f152777d).getValue()).mo82832d(jVar);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerUicStateDemo$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.uic.RepairerUicStateDemo$c */
    public static final class C57268c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerUicStateDemo f164040d;

        public C57268c(RepairerUicStateDemo repairerUicStateDemo) {
            this.f164040d = repairerUicStateDemo;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/uic/RepairerUicStateDemo$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C53930o0.m60557d(this.f164040d.getLifecycleAsyncScope(), "cancel by click!", (Throwable) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerUicStateDemo$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.uic.RepairerUicStateDemo$d */
    public static final class C57269d extends C87413o implements C32226l<C54498z, C13598b0> {

        /* renamed from: d */
        public static final C57269d f164041d = new C57269d();

        public C57269d() {
            super(1);
        }

        public Object invoke(Object obj) {
            C54498z zVar = (C54498z) obj;
            C87412m.m108594g(zVar, LocaleUtil.ITALIAN);
            Log.m105924i("RepairerUicStateDemo", "stateTransform.obverseEach=" + zVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.uic.RepairerUicStateDemo$e */
    public static final class C57270e extends C87413o implements C32227p<C60327j, C60329l, String> {

        /* renamed from: d */
        public static final C57270e f164042d = new C57270e();

        public C57270e() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C60327j jVar = (C60327j) obj;
            C60329l lVar = (C60329l) obj2;
            C87412m.m108594g(jVar, "state");
            C87412m.m108594g(lVar, "state2");
            return "stateTransform.adapter=[" + jVar.f171976e + '+' + lVar.f171978e + ']';
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.uic.RepairerUicStateDemo$f */
    public static final class C57271f extends C87413o implements C32226l<C54498z, C13598b0> {

        /* renamed from: d */
        public static final C57271f f164043d = new C57271f();

        public C57271f() {
            super(1);
        }

        public Object invoke(Object obj) {
            C54498z zVar = (C54498z) obj;
            C87412m.m108594g(zVar, LocaleUtil.ITALIAN);
            Log.m105924i("RepairerUicStateDemo", "stateTransform2.obverseEach=" + zVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.uic.RepairerUicStateDemo$g */
    public static final class C57272g extends C87413o implements C32227p<C60327j, C60329l, String> {

        /* renamed from: d */
        public static final C57272g f164044d = new C57272g();

        public C57272g() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C60327j jVar = (C60327j) obj;
            C60329l lVar = (C60329l) obj2;
            C87412m.m108594g(jVar, "state");
            C87412m.m108594g(lVar, "state2");
            return "stateTransform2.adapter=[" + jVar.f171976e + '+' + lVar.f171978e + ']';
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bt5;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C60328k.class, C60330m.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C39818r rVar = C39818r.f106831a;
        C60327j jVar = ((C60328k) rVar.mo62444c(this).mo75002a(C60328k.class)).f171977d;
        C60329l lVar = (C60329l) ((C54491d) rVar.mo62444c(this).mo62447c(C60306a.class)).mo75316W2();
        C58629a aVar = new C58629a();
        C87412m.m108594g(jVar, "uicState");
        aVar.f167857a.add(jVar);
        C87412m.m108594g(lVar, "uicState");
        aVar.f167857a.add(lVar);
        C58629a.C58632b bVar = new C58629a.C58632b(aVar);
        C57269d dVar = C57269d.f164041d;
        C87412m.m108594g(dVar, "call");
        bVar.f167863c = dVar;
        C57270e eVar = C57270e.f164042d;
        C87412m.m108594g(eVar, "call");
        bVar.f167862b = eVar;
        C58085t0 a = bVar.mo83510a(getLifecycleAsyncScope(), 1);
        C58629a aVar2 = new C58629a();
        aVar2.f167857a.add(jVar);
        aVar2.f167857a.add(lVar);
        C58629a.C58632b bVar2 = new C58629a.C58632b(aVar2);
        C57271f fVar = C57271f.f164043d;
        C87412m.m108594g(fVar, "call");
        bVar2.f167863c = fVar;
        C57272g gVar = C57272g.f164044d;
        C87412m.m108594g(gVar, "call");
        bVar2.f167862b = gVar;
        C0000n0 lifecycleAsyncScope = getLifecycleAsyncScope();
        C87412m.m108594g(lifecycleAsyncScope, "lifecycleScope");
        bVar2.f167858a.getClass();
        C58087u0 a2 = C58056k1.m67214a(APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        C53895h.m60466d(lifecycleAsyncScope, (C66212f) null, (C53934p0) null, new C58635b(bVar2, a2, (C15601d<? super C58635b>) null), 3, (Object) null);
        StringBuilder sb = new StringBuilder();
        sb.append("stateTransform2.init=");
        C58052j1 j1Var = (C58052j1) a2;
        sb.append((String) j1Var.getValue());
        Log.m105924i("RepairerUicStateDemo", sb.toString());
        C39622i0 a3 = rVar.mo62444c(this).mo75002a(C65946a.class);
        C87412m.m108593f(a3, "UICProvider.of(this).get…ycleScopeUIC::class.java)");
        C0317e.launch$default((C0317e) a3, (C66212f) null, (C53934p0) null, new C57265a(a, j1Var, (C15601d<? super C57265a>) null), 3, (Object) null);
        findViewById(C0966R.C0970id.khd).setOnClickListener(new C57267b(jVar));
        findViewById(C0966R.C0970id.apu).setOnClickListener(new C57268c(this));
    }
}
