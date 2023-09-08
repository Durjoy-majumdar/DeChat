package com.tencent.p014mm.plugin.report.service;

import com.tencent.mars.smc.IDKey;
import com.tencent.mars.smc.SmcLogic;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import h81.C32735h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mj2.C61492a;
import oa1.C117731d;
import p206nj.C11171e;
import p910lj.C76701a;
import te3.C48709ag2;
import te3.C49780i03;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.report.service.i */
public class C115666i {

    /* renamed from: a */
    public static Map<Long, Long> f346948a;

    /* renamed from: b */
    public static C61492a f346949b = new C61492a((C61492a.C61493a) null);

    /* renamed from: c */
    public static int f346950c = -1;

    /* renamed from: d */
    public static boolean f346951d = false;

    /* renamed from: e */
    public static final Object f346952e = new Object();

    /* renamed from: f */
    public static ConcurrentHashMap<Long, Object> f346953f = new ConcurrentHashMap<>();

    /* renamed from: com.tencent.mm.plugin.report.service.i$a */
    public class C115667a implements Runnable {
        public void run() {
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "The IDKey has not applied yet, check your code or contact with astrozhou", 1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.report.service.i$b */
    public class C115668b implements Runnable {
        public void run() {
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "The IDKey has not applied yet, check your code or contact with astrozhou", 1);
        }
    }

    /* renamed from: a */
    public static void m162694a(ArrayList<IDKey> arrayList, boolean z) {
        if (arrayList != null) {
            boolean z2 = false;
            for (int i = 0; i < arrayList.size(); i++) {
                if (C42880f.m46540b((int) arrayList.get(i).GetID())) {
                    Log.m105921e("MicroMsg.KVEasyReport", "exception:%s", Util.stackTraceToString(new Exception("The IDKey has not applied yet, check your code. IDKey:(" + arrayList.get(i).GetID() + "," + arrayList.get(i).GetKey() + ")")));
                    if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE) {
                        ((C119157j) C119157j.f356862d).mo183895z(new C115668b());
                    }
                    m162695b(1566, 1, 1, false);
                    z2 = true;
                }
            }
            if (!z2) {
                try {
                    SmcLogic.reportListIDKey((IDKey[]) arrayList.toArray(new IDKey[arrayList.size()]), z);
                } catch (Throwable th) {
                    Log.printErrStackTrace("MicroMsg.KVEasyReport", th, "", new Object[0]);
                    if (C11171e.m11044a(20)) {
                        SmcLogic.reportListIDKey((IDKey[]) arrayList.toArray(new IDKey[arrayList.size()]), z);
                        return;
                    }
                    throw th;
                }
            }
        }
    }

