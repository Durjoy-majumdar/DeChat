package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import it1.C60628i;
import ob0.C11385n;
import ob0.C47350c;
import te3.C64550mb1;

/* renamed from: je1.z2 */
public final class C60817z2 extends C60628i {

    /* renamed from: g */
    public final FinderItem f173216g;

    /* renamed from: h */
    public final C64550mb1 f173217h;

    /* renamed from: i */
    public C47350c f173218i;

    /* renamed from: j */
    public C11385n f173219j;

    /* renamed from: n */
    public FinderObject f173220n;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C60817z2(com.tencent.p014mm.plugin.finder.storage.FinderItem r17, te3.C64550mb1 r18, te3.C49712hj1 r19, int r20, gy3.C8480h r21) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = 4
            r4 = r20 & 4
            r5 = 0
            if (r4 == 0) goto L_0x000e
            r4 = r5
            goto L_0x0010
        L_0x000e:
            r4 = r19
        L_0x0010:
            java.lang.String r6 = "finderItem"
            gy3.C87412m.m108594g(r0, r6)
            java.lang.String r6 = "track"
            gy3.C87412m.m108594g(r2, r6)
            r1.<init>(r4)
            r1.f173216g = r0
            r1.f173217h = r2
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r17.getFeedObject()
            r1.f173220n = r2
            ob0.c$b r2 = new ob0.c$b
            r2.<init>()
            r4 = 6649(0x19f9, float:9.317E-42)
            r2.f127069d = r4
            java.lang.String r6 = "/cgi-bin/micromsg-bin/finderpostdraft"
            r2.f127068c = r6
            te3.gh1 r6 = new te3.gh1
            r6.<init>()
            te3.tq2 r0 = r17.getPostInfo()
            java.lang.String r0 = r0.f185645d
            r7 = 1
            r8 = 0
            if (r0 == 0) goto L_0x004d
            int r9 = r0.length()
            if (r9 != 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r9 = 0
            goto L_0x004e
        L_0x004d:
            r9 = 1
        L_0x004e:
            if (r9 == 0) goto L_0x0065
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = "FinderLocal_clip_"
            r0.append(r9)
            long r9 = java.lang.System.nanoTime()
            r0.append(r9)
            java.lang.String r0 = r0.toString()
        L_0x0065:
            zc1.b r9 = zc1.C66785b.f191882e
            java.lang.String r9 = r9.mo90662O5()
            r6.f183322e = r9
            r6.f183325h = r0
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = new com.tencent.mm.protocal.protobuf.FinderObjectDesc
            r0.<init>()
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r1.f173220n
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r9 = r9.objectDesc
            if (r9 == 0) goto L_0x007f
            byte[] r9 = r9.toByteArray()
            goto L_0x0080
        L_0x007f:
            r9 = r5
        L_0x0080:
            java.lang.String r10 = ""
            if (r9 != 0) goto L_0x0085
            goto L_0x0095
        L_0x0085:
            r0.parseFrom(r9)     // Catch:{ Exception -> 0x008a }
            r5 = r0
            goto L_0x0095
        L_0x008a:
            r0 = move-exception
            r9 = r0
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r9
            java.lang.String r9 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r9, r10, r0)
        L_0x0095:
            gy3.C87412m.m108591d(r5)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r0 = r5.media
            java.lang.String r9 = "objectDesc.media"
            gy3.C87412m.m108593f(r0, r9)
            java.util.Iterator r0 = r0.iterator()
        L_0x00a3:
            boolean r9 = r0.hasNext()
            java.lang.String r11 = "Finder.NetSceneFinderDraftPost"
            if (r9 == 0) goto L_0x0132
            java.lang.Object r9 = r0.next()
            com.tencent.mm.protocal.protobuf.FinderMedia r9 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r9
            com.tencent.mm.plugin.finder.storage.FinderItem r12 = r1.f173216g
            java.lang.String r13 = r9.url
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r13)
            java.lang.String r14 = "getMD5String(media.url)"
            gy3.C87412m.m108593f(r13, r14)
            te3.rq2 r12 = r12.mediaExt(r13)
            if (r12 == 0) goto L_0x00a3
            uq1.t r13 = uq1.C65460t.f188357a
            com.tencent.mm.plugin.finder.storage.FinderItem r14 = r1.f173216g
            java.util.LinkedList r14 = r14.getHalfVideoMediaExtList()
            r13.mo89573a(r9, r12, r14)
            int r13 = r9.mediaType
            if (r13 != r3) goto L_0x00a3
            int r13 = r9.videoDuration
            r14 = 2000(0x7d0, float:2.803E-42)
            if (r13 <= 0) goto L_0x00db
            if (r13 <= r14) goto L_0x00a3
        L_0x00db:
            java.lang.Class<rw.m> r13 = p232rw.C63679m.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            rw.m r13 = (p232rw.C63679m) r13
            java.lang.String r15 = r12.f185266d
            if (r15 != 0) goto L_0x00e8
            r15 = r10
        L_0x00e8:
            rw.m$a r13 = r13.mo88483M1(r15)
            if (r13 == 0) goto L_0x00f2
            long r3 = r13.f180528d
            int r4 = (int) r3
            goto L_0x00f3
        L_0x00f2:
            r4 = 0
        L_0x00f3:
            int r4 = r4 / 1000
            r9.videoDuration = r4
            if (r4 <= 0) goto L_0x0100
            if (r4 <= r14) goto L_0x00fc
            goto L_0x0100
        L_0x00fc:
            r3 = 4
            r4 = 6649(0x19f9, float:9.317E-42)
            goto L_0x00a3
        L_0x0100:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "NetSceneFinderPost videoDuration invalid:"
            r3.append(r4)
            int r9 = r12.f185269g
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r3)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r3 != 0) goto L_0x011b
            goto L_0x00fc
        L_0x011b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            int r3 = r12.f185269g
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0132:
            int r0 = r5.mediaType
            r3 = 8
            if (r0 != r3) goto L_0x013a
            r5.mediaType = r8
        L_0x013a:
            r6.f183323f = r5
            r0 = 3
            r6.f183324g = r0
            je1.h2 r0 = je1.C46523h2.f125330a
            r3 = 6649(0x19f9, float:9.317E-42)
            te3.ig0 r0 = r0.mo71859a(r3)
            r6.f183321d = r0
            r6.f183326i = r7
            r2.f127066a = r6
            te3.hh1 r0 = new te3.hh1
            r0.<init>()
            r2.f127067b = r0
            ob0.c r0 = r2.mo72403a()
            r1.f173218i = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "NetSceneFinderDraftPost init  localClipNonceId:"
            r0.append(r2)
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r1.f173216g
            java.lang.String r2 = r2.getObjectNonceId()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C60817z2.<init>(com.tencent.mm.plugin.finder.storage.FinderItem, te3.mb1, te3.hj1, int, gy3.h):void");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f173219j = nVar;
        return dispatch(gVar, this.f173218i, this);
    }

    public int getType() {
        return 6649;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        super.onGYNetEnd(i, i2, i3, str, uVar, bArr);
        Log.m105924i("Finder.NetSceneFinderDraftPost", "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        C11385n nVar = this.f173219j;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
