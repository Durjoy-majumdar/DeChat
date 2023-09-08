package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.c */
public final class C44624c extends C87413o implements C32224a<View> {

    /* renamed from: d */
    public final /* synthetic */ AppChooseItemCheckedView f121004d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44624c(AppChooseItemCheckedView appChooseItemCheckedView) {
        super(0);
        this.f121004d = appChooseItemCheckedView;
    }

    public Object invoke() {
        return C85868k2.m106137b(this.f121004d.getContext()).inflate(C0966R.C0971layout.czi, this.f121004d, false);
    }
}
