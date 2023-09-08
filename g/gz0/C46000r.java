package gz0;

import android.os.Looper;
import cc0.C92411b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import f40.C86709a0;
import hz0.C46159v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import ob0.C11385n;
import ob0.C117747y;
import p702ts.C78085c;
import te3.C49029co;

/* renamed from: gz0.r */
public class C46000r implements C11385n, C92411b.C92412a {

    /* renamed from: d */
    public Map<String, Set<C46001a>> f124042d = new HashMap();

    /* renamed from: e */
    public HashMap<String, String> f124043e = new HashMap<>();

    /* renamed from: f */
    public String f124044f;

    /* renamed from: g */
    public MMHandler f124045g;

    /* renamed from: h */
    public C46159v f124046h;

    /* renamed from: gz0.r$a */
    public interface C46001a {
        /* renamed from: K5 */
        void mo63802K5(boolean z, ArrayList<C49029co> arrayList);
    }

    public C46000r() {
        C86709a0.m107529k().f251779b.mo123455a(1058, this);
        this.f124045g = new MMHandler(Looper.getMainLooper());
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* renamed from: a */
    public void mo71411a(java.lang.String r3, gz0.C46000r.C46001a r4) {
        /*
            r2 = this;
            java.util.Map<java.lang.String, java.util.Set<gz0.r$a>> r0 = r2.f124042d
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.util.Set<gz0.r$a>> r1 = r2.f124042d     // Catch:{ Exception -> 0x001d }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x001d }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001d
            java.util.Map<java.lang.String, java.util.Set<gz0.r$a>> r1 = r2.f124042d     // Catch:{ Exception -> 0x001d }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x001d }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ Exception -> 0x001d }
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ Exception -> 0x001d }
            r1.remove(r4)     // Catch:{ Exception -> 0x001d }
            goto L_0x001d
        L_0x001b:
            r3 = move-exception
            goto L_0x002b
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r2.f124043e
            monitor-enter(r4)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r2.f124043e     // Catch:{ all -> 0x0028 }
            r0.remove(r3)     // Catch:{ all -> 0x0028 }
            monitor-exit(r4)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r3 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0028 }
            throw r3
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: gz0.C46000r.mo71411a(java.lang.String, gz0.r$a):void");
    }

    public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
        Set set;
        String str;
        if (!z) {
            return true;
        }
        C92411b ms = ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms();
        if (ms != null) {
            ms.mo126408b(this);
        }
        Log.m105919d("MicroMsg.CardShopLBSManager", "onGetLocation, fLongitude = %f, fLatitude = %f, locType = %d, speed = %f, accuracy = %f", Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i), Double.valueOf(d), Double.valueOf(d2));
        synchronized (this.f124042d) {
            set = (Set) ((HashMap) this.f124042d).get(this.f124044f);
        }
        if (set == null || set.size() == 0) {
            Log.m105920e("MicroMsg.CardShopLBSManager", "onGetLocation, already cancelled, no need to doScene");
            return false;
        }
        synchronized (this.f124043e) {
            str = this.f124043e.get(this.f124044f);
        }
        C46159v vVar = new C46159v(this.f124044f, f, f2, str);
        if (C86709a0.m107529k().f251779b.mo123461g(vVar, 0)) {
            this.f124046h = vVar;
        } else {
            Log.m105920e("MicroMsg.CardShopLBSManager", "doScene fail, callback immediate");
            this.f124045g.post(new C45999q(this, this.f124044f, false, (ArrayList) null));
        }
        return true;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        this.f124046h = null;
        C46159v vVar = (C46159v) yVar;
        String str2 = vVar.f124435f;
        Log.m105925i("MicroMsg.CardShopLBSManager", "onSceneEnd, reqCardTpId = %s, errType = %d, errCode = %d", str2, Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 0 && i2 == 0) {
            ArrayList<C49029co> arrayList = vVar.f124436g;
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(arrayList == null ? 0 : arrayList.size());
            Log.m105919d("MicroMsg.CardShopLBSManager", "onSceneEnd, respShopList size = %d", objArr);
            this.f124045g.post(new C45999q(this, str2, true, arrayList));
            return;
        }
        Log.m105920e("MicroMsg.CardShopLBSManager", "onSceneEnd, cardshoplbs fail");
        this.f124045g.post(new C45999q(this, str2, false, (ArrayList) null));
    }
}
