package com.tencent.p014mm.plugin.updater.p116ui;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;
import nj3.C76912y0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.updater.ui.a */
public final class C5667a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AutoUpdateDialogSettingUI f21638d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5667a(AutoUpdateDialogSettingUI autoUpdateDialogSettingUI) {
        super(0);
        this.f21638d = autoUpdateDialogSettingUI;
    }

    public Object invoke() {
        C76912y0.makeText((Context) this.f21638d.getContext(), (CharSequence) this.f21638d.getString(C0966R.string.a0g), 0).show();
        return C13598b0.f38549a;
    }
}
