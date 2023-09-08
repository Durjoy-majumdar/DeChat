package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import a70.C112760b;
import android.util.Base64;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.locks.ReentrantLock;
import te3.C64557mj3;
import te3.C64578nc0;
import te3.C78002u53;
import te3.C78015xr2;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.w */
public class C71654w {

    /* renamed from: q */
    public static final C71654w f207659q = new C71654w();

    /* renamed from: r */
    public static final String f207660r;

    /* renamed from: s */
    public static final String f207661s;

    /* renamed from: a */
    public C78015xr2 f207662a;

    /* renamed from: b */
    public C78015xr2 f207663b;

    /* renamed from: c */
    public long f207664c;

    /* renamed from: d */
    public long f207665d;

    /* renamed from: e */
    public List<Bankcard> f207666e;

    /* renamed from: f */
    public List<Bankcard> f207667f;

    /* renamed from: g */
    public ReentrantLock f207668g = new ReentrantLock();

    /* renamed from: h */
    public String f207669h;

    /* renamed from: i */
    public String f207670i;

    /* renamed from: j */
    public String f207671j;

    /* renamed from: k */
    public int f207672k;

    /* renamed from: l */
    public String f207673l;

    /* renamed from: m */
    public String f207674m;

    /* renamed from: n */
    public C64578nc0 f207675n;

    /* renamed from: o */
    public LinkedList<C64557mj3> f207676o;

    /* renamed from: p */
    public Vector<C71657c> f207677p = new Vector<>();

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.w$a */
    public class C71655a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f207678d;

        public C71655a(String str) {
            this.f207678d = str;
        }

