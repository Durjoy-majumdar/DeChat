package ny0;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C51444tt1;

/* renamed from: ny0.e */
public final class C47311e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C51444tt1 f126982d;

    /* renamed from: e */
    public final /* synthetic */ C47306a f126983e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47311e(C51444tt1 tt12, C47306a aVar) {
        super(0);
        this.f126982d = tt12;
        this.f126983e = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0099 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r13 = this;
            te3.tt1 r0 = r13.f126982d
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r0.f142404o = r1
            te3.tt1 r0 = r13.f126982d
            java.util.LinkedList<te3.st1> r0 = r0.f142403n
            java.lang.String r1 = "req.ReqInfo"
            gy3.C87412m.m108593f(r0, r1)
            te3.tt1 r1 = r13.f126982d
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x00de
            java.lang.Object r2 = r0.next()
            te3.st1 r2 = (te3.C51296st1) r2
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest r4 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.f109312a
            java.lang.String r2 = r2.f141739e
            java.lang.String r4 = "it.ReqUrl"
            gy3.C87412m.m108593f(r2, r4)
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r4 = 0
            if (r2 == 0) goto L_0x003b
            java.lang.String r5 = r2.getHost()
            goto L_0x003c
        L_0x003b:
            r5 = r4
        L_0x003c:
            if (r2 == 0) goto L_0x00cc
            if (r5 != 0) goto L_0x0042
            goto L_0x00cc
        L_0x0042:
            java.lang.String r5 = t73.C48572p.m53970a(r5)
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0 r6 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.f109363a
            r6.getClass()
            com.tencent.mm.sdk.platformtools.MMKVSlotManager r6 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.f109364b
            java.lang.Object r6 = r6.findSlot(r5)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r6 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r6
            r7 = 1
            if (r6 == 0) goto L_0x0084
            boolean r8 = r6.containsKey(r5)
            if (r8 == 0) goto L_0x0084
            byte[] r5 = r6.decodeBytes(r5)
            if (r5 == 0) goto L_0x0084
            int r6 = r5.length
            if (r6 != 0) goto L_0x0067
            r6 = 1
            goto L_0x0068
        L_0x0067:
            r6 = 0
        L_0x0068:
            r6 = r6 ^ r7
            if (r6 == 0) goto L_0x0084
            java.lang.Class<te3.qt1> r6 = te3.C51011qt1.class
            java.lang.Object r6 = r6.newInstance()     // Catch:{ Exception -> 0x007a }
            r8 = r6
            pe3.a r8 = (pe3.C47465a) r8     // Catch:{ Exception -> 0x007a }
            r8.parseFrom(r5)     // Catch:{ Exception -> 0x007a }
            pe3.a r6 = (pe3.C47465a) r6     // Catch:{ Exception -> 0x007a }
            goto L_0x0085
        L_0x007a:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r8 = "MultiProcessMMKV.decodeProtoBuffer"
            java.lang.String r9 = "decode ProtoBuffer"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r5, r9, r6)
        L_0x0084:
            r6 = r4
        L_0x0085:
            te3.qt1 r6 = (te3.C51011qt1) r6
            if (r6 == 0) goto L_0x00cc
            java.util.LinkedList<te3.rt1> r5 = r6.f140539f
            java.lang.String r8 = "ResInfos"
            gy3.C87412m.m108593f(r5, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0099:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x00c4
            java.lang.Object r9 = r5.next()
            r10 = r9
            te3.rt1 r10 = (te3.C51154rt1) r10
            java.lang.String r11 = r2.getPath()
            if (r11 == 0) goto L_0x00bd
            java.lang.String r10 = r10.f141126d
            java.lang.String r12 = "res.Path"
            gy3.C87412m.m108593f(r10, r12)
            r12 = 2
            boolean r10 = p225rc.C12969d.m12409c(r11, r10, r3, r12, r4)
            if (r10 != r7) goto L_0x00bd
            r10 = 1
            goto L_0x00be
        L_0x00bd:
            r10 = 0
        L_0x00be:
            if (r10 == 0) goto L_0x0099
            r8.add(r9)
            goto L_0x0099
        L_0x00c4:
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>(r8)
            r6.f140539f = r2
            r4 = r6
        L_0x00cc:
            if (r4 == 0) goto L_0x0019
            java.util.LinkedList<pe3.b> r2 = r1.f142404o
            pe3.b r3 = new pe3.b
            byte[] r4 = r4.toByteArray()
            r3.<init>(r4)
            r2.add(r3)
            goto L_0x0019
        L_0x00de:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[TRACE_PREFETCH-preAuth] sendGetA8KeyLiteRequest:"
            r0.append(r1)
            te3.tt1 r1 = r13.f126982d
            java.util.LinkedList<te3.st1> r1 = r1.f142403n
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = ", prefetchDomainInfos: "
            r0.append(r1)
            te3.tt1 r1 = r13.f126982d
            java.util.LinkedList<pe3.b> r1 = r1.f142404o
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.WebPrefetcherPreAuther"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            java.lang.Class<com.tencent.mm.ipcinvoker.wx_extension.j> r0 = com.tencent.p014mm.ipcinvoker.wx_extension.C40324j.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.ipcinvoker.wx_extension.j r0 = (com.tencent.p014mm.ipcinvoker.wx_extension.C40324j) r0
            ob0.c$b r1 = new ob0.c$b
            r1.<init>()
            te3.tt1 r2 = r13.f126982d
            r1.f127066a = r2
            te3.vt1 r2 = new te3.vt1
            r2.<init>()
            r1.f127067b = r2
            java.lang.String r2 = "/cgi-bin/micromsg-bin/geta8keylite"
            r1.f127068c = r2
            r2 = 3564(0xdec, float:4.994E-42)
            r1.f127069d = r2
            r1.f127070e = r3
            r1.f127071f = r3
            ob0.c r1 = r1.mo72403a()
            ny0.d r2 = new ny0.d
            ny0.a r3 = r13.f126983e
            te3.tt1 r4 = r13.f126982d
            r2.<init>(r3, r4)
            r0.mo63014eH(r1, r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ny0.C47311e.invoke():java.lang.Object");
    }
}
