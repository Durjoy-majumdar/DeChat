package p534gl;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: gl.c */
public final class C32470c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32471d f86271d;

    /* renamed from: e */
    public final /* synthetic */ String f86272e;

    /* renamed from: f */
    public final /* synthetic */ C32481n f86273f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32470c(C32471d dVar, String str, C32481n nVar) {
        super(0);
        this.f86271d = dVar;
        this.f86272e = str;
        this.f86273f = nVar;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public java.lang.Object invoke() {
        /*
            r21 = this;
            r1 = r21
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_emoji_suggest_remote_shuffle
            r3 = 0
            boolean r0 = r0.mo58784wf(r2, r3)
            gl.d r2 = r1.f86271d
            gl.g r2 = r2.f86274f
            java.lang.String r4 = r1.f86272e
            r2.getClass()
            java.lang.String r2 = "desc"
            gy3.C87412m.m108594g(r4, r2)
            com.tencent.mm.storage.p2 r2 = com.tencent.p014mm.storage.C30764p2.f82718j
            boolean r5 = r2.f82719a
            if (r5 != 0) goto L_0x0028
            r2.mo57680g()
        L_0x0028:
            int r5 = com.tencent.p014mm.p136ui.tools.C45078p0.m49927f(r4)
            r6 = 32
            r7 = 1
            if (r5 <= r6) goto L_0x0039
            java.lang.String r2 = "MicroMsg.emoji.EmojiDescNewMgr"
            java.lang.String r4 = "input text over checkout limit."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            goto L_0x0078
        L_0x0039:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 != 0) goto L_0x0078
            java.lang.String r4 = r2.mo57682i(r4)
            boolean r5 = r2.mo57679f(r4)
            if (r5 == 0) goto L_0x0066
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.tencent.mm.storage.p2$$e>> r5 = r2.f82725g
            java.util.Set r5 = r5.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0053:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0066
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = r6.contains(r4)
            if (r6 == 0) goto L_0x0053
            goto L_0x0076
        L_0x0066:
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.tencent.mm.storage.p2$$e>> r2 = r2.f82724f
            java.lang.Object r2 = r2.get(r4)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 == 0) goto L_0x0078
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0078
        L_0x0076:
            r2 = 1
            goto L_0x0079
        L_0x0078:
            r2 = 0
        L_0x0079:
            gl.d r4 = r1.f86271d
            gl.i r4 = r4.f86275g
            java.lang.String r5 = r1.f86272e
            r4.getClass()
            java.lang.String r4 = "desc"
            gy3.C87412m.m108594g(r5, r4)
            java.util.LinkedList<java.lang.String> r4 = p534gl.C32477j.f86289d
            monitor-enter(r4)
            java.util.Iterator r6 = r4.iterator()     // Catch:{ all -> 0x022e }
        L_0x008e:
            boolean r8 = r6.hasNext()     // Catch:{ all -> 0x022e }
            r9 = 0
            if (r8 == 0) goto L_0x00a3
            java.lang.Object r8 = r6.next()     // Catch:{ all -> 0x022e }
            r10 = r8
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x022e }
            boolean r10 = z04.C112551y.m153809i(r10, r5, r7)     // Catch:{ all -> 0x022e }
            if (r10 == 0) goto L_0x008e
            goto L_0x00a4
        L_0x00a3:
            r8 = r9
        L_0x00a4:
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x022e }
            if (r8 == 0) goto L_0x00c0
            java.lang.String r5 = "MicroMsg.EmojiSuggestCache"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x022e }
            r6.<init>()     // Catch:{ all -> 0x022e }
            java.lang.String r10 = "matchWord: "
            r6.append(r10)     // Catch:{ all -> 0x022e }
            r6.append(r8)     // Catch:{ all -> 0x022e }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x022e }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)     // Catch:{ all -> 0x022e }
            monitor-exit(r4)
            goto L_0x00c2
        L_0x00c0:
            monitor-exit(r4)
            r7 = 0
        L_0x00c2:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.lang.String r5 = "MicroMsg.IEmojiSuggest"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "searchSuggest: localMatch "
            r6.append(r8)
            r6.append(r2)
            java.lang.String r8 = ", remoteMatch "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r8 = ", remoteShuffle "
            r6.append(r8)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            gl.d r5 = r1.f86271d
            gl.i r5 = r5.f86275g
            r5.f86285d = r0
            if (r2 == 0) goto L_0x0101
            r5 = 21
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            long r13 = (long) r5
            r11 = 1418(0x58a, double:7.006E-321)
            r15 = 1
            r10.mo175913w(r11, r13, r15)
        L_0x0101:
            if (r7 == 0) goto L_0x010f
            r5 = 22
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            long r13 = (long) r5
            r11 = 1418(0x58a, double:7.006E-321)
            r15 = 1
            r10.mo175913w(r11, r13, r15)
        L_0x010f:
            if (r0 == 0) goto L_0x011d
            r5 = 30
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            long r13 = (long) r5
            r11 = 1418(0x58a, double:7.006E-321)
            r15 = 1
            r10.mo175913w(r11, r13, r15)
        L_0x011d:
            gl.b r5 = new gl.b
            gl.d r6 = r1.f86271d
            gl.n r8 = r1.f86273f
            r5.<init>(r6, r0, r4, r8)
            java.lang.String r0 = r1.f86272e
            if (r2 == 0) goto L_0x0224
            gl.g r2 = r6.f86274f
            r2.getClass()
            java.lang.Class<z51.g> r2 = z51.C39315g.class
            java.lang.String r7 = "desc"
            gy3.C87412m.m108594g(r0, r7)
            di3.d r7 = di3.C86312j.m106911c(r2)
            z51.g r7 = (z51.C39315g) r7
            zc3.a r7 = r7.mo58035cm()
            i61.h r7 = (i61.C98602h) r7
            java.util.ArrayList r7 = r7.mo138038w(r0)
            java.util.List r7 = sx3.C110818d0.m150905E(r7)
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            boolean r10 = r7.isEmpty()
            if (r10 == 0) goto L_0x0157
            goto L_0x01ce
        L_0x0157:
            int r10 = r7.size()
            r11 = 100
            if (r10 <= r11) goto L_0x0170
            r10 = 24
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            long r13 = (long) r10
            r15 = 1418(0x58a, double:7.006E-321)
            r17 = 1
            r19 = r13
            r13 = r15
            r15 = r19
            r12.mo175913w(r13, r15, r17)
        L_0x0170:
            int r10 = r7.size()
            r12 = 0
        L_0x0175:
            if (r12 >= r10) goto L_0x0197
            if (r12 >= r11) goto L_0x0197
            di3.d r13 = di3.C86312j.m106911c(r2)
            z51.g r13 = (z51.C39315g) r13
            zc3.a r13 = r13.mo58035cm()
            java.lang.Object r14 = r7.get(r12)
            java.lang.String r14 = (java.lang.String) r14
            i61.h r13 = (i61.C98602h) r13
            com.tencent.mm.storage.emotion.EmojiInfo r13 = r13.mo137999G(r14)
            if (r13 == 0) goto L_0x0194
            r8.add(r13)
        L_0x0194:
            int r12 = r12 + 1
            goto L_0x0175
        L_0x0197:
            boolean r2 = r8.isEmpty()
            java.lang.String r7 = "MicroMsg.EmojiSuggestLocal"
            if (r2 == 0) goto L_0x01a5
            java.lang.String r2 = "sorEmojiList return. empty list."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            goto L_0x01ce
        L_0x01a5:
            java.util.Iterator r2 = r8.iterator()
        L_0x01a9:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x01ce
            java.lang.Object r10 = r2.next()
            com.tencent.mm.storage.emotion.EmojiInfo r10 = (com.tencent.p014mm.storage.emotion.EmojiInfo) r10
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "getEmojiList: match "
            r11.append(r12)
            java.lang.String r10 = r10.getMd5()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r10)
            goto L_0x01a9
        L_0x01ce:
            java.util.ArrayList r2 = new java.util.ArrayList
            r7 = 10
            int r7 = sx3.C36907w.m41090l(r8, r7)
            r2.<init>(r7)
            java.util.Iterator r7 = r8.iterator()
            r8 = 0
        L_0x01de:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x01fc
            java.lang.Object r10 = r7.next()
            int r11 = r8 + 1
            if (r8 < 0) goto L_0x01f8
            com.tencent.mm.storage.emotion.EmojiInfo r10 = (com.tencent.p014mm.storage.emotion.EmojiInfo) r10
            gl.o r8 = new gl.o
            r8.<init>(r10, r3, r11)
            r2.add(r8)
            r8 = r11
            goto L_0x01de
        L_0x01f8:
            sx3.C64197v.m75542k()
            throw r9
        L_0x01fc:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "onResult: local "
            r3.append(r7)
            int r7 = r2.size()
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            java.lang.String r7 = "MicroMsg.IEmojiSuggest"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)
            boolean r3 = r6.f86266e
            if (r3 != 0) goto L_0x021b
            goto L_0x022b
        L_0x021b:
            r4.addAll(r2)
            gl.i r2 = r6.f86275g
            r2.mo58651a(r0, r5)
            goto L_0x022b
        L_0x0224:
            if (r7 == 0) goto L_0x022b
            gl.i r2 = r6.f86275g
            r2.mo58651a(r0, r5)
        L_0x022b:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x022e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p534gl.C32470c.invoke():java.lang.Object");
    }
}
