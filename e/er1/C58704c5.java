package er1;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58713e5;
import gy3.C87412m;
import java.util.ArrayList;
import pe3.C89349b;
import te3.C64889zo2;
import te3.va4;

/* renamed from: er1.c5 */
public final class C58704c5 {

    /* renamed from: a */
    public static final C58704c5 f168044a = new C58704c5();

    /* renamed from: b */
    public static final ArrayList<va4> f168045b = new ArrayList<>();

    /* renamed from: c */
    public static String f168046c = "";

    /* renamed from: d */
    public static final long f168047d = 1552;

    /* renamed from: er1.c5$a */
    public static final class C58705a {

        /* renamed from: a */
        public static final C58705a f168048a = new C58705a();

        /* renamed from: b */
        public static int f168049b;

        /* renamed from: a */
        public final void mo83616a(va4 va4) {
            C87412m.m108594g(va4, "tag");
            String str = va4.f185867e;
            C58713e5.C58715b bVar = C58713e5.f168073a;
            if (C87412m.m108589b(str, C58713e5.f168091s.f168101b)) {
                C115669n.INSTANCE.mo175912v(1552, 10);
                C58704c5 c5Var = C58704c5.f168044a;
                Log.m105924i("Finder.LiveAnchorFlowStats", "reportPost");
            } else if (C87412m.m108589b(str, C58713e5.f168071C.f168101b)) {
                C115669n.INSTANCE.mo175912v(1552, 11);
                C58704c5 c5Var2 = C58704c5.f168044a;
                Log.m105924i("Finder.LiveAnchorFlowStats", "reportCancel");
            } else if (C87412m.m108589b(str, C58713e5.f168093u.f168101b)) {
                C115669n.INSTANCE.mo175912v(1552, 12);
                mo83617b(va4);
                C58704c5 c5Var3 = C58704c5.f168044a;
                Log.m105924i("Finder.LiveAnchorFlowStats", "reportFailedCreateLive");
            } else if (C87412m.m108589b(str, C58713e5.f168096x.f168101b)) {
                C115669n.INSTANCE.mo175912v(1552, 13);
                mo83617b(va4);
                C58704c5 c5Var4 = C58704c5.f168044a;
                Log.m105924i("Finder.LiveAnchorFlowStats", "reportFailedJoinLive");
            } else if (C87412m.m108589b(str, C58713e5.f168098z.f168101b)) {
                C115669n.INSTANCE.mo175912v(1552, 14);
                C58704c5 c5Var5 = C58704c5.f168044a;
                Log.m105924i("Finder.LiveAnchorFlowStats", "reportFailedEnterRoom");
            } else if (C87412m.m108589b(str, C58713e5.f168070B.f168101b)) {
                C115669n.INSTANCE.mo175912v(1552, 15);
                C58704c5 c5Var6 = C58704c5.f168044a;
                Log.m105924i("Finder.LiveAnchorFlowStats", "reportFailedShareFeed");
            } else if (C87412m.m108589b(str, C58713e5.f168094v.f168101b)) {
                C115669n.INSTANCE.mo175912v(1552, 16);
                C58704c5 c5Var7 = C58704c5.f168044a;
                Log.m105924i("Finder.LiveAnchorFlowStats", "reportRecheckRealName");
            } else if (C87412m.m108589b(str, C58713e5.f168072D.f168101b)) {
                f168049b = 1;
                C115669n.INSTANCE.mo175912v(1552, 17);
                C58704c5 c5Var8 = C58704c5.f168044a;
                Log.m105924i("Finder.LiveAnchorFlowStats", "reportSuccLive");
            }
        }

