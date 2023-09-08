package gv0;

import android.os.Looper;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.IXWebBroadcastListener;
import dv0.C86406l;
import gv0.C20856m;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import ob0.C11385n;
import ob0.C117747y;
import pe3.C47465a;

/* renamed from: gv0.c */
public abstract class C20842c extends C117747y {

    /* renamed from: f */
    public static final Map<Integer, Set<C11385n>> f58875f = new HashMap();

    /* renamed from: g */
    public static final ConcurrentHashMap<Integer, C20842c> f58876g = new ConcurrentHashMap<>();

    /* renamed from: h */
    public static final MMHandler f58877h = new MMHandler(Looper.getMainLooper());

    /* renamed from: i */
    public static C20846e f58878i;

    /* renamed from: j */
    public static C20843b f58879j;

    /* renamed from: n */
    public static int f58880n = -1;

    /* renamed from: o */
    public static C20853j f58881o = null;

    /* renamed from: p */
    public static C20859o f58882p = null;

    /* renamed from: q */
    public static C116995k f58883q = null;

    /* renamed from: r */
    public static C20856m f58884r = null;

    /* renamed from: s */
    public static int f58885s = new Random(Util.nowMilliSecond()).nextInt(1147483648);

    /* renamed from: t */
    public static C20845d f58886t = null;

    /* renamed from: d */
    public int f58887d = 0;

    /* renamed from: e */
    public PByteArray f58888e = new PByteArray();

    /* renamed from: gv0.c$b */
    public interface C20843b {
        /* renamed from: a */
        void mo32548a(int i, byte[] bArr, int i2);

        /* renamed from: b */
        int mo32549b(int i, byte[] bArr, int i2);
    }

    /* renamed from: gv0.c$c */
    public interface C20844c {
    }

    /* renamed from: gv0.c$d */
    public interface C20845d {
        /* renamed from: a */
        void mo17681a();
    }

    /* renamed from: gv0.c$e */
    public interface C20846e {
        /* renamed from: a */
        void mo17669a(boolean z, int i, byte[] bArr, int i2);
    }

    /* renamed from: gv0.c$a */
    public class C20847a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f58889d;

        /* renamed from: e */
        public final /* synthetic */ int f58890e;

        /* renamed from: f */
        public final /* synthetic */ String f58891f;

        public C20847a(int i, int i2, String str) {
            this.f58889d = i;
            this.f58890e = i2;
            this.f58891f = str;
        }

