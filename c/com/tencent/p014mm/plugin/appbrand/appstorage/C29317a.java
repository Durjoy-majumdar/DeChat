package com.tencent.p014mm.plugin.appbrand.appstorage;

import android.content.SharedPreferences;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81414g0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import eb0.C86491q2;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import mi0.C34574b;
import p823sg.C77710q;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.a */
public final class C29317a extends C86491q2 {

    /* renamed from: b */
    public final String f80043b;

    /* renamed from: c */
    public final C29320c f80044c;

    /* renamed from: d */
    public final C29339n f80045d;

    /* renamed from: e */
    public final long f80046e;

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.a$a */
    public static final class C29318a {

        /* renamed from: a */
        public long f80047a;

        /* renamed from: b */
        public long f80048b;

        /* renamed from: c */
        public final int f80049c;

        public C29318a(long j, long j2, int i) {
            this.f80047a = j;
            this.f80048b = j2;
            this.f80049c = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29318a)) {
                return false;
            }
            C29318a aVar = (C29318a) obj;
            return this.f80047a == aVar.f80047a && this.f80048b == aVar.f80048b && this.f80049c == aVar.f80049c;
        }

        public int hashCode() {
            long j = this.f80047a;
            long j2 = this.f80048b;
            return (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f80049c;
        }

        public String toString() {
            return "Result(readTime=" + this.f80047a + ", writeTime=" + this.f80048b + ", size=" + this.f80049c + ')';
        }
    }

    public C29317a(String str, String str2) {
        Class cls = C34574b.class;
        C87412m.m108594g(str, "appid");
        C87412m.m108594g(str2, "encryptMMKVStorageSecretKey");
        this.f80043b = str;
        this.f80044c = C29320c.f80053i.mo56600b(new C77710q(((C34574b) C86312j.m106911c(cls)).mo56629LU(str)).longValue(), str, str2, (C29339n) null);
        this.f80045d = C29339n.f80095h.mo56626a(new C77710q(((C34574b) C86312j.m106911c(cls)).mo56629LU(str)).longValue());
        this.f80046e = new C77710q(((C34574b) C86312j.m106911c(cls)).mo56629LU(str)).longValue();
    }

    /* renamed from: a */
    public String mo56580a() {
        return "MicroMsg.AppBrandEncryptKVStorageTransfer";
    }

    /* renamed from: b */
    public boolean mo56581b(int i) {
        SharedPreferences defaultPreference = MMApplicationContext.getDefaultPreference();
        long j = this.f80046e;
        String str = this.f80043b;
        C87412m.m108594g(str, "appId");
        boolean z = false;
        if (defaultPreference.getBoolean("keyHadFinishTransfer" + '#' + j + '#' + str, false)) {
            long j2 = this.f80046e;
            String str2 = this.f80043b;
            C87412m.m108594g(str2, "appId");
            MultiProcessMMKV multiProcessMMKV = MultiProcessMMKV.getDefault();
            if (!multiProcessMMKV.getBoolean("keyHadFinishTransferToEncryptMMKV" + '#' + j2 + '#' + str2, false)) {
                z = true;
            }
        }
        Log.m105924i("MicroMsg.AppBrandEncryptKVStorageTransfer", "needTransfer " + z);
        return z;
    }

    /* renamed from: c */
    public void mo56582c(int i) {
        boolean z;
        char c;
        boolean z2;
        boolean z3;
        long j;
        int i2;
        int i3;
        int[] iArr;
        C29318a aVar;
        boolean z4;
        C29319b bVar = C29319b.f80050a;
        synchronized (bVar) {
            C81161g2.vx0().getClass();
            C81161g2.requireAccountInitializedOnDemand();
            z = C29319b.f80051b;
        }
        if (!z) {
            Log.m105924i("MicroMsg.AppBrandEncryptKVStorageTransfer", "[transfer] isNeedTransfer = false");
            return;
        }
        synchronized (bVar) {
            C81161g2.vx0().getClass();
            C81161g2.requireAccountInitializedOnDemand();
            c = 0;
            z2 = C29319b.f80052c == 2;
        }
        if (z2) {
            Log.m105924i("MicroMsg.AppBrandEncryptKVStorageTransfer", "rollback phases, clear [had transfer to encrypt mmkv] flag");
            long j2 = this.f80046e;
            String str = this.f80043b;
            C87412m.m108594g(str, "appId");
            MultiProcessMMKV.getDefault().putBoolean("hadTransferToEncryptMMKV" + '#' + j2 + '#' + str, false).apply();
            this.f80044c.mo56592a(this.f80043b);
            return;
        }
        long j3 = this.f80046e;
        String str2 = this.f80043b;
        C87412m.m108594g(str2, "appId");
        boolean z5 = MultiProcessMMKV.getDefault().getBoolean("hadTransferToEncryptMMKV" + '#' + j3 + '#' + str2, false);
        if (z5) {
            synchronized (bVar) {
                C81161g2.vx0().getClass();
                C81161g2.requireAccountInitializedOnDemand();
                z4 = C29319b.f80052c == 3;
            }
            if (z4) {
                mo56583d();
                long j4 = this.f80046e;
                String str3 = this.f80043b;
                C87412m.m108594g(str3, "appId");
                MultiProcessMMKV.getDefault().putBoolean("keyHadFinishTransferToEncryptMMKV" + '#' + j4 + '#' + str3, true).apply();
                return;
            }
        }
        if (z5) {
            Log.m105924i("MicroMsg.AppBrandEncryptKVStorageTransfer", "[transfer] had transfer to encrypt mmkv, return");
            return;
        }
        Log.m105924i("MicroMsg.AppBrandEncryptKVStorageTransfer", "start transfer");
        long j5 = 0;
        C115669n.INSTANCE.mo175912v(1817, 0);
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105924i("MicroMsg.AppBrandEncryptKVStorageTransfer", "clear MMKV");
        this.f80044c.mo56592a(this.f80043b);
        C29339n nVar = this.f80045d;
        String str4 = this.f80043b;
        nVar.getClass();
        C87412m.m108594g(str4, "appId");
        int[] f = C81420m0.m99900f(str4, nVar.f80099f, nVar.f80100g);
        int Bk = this.f80045d.mo56589Bk(this.f80043b);
        int length = f.length;
        long j6 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i5 < length) {
            int i6 = f[i5];
            Object obj = this.f80045d.mo56588Bh(i6, this.f80043b)[c];
            ArrayList arrayList = obj instanceof ArrayList ? (ArrayList) obj : null;
            if (arrayList == null) {
                aVar = new C29318a(0, 0, 0);
            } else if (arrayList.size() == 0) {
                aVar = new C29318a(0, 0, 0);
            } else {
                Log.m105924i("MicroMsg.AppBrandEncryptKVStorageTransfer", "[transfer] key size = " + arrayList.size());
                Iterator it = arrayList.iterator();
                long j7 = 0;
                long j8 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int[] iArr2 = f;
                    String str5 = next instanceof String ? (String) next : null;
                    if (str5 == null) {
                        str5 = "";
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    Iterator it4 = it;
                    int i7 = length;
                    Object[] xf = this.f80045d.mo56596xf(i6, this.f80043b, str5);
                    long currentTimeMillis3 = j7 + (System.currentTimeMillis() - currentTimeMillis2);
                    int i8 = Bk;
                    Object obj2 = xf[1];
                    long j9 = currentTimeMillis;
                    Object obj3 = xf[2];
                    if (!C87412m.m108589b(str5, "") && xf[0] == C81414g0.C29326a.NONE && (obj2 instanceof String) && (obj3 instanceof String)) {
                        long currentTimeMillis4 = System.currentTimeMillis();
                        this.f80044c.mo56595j0(i6, this.f80043b, str5, (String) obj2, (String) obj3);
                        j8 += System.currentTimeMillis() - currentTimeMillis4;
                    }
                    f = iArr2;
                    it = it4;
                    length = i7;
                    j7 = currentTimeMillis3;
                    Bk = i8;
                    currentTimeMillis = j9;
                }
                iArr = f;
                i2 = Bk;
                j = currentTimeMillis;
                i3 = length;
                aVar = new C29318a(j7, j8, arrayList.size());
                j5 += aVar.f80047a;
                j6 += aVar.f80048b;
                i4 += aVar.f80049c;
                i5++;
                f = iArr;
                length = i3;
                Bk = i2;
                currentTimeMillis = j;
                c = 0;
            }
            iArr = f;
            i2 = Bk;
            j = currentTimeMillis;
            i3 = length;
            j5 += aVar.f80047a;
            j6 += aVar.f80048b;
            i4 += aVar.f80049c;
            i5++;
            f = iArr;
            length = i3;
            Bk = i2;
            currentTimeMillis = j;
            c = 0;
        }
        int i9 = Bk;
        long currentTimeMillis5 = System.currentTimeMillis() - currentTimeMillis;
        if (FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION < currentTimeMillis5) {
            C115669n.INSTANCE.mo175912v(1817, 10);
        } else {
            C115669n.INSTANCE.mo175912v(1817, 9);
        }
        Log.m105924i("MicroMsg.AppBrandEncryptKVStorageTransfer", "finish transfer, cost total time= " + currentTimeMillis5 + " ms read time = " + j5 + " ms, write time = " + j6 + " ms");
        int Bk2 = this.f80044c.mo56589Bk(this.f80043b);
        C29320c cVar = this.f80044c;
        String str6 = this.f80043b;
        cVar.getClass();
        C87412m.m108594g(str6, "appId");
        int e = cVar.f80059g.mo56621e(str6);
        StringBuilder sb = new StringBuilder();
        sb.append("newbytes =");
        sb.append(Bk2);
        sb.append(" oldbytes =");
        int i15 = i9;
        sb.append(i15);
        sb.append("  newsize =");
        sb.append(e);
        sb.append("  oldsize =");
        sb.append(i4);
        sb.append(' ');
        Log.m105924i("MicroMsg.AppBrandEncryptKVStorageTransfer", sb.toString());
        boolean z6 = Bk2 == i15;
        boolean z7 = e == i4;
        if (z6 && z7) {
            C115669n.INSTANCE.mo175912v(1817, 1);
        } else if (!z6 && !z7) {
            C115669n.INSTANCE.mo175912v(1817, 4);
        } else if (!z6) {
            C115669n.INSTANCE.mo175912v(1817, 3);
        } else if (!z7) {
            C115669n.INSTANCE.mo175912v(1817, 2);
        }
        if (e != i4) {
            IllegalStateException illegalStateException = new IllegalStateException("tansfer failed ");
            if (BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
                throw illegalStateException;
            }
            z3 = false;
            Log.printErrStackTrace("MicroMsg.AppBrandEncryptKVStorageTransfer", illegalStateException, "transfer failed", new Object[0]);
        } else {
            z3 = false;
        }
        Log.m105924i("MicroMsg.AppBrandEncryptKVStorageTransfer", "finish transfer, prev ");
        long j15 = this.f80046e;
        String str7 = this.f80043b;
        C87412m.m108594g(str7, "appId");
        MultiProcessMMKV.getDefault().putBoolean("hadTransferToEncryptMMKV" + '#' + j15 + '#' + str7, true).apply();
        synchronized (C29319b.f80050a) {
            C81161g2.vx0().getClass();
            C81161g2.requireAccountInitializedOnDemand();
            if (C29319b.f80052c == 3) {
                z3 = true;
            }
        }
        if (z3) {
            mo56583d();
            long j16 = this.f80046e;
            String str8 = this.f80043b;
            C87412m.m108594g(str8, "appId");
            MultiProcessMMKV.getDefault().putBoolean("keyHadFinishTransferToEncryptMMKV" + '#' + j16 + '#' + str8, true).apply();
        }
    }

    /* renamed from: d */
    public final void mo56583d() {
        long j = this.f80046e;
        String str = this.f80043b;
        C87412m.m108594g(str, "appId");
        MultiProcessMMKV multiProcessMMKV = MultiProcessMMKV.getDefault();
        if (multiProcessMMKV.getBoolean("keyHadCleanNoEncryptMMKVData" + '#' + j + '#' + str, false)) {
            Log.m105924i("MicroMsg.AppBrandEncryptKVStorageTransfer", "[transfer] had clear old scheme data, return");
            return;
        }
        Log.m105924i("MicroMsg.AppBrandEncryptKVStorageTransfer", "[transfer] clear old scheme data");
        this.f80045d.mo56617a(this.f80043b);
        long j2 = this.f80046e;
        String str2 = this.f80043b;
        C87412m.m108594g(str2, "appId");
        MultiProcessMMKV multiProcessMMKV2 = MultiProcessMMKV.getDefault();
        multiProcessMMKV2.putBoolean("keyHadCleanNoEncryptMMKVData" + '#' + j2 + '#' + str2, true).apply();
    }
}
