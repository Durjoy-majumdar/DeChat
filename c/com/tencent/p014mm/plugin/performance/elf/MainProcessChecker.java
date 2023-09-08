package com.tencent.p014mm.plugin.performance.elf;

import android.os.Debug;
import android.os.Looper;
import android.os.SystemClock;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.TrafficStats;
import com.tencent.p014mm.sdk.platformtools.Util;
import ge2.C32427c;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kj2.C117407d;
import zh3.C119118e;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.performance.elf.MainProcessChecker */
public class MainProcessChecker extends AbstractProcessChecker {

    /* renamed from: y */
    public static final long[] f248550y = {0, 86400000};

    /* renamed from: z */
    public static String f248551z = "";

    /* renamed from: d */
    public long f248552d = 1048576;

    /* renamed from: e */
    public long f248553e = 6000;

    /* renamed from: f */
    public long f248554f = 734003200;

    /* renamed from: g */
    public long f248555g = 734003200;

    /* renamed from: h */
    public int f248556h = 92;

    /* renamed from: i */
    public float f248557i = (((float) 92) * 0.01f);

    /* renamed from: j */
    public int f248558j = 85;

    /* renamed from: k */
    public float f248559k = (((float) 85) * 0.01f);

    /* renamed from: l */
    public boolean f248560l = false;

    /* renamed from: m */
    public boolean f248561m = true;

    /* renamed from: n */
    public boolean f248562n = false;

    /* renamed from: o */
    public long f248563o;

    /* renamed from: p */
    public long f248564p;

    /* renamed from: q */
    public long f248565q;

    /* renamed from: r */
    public long f248566r;

    /* renamed from: s */
    public long f248567s;

    /* renamed from: t */
    public int f248568t = 1;

    /* renamed from: u */
    public long f248569u;

    /* renamed from: v */
    public StringBuilder f248570v = new StringBuilder();

    /* renamed from: w */
    public boolean f248571w = false;

    /* renamed from: x */
    public long f248572x = 0;

    /* renamed from: com.tencent.mm.plugin.performance.elf.MainProcessChecker$a */
    public class C85319a implements Runnable {
        public C85319a() {
        }

        public void run() {
            MainProcessChecker mainProcessChecker = MainProcessChecker.this;
            if (mainProcessChecker.f248545c || mainProcessChecker.mo118554h()) {
                Log.m105920e("MicroMsg.MainProcessChecker", "escaped killing");
                return;
            }
            MainProcessChecker mainProcessChecker2 = MainProcessChecker.this;
            mainProcessChecker2.f248568t = 256 | mainProcessChecker2.f248568t;
            mainProcessChecker2.mo118573s(true);
            MainProcessChecker.this.mo118555i();
        }
    }

    /* renamed from: com.tencent.mm.plugin.performance.elf.MainProcessChecker$b */
    public class C85320b implements Runnable {
        public C85320b() {
        }

        public void run() {
            MainProcessChecker mainProcessChecker = MainProcessChecker.this;
            if (mainProcessChecker.f248544b.f248547e) {
                Log.m105928w(mainProcessChecker.mo57299e(), "[onCallUp] My God, you saw me!");
                C117407d.INSTANCE.idkeyStat(959, 7, 1, true);
                return;
            }
            Log.m105928w(mainProcessChecker.mo57299e(), "[onCallUp] you can't see me, perry!");
        }
    }

    /* renamed from: a */
    public long mo118551a() {
        return this.f248569u;
    }

    /* renamed from: c */
    public String mo118552c() {
        StringBuilder sb = new StringBuilder(this.f248570v);
        sb.append(super.mo118552c());
        HashMap hashMap = new HashMap();
        ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
        Thread[] threadArr = new Thread[(threadGroup.activeCount() * 2)];
        int enumerate = threadGroup.enumerate(threadArr);
        int i = 0;
        for (int i2 = 0; i2 < enumerate; i2++) {
            String name = threadArr[i2].getName();
            if (!Util.isNullOrNil(name)) {
                String replaceAll = name.replaceAll("-?[0-9]\\d*", "?");
                if (hashMap.containsKey(replaceAll)) {
                    hashMap.put(replaceAll, Integer.valueOf(((Integer) hashMap.get(replaceAll)).intValue() + 1));
                } else {
                    hashMap.put(replaceAll, 1);
                }
                i++;
            }
        }
        if (i >= 300) {
            sb.append("threadCount:");
            sb.append(i);
            sb.append("\n");
            sb.append(hashMap.toString());
            sb.append("\n");
            C117407d.INSTANCE.idkeyStat(959, 8, 1, true);
        }
        return sb.toString();
    }

    /* renamed from: e */
    public String mo57299e() {
        return "MicroMsg.MainProcessChecker";
    }

    /* renamed from: g */
    public boolean mo118553g() {
        return this.f248560l;
    }

