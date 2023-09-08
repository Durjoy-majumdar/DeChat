package gr1;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: gr1.t0 */
public final class C45951t0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C45951t0 f123959d = new C45951t0();

    public C45951t0() {
        super(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a A[Catch:{ Exception -> 0x00dd }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r9 = this;
            gr1.r0 r0 = gr1.C45946r0.f123945a
            java.lang.String r0 = "Finder.FinderNetworkStatusStatistic"
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00dd }
            r2.<init>()     // Catch:{ Exception -> 0x00dd }
            er1.w3 r3 = er1.C58784w3.f168295a     // Catch:{ Exception -> 0x00dd }
            r4 = 10
            java.lang.String r3 = r3.mo83907W(r4)     // Catch:{ Exception -> 0x00dd }
            r2.append(r3)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r3 = "/Finder.FinderNetworkStatusStatistic.ext"
            r2.append(r3)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00dd }
            nj.g$a r3 = new nj.g$a     // Catch:{ Exception -> 0x00dd }
            r3.<init>()     // Catch:{ Exception -> 0x00dd }
            r3.mo72289b()     // Catch:{ Exception -> 0x00dd }
            r3 = -1
            byte[] r3 = com.tencent.p014mm.vfs.C86013q1.m106433O(r2, r1, r3)     // Catch:{ Exception -> 0x00dd }
            te3.hh0 r4 = new te3.hh0     // Catch:{ Exception -> 0x00dd }
            r4.<init>()     // Catch:{ Exception -> 0x00dd }
            r5 = 0
            if (r3 != 0) goto L_0x0034
            goto L_0x0045
        L_0x0034:
            r4.parseFrom(r3)     // Catch:{ Exception -> 0x0038 }
            goto L_0x0046
        L_0x0038:
            r4 = move-exception
            java.lang.String r6 = "safeParser"
            java.lang.String r7 = ""
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x00dd }
            r8[r1] = r4     // Catch:{ Exception -> 0x00dd }
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r7, r8)     // Catch:{ Exception -> 0x00dd }
        L_0x0045:
            r4 = r5
        L_0x0046:
            gr1.C45946r0.f123952h = r4     // Catch:{ Exception -> 0x00dd }
            if (r4 == 0) goto L_0x00e5
            java.util.concurrent.CopyOnWriteArrayList<te3.tj0> r6 = gr1.C45946r0.f123946b     // Catch:{ Exception -> 0x00dd }
            java.util.LinkedList<te3.tj0> r7 = r4.f134637g     // Catch:{ Exception -> 0x00dd }
            r6.addAll(r7)     // Catch:{ Exception -> 0x00dd }
            java.util.concurrent.CopyOnWriteArrayList<te3.tj0> r6 = gr1.C45946r0.f123948d     // Catch:{ Exception -> 0x00dd }
            java.util.LinkedList<te3.tj0> r7 = r4.f134649v     // Catch:{ Exception -> 0x00dd }
            r6.addAll(r7)     // Catch:{ Exception -> 0x00dd }
            java.util.concurrent.CopyOnWriteArrayList<te3.tj0> r6 = gr1.C45946r0.f123949e     // Catch:{ Exception -> 0x00dd }
            java.util.LinkedList<te3.tj0> r7 = r4.f134652y     // Catch:{ Exception -> 0x00dd }
            r6.addAll(r7)     // Catch:{ Exception -> 0x00dd }
            java.util.concurrent.CopyOnWriteArrayList<te3.r50> r6 = gr1.C45946r0.f123950f     // Catch:{ Exception -> 0x00dd }
            java.util.LinkedList<te3.r50> r7 = r4.f134647t     // Catch:{ Exception -> 0x00dd }
            r6.addAll(r7)     // Catch:{ Exception -> 0x00dd }
            java.util.concurrent.CopyOnWriteArrayList<te3.r50> r6 = gr1.C45946r0.f123951g     // Catch:{ Exception -> 0x00dd }
            java.util.LinkedList<te3.r50> r7 = r4.f134648u     // Catch:{ Exception -> 0x00dd }
            r6.addAll(r7)     // Catch:{ Exception -> 0x00dd }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00dd }
            r6.<init>()     // Catch:{ Exception -> 0x00dd }
            java.lang.String r7 = "resumeStatusFromFile "
            r6.append(r7)     // Catch:{ Exception -> 0x00dd }
            if (r3 == 0) goto L_0x007e
            int r3 = r3.length     // Catch:{ Exception -> 0x00dd }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x00dd }
        L_0x007e:
            r6.append(r5)     // Catch:{ Exception -> 0x00dd }
            r3 = 32
            r6.append(r3)     // Catch:{ Exception -> 0x00dd }
            r6.append(r2)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r2 = "  netType:"
            r6.append(r2)     // Catch:{ Exception -> 0x00dd }
            int r2 = r4.f134634d     // Catch:{ Exception -> 0x00dd }
            r6.append(r2)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r2 = " bandwidthKbps:"
            r6.append(r2)     // Catch:{ Exception -> 0x00dd }
            int r2 = r4.f134636f     // Catch:{ Exception -> 0x00dd }
            r6.append(r2)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r2 = " lastVideosDownloadInfo:"
            r6.append(r2)     // Catch:{ Exception -> 0x00dd }
            java.util.LinkedList<te3.tj0> r2 = r4.f134637g     // Catch:{ Exception -> 0x00dd }
            int r2 = r2.size()     // Catch:{ Exception -> 0x00dd }
            r6.append(r2)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r2 = " last_preload_download_info:"
            r6.append(r2)     // Catch:{ Exception -> 0x00dd }
            java.util.LinkedList<te3.tj0> r2 = r4.f134649v     // Catch:{ Exception -> 0x00dd }
            int r2 = r2.size()     // Catch:{ Exception -> 0x00dd }
            r6.append(r2)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r2 = " recent_finder_download_speed:"
            r6.append(r2)     // Catch:{ Exception -> 0x00dd }
            java.util.LinkedList<te3.r50> r2 = r4.f134647t     // Catch:{ Exception -> 0x00dd }
            int r2 = r2.size()     // Catch:{ Exception -> 0x00dd }
            r6.append(r2)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r2 = " recent_wechat_download_speed:"
            r6.append(r2)     // Catch:{ Exception -> 0x00dd }
            java.util.LinkedList<te3.r50> r2 = r4.f134648u     // Catch:{ Exception -> 0x00dd }
            int r2 = r2.size()     // Catch:{ Exception -> 0x00dd }
            r6.append(r2)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r2 = r6.toString()     // Catch:{ Exception -> 0x00dd }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ Exception -> 0x00dd }
            goto L_0x00e5
        L_0x00dd:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "resumeStatusFromFile Exception "
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r2, r3, r1)
        L_0x00e5:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gr1.C45951t0.invoke():java.lang.Object");
    }
}
