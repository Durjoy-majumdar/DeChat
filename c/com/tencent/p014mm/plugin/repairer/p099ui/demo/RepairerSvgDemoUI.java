package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.lifecycle.C0125s;
import bj2.C67256c0;
import bj2.C67262d0;
import bj2.C67266f0;
import bj2.C67268h0;
import bj2.C67270j0;
import bj2.C67274k0;
import bj2.C67278l0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import fy3.C32226l;
import gy3.C24565l;
import gy3.C87412m;
import java.util.HashSet;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerSvgDemoUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerSvgDemoUI */
public final class RepairerSvgDemoUI extends BaseMvvmActivity {

    /* renamed from: d */
    public static final /* synthetic */ int f205464d = 0;

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerSvgDemoUI$a */
    public static final class C70995a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerSvgDemoUI f205465d;

        public C70995a(RepairerSvgDemoUI repairerSvgDemoUI) {
            this.f205465d = repairerSvgDemoUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f205465d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerSvgDemoUI$b */
    public /* synthetic */ class C70996b extends C24565l implements C32226l<C67274k0, C13598b0> {
        public C70996b(Object obj) {
            super(1, obj, RepairerSvgDemoUI.class, "processState", "processState(Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerSvgDemoState;)V", 0);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C67274k0) obj, "p0");
            int i = RepairerSvgDemoUI.f205464d;
            ((RepairerSvgDemoUI) this.receiver).getClass();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerSvgDemoUI$c */
    public /* synthetic */ class C70997c extends C24565l implements C32226l<C67274k0, C13598b0> {
        public C70997c(Object obj) {
            super(1, obj, RepairerSvgDemoUI.class, "observeState", "observeState(Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerSvgDemoState;)V", 0);
        }

        public Object invoke(Object obj) {
            C67274k0 k0Var = (C67274k0) obj;
            C87412m.m108594g(k0Var, "p0");
            RepairerSvgDemoUI repairerSvgDemoUI = (RepairerSvgDemoUI) this.receiver;
            int i = RepairerSvgDemoUI.f205464d;
            repairerSvgDemoUI.getClass();
            IStateAction action = k0Var.getAction();
            if (action != null && (action instanceof C67262d0)) {
                C67262d0 d0Var = (C67262d0) action;
                repairerSvgDemoUI.setMMTitle(k0Var.f193109d);
            }
            IStateAction action2 = k0Var.getAction();
            if (action2 != null && (action2 instanceof C67266f0)) {
                Toast.makeText(repairerSvgDemoUI, "RepairerSvgDemo(" + ((C67266f0) action2).f193103a.f193099d + ")Click", 0).show();
            }
            IStateAction action3 = k0Var.getAction();
            if (action3 != null && (action3 instanceof C67268h0)) {
                Toast.makeText(repairerSvgDemoUI, "RepairerSvgDemo(" + ((C67268h0) action3).f193104a.f193099d + ")LongClick", 0).show();
            }
            return C13598b0.f38549a;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.czd;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new C70995a(this));
        UIStateCenter stateCenter = getStateCenter();
        if (stateCenter != null) {
            stateCenter.process((C0125s) this, new C70996b(this));
        }
        UIStateCenter stateCenter2 = getStateCenter();
        if (stateCenter2 != null) {
            stateCenter2.observe((C0125s) this, new C70997c(this));
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C67256c0.class);
        hashSet.add(C67278l0.class);
        hashSet.add(C67270j0.class);
    }
}