    /* renamed from: j */
    public void mo118556j(boolean z) {
        this.f248545c = z;
        Log.m105925i("MicroMsg.MainProcessChecker", "[onAppForeground] isForeground:%s", Boolean.valueOf(z));
        if (!z) {
            this.f248572x = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: k */
    public void mo118557k(int i, int i2) {
        Log.m105929w(mo57299e(), "[onCallUp] %s -> %s", Integer.valueOf(i2), Integer.valueOf(i));
        if (MMApplicationContext.isMMProcess()) {
            C117407d.INSTANCE.idkeyStat(959, 1, 1, true);
            MMHandler mMHandler = this.f248543a;
            if (mMHandler == null || mMHandler.isQuit()) {
                this.f248543a = new MMHandler("ProcessChecker");
            }
            this.f248543a.postDelayed(new C85320b(), 30000);
        }
    }

    /* renamed from: l */
    public boolean mo118558l(long j, long j2) {
        this.f248560l = true;
        Log.m105925i(mo57299e(), "[onCheck] processId:%s loopCheckTime:%sms isForeground:%s", Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(this.f248545c));
        try {
            if (!this.f248560l) {
                this.f248568t |= 0;
            } else if (!C119118e.f356734n) {
                if (Util.isNullOrNil(this.f248544b.f248546d)) {
                    Log.m105928w("MicroMsg.MainProcessChecker", "it's never start activity! just return.");
                    this.f248568t |= 2;
                } else if (this.f248545c) {
                    Log.m105928w("MicroMsg.MainProcessChecker", "isForeground true! just return.");
                    this.f248568t |= 4;
                } else {
                    if (!(SystemClock.uptimeMillis() - this.f248572x >= j2)) {
                        Log.m105929w("MicroMsg.MainProcessChecker", "it's not enough loopCheckTime[%s], just return.", Long.valueOf(j2));
                        this.f248568t |= 4;
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        Calendar instance = Calendar.getInstance();
                        instance.set(11, 0);
                        instance.set(13, 0);
                        instance.set(12, 0);
                        instance.set(14, 0);
                        long timeInMillis = currentTimeMillis - instance.getTimeInMillis();
                        C32427c cVar = C32427c.f85998c;
                        long[] jArr = f248550y;
                        long j3 = jArr[0];
                        if (!(j3 <= timeInMillis && timeInMillis <= jArr[1])) {
                            Log.m105929w("MicroMsg.MainProcessChecker", "it's not at workTime[%s-%s], just return.", Long.valueOf(j3), Long.valueOf(jArr[1]));
                            this.f248568t |= 8;
                        } else {
                            if (this.f248562n) {
                                if (!(!this.f248545c && f248551z.equalsIgnoreCase(this.f248544b.f248546d))) {
                                    Log.m105928w("MicroMsg.MainProcessChecker", "it cares if it whether LauncherUI to back but it's not, just return.");
                                    this.f248568t |= 16;
                                }
                            }
                            if (mo118554h()) {
                                this.f248568t |= 32;
                            } else if (!this.f248561m || !mo118571q(j2)) {
                                if (this.f248561m) {
                                    long b = AbstractProcessChecker.m105293b() - this.f248567s;
                                    Log.m105925i(mo57299e(), "[isCpuBusy] diff:%s Jiffies", Long.valueOf(b));
                                    if (((float) b) >= ((((float) j2) * 1.0f) / 60000.0f) * ((float) this.f248553e)) {
                                        this.f248568t |= 1024;
                                        Log.m105924i(mo57299e(), "is cpu busy, just return");
                                    }
                                }
                                boolean p = mo118570p();
                                mo118574t();
                                mo118573s(p);
                                this.f248568t = 1;
                                return p;
                            } else {
                                this.f248568t |= 512;
                                Log.m105924i(mo57299e(), "is over Traffic, just return");
                            }
                        }
                    }
                }
            }
            return false;
        } finally {
            mo118574t();
            mo118573s(false);
            this.f248568t = 1;
        }
    }

    /* renamed from: m */
    public void mo118559m() {
        Log.m105925i(mo57299e(), "onScreenOff enable:%s", Boolean.valueOf(this.f248560l));
        if (this.f248560l) {
            C32427c cVar = C32427c.f85998c;
            if (!this.f248571w && !mo118554h() && ((double) AbstractProcessChecker.m105295f()) >= 3.99431958528E9d) {
                ((C119157j) C119157j.f356862d).mo183879j(new C85319a(), TimeUnit.MINUTES.toMillis(1), "TAG_KILLING_DELAY");
            }
        }
    }

    /* renamed from: n */
    public void mo118560n() {
        ((C119157j) C119157j.f356862d).mo183894y("TAG_KILLING_DELAY");
    }

    /* renamed from: p */
    public final boolean mo118570p() {
        boolean z;
        long maxMemory = Runtime.getRuntime().maxMemory();
        float f = (((float) Runtime.getRuntime().totalMemory()) * 1.0f) / ((float) maxMemory);
        boolean z2 = false;
        Log.m105925i(mo57299e(), "[isOverMemory] java[%s:%s]", Float.valueOf(f), Float.valueOf(this.f248559k));
        if (f >= this.f248559k) {
            this.f248568t |= 64;
            z = true;
        } else {
            z = false;
        }
        if (!this.f248571w) {
            float f2 = (((float) AbstractProcessChecker.m105295f()) * 1.0f) / 4.2949673E9f;
            Log.m105925i(mo57299e(), "[isOverMemory] vm[%s:%s]", Float.valueOf(f2), Float.valueOf(this.f248557i));
            if (f2 >= this.f248557i) {
                this.f248568t |= 256;
                z = true;
            }
        }
        long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
        if (nativeHeapAllocatedSize <= 0) {
            Log.m105928w("MicroMsg.MainProcessChecker", "fallback: native AllocatedSize = 0");
            nativeHeapAllocatedSize = Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize();
        }
        Log.m105929w(mo57299e(), "[isOverMemory] native[%s:%s]", Long.valueOf(nativeHeapAllocatedSize), Long.valueOf(this.f248555g));
        if (nativeHeapAllocatedSize > this.f248555g) {
            z2 = true;
        }
        if (!z2) {
            return z;
        }
        this.f248568t |= 128;
        return true;
    }

    /* renamed from: q */
    public final boolean mo118571q(long j) {
        long wxMobileTx = TrafficStats.getWxMobileTx(this.f248563o) + TrafficStats.getWxMobileRx(this.f248564p) + TrafficStats.getWxWifiTx(this.f248565q) + TrafficStats.getWxMobileRx(this.f248566r);
        Log.m105925i(mo57299e(), "[isTraffic] diff:%s byte", Long.valueOf(wxMobileTx));
        return ((float) wxMobileTx) > ((((float) j) * 1.0f) / 60000.0f) * ((float) this.f248552d);
    }

    /* renamed from: r */
    public final boolean mo118572r(int i, int i2) {
        return (i & i2) > 0;
    }

    /* renamed from: s */
    public final void mo118573s(boolean z) {
        if (MMApplicationContext.isMMProcess() && this.f248560l) {
            ArrayList arrayList = new ArrayList();
            if (z) {
                IDKey iDKey = new IDKey();
                iDKey.SetID(959);
                iDKey.SetKey(0);
                iDKey.SetValue(1);
                arrayList.add(iDKey);
                IDKey iDKey2 = new IDKey();
                iDKey2.SetID(959);
                iDKey2.SetKey(2);
                iDKey2.SetValue(1);
                arrayList.add(iDKey2);
                if (mo118572r(this.f248568t, 64)) {
                    IDKey iDKey3 = new IDKey();
                    iDKey3.SetID(959);
                    iDKey3.SetKey(3);
                    iDKey3.SetValue(1);
                    arrayList.add(iDKey3);
                }
                if (mo118572r(this.f248568t, 256)) {
                    IDKey iDKey4 = new IDKey();
                    iDKey4.SetID(959);
                    iDKey4.SetKey(4);
                    iDKey4.SetValue(1);
                    arrayList.add(iDKey4);
                }
                if (mo118572r(this.f248568t, 128)) {
                    IDKey iDKey5 = new IDKey();
                    iDKey5.SetID(959);
                    iDKey5.SetKey(5);
                    iDKey5.SetValue(1);
                    arrayList.add(iDKey5);
                }
            } else {
                IDKey iDKey6 = new IDKey();
                iDKey6.SetID(959);
                iDKey6.SetValue(1);
                arrayList.add(iDKey6);
                if (mo118572r(this.f248568t, 8)) {
                    iDKey6.SetKey(100);
                } else if (mo118572r(this.f248568t, 16)) {
                    iDKey6.SetKey(101);
                } else if (mo118572r(this.f248568t, 32)) {
                    iDKey6.SetKey(102);
                } else if (mo118572r(this.f248568t, 512)) {
                    iDKey6.SetKey(103);
                } else if (mo118572r(this.f248568t, 1024)) {
                    iDKey6.SetKey(104);
                } else if (mo118572r(this.f248568t, 64) || mo118572r(this.f248568t, 128) || mo118572r(this.f248568t, 256)) {
                    iDKey6.SetKey(105);
                } else {
                    arrayList.remove(iDKey6);
                }
            }
            IDKey iDKey7 = new IDKey();
            iDKey7.SetID(959);
            iDKey7.SetValue(1);
            arrayList.add(iDKey7);
            if (mo118572r(this.f248568t, 4)) {
                iDKey7.SetKey(106);
            } else {
                iDKey7.SetKey(107);
            }
            C117407d.INSTANCE.mo160124a(arrayList, false);
        }
    }

    /* renamed from: t */
    public final void mo118574t() {
        this.f248563o = TrafficStats.getWxMobileTx(0);
        this.f248564p = TrafficStats.getWxMobileRx(0);
        this.f248565q = TrafficStats.getWxWifiTx(0);
        this.f248566r = TrafficStats.getWxWifiRx(0);
        this.f248567s = AbstractProcessChecker.m105293b();
    }
}
