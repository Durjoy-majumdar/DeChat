package com.tencent.p014mm.plugin.downloader_app.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import i51.C33203a;
import i51.C33204b;
import i51.C33205c;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.plugin.downloader_app.model.f0 */
public class C29855f0 {

    /* renamed from: a */
    public static LinkedList<String> f80900a = new LinkedList<>();

    /* renamed from: b */
    public static LinkedList<String> f80901b = new LinkedList<>();

    /* renamed from: c */
    public static volatile boolean f80902c = false;

    /* renamed from: a */
    public static void m38890a(String str) {
        m38893d();
        if (!m38891b(str)) {
            f80900a.addFirst(str);
            if (C33204b.m39981b() != null) {
                C33203a aVar = new C33203a();
                aVar.field_appId = str;
                aVar.field_modifyTime = System.currentTimeMillis();
                C33204b.m39981b().insert(aVar);
            }
        }
    }

    /* renamed from: b */
    public static boolean m38891b(String str) {
        m38893d();
        return f80901b.contains(str) || f80900a.contains(str);
    }

    /* renamed from: c */
    public static LinkedList<String> m38892c() {
        m38893d();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addAll(f80900a);
        linkedList.addAll(f80901b);
        return linkedList;
    }

    /* renamed from: d */
    public static void m38893d() {
        if (!f80902c) {
            synchronized (C29855f0.class) {
                if (!f80902c) {
                    LinkedList<C33203a> a = C33204b.m39980a();
                    if (a != null) {
                        Iterator<C33203a> it = a.iterator();
                        while (it.hasNext()) {
                            C33203a next = it.next();
                            Log.m105919d("MicroMsg.TaskManager", "initFromDB, appId:%s, status:%d", next.field_appId, Integer.valueOf(next.field_status));
                            if (next.field_status == 1) {
                                if (!f80901b.contains(next.field_appId)) {
                                    f80901b.add(next.field_appId);
                                }
                            } else if (!f80900a.contains(next.field_appId)) {
                                f80900a.add(next.field_appId);
                            }
                        }
                    }
                    f80902c = true;
                }
            }
        }
    }

    /* renamed from: e */
    public static void m38894e(String str) {
        m38893d();
        f80901b.remove(str);
        f80900a.remove(str);
        if (C33204b.m39981b() != null) {
            C33205c b = C33204b.m39981b();
            b.getClass();
            b.execSQL("DownloadTaskItem", String.format("delete from %s where %s=\"%s\"", new Object[]{"DownloadTaskItem", "appId", str}));
        }
    }
}
