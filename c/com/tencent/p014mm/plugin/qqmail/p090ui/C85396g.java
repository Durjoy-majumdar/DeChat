package com.tencent.p014mm.plugin.qqmail.p090ui;

import com.tencent.p014mm.autogen.events.NeedVerifyQQEvent;
import com.tencent.p014mm.plugin.qqmail.p090ui.C85397h;
import dg2.C86277g;
import eb0.C75576f4;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.qqmail.ui.g */
public class C85396g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NeedVerifyQQEvent f248851d;

    /* renamed from: e */
    public final /* synthetic */ C85397h f248852e;

    public C85396g(C85397h hVar, NeedVerifyQQEvent needVerifyQQEvent) {
        this.f248852e = hVar;
        this.f248851d = needVerifyQQEvent;
    }

    public void run() {
        if (this.f248851d.f236244e.f236247a) {
            C85397h hVar = this.f248852e;
            hVar.getClass();
            if (System.currentTimeMillis() - C85397h.f248853f <= 600000) {
                C85397h.C85398a aVar = hVar.f248854d;
                if (aVar != null) {
                    aVar.mo118650b();
                }
            } else if (C86709a0.m107523b().mo121114l()) {
                C86709a0.m107524d().mo123460f(new C75576f4(new C86277g(hVar), (String) null));
            }
        } else {
            C85397h.C85398a aVar2 = this.f248852e.f248854d;
            if (aVar2 != null) {
                aVar2.mo118650b();
            }
        }
    }
}
