package qz1;

import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import i61.C98602h;
import java.lang.ref.WeakReference;
import o90.C100308d;
import p490dl.C97496s;
import p823sg.C101611g;
import q90.C101062d;
import z51.C39315g;

/* renamed from: qz1.c */
public class C101326c {

    /* renamed from: c */
    public static C101326c f296840c;

    /* renamed from: a */
    public C101611g<String, WeakReference<C101328e>> f296841a = new C100308d(10);

    /* renamed from: b */
    public C101611g<String, WeakReference<C101325b>> f296842b = new C100308d(10, new C101327a(this));

    /* renamed from: qz1.c$a */
    public class C101327a implements C101611g.C101612b<String, WeakReference<C101325b>> {
        public C101327a(C101326c cVar) {
        }

        public void preRemoveCallback(Object obj, Object obj2, Object obj3) {
            C101325b bVar;
            String str = (String) obj;
            WeakReference weakReference = (WeakReference) obj2;
            WeakReference weakReference2 = (WeakReference) obj3;
            if (weakReference != null && (bVar = (C101325b) weakReference.get()) != null && (bVar instanceof C22180d)) {
                Log.m105925i("MicroMsg.GIF.MMAnimateDrawableCacheMgr", "recycle bitmap:%s", bVar.toString());
                bVar.mo35280b();
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    public static synchronized qz1.C101326c m132949d() {
        /*
            java.lang.Class<qz1.c> r0 = qz1.C101326c.class
            monitor-enter(r0)
            qz1.c r1 = f296840c     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x0018
            monitor-enter(r0)     // Catch:{ all -> 0x001c }
            qz1.c r1 = f296840c     // Catch:{ all -> 0x0015 }
            if (r1 != 0) goto L_0x0013
            qz1.c r1 = new qz1.c     // Catch:{ all -> 0x0015 }
            r1.<init>()     // Catch:{ all -> 0x0015 }
            f296840c = r1     // Catch:{ all -> 0x0015 }
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            goto L_0x0018
        L_0x0015:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            throw r1     // Catch:{ all -> 0x001c }
        L_0x0018:
            qz1.c r1 = f296840c     // Catch:{ all -> 0x001c }
            monitor-exit(r0)
            return r1
        L_0x001c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qz1.C101326c.m132949d():qz1.c");
    }

    /* renamed from: a */
    public C101325b mo140813a(String str) {
        if (((C101062d) this.f296842b).get(str) != null) {
            return (C101325b) ((WeakReference) ((C101062d) this.f296842b).get(str)).get();
        }
        return null;
    }

    /* renamed from: b */
    public C101325b mo140814b(String str, String str2) {
        C101325b bVar = ((C101062d) this.f296842b).get(str) != null ? (C101325b) ((WeakReference) ((C101062d) this.f296842b).get(str)).get() : null;
        if (bVar != null) {
            return bVar;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C101325b hVar = ImgUtil.isWXGF(str2) ? new C22187h(C86013q1.m106433O(str2, 0, (int) C86013q1.m106451l(str2))) : new C22180d(str2);
        Log.m105919d("MicroMsg.GIF.MMAnimateDrawableCacheMgr", "new MMAnimateDrawable use time:%d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        ((C101062d) this.f296842b).put(str, new WeakReference(hVar));
        return hVar;
    }

    /* renamed from: c */
    public C101325b mo140815c(String str, byte[] bArr) {
        C101325b bVar;
        C101325b bVar2 = null;
        if (bArr == null) {
            return null;
        }
        if (((C101062d) this.f296842b).get(str) != null) {
            bVar2 = (C101325b) ((WeakReference) ((C101062d) this.f296842b).get(str)).get();
        }
        if (bVar == null) {
            if (ImgUtil.isWXGF(bArr)) {
                ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).getClass();
                if (C97496s.m125614b()) {
                    bVar = new C22187h(bArr);
                    ((C101062d) this.f296842b).put(str, new WeakReference(bVar));
                }
            }
            bVar = new C22180d(bArr, false);
            ((C101062d) this.f296842b).put(str, new WeakReference(bVar));
        }
        if (!bVar.isRunning()) {
            bVar.mo35281c();
        }
        return bVar;
    }
}
