package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import gy3.C87412m;
import p159gw.C98250h;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.g1 */
public final class C19560g1 implements C98250h.C98251a {

    /* renamed from: a */
    public final /* synthetic */ QBFileMenuBottomSheetHelper f55370a;

    public C19560g1(QBFileMenuBottomSheetHelper qBFileMenuBottomSheetHelper) {
        this.f55370a = qBFileMenuBottomSheetHelper;
    }

    /* renamed from: a */
    public void mo2055a(String str, String str2) {
        C87412m.m108594g(str, "srcPath");
        C87412m.m108594g(str2, "destPath");
        MMActivity mMActivity = this.f55370a.f55282a;
        C76701a.makeText((Context) mMActivity, (CharSequence) mMActivity.getString(C0966R.string.k3c, new Object[]{AndroidMediaUtil.getFriendlySdcardPath(str2)}), 1).show();
    }

    /* renamed from: b */
    public void mo2056b(String str, String str2) {
        C87412m.m108594g(str, "srcPath");
        C87412m.m108594g(str2, "destPath");
        MMActivity mMActivity = this.f55370a.f55282a;
        C76701a.makeText((Context) mMActivity, (CharSequence) mMActivity.getString(C0966R.string.k3b), 1).show();
    }
}
