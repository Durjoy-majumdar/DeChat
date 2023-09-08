package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.y0 */
public class C4825y0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f19901d;

    public C4825y0(s0$$l s0__l, Context context) {
        this.f19901d = context;
    }

    public void run() {
        Context context = this.f19901d;
        C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.jyx), 0).show();
    }
}
