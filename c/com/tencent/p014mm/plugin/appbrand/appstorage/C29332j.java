package com.tencent.p014mm.plugin.appbrand.appstorage;

import android.content.SharedPreferences;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81414g0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import eb0.C86491q2;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import mi0.C34574b;
import p823sg.C77710q;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.j */
public final class C29332j extends C86491q2 {

    /* renamed from: e */
    public static final C29333a f80085e = new C29333a((C8480h) null);

    /* renamed from: b */
    public final String f80086b;

    /* renamed from: c */
    public final C29339n f80087c;

    /* renamed from: d */
    public final long f80088d;

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.j$a */
    public static final class C29333a {
        public C29333a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo56611a(String str, long j, String str2) {
            C87412m.m108594g(str, "key");
            C87412m.m108594g(str2, "appId");
            return str + '#' + j + '#' + str2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.j$b */
    public static final class C29334b {

        /* renamed from: a */
        public long f80089a;

        /* renamed from: b */
        public long f80090b;

        /* renamed from: c */
        public final int f80091c;

        public C29334b(long j, long j2, int i) {
            this.f80089a = j;
            this.f80090b = j2;
            this.f80091c = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29334b)) {
                return false;
            }
            C29334b bVar = (C29334b) obj;
            return this.f80089a == bVar.f80089a && this.f80090b == bVar.f80090b && this.f80091c == bVar.f80091c;
        }

        public int hashCode() {
            long j = this.f80089a;
            long j2 = this.f80090b;
            return (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f80091c;
        }

        public String toString() {
            return "Result(readTime=" + this.f80089a + ", writeTime=" + this.f80090b + ", size=" + this.f80091c + ')';
        }
    }

    public C29332j(String str) {
        Class cls = C34574b.class;
        C87412m.m108594g(str, "appid");
        this.f80086b = str;
        this.f80087c = C29339n.f80095h.mo56626a(new C77710q(((C34574b) C86312j.m106911c(cls)).mo56629LU(str)).longValue());
        this.f80088d = new C77710q(((C34574b) C86312j.m106911c(cls)).mo56629LU(str)).longValue();
    }

    /* renamed from: a */
    public String mo56580a() {
        return "MicroMsg.AppBrandKVStorageTransfer";
    }

    /* renamed from: b */
    public boolean mo56581b(int i) {
        boolean z = !MMApplicationContext.getDefaultPreference().getBoolean(f80085e.mo56611a("keyHadFinishTransfer", this.f80088d, this.f80086b), false);
        Log.m105924i("MicroMsg.AppBrandKVStorageTransfer", "needTransfer " + z);
        return z;
    }

