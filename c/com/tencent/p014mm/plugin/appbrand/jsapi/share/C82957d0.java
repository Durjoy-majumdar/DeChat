package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.d0 */
public final class C82957d0 implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ MMActivity.C6739d f242583a;

    public C82957d0(MMActivity.C6739d dVar) {
        this.f242583a = dVar;
    }

    /* renamed from: b */
    public final boolean mo1596b(int i, int i2, Intent intent) {
        if (C82961f0.f242592b != i) {
            return false;
        }
        this.f242583a.mmOnActivityResult(i, i2, intent);
        return true;
    }
}
