package com.tencent.p014mm.plugin.record.p094ui;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import p159gw.C98250h;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.record.ui.l */
public class C5042l implements C98250h.C98251a {

    /* renamed from: a */
    public final /* synthetic */ String f20380a;

    /* renamed from: b */
    public final /* synthetic */ RecordMsgImageUI f20381b;

    public C5042l(RecordMsgImageUI recordMsgImageUI, String str) {
        this.f20381b = recordMsgImageUI;
        this.f20380a = str;
    }

    /* renamed from: a */
    public void mo2055a(String str, String str2) {
        Log.m105925i("MicroMsg.ShowImageUI", "save video now video path %s out path %s", this.f20380a, str2);
        C76701a.makeText((Context) this.f20381b.getContext(), (CharSequence) this.f20381b.getString(C0966R.string.kah, new Object[]{AndroidMediaUtil.getFriendlySdcardPath(str2)}), 1).show();
        AndroidMediaUtil.refreshMediaScanner(str2, this.f20381b.getContext());
    }

    /* renamed from: b */
    public void mo2056b(String str, String str2) {
        Log.m105925i("MicroMsg.ShowImageUI", "save video now video path %s out path %s", this.f20380a, str2);
        C76701a.makeText((Context) this.f20381b.getContext(), (CharSequence) this.f20381b.getString(C0966R.string.kag), 1).show();
    }
}
