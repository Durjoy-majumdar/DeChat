package mv0;

import android.util.Pair;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import gv0.C20842c;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jv0.C99055a;
import kv0.C99246b;
import lu3.C88656g;
import lv0.C99659k;
import mv0.C99990k;
import nv0.C100216b;
import nv0.C61906d;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47355o;
import pv0.C47536u;
import pv0.C47537w;
import pv0.C62560e0;
import te3.C101780g9;
import te3.C77926f9;
import zt3.C119157j;
import zu0.C103092u;

/* renamed from: mv0.l */
public class C99996l implements C47355o {

    /* renamed from: d */
    public List<C47537w> f292972d;

    /* renamed from: e */
    public List<C47537w> f292973e;

    /* renamed from: f */
    public Object f292974f = new Object();

    /* renamed from: g */
    public boolean f292975g = false;

    /* renamed from: h */
    public boolean f292976h = false;

    /* renamed from: i */
    public HashSet<String> f292977i = new HashSet<>();

    /* renamed from: j */
    public boolean f292978j = false;

    /* renamed from: n */
    public C11385n f292979n;

    /* renamed from: o */
    public C99990k.C99994d f292980o;

    /* renamed from: p */
    public int f292981p = 0;

    /* renamed from: q */
    public boolean f292982q = false;

    /* renamed from: r */
    public boolean f292983r = false;

    /* renamed from: s */
    public long f292984s;

    /* renamed from: t */
    public long f292985t;

    /* renamed from: u */
    public int f292986u;

    /* renamed from: v */
    public int f292987v = 0;

    /* renamed from: mv0.l$a */
    public class C99997a implements C88656g {
        public C99997a() {
        }

        public String getKey() {
            return "RecoverPCServer_recover";
        }

        public void run() {
            C99996l.m130675a(C99996l.this);
        }
    }

    /* renamed from: a */
    public static void m130675a(C99996l lVar) {
        lVar.getClass();
        C86013q1.m106445f(C99055a.m129003b());
        C100000n nVar = new C100000n(lVar);
        lVar.f292979n = nVar;
        C20842c.m22879k1(7, nVar);
        for (C47537w next : lVar.f292973e) {
            if (lVar.f292975g && !lVar.f292976h) {
                Log.m105924i("MicroMsg.RecoverPCServer", "hit pause");
                synchronized (lVar.f292974f) {
                    try {
                        lVar.f292974f.wait();
                    } catch (InterruptedException e) {
                        Log.printErrStackTrace("MicroMsg.RecoverPCServer", e, "", new Object[0]);
                    }
                }
            }
            if (lVar.f292976h) {
                Log.m105924i("MicroMsg.RecoverPCServer", "backupImp canceled");
                return;
            }
            C61906d dVar = new C61906d(C99055a.m129003b(), next.f127548d, 2, next.f127549e, lVar, C99980a.m130643h().f303746f);
            synchronized (lVar.f292974f) {
                dVar.mo32547o1();
                lVar.f292977i.add(next.f127548d);
                Log.m105925i("MicroMsg.RecoverPCServer", "media recoverImp now: size:%d", Integer.valueOf(lVar.f292977i.size()));
                if (lVar.f292977i.size() > 10) {
                    try {
                        lVar.f292974f.wait();
                    } catch (InterruptedException e2) {
                        Log.printErrStackTrace("MicroMsg.RecoverPCServer", e2, "", new Object[0]);
                    }
                }
            }
        }
        for (C47537w next2 : lVar.f292972d) {
            if (lVar.f292975g && !lVar.f292976h) {
                Log.m105924i("MicroMsg.RecoverPCServer", "hit pause");
                synchronized (lVar.f292974f) {
                    try {
                        lVar.f292974f.wait();
                    } catch (InterruptedException e3) {
                        Log.printErrStackTrace("MicroMsg.RecoverPCServer", e3, "", new Object[0]);
                    }
                }
            }
            if (lVar.f292976h) {
                Log.m105924i("MicroMsg.RecoverPCServer", "backupImp canceled");
                return;
            }
            C61906d dVar2 = new C61906d(C99055a.m129003b(), next2.f127548d, 1, next2.f127549e, lVar, C99980a.m130643h().f303746f);
            synchronized (lVar.f292974f) {
                dVar2.mo32547o1();
                lVar.f292977i.add(next2.f127548d);
                Log.m105925i("MicroMsg.RecoverPCServer", "digest recoverImp now: size:%d", Integer.valueOf(lVar.f292977i.size()));
                if (lVar.f292977i.size() > 10) {
                    try {
                        lVar.f292974f.wait();
                    } catch (InterruptedException e4) {
                        Log.printErrStackTrace("MicroMsg.RecoverPCServer", e4, "", new Object[0]);
                    }
                }
            }
        }
        lVar.f292978j = true;
        Log.m105924i("MicroMsg.RecoverPCServer", "send RestoreData req finish");
        lVar.mo139341d();
    }

