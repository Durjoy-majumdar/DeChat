package ij2;

import a14.C0000n0;
import a14.C53934p0;
import a14.C53973z1;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import hj2.C59926a;
import hj2.C59927b;
import hj2.C59929d;
import hj2.C59930e;
import java.util.LinkedList;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C64563mr3;
import wx3.C15601d;
import yb2.C15946a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: ij2.g */
public final class C60321g extends C15946a {

    /* renamed from: d */
    public C53973z1 f171969d;

    /* renamed from: e */
    public final LinkedList<C64563mr3> f171970e = new LinkedList<>();

    @C91590f(mo125468c = "com.tencent.mm.plugin.repairer.ui.uic.RepairerSearchDataUIC$onCreate$1", mo125469f = "RepairerSearchDataUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: ij2.g$a */
    public static final class C60322a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C60321g f171971d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60322a(C60321g gVar, C15601d<? super C60322a> dVar) {
            super(2, dVar);
            this.f171971d = gVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C60322a(this.f171971d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C60322a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            UIStateCenter stateCenter;
            ResultKt.throwOnFailure(obj);
            C8479f0 f0Var = new C8479f0();
            f0Var.f27484d = new C64563mr3();
            byte[] byteArrayExtra = this.f171971d.getIntent().getByteArrayExtra("key_config_item_list");
            if (byteArrayExtra != null) {
                ((C64563mr3) f0Var.f27484d).parseFrom(byteArrayExtra);
            }
            this.f171971d.mo85302g3((C64563mr3) f0Var.f27484d);
            BaseMvvmActivity d3 = this.f171971d.mo14598d3();
            if (!(d3 == null || (stateCenter = d3.getStateCenter()) == null)) {
                stateCenter.dispatch(new C59929d(this.f171971d.f171970e));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ij2.g$b */
    public static final class C60323b extends C87413o implements C32226l<C59927b, C13598b0> {

        /* renamed from: d */
        public static final C60323b f171972d = new C60323b();

        public C60323b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C59927b bVar = (C59927b) obj;
            C87412m.m108594g(bVar, "state");
            IStateAction action = bVar.getAction();
            if (action != null && (action instanceof C59929d)) {
                bVar.f171036f = ((C59929d) action).f171038a;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ij2.g$c */
    public static final class C60324c extends C87413o implements C32226l<C59927b, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60321g f171973d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60324c(C60321g gVar) {
            super(1);
            this.f171973d = gVar;
        }

        public Object invoke(Object obj) {
            C59927b bVar = (C59927b) obj;
            C87412m.m108594g(bVar, "state");
            C60321g gVar = this.f171973d;
            IStateAction action = bVar.getAction();
            if (action != null && (action instanceof C59930e)) {
                C59930e eVar = (C59930e) action;
                C53973z1 z1Var = gVar.f171969d;
                C53973z1 z1Var2 = null;
                if (z1Var != null) {
                    C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                }
                LifecycleScope c3 = gVar.mo14597c3();
                if (c3 != null) {
                    z1Var2 = LifecycleScope.launchDefault$default(c3, (C53934p0) null, new C60325h(eVar, gVar, (C15601d<? super C60325h>) null), 1, (Object) null);
                }
                gVar.f171969d = z1Var2;
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60321g(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public final void mo85302g3(C64563mr3 mr32) {
        C87412m.m108594g(mr32, "repairerItem");
        LinkedList<C64563mr3> linkedList = mr32.f184385i;
        C87412m.m108593f(linkedList, "repairerItem.subItemList");
        for (C64563mr3 mr33 : linkedList) {
            if (mr33.f184382f == 1) {
                this.f171970e.add(mr33);
                mo85302g3(mr33);
            } else {
                this.f171970e.add(mr33);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter stateCenter;
        UIStateCenter stateCenter2;
        LifecycleScope c3 = mo14597c3();
        if (c3 != null) {
            LifecycleScope.launchDefault$default(c3, (C53934p0) null, new C60322a(this, (C15601d<? super C60322a>) null), 1, (Object) null);
        }
        BaseMvvmActivity d3 = mo14598d3();
        if (!(d3 == null || (stateCenter2 = d3.getStateCenter()) == null)) {
            stateCenter2.process((C0125s) getActivity(), C60323b.f171972d);
        }
        BaseMvvmActivity d35 = mo14598d3();
        if (d35 != null && (stateCenter = d35.getStateCenter()) != null) {
            stateCenter.observe((C0125s) getActivity(), new C60324c(this));
        }
    }

    public void onCreateAfter(Bundle bundle) {
        UIStateCenter stateCenter;
        BaseMvvmActivity d3 = mo14598d3();
        if (d3 != null && (stateCenter = d3.getStateCenter()) != null) {
            stateCenter.dispatch(new C59926a(new C64563mr3()));
        }
    }
}
