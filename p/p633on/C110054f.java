package p633on;

import android.content.Context;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.p1099ui.C105068d0;
import com.tencent.p014mm.plugin.ball.p1099ui.FloatBallProxyUI;
import com.tencent.p014mm.plugin.ball.service.C105035c;
import com.tencent.p014mm.plugin.ball.service.C18155b;
import com.tencent.p014mm.plugin.ball.service.FloatBallHelper;
import com.tencent.p014mm.plugin.ball.service.FloatBallReportServiceProxy;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import f40.C86718e;
import p646pn.C110234e;
import p646pn.C110235f;
import p646pn.C62408g;
import rx3.C13601g;
import vv0.C78477a;
import xv0.C112181e;
import xv0.C38856d;
import xv0.C66445c;

@C86522b
/* renamed from: on.f */
public class C110054f extends C86301e implements C110235f, C110234e {
    /* renamed from: AY */
    public void mo161393AY(Context context, int i, BallInfo ballInfo, boolean z, C105068d0 d0Var) {
        FloatBallProxyUI.m140993I7(context, i, ballInfo, z, d0Var);
    }

    /* renamed from: CM */
    public String mo161394CM(String str) {
        int h = C86718e.m107549h();
        if (h != 0) {
            String str2 = (((long) h) & Util.MAX_32BIT_VALUE) + "#" + str;
            Log.m105925i("MicroMsg.FloatBallFeatureService", "accountDataKey:%s", str2);
            return str2;
        }
        Log.m105925i("MicroMsg.FloatBallFeatureService", "accountDataKey:%s", str);
        return str;
    }

    public C112181e Ic0() {
        return C105035c.m140879r0();
    }

    public C66445c Kd0() {
        return new FloatBallHelper();
    }

    /* renamed from: YJ */
    public C62408g mo161397YJ() {
        return new C78477a();
    }

    /* renamed from: Zc */
    public C38856d mo161398Zc() {
        if (!C86709a0.m107531m().mo58407a().mo71804b()) {
            return FloatBallReportServiceProxy.f50146a.getValue();
        }
        C13601g<C18155b> gVar = C18155b.f50152c;
        return C18155b.f50152c.getValue();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: pY */
    public xv0.C112181e mo161399pY() {
        /*
            r2 = this;
            f40.j r0 = f40.C86709a0.m107531m()
            j40.a r0 = r0.mo58407a()
            j40.b r0 = (j40.C87829b) r0
            boolean r0 = r0.mo71804b()
            if (r0 == 0) goto L_0x0015
            com.tencent.mm.plugin.ball.service.c r0 = com.tencent.p014mm.plugin.ball.service.C105035c.m140879r0()
            return r0
        L_0x0015:
            java.lang.Class<com.tencent.mm.plugin.ball.service.FloatBallServiceProxy> r0 = com.tencent.p014mm.plugin.ball.service.FloatBallServiceProxy.class
            monitor-enter(r0)
            com.tencent.mm.plugin.ball.service.FloatBallServiceProxy r1 = com.tencent.p014mm.plugin.ball.service.FloatBallServiceProxy.f311736a     // Catch:{ all -> 0x002d }
            if (r1 != 0) goto L_0x0029
            monitor-enter(r0)     // Catch:{ all -> 0x002d }
            com.tencent.mm.plugin.ball.service.FloatBallServiceProxy r1 = new com.tencent.mm.plugin.ball.service.FloatBallServiceProxy     // Catch:{ all -> 0x0026 }
            r1.<init>()     // Catch:{ all -> 0x0026 }
            com.tencent.p014mm.plugin.ball.service.FloatBallServiceProxy.f311736a = r1     // Catch:{ all -> 0x0026 }
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            goto L_0x0029
        L_0x0026:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r1     // Catch:{ all -> 0x002d }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            com.tencent.mm.plugin.ball.service.FloatBallServiceProxy r0 = com.tencent.p014mm.plugin.ball.service.FloatBallServiceProxy.f311736a
            return r0
        L_0x002d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p633on.C110054f.mo161399pY():xv0.e");
    }
}
