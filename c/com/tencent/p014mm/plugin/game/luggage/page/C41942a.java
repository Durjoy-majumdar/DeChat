package com.tencent.p014mm.plugin.game.luggage.page;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import p361me.imid.swipebacklayout.lib.SwipeBackLayout;
import p828wa.C53118n;
import p828wa.C53133t;

/* renamed from: com.tencent.mm.plugin.game.luggage.page.a */
public class C41942a extends GameWebPage {
    public C41942a(C53118n nVar, C53133t tVar, Bundle bundle) {
        super(nVar, tVar, bundle);
        SwipeBackLayout swipeBackLayout = this.f148260j;
        if (swipeBackLayout != null) {
            swipeBackLayout.setEnableGesture(false);
        }
        ((C41962j) this.f117947q).setShouldCleanPkgWhenDestroy(true);
        this.f148258h.setTag("game_float_view_tag");
    }

    /* renamed from: J */
    public void mo65783J(int i, String str, String str2) {
        mo67938q(false);
    }

    /* renamed from: P */
    public void mo65787P(boolean z) {
        super.mo65787P(z);
    }

    /* renamed from: Q */
    public void mo65817Q(String str) {
        this.f117948r.setPullDownEnabled(false);
    }

    /* renamed from: R */
    public void mo65818R(String str, int i) {
        super.mo65818R("微信游戏", i);
    }

    /* renamed from: S */
    public void mo65788S() {
    }

    /* renamed from: d */
    public boolean mo65819d() {
        mo67939r();
        return true;
    }

    /* renamed from: h */
    public void mo65801h() {
        Log.m105924i("MicroMsg.GameFloatLayerWebPage", "onForeground");
        super.mo65801h();
        mo65818R("微信游戏", 0);
        this.f117948r.mo6967g();
    }

    /* renamed from: l */
    public View mo65803l() {
        View l = super.mo65803l();
        this.f117950t.setBackgroundColor(0);
        return l;
    }

    /* renamed from: o */
    public boolean mo65820o() {
        return false;
    }
}
