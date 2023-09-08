package com.tencent.p014mm.plugin.appbrand.jsapi.h5_interact;

import com.tencent.p014mm.plugin.appbrand.ipc.MMToClientEvent;
import li0.C88508b;
import li0.C88509c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.h5_interact.b */
public class C82527b implements C88509c.C88512b {

    /* renamed from: d */
    public final /* synthetic */ MMToClientEvent.C81947d f241630d;

    public C82527b(MMToClientEvent.C81947d dVar) {
        this.f241630d = dVar;
    }

    /* renamed from: b */
    public void mo113102b(String str, C88508b bVar) {
        if (bVar == C88508b.DESTROYED) {
            MMToClientEvent.m100657u(str, this.f241630d);
        }
    }
}