        public void run() {
            Set set;
            Map<Integer, Set<C11385n>> map = C20842c.f58875f;
            synchronized (map) {
                set = (Set) ((HashMap) map).get(Integer.valueOf(C20842c.this.getType()));
            }
            if (set != null && set.size() > 0) {
                HashSet hashSet = new HashSet();
                hashSet.addAll(set);
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    C11385n nVar = (C11385n) it.next();
                    if (nVar != null && set.contains(nVar)) {
                        nVar.onSceneEnd(this.f58889d, this.f58890e, this.f58891f, C20842c.this);
                    }
                }
            }
        }
    }

    /* renamed from: A1 */
    public static void m22873A1() {
        C20859o oVar = f58882p;
        if (oVar != null) {
            Log.m105925i("MicroMsg.BackupSpeedCalculator", "start backupGetSpeedTimeHandler. hash:%d", Integer.valueOf(oVar.f58951m.hashCode()));
            oVar.f58944f = Util.nowMilliSecond();
            oVar.f58941c = 0;
            oVar.f58939a = 0;
            ((LinkedList) oVar.f58949k).clear();
            oVar.f58946h = 0;
            oVar.f58945g = 0;
            for (int i = 0; i < 10; i++) {
                ((LinkedList) oVar.f58949k).offer(204800L);
            }
            oVar.f58951m.startTimer(1000);
            return;
        }
        Log.m105920e("MicroMsg.BackupBaseScene", "startSpeedCalculator backupSpeedCalculator is null!");
    }

    /* renamed from: B1 */
    public static void m22874B1(int i) {
        C116995k kVar = f58883q;
        if (kVar != null) {
            try {
                Log.m105925i("MicroMsg.BackupLogManager", "end backupMode[%d]", Integer.valueOf(i));
                long j = C116995k.f350572c;
                if (j != 0) {
                    if (C116995k.f350574e != 0) {
                        long nowMilliSecond = Util.nowMilliSecond();
                        C116995k.f350573d = nowMilliSecond;
                        long j2 = 0;
                        for (long j3 = C116995k.f350572c; j3 <= nowMilliSecond + 86400000; j3 += 86400000) {
                            j2 += kVar.mo180960a(j3);
                        }
                        C116995k.f350575f = j2;
                        Log.m105925i("MicroMsg.BackupLogManager", "end, backupMode[%d], endTime[%d], startTime[%d], endLogSize[%d], startLogSize[%d]", Integer.valueOf(i), Long.valueOf(C116995k.f350573d), Long.valueOf(C116995k.f350572c), Long.valueOf(C116995k.f350575f), Long.valueOf(C116995k.f350574e));
                        long j4 = C116995k.f350575f;
                        if (j4 != 0) {
                            long j5 = C116995k.f350574e;
                            if (j4 > j5) {
                                kVar.mo180961b(i, C116995k.f350573d - C116995k.f350572c, j4 - j5, false);
                            }
                        }
                        C116995k.f350572c = 0;
                        C116995k.f350573d = 0;
                        C116995k.f350574e = 0;
                        C116995k.f350575f = 0;
                        return;
                    }
                }
                Log.m105921e("MicroMsg.BackupLogManager", "end is zero, startTime[%d], startLogSize[%d], skip report", Long.valueOf(j), Long.valueOf(C116995k.f350574e));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.BackupLogManager", e, "end exception", new Object[0]);
            }
        }
    }

    /* renamed from: C1 */
    public static void m22875C1() {
        C20856m mVar = f58884r;
        if (mVar != null) {
            mVar.f58934b = 0;
            if (!mVar.f58935c) {
                Log.m105924i("MicroMsg.BackupReconnectHandler", "stop backupReconnectTimeHandler.");
                mVar.f58937e.stopTimer();
                mVar.f58935c = true;
            }
        }
    }

    /* renamed from: D1 */
    public static void m22876D1() {
        C20853j jVar = f58881o;
        if (jVar != null && jVar.f58929e != null) {
            Log.m105924i("MicroMsg.BackupHeartBeatHandler", "stop");
            jVar.f58929e = Boolean.TRUE;
        }
    }

    /* renamed from: E1 */
    public static void m22877E1() {
        C20859o oVar = f58882p;
        if (oVar != null) {
            Log.m105925i("MicroMsg.BackupSpeedCalculator", "stop backupGetSpeedTimeHandler. hash:%d", Integer.valueOf(oVar.f58951m.hashCode()));
            oVar.f58951m.stopTimer();
            oVar.f58946h = 0;
        }
    }

    /* renamed from: j1 */
    public static void m22878j1(int i) {
        C20859o oVar = f58882p;
        if (oVar != null) {
            long j = (long) i;
            oVar.f58941c += j;
            oVar.f58943e += j;
        }
    }

    /* renamed from: k1 */
    public static void m22879k1(int i, C11385n nVar) {
        Map<Integer, Set<C11385n>> map = f58875f;
        synchronized (map) {
            if (!((HashMap) map).containsKey(Integer.valueOf(i))) {
                ((HashMap) map).put(Integer.valueOf(i), new HashSet());
            }
            if (!((Set) ((HashMap) map).get(Integer.valueOf(i))).contains(nVar)) {
                ((Set) ((HashMap) map).get(Integer.valueOf(i))).add(nVar);
            }
        }
    }

    /* renamed from: l1 */
    public static void m22880l1(boolean z, int i, int i2, byte[] bArr) {
        ConcurrentHashMap<Integer, C20842c> concurrentHashMap = f58876g;
        C20842c remove = concurrentHashMap.containsKey(Integer.valueOf(i)) ? concurrentHashMap.remove(Integer.valueOf(i)) : null;
        if (z) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("callback error buf content : ");
                sb.append(bArr == null ? "null" : new String(bArr));
                Log.m105928w("MicroMsg.BackupBaseScene", sb.toString());
            } catch (Exception unused) {
            }
            f58877h.post(new C20841b(z, i2, bArr, i));
            return;
        }
        C20853j jVar = f58881o;
        if (jVar != null) {
            jVar.mo32558c();
        }
        if (remove == null) {
            Log.m105925i("MicroMsg.BackupBaseScene", "notify scene null type:%d", Integer.valueOf(i2));
            if (i2 == 16) {
                synchronized (concurrentHashMap) {
                    Iterator it = new HashSet(concurrentHashMap.keySet()).iterator();
                    while (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        ConcurrentHashMap<Integer, C20842c> concurrentHashMap2 = f58876g;
                        C20842c cVar = concurrentHashMap2.get(num);
                        Object[] objArr = new Object[3];
                        objArr[0] = num;
                        objArr[1] = cVar;
                        objArr[2] = cVar == null ? "null" : Integer.valueOf(cVar.getType());
                        Log.m105919d("MicroMsg.BackupBaseScene", "callback sceneMap seq:%d scene:%s type:%s", objArr);
                        if (cVar != null && cVar.getType() == 15) {
                            int intValue = num.intValue();
                            if (concurrentHashMap2.containsKey(Integer.valueOf(intValue))) {
                                C20842c remove2 = concurrentHashMap2.remove(Integer.valueOf(intValue));
                            }
                            try {
                                cVar.mo32543r1().parseFrom(bArr);
                                cVar.mo32544t1(i);
                            } catch (Exception e) {
                                cVar.mo32546m1(3, -1, "buf to tagResp fail");
                                Log.printErrStackTrace("MicroMsg.BackupBaseScene", e, "buf to tagResp error, type[%d], errMsg:%s ", Integer.valueOf(cVar.getType()), e.toString());
                            }
                        }
                    }
                }
                return;
            }
            Log.m105925i("MicroMsg.BackupBaseScene", "notify seq:%d, type:%d", Integer.valueOf(i), Integer.valueOf(i2));
            f58877h.post(new C20841b(z, i2, bArr, i));
        } else if (bArr != null) {
            try {
                remove.mo32543r1().parseFrom(bArr);
                remove.mo32544t1(i);
            } catch (Exception e2) {
                remove.mo32546m1(3, -1, "buf to resq fail");
                Log.printErrStackTrace("MicroMsg.BackupBaseScene", e2, "%s ", e2.toString());
            }
        } else {
            throw new Exception("buf is null");
        }
    }

    /* renamed from: n1 */
    public static void m22881n1() {
        Log.m105924i("MicroMsg.BackupBaseScene", "BackupBaseScene clear.");
        ConcurrentHashMap<Integer, C20842c> concurrentHashMap = f58876g;
        synchronized (concurrentHashMap) {
            concurrentHashMap.clear();
        }
        Map<Integer, Set<C11385n>> map = f58875f;
        synchronized (map) {
            ((HashMap) map).clear();
        }
    }

    /* renamed from: p1 */
    public static String m22882p1() {
        C20859o oVar = f58882p;
        if (oVar == null) {
            return "";
        }
        float currentTimeMillis = (float) ((oVar.f58942d / (System.currentTimeMillis() + oVar.f58948j)) * 1000);
        long j = oVar.f58947i;
        long j2 = j - oVar.f58942d;
        long j3 = oVar.f58940b;
        if (j3 < 1 || j2 < 0) {
            Log.m105925i("MicroMsg.BackupSpeedCalculator", "getBackupRemainTime totalSize:%d, receiveDataSize:%d, backupSpeed:%d", Long.valueOf(j), Long.valueOf(oVar.f58942d), Long.valueOf(oVar.f58940b));
            return MMApplicationContext.getString(C0966R.string.mjx, 1);
        }
        long j4 = currentTimeMillis > 1.0f ? (long) (((float) j2) / currentTimeMillis) : j2 / j3;
        Log.m105925i("MicroMsg.BackupSpeedCalculator", "getBackupRemainTime totalSize:%d, receiveDataSize:%d, backupSpeed:%d, speed:%f, sec:%d, transferTime:%d", Long.valueOf(j), Long.valueOf(oVar.f58942d), Long.valueOf(oVar.f58940b), Float.valueOf(currentTimeMillis), Long.valueOf(j4), Long.valueOf(oVar.f58948j));
        if (j4 < 3600) {
            if (j4 < 60) {
                j4 = 60;
            }
            return MMApplicationContext.getString(C0966R.string.mjx, Integer.valueOf((int) Math.ceil(((double) j4) / 60.0d)));
        }
        return MMApplicationContext.getString(C0966R.string.mjv, Integer.valueOf((int) Math.floor(((double) j4) / 3600.0d)), Integer.valueOf((int) Math.ceil((double) ((j4 % 3600) / 60))));
    }

    /* renamed from: s1 */
    public static String m22883s1() {
        String str;
        C20859o oVar = f58882p;
        if (oVar == null) {
            return "0B";
        }
        long j = oVar.f58940b;
        if ((j >> 30) > 0) {
            str = Util.getSizeGB(j, 100.0d);
        } else if ((j >> 20) > 0) {
            str = Util.getSizeMB(j, 100.0d);
        } else if ((j >> 9) > 0) {
            str = "" + Math.round(((float) j) / 1024.0f) + " KB";
        } else {
            str = "" + j + " B";
        }
        Log.m105925i("MicroMsg.BackupSpeedCalculator", "getBackupSpeed[%s]", str);
        return str;
    }

    /* renamed from: u1 */
    public static void m22884u1(int i, C11385n nVar) {
        Map<Integer, Set<C11385n>> map = f58875f;
        synchronized (map) {
            try {
                if (((HashMap) map).get(Integer.valueOf(i)) != null) {
                    ((Set) ((HashMap) map).get(Integer.valueOf(i))).remove(nVar);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.BackupBaseScene", e, "removeSceneEndListener failed", new Object[0]);
            }
        }
    }

    /* renamed from: v1 */
    public static boolean m22885v1(byte[] bArr, int i) {
        PByteArray pByteArray = new PByteArray();
        synchronized (f58876g) {
            int i2 = f58885s;
            f58885s = i2 + 1;
            C86406l.m107073a(bArr, i2, (short) i, pByteArray, f58880n);
            C20843b bVar = f58879j;
            if (bVar != null) {
                bVar.mo32548a(i2, pByteArray.value, i);
            }
            Log.m105925i("MicroMsg.BackupBaseScene", "sendBuf sendSeq[%d], type[%d], buflen[%d]", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(pByteArray.value.length));
        }
        return true;
    }

    /* renamed from: w1 */
    public static boolean m22886w1(byte[] bArr, int i, int i2) {
        PByteArray pByteArray = new PByteArray();
        C86406l.m107073a(bArr, i2, (short) i, pByteArray, f58880n);
        C20843b bVar = f58879j;
        if (bVar == null) {
            return true;
        }
        bVar.mo32548a(i2, pByteArray.value, i);
        return true;
    }

    /* renamed from: x1 */
    public static void m22887x1() {
        if (f58883q == null) {
            f58883q = new C116995k();
        }
        C116995k kVar = f58883q;
        kVar.getClass();
        try {
            Log.m105924i("MicroMsg.BackupLogManager", IXWebBroadcastListener.STAGE_START);
            C116995k.f350572c = 0;
            C116995k.f350573d = 0;
            C116995k.f350574e = 0;
            C116995k.f350575f = 0;
            MTimerHandler mTimerHandler = kVar.f350577b;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
                kVar.f350577b = null;
            }
            long nowMilliSecond = Util.nowMilliSecond();
            C116995k.f350572c = nowMilliSecond;
            C116995k.f350574e = kVar.mo180960a(nowMilliSecond);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BackupLogManager", e, "start exception", new Object[0]);
        }
    }

    /* renamed from: y1 */
    public static void m22888y1(C20856m.C20858b bVar) {
        C20856m mVar = f58884r;
        if (mVar == null) {
            Log.m105924i("MicroMsg.BackupBaseScene", "startBackupReconnectHandler, no old backupReconnectHandler is stopped, new one.");
        } else if (!mVar.f58935c) {
            Log.m105920e("MicroMsg.BackupBaseScene", "startBackupReconnectHandler, backupReconnectHandler already running, ignore it.");
            return;
        } else {
            Log.m105924i("MicroMsg.BackupBaseScene", "startBackupReconnectHandler, old backupReconnectHandler is stopped, new one.");
        }
        C20856m mVar2 = new C20856m(bVar);
        f58884r = mVar2;
        Log.m105924i("MicroMsg.BackupReconnectHandler", "start backupReconnectTimeHandler.");
        C20856m.f58932f = 0;
        mVar2.f58935c = false;
        mVar2.f58934b = 1;
        if (mVar2.f58933a != null) {
            mVar2.f58937e.startTimer(0);
        }
    }

    /* renamed from: z1 */
    public static void m22889z1() {
        C20853j jVar = f58881o;
        if (!(jVar == null || jVar.f58929e == null)) {
            Log.m105924i("MicroMsg.BackupHeartBeatHandler", "stop");
            jVar.f58929e = Boolean.TRUE;
        }
        C20853j jVar2 = new C20853j();
        f58881o = jVar2;
        jVar2.mo32557b(true);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        return 0;
    }

    /* renamed from: m1 */
    public void mo32546m1(int i, int i2, String str) {
        f58877h.post(new C20847a(i, i2, str));
    }

    /* renamed from: o1 */
    public boolean mo32547o1() {
        try {
            byte[] byteArray = mo32542q1().toByteArray();
            ConcurrentHashMap<Integer, C20842c> concurrentHashMap = f58876g;
            synchronized (concurrentHashMap) {
                int i = f58885s;
                f58885s = i + 1;
                this.f58887d = i;
                C86406l.m107073a(byteArray, i, (short) getType(), this.f58888e, f58880n);
                C20843b bVar = f58879j;
                if (bVar != null) {
                    bVar.mo32548a(this.f58887d, this.f58888e.value, getType());
                }
                concurrentHashMap.put(Integer.valueOf(this.f58887d), this);
                Log.m105925i("MicroMsg.BackupBaseScene", "doScene sendSeq[%d], type[%d], buflen[%d], sceneCount:%d", Integer.valueOf(this.f58887d), Integer.valueOf(getType()), Integer.valueOf(this.f58888e.value.length), Integer.valueOf(concurrentHashMap.size()));
            }
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BackupBaseScene", e, "req to buf fail: " + e.toString(), new Object[0]);
            return false;
        }
    }

    /* renamed from: q1 */
    public abstract C47465a mo32542q1();

    /* renamed from: r1 */
    public abstract C47465a mo32543r1();

    /* renamed from: t1 */
    public abstract void mo32544t1(int i);
}
