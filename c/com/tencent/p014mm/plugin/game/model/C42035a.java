package com.tencent.p014mm.plugin.game.model;

import android.content.Context;
import android.database.Cursor;
import com.tencent.p014mm.plugin.downloader.api.C29841c;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C44579p;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import p749xh.C53352w2;
import p763ym.C53543s;
import p763ym.C79138l;
import z41.C53737b;

/* renamed from: com.tencent.mm.plugin.game.model.a */
public class C42035a {

    /* renamed from: a */
    public LinkedList<String> f113235a = new LinkedList<>();

    /* renamed from: b */
    public LinkedList<C44561j> f113236b = new LinkedList<>();

    /* renamed from: a */
    public void mo65970a() {
        Log.m105924i("MicroMsg.GameAppCacheService", "clear cached apppinfos");
        LinkedList<C44561j> linkedList = this.f113236b;
        if (linkedList != null) {
            linkedList.clear();
        }
        LinkedList<String> linkedList2 = this.f113235a;
        if (linkedList2 != null) {
            linkedList2.clear();
        }
    }

    /* renamed from: b */
    public void mo65971b(Context context) {
        C44561j GW;
        Class cls = C79138l.class;
        LinkedList<C44561j> linkedList = this.f113236b;
        if (linkedList == null) {
            this.f113236b = new LinkedList<>();
        } else {
            linkedList.clear();
        }
        LinkedList<String> linkedList2 = this.f113235a;
        if (linkedList2 == null) {
            this.f113235a = new LinkedList<>();
        } else {
            linkedList2.clear();
        }
        long currentTimeMillis = System.currentTimeMillis();
        Cursor rawQuery = ((C44579p) ((C53543s) C86312j.m106911c(C53543s.class)).Gk0()).rawQuery("select * from AppInfo where appType like '%1,%'", new String[0]);
        if (rawQuery == null) {
            Log.m105920e("MicroMsg.AppInfoStorage", "getGameApp : cursor is null");
            rawQuery = null;
        }
        if (rawQuery == null) {
            Log.m105920e("MicroMsg.GameAppCacheService", "getInstalledGame faild: curosr is null");
        } else {
            if (rawQuery.moveToFirst()) {
                do {
                    C44561j jVar = new C44561j();
                    jVar.convertFrom(rawQuery);
                    if (((C79138l) C86312j.m106911c(cls)).mo74016tz(context, jVar) && !this.f113235a.contains(jVar.field_appId)) {
                        Log.m105925i("MicroMsg.GameAppCacheService", "installed game:[%s][%s]", jVar.field_appName, jVar.field_appId);
                        this.f113236b.add(jVar);
                        this.f113235a.add(jVar.field_appId);
                    }
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery2 = ((C53737b) ((C29841c) C86312j.m106911c(C29841c.class)).mo56945gI()).rawQuery("select * from FileDownloadInfo where status=3", new String[0]);
        if (rawQuery2 != null) {
            while (rawQuery2.moveToNext()) {
                C53352w2 w2Var = new C53352w2();
                w2Var.convertFrom(rawQuery2);
                if (!Util.isNullOrNil(w2Var.field_appId) && w2Var.field_appId.startsWith("wx") && w2Var.field_status == 3 && C86013q1.m106450k(w2Var.field_filePath) && !arrayList.contains(w2Var.field_appId)) {
                    arrayList.add(w2Var.field_appId);
                }
            }
            rawQuery2.close();
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!Util.isNullOrNil(str) && !this.f113235a.contains(str) && (GW = ((C79138l) C86312j.m106911c(cls)).mo73990GW(str, false)) != null && !this.f113236b.contains(GW)) {
                    this.f113236b.add(GW);
                    this.f113235a.add(str);
                }
            }
        }
        long currentTimeMillis3 = System.currentTimeMillis();
        Log.m105925i("MicroMsg.GameAppCacheService", "Init time: %d, %d, %d", Long.valueOf(currentTimeMillis2 - currentTimeMillis), Long.valueOf(currentTimeMillis3 - currentTimeMillis2), Long.valueOf(currentTimeMillis3 - currentTimeMillis));
    }
}
