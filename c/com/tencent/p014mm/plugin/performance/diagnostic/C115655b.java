package com.tencent.p014mm.plugin.performance.diagnostic;

import com.tencent.mars.smc.IDKey;
import f40.C86709a0;
import g40.C87134f;
import java.util.ArrayList;
import kj2.C117407d;

/* renamed from: com.tencent.mm.plugin.performance.diagnostic.b */
public class C115655b implements C87134f {
    /* renamed from: e */
    public void mo1180e() {
        C86709a0.m107528h().mo121101p(this);
        ArrayList<IDKey> arrayList = C115656c.f346919a;
        synchronized (arrayList) {
            C115656c.f346920b = true;
            C117407d.INSTANCE.mo160124a(arrayList, false);
            arrayList.clear();
        }
    }

    /* renamed from: g */
    public void mo1181g(boolean z) {
    }
}
