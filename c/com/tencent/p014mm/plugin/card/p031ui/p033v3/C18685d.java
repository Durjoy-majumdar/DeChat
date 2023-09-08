package com.tencent.p014mm.plugin.card.p031ui.p033v3;

import android.view.MenuItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import lz0.C46918d;
import nj3.C11184p0;
import nr3.C89059e;
import o40.C61926c;
import tz0.C22561a;

/* renamed from: com.tencent.mm.plugin.card.ui.v3.d */
public final class C18685d implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ CardHomePageV3UI f52247d;

    /* renamed from: e */
    public final /* synthetic */ String f52248e;

    /* renamed from: f */
    public final /* synthetic */ String f52249f;

    public C18685d(CardHomePageV3UI cardHomePageV3UI, String str, String str2) {
        this.f52247d = cardHomePageV3UI;
        this.f52248e = str;
        this.f52249f = str2;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 1) {
            CardHomePageV3UI cardHomePageV3UI = this.f52247d;
            String str = this.f52248e;
            String str2 = this.f52249f;
            cardHomePageV3UI.getClass();
            C87412m.m108594g(str, "cardId");
            C87412m.m108594g(str2, "userCardId");
            String str3 = cardHomePageV3UI.f52083d;
            Log.m105924i(str3, "do remove recently: " + str + ", " + str2);
            C46918d dVar = new C46918d(str, str2);
            dVar.f256791h = true;
            C89059e i2 = dVar.mo9225i();
            C87412m.m108593f(i2, "CgiRemoveCardInRecentlyU…ntCancelAfterDead().run()");
            C61926c.m72665J(i2, new C22561a(cardHomePageV3UI, str2)).mo11397F(cardHomePageV3UI);
        }
    }
}
