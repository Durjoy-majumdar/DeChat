package com.tencent.p014mm.p136ui;

import android.content.DialogInterface;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;

/* renamed from: com.tencent.mm.ui.j0 */
public class C6979j0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Runnable f24706d;

    public C6979j0(FindMoreFriendsUI findMoreFriendsUI, Runnable runnable) {
        this.f24706d = runnable;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f24706d.run();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_JD_ENTRANCE_DECLARE_CLICK_BOOLEAN_SYNC, Boolean.TRUE);
    }
}
