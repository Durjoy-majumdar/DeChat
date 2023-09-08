package com.tencent.p014mm.p136ui;

import com.tencent.p014mm.autogen.events.GlobalAlertEvent;
import com.tencent.p014mm.p136ui.GlobalAlertMgr;

/* renamed from: com.tencent.mm.ui.GlobalAlertMgr$1$$a */
public final /* synthetic */ class GlobalAlertMgr$1$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GlobalAlertMgr.C730181 f214250d;

    /* renamed from: e */
    public final /* synthetic */ GlobalAlertEvent f214251e;

    public /* synthetic */ GlobalAlertMgr$1$$a(GlobalAlertMgr.C730181 r1, GlobalAlertEvent globalAlertEvent) {
        this.f214250d = r1;
        this.f214251e = globalAlertEvent;
    }

    public final void run() {
        GlobalAlertMgr.this.mo101300d(this.f214251e.f193674d);
    }
}
