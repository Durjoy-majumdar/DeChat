package com.tencent.p014mm.ipcinvoker.wx_extension;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.ipcinvoker.wx_extension.IPCRunCgi;
import com.tencent.p014mm.ipcinvoker.wx_extension.service.IPCRunCgiRespWrapper;
import ob0.C47350c;

/* renamed from: com.tencent.mm.ipcinvoker.wx_extension.k */
public class C80932k implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ C1256g f237786a;

    public C80932k(IPCRunCgi.C80930e eVar, C1256g gVar) {
        this.f237786a = gVar;
    }

    /* renamed from: a */
    public void mo288a(int i, int i2, String str, C47350c cVar) {
        IPCRunCgiRespWrapper iPCRunCgiRespWrapper = new IPCRunCgiRespWrapper();
        iPCRunCgiRespWrapper.f237792d = i;
        iPCRunCgiRespWrapper.f237793e = i2;
        iPCRunCgiRespWrapper.f237794f = str;
        iPCRunCgiRespWrapper.f237795g = cVar;
        this.f237786a.mo894a(iPCRunCgiRespWrapper);
    }
}
