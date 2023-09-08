package com.tencent.p014mm.plugin.ipcall.model;

import android.database.Cursor;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.IPCallSyncAddrBookEventEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import s12.C13614k;

/* renamed from: com.tencent.mm.plugin.ipcall.model.IPCallAddressUpdater */
public class IPCallAddressUpdater {

    /* renamed from: a */
    public static IListener f19411a = new IListener<IPCallSyncAddrBookEventEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1320342326;
        }

        public boolean callback(IEvent iEvent) {
            if (!(((IPCallSyncAddrBookEventEvent) iEvent) instanceof IPCallSyncAddrBookEventEvent)) {
                return false;
            }
            ThreadPool.post(new C4616c(this), "IPCall_SyncAddressBook");
            return false;
        }
    };

    /* renamed from: a */
    public static void m4903a(long j) {
        Log.m105919d("MicroMsg.IPCallAddressUpdater", "updateDeleteAddressRecord, id: %d", Long.valueOf(j));
        Cursor jo = C105385g.Cx0().mo13012jo(j);
        if (jo != null) {
            try {
                if (jo.moveToFirst()) {
                    while (!jo.isAfterLast()) {
                        C13614k kVar = new C13614k();
                        kVar.convertFrom(jo);
                        kVar.field_addressId = -1;
                        kVar.field_phoneType = -1;
                        C105385g.Cx0().mo13011Lo(kVar);
                        jo.moveToNext();
                    }
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.IPCallAddressUpdater", "updateDeleteAddressRecord error: %s", e.getMessage());
            } catch (Throwable th) {
                jo.close();
                throw th;
            }
        }
        if (jo == null) {
            return;
        }
        jo.close();
    }
}
