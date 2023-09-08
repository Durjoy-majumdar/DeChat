package bj2;

import a14.C0000n0;
import a14.C53934p0;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.LongSparseArray;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C24565l;
import gy3.C8478d0;
import gy3.C87412m;
import hi3.C87520e;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.ResultKt;
import rx3.C13598b0;
import sx3.C77813z;
import wx3.C15601d;
import yb2.C15946a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: bj2.c0 */
public final class C67256c0 extends C15946a {

    /* renamed from: bj2.c0$a */
    public /* synthetic */ class C67257a extends C24565l implements C32226l<C67274k0, C13598b0> {
        public C67257a(Object obj) {
            super(1, obj, C67256c0.class, "processState", "processState(Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerSvgDemoState;)V", 0);
        }

        public Object invoke(Object obj) {
            C67274k0 k0Var = (C67274k0) obj;
            C87412m.m108594g(k0Var, "p0");
            ((C67256c0) this.receiver).getClass();
            IStateAction action = k0Var.getAction();
            if (action != null && (action instanceof C67262d0)) {
                ((ArrayList) k0Var.f193110e).addAll(((C67262d0) action).f193097a);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: bj2.c0$b */
    public /* synthetic */ class C67258b extends C24565l implements C32226l<C67274k0, C13598b0> {
        public C67258b(Object obj) {
            super(1, obj, C67256c0.class, "observeState", "observeState(Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerSvgDemoState;)V", 0);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C67274k0) obj, "p0");
            ((C67256c0) this.receiver).getClass();
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.repairer.ui.demo.RepairerSvgDemoDataUIC$onCreateAfter$1", mo125469f = "RepairerSvgDemoUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: bj2.c0$c */
    public static final class C67259c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C67256c0 f193094d;

        /* renamed from: bj2.c0$c$a */
        public static final class C67260a<T> implements Comparator {

            /* renamed from: d */
            public static final C67260a<T> f193095d = new C67260a<>();

            public int compare(Object obj, Object obj2) {
                return ((C67265e0) obj).f193102g.compareTo(((C67265e0) obj2).f193102g);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C67259c(C67256c0 c0Var, C15601d<? super C67259c> dVar) {
            super(2, dVar);
            this.f193094d = c0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C67259c(this.f193094d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C67259c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            C8478d0 d0Var = new C8478d0();
            LongSparseArray<Drawable.ConstantState> longSparseArray = C87520e.f253547c;
            C87412m.m108593f(longSparseArray, "getSVGResArray()");
            int size = longSparseArray.size();
            for (int i = 0; i < size; i++) {
                longSparseArray.keyAt(i);
                Drawable.ConstantState valueAt = longSparseArray.valueAt(i);
                if (valueAt instanceof C87520e.C87524d) {
                    int i2 = d0Var.f27483d + 1;
                    d0Var.f27483d = i2;
                    int i3 = ((C87520e.C87524d) valueAt).f253573a;
                    String resourceName = MMApplicationContext.getContext().getResources().getResourceName(i3);
                    C87412m.m108593f(resourceName, "getContext().resources.getResourceName(svgRes)");
                    String substring = resourceName.substring(19);
                    C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
                    arrayList.add(new C67265e0(String.valueOf(i2), i2, i3, substring));
                }
            }
            C77813z.m93909o(arrayList, C67260a.f193095d);
            UIStateCenter e3 = this.f193094d.mo14599e3();
            if (e3 != null) {
                e3.dispatch(new C67262d0(arrayList));
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67256c0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter e3 = mo14599e3();
        if (e3 != null) {
            e3.process((C0125s) getActivity(), new C67257a(this));
        }
        UIStateCenter e35 = mo14599e3();
        if (e35 != null) {
            e35.observe((C0125s) getActivity(), new C67258b(this));
        }
    }

    public void onCreateAfter(Bundle bundle) {
        super.onCreateAfter(bundle);
        LifecycleScope c3 = mo14597c3();
        if (c3 != null) {
            LifecycleScope.launchDefault$default(c3, (C53934p0) null, new C67259c(this, (C15601d<? super C67259c>) null), 1, (Object) null);
        }
    }
}
