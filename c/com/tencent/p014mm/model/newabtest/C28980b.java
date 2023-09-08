package com.tencent.p014mm.model.newabtest;

import android.database.Cursor;
import com.tencent.p014mm.model.newabtest.C92722a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30719a;
import com.tencent.p014mm.storage.C30722b;
import com.tencent.p014mm.storage.C30728d;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C96980c;
import com.tencent.xweb.file.XVFSFile;
import f40.C86709a0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import pe3.C89349b;
import sf0.C48374j0;
import te3.C49050cu1;
import te3.C49191du1;
import te3.C52234z90;

/* renamed from: com.tencent.mm.model.newabtest.b */
public class C28980b {

    /* renamed from: a */
    public static boolean f79474a;

    /* renamed from: com.tencent.mm.model.newabtest.b$a */
    public class C28981a implements l0$$e {
        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            C28980b.f79474a = false;
            if (i == 0 && i2 == 0) {
                C49191du1 du12 = (C49191du1) cVar.f127056b.f127083a;
                C28980b.m38521c();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_ABTEST_SERVER_TIMESTAMP_INT, Integer.valueOf(du12.f132534f));
                C28980b.m38520b(du12.f132533e);
                LinkedList<Integer> linkedList = du12.f132535g;
                if (Util.isNullOrNil((List) linkedList)) {
                    Log.m105928w("MicroMsg.ABTestUpdater", "No expired Exp");
                } else {
                    C30728d wx02 = SubCoreNewABTest.wx0();
                    wx02.getClass();
                    if (!Util.isNullOrNil((List) linkedList)) {
                        for (Integer next : linkedList) {
                            if (next != null) {
                                C96980c cVar2 = new C96980c();
                                cVar2.field_expId = String.valueOf(next);
                                wx02.delete(cVar2, "expId");
                            }
                        }
                    }
                    C30722b vx02 = SubCoreNewABTest.vx0();
                    vx02.getClass();
                    if (!Util.isNullOrNil((List) linkedList)) {
                        for (Integer next2 : linkedList) {
                            if (next2 != null) {
                                C30719a aVar = new C30719a();
                                aVar.field_expId = String.valueOf(next2);
                                vx02.delete(aVar, "expId");
                            }
                        }
                    }
                }
                LinkedList<C89349b> linkedList2 = du12.f132532d;
                if (linkedList2 == null || linkedList2.size() == 0) {
                    Log.m105928w("MicroMsg.ABTestUpdater", "No Exp");
                } else {
                    LinkedList linkedList3 = new LinkedList();
                    LinkedList linkedList4 = new LinkedList();
                    for (C89349b b : linkedList2) {
                        C92722a.C28979a c = C92722a.m116886c(C48374j0.m53713b(b));
                        linkedList3.addAll(c.f79472a);
                        linkedList4.addAll(c.f79473b);
                    }
                    SubCoreNewABTest.wx0().mo57625qq(linkedList3, 0);
                    SubCoreNewABTest.vx0().mo57618Lo(linkedList4, 1);
                }
                C28980b.m38519a();
                Log.m105925i("MicroMsg.ABTestUpdater", "Update Interval: %d", Integer.valueOf(du12.f132533e));
                return 0;
            }
            Log.m105921e("MicroMsg.ABTestUpdater", "Update Error: %d, %d, next update will be performed %d(s) later", Integer.valueOf(i), Integer.valueOf(i2), 86400);
            C28980b.m38521c();
            C28980b.m38520b(86400);
            C28980b.m38519a();
            return 0;
        }
    }

    /* renamed from: a */
    public static void m38519a() {
        C86709a0.m107535s().mo121142i().mo119681a(true);
    }

    /* renamed from: b */
    public static void m38520b(int i) {
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_ABTEST_UPDATE_TIME_INTERVAL_INT, Integer.valueOf(i == 0 ? 86400 : (i < 3600 || i > 129600) ? new Random().nextInt(126000) + 3600 : 0));
    }

    /* renamed from: c */
    public static void m38521c() {
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_ABTEST_LAST_UPDATE_TIME_LONG, Long.valueOf(System.currentTimeMillis() / 1000));
    }

    /* renamed from: d */
    public static void m38522d() {
        f79474a = true;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49050cu1();
        bVar.f127067b = new C49191du1();
        bVar.f127068c = "/cgi-bin/mmux-bin/getabtest";
        bVar.f127069d = 1801;
        C47350c a = bVar.mo72403a();
        C49050cu1 cu12 = (C49050cu1) a.f127055a.f127080a;
        Integer num = (Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_ABTEST_SERVER_TIMESTAMP_INT, (Object) null);
        cu12.f131960d = num == null ? 0 : num.intValue();
        C30728d wx02 = SubCoreNewABTest.wx0();
        wx02.getClass();
        LinkedList<C52234z90> linkedList = new LinkedList<>();
        Cursor all = wx02.getAll();
        if (all != null && all.moveToFirst()) {
            C96980c cVar = new C96980c();
            do {
                cVar.convertFrom(all);
                C52234z90 z902 = new C52234z90();
                try {
                    z902.f145769d = Util.getInt(cVar.field_expId, 0);
                } catch (Exception unused) {
                    Log.m105921e("MicroMsg.ABTestStorage", "expId parse failed, %s", cVar.field_expId);
                }
                z902.f145770e = cVar.field_prioritylevel;
                linkedList.add(z902);
            } while (all.moveToNext());
            all.close();
        }
        cu12.f131961e = linkedList;
        C30722b vx02 = SubCoreNewABTest.vx0();
        vx02.getClass();
        LinkedList linkedList2 = new LinkedList();
        Cursor all2 = vx02.getAll();
        if (all2 != null) {
            if (!all2.moveToFirst()) {
                all2.close();
            } else {
                C30719a aVar = new C30719a();
                do {
                    aVar.convertFrom(all2);
                    C52234z90 z903 = new C52234z90();
                    try {
                        z903.f145769d = Util.getInt(aVar.field_expId, 0);
                    } catch (Exception unused2) {
                        Log.m105921e("MicroMsg.ABTestInfoStorage", "expId parse failed, %s", aVar.field_expId);
                    }
                    z903.f145770e = aVar.field_prioritylevel;
                    linkedList2.add(z903);
                } while (all2.moveToNext());
                all2.close();
            }
        }
        linkedList.addAll(linkedList2);
        Object[] objArr = new Object[1];
        Iterator<C52234z90> it = cu12.f131961e.iterator();
        String str = "";
        while (it.hasNext()) {
            C52234z90 next = it.next();
            str = str + next.f145769d + XVFSFile.PATH_SEPARATOR + next.f145770e + "|";
        }
        objArr[0] = str;
        Log.m105925i("MicroMsg.ABTestUpdater", "update abtest: %s", objArr);
        C89144l0.m111429e(a, new C28981a(), true);
    }

    /* renamed from: e */
    public static void m38523e() {
        if (!C86709a0.m107522a()) {
            Log.m105924i("MicroMsg.ABTestUpdater", "UpdateWithoutIntervalLimit aborted, Account not ready.");
        } else if (f79474a) {
            Log.m105924i("MicroMsg.ABTestUpdater", "UpdateWithoutIntervalLimit, Already Updating");
        } else {
            Log.m105924i("MicroMsg.ABTestUpdater", "UpdateWithoutIntervalLimit, before do update");
            m38522d();
        }
    }
}
