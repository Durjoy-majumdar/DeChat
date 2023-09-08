package gk3;

import fy3.C32226l;
import gk3.C98154l;
import gy3.C8479f0;
import rx3.C13598b0;

/* renamed from: gk3.m */
public final class C98158m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f287775d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<C98154l.C98155a, C13598b0> f287776e;

    /* renamed from: gk3.m$a */
    public static final class C98159a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32226l<C98154l.C98155a, C13598b0> f287777d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<C98154l.C98155a> f287778e;

        public C98159a(C32226l<? super C98154l.C98155a, C13598b0> lVar, C8479f0<C98154l.C98155a> f0Var) {
            this.f287777d = lVar;
            this.f287778e = f0Var;
        }

        public final void run() {
            this.f287777d.invoke(this.f287778e.f27484d);
        }
    }

    public C98158m(long j, C32226l<? super C98154l.C98155a, C13598b0> lVar) {
        this.f287775d = j;
        this.f287776e = lVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005e, code lost:
        if (r5 != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0025, code lost:
        r3 = r3.f287771a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            gy3.f0 r0 = new gy3.f0
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, gk3.l$a> r1 = gk3.C98154l.f287766f
            long r2 = r7.f287775d
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r2 = r1.get(r2)
            r0.f27484d = r2
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            long r3 = r7.f287775d
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            T r3 = r0.f27484d
            gk3.l$a r3 = (gk3.C98154l.C98155a) r3
            if (r3 == 0) goto L_0x002c
            com.tencent.mm.plugin.scanner.api.ScanImagePHashInfo r3 = r3.f287771a
            if (r3 == 0) goto L_0x002c
            java.lang.String r3 = r3.pHash
            goto L_0x002d
        L_0x002c:
            r3 = 0
        L_0x002d:
            r5 = 1
            r2[r5] = r3
            java.lang.String r3 = "MicroMsg.ImageSearchPreviewManager"
            java.lang.String r6 = "alvinluo getImagePHashByMsgId msgId: %s, pHash: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r3, r6, r2)
            T r2 = r0.f27484d
            if (r2 != 0) goto L_0x0042
            gk3.l$a r2 = new gk3.l$a
            r2.<init>()
            r0.f27484d = r2
        L_0x0042:
            T r2 = r0.f27484d
            r3 = r2
            gk3.l$a r3 = (gk3.C98154l.C98155a) r3
            com.tencent.mm.plugin.scanner.api.ScanImagePHashInfo r3 = r3.f287771a
            if (r3 == 0) goto L_0x0060
            gk3.l$a r2 = (gk3.C98154l.C98155a) r2
            com.tencent.mm.plugin.scanner.api.ScanImagePHashInfo r2 = r2.f287771a
            gy3.C87412m.m108591d(r2)
            java.lang.String r2 = r2.pHash
            if (r2 == 0) goto L_0x005e
            int r2 = r2.length()
            if (r2 != 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r5 = 0
        L_0x005e:
            if (r5 == 0) goto L_0x00a5
        L_0x0060:
            T r2 = r0.f27484d
            gk3.l$a r2 = (gk3.C98154l.C98155a) r2
            java.lang.Class<sk2.c> r3 = sk2.C101643c.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            sk2.c r3 = (sk2.C101643c) r3
            long r5 = r7.f287775d
            java.lang.String r3 = r3.bh0(r5, r4)
            if (r3 != 0) goto L_0x0076
            java.lang.String r3 = ""
        L_0x0076:
            r2.f287772b = r3
            T r2 = r0.f27484d
            r3 = r2
            gk3.l$a r3 = (gk3.C98154l.C98155a) r3
            java.lang.String r3 = r3.f287772b
            if (r3 == 0) goto L_0x00a5
            gk3.l$a r2 = (gk3.C98154l.C98155a) r2
            java.lang.Class<lx.b0> r3 = p200lx.C99710b0.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            lx.b0 r3 = (p200lx.C99710b0) r3
            T r4 = r0.f27484d
            gk3.l$a r4 = (gk3.C98154l.C98155a) r4
            java.lang.String r4 = r4.f287772b
            gy3.C87412m.m108591d(r4)
            com.tencent.mm.plugin.scanner.api.ScanImagePHashInfo r3 = r3.mo138678Zh(r4)
            r2.f287771a = r3
            long r2 = r7.f287775d
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            T r3 = r0.f27484d
            r1.put(r2, r3)
        L_0x00a5:
            zt3.t r1 = zt3.C119157j.f356862d
            gk3.m$a r2 = new gk3.m$a
            fy3.l<gk3.l$a, rx3.b0> r3 = r7.f287776e
            r2.<init>(r3, r0)
            zt3.j r1 = (zt3.C119157j) r1
            r1.mo183895z(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gk3.C98158m.run():void");
    }
}
