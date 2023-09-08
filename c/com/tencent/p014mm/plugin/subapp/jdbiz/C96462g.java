package com.tencent.p014mm.plugin.subapp.jdbiz;

import com.tencent.p014mm.autogen.events.JDSysMsgNotifyEvent;

/* renamed from: com.tencent.mm.plugin.subapp.jdbiz.g */
public class C96462g implements Runnable {
    public C96462g(C96463h hVar) {
    }

    public void run() {
        new JDSysMsgNotifyEvent().publish();
    }
}
