package com.tencent.p014mm.plugin.game.model;

import android.database.Cursor;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C44579p;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.Iterator;
import java.util.LinkedList;
import p763ym.C53543s;
import uy1.C52642c;

/* renamed from: com.tencent.mm.plugin.game.model.n */
public class C42078n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LinkedList f113375d;

    public C42078n(LinkedList linkedList) {
        this.f113375d = linkedList;
    }

    public void run() {
        Class cls = C53543s.class;
        LinkedList linkedList = new LinkedList();
        Iterator it = this.f113375d.iterator();
        while (it.hasNext()) {
            Iterator<C42039b> it4 = C42076m.m45777a(((C42079o) it.next()).f113370a.optJSONArray("items")).iterator();
            while (it4.hasNext()) {
                C42039b next = it4.next();
                if (!Util.isNullOrNil(next.field_appId)) {
                    linkedList.add(next.field_appId);
                }
            }
        }
        MMHandler mMHandler = C52642c.f146980a;
        Cursor rawQuery = ((C44579p) ((C53543s) C86312j.m106911c(cls)).Gk0()).rawQuery("select * from AppInfo where appType like '%1,%'", new String[0]);
        if (rawQuery == null) {
            Log.m105920e("MicroMsg.AppInfoStorage", "getGameApp : cursor is null");
            rawQuery = null;
        }
        LinkedList linkedList2 = new LinkedList();
        if (rawQuery == null) {
            Log.m105920e("MicroMsg.GameCenterUtil", "getGameAppInfo failed: curosr is null");
        } else {
            if (rawQuery.moveToFirst()) {
                do {
                    C44561j jVar = new C44561j();
                    jVar.convertFrom(rawQuery);
                    linkedList2.add(jVar);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
        }
        Iterator it5 = linkedList2.iterator();
        while (it5.hasNext()) {
            C44561j jVar2 = (C44561j) it5.next();
            if (!linkedList.contains(jVar2.field_appId)) {
                ((C44579p) ((C53543s) C86312j.m106911c(cls)).Gk0()).delete(jVar2, new String[0]);
                Log.m105924i("MicroMsg.GameDataSearchGameList", "delete appid : " + jVar2.field_appId);
            }
        }
    }
}
