package com.tencent.p014mm.p136ui.contact;

import com.tencent.p014mm.p136ui.contact.AddressUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.contact.i */
public class C74501i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AddressUI.AddressUIFragment f219054d;

    public C74501i(AddressUI.AddressUIFragment addressUIFragment) {
        this.f219054d = addressUIFragment;
    }

    public void run() {
        Log.m105926v("MicroMsg.AddressUI", "post search adapter to do refresh");
        this.f219054d.f218437r.mo7991f();
    }
}
