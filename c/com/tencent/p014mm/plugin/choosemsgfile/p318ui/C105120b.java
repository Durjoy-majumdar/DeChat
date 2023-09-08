package com.tencent.p014mm.plugin.choosemsgfile.p318ui;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.choosemsgfile.p318ui.ChooseMsgFileShowUI;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import p159gw.C98250h;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.b */
public class C105120b implements C98250h.C98251a {

    /* renamed from: a */
    public final /* synthetic */ ChooseMsgFileShowUI.C1051161 f312116a;

    public C105120b(ChooseMsgFileShowUI.C1051161 r1) {
        this.f312116a = r1;
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