        public void run() {
            Iterator<C71657c> it = C71654w.this.f207677p.iterator();
            while (it.hasNext()) {
                it.next().mo98826a(true, this.f207678d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.w$b */
    public class C71656b implements Runnable {
        public C71656b() {
        }

        public void run() {
            Iterator<C71657c> it = C71654w.this.f207677p.iterator();
            while (it.hasNext()) {
                it.next().mo98826a(false, "");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.w$c */
    public interface C71657c {
        /* renamed from: a */
        void mo98826a(boolean z, String str);
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C112760b.m154195C() + "wallet/lqt" + "/");
        sb.append("/save/");
        f207660r = sb.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(C112760b.m154195C() + "wallet/lqt" + "/");
        sb4.append("/fetch/");
        f207661s = sb4.toString();
    }

    /* renamed from: a */
    public final void mo98818a(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        C78015xr2 xr22 = z ? this.f207662a : this.f207663b;
        long j = z ? this.f207664c : this.f207665d;
        if (xr22 == null && z) {
            String str = z ? f207660r : f207661s;
            Iterable<C86001b0> t = C86013q1.m106459t(str, false);
            if (t != null) {
                Log.m105925i("MicroMsg.LqtBindQueryInfoCache", "tryLoadCacheFromDisk: %s, save: %s", t, Boolean.valueOf(z));
                long currentTimeMillis2 = System.currentTimeMillis();
                Iterator<C86001b0> it = t.iterator();
                while (it.hasNext()) {
                    String str2 = it.next().f250472b;
                    String str3 = str + str2;
                    Iterator<C86001b0> it4 = it;
                    long j2 = Util.getLong(str2, 0);
                    Log.m105925i("MicroMsg.LqtBindQueryInfoCache", "file name: %s", Long.valueOf(j2));
                    if (j2 <= 0) {
                        C86013q1.m106447h(str3);
                    } else if (currentTimeMillis2 - j2 < 3600000) {
                        byte[] O = C86013q1.m106433O(str3, 0, -1);
                        C78015xr2 xr23 = new C78015xr2();
                        try {
                            xr23.parseFrom(O);
                        } catch (IOException e) {
                            IOException iOException = e;
                            Log.printErrStackTrace("MicroMsg.LqtBindQueryInfoCache", iOException, "parse bindquery from cache error: %s", iOException.getMessage());
                            xr23 = null;
                        }
                        if (xr23 != null) {
                            this.f207668g.lock();
                            if (z) {
                                this.f207662a = xr23;
                                this.f207666e = null;
                                this.f207664c = j2;
                            } else {
                                this.f207663b = xr23;
                                this.f207667f = null;
                                this.f207665d = j2;
                            }
                            this.f207668g.unlock();
                            Log.m105925i("MicroMsg.LqtBindQueryInfoCache", "succ get saveCache: %s %s", xr23, Long.valueOf(j2));
                            return;
                        }
                    } else {
                        C86013q1.m106447h(str3);
                    }
                    it = it4;
                }
            }
        } else if (currentTimeMillis - j > 3600000) {
            Log.m105924i("MicroMsg.LqtBindQueryInfoCache", "checkCache, saveCache time exceed, try reload from disk");
        }
    }

    /* renamed from: b */
    public Bankcard mo98819b(boolean z) {
        List<Bankcard> d;
        mo98818a(z);
        C78015xr2 xr22 = z ? this.f207662a : this.f207663b;
        if (xr22 == null || Util.isNullOrNil(xr22.f228535d) || (d = mo98821d(z)) == null || d.size() <= 0) {
            return null;
        }
        String str = xr22.f228535d;
        if (Util.isNullOrNil(str)) {
            return null;
        }
        for (Bankcard next : d) {
            if (next != null && str.equals(next.field_bindSerial)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: c */
    public List<Bankcard> mo98820c(boolean z) {
        mo98818a(z);
        if ((z ? this.f207662a : this.f207663b) != null) {
            return mo98821d(z);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x003f A[Catch:{ all -> 0x00ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0086 A[Catch:{ all -> 0x00ce }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.tencent.p014mm.plugin.wallet_core.model.Bankcard> mo98821d(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0005
            te3.xr2 r0 = r2.f207662a
            goto L_0x0007
        L_0x0005:
            te3.xr2 r0 = r2.f207663b
        L_0x0007:
            java.util.concurrent.locks.ReentrantLock r1 = r2.f207668g     // Catch:{ all -> 0x00ce }
            r1.lock()     // Catch:{ all -> 0x00ce }
            if (r0 != 0) goto L_0x001c
            r0 = 0
            if (r3 == 0) goto L_0x0014
            r2.f207666e = r0     // Catch:{ all -> 0x00ce }
            goto L_0x0016
        L_0x0014:
            r2.f207667f = r0     // Catch:{ all -> 0x00ce }
        L_0x0016:
            java.util.concurrent.locks.ReentrantLock r3 = r2.f207668g
            r3.unlock()
            return r0
        L_0x001c:
            if (r3 == 0) goto L_0x0030
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Bankcard> r0 = r2.f207666e     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x003d
            int r0 = r0.size()     // Catch:{ all -> 0x00ce }
            if (r0 <= 0) goto L_0x003d
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Bankcard> r3 = r2.f207666e     // Catch:{ all -> 0x00ce }
        L_0x002a:
            java.util.concurrent.locks.ReentrantLock r0 = r2.f207668g
            r0.unlock()
            return r3
        L_0x0030:
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Bankcard> r0 = r2.f207667f     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x003d
            int r0 = r0.size()     // Catch:{ all -> 0x00ce }
            if (r0 <= 0) goto L_0x003d
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Bankcard> r3 = r2.f207667f     // Catch:{ all -> 0x00ce }
            goto L_0x002a
        L_0x003d:
            if (r3 == 0) goto L_0x0086
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x00ce }
            r3.<init>()     // Catch:{ all -> 0x00ce }
            r2.f207666e = r3     // Catch:{ all -> 0x00ce }
            te3.xr2 r3 = r2.f207662a     // Catch:{ all -> 0x00ce }
            te3.h9 r3 = r3.f228538g     // Catch:{ all -> 0x00ce }
            if (r3 == 0) goto L_0x0057
            com.tencent.mm.plugin.wallet_core.model.Bankcard r3 = b63.C67196n0.m79475b(r3)     // Catch:{ all -> 0x00ce }
            if (r3 == 0) goto L_0x0057
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Bankcard> r0 = r2.f207666e     // Catch:{ all -> 0x00ce }
            r0.add(r3)     // Catch:{ all -> 0x00ce }
        L_0x0057:
            te3.xr2 r3 = r2.f207662a     // Catch:{ all -> 0x00ce }
            java.util.LinkedList<te3.bp> r3 = r3.f228536e     // Catch:{ all -> 0x00ce }
            if (r3 == 0) goto L_0x0083
            int r3 = r3.size()     // Catch:{ all -> 0x00ce }
            if (r3 <= 0) goto L_0x0083
            te3.xr2 r3 = r2.f207662a     // Catch:{ all -> 0x00ce }
            java.util.LinkedList<te3.bp> r3 = r3.f228536e     // Catch:{ all -> 0x00ce }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00ce }
        L_0x006b:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x0083
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x00ce }
            te3.bp r0 = (te3.C77909bp) r0     // Catch:{ all -> 0x00ce }
            com.tencent.mm.plugin.wallet_core.model.Bankcard r0 = b63.C67181d.m79455b(r0)     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x006b
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Bankcard> r1 = r2.f207666e     // Catch:{ all -> 0x00ce }
            r1.add(r0)     // Catch:{ all -> 0x00ce }
            goto L_0x006b
        L_0x0083:
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Bankcard> r3 = r2.f207666e     // Catch:{ all -> 0x00ce }
            goto L_0x002a
        L_0x0086:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x00ce }
            r3.<init>()     // Catch:{ all -> 0x00ce }
            r2.f207667f = r3     // Catch:{ all -> 0x00ce }
            te3.xr2 r3 = r2.f207663b     // Catch:{ all -> 0x00ce }
            te3.h9 r3 = r3.f228538g     // Catch:{ all -> 0x00ce }
            if (r3 == 0) goto L_0x009e
            com.tencent.mm.plugin.wallet_core.model.Bankcard r3 = b63.C67196n0.m79475b(r3)     // Catch:{ all -> 0x00ce }
            if (r3 == 0) goto L_0x009e
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Bankcard> r0 = r2.f207667f     // Catch:{ all -> 0x00ce }
            r0.add(r3)     // Catch:{ all -> 0x00ce }
        L_0x009e:
            te3.xr2 r3 = r2.f207663b     // Catch:{ all -> 0x00ce }
            java.util.LinkedList<te3.bp> r3 = r3.f228536e     // Catch:{ all -> 0x00ce }
            if (r3 == 0) goto L_0x00ca
            int r3 = r3.size()     // Catch:{ all -> 0x00ce }
            if (r3 <= 0) goto L_0x00ca
            te3.xr2 r3 = r2.f207663b     // Catch:{ all -> 0x00ce }
            java.util.LinkedList<te3.bp> r3 = r3.f228536e     // Catch:{ all -> 0x00ce }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00ce }
        L_0x00b2:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x00ce }
            te3.bp r0 = (te3.C77909bp) r0     // Catch:{ all -> 0x00ce }
            com.tencent.mm.plugin.wallet_core.model.Bankcard r0 = b63.C67181d.m79455b(r0)     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x00b2
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Bankcard> r1 = r2.f207667f     // Catch:{ all -> 0x00ce }
            r1.add(r0)     // Catch:{ all -> 0x00ce }
            goto L_0x00b2
        L_0x00ca:
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Bankcard> r3 = r2.f207667f     // Catch:{ all -> 0x00ce }
            goto L_0x002a
        L_0x00ce:
            r3 = move-exception
            java.util.concurrent.locks.ReentrantLock r0 = r2.f207668g
            r0.unlock()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71654w.mo98821d(boolean):java.util.List");
    }

    /* renamed from: e */
    public void mo98822e(C78015xr2 xr22, boolean z, boolean z2, String str) {
        if (z2) {
            MMHandlerThread.postToMainThread(new C71655a(str));
        } else if (xr22 != null) {
            this.f207668g.lock();
            if (z) {
                this.f207662a = xr22;
                this.f207666e = null;
                this.f207664c = System.currentTimeMillis();
            } else {
                this.f207663b = xr22;
                this.f207667f = null;
                this.f207665d = System.currentTimeMillis();
            }
            this.f207668g.unlock();
            Log.m105925i("MicroMsg.LqtBindQueryInfoCache", "setCache: %s, save: %s", xr22, Boolean.valueOf(z));
            try {
                ThreadPool.post(new C30544x(this, xr22.toByteArray(), z), "LqtBindQueryInfoCache_saveCacheToDiski");
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.LqtBindQueryInfoCache", e, "saveCacheToDisk error: %s", e.getMessage());
            }
            MMHandlerThread.postToMainThread(new C71656b());
        }
    }

    /* renamed from: f */
    public void mo98823f(C78002u53 u532, int i) {
        this.f207669h = u532.f228285g;
        this.f207670i = u532.f228286h;
        this.f207671j = u532.f228287i;
        this.f207672k = u532.f228288j;
        this.f207673l = u532.f228290o;
        this.f207675n = u532.f228291p;
        this.f207676o = u532.f228301z;
        C78002u53 u533 = new C78002u53();
        u533.BaseResponse = u532.BaseResponse;
        u533.f228289n = u532.f228289n;
        u533.f228293r = u532.f228293r;
        u533.f228294s = u532.f228294s;
        u533.f228295t = u532.f228295t;
        u533.f228296u = u532.f228296u;
        u533.f228297v = u532.f228297v;
        u533.f228298w = u532.f228298w;
        u533.f228299x = u532.f228299x;
        u533.f228300y = u532.f228300y;
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("WCPay.OnClickPurchaseRes");
        String str = "";
        String str2 = ((String) C86709a0.m107535s().mo121142i().mo119684e(2, str)) + i;
        try {
            byte[] byteArray = u533.toByteArray();
            String encodeToString = byteArray.length > 0 ? Base64.encodeToString(byteArray, 0) : str;
            if (encodeToString != null) {
                if (encodeToString.length() != 0) {
                    str = encodeToString;
                }
            }
            mmkv.putString(str2, str);
        } catch (Exception unused) {
        }
    }
}
