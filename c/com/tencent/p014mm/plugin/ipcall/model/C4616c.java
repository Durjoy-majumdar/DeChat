package com.tencent.p014mm.plugin.ipcall.model;

import com.tencent.p014mm.plugin.ipcall.model.IPCallAddressUpdater;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import eb0.C97625j3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import s12.C13611b;
import s12.C13612c;
import s12.C13613d;
import zh3.C91753f;

/* renamed from: com.tencent.mm.plugin.ipcall.model.c */
public class C4616c implements Runnable {
    public C4616c(IPCallAddressUpdater.C46121 r1) {
    }

    public void run() {
        IListener iListener = IPCallAddressUpdater.f19411a;
        try {
            if (!C97625j3.m125811a()) {
                Log.m105920e("MicroMsg.IPCallAddressUpdater", "updateAddressStorage, acc not ready");
                return;
            }
            Log.m105918d("MicroMsg.IPCallAddressUpdater", "start updateAddressStorage");
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList<C13612c> Lo = C105385g.vx0().mo13005Lo();
            if (Lo != null && Lo.size() > 0) {
                C13611b.m12912b();
                HashMap<String, C13612c> hashMap = C13611b.f38574b;
                if (hashMap == null) {
                    return;
                }
                if (hashMap.size() >= 0) {
                    C13613d vx02 = C105385g.vx0();
                    long id = Thread.currentThread().getId();
                    ISQLiteDatabase iSQLiteDatabase = vx02.f38579d;
                    long beginTransaction = iSQLiteDatabase instanceof C91753f ? ((C91753f) iSQLiteDatabase).beginTransaction(id) : -1;
                    Log.m105918d("MicroMsg.IPCallAddressUpdater", "start delete not exist address");
                    Log.m105919d("MicroMsg.IPCallAddressUpdater", "oldItemList.size: %d", Integer.valueOf(Lo.size()));
                    Iterator<C13612c> it = Lo.iterator();
                    while (it.hasNext()) {
                        C13612c next = it.next();
                        if (!hashMap.containsKey(next.field_contactId)) {
                            long j = next.systemRowid;
                            C105385g.vx0().delete(j);
                            IPCallAddressUpdater.m4903a(j);
                        }
                    }
                    Log.m105918d("MicroMsg.IPCallAddressUpdater", "start update or insert address");
                    for (C13612c next2 : hashMap.values()) {
                        C13612c qq = C105385g.vx0().mo13010qq(next2.field_contactId);
                        if (qq == null || qq.systemRowid == -1) {
                            C105385g.vx0().insert(next2);
                        } else {
                            if (!(qq.mo13004l2(qq.field_contactId, next2.field_contactId) && qq.mo13004l2(qq.field_systemAddressBookUsername, next2.field_systemAddressBookUsername) && qq.mo13004l2(qq.field_wechatUsername, next2.field_wechatUsername))) {
                                C105385g.vx0().update(qq.systemRowid, next2);
                            }
                        }
                    }
                    C105385g.vx0().mo13009jo(beginTransaction);
                    Log.m105919d("MicroMsg.IPCallAddressUpdater", "updateAddressStorage, used %dms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                }
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.IPCallAddressUpdater", "updateAddressStorage error:" + e.getMessage());
        }
    }
}
