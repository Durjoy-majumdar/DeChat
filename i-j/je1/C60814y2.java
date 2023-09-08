package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import it1.C60628i;
import ob0.C11385n;
import ob0.C47350c;
import ot1.C11767a;
import te3.C64396gh1;
import up1.C65418l;

/* renamed from: je1.y2 */
public final class C60814y2 extends C60628i {

    /* renamed from: g */
    public final C65418l f173200g;

    /* renamed from: h */
    public final String f173201h;

    /* renamed from: i */
    public C47350c f173202i;

    /* renamed from: j */
    public C11385n f173203j;

    /* renamed from: n */
    public C64396gh1 f173204n;

    /* renamed from: o */
    public final FinderObject f173205o;

    /* renamed from: p */
    public final FinderItem f173206p;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C60814y2(up1.C65418l r17, java.lang.String r18, te3.C49712hj1 r19, byte[] r20, int r21, gy3.C8480h r22) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = r21 & 4
            if (r3 == 0) goto L_0x000c
            r3 = 0
            goto L_0x000e
        L_0x000c:
            r3 = r19
        L_0x000e:
            r5 = 8
            r6 = r21 & 8
            if (r6 == 0) goto L_0x0016
            r6 = 0
            goto L_0x0018
        L_0x0016:
            r6 = r20
        L_0x0018:
            java.lang.String r7 = "draftItem"
            gy3.C87412m.m108594g(r0, r7)
            java.lang.String r7 = "clientId"
            gy3.C87412m.m108594g(r2, r7)
            r1.<init>(r3)
            r1.f173200g = r0
            r1.f173201h = r2
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r17.mo89514l2()
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
            r1.f173205o = r2
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r17.mo89514l2()
            r1.f173206p = r0
            ob0.c$b r3 = new ob0.c$b
            r3.<init>()
            r7 = 6649(0x19f9, float:9.317E-42)
            r3.f127069d = r7
            java.lang.String r8 = "/cgi-bin/micromsg-bin/finderpostdraft"
            r3.f127068c = r8
            te3.gh1 r8 = new te3.gh1
            r8.<init>()
            r1.f173204n = r8
            te3.tq2 r0 = r0.getPostInfo()
            java.lang.String r0 = r0.f185645d
            r8 = 1
            r9 = 0
            if (r0 == 0) goto L_0x0060
            int r10 = r0.length()
            if (r10 != 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r10 = 0
            goto L_0x0061
        L_0x0060:
            r10 = 1
        L_0x0061:
            if (r10 == 0) goto L_0x0078
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r10 = "FinderLocal_feed_"
            r0.append(r10)
            long r10 = java.lang.System.nanoTime()
            r0.append(r10)
            java.lang.String r0 = r0.toString()
        L_0x0078:
            te3.gh1 r10 = r1.f173204n
            zc1.b r11 = zc1.C66785b.f191882e
            java.lang.String r11 = r11.mo90662O5()
            r10.f183322e = r11
            te3.gh1 r10 = r1.f173204n
            r10.f183325h = r0
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = new com.tencent.mm.protocal.protobuf.FinderObjectDesc
            r0.<init>()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
            if (r2 == 0) goto L_0x0094
            byte[] r2 = r2.toByteArray()
            goto L_0x0095
        L_0x0094:
            r2 = 0
        L_0x0095:
            java.lang.String r11 = ""
            if (r2 != 0) goto L_0x009a
            goto L_0x00a9
        L_0x009a:
            r0.parseFrom(r2)     // Catch:{ Exception -> 0x009e }
            goto L_0x00aa
        L_0x009e:
            r0 = move-exception
            r2 = r0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r2
            java.lang.String r2 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r11, r0)
        L_0x00a9:
            r0 = 0
        L_0x00aa:
            gy3.C87412m.m108591d(r0)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r2 = r0.media
            java.lang.String r12 = "objectDesc.media"
            gy3.C87412m.m108593f(r2, r12)
            java.util.Iterator r2 = r2.iterator()
        L_0x00b8:
            boolean r12 = r2.hasNext()
            java.lang.String r13 = "Finder.NetSceneFinderDraftPost2"
            if (r12 == 0) goto L_0x0146
            java.lang.Object r12 = r2.next()
            com.tencent.mm.protocal.protobuf.FinderMedia r12 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r12
            com.tencent.mm.plugin.finder.storage.FinderItem r14 = r1.f173206p
            java.lang.String r15 = r12.url
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r15)
            java.lang.String r4 = "getMD5String(media.url)"
            gy3.C87412m.m108593f(r15, r4)
            te3.rq2 r4 = r14.mediaExt(r15)
            if (r4 == 0) goto L_0x00b8
            uq1.t r14 = uq1.C65460t.f188357a
            com.tencent.mm.plugin.finder.storage.FinderItem r15 = r1.f173206p
            java.util.LinkedList r15 = r15.getHalfVideoMediaExtList()
            r14.mo89573a(r12, r4, r15)
            int r14 = r12.mediaType
            r15 = 4
            if (r14 != r15) goto L_0x00b8
            int r14 = r12.videoDuration
            r15 = 2000(0x7d0, float:2.803E-42)
            if (r14 <= 0) goto L_0x00f1
            if (r14 <= r15) goto L_0x00b8
        L_0x00f1:
            java.lang.Class<rw.m> r14 = p232rw.C63679m.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            rw.m r14 = (p232rw.C63679m) r14
            java.lang.String r8 = r4.f185266d
            if (r8 != 0) goto L_0x00fe
            r8 = r11
        L_0x00fe:
            rw.m$a r8 = r14.mo88483M1(r8)
            if (r8 == 0) goto L_0x0108
            long r7 = r8.f180528d
            int r8 = (int) r7
            goto L_0x0109
        L_0x0108:
            r8 = 0
        L_0x0109:
            int r8 = r8 / 1000
            r12.videoDuration = r8
            if (r8 <= 0) goto L_0x0111
            if (r8 <= r15) goto L_0x012b
        L_0x0111:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "NetSceneFinderDraftPost2 videoDuration invalid:"
            r7.append(r8)
            int r12 = r4.f185269g
            r7.append(r12)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r7)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r7 != 0) goto L_0x012f
        L_0x012b:
            r7 = 6649(0x19f9, float:9.317E-42)
            r8 = 1
            goto L_0x00b8
        L_0x012f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            int r3 = r4.f185269g
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0146:
            int r2 = r0.mediaType
            if (r2 != r5) goto L_0x014c
            r0.mediaType = r9
        L_0x014c:
            r10.f183323f = r0
            te3.gh1 r0 = r1.f173204n
            up1.l r2 = r1.f173200g
            int r2 = r2.field_objectType
            r4 = 2
            if (r2 != r4) goto L_0x0159
            r2 = 1
            goto L_0x015a
        L_0x0159:
            r2 = 0
        L_0x015a:
            if (r2 == 0) goto L_0x015e
            r2 = 2
            goto L_0x015f
        L_0x015e:
            r2 = 0
        L_0x015f:
            r0.f183324g = r2
            je1.h2 r2 = je1.C46523h2.f125330a
            r5 = 6649(0x19f9, float:9.317E-42)
            te3.ig0 r2 = r2.mo71859a(r5)
            r0.f183321d = r2
            te3.gh1 r0 = r1.f173204n
            up1.l r2 = r1.f173200g
            int r5 = r2.field_objectType
            if (r5 != r4) goto L_0x0175
            r8 = 1
            goto L_0x0176
        L_0x0175:
            r8 = 0
        L_0x0176:
            if (r8 == 0) goto L_0x017a
            r5 = 2
            goto L_0x017b
        L_0x017a:
            r5 = 3
        L_0x017b:
            r0.f183326i = r5
            long r7 = r2.field_objectId
            r0.f183327j = r7
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.mo89514l2()
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
            te3.tf0 r2 = r2.attachmentList
            r0.f183328n = r2
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f173206p
            boolean r0 = r0.isLongVideo()
            if (r0 == 0) goto L_0x0199
            te3.gh1 r0 = r1.f173204n
            r0.f183329o = r4
        L_0x0199:
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r1.f173205o
            boolean r0 = r0.showOriginal
            if (r0 == 0) goto L_0x01a8
            te3.gh1 r0 = r1.f173204n
            long r4 = r0.f183330p
            r7 = 1
            long r4 = r4 | r7
            r0.f183330p = r4
        L_0x01a8:
            if (r6 == 0) goto L_0x01b2
            te3.gh1 r0 = r1.f173204n
            pe3.b r2 = o40.C61937h.m72710i(r6)
            r0.f183331q = r2
        L_0x01b2:
            te3.gh1 r0 = r1.f173204n
            r3.f127066a = r0
            te3.hh1 r0 = new te3.hh1
            r0.<init>()
            r3.f127067b = r0
            ob0.c r0 = r3.mo72403a()
            r1.f173202i = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "NetSceneFinderDraftPost2 init "
            r0.append(r2)
            up1.l r2 = r1.f173200g
            long r2 = r2.field_localId
            r0.append(r2)
            java.lang.String r2 = ", "
            r0.append(r2)
            up1.l r2 = r1.f173200g
            long r2 = r2.field_objectId
            r0.append(r2)
            java.lang.String r2 = " localClipNonceId:"
            r0.append(r2)
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r1.f173206p
            java.lang.String r2 = r2.getObjectNonceId()
            r0.append(r2)
            java.lang.String r2 = " mediaFeature:"
            r0.append(r2)
            if (r6 == 0) goto L_0x01fb
            int r2 = r6.length
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            goto L_0x01fc
        L_0x01fb:
            r4 = 0
        L_0x01fc:
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C60814y2.<init>(up1.l, java.lang.String, te3.hj1, byte[], int, gy3.h):void");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f173203j = nVar;
        return dispatch(gVar, this.f173202i, this);
    }

    public int getType() {
        return 6649;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("Finder.NetSceneFinderDraftPost2", "errType %d, errCode %d, errMsg %s, localId:" + this.f173200g.field_localId, Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f173203j;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i2, i3, str, this);
        }
        C11767a.f34453a.mo11664f(i2, i3, str);
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        super.onGYNetEnd(i, i2, i3, str, uVar, bArr);
        Log.m105924i("Finder.NetSceneFinderDraftPost2", "errType " + i2 + ", errCode " + i3 + ", errMsg " + str);
        C11385n nVar = this.f173203j;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
