package l20;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import l20.C21389b;
import p327ct.C20362d;

/* renamed from: l20.a */
public class C21388a implements C20362d {

    /* renamed from: e */
    public static volatile C21388a f60494e;

    /* renamed from: a */
    public C21389b f60495a = new C21389b();

    /* renamed from: b */
    public ArrayList<WeakReference<C20362d.C20363a>> f60496b = new ArrayList<>();

    /* renamed from: c */
    public boolean f60497c = false;

    /* renamed from: d */
    public MMHandler f60498d = new a$$c(this, Looper.getMainLooper());

    /* renamed from: g */
    public static C21388a m24108g() {
        if (f60494e == null) {
            synchronized (C21388a.class) {
                if (f60494e == null) {
                    f60494e = new C21388a();
                }
            }
        }
        if (!f60494e.f60497c && C86709a0.m107522a()) {
            C21388a aVar = f60494e;
            if (!aVar.f60497c) {
                aVar.f60497c = true;
                C21389b bVar = aVar.f60495a;
                bVar.getClass();
                bVar.f60515f = C86709a0.m107535s().mo121142i();
            }
        }
        return f60494e;
    }

    /* renamed from: a */
    public void mo33493a(C20362d.C20363a aVar) {
        if (!this.f60497c) {
            Log.m105928w("MicroMsg.NewBadge", "addWatch NewBadge has not initialized");
        } else {
            this.f60496b.add(new WeakReference(aVar));
        }
    }

