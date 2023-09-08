package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import com.tencent.p014mm.plugin.voip.model.C106333b;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.h */
public class C105146h implements C106333b {

    /* renamed from: a */
    public final /* synthetic */ C105141g f312196a;

    public C105146h(C105141g gVar) {
        this.f312196a = gVar;
    }

    /* renamed from: a */
    public int mo149458a(byte[] bArr, int i) {
        if (this.f312196a.f312177d != 2) {
            return -1;
        }
        C105181w.INSTANCE.getClass();
        int GetAudioData = C105172s.f312297c.GetAudioData(bArr, i);
        if (!this.f312196a.f312185l) {
            return GetAudioData < 0 ? -1 : 0;
        }
        return -10086;
    }
}
