package sb2;

import fy3.C32226l;
import gy3.C87413o;
import ib2.C60265a;
import java.util.List;
import rx3.C13598b0;
import te3.C50480n13;
import wb2.C65946a;

/* renamed from: sb2.e0 */
public final class C63757e0 extends C87413o implements C32226l<List<? extends C60265a>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C50480n13 f180759d;

    /* renamed from: e */
    public final /* synthetic */ C63759f0 f180760e;

    /* renamed from: f */
    public final /* synthetic */ C65946a f180761f;

    /* renamed from: g */
    public final /* synthetic */ C63844s f180762g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63757e0(C50480n13 n132, C63759f0 f0Var, C65946a aVar, C63844s sVar) {
        super(1);
        this.f180759d = n132;
        this.f180760e = f0Var;
        this.f180761f = aVar;
        this.f180762g = sVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        r1 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) sx3.C110818d0.m150916N((r1 = (r1 = (r1 = r1.f171827b).objectDesc).media));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r13) {
        /*
            r12 = this;
            java.util.List r13 = (java.util.List) r13
            java.lang.String r0 = "it"
            gy3.C87412m.m108594g(r13, r0)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            te3.n13 r0 = r12.f180759d
            java.util.Iterator r13 = r13.iterator()
        L_0x0012:
            boolean r1 = r13.hasNext()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0077
            java.lang.Object r1 = r13.next()
            ib2.a r1 = (ib2.C60265a) r1
            java.lang.String r4 = r1.f171812d
            r5.put(r4, r1)
            te3.be1 r4 = new te3.be1
            r4.<init>()
            java.lang.String r6 = r1.f171812d
            r4.f131067f = r6
            int r6 = r1.f171813e
            r7 = 2
            if (r6 == r3) goto L_0x005c
            if (r6 == r7) goto L_0x0039
            r8 = 3
            if (r6 == r8) goto L_0x005c
            goto L_0x0012
        L_0x0039:
            r4.f131065d = r7
            ib2.a$b r1 = r1.f171817i
            if (r1 == 0) goto L_0x0056
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.f171827b
            if (r1 == 0) goto L_0x0056
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
            if (r1 == 0) goto L_0x0056
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r1 = r1.media
            if (r1 == 0) goto L_0x0056
            java.lang.Object r1 = sx3.C110818d0.m150916N(r1)
            com.tencent.mm.protocal.protobuf.FinderMedia r1 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r1
            if (r1 == 0) goto L_0x0056
            int r1 = r1.videoDuration
            goto L_0x0057
        L_0x0056:
            r1 = 0
        L_0x0057:
            int r1 = r1 * 1000
            r4.f131066e = r1
            goto L_0x0071
        L_0x005c:
            ib2.a$a r1 = r1.f171816h
            if (r1 == 0) goto L_0x0062
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r2 = r1.f171823d
        L_0x0062:
            boolean r1 = r2 instanceof com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem
            if (r1 == 0) goto L_0x006f
            r4.f131065d = r7
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r2 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem) r2
            int r1 = r2.f162766w
            r4.f131066e = r1
            goto L_0x0071
        L_0x006f:
            r4.f131065d = r3
        L_0x0071:
            java.util.LinkedList<te3.be1> r1 = r0.f138330e
            r1.add(r4)
            goto L_0x0012
        L_0x0077:
            ob0.c$b r13 = new ob0.c$b
            r13.<init>()
            r0 = 4297(0x10c9, float:6.021E-42)
            r13.f127069d = r0
            java.lang.String r0 = "/cgi-bin/micromsg-bin/musiclivegetbeatarrangement"
            r13.f127068c = r0
            te3.n13 r0 = r12.f180759d
            r13.f127066a = r0
            te3.o13 r0 = new te3.o13
            r0.<init>()
            r13.f127067b = r0
            ob0.c r13 = r13.mo72403a()
            sb2.f0 r0 = r12.f180760e
            a14.z1 r0 = r0.f180779r
            if (r0 == 0) goto L_0x009c
            a14.C53973z1.C53974a.m60623a(r0, r2, r3, r2)
        L_0x009c:
            pb0.b$a r0 = pb0.C47446b.f127269a
            d14.f r2 = r0.mo72464a(r13)
            sb2.f0 r13 = r12.f180760e
            wb2.a r0 = r12.f180761f
            com.tencent.mm.sdk.coroutines.LifecycleScope r0 = r0.mo89983c3()
            a14.h0 r1 = a14.C53872d1.f151117a
            a14.k2 r7 = f14.C58901s.f168555a
            r8 = 0
            sb2.d0 r9 = new sb2.d0
            sb2.f0 r3 = r12.f180760e
            sb2.s r4 = r12.f180762g
            r6 = 0
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r10 = 2
            r11 = 0
            r6 = r0
            a14.z1 r0 = a14.C53895h.m60466d(r6, r7, r8, r9, r10, r11)
            r13.f180779r = r0
            rx3.b0 r13 = rx3.C13598b0.f38549a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: sb2.C63757e0.invoke(java.lang.Object):java.lang.Object");
    }
}
