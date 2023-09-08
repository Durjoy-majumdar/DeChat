package com.tencent.p014mm.plugin.ipcall;

import com.tencent.p014mm.autogen.events.GetMFriendEvent;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.ipcall.a */
public class C4608a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C4609b f19405d;

    public C4608a(C4609b bVar) {
        this.f19405d = bVar;
    }

    public void run() {
        Log.m105918d("MicroMsg.IPCallAddressBookUsernameUpdater", "start GetMFriend");
        GetMFriendEvent getMFriendEvent = new GetMFriendEvent();
        getMFriendEvent.f9301d.f9302a = 2;
        getMFriendEvent.publish();
        this.f19405d.f19408e = System.currentTimeMillis();
    }
}
