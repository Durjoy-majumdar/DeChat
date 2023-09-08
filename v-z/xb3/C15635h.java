package xb3;

import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import com.tencent.xweb.WCWebUpdater;
import gy3.C87412m;
import kg3.C76577a;
import lg3.C76695c;

/* renamed from: xb3.h */
public final class C15635h {

    /* renamed from: a */
    public static final C15635h f42265a = new C15635h();

    /* renamed from: a */
    public final void mo14380a(String str, String str2, String str3, String str4) {
        C87412m.m108594g(str, "bizType");
        C87412m.m108594g(str2, "bizId");
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[8];
        int i = 0;
        objArr[0] = str;
        objArr[1] = str2;
        objArr[2] = str3;
        objArr[3] = str4;
        objArr[4] = Integer.valueOf(C85875k4.m106211z() ? 1 : 0);
        objArr[5] = "";
        objArr[6] = Integer.valueOf(C76695c.m92341b() ? 1 : 0);
        if (C76577a.m92165p(MMApplicationContext.getContext()) > 1.0f) {
            i = 1;
        }
        objArr[7] = Integer.valueOf(i);
        nVar.mo160131h(24610, objArr);
    }

    /* renamed from: b */
    public final void mo14381b(String str, String str2, String str3) {
        C87412m.m108594g(str, "functionId");
        C87412m.m108594g(str2, OpenSDKTool4Assistant.EXTRA_ERROR_CODE);
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[8];
        int i = 0;
        objArr[0] = WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL;
        objArr[1] = str;
        objArr[2] = str2;
        objArr[3] = str3;
        objArr[4] = "";
        objArr[5] = Integer.valueOf(C85875k4.m106211z() ? 1 : 0);
        objArr[6] = Integer.valueOf(C76695c.m92341b() ? 1 : 0);
        if (C76577a.m92165p(MMApplicationContext.getContext()) > 1.0f) {
            i = 1;
        }
        objArr[7] = Integer.valueOf(i);
        nVar.mo160131h(24610, objArr);
    }
}
