package sw0;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import tw0.C37288f;
import tw0.C37289g;
import uw0.C37596a;
import vw0.C37851a;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_PATCH})
/* renamed from: sw0.h */
public class C36869h extends C86301e implements C37288f {

    /* renamed from: d */
    public C37596a f97856d;

    public C37289g Lo0() {
        requireAccountInitialized();
        return this.f97856d;
    }

    public void onAccountInitialized(Context context) {
        Log.m105918d("MicroMsg.Boots.PluginBoots", "[cpan] boots onDataBaseOpened");
        C37596a aVar = this.f97856d;
        if (aVar != null) {
            aVar.f99702a = new C37851a(C86709a0.m107535s().f251811i);
        }
    }

    public void onAccountReleased(Context context) {
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void onCreate(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r6 = "MicroMsg.Boots.PluginBoots"
            java.lang.String r0 = "[cpan] boots execute %s"
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()
            r4 = 0
            r2[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r0, r2)
            uw0.a r6 = uw0.C37596a.f99701b
            if (r6 != 0) goto L_0x001c
            uw0.a r6 = new uw0.a
            r6.<init>()
            uw0.C37596a.f99701b = r6
        L_0x001c:
            uw0.a r6 = uw0.C37596a.f99701b
            r5.f97856d = r6
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            com.tencent.mm.app.u0 r6 = com.tencent.p014mm.app.C80622u0.m98265a(r6)
            com.tencent.mm.app.u0 r0 = com.tencent.p014mm.app.C80622u0.f235870h
            if (r6 != r0) goto L_0x008d
            boolean[] r6 = z02.C91596b.f262440b
            monitor-enter(r6)
            monitor-enter(r6)     // Catch:{ all -> 0x008a }
            boolean r0 = r6[r4]     // Catch:{ all -> 0x0087 }
            monitor-exit(r6)     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = "MicroMsg.TinkerPatchStatusProbe"
            java.lang.String r1 = "[!] Already installed."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)     // Catch:{ all -> 0x008a }
            monitor-exit(r6)     // Catch:{ all -> 0x008a }
            goto L_0x004c
        L_0x003e:
            com.tencent.tinker.entry.ApplicationLike r0 = com.tencent.p014mm.app.C80589e.f235760a     // Catch:{ all -> 0x008a }
            z02.C91596b.f262441c = r0     // Catch:{ all -> 0x008a }
            r6[r4] = r1     // Catch:{ all -> 0x008a }
            java.lang.String r0 = "MicroMsg.TinkerPatchStatusProbe"
            java.lang.String r1 = "[+] install done."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x008a }
            monitor-exit(r6)     // Catch:{ all -> 0x008a }
        L_0x004c:
            java.lang.String r0 = "MicroMsg.Boots.PluginBoots"
            java.lang.String r1 = "[+] Trying to trigger tinker patch status report."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            monitor-enter(r6)
            monitor-enter(r6)     // Catch:{ all -> 0x0084 }
            boolean r0 = r6[r4]     // Catch:{ all -> 0x0081 }
            monitor-exit(r6)     // Catch:{ all -> 0x0081 }
            if (r0 != 0) goto L_0x0061
            java.lang.String r0 = "MicroMsg.TinkerPatchStatusProbe"
            java.lang.String r1 = "[-] Not installed, skip probe."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)     // Catch:{ all -> 0x0084 }
        L_0x0061:
            monitor-exit(r6)     // Catch:{ all -> 0x0084 }
            zt3.t r6 = zt3.C119157j.f356862d
            java.lang.String r0 = "tinker_patch_status_probe"
            zt3.j r6 = (zt3.C119157j) r6
            r6.mo183894y(r0)
            zt3.t r6 = zt3.C119157j.f356862d
            z02.a r0 = new z02.a
            r0.<init>()
            r1 = 5000(0x1388, double:2.4703E-320)
            java.lang.String r3 = "tinker_patch_status_probe"
            zt3.j r6 = (zt3.C119157j) r6
            r6.getClass()
            r6.mo183886q(r0, r1, r3)
            goto L_0x008d
        L_0x0081:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0081 }
            throw r0     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0084 }
            throw r0
        L_0x0087:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0087 }
            throw r0     // Catch:{ all -> 0x008a }
        L_0x008a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x008a }
            throw r0
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sw0.C36869h.onCreate(android.content.Context):void");
    }
}
