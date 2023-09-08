package com.tencent.p014mm.plugin.finder.p056ui;

import android.app.ProgressDialog;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.ui.v1 */
public final class C3879v1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderModifyNameUI f17433d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3879v1(FinderModifyNameUI finderModifyNameUI) {
        super(0);
        this.f17433d = finderModifyNameUI;
    }

    public Object invoke() {
        FinderModifyNameUI finderModifyNameUI = this.f17433d;
        ProgressDialog progressDialog = finderModifyNameUI.f16957D;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        finderModifyNameUI.f16957D = null;
        return C13598b0.f38549a;
    }
}
