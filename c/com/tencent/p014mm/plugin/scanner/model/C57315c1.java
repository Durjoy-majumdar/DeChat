package com.tencent.p014mm.plugin.scanner.model;

import cc0.C92411b;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import rx3.C13598b0;
import te3.C64852yd;

/* renamed from: com.tencent.mm.plugin.scanner.model.c1 */
public final class C57315c1 implements C92411b.C92412a {

    /* renamed from: d */
    public final /* synthetic */ C32226l<C64852yd, C13598b0> f164188d;

    public C57315c1(C32226l<? super C64852yd, C13598b0> lVar) {
        this.f164188d = lVar;
    }

    public final boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
        C64852yd ydVar;
        Log.m105924i("MicroMsg.ScanProductShowBoxDialogHelper", "getLocationIfNeed success: " + z);
        if (z) {
            ydVar = new C64852yd();
            ydVar.f186491e = f;
            ydVar.f186490d = f2;
            ydVar.f186492f = (float) d2;
            ydVar.f186493g = false;
        } else {
            ydVar = null;
        }
        this.f164188d.invoke(ydVar);
        return true;
    }
}
