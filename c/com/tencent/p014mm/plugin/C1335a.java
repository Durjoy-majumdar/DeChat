package com.tencent.p014mm.plugin;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;
import nj3.C76912y0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.a */
public final class C1335a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Context f10472d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1335a(Context context) {
        super(0);
        this.f10472d = context;
    }

    public Object invoke() {
        C76912y0.makeText(this.f10472d, (int) C0966R.string.jde, 0).show();
        return C13598b0.f38549a;
    }
}
