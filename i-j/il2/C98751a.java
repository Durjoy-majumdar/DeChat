package il2;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hl2.C98489n;
import il2.C98760e;
import sk2.C101645e;
import sk2.C101647f;
import sk2.C101648g;
import zt3.C119157j;

/* renamed from: il2.a */
public final class C98751a implements C98489n.C98490a {

    /* renamed from: a */
    public final /* synthetic */ long f289543a;

    /* renamed from: b */
    public final /* synthetic */ C101645e f289544b;

    /* renamed from: c */
    public final /* synthetic */ C101648g f289545c;

    /* renamed from: d */
    public final /* synthetic */ C98760e.C98761a f289546d;

    /* renamed from: il2.a$a */
    public static final class C98752a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f289547d;

        /* renamed from: e */
        public final /* synthetic */ String f289548e;

        public C98752a(long j, String str) {
            this.f289547d = j;
            this.f289548e = str;
        }

        public final void run() {
            C98755b.f289552b.put(Long.valueOf(this.f289547d), this.f289548e);
        }
    }

    /* renamed from: il2.a$b */
    public static final class C98753b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f289549d;

        public C98753b(long j) {
            this.f289549d = j;
        }

        public final void run() {
            C98755b.f289552b.remove(Long.valueOf(this.f289549d));
        }
    }

    /* renamed from: il2.a$c */
    public static final class C98754c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f289550d;

        public C98754c(long j) {
            this.f289550d = j;
        }

        public final void run() {
            C98755b.f289552b.remove(Long.valueOf(this.f289550d));
        }
    }

    public C98751a(long j, C101645e eVar, C101648g gVar, C98760e.C98761a aVar) {
        this.f289543a = j;
        this.f289544b = eVar;
        this.f289545c = gVar;
        this.f289546d = aVar;
    }

    /* renamed from: e */
    public void mo137849e(int i, int i2, String str) {
        C87412m.m108594g(str, "errMsg");
        Log.m105921e("MicroMsg.AiImageCDNUploader", "alvinuo uploadImage-cdn onError %s %s, %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        C98755b bVar = C98755b.f289551a;
        long j = this.f289543a;
        int i3 = this.f289544b.f297533b;
        C101648g gVar = this.f289545c;
        Log.m105921e("MicroMsg.BaseAiImageUploader", "onScanFailed session: %d, errCode: %d, errMsg: %s", Long.valueOf(j), Integer.valueOf(i2), str);
        C101647f fVar = new C101647f();
        fVar.f297547a = i3;
        fVar.f297548b = j;
        fVar.f297549c = false;
        fVar.f297550d = i;
        fVar.f297551e = i2;
        fVar.f297552f = str;
        ((C119157j) C119157j.f356862d).mo183895z(new C98767j(gVar, j, fVar));
        ((C119157j) C119157j.f356862d).mo183895z(new C98753b(this.f289543a));
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [ob0.y, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r2v8, types: [com.tencent.mm.plugin.scanner.model.k] */
    /* JADX WARNING: type inference failed for: r2v9, types: [kl2.k] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo137850f(java.util.ArrayList<te3.C101856vd> r16) {
        /*
            r15 = this;
            r0 = r15
            java.lang.String r1 = "cdnList"
            r14 = r16
            gy3.C87412m.m108594g(r14, r1)
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r3 = r16.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "MicroMsg.AiImageCDNUploader"
            java.lang.String r5 = "alvinuo uploadImage-cdn onGetCDNInfoResult list size: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r2)
            java.util.Iterator r2 = r16.iterator()
        L_0x0021:
            boolean r5 = r2.hasNext()
            r6 = 3
            if (r5 == 0) goto L_0x0075
            java.lang.Object r5 = r2.next()
            te3.vd r5 = (te3.C101856vd) r5
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r8 = "<this>"
            gy3.C87412m.m108594g(r5, r8)
            r8 = 5
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.String r10 = r5.f299668g
            r9[r4] = r10
            int r10 = r5.f299666e
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9[r1] = r10
            int r10 = r5.f299667f
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11 = 2
            r9[r11] = r10
            int r10 = r5.f299665d
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9[r6] = r10
            int r5 = r5.f299670i
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 4
            r9[r6] = r5
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r9, r8)
            java.lang.String r6 = "BizAiScanCdnImg fileId: %s, size: [%s, %s], cdn_src: %s, cdn_status: %s"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            java.lang.String r6 = "format(format, *args)"
            gy3.C87412m.m108593f(r5, r6)
            r7[r4] = r5
            java.lang.String r5 = "alvinluo uploadImage-cdn upload cdn info: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r3, r5, r7)
            goto L_0x0021
        L_0x0075:
            sk2.e r2 = r0.f289544b
            int r3 = r2.f297533b
            if (r3 == r1) goto L_0x0093
            if (r3 == r6) goto L_0x007f
            r1 = 0
            goto L_0x00ab
        L_0x007f:
            kl2.k r1 = new kl2.k
            r3 = 0
            long r4 = r2.f297532a
            int r6 = r2.f297543l
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 48
            r12 = 0
            r2 = r1
            r10 = r16
            r2.<init>(r3, r4, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x00ab
        L_0x0093:
            com.tencent.mm.plugin.scanner.model.k r1 = new com.tencent.mm.plugin.scanner.model.k
            r3 = 0
            long r4 = r0.f289543a
            int r6 = r2.f297536e
            int r7 = r2.f297537f
            r8 = 0
            te3.he r9 = r2.f297538g
            te3.yd r10 = r2.f297539h
            com.tencent.mm.plugin.scanner.api.ScanImagePHashInfo r11 = r2.f297540i
            r12 = 0
            r13 = 0
            r2 = r1
            r14 = r16
            r2.<init>(r3, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x00ab:
            if (r1 == 0) goto L_0x00bc
            il2.e$a r2 = r0.f289546d
            int r3 = r1.hashCode()
            r2.f289563b = r3
            ob0.b0 r2 = f40.C86709a0.m107524d()
            r2.mo123460f(r1)
        L_0x00bc:
            zt3.t r1 = zt3.C119157j.f356862d
            il2.a$c r2 = new il2.a$c
            long r3 = r0.f289543a
            r2.<init>(r3)
            zt3.j r1 = (zt3.C119157j) r1
            r1.mo183895z(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: il2.C98751a.mo137850f(java.util.ArrayList):void");
    }

    /* renamed from: g */
    public void mo137851g(String str) {
        C87412m.m108594g(str, "mediaId");
        ((C119157j) C119157j.f356862d).mo183895z(new C98752a(this.f289543a, str));
    }
}
