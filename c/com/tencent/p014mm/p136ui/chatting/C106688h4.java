package com.tencent.p014mm.p136ui.chatting;

import android.webkit.ValueCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import nj3.C76912y0;

/* renamed from: com.tencent.mm.ui.chatting.h4 */
public final class C106688h4<T> implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C106690i4 f318941a;

    public C106688h4(C106690i4 i4Var) {
        this.f318941a = i4Var;
    }

    public void onReceiveValue(Object obj) {
        Integer num = (Integer) obj;
        if (num == null || num.intValue() != 0) {
            if (num != null && -17 == num.intValue()) {
                C76912y0.m92767f(this.f318941a.getContext(), this.f318941a.getContext().getString(C0966R.string.cv8));
            } else {
                C76912y0.m92767f(this.f318941a.getContext(), this.f318941a.getContext().getString(C0966R.string.ifp));
            }
            if (this.f318941a.f318945f == 3) {
                C105851w0.zx0().mo150664h();
            }
        }
    }
}