        /* renamed from: b */
        public final void mo83617b(va4 va4) {
            C89349b bVar = va4.f185870h;
            if (bVar != null) {
                C64889zo2 zo22 = new C64889zo2();
                try {
                    zo22.parseFrom(bVar.mo123703f());
                } catch (Exception e) {
                    Log.printDebugStack("safeParser", "", e);
                    zo22 = null;
                }
                if (zo22 != null) {
                    int i = zo22.f186779e;
                    if (i != -100038) {
                        switch (i) {
                            case -200018:
                            case -200017:
                                break;
                            default:
                                switch (i) {
                                    case MMLISTEN_ERR_INVALID_ALBUM_VALUE:
                                        break;
                                    case MMLISTEN_ERR_INVALID_BROADCAST_VALUE:
                                    case -200011:
                                        C115669n.INSTANCE.mo175912v(1552, 41);
                                        return;
                                    case MMLISTEN_ERR_INVALID_FEEDBUF_VALUE:
                                        C115669n.INSTANCE.mo175912v(1552, 44);
                                        return;
                                    case -200009:
                                        C115669n.INSTANCE.mo175912v(1552, 43);
                                        return;
                                    default:
                                        C115669n.INSTANCE.mo175912v(1552, 45);
                                        return;
                                }
                        }
                        C115669n.INSTANCE.mo175912v(1552, 42);
                        return;
                    }
                    C115669n.INSTANCE.mo175912v(1552, 40);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0051  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m68184a(er1.C58704c5 r4, java.lang.String r5, pe3.C89349b r6, boolean r7, boolean r8, int r9, java.lang.Object r10) {
        /*
            r10 = r9 & 2
            if (r10 == 0) goto L_0x0005
            r6 = 0
        L_0x0005:
            r10 = r9 & 4
            r0 = 0
            if (r10 == 0) goto L_0x000b
            r7 = 0
        L_0x000b:
            r9 = r9 & 8
            if (r9 == 0) goto L_0x0010
            r8 = 0
        L_0x0010:
            monitor-enter(r4)
            java.lang.String r9 = "stage"
            gy3.C87412m.m108594g(r5, r9)     // Catch:{ all -> 0x00b4 }
            r9 = 2
            r10 = 1
            if (r7 == 0) goto L_0x0023
            er1.C58704c5.C58705a.f168049b = r0     // Catch:{ all -> 0x00b4 }
            java.util.ArrayList<te3.va4> r1 = f168045b     // Catch:{ all -> 0x00b4 }
            r1.clear()     // Catch:{ all -> 0x00b4 }
            goto L_0x0052
        L_0x0023:
            java.util.ArrayList<te3.va4> r1 = f168045b     // Catch:{ all -> 0x00b4 }
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x00b4 }
            if (r2 != 0) goto L_0x00b2
            java.lang.Object r2 = sx3.C110818d0.m150916N(r1)     // Catch:{ all -> 0x00b4 }
            te3.va4 r2 = (te3.va4) r2     // Catch:{ all -> 0x00b4 }
            if (r2 == 0) goto L_0x003b
            int r2 = r2.f185869g     // Catch:{ all -> 0x00b4 }
            er1.e5$b r3 = er1.C58713e5.f168073a     // Catch:{ all -> 0x00b4 }
            if (r2 != r10) goto L_0x003b
            r2 = 1
            goto L_0x003c
        L_0x003b:
            r2 = 0
        L_0x003c:
            if (r2 == 0) goto L_0x00b2
            java.lang.Object r1 = sx3.C110818d0.m150925W(r1)     // Catch:{ all -> 0x00b4 }
            te3.va4 r1 = (te3.va4) r1     // Catch:{ all -> 0x00b4 }
            if (r1 == 0) goto L_0x004e
            int r1 = r1.f185869g     // Catch:{ all -> 0x00b4 }
            er1.e5$b r2 = er1.C58713e5.f168073a     // Catch:{ all -> 0x00b4 }
            if (r1 != r9) goto L_0x004e
            r1 = 1
            goto L_0x004f
        L_0x004e:
            r1 = 0
        L_0x004f:
            if (r1 == 0) goto L_0x0052
            goto L_0x00b2
        L_0x0052:
            te3.va4 r1 = new te3.va4     // Catch:{ all -> 0x00b4 }
            r1.<init>()     // Catch:{ all -> 0x00b4 }
            java.lang.String r2 = ""
            r1.f185866d = r2     // Catch:{ all -> 0x00b4 }
            r1.f185867e = r5     // Catch:{ all -> 0x00b4 }
            long r2 = eb0.C31543z5.m39451a()     // Catch:{ all -> 0x00b4 }
            r1.f185868f = r2     // Catch:{ all -> 0x00b4 }
            if (r7 == 0) goto L_0x0069
            er1.e5$b r9 = er1.C58713e5.f168073a     // Catch:{ all -> 0x00b4 }
            r9 = 1
            goto L_0x006f
        L_0x0069:
            if (r8 == 0) goto L_0x006e
            er1.e5$b r10 = er1.C58713e5.f168073a     // Catch:{ all -> 0x00b4 }
            goto L_0x006f
        L_0x006e:
            r9 = 0
        L_0x006f:
            r1.f185869g = r9     // Catch:{ all -> 0x00b4 }
            r1.f185870h = r6     // Catch:{ all -> 0x00b4 }
            er1.c5$a r6 = er1.C58704c5.C58705a.f168048a     // Catch:{ all -> 0x00b4 }
            r6.mo83616a(r1)     // Catch:{ all -> 0x00b4 }
            java.util.ArrayList<te3.va4> r6 = f168045b     // Catch:{ all -> 0x00b4 }
            r6.add(r1)     // Catch:{ all -> 0x00b4 }
            java.lang.String r6 = "Finder.LiveAnchorFlowStats"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b4 }
            r9.<init>()     // Catch:{ all -> 0x00b4 }
            java.lang.String r10 = "tag, stage:"
            r9.append(r10)     // Catch:{ all -> 0x00b4 }
            r9.append(r5)     // Catch:{ all -> 0x00b4 }
            java.lang.String r5 = ", isStart:"
            r9.append(r5)     // Catch:{ all -> 0x00b4 }
            r9.append(r7)     // Catch:{ all -> 0x00b4 }
            java.lang.String r5 = ", isEnd:"
            r9.append(r5)     // Catch:{ all -> 0x00b4 }
            r9.append(r8)     // Catch:{ all -> 0x00b4 }
            java.lang.String r5 = r9.toString()     // Catch:{ all -> 0x00b4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)     // Catch:{ all -> 0x00b4 }
            if (r8 == 0) goto L_0x00b0
            zt3.t r5 = zt3.C119157j.f356862d     // Catch:{ all -> 0x00b4 }
            er1.d5 r6 = er1.C58709d5.f168059d     // Catch:{ all -> 0x00b4 }
            long r7 = (long) r0     // Catch:{ all -> 0x00b4 }
            zt3.j r5 = (zt3.C119157j) r5     // Catch:{ all -> 0x00b4 }
            r5.mo183878i(r6, r7)     // Catch:{ all -> 0x00b4 }
        L_0x00b0:
            monitor-exit(r4)
            goto L_0x00b3
        L_0x00b2:
            monitor-exit(r4)
        L_0x00b3:
            return
        L_0x00b4:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58704c5.m68184a(er1.c5, java.lang.String, pe3.b, boolean, boolean, int, java.lang.Object):void");
    }
}
