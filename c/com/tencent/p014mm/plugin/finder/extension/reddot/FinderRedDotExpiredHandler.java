package com.tencent.p014mm.plugin.finder.extension.reddot;

import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotExpiredHandler */
public final class FinderRedDotExpiredHandler implements C114668z {

    /* renamed from: d */
    public final FinderRedDotManager f158519d;

    /* renamed from: e */
    public final MMHandler f158520e = new MMHandler("FinderRedDotExpired");

    /* renamed from: f */
    public final FinderRedDotExpiredHandler$mainUiIndexChangeListener$1 f158521f = new FinderRedDotExpiredHandler$mainUiIndexChangeListener$1(this, C40008f.f107254d);

    public FinderRedDotExpiredHandler(FinderRedDotManager finderRedDotManager) {
        C87412m.m108594g(finderRedDotManager, "redDotManager");
        this.f158519d = finderRedDotManager;
    }

    /* renamed from: a */
    public static void m63314a(FinderRedDotExpiredHandler finderRedDotExpiredHandler, String str, String str2, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            j = 0;
        }
        finderRedDotExpiredHandler.f158520e.post(new C55710d0(str, j, finderRedDotExpiredHandler, str3));
    }

    public void onAppBackground(String str) {
        m63314a(this, "onAppBackground", "Discovery", 0, 4, (Object) null);
    }

    public void onAppForeground(String str) {
    }
}
