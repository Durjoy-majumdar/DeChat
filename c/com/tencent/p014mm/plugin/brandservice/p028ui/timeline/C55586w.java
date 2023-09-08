package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import com.tencent.p014mm.sdk.storage.sql.DeleteSql;
import eb0.C58540g4;
import ex0.C45696d;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87413o;
import i40.C60247c;
import p749xh.C118880v0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.w */
public final class C55586w extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C55586w f158257d = new C55586w();

    public C55586w() {
        super(0);
    }

    public Object invoke() {
        C39622i0 a;
        ((C45696d) C86709a0.m107533q(C45696d.class)).Wn0(false);
        DeleteSql build = C118880v0.f356010I.delete().build();
        Class cls = C58540g4.class;
        synchronized (C60247c.f171776h) {
            C86709a0.m107523b().mo121108c();
            if (C60247c.class.isAssignableFrom(cls)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        build.run(((C58540g4) a).getDB());
        return C13598b0.f38549a;
    }
}
