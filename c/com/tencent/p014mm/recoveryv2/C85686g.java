package com.tencent.p014mm.recoveryv2;

import com.tencent.p014mm.recoveryv2.C85678f;
import com.tencent.p014mm.recoveryv2.C85692k;

/* renamed from: com.tencent.mm.recoveryv2.g */
public class C85686g extends C85678f.C85681c {

    /* renamed from: m */
    public final /* synthetic */ C85678f.C85680b f249684m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85686g(C85678f.C85680b bVar, C85678f.C85679a aVar) {
        super(aVar);
        this.f249684m = bVar;
    }

    /* renamed from: k */
    public void mo119275k() {
        C85692k.C85693a.m105840a(4, "MicroMsg.recovery.combination", "safePoint finish, switch to signal handler");
        C85678f.C85680b bVar = this.f249684m;
        if (bVar.f249674m == null) {
            bVar.f249674m = bVar.mo119273k();
        }
        super.mo119275k();
    }
}