    /* renamed from: b */
    public static int m130676b(C99996l lVar, String str, HashMap hashMap, C99246b bVar, HashSet hashSet) {
        C99996l lVar2 = lVar;
        String str2 = str;
        C99246b bVar2 = bVar;
        lVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        byte[] O = C86013q1.m106433O(str2, 0, -1);
        try {
            C101780g9 g9Var = (C101780g9) new C101780g9().parseFrom(O);
            Iterator<C77926f9> it = g9Var.f298276e.iterator();
            while (it.hasNext()) {
                C77926f9 next = it.next();
                if (lVar2.f292975g && !lVar2.f292976h) {
                    synchronized (lVar2.f292974f) {
                        try {
                            lVar2.f292974f.wait();
                        } catch (InterruptedException e) {
                            Log.printErrStackTrace("MicroMsg.RecoverPCServer", e, "", new Object[0]);
                        }
                    }
                }
                if (lVar2.f292976h) {
                    Log.m105924i("MicroMsg.RecoverPCServer", "backupImp canceled");
                    return -1;
                }
                try {
                    C99659k.m130076b(next, hashMap, hashSet, (HashMap<String, Pair<Long, Long>>) null);
                    int i = lVar2.f292987v + 1;
                    lVar2.f292987v = i;
                    if (i % 100 == 0) {
                        lVar.mo139342e();
                    }
                } catch (Exception e2) {
                    Log.m105920e("MicroMsg.RecoverPCServer", "readFromSdcard err:" + e2.toString());
                    Log.printErrStackTrace("MicroMsg.RecoverPCServer", e2, "", new Object[0]);
                }
                C103092u.m136366c(next.f227333d);
                bVar.getClass();
                long nowMilliSecond = Util.nowMilliSecond();
                if (nowMilliSecond - bVar2.f290989b > 10000) {
                    bVar.mo138596b();
                    bVar.mo138595a();
                    bVar2.f290989b = nowMilliSecond;
                }
            }
            C103092u.m136365b();
            Log.m105918d("MicroMsg.RecoverPCServer", "read item time " + (System.currentTimeMillis() - currentTimeMillis));
            return g9Var.f298276e.size();
        } catch (Exception e3) {
            Object[] objArr = new Object[3];
            objArr[0] = str2;
            objArr[1] = e3;
            objArr[2] = Integer.valueOf(O == null ? 0 : O.length);
            Log.m105921e("MicroMsg.RecoverPCServer", "read mmPath errr %s, %s, len:%d", objArr);
            Log.printErrStackTrace("MicroMsg.RecoverPCServer", e3, "", new Object[0]);
            return 0;
        }
    }