    /* renamed from: b */
    public boolean mo33494b(int i, int i2) {
        if (!this.f60497c) {
            Log.m105928w("MicroMsg.NewBadge", "hasDot NewBadge has not initialized");
            return false;
        }
        C21389b.C21390a f = this.f60495a.mo33516f(i, i2, 2);
        return (f == null || mo33502k(f.f60519d) == 0) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0086 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0087 A[RETURN] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo33495c(com.tencent.p014mm.storage.C72994y1.C72995a r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8.f60497c
            r1 = 0
            if (r0 != 0) goto L_0x000d
            java.lang.String r9 = "MicroMsg.NewBadge"
            java.lang.String r10 = "hasDot NewBadge has not initialized"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r10)
            return r1
        L_0x000d:
            l20.b r0 = r8.f60495a
            r0.getClass()
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r9
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r4 = 1
            r2[r4] = r3
            r3 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r2[r3] = r5
            java.lang.String r5 = "MicroMsg.NewBadgeDecoder"
            java.lang.String r6 = "[carl] peek, dataSourceKey %s, watcherId %d, type %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r6, r2)
            l20.b$a r2 = r0.mo33512b(r9)
            r6 = 0
            if (r2 != 0) goto L_0x003a
            java.lang.String r9 = "[carl] peek, dataSource == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r9)
        L_0x0038:
            r2 = r6
            goto L_0x007b
        L_0x003a:
            int r7 = r2.f60518c
            r3 = r3 & r7
            if (r3 != 0) goto L_0x0045
            java.lang.String r9 = "[alex] peek, dataSource.type is wrong"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r9)
            goto L_0x0038
        L_0x0045:
            l20.b$b r10 = r0.mo33513c(r10)
            if (r10 == 0) goto L_0x0075
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r10.f60524d
            java.lang.String r5 = r9.name()
            java.lang.Object r3 = r3.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0062
            java.lang.String r5 = r2.f60520e
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x0062
            goto L_0x0038
        L_0x0062:
            if (r3 != 0) goto L_0x007b
            java.lang.String r3 = r0.mo33515e()
            java.util.HashMap<java.lang.String, java.lang.String> r5 = r10.f60524d
            java.lang.String r9 = r9.name()
            r5.put(r9, r3)
            r0.mo33519i(r10)
            goto L_0x007b
        L_0x0075:
            java.lang.String r9 = "[carl] peek, watcher == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r9)
            goto L_0x0038
        L_0x007b:
            if (r2 != 0) goto L_0x007e
            return r1
        L_0x007e:
            java.lang.String r9 = r2.f60519d
            int r9 = r8.mo33502k(r9)
            if (r9 != 0) goto L_0x0087
            return r1
        L_0x0087:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l20.C21388a.mo33495c(com.tencent.mm.storage.y1$a, int):boolean");
    }

    /* renamed from: d */
    public boolean mo33496d(C72994y1.C72995a aVar, C72994y1.C72995a aVar2) {
        if (!this.f60497c) {
            Log.m105928w("MicroMsg.NewBadge", "hasDot NewBadge has not initialized");
            return false;
        }
        C21389b.C21390a g = this.f60495a.mo33517g(aVar, aVar2, 2);
        return (g == null || mo33502k(g.f60519d) == 0) ? false : true;
    }

    /* renamed from: e */
    public boolean mo33497e(int i, int i2) {
        if (!this.f60497c) {
            Log.m105928w("MicroMsg.NewBadge", "hasNew NewBadge has not initialized");
            return false;
        }
        C21389b.C21390a f = this.f60495a.mo33516f(i, i2, 1);
        return (f == null || mo33502k(f.f60519d) == 0) ? false : true;
    }

    /* renamed from: f */
    public boolean mo33498f(C72994y1.C72995a aVar, C72994y1.C72995a aVar2) {
        if (!this.f60497c) {
            Log.m105928w("MicroMsg.NewBadge", "hasNew NewBadge has not initialized");
            return false;
        }
        C21389b.C21390a g = this.f60495a.mo33517g(aVar, aVar2, 1);
        return (g == null || mo33502k(g.f60519d) == 0) ? false : true;
    }

    /* renamed from: h */
    public void mo33499h(int i, int i2) {
        if (!this.f60497c) {
            Log.m105928w("MicroMsg.NewBadge", "markRead NewBadge has not initialized");
            return;
        }
        C21389b bVar = this.f60495a;
        bVar.getClass();
        Log.m105919d("MicroMsg.NewBadgeDecoder", "[carl] doWatch, doWatch %d, watcherId %d", Integer.valueOf(i), Integer.valueOf(i2));
        C21389b.C21390a a = bVar.mo33511a(i);
        if (a == null) {
            Log.m105918d("MicroMsg.NewBadgeDecoder", "[carl] doWatch, dataSource == null");
        } else {
            C21389b.C21391b c = bVar.mo33513c(i2);
            if (c == null) {
                Log.m105920e("MicroMsg.NewBadgeDecoder", "[carl] doWatch, watcher == null, do some fix");
                c = new C21389b.C21391b(bVar);
                c.f60521a = i2;
                bVar.f60512c.put(i2, c);
            }
            c.f60523c.put(i, a.f60520e);
            bVar.mo33519i(c);
        }
        MMHandler mMHandler = this.f60498d;
        mMHandler.sendMessage(mMHandler.obtainMessage(1, new a$$e(this, i2, i)));
    }

    /* renamed from: i */
    public void mo33500i(C72994y1.C72995a aVar, int i) {
        if (!this.f60497c) {
            Log.m105928w("MicroMsg.NewBadge", "markRead NewBadge has not initialized");
            return;
        }
        C21389b bVar = this.f60495a;
        bVar.getClass();
        Log.m105919d("MicroMsg.NewBadgeDecoder", "[carl] doWatch, doWatch %s, watcherKey %d", aVar, Integer.valueOf(i));
        C21389b.C21390a b = bVar.mo33512b(aVar);
        if (b == null) {
            Log.m105918d("MicroMsg.NewBadgeDecoder", "[carl] doWatch, dataSource == null");
        } else {
            C21389b.C21391b c = bVar.mo33513c(i);
            if (c == null) {
                Log.m105920e("MicroMsg.NewBadgeDecoder", "[carl] doWatch, watcher == null, do some fix");
                c = new C21389b.C21391b(bVar);
                c.f60521a = i;
                bVar.f60512c.put(i, c);
            }
            c.f60524d.put(aVar.name(), b.f60520e);
            bVar.mo33519i(c);
        }
        MMHandler mMHandler = this.f60498d;
        mMHandler.sendMessage(mMHandler.obtainMessage(1, new a$$e(this, i, aVar)));
    }

    /* renamed from: j */
    public void mo33501j(C72994y1.C72995a aVar, C72994y1.C72995a aVar2) {
        if (!this.f60497c) {
            Log.m105928w("MicroMsg.NewBadge", "markRead NewBadge has not initialized");
            return;
        }
        C21389b bVar = this.f60495a;
        bVar.getClass();
        Log.m105919d("MicroMsg.NewBadgeDecoder", "[carl] doWatch, doWatch %s, watcherKey %s", aVar, aVar2);
        C21389b.C21390a b = bVar.mo33512b(aVar);
        if (b == null) {
            Log.m105918d("MicroMsg.NewBadgeDecoder", "[carl] doWatch, dataSource == null");
        } else {
            C21389b.C21391b d = bVar.mo33514d(aVar2);
            if (d == null) {
                Log.m105920e("MicroMsg.NewBadgeDecoder", "[carl] doWatch, watcher == null, do some fix");
                d = new C21389b.C21391b(bVar);
                d.f60522b = aVar2;
                bVar.f60513d.put(aVar2, d);
            }
            d.f60524d.put(aVar.name(), b.f60520e);
            bVar.mo33519i(d);
        }
        MMHandler mMHandler = this.f60498d;
        mMHandler.sendMessage(mMHandler.obtainMessage(1, new a$$e(this, aVar2, aVar)));
    }

    /* renamed from: k */
    public final int mo33502k(String str) {
        if (Util.isNullOrNil(str)) {
            return 0;
        }
        return Util.safeParseInt(str);
    }

    /* renamed from: l */
    public boolean mo33503l(int i) {
        if (!this.f60497c) {
            Log.m105928w("MicroMsg.NewBadge", "queryHasDotSourceValue NewBadge has not initialized");
            return false;
        }
        C21389b.C21390a a = this.f60495a.mo33511a(i);
        return (a == null || mo33502k(a.f60519d) == 0) ? false : true;
    }

    /* renamed from: m */
    public void mo33504m(C20362d.C20363a aVar) {
        if (!this.f60497c) {
            Log.m105928w("MicroMsg.NewBadge", "removeWatch NewBadge has not initialized");
            return;
        }
        ArrayList arrayList = null;
        for (int i = 0; i < this.f60496b.size(); i++) {
            WeakReference weakReference = this.f60496b.get(i);
            if (weakReference == null || weakReference.get() == null || weakReference.get() == aVar) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(weakReference);
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f60496b.remove((WeakReference) it.next());
            }
            arrayList.clear();
        }
    }

    /* renamed from: n */
    public final void mo33505n(int i, int i2, String str) {
        if (!this.f60497c) {
            Log.m105928w("MicroMsg.NewBadge", "updateDataSource NewBadge has not initialized");
            return;
        }
        C21389b bVar = this.f60495a;
        bVar.getClass();
        Log.m105919d("MicroMsg.NewBadgeDecoder", "[carl] updateDataSourceValue, dataSourceId %d, type %d, value %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        C21389b.C21390a a = bVar.mo33511a(i);
        if (a == null) {
            C21389b.C21390a aVar = new C21389b.C21390a(bVar);
            aVar.f60516a = i;
            aVar.f60518c = i2;
            aVar.f60519d = "";
            aVar.f60520e = "";
            bVar.f60510a.put(i, aVar);
            bVar.mo33518h(aVar);
            a = aVar;
        }
        a.f60519d = str;
        a.f60518c = i2;
        a.f60520e = bVar.mo33515e();
        bVar.mo33518h(a);
        MMHandler mMHandler = this.f60498d;
        mMHandler.sendMessage(mMHandler.obtainMessage(0, new a$$d(this, i, i2, str)));
    }

    /* renamed from: o */
    public final void mo33506o(C72994y1.C72995a aVar, int i, String str) {
        if (!this.f60497c) {
            Log.m105928w("MicroMsg.NewBadge", "updateDataSource NewBadge has not initialized");
            return;
        }
        C21389b bVar = this.f60495a;
        bVar.getClass();
        Log.m105919d("MicroMsg.NewBadgeDecoder", "[carl] updateDataSourceValue, dataSourceKey %s, type %d, value %s", aVar, Integer.valueOf(i), str);
        C21389b.C21390a b = bVar.mo33512b(aVar);
        if (b == null) {
            C21389b.C21390a aVar2 = new C21389b.C21390a(bVar);
            aVar2.f60517b = aVar;
            aVar2.f60518c = i;
            aVar2.f60519d = "";
            aVar2.f60520e = "";
            bVar.f60511b.put(aVar, aVar2);
            bVar.mo33518h(aVar2);
            b = aVar2;
        }
        b.f60519d = str;
        b.f60518c = i;
        b.f60520e = bVar.mo33515e();
        bVar.mo33518h(b);
        MMHandler mMHandler = this.f60498d;
        mMHandler.sendMessage(mMHandler.obtainMessage(0, new a$$d(this, aVar, i, str)));
    }

    /* renamed from: p */
    public void mo33507p(int i, boolean z) {
        mo33505n(i, 2, !z ? "0" : "1");
    }

    /* renamed from: q */
    public void mo33508q(C72994y1.C72995a aVar, boolean z) {
        mo33506o(aVar, 2, !z ? "0" : "1");
    }

    /* renamed from: r */
    public void mo33509r(int i, boolean z) {
        mo33505n(i, 1, !z ? "0" : "1");
    }

    /* renamed from: s */
    public void mo33510s(C72994y1.C72995a aVar, boolean z) {
        mo33506o(aVar, 1, !z ? "0" : "1");
    }
}
