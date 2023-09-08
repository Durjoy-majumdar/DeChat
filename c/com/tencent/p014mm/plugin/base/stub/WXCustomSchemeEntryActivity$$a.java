package com.tencent.p014mm.plugin.base.stub;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C40360i0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C76912y0;
import ob0.C117747y;
import te3.wj4;
import wc3.C90945m;

/* renamed from: com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity$$a */
public final /* synthetic */ class WXCustomSchemeEntryActivity$$a implements C90945m.C53147h {

    /* renamed from: a */
    public final /* synthetic */ WXCustomSchemeEntryActivity f247905a;

    public /* synthetic */ WXCustomSchemeEntryActivity$$a(WXCustomSchemeEntryActivity wXCustomSchemeEntryActivity) {
        this.f247905a = wXCustomSchemeEntryActivity;
    }

    /* renamed from: c */
    public final void mo62709c(int i, int i2, String str, C117747y yVar, boolean z) {
        wj4 h;
        WXCustomSchemeEntryActivity wXCustomSchemeEntryActivity = this.f247905a;
        int i3 = WXCustomSchemeEntryActivity.f247903e;
        wXCustomSchemeEntryActivity.getClass();
        Log.m105925i("MicroMsg.WXCustomSchemeEntryActivity", "DeepLinkHelper.DeepLinkCallback, %d, %d, %s, %b", Integer.valueOf(i), Integer.valueOf(i2), str, Boolean.valueOf(z));
        if (yVar != null && i != 0 && i2 != 0 && (yVar instanceof C40360i0) && (h = ((C40360i0) yVar).mo63047h()) != null && !wXCustomSchemeEntryActivity.isFinishing() && !Util.isNullOrNil(h.f144098g)) {
            C76912y0.makeText((Context) wXCustomSchemeEntryActivity, (CharSequence) wXCustomSchemeEntryActivity.getString(C0966R.string.a3h) + " : " + Util.nullAsNil(h.f144098g), 0).show();
        }
    }
}