    /* renamed from: c */
    public void mo139340c() {
        Log.m105924i("MicroMsg.RecoverPCServer", "cancel");
        this.f292976h = true;
        synchronized (this.f292974f) {
            this.f292974f.notifyAll();
        }
        C20842c.m22884u1(7, this.f292979n);
        this.f292980o = null;
        this.f292982q = false;
        this.f292983r = false;
        this.f292981p = 0;
        this.f292986u = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo139341d() {
        /*
            r4 = this;
            boolean r0 = r4.f292978j
            if (r0 == 0) goto L_0x005e
            boolean r0 = r4.f292976h
            if (r0 == 0) goto L_0x0009
            goto L_0x005e
        L_0x0009:
            java.lang.Object r0 = r4.f292974f
            monitor-enter(r0)
            java.util.HashSet<java.lang.String> r1 = r4.f292977i     // Catch:{ all -> 0x005b }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x0059
            boolean r1 = r4.f292976h     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x001a
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return
        L_0x001a:
            r1 = 1
            r4.f292982q = r1     // Catch:{ all -> 0x005b }
            r1 = 0
            r4.f292986u = r1     // Catch:{ all -> 0x005b }
            mv0.a r2 = mv0.C99980a.m130643h()     // Catch:{ all -> 0x005b }
            mv0.k r2 = r2.mo139322k()     // Catch:{ all -> 0x005b }
            r3 = 6
            r2.f292969q = r3     // Catch:{ all -> 0x005b }
            mv0.a r2 = mv0.C99980a.m130643h()     // Catch:{ all -> 0x005b }
            mv0.k r2 = r2.mo139322k()     // Catch:{ all -> 0x005b }
            r3 = 5
            r2.f292970r = r3     // Catch:{ all -> 0x005b }
            mv0.k$d r2 = r4.f292980o     // Catch:{ all -> 0x005b }
            if (r2 == 0) goto L_0x003e
            r2.mo127336W2()     // Catch:{ all -> 0x005b }
            goto L_0x0046
        L_0x003e:
            java.lang.String r2 = "MicroMsg.RecoverPCServer"
            java.lang.String r3 = "operatorCallback is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ all -> 0x005b }
        L_0x0046:
            r2 = 7
            ob0.n r3 = r4.f292979n     // Catch:{ all -> 0x005b }
            gv0.C20842c.m22884u1(r2, r3)     // Catch:{ all -> 0x005b }
            r4.mo139343f(r1, r1)     // Catch:{ all -> 0x005b }
            mv0.C99990k.m130657f()     // Catch:{ all -> 0x005b }
            java.lang.String r1 = "MicroMsg.RecoverPCServer"
            java.lang.String r2 = "checkRecover publicRestAccUinEven"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x005b }
        L_0x0059:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return
        L_0x005b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            throw r1
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mv0.C99996l.mo139341d():void");
    }

    /* renamed from: e */
    public void mo139342e() {
        System.gc();
        long freeMemory = Runtime.getRuntime().freeMemory() / 1000;
        long j = Runtime.getRuntime().totalMemory() / 1000;
        Log.m105925i("MicroMsg.RecoverPCServer", "memoryInfo avail/total, dalvik[%dk, %dk, user:%dk], recoverCnt:%d", Long.valueOf(freeMemory), Long.valueOf(j), Long.valueOf(j - freeMemory), Integer.valueOf(this.f292987v));
    }

    /* renamed from: f */
    public final void mo139343f(int i, int i2) {
        C99990k.C99994d dVar;
        int i3 = (int) (i == 0 ? 0 : (((long) i) * 100) / ((long) i2));
        if ((i == 0 && i2 == 0) || i3 > this.f292981p) {
            this.f292981p = i3;
            if (!this.f292975g && !this.f292976h && (dVar = this.f292980o) != null && i3 >= 0 && i3 <= 100) {
                dVar.mo127338m4(i3);
            }
            C62560e0 e0Var = new C62560e0();
            e0Var.f177686d = 13;
            e0Var.f177688f = 0;
            e0Var.f177689g = this.f292981p;
            try {
                Log.m105925i("MicroMsg.RecoverPCServer", "send progress cmd, progress :%d", Integer.valueOf(i3));
                C20842c.m22885v1(e0Var.toByteArray(), 3);
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.RecoverPCServer", e, "", new Object[0]);
                Log.m105920e("MicroMsg.RecoverPCServer", "buf to PacketCommandRequest err");
            }
        }
    }

    /* renamed from: g */
    public void mo139344g(C47536u uVar) {
        this.f292987v = 0;
        if (this.f292973e.size() < uVar.f127542g || this.f292972d.size() < uVar.f127541f) {
            C20842c.m22879k1(3, new C99998m(this));
            Log.m105924i("MicroMsg.RecoverPCServer", "send restore info cmd");
            new C100216b(2).mo32547o1();
            return;
        }
        Log.m105924i("MicroMsg.RecoverPCServer", "startRecover start directly");
        ((C119157j) C119157j.f356862d).mo183875f(new C99997a());
    }

    /* renamed from: m */
    public void mo26221m(int i, int i2, C117747y yVar) {
        C99990k.C99994d dVar;
        int i3;
        long j = this.f292985t + ((long) i);
        this.f292985t = j;
        long j2 = this.f292984s;
        int i4 = j2 == 0 ? 0 : (int) ((j * 100) / j2);
        if (i4 > this.f292986u) {
            this.f292986u = i4;
            int i5 = C61906d.f176002D;
            Log.m105925i("MicroMsg.BakSceneRestoreData", "setProgress %d", Integer.valueOf(i4));
            C61906d.f176002D = i4;
        }
        if (this.f292975g || this.f292976h || (dVar = this.f292980o) == null || (i3 = this.f292986u) < 0 || i3 > 100) {
            Log.m105919d("MicroMsg.RecoverPCServer", "failed to call operatorCallback.onNetProgress:%d", Integer.valueOf(this.f292986u));
        } else {
            dVar.mo127339o1(i3);
        }
    }
}
