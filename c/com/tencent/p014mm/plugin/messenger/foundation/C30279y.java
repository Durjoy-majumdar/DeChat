package com.tencent.p014mm.plugin.messenger.foundation;

import com.tencent.p014mm.booter.NotifyReceiver;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import jc3.C33536g;
import oa1.C117731d;
import vf3.C37733a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.messenger.foundation.y */
public class C30279y implements C33536g {
    /* renamed from: W1 */
    public void mo57264W1(NotifyReceiver.NotifyService notifyService, int i, byte[] bArr, byte[] bArr2, long j) {
        y$$a y__a = new y$$a(this, i, bArr, bArr2);
        boolean z = C117731d.m166007c().mo182440a(new C37733a()) == 1;
        Log.m105925i("MicroMsg.SecurityNotifyReceiverCallback", "isOpenMMkvFlag %s", Boolean.valueOf(z));
        if (z) {
            ((C119157j) C119157j.f356862d).mo183876g(y__a, "SyncProcessorThreadTag");
        } else {
            C86709a0.m107525e().postToWorker(y__a);
        }
    }
}
