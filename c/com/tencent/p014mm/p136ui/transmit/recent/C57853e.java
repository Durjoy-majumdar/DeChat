package com.tencent.p014mm.p136ui.transmit.recent;

import android.widget.ImageView;
import com.tencent.p014mm.ipcinvoker.C80906n;
import com.tencent.p014mm.plugin.appbrand.utils.C55552j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import gy3.C87412m;
import nj3.C61772i0;
import nj3.C76875f0;
import p196ln.C76705f;

/* renamed from: com.tencent.mm.ui.transmit.recent.e */
public final class C57853e implements C61772i0 {

    /* renamed from: a */
    public static final C57853e f165489a = new C57853e();

    /* renamed from: a */
    public final void mo77066a(ImageView imageView, C76875f0 f0Var) {
        if (Util.isNullOrNil(f0Var.f224730y)) {
            return;
        }
        if (!C87412m.m108589b(WeChatProcess.PROCESS_MAIN, C80906n.m98775b())) {
            try {
                C55552j jVar = C55552j.f158177a;
                C87412m.m108593f(imageView, "iconIv");
                String str = f0Var.f224730y;
                C87412m.m108593f(str, "menuItem.webUrl");
                jVar.mo77082a(imageView, str);
            } catch (Exception e) {
                Log.m105920e("MircoMsg.RecentForwardUtils", "attachAvatar for username:" + f0Var.f224730y + ", get exception:" + e);
            }
        } else {
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(imageView, f0Var.f224730y);
        }
    }
}