    /* renamed from: b */
    public static void m162695b(long j, long j2, long j3, boolean z) {
        if (C42880f.m46540b((int) j)) {
            Log.m105921e("MicroMsg.KVEasyReport", "exception:%s", Util.stackTraceToString(new Exception("The IDKey has not applied yet, check your code, IDKey:(" + j + "," + j2 + ")")));
            if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE) {
                ((C119157j) C119157j.f356862d).mo183895z(new C115667a());
            }
            m162695b(1566, 1, 1, false);
            return;
        }
        try {
            SmcLogic.reportIDKey(j, j2, j3, z);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.KVEasyReport", th, "", new Object[0]);
            if (C11171e.m11044a(20)) {
                SmcLogic.reportIDKey(j, j2, j3, z);
            } else {
                throw th;
            }
        }
        if (f346951d) {
            if (f346948a == null) {
                m162699f();
            }
            long nullAs = Util.nullAs((Long) ((HashMap) f346948a).get(Long.valueOf(j)), 0);
            if (nullAs > 0) {
                m162695b(nullAs, j2, j3, z);
            }
        }
    }

    /* renamed from: c */
    public static void m162696c(long j, byte[] bArr, boolean z, boolean z2) {
        if (z2) {
            try {
                SmcLogic.writeImportKvPbData(j, bArr, z);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.KVEasyReport", "localReport :%s", Util.stackTraceToString(e));
            }
        } else {
            SmcLogic.writeKvPbData(j, bArr, z);
        }
    }

    /* renamed from: d */
    public static void m162697d(long j, String str, boolean z, boolean z2, boolean z3) {
        boolean containsKey = z3 ? true : f346953f.containsKey(Long.valueOf(j));
        if (z2) {
            try {
                SmcLogic.writeImportKvData(j, str, z, containsKey);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.KVEasyReport", "localReport :%s", Util.stackTraceToString(e));
            }
        } else {
            try {
                SmcLogic.writeKvData(j, str, z, containsKey);
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.KVEasyReport", th, "", new Object[0]);
                if (C11171e.m11044a(20)) {
                    SmcLogic.writeKvData(j, str, z, containsKey);
                } else {
                    throw th;
                }
            }
        }
        ((C119157j) C119157j.f356862d).mo183876g(new C30359j(j, str), "KVEasyReport_putKVInfo");
    }

    /* renamed from: e */
    public static void m162698e(long j, long j2, String str, boolean z, boolean z2, boolean z3) {
        boolean containsKey = z3 ? true : f346953f.containsKey(Long.valueOf(j));
        if (z2) {
            try {
                SmcLogic.writeImportKvDataWithType(j, j2, str, z, containsKey);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.KVEasyReport", "localReport :%s", Util.stackTraceToString(e));
            }
        } else {
            try {
                SmcLogic.writeKvDataWithType(j, j2, str, z, containsKey);
            } catch (Throwable th) {
                Throwable th4 = th;
                Log.printErrStackTrace("MicroMsg.KVEasyReport", th4, "", new Object[0]);
                if (C11171e.m11044a(20)) {
                    SmcLogic.writeKvDataWithType(j, j2, str, z, containsKey);
                } else {
                    throw th4;
                }
            }
        }
        long j3 = j;
        ((C119157j) C119157j.f356862d).mo183876g(new C30359j(j, str), "KVEasyReport_putKVInfo");
    }

    /* renamed from: f */
    public static synchronized void m162699f() {
        int i;
        synchronized (C115666i.class) {
            if (f346948a == null) {
                f346948a = new HashMap(20);
            }
            C48709ag2 a = f346949b.mo86467a();
            if (!(a == null || (i = a.f130501d) == f346950c)) {
                f346950c = i;
                f346948a.clear();
                LinkedList<C49780i03> linkedList = a.f130502e;
                if (linkedList != null) {
                    Iterator<C49780i03> it = linkedList.iterator();
                    while (it.hasNext()) {
                        C49780i03 next = it.next();
                        f346948a.put(new Long((long) next.f135007d), new Long((long) next.f135008e));
                    }
                }
            }
            Log.m105925i("MicroMsg.KVEasyReport", "summerhv reloadHeavyUserIDMap heavyUserIDMap[%d][%d][%s], stack[%s]", Integer.valueOf(f346950c), Integer.valueOf(f346948a.size()), f346948a, Util.getStack());
        }
    }

    /* renamed from: g */
    public static void m162700g(boolean z) {
        String[] split;
        Log.m105925i("MicroMsg.KVEasyReport", "summerhv setHeavyUser [%b %b], stack[%s]", Boolean.valueOf(f346951d), Boolean.valueOf(z), Util.getStack());
        f346951d = z;
        C117731d c = C117731d.m166007c();
        c.getClass();
        HashSet hashSet = new HashSet();
        String f = c.mo182444f("clicfg_ignore_freq_logid", "", false, true);
        if (!Util.isNullOrNil(f) && (split = f.split(";")) != null) {
            for (String str : split) {
                hashSet.add(Long.valueOf(Util.getLong(str, -1)));
            }
        }
        f346953f.clear();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            f346953f.put((Long) it.next(), f346952e);
        }
        Log.m105925i("MicroMsg.KVEasyReport", "reset ignore freq limit logid [%s]", f346953f);
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_smc_max_log_item_size, 0);
        if (Qe > 0) {
            SmcLogic.SetMaxLogItemSize((long) Qe);
        }
    }
}
