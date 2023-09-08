package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import p159gw.C98250h;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.ui.chatting.j */
public class C19749j implements C98250h.C98251a {

    /* renamed from: a */
    public final /* synthetic */ AppAttachDownloadUI f56170a;

    public C19749j(AppAttachDownloadUI appAttachDownloadUI) {
        this.f56170a = appAttachDownloadUI;
    }

    /* renamed from: a */
    public void mo2055a(String str, String str2) {
        AppAttachDownloadUI appAttachDownloadUI = this.f56170a;
        C76701a.makeText((Context) appAttachDownloadUI, (CharSequence) appAttachDownloadUI.getString(C0966R.string.k3c, new Object[]{AndroidMediaUtil.getFriendlySdcardPath(str2)}), 1).show();
    }

    /* renamed from: b */
    public void mo2056b(String str, String str2) {
        AppAttachDownloadUI appAttachDownloadUI = this.f56170a;
        C76701a.makeText((Context) appAttachDownloadUI, (CharSequence) appAttachDownloadUI.getString(C0966R.string.k3b), 1).show();
    }
}