    /* renamed from: c */
    public void mo56582c(int i) {
        boolean z;
        boolean z2;
        int i2;
        SharedPreferences sharedPreferences;
        int i3;
        C29334b bVar;
        boolean z3;
        C29336k kVar = C29336k.f80092a;
        synchronized (kVar) {
            C81161g2.vx0().getClass();
            C81161g2.requireAccountInitializedOnDemand();
            z = C29336k.f80093b;
        }
        if (!z) {
            Log.m105924i("MicroMsg.AppBrandKVStorageTransfer", "[transfer] isNeedTransfer = false");
            return;
        }
        SharedPreferences defaultPreference = MMApplicationContext.getDefaultPreference();
        char c = 0;
        if (kVar.mo56615a()) {
            Log.m105924i("MicroMsg.AppBrandKVStorageTransfer", "rollback phases, clear [had transfer to mmkv] flag");
            defaultPreference.edit().putBoolean(f80085e.mo56611a("hadTransferToMMKV", this.f80088d, this.f80086b), false).apply();
            this.f80087c.mo56617a(this.f80086b);
            return;
        }
        C29333a aVar = f80085e;
        boolean z4 = defaultPreference.getBoolean(aVar.mo56611a("hadTransferToMMKV", this.f80088d, this.f80086b), false);
        if (z4) {
            synchronized (kVar) {
                C81161g2.vx0().getClass();
                C81161g2.requireAccountInitializedOnDemand();
                z3 = C29336k.f80094c == 3;
            }
            if (z3) {
                mo56610d(defaultPreference);
                defaultPreference.edit().putBoolean(aVar.mo56611a("keyHadFinishTransfer", this.f80088d, this.f80086b), true).apply();
                return;
            }
        }
        if (z4) {
            Log.m105924i("MicroMsg.AppBrandKVStorageTransfer", "[transfer] had transfer to mmkv, return");
            return;
        }
        Log.m105924i("MicroMsg.AppBrandKVStorageTransfer", "start transfer");
        long j = 0;
        C115669n.INSTANCE.mo175912v(1016, 0);
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105924i("MicroMsg.AppBrandKVStorageTransfer", "clear MMKV");
        this.f80087c.mo56617a(this.f80086b);
        C81161g2.requireAccountInitializedOnDemand();
        C29328h hVar = C81161g2.f238469e;
        int[] f = C81420m0.m99900f(this.f80086b, hVar.f80080e, hVar.f80081f);
        C81161g2.requireAccountInitializedOnDemand();
        int Bk = C81161g2.f238469e.mo56589Bk(this.f80086b);
        int length = f.length;
        long j2 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = f[i4];
            C81161g2.requireAccountInitializedOnDemand();
            int[] iArr = f;
            Object obj = C81161g2.f238469e.mo56588Bh(i6, this.f80086b)[c];
            ArrayList arrayList = obj instanceof ArrayList ? (ArrayList) obj : null;
            if (arrayList == null) {
                bVar = new C29334b(0, 0, 0);
            } else if (arrayList.size() == 0) {
                bVar = new C29334b(0, 0, 0);
            } else {
                Log.m105924i("MicroMsg.AppBrandKVStorageTransfer", "[transfer] key size = " + arrayList.size());
                Iterator it = arrayList.iterator();
                long j3 = 0;
                long j4 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    Iterator it4 = it;
                    String str = next instanceof String ? (String) next : null;
                    if (str == null) {
                        str = "";
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    C81161g2.requireAccountInitializedOnDemand();
                    int i7 = length;
                    SharedPreferences sharedPreferences2 = defaultPreference;
                    Object[] xf = C81161g2.f238469e.mo56596xf(i6, this.f80086b, str);
                    long currentTimeMillis3 = j3 + (System.currentTimeMillis() - currentTimeMillis2);
                    int i8 = Bk;
                    Object obj2 = xf[1];
                    Object obj3 = xf[2];
                    if (!C87412m.m108589b(str, "") && xf[0] == C81414g0.C29326a.NONE && (obj2 instanceof String) && (obj3 instanceof String)) {
                        long currentTimeMillis4 = System.currentTimeMillis();
                        this.f80087c.mo56595j0(i6, this.f80086b, str, (String) obj2, (String) obj3);
                        j4 += System.currentTimeMillis() - currentTimeMillis4;
                    }
                    it = it4;
                    length = i7;
                    defaultPreference = sharedPreferences2;
                    j3 = currentTimeMillis3;
                    Bk = i8;
                }
                sharedPreferences = defaultPreference;
                i2 = Bk;
                i3 = length;
                bVar = new C29334b(j3, j4, arrayList.size());
                j += bVar.f80089a;
                j2 += bVar.f80090b;
                i5 += bVar.f80091c;
                i4++;
                f = iArr;
                length = i3;
                defaultPreference = sharedPreferences;
                Bk = i2;
                c = 0;
            }
            sharedPreferences = defaultPreference;
            i2 = Bk;
            i3 = length;
            j += bVar.f80089a;
            j2 += bVar.f80090b;
            i5 += bVar.f80091c;
            i4++;
            f = iArr;
            length = i3;
            defaultPreference = sharedPreferences;
            Bk = i2;
            c = 0;
        }
        SharedPreferences sharedPreferences3 = defaultPreference;
        int i9 = Bk;
        long currentTimeMillis5 = System.currentTimeMillis() - currentTimeMillis;
        if (FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION < currentTimeMillis5) {
            C115669n.INSTANCE.mo175912v(1016, 12);
        } else {
            C115669n.INSTANCE.mo175912v(1016, 11);
        }
        Log.m105924i("MicroMsg.AppBrandKVStorageTransfer", "finish transfer, cost total time= " + currentTimeMillis5 + " ms read time = " + j + " ms, write time = " + j2 + " ms");
        int Bk2 = this.f80087c.mo56589Bk(this.f80086b);
        int e = this.f80087c.mo56621e(this.f80086b);
        StringBuilder sb = new StringBuilder();
        sb.append("newbytes =");
        sb.append(Bk2);
        sb.append(" oldbytes =");
        int i15 = i9;
        sb.append(i15);
        sb.append("  newsize =");
        sb.append(e);
        sb.append("  oldsize =");
        sb.append(i5);
        sb.append(' ');
        Log.m105924i("MicroMsg.AppBrandKVStorageTransfer", sb.toString());
        boolean z5 = Bk2 == i15;
        boolean z6 = e == i5;
        if (z5 && z6) {
            C115669n.INSTANCE.mo175912v(1016, 1);
        } else if (!z5 && !z6) {
            C115669n.INSTANCE.mo175912v(1016, 4);
        } else if (!z5) {
            C115669n.INSTANCE.mo175912v(1016, 3);
        } else if (!z6) {
            C115669n.INSTANCE.mo175912v(1016, 2);
        }
        if (e != i5) {
            IllegalStateException illegalStateException = new IllegalStateException("tansfer failed ");
            if (BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
                throw illegalStateException;
            }
            Log.printErrStackTrace("MicroMsg.AppBrandKVStorageTransfer", illegalStateException, "transfer failed", new Object[0]);
        }
        Log.m105924i("MicroMsg.AppBrandKVStorageTransfer", "finish transfer, prev ");
        C115669n.INSTANCE.mo160131h(16335, this.f80086b, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(Bk2), Integer.valueOf(this.f80087c.mo56621e(this.f80086b)));
        SharedPreferences.Editor edit = sharedPreferences3.edit();
        C29333a aVar2 = f80085e;
        edit.putBoolean(aVar2.mo56611a("hadTransferToMMKV", this.f80088d, this.f80086b), true).apply();
        synchronized (C29336k.f80092a) {
            C81161g2.vx0().getClass();
            C81161g2.requireAccountInitializedOnDemand();
            z2 = C29336k.f80094c == 3;
        }
        if (z2) {
            SharedPreferences sharedPreferences4 = sharedPreferences3;
            mo56610d(sharedPreferences4);
            sharedPreferences4.edit().putBoolean(aVar2.mo56611a("keyHadFinishTransfer", this.f80088d, this.f80086b), true).apply();
        }
    }

    /* renamed from: d */
    public final void mo56610d(SharedPreferences sharedPreferences) {
        C29333a aVar = f80085e;
        if (sharedPreferences.getBoolean(aVar.mo56611a("keyHadCleanOldScheme", this.f80088d, this.f80086b), false)) {
            Log.m105924i("MicroMsg.AppBrandKVStorageTransfer", "[transfer] had clear old scheme data, return");
            return;
        }
        Log.m105924i("MicroMsg.AppBrandKVStorageTransfer", "[transfer] clear old scheme data");
        C81161g2.requireAccountInitializedOnDemand();
        C29328h hVar = C81161g2.f238469e;
        String str = this.f80086b;
        for (int i = 0; i <= 3; i++) {
            hVar.mo56590S(i, str);
        }
        hVar.getClass();
        sharedPreferences.edit().putBoolean(aVar.mo56611a("keyHadCleanOldScheme", this.f80088d, this.f80086b), true).apply();
    }
}
