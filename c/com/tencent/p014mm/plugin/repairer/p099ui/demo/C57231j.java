package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import rx3.C36570n;
import zb2.C103009m;

/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.j */
public final class C57231j extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ RepairerMvvmDBDemoUI f163962d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57231j(RepairerMvvmDBDemoUI repairerMvvmDBDemoUI) {
        super(0);
        this.f163962d = repairerMvvmDBDemoUI;
    }

    public Object invoke() {
        RepairerMvvmDBDemoUI repairerMvvmDBDemoUI = this.f163962d;
        repairerMvvmDBDemoUI.f163936e = (WxRecyclerView) repairerMvvmDBDemoUI.findViewById(C0966R.C0970id.f358896hq1);
        RepairerMvvmDBDemoUI repairerMvvmDBDemoUI2 = this.f163962d;
        WxRecyclerView wxRecyclerView = repairerMvvmDBDemoUI2.f163936e;
        if (wxRecyclerView != null) {
            wxRecyclerView.setAdapter((C103009m) ((C36570n) repairerMvvmDBDemoUI2.f163938g).getValue());
        }
        RepairerMvvmDBDemoUI repairerMvvmDBDemoUI3 = this.f163962d;
        WxRecyclerView wxRecyclerView2 = repairerMvvmDBDemoUI3.f163936e;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setLayoutManager(new LinearLayoutManager(repairerMvvmDBDemoUI3));
        }
        return C13598b0.f38549a;
    }
}
