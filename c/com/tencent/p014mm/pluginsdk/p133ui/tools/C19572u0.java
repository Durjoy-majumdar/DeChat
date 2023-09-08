package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.tools.MiniQBReaderUI;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import p159gw.C98250h;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.u0 */
public class C19572u0 implements C98250h.C98251a {

    /* renamed from: a */
    public final /* synthetic */ MiniQBReaderUI.C195261 f55389a;

    public C19572u0(MiniQBReaderUI.C195261 r1) {
        this.f55389a = r1;
    }

    /* renamed from: a */
    public void mo2055a(String str, String str2) {
        MiniQBReaderUI miniQBReaderUI = MiniQBReaderUI.this;
        C76701a.makeText((Context) miniQBReaderUI, (CharSequence) miniQBReaderUI.getString(C0966R.string.k3c, new Object[]{AndroidMediaUtil.getFriendlySdcardPath(str2)}), 1).show();
    }

    /* renamed from: b */
    public void mo2056b(String str, String str2) {
        MiniQBReaderUI miniQBReaderUI = MiniQBReaderUI.this;
        C76701a.makeText((Context) miniQBReaderUI, (CharSequence) miniQBReaderUI.getString(C0966R.string.k3b), 1).show();
    }
}
