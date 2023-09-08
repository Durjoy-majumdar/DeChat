package com.tencent.p014mm.p136ui.contact;

import com.tencent.p014mm.p136ui.contact.OpenIMAddressUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.contact.n2 */
public class C74529n2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ OpenIMAddressUI.OpenIMAddressUIFragment f219099d;

    public C74529n2(OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment) {
        this.f219099d = openIMAddressUIFragment;
    }

    public void run() {
        Log.m105926v("MicroMsg.OpenIMAddressUI", "post search adapter to do refresh");
        this.f219099d.f218697g.mo7991f();
    }
}
