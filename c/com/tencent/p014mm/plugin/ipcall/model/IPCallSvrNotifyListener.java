package com.tencent.p014mm.plugin.ipcall.model;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.IPCallSvrNotifyEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.LinkedList;
import r12.C63355e;
import te3.C64367fj3;
import te3.C64804wi3;

/* renamed from: com.tencent.mm.plugin.ipcall.model.IPCallSvrNotifyListener */
public class IPCallSvrNotifyListener extends IListener<IPCallSvrNotifyEvent> {

    /* renamed from: d */
    public C56825a f162850d;

    /* renamed from: com.tencent.mm.plugin.ipcall.model.IPCallSvrNotifyListener$a */
    public interface C56825a {
    }

    public IPCallSvrNotifyListener() {
        super(C40008f.f107254d);
        this.__eventId = -303045513;
    }

    public boolean callback(IEvent iEvent) {
        byte[] bArr;
        IPCallSvrNotifyEvent iPCallSvrNotifyEvent = (IPCallSvrNotifyEvent) iEvent;
        if ((iPCallSvrNotifyEvent instanceof IPCallSvrNotifyEvent) && (bArr = iPCallSvrNotifyEvent.f154827d.f154828a) != null && bArr.length > 0 && bArr[0] == 101) {
            int length = bArr.length - 1;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 1, bArr2, 0, length);
            try {
                C64804wi3 wi32 = (C64804wi3) new C64804wi3().parseFrom(bArr2);
                mo80252e(wi32);
                C56825a aVar = this.f162850d;
                if (aVar != null) {
                    ((C63355e) aVar).f173570d.mo85905b(8, wi32, 0, 0);
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.IPCallSvrNotifyListener", "parse PstnNotify error: %s", e.getMessage());
            }
        }
        return false;
    }

    /* renamed from: e */
    public final void mo80252e(C64804wi3 wi32) {
        Log.m105919d("MicroMsg.IPCallSvrNotifyListener", "roomId: %d, roomKey: %d, DtmfPayloadType: %d", Integer.valueOf(wi32.f186123d), Long.valueOf(wi32.f186124e), Integer.valueOf(wi32.f186126g));
        LinkedList<C64367fj3> linkedList = wi32.f186125f;
        if (linkedList != null) {
            Iterator<C64367fj3> it = linkedList.iterator();
            while (it.hasNext()) {
                C64367fj3 next = it.next();
                Log.m105919d("MicroMsg.IPCallSvrNotifyListener", "userstatus: %d, userstatusKey: %d, memberId: %d", Integer.valueOf(next.f183141d), Integer.valueOf(next.f183142e), Integer.valueOf(next.f183143f));
            }
        }
    }
}
