package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.d */
public final class C44633d extends C87413o implements C32224a<View> {

    /* renamed from: d */
    public final /* synthetic */ AppChooseItemCheckedView f121032d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44633d(AppChooseItemCheckedView appChooseItemCheckedView) {
        super(0);
        this.f121032d = appChooseItemCheckedView;
    }

    public Object invoke() {
        return C85868k2.m106137b(this.f121032d.getContext()).inflate(C0966R.C0971layout.anu, this.f121032d, false);
    }
}
