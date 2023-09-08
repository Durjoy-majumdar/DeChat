package com.tencent.p014mm.plugin.appbrand.ipc;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87413o;
import ke3.C88144b;
import p910lj.C76701a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.ipc.a */
public final class C1535a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C1535a f10907d = new C1535a();

    public C1535a() {
        super(0);
    }

    public Object invoke() {
        C76701a.makeText(MMApplicationContext.getContext(), (int) C0966R.string.f7586ke, 0).show();
        try {
            C88144b.m109801s(MMApplicationContext.getContext(), "com.tencent.mm.ui.LauncherUI", new Intent().addFlags(268435456).addFlags(67108864), (Bundle) null);
        } catch (Exception unused) {
        }
        return C13598b0.f38549a;
    }
}
