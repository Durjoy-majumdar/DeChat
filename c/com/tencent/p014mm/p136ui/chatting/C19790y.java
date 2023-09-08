package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import p159gw.C98250h;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.ui.chatting.y */
public class C19790y implements C98250h.C98251a {

    /* renamed from: a */
    public final /* synthetic */ AppAttachNewDownloadUI f56316a;

    public C19790y(AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f56316a = appAttachNewDownloadUI;
    }

    /* renamed from: a */
    public void mo2055a(String str, String str2) {
        AppAttachNewDownloadUI appAttachNewDownloadUI = this.f56316a;
        C76701a.makeText((Context) appAttachNewDownloadUI, (CharSequence) appAttachNewDownloadUI.getString(C0966R.string.k3c, new Object[]{AndroidMediaUtil.getFriendlySdcardPath(str2)}), 1).show();
    }

    /* renamed from: b */
    public void mo2056b(String str, String str2) {
        AppAttachNewDownloadUI appAttachNewDownloadUI = this.f56316a;
        C76701a.makeText((Context) appAttachNewDownloadUI, (CharSequence) appAttachNewDownloadUI.getString(C0966R.string.k3b), 1).show();
    }
}
