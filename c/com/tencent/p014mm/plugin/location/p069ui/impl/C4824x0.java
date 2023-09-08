package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.x0 */
public class C4824x0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f19900d;

    public C4824x0(s0$$l s0__l, Context context) {
        this.f19900d = context;
    }

    public void run() {
        Context context = this.f19900d;
        C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.jyv), 0).show();
    }
}
