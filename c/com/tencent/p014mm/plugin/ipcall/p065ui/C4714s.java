package com.tencent.p014mm.plugin.ipcall.p065ui;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C97625j3;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.s */
public class C4714s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C4725w f19720d;

    public C4714s(C4725w wVar) {
        this.f19720d = wVar;
    }

    public void run() {
        if (((Boolean) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_IPCALL_ADDRESS_ACCOUNT_SHOW_REDDOT_BOOLEAN, Boolean.FALSE)).booleanValue()) {
            this.f19720d.f19740j.setVisibility(0);
        } else {
            this.f19720d.f19740j.setVisibility(8);
        }
        String str = (String) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERFINO_IPCALL_ADDRESS_ACCOUNT_STRING, "");
        String str2 = (String) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERFINO_IPCALL_ADDRESS_ACCOUNT_ACTIVITY_STRING, "");
        if (!Util.isNullOrNil(str)) {
            this.f19720d.f19739i.setText(str);
            this.f19720d.f19738h.setVisibility(0);
        } else if (!Util.isNullOrNil(str2)) {
            this.f19720d.f19739i.setText(str2);
            this.f19720d.f19738h.setVisibility(0);
        } else {
            this.f19720d.f19739i.setText("");
            this.f19720d.f19738h.setVisibility(8);
        }
    }
}
