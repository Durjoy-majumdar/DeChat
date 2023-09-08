package com.tencent.p014mm.plugin.choosemsgfile.p318ui;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.choosemsgfile.p318ui.ChooseMsgFileShowUI;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import nj3.C11184p0;
import p159gw.C98250h;
import p262wm.C22921c;
import p910lj.C76701a;
import s00.C110692d;

/* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.d */
public class C105122d implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ ChooseMsgFileShowUI.C105119c f312118d;

    /* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.d$a */
    public class C105123a implements C98250h.C98251a {
        public C105123a() {
        }

        /* renamed from: a */
        public void mo2055a(String str, String str2) {
            ChooseMsgFileShowUI chooseMsgFileShowUI = ChooseMsgFileShowUI.this;
            C76701a.makeText((Context) chooseMsgFileShowUI, (CharSequence) chooseMsgFileShowUI.getString(C0966R.string.k3c, new Object[]{AndroidMediaUtil.getFriendlySdcardPath(str2)}), 1).show();
        }

        /* renamed from: b */
        public void mo2056b(String str, String str2) {
            ChooseMsgFileShowUI chooseMsgFileShowUI = ChooseMsgFileShowUI.this;
            C76701a.makeText((Context) chooseMsgFileShowUI, (CharSequence) chooseMsgFileShowUI.getString(C0966R.string.k3b), 1).show();
        }
    }

    public C105122d(ChooseMsgFileShowUI.C105119c cVar) {
        this.f312118d = cVar;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            WXWebReporter.onPluginMenuSendClick(ChooseMsgFileShowUI.this.f312101e);
            ChooseMsgFileShowUI chooseMsgFileShowUI = ChooseMsgFileShowUI.this;
            ((C110692d) C86312j.m106911c(C110692d.class)).mo35328tq(chooseMsgFileShowUI, chooseMsgFileShowUI.f312100d, chooseMsgFileShowUI.f312103g, chooseMsgFileShowUI.f312101e);
        } else if (itemId == 1) {
            WXWebReporter.onPluginMenuOpenByOtherClick(ChooseMsgFileShowUI.this.f312101e);
            ChooseMsgFileShowUI chooseMsgFileShowUI2 = ChooseMsgFileShowUI.this;
            ((C22921c) C86312j.m106911c(C22921c.class)).M30(chooseMsgFileShowUI2, chooseMsgFileShowUI2.f312100d, chooseMsgFileShowUI2.f312101e, 8);
        } else if (itemId == 2) {
            ChooseMsgFileShowUI.this.f312106j.mo124068H(false, 1);
        } else if (itemId == 3) {
            ChooseMsgFileShowUI.this.f312106j.mo124068H(true, 1);
        } else if (itemId == 4) {
            ChooseMsgFileShowUI chooseMsgFileShowUI3 = ChooseMsgFileShowUI.this;
            ((C98250h) C86312j.m106911c(C98250h.class)).pk0(chooseMsgFileShowUI3, chooseMsgFileShowUI3.f312100d, new C105123a());
        }
    }
}
