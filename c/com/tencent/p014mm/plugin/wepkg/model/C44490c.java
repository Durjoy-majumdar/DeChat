package com.tencent.p014mm.plugin.wepkg.model;

import android.database.Cursor;
import com.tencent.p014mm.plugin.wepkg.utils.C44536d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import java.util.ArrayList;
import java.util.List;
import lb3.C46844f;
import sx1.C48493b;

/* renamed from: com.tencent.mm.plugin.wepkg.model.c */
public class C44490c implements C48493b.C48494a {

    /* renamed from: a */
    public final /* synthetic */ C44493e f120675a;

    /* renamed from: com.tencent.mm.plugin.wepkg.model.c$a */
    public class C44491a implements Runnable {
        public C44491a() {
        }

        public void run() {
            ArrayList arrayList;
            C86009m1[] u;
            WepkgCrossProcessTask wepkgCrossProcessTask = new WepkgCrossProcessTask();
            wepkgCrossProcessTask.f120618h = 2005;
            if (MMApplicationContext.isMMProcess()) {
                wepkgCrossProcessTask.mo1553j();
            } else {
                wepkgCrossProcessTask.mo114396f();
            }
            List<WepkgVersion> list = wepkgCrossProcessTask.f120620j;
            if (!Util.isNullOrNil((List) list)) {
                Log.m105925i("MicroMsg.Wepkg.CleanWepkgMgr", "need to clean list.size:%s", Integer.valueOf(list.size()));
                for (WepkgVersion next : list) {
                    if (next != null) {
                        C44490c.this.f120675a.mo69278g(next.f120651d, 2, 8);
                    }
                }
            } else {
                Log.m105924i("MicroMsg.Wepkg.CleanWepkgMgr", "no need to clean wepkg");
            }
            Log.m105924i("MicroMsg.Wepkg.CleanWepkgMgr", "start clean dirty wepkg");
            C44493e eVar = C44490c.this.f120675a;
            eVar.getClass();
            C86009m1 m1Var = new C86009m1(C44498h.m48865c());
            if (m1Var.mo119967g() && m1Var.mo119977o() && (u = m1Var.mo119984u()) != null && u.length != 0) {
                for (C86009m1 m1Var2 : u) {
                    if (m1Var2 != null) {
                        eVar.mo69278g(m1Var2.getName(), 3, 9);
                    }
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            long b = C44490c.this.f120675a.mo69276b(new C86009m1(C44498h.m48865c()));
            Log.m105925i("MicroMsg.Wepkg.CleanWepkgMgr", "local wepkg size: %d, cost time: %d", Long.valueOf(b), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            C46844f Ow = C46844f.m52139Ow();
            if (!Ow.f126002d) {
                arrayList = null;
            } else {
                Cursor rawQuery = Ow.rawQuery(String.format("select %s from %s order by %s asc", new Object[]{"pkgId", "WepkgVersion", "accessTime"}), new String[0]);
                ArrayList arrayList2 = new ArrayList();
                if (rawQuery != null) {
                    if (rawQuery.moveToFirst()) {
                        do {
                            String string = rawQuery.getString(0);
                            if (!Util.isNullOrNil(string)) {
                                arrayList2.add(string);
                            }
                        } while (rawQuery.moveToNext());
                        rawQuery.close();
                    } else {
                        rawQuery.close();
                    }
                }
                arrayList = arrayList2;
            }
            if (!Util.isNullOrNil((List) arrayList)) {
                while (b > 209715200 && arrayList.size() > 0) {
                    String str = (String) arrayList.remove(0);
                    if (!Util.isNullOrNil(str)) {
                        C44490c.this.f120675a.mo69278g(str, 2, 10);
                        b = C44490c.this.f120675a.mo69276b(new C86009m1(C44498h.m48865c()));
                    }
                }
                Log.m105924i("MicroMsg.Wepkg.CleanWepkgMgr", "clean wepkg finish!");
            }
        }
    }

    public C44490c(C44493e eVar) {
        this.f120675a = eVar;
    }

    /* renamed from: a */
    public void mo65649a() {
        C44536d.m48918d().postToWorker(new C44491a());
    }
}
