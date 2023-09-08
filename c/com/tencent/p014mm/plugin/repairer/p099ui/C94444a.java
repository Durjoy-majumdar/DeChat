package com.tencent.p014mm.plugin.repairer.p099ui;

import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.repairer.ui.a */
public final class C94444a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ RepairerResDownloadUI f273086d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94444a(RepairerResDownloadUI repairerResDownloadUI) {
        super(0);
        this.f273086d = repairerResDownloadUI;
    }

    public Object invoke() {
        ((TextView) this.f273086d.findViewById(C0966R.C0970id.f358897hq2)).setText(this.f273086d.f273079d.toString());
        return C13598b0.f38549a;
    }
}
