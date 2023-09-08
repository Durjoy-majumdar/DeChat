package com.tencent.p014mm.plugin.game.luggage.page;

import android.os.Bundle;
import com.tencent.p014mm.plugin.webview.luggage.C43626k0;
import com.tencent.p014mm.plugin.webview.luggage.C5872b0;
import com.tencent.p014mm.sdk.platformtools.Log;
import p361me.imid.swipebacklayout.lib.SwipeBackLayout;
import p828wa.C53118n;
import p828wa.C53133t;

/* renamed from: com.tencent.mm.plugin.game.luggage.page.b */
public class C41943b extends GameWebPage {
    public C41943b(C53118n nVar, C53133t tVar, Bundle bundle) {
        super(nVar, tVar, bundle);
        this.f117951u.setVisibility(8);
        this.f117925P.post(new C5872b0(this));
        SwipeBackLayout swipeBackLayout = this.f148260j;
        if (swipeBackLayout != null) {
            swipeBackLayout.setEnableGesture(false);
        }
    }

    /* renamed from: e */
    public void mo65797e() {
        Log.m105924i("MicroMsg.GameInsertWebPage", "onBackground");
        mo67932F("onPause");
        this.f117947q.onPause();
    }

    /* renamed from: g */
    public void mo65800g() {
        if (!this.f117942Y) {
            this.f117942Y = true;
            Log.m105924i("MicroMsg.GameInsertWebPage", "onDestroy");
            mo67932F("onDestroy");
            this.f117914D.f117787i = null;
            synchronized (C43626k0.f117877a) {
                C43626k0.f117878b.remove(this);
                C43626k0.f117879c.remove(C43626k0.m47359a(this));
            }
            this.f117922L.f122697n = true;
            this.f148259i.mo73818f();
        }
    }

    /* renamed from: h */
    public void mo65801h() {
        Log.m105924i("MicroMsg.GameInsertWebPage", "onForeground");
        mo67932F("onResume");
        this.f117947q.onResume();
    }

    /* renamed from: o */
    public boolean mo65820o() {
        return false;
    }
}
