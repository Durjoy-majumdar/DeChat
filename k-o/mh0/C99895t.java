package mh0;

import android.content.Context;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import i40.C60247c;
import i40.C98597b;
import i40.C98598e;
import p548hg.C76165c;
import rh0.C101376a;

/* renamed from: mh0.t */
public final class C99895t extends C98597b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99895t(C98598e eVar) {
        super(eVar);
        C87412m.m108594g(eVar, "service");
    }

    /* renamed from: d3 */
    public void mo57310d3(Context context) {
        C39622i0 a;
        C87412m.m108594g(context, "context");
        Class cls = C101376a.class;
        synchronized (C60247c.f171776h) {
            C86709a0.m107523b().mo121108c();
            if (C60247c.class.isAssignableFrom(cls)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        C101376a aVar = (C101376a) a;
        aVar.getClass();
        aVar.mo85232c3(C86709a0.m107535s().f251807e + "AlbumMsgCDN-1.db");
        ((C76165c) C86312j.m106911c(C76165c.class)).run();
    }

    /* renamed from: f3 */
    public void mo57311f3() {
        ((C76165c) C86312j.m106911c(C76165c.class)).stop();
    }
}
