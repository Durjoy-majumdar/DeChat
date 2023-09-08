package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import it1.C60628i;
import kt1.C46744d;
import ob0.C11385n;
import ob0.C47350c;
import te3.C64657qh1;

/* renamed from: je1.f4 */
public final class C60799f4 extends C60628i {

    /* renamed from: g */
    public FinderItem f173170g;

    /* renamed from: h */
    public final String f173171h;

    /* renamed from: i */
    public final long f173172i;

    /* renamed from: j */
    public C47350c f173173j;

    /* renamed from: n */
    public C11385n f173174n;

    /* renamed from: o */
    public C64657qh1 f173175o;

    /* renamed from: p */
    public FinderObject f173176p;

    /* JADX WARNING: type inference failed for: r3v3, types: [com.tencent.mm.protocal.protobuf.FinderObjectDesc] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0374  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x041a  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0421  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x042c  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0432  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0442  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01c3  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C60799f4(com.tencent.p014mm.plugin.finder.storage.FinderItem r17, java.lang.String r18, long r19, byte[] r21) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = r21
            java.lang.String r4 = "finderItem"
            gy3.C87412m.m108594g(r0, r4)
            java.lang.String r4 = "clientId"
            gy3.C87412m.m108594g(r2, r4)
            r4 = 0
            r5 = 1
            r1.<init>(r4, r5, r4)
            r1.f173170g = r0
            r1.f173171h = r2
            r6 = r19
            r1.f173172i = r6
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r17.getFeedObject()
            r1.f173176p = r0
            ob0.c$b r6 = new ob0.c$b
            r6.<init>()
            java.lang.String r0 = "/cgi-bin/micromsg-bin/finderpost"
            r6.f127068c = r0
            r7 = 3585(0xe01, float:5.024E-42)
            r6.f127069d = r7
            te3.qh1 r8 = new te3.qh1
            r8.<init>()
            r1.f173175o = r8
            r8.f185019f = r2
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = new com.tencent.mm.protocal.protobuf.FinderObjectDesc
            r0.<init>()
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r1.f173176p
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
            if (r2 == 0) goto L_0x004b
            byte[] r2 = r2.toByteArray()
            goto L_0x004c
        L_0x004b:
            r2 = r4
        L_0x004c:
            java.lang.String r9 = ""
            r10 = 0
            if (r2 != 0) goto L_0x0053
        L_0x0051:
            r0 = r4
            goto L_0x0063
        L_0x0053:
            r0.parseFrom(r2)     // Catch:{ Exception -> 0x0057 }
            goto L_0x0063
        L_0x0057:
            r0 = move-exception
            r2 = r0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r10] = r2
            java.lang.String r2 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r9, r0)
            goto L_0x0051
        L_0x0063:
            gy3.C87412m.m108591d(r0)
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r1.f173176p
            long r11 = r2.refObjectId
            r13 = 0
            java.lang.String r2 = "Finder.LogPost.NetSceneFinderPost"
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 == 0) goto L_0x0074
            goto L_0x0118
        L_0x0074:
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r11 = r0.media
            java.lang.String r12 = "objectDesc.media"
            gy3.C87412m.m108593f(r11, r12)
            java.util.Iterator r11 = r11.iterator()
        L_0x007f:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0118
            java.lang.Object r12 = r11.next()
            com.tencent.mm.protocal.protobuf.FinderMedia r12 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r12
            com.tencent.mm.plugin.finder.storage.FinderItem r15 = r1.f173170g
            java.lang.String r13 = r12.url
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r13)
            java.lang.String r14 = "getMD5String(media.url)"
            gy3.C87412m.m108593f(r13, r14)
            te3.rq2 r13 = r15.mediaExt(r13)
            if (r13 == 0) goto L_0x0114
            uq1.t r14 = uq1.C65460t.f188357a
            com.tencent.mm.plugin.finder.storage.FinderItem r15 = r1.f173170g
            java.util.LinkedList r15 = r15.getHalfVideoMediaExtList()
            r14.mo89573a(r12, r13, r15)
            int r14 = r12.mediaType
            r15 = 4
            if (r14 != r15) goto L_0x0114
            int r14 = r13.f185254S0
            r12.video_type = r14
            int r14 = r13.f185252R0
            r12.dynamic_range_type = r14
            int r14 = r12.videoDuration
            r15 = 2000(0x7d0, float:2.803E-42)
            if (r14 <= 0) goto L_0x00be
            if (r14 <= r15) goto L_0x0114
        L_0x00be:
            java.lang.Class<rw.m> r14 = p232rw.C63679m.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            rw.m r14 = (p232rw.C63679m) r14
            java.lang.String r5 = r13.f185266d
            if (r5 != 0) goto L_0x00cb
            r5 = r9
        L_0x00cb:
            rw.m$a r5 = r14.mo88483M1(r5)
            if (r5 == 0) goto L_0x00d5
            long r4 = r5.f180528d
            int r5 = (int) r4
            goto L_0x00d6
        L_0x00d5:
            r5 = 0
        L_0x00d6:
            int r5 = r5 / 1000
            r12.videoDuration = r5
            if (r5 <= 0) goto L_0x00e2
            if (r5 <= r15) goto L_0x00df
            goto L_0x00e2
        L_0x00df:
            r4 = 0
            r5 = 1
            goto L_0x0114
        L_0x00e2:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "NetSceneFinderPost videoDuration invalid:"
            r4.append(r5)
            int r12 = r13.f185269g
            r4.append(r12)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r4)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r4 != 0) goto L_0x00fd
            goto L_0x00df
        L_0x00fd:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            int r3 = r13.f185269g
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0114:
            r13 = 0
            goto L_0x007f
        L_0x0118:
            int r4 = r0.mediaType
            r5 = 8
            if (r4 != r5) goto L_0x0120
            r0.mediaType = r10
        L_0x0120:
            r8.f185018e = r0
            te3.qh1 r0 = r1.f173175o
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r1.f173176p
            te3.tf0 r4 = r4.attachmentList
            r0.f185034x = r4
            zc1.b r4 = zc1.C66785b.f191882e
            java.lang.String r4 = r4.mo90662O5()
            r0.f185017d = r4
            te3.qh1 r0 = r1.f173175o
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r1.f173176p
            long r11 = r4.refObjectId
            r0.f185020g = r11
            java.lang.String r5 = r4.refObjectNonceId
            r0.f185021h = r5
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r4 = r4.objectDesc
            if (r4 == 0) goto L_0x0149
            te3.ef1 r4 = r4.event
            if (r4 == 0) goto L_0x0149
            long r4 = r4.f132898d
            goto L_0x014b
        L_0x0149:
            r4 = 0
        L_0x014b:
            r0.f185011B = r4
            je1.h2 r4 = je1.C46523h2.f125330a
            te3.ig0 r4 = r4.mo71859a(r7)
            r0.f185022i = r4
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f173170g
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r4 = r0.field_reportObject
            if (r4 == 0) goto L_0x015e
            int r4 = r4.enterScene
            goto L_0x015f
        L_0x015e:
            r4 = 0
        L_0x015f:
            te3.qh1 r5 = r1.f173175o
            r7 = 13
            if (r4 == r7) goto L_0x016d
            r7 = 16
            if (r4 == r7) goto L_0x016b
            r4 = 0
            goto L_0x016e
        L_0x016b:
            r4 = 1
            goto L_0x016e
        L_0x016d:
            r4 = 3
        L_0x016e:
            r5.f185015F = r4
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x017f
            te3.jl0 r0 = r0.fromApp
            if (r0 == 0) goto L_0x017f
            int r0 = r0.f183812j
            goto L_0x0180
        L_0x017f:
            r0 = 0
        L_0x0180:
            r4 = 9
            r5 = 2
            if (r4 != r0) goto L_0x0189
            te3.qh1 r0 = r1.f173175o
            r0.f185015F = r5
        L_0x0189:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f173170g
            te3.ih1 r0 = r0.field_postExtraData
            if (r0 == 0) goto L_0x01b2
            up1.f r4 = up1.C37521f.f99374d
            r4.getClass()
            pe1.c<java.lang.Integer> r4 = up1.C37521f.f99496q7
            java.lang.Object r4 = r4.mo60266n()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r4 != 0) goto L_0x01ac
            te3.qh1 r4 = r1.f173175o
            float r7 = r0.f183691e
            r4.f185024n = r7
            float r7 = r0.f183690d
            r4.f185023j = r7
        L_0x01ac:
            te3.qh1 r4 = r1.f173175o
            int r0 = r0.f183694h
            r4.f185027q = r0
        L_0x01b2:
            te3.qh1 r0 = r1.f173175o
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            r0.f185028r = r4
            up1.f r0 = up1.C37521f.f99374d
            boolean r4 = r0.mo61158L()
            if (r4 == 0) goto L_0x0247
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r0 = r0.mo61175c()
            if (r0 == 0) goto L_0x020a
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r1.f173170g
            te3.tq2 r4 = r4.field_postinfo
            if (r4 == 0) goto L_0x01f6
            java.util.LinkedList<te3.nq2> r4 = r4.f185656r
            if (r4 == 0) goto L_0x01f6
            java.util.Iterator r4 = r4.iterator()
        L_0x01e1:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x01f6
            java.lang.Object r7 = r4.next()
            te3.nq2 r7 = (te3.C64589nq2) r7
            java.lang.String r8 = r7.f184532f
            if (r8 != 0) goto L_0x01f2
            r8 = r9
        L_0x01f2:
            r0.put(r8, r7)
            goto L_0x01e1
        L_0x01f6:
            er1.t r4 = er1.C58775t.f168276a
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r1.f173176p
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r7 = r7.objectDesc
            if (r7 == 0) goto L_0x0202
            java.lang.String r7 = r7.description
            if (r7 != 0) goto L_0x0203
        L_0x0202:
            r7 = r9
        L_0x0203:
            r8 = 0
            rx3.l r0 = r4.mo83825f(r7, r0, r8)
            B r4 = r0.f38556e
        L_0x020a:
            te3.qh1 r0 = r1.f173175o
            java.util.LinkedList<java.lang.String> r0 = r0.f185028r
            er1.q3 r7 = er1.C58771q3.f168268a
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r1.f173176p
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r8 = r8.objectDesc
            if (r8 == 0) goto L_0x021a
            java.lang.String r8 = r8.description
            if (r8 != 0) goto L_0x021b
        L_0x021a:
            r8 = r9
        L_0x021b:
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r11 = 0
            java.util.List r4 = r7.mo83813d(r8, r4, r11)
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = sx3.C36907w.m41090l(r4, r8)
            r7.<init>(r8)
            java.util.Iterator r4 = r4.iterator()
        L_0x0231:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x0243
            java.lang.Object r8 = r4.next()
            er1.q5 r8 = (er1.C58773q5) r8
            java.lang.String r8 = r8.f168274c
            r7.add(r8)
            goto L_0x0231
        L_0x0243:
            r0.addAll(r7)
            goto L_0x0248
        L_0x0247:
            r11 = 0
        L_0x0248:
            te3.qh1 r0 = r1.f173175o
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r1.f173176p
            int r7 = r4.originalFlag
            r0.f185029s = r7
            boolean r4 = r4.showOriginal
            if (r4 == 0) goto L_0x025b
            long r7 = r0.f185014E
            r12 = 1
            long r7 = r7 | r12
            r0.f185014E = r7
        L_0x025b:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r1.f173176p
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r4 = r4.objectDesc
            if (r4 == 0) goto L_0x0286
            java.util.LinkedList<te3.ic1> r4 = r4.mentionedMusics
            if (r4 == 0) goto L_0x0286
            java.util.Iterator r4 = r4.iterator()
        L_0x026e:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0286
            java.lang.Object r7 = r4.next()
            te3.ic1 r7 = (te3.C49827ic1) r7
            te3.td1 r7 = r7.f135205e
            if (r7 == 0) goto L_0x026e
            java.lang.String r7 = r7.f185534d
            if (r7 == 0) goto L_0x026e
            r0.add(r7)
            goto L_0x026e
        L_0x0286:
            te3.qh1 r4 = r1.f173175o
            r4.f185031u = r0
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r1.f173176p
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x02a7
            te3.ve1 r0 = r0.feedBgmInfo
            if (r0 == 0) goto L_0x02a7
            te3.td1 r0 = r0.f185873d
            if (r0 == 0) goto L_0x02a7
            java.lang.String r0 = r0.f185539i
            if (r0 == 0) goto L_0x02a7
            java.lang.String r7 = "http"
            r8 = 1
            boolean r0 = z04.C112551y.m153819s(r0, r7, r8)
            if (r0 != r8) goto L_0x02a8
            r0 = 1
            goto L_0x02a9
        L_0x02a7:
            r8 = 1
        L_0x02a8:
            r0 = 0
        L_0x02a9:
            if (r0 == 0) goto L_0x02bd
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r1.f173176p
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x02bd
            te3.ve1 r0 = r0.feedBgmInfo
            if (r0 == 0) goto L_0x02bd
            te3.td1 r0 = r0.f185873d
            if (r0 == 0) goto L_0x02bd
            java.lang.String r0 = r0.f185539i
            if (r0 != 0) goto L_0x02be
        L_0x02bd:
            r0 = r9
        L_0x02be:
            r4.f185035y = r0
            te3.qh1 r0 = r1.f173175o
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r1.f173176p
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r4 = r4.objectDesc
            if (r4 == 0) goto L_0x02cf
            te3.ve1 r7 = r4.feedBgmInfo
            if (r7 == 0) goto L_0x02cf
            java.lang.String r7 = r7.f185874e
            goto L_0x02d0
        L_0x02cf:
            r7 = r11
        L_0x02d0:
            r0.f185033w = r7
            if (r4 == 0) goto L_0x02db
            te3.ve1 r7 = r4.feedBgmInfo
            if (r7 == 0) goto L_0x02db
            te3.td1 r7 = r7.f185873d
            goto L_0x02dc
        L_0x02db:
            r7 = r11
        L_0x02dc:
            if (r7 == 0) goto L_0x02f9
            if (r4 == 0) goto L_0x02eb
            te3.ve1 r4 = r4.feedBgmInfo
            if (r4 == 0) goto L_0x02eb
            te3.td1 r4 = r4.f185873d
            if (r4 == 0) goto L_0x02eb
            java.lang.String r4 = r4.f185534d
            goto L_0x02ec
        L_0x02eb:
            r4 = r11
        L_0x02ec:
            if (r4 == 0) goto L_0x02f4
            int r4 = r4.length()
            if (r4 != 0) goto L_0x02f5
        L_0x02f4:
            r10 = 1
        L_0x02f5:
            if (r10 == 0) goto L_0x02f8
            goto L_0x02f9
        L_0x02f8:
            r8 = 2
        L_0x02f9:
            r0.f185036z = r8
            te3.qh1 r0 = r1.f173175o
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r1.f173170g
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
            int r4 = r4.objectType
            r0.f185010A = r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "bgmInfo: groupBgmUrl:"
            r0.append(r4)
            te3.qh1 r4 = r1.f173175o
            java.lang.String r4 = r4.f185035y
            r0.append(r4)
            java.lang.String r4 = ",groupId:"
            r0.append(r4)
            te3.qh1 r4 = r1.f173175o
            java.lang.String r4 = r4.f185033w
            r0.append(r4)
            java.lang.String r4 = ",groupPostType:"
            r0.append(r4)
            te3.qh1 r4 = r1.f173175o
            int r4 = r4.f185036z
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f173170g
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x034b
            te3.fh0 r0 = r0.client_draft_ext_info
            if (r0 == 0) goto L_0x034b
            te3.qh1 r4 = r1.f173175o
            int r0 = r0.f183133d
            r4.f185012C = r0
        L_0x034b:
            te3.qh1 r0 = r1.f173175o
            int r4 = r0.f185012C
            if (r4 != 0) goto L_0x035b
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r1.f173170g
            te3.tq2 r4 = r4.getPostInfo()
            int r4 = r4.f185658t
            r0.f185012C = r4
        L_0x035b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "waitType "
            r0.append(r4)
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r1.f173170g
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r4 = r4.objectDesc
            if (r4 == 0) goto L_0x037b
            te3.fh0 r4 = r4.client_draft_ext_info
            if (r4 == 0) goto L_0x037b
            int r4 = r4.f183133d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            goto L_0x037c
        L_0x037b:
            r8 = r11
        L_0x037c:
            r0.append(r8)
            java.lang.String r4 = ", "
            r0.append(r4)
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r1.f173170g
            te3.tq2 r7 = r7.getPostInfo()
            int r7 = r7.f185658t
            r0.append(r7)
            r0.append(r4)
            te3.qh1 r4 = r1.f173175o
            int r4 = r4.f185012C
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f173170g
            boolean r0 = r0.isLongVideo()
            if (r0 == 0) goto L_0x03ac
            te3.qh1 r0 = r1.f173175o
            r0.f185013D = r5
        L_0x03ac:
            te3.lx4 r0 = new te3.lx4
            r0.<init>()
            te3.qv3 r4 = new te3.qv3
            r4.<init>()
            tc2.g r5 = tc2.C118418g.INSTANCE
            java.lang.String r7 = "ce_feed_publish"
            byte[] r7 = r5.bw0(r7)
            r4.mo73350k(r7)
            r0.f354116e = r4
            te3.qv3 r4 = new te3.qv3
            r4.<init>()
            byte[] r5 = r5.mo175821hd()
            r4.mo73350k(r5)
            r0.f354117f = r4
            te3.qh1 r4 = r1.f173175o
            te3.ig0 r4 = r4.f185022i
            if (r4 != 0) goto L_0x03d8
            goto L_0x03e3
        L_0x03d8:
            pe3.b r5 = new pe3.b
            byte[] r0 = r0.toByteArray()
            r5.<init>(r0)
            r4.f135314f = r5
        L_0x03e3:
            if (r3 == 0) goto L_0x03ed
            te3.qh1 r0 = r1.f173175o
            pe3.b r4 = o40.C61937h.m72710i(r21)
            r0.f185016G = r4
        L_0x03ed:
            jm2.f r0 = jm2.C117361f.INSTANCE
            r4 = 540999699(0x203f0013, float:1.6178354E-19)
            r0.mo182041q(r4)
            te3.qh1 r0 = r1.f173175o
            r6.f127066a = r0
            te3.rh1 r0 = new te3.rh1
            r0.<init>()
            r6.f127067b = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "postRequest detail: clientId "
            r0.append(r4)
            java.lang.String r4 = r1.f173171h
            r0.append(r4)
            java.lang.String r4 = "  draftId:"
            r0.append(r4)
            te3.qh1 r4 = r1.f173175o
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r4 = r4.f185018e
            if (r4 == 0) goto L_0x0421
            long r4 = r4.draftObjectId
            java.lang.Long r8 = java.lang.Long.valueOf(r4)
            goto L_0x0422
        L_0x0421:
            r8 = r11
        L_0x0422:
            r0.append(r8)
            java.lang.String r4 = " , mediaFeature:"
            r0.append(r4)
            if (r3 == 0) goto L_0x0432
            int r3 = r3.length
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            goto L_0x0433
        L_0x0432:
            r4 = r11
        L_0x0433:
            r0.append(r4)
            java.lang.String r3 = " content: "
            r0.append(r3)
            te3.qh1 r3 = r1.f173175o
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r3.f185018e
            if (r3 != 0) goto L_0x0442
            goto L_0x0443
        L_0x0442:
            r9 = r3
        L_0x0443:
            org.json.JSONObject r3 = o40.C61937h.m72709h(r9)
            r0.append(r3)
            java.lang.String r3 = " refId: "
            r0.append(r3)
            te3.qh1 r3 = r1.f173175o
            long r3 = r3.f185020g
            r0.append(r3)
            java.lang.String r3 = " localId:"
            r0.append(r3)
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r1.f173170g
            long r3 = r3.getLocalId()
            r0.append(r3)
            java.lang.String r3 = " isCreatedInFinder:"
            r0.append(r3)
            te3.qh1 r3 = r1.f173175o
            int r3 = r3.f185027q
            r0.append(r3)
            java.lang.String r3 = ", originalFlag:"
            r0.append(r3)
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r1.f173176p
            int r3 = r3.originalFlag
            r0.append(r3)
            java.lang.String r3 = ", post_scene="
            r0.append(r3)
            te3.qh1 r3 = r1.f173175o
            int r3 = r3.f185015F
            r0.append(r3)
            r3 = 32
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "latitude:"
            r0.append(r3)
            te3.qh1 r3 = r1.f173175o
            float r3 = r3.f185024n
            r0.append(r3)
            java.lang.String r3 = ", longitude:"
            r0.append(r3)
            te3.qh1 r3 = r1.f173175o
            float r3 = r3.f185023j
            r0.append(r3)
            java.lang.String r3 = ", feedLatitude:"
            r0.append(r3)
            te3.qh1 r3 = r1.f173175o
            float r3 = r3.f185026p
            r0.append(r3)
            java.lang.String r3 = ", feedLongitude:"
            r0.append(r3)
            te3.qh1 r3 = r1.f173175o
            float r3 = r3.f185025o
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            ob0.c r0 = r6.mo72403a()
            r1.f173173j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C60799f4.<init>(com.tencent.mm.plugin.finder.storage.FinderItem, java.lang.String, long, byte[]):void");
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return C46744d.Enable;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f173174n = nVar;
        return dispatch(gVar, this.f173173j, this);
    }

    public int getType() {
        return 3585;
    }

    /* JADX WARNING: Removed duplicated region for block: B:227:0x0738  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x073a  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x074b  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x079a  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x044a A[EDGE_INSN: B:275:0x044a->B:119:0x044a ?: BREAK  , SYNTHETIC] */
    /* renamed from: k1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8516k1(int r58, int r59, int r60, java.lang.String r61, com.tencent.p014mm.network.C114799u r62, byte[] r63) {
        /*
            r57 = this;
            r1 = r57
            r2 = r59
            r3 = r60
            r4 = r61
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "errType %d, errCode %d, errMsg %s, localId %s localId:"
            r0.append(r5)
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r1.f173170g
            long r5 = r5.getLocalId()
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r5 = 4
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r59)
            r8 = 0
            r6[r8] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r60)
            r9 = 1
            r6[r9] = r7
            r7 = 2
            r6[r7] = r4
            long r10 = r1.f173172i
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r11 = 3
            r6[r11] = r10
            java.lang.String r10 = "Finder.LogPost.NetSceneFinderPost"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r0, r6)
            if (r2 != 0) goto L_0x06e5
            if (r3 != 0) goto L_0x06e5
            kj2.d r14 = kj2.C117407d.INSTANCE
            r15 = 1279(0x4ff, double:6.32E-321)
            r17 = 5
            r19 = 1
            r21 = 0
            r14.idkeyStat(r15, r17, r19, r21)
            te3.qh1 r0 = r1.f173175o
            int r0 = r0.f185015F
            java.lang.String r6 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPostResponse"
            java.lang.String r14 = ""
            if (r0 != r7) goto L_0x007d
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.lang.String> r0 = ao1.C54265f.f152305a
            long r12 = r1.f173172i
            ob0.c r0 = r1.f173173j
            if (r0 == 0) goto L_0x0069
            ob0.c$d r0 = r0.f127056b
            pe3.a r0 = r0.f127083a
            goto L_0x006a
        L_0x0069:
            r0 = 0
        L_0x006a:
            gy3.C87412m.m108592e(r0, r6)
            te3.rh1 r0 = (te3.C51109rh1) r0
            java.lang.String r0 = r0.f140928f
            if (r0 != 0) goto L_0x0074
            r0 = r14
        L_0x0074:
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.lang.String> r13 = ao1.C54265f.f152305a
            r13.put(r12, r0)
        L_0x007d:
            ob0.c r0 = r1.f173173j
            if (r0 == 0) goto L_0x0086
            ob0.c$d r0 = r0.f127056b
            pe3.a r0 = r0.f127083a
            goto L_0x0087
        L_0x0086:
            r0 = 0
        L_0x0087:
            gy3.C87412m.m108592e(r0, r6)
            te3.rh1 r0 = (te3.C51109rh1) r0
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.f140926d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r12 = "onGYNetEnd "
            r6.append(r12)
            r6.append(r0)
            r12 = 32
            r6.append(r12)
            if (r0 == 0) goto L_0x00a9
            long r12 = r0.f164794id
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            goto L_0x00aa
        L_0x00a9:
            r12 = 0
        L_0x00aa:
            r6.append(r12)
            java.lang.String r12 = ", localId:"
            r6.append(r12)
            r13 = r12
            long r11 = r1.f173172i
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r6)
            wp1.f$a r6 = wp1.C15585f.f42211a
            long r11 = r1.f173172i
            boolean r6 = r6.mo14344g(r11)
            if (r6 == 0) goto L_0x06cb
            com.tencent.mm.protocal.protobuf.FinderObject r6 = r1.f173176p
            com.tencent.mm.protocal.protobuf.FinderContact r11 = r6.contact
            if (r0 != 0) goto L_0x00d0
            r0 = r6
        L_0x00d0:
            r1.f173176p = r0
            java.lang.String r6 = r0.nickname
            if (r6 != 0) goto L_0x00df
            if (r11 == 0) goto L_0x00db
            java.lang.String r6 = r11.nickname
            goto L_0x00dc
        L_0x00db:
            r6 = 0
        L_0x00dc:
            if (r6 != 0) goto L_0x00df
            r6 = r14
        L_0x00df:
            r0.nickname = r6
            r0.contact = r11
            long r11 = r1.f173172i
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r6 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r16 = di3.C86312j.m106911c(r6)
            com.tencent.mm.plugin.FinderCommonFeatureService r16 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r16
            up1.p r9 = r16.Dx0()
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r9.mo13662Lo(r11)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r15 = "updateLocalFeed, isExist "
            r8.append(r15)
            if (r9 != 0) goto L_0x0104
            r15 = 1
            goto L_0x0105
        L_0x0104:
            r15 = 0
        L_0x0105:
            r8.append(r15)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r8)
            if (r9 == 0) goto L_0x050f
            r9.setPostFinish()
            up1.y r8 = up1.C27696y.RAW_IMAGE
            up1.y r15 = up1.C27696y.THUMB_IMAGE
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r1.f173170g
            java.util.LinkedList r5 = r5.getMediaExtList()
            java.util.Iterator r5 = r5.iterator()
            r19 = 0
        L_0x0124:
            boolean r20 = r5.hasNext()
            if (r20 == 0) goto L_0x03e7
            java.lang.Object r20 = r5.next()
            int r26 = r19 + 1
            if (r19 < 0) goto L_0x03e2
            r7 = r20
            te3.rq2 r7 = (te3.C64689rq2) r7
            r36 = r5
            uq1.e r5 = uq1.C65433e.f188292a
            r37 = r13
            java.lang.String r13 = r7.f185266d
            if (r13 != 0) goto L_0x0141
            r13 = r14
        L_0x0141:
            r5.mo89559j(r13)
            java.lang.String r13 = r7.f185267e
            if (r13 != 0) goto L_0x0149
            r13 = r14
        L_0x0149:
            r5.mo89559j(r13)
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r5 = r0.objectDesc
            if (r5 == 0) goto L_0x03c7
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r5 = r5.media
            if (r5 == 0) goto L_0x03c7
            java.util.Iterator r5 = r5.iterator()
        L_0x0158:
            boolean r13 = r5.hasNext()
            if (r13 == 0) goto L_0x0179
            java.lang.Object r13 = r5.next()
            r19 = r5
            r5 = r13
            com.tencent.mm.protocal.protobuf.FinderMedia r5 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r5
            java.lang.String r5 = r5.url
            r20 = r13
            java.lang.String r13 = r7.f185278r
            boolean r5 = gy3.C87412m.m108589b(r5, r13)
            if (r5 == 0) goto L_0x0176
            r13 = r20
            goto L_0x017a
        L_0x0176:
            r5 = r19
            goto L_0x0158
        L_0x0179:
            r13 = 0
        L_0x017a:
            com.tencent.mm.protocal.protobuf.FinderMedia r13 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r13
            if (r13 == 0) goto L_0x03c7
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r38 = r14
            java.lang.String r14 = "cpFiles new MediaId mediaID "
            r5.append(r14)
            java.lang.String r14 = r7.f185275p
            r5.append(r14)
            java.lang.String r14 = " newMediaID "
            r5.append(r14)
            java.lang.String r14 = r13.url
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r14)
            r5.append(r14)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r10, r5)
            java.lang.String r5 = r13.url
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r5)
            r7.f185275p = r5
            er1.w3 r5 = er1.C58784w3.f168295a
            java.lang.String r14 = r7.f185267e
            java.lang.String r14 = r5.mo83984z1(r14)
            r7.f185285x0 = r14
            java.lang.String r14 = r7.f185283w
            java.lang.String r5 = r5.mo83984z1(r14)
            r7.f185287y0 = r5
            int r5 = r7.f185268f
            java.lang.String r14 = "  url "
            java.lang.String r4 = " to path "
            r3 = 2
            if (r5 == r3) goto L_0x01ca
            r3 = 7
            if (r5 != r3) goto L_0x024d
        L_0x01ca:
            pl1.b0 r3 = new pl1.b0
            r5 = 0
            r23 = 0
            r24 = 12
            r25 = 0
            r22 = 0
            r19 = r3
            r20 = r7
            r21 = r15
            r19.<init>(r20, r21, r22, r23, r24, r25)
            pl1.b0 r27 = new pl1.b0
            r19 = r27
            r21 = r8
            r22 = r5
            r19.<init>(r20, r21, r22, r23, r24, r25)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = "cp image files thumbUrl "
            r5.append(r2)
            java.lang.String r2 = r7.f185267e
            r5.append(r2)
            r5.append(r4)
            java.lang.String r2 = r3.getPath()
            r5.append(r2)
            java.lang.String r2 = " url "
            r5.append(r2)
            java.lang.String r2 = r13.thumbUrl
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "cp image files url "
            r2.append(r5)
            java.lang.String r5 = r7.f185266d
            r2.append(r5)
            r2.append(r4)
            java.lang.String r5 = r27.getPath()
            r2.append(r5)
            r2.append(r14)
            java.lang.String r5 = r13.url
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            java.lang.String r2 = r7.f185267e
            java.lang.String r3 = r3.getPath()
            com.tencent.p014mm.vfs.C86013q1.m106442c(r2, r3)
            java.lang.String r2 = r7.f185266d
            java.lang.String r3 = r27.getPath()
            com.tencent.p014mm.vfs.C86013q1.m106442c(r2, r3)
        L_0x024d:
            int r2 = r7.f185268f
            r3 = 4
            if (r2 != r3) goto L_0x03c4
            pl1.b0 r2 = new pl1.b0
            r22 = 0
            r23 = 0
            r24 = 12
            r25 = 0
            r19 = r2
            r20 = r7
            r21 = r15
            r19.<init>(r20, r21, r22, r23, r24, r25)
            java.lang.Class<rz.q> r3 = p682rz.C36594q.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            rz.q r3 = (p682rz.C36594q) r3
            r5 = 4
            boolean r3 = r3.mo60733UY(r5)
            boolean r5 = gr1.C59686x0.f170506a
            if (r5 == 0) goto L_0x0279
            r43 = 3
            goto L_0x0280
        L_0x0279:
            if (r3 == 0) goto L_0x027e
            r43 = 2
            goto L_0x0280
        L_0x027e:
            r43 = 1
        L_0x0280:
            pl1.r0 r3 = new pl1.r0
            up1.y r29 = up1.C27696y.V99_VIDEO
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 56
            r35 = 0
            java.lang.String r30 = "xV99"
            r27 = r3
            r28 = r7
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35)
            pl1.o0 r5 = new pl1.o0
            r25 = 0
            r27 = 4
            r28 = 0
            r22 = 0
            r23 = 4
            r24 = 0
            r19 = r5
            r20 = r7
            r21 = r8
            r19.<init>(r20, r21, r22, r23, r24)
            pl1.x r29 = new pl1.x
            r19 = r29
            r21 = r15
            r22 = r25
            r23 = r27
            r24 = r28
            r19.<init>(r20, r21, r22, r23, r24)
            r19 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r20 = r15
            java.lang.String r15 = "cp video files thumbUrl "
            r8.append(r15)
            java.lang.String r15 = r7.f185267e
            r8.append(r15)
            r8.append(r4)
            java.lang.String r15 = r2.getPath()
            r8.append(r15)
            r8.append(r14)
            java.lang.String r15 = r13.thumbUrl
            r8.append(r15)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r15 = "cp video files url "
            r8.append(r15)
            java.lang.String r15 = r7.f185266d
            r8.append(r15)
            r8.append(r4)
            java.lang.String r15 = r3.getPath()
            r8.append(r15)
            r8.append(r14)
            java.lang.String r15 = r13.url
            r8.append(r15)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r15 = "cp cover files url "
            r8.append(r15)
            java.lang.String r15 = r7.f185283w
            r8.append(r15)
            r8.append(r4)
            java.lang.String r15 = r5.getPath()
            r8.append(r15)
            r8.append(r14)
            java.lang.String r15 = r13.coverUrl
            r8.append(r15)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r15 = "cp fullThumb files url "
            r8.append(r15)
            java.lang.String r15 = r7.f185239F
            r8.append(r15)
            r8.append(r4)
            java.lang.String r4 = r5.getPath()
            r8.append(r4)
            r8.append(r14)
            java.lang.String r4 = r13.coverUrl
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r4)
            java.lang.String r4 = r7.f185267e
            java.lang.String r2 = r2.getPath()
            com.tencent.p014mm.vfs.C86013q1.m106442c(r4, r2)
            java.lang.String r2 = r7.f185266d
            java.lang.String r4 = r3.getPath()
            com.tencent.p014mm.vfs.C86013q1.m106442c(r2, r4)
            java.lang.String r2 = r7.f185283w
            java.lang.String r4 = r5.getPath()
            com.tencent.p014mm.vfs.C86013q1.m106442c(r2, r4)
            java.lang.String r2 = r7.f185239F
            java.lang.String r4 = r29.getPath()
            com.tencent.p014mm.vfs.C86013q1.m106442c(r2, r4)
            java.lang.String r2 = r7.f185266d
            long r48 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)
            wp1.g r39 = wp1.C66167g.f190173a
            java.lang.String r40 = r3.mo11841b()
            java.lang.String r2 = r7.f185275p
            if (r2 != 0) goto L_0x0399
            r41 = r38
            goto L_0x039b
        L_0x0399:
            r41 = r2
        L_0x039b:
            java.lang.String r2 = r7.f185266d
            if (r2 != 0) goto L_0x03a2
            r42 = r38
            goto L_0x03a4
        L_0x03a2:
            r42 = r2
        L_0x03a4:
            java.lang.String r44 = r3.mo87422g()
            int r2 = r3.f177257i
            r45 = r2
            r50 = 3
            te3.rq2 r2 = r3.f177253e
            int r2 = r2.f185269g
            r51 = r2
            r54 = 0
            r55 = 4096(0x1000, float:5.74E-42)
            r56 = 0
            java.lang.String r52 = ""
            java.lang.String r53 = ""
            r46 = r48
            wp1.C66167g.m78056h(r39, r40, r41, r42, r43, r44, r45, r46, r48, r50, r51, r52, r53, r54, r55, r56)
            goto L_0x03cd
        L_0x03c4:
            r19 = r8
            goto L_0x03cb
        L_0x03c7:
            r19 = r8
            r38 = r14
        L_0x03cb:
            r20 = r15
        L_0x03cd:
            r2 = r59
            r3 = r60
            r4 = r61
            r8 = r19
            r15 = r20
            r19 = r26
            r5 = r36
            r13 = r37
            r14 = r38
            r7 = 2
            goto L_0x0124
        L_0x03e2:
            sx3.C64197v.m75542k()
            r2 = 0
            throw r2
        L_0x03e7:
            r37 = r13
            r38 = r14
            r2 = 0
            r9.updateFinderObject(r0)
            java.lang.Integer[] r0 = vp1.C14937o.f40974c
            r3 = 0
        L_0x03f2:
            r4 = 13
            if (r3 >= r4) goto L_0x0474
            r4 = r0[r3]
            int r4 = r4.intValue()
            vp1.o$a r5 = vp1.C14937o.f40972a
            r5.mo13990l(r4)
            vp1.r r5 = vp1.C14937o.f40976e
            vp1.a r5 = r5.mo13997a(r4)
            te3.xk0 r5 = r5.f40955c
            java.util.LinkedList<te3.il0> r5 = r5.f144718d
            if (r5 == 0) goto L_0x0470
            r7 = 0
            java.lang.Object r5 = sx3.C110818d0.m150917O(r5, r7)
            te3.il0 r5 = (te3.C49863il0) r5
            if (r5 == 0) goto L_0x0470
            java.util.LinkedList<te3.kk0> r5 = r5.f135460d
            if (r5 == 0) goto L_0x0470
            java.util.Iterator r5 = r5.iterator()
        L_0x041e:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0449
            java.lang.Object r7 = r5.next()
            r8 = r7
            te3.kk0 r8 = (te3.C50140kk0) r8
            int r13 = r8.f136842i
            if (r13 != 0) goto L_0x0445
            int r13 = r8.f136837d
            r14 = 2
            if (r13 != r14) goto L_0x0445
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r8.f136839f
            if (r8 == 0) goto L_0x0440
            long r14 = r8.f164794id
            int r8 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r8 != 0) goto L_0x0440
            r8 = 1
            goto L_0x0441
        L_0x0440:
            r8 = 0
        L_0x0441:
            if (r8 == 0) goto L_0x0445
            r8 = 1
            goto L_0x0446
        L_0x0445:
            r8 = 0
        L_0x0446:
            if (r8 == 0) goto L_0x041e
            goto L_0x044a
        L_0x0449:
            r7 = r2
        L_0x044a:
            te3.kk0 r7 = (te3.C50140kk0) r7
            if (r7 == 0) goto L_0x0462
            r5 = 1
            r7.f136837d = r5
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r7.f136839f
            if (r5 != 0) goto L_0x0456
            goto L_0x045a
        L_0x0456:
            long r13 = r9.field_id
            r5.f164794id = r13
        L_0x045a:
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r9.getFeedObject()
            r7.f136839f = r5
            r5 = 1
            goto L_0x0463
        L_0x0462:
            r5 = 0
        L_0x0463:
            if (r5 == 0) goto L_0x0470
            vp1.o$a r5 = vp1.C14937o.f40972a
            vp1.r r7 = vp1.C14937o.f40976e
            vp1.a r4 = r7.mo13997a(r4)
            r5.mo13981b(r4)
        L_0x0470:
            int r3 = r3 + 1
            goto L_0x03f2
        L_0x0474:
            bl3.r r0 = bl3.C39818r.f106831a
            bl3.r$a r0 = r0.mo62446e(r6)
            java.lang.Class<os1.f> r3 = os1.C11739f.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r3)
            os1.f r0 = (os1.C11739f) r0
            r3 = 3
            os1.f$a r0 = r0.mo11600c3(r3)
            java.util.ArrayList<cm1.i2> r0 = r0.f34369b
            java.util.Iterator r0 = r0.iterator()
        L_0x048d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x04b9
            java.lang.Object r3 = r0.next()
            r4 = r3
            cm1.i2 r4 = (cm1.C0740i2) r4
            boolean r5 = r4 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r5 == 0) goto L_0x04b4
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r4
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
            long r4 = r4.getLocalId()
            int r7 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x04b4
            r4 = 0
            int r7 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x04b4
            r4 = 1
            goto L_0x04b5
        L_0x04b4:
            r4 = 0
        L_0x04b5:
            if (r4 == 0) goto L_0x048d
            r15 = r3
            goto L_0x04ba
        L_0x04b9:
            r15 = r2
        L_0x04ba:
            cm1.i2 r15 = (cm1.C0740i2) r15
            if (r15 == 0) goto L_0x04c3
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r15 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r15
            r15.mo3488V(r9)
        L_0x04c3:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r9.setMediaExtList(r0)
            di3.d r0 = di3.C86312j.m106911c(r6)
            com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
            up1.p r0 = r0.Dx0()
            r2 = 0
            boolean r0 = r0.mo13664jo(r11, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "updateLocalFeed, delete local feed "
            r2.append(r3)
            r2.append(r0)
            r0 = r37
            r2.append(r0)
            long r3 = r9.getLocalId()
            r2.append(r3)
            java.lang.String r0 = ", id:"
            r2.append(r0)
            long r3 = r9.getId()
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            vp1.e r0 = vp1.C65834e.f189316a
            vp1.e$b r2 = vp1.C65834e.C65836b.f189328h
            r0.mo89878l(r9, r2)
            goto L_0x0511
        L_0x050f:
            r38 = r14
        L_0x0511:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f173170g
            te3.tq2 r0 = r0.field_postinfo
            java.util.LinkedList<te3.nq2> r0 = r0.f185656r
            java.util.Iterator r0 = r0.iterator()
        L_0x051b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x052e
            java.lang.Object r2 = r0.next()
            te3.nq2 r2 = (te3.C64589nq2) r2
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r1.f173170g
            long r3 = r3.field_createTime
            r2.f184534h = r3
            goto L_0x051b
        L_0x052e:
            er1.t r0 = er1.C58775t.f168276a
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r1.f173170g
            te3.tq2 r2 = r2.field_postinfo
            java.util.LinkedList<te3.nq2> r2 = r2.f185656r
            java.lang.String r3 = "finderItem.field_postinfo.atContactList"
            gy3.C87412m.m108593f(r2, r3)
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0544
        L_0x0541:
            r4 = 0
            goto L_0x0619
        L_0x0544:
            java.util.LinkedList r3 = r0.mo83820a()
            if (r3 != 0) goto L_0x054f
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
        L_0x054f:
            java.util.HashMap r4 = new java.util.HashMap
            int r5 = r3.size()
            r4.<init>(r5)
            java.util.Iterator r5 = r3.iterator()
        L_0x055c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0572
            java.lang.Object r6 = r5.next()
            te3.nq2 r6 = (te3.C64589nq2) r6
            java.lang.String r7 = r6.f184530d
            if (r7 != 0) goto L_0x056e
            r7 = r38
        L_0x056e:
            r4.put(r7, r6)
            goto L_0x055c
        L_0x0572:
            java.util.Iterator r2 = r2.iterator()
        L_0x0576:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x05a6
            java.lang.Object r5 = r2.next()
            te3.nq2 r5 = (te3.C64589nq2) r5
            java.lang.String r6 = r5.f184530d
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x0576
            java.lang.String r6 = r5.f184530d
            java.lang.Object r6 = r4.get(r6)
            te3.nq2 r6 = (te3.C64589nq2) r6
            if (r6 == 0) goto L_0x059c
            long r6 = r6.f184534h
            long r8 = r5.f184534h
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x0576
        L_0x059c:
            java.lang.String r6 = r5.f184530d
            if (r6 != 0) goto L_0x05a2
            r6 = r38
        L_0x05a2:
            r4.put(r6, r5)
            goto L_0x0576
        L_0x05a6:
            r3.clear()
            java.util.Set r2 = r4.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x05b1:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x05cd
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getValue()
            te3.nq2 r4 = (te3.C64589nq2) r4
            r3.add(r4)
            goto L_0x05b1
        L_0x05cd:
            er1.u<T> r2 = er1.C7884u.f26506d
            java.util.Collections.sort(r3, r2)
            int r2 = r3.size()
            r4 = 5
            if (r2 <= r4) goto L_0x05e8
            int r2 = r3.size()
            r4 = 1
            int r2 = r2 - r4
        L_0x05df:
            r4 = 4
            if (r4 >= r2) goto L_0x05e8
            r3.remove(r2)
            int r2 = r2 + -1
            goto L_0x05df
        L_0x05e8:
            te3.uq2 r2 = new te3.uq2
            r2.<init>()
            r2.f185785d = r3
            byte[] r2 = r2.toByteArray()     // Catch:{ IOException -> 0x0602 }
            if (r2 != 0) goto L_0x05f7
            goto L_0x0541
        L_0x05f7:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = r0.mo83822c()
            java.lang.String r3 = "_finder_at_mmkv_recent_at"
            r0.encode((java.lang.String) r3, (byte[]) r2)
            goto L_0x0541
        L_0x0602:
            r0 = move-exception
            r2 = r0
            int r0 = com.tencent.p014mm.plugin.finder.p056ui.FinderPostAtUI.f17001w
            int r0 = com.tencent.p014mm.plugin.finder.p056ui.FinderPostAtUI.f17001w
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r3 = r2.getMessage()
            r4 = 0
            r0[r4] = r3
            java.lang.String r3 = "Finder.FinderPostAtUI"
            java.lang.String r5 = "_writeRecentAt, LocalFinderRecentAtContactCache, _write: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r2, r5, r0)
        L_0x0619:
            vp1.e r0 = vp1.C65834e.f189316a
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r1.f173176p
            long r2 = r2.f164794id
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r0.mo89871e(r2)
            if (r8 == 0) goto L_0x06df
            vq1.w$a r0 = vq1.C65866w.f189406g
            vq1.w r0 = vq1.C65866w.f189407h
            long r2 = r1.f173172i
            java.util.HashMap<java.lang.Long, up1.t> r5 = r0.f189412e
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            boolean r5 = r5.containsKey(r6)
            java.util.HashMap<java.lang.Long, up1.t> r6 = r0.f189412e
            java.lang.Long r7 = java.lang.Long.valueOf(r2)
            java.lang.Object r6 = r6.get(r7)
            up1.t r6 = (up1.C37556t) r6
            if (r6 == 0) goto L_0x0645
            boolean r4 = r6.field_isPrivate
        L_0x0645:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "isLocalFeedLike "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = ", "
            r6.append(r2)
            r6.append(r5)
            java.lang.String r2 = r6.toString()
            java.lang.String r3 = "Finder.FinderLikeActionMgr"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r2 = r2.booleanValue()
            boolean r10 = r4.booleanValue()
            if (r2 == 0) goto L_0x06df
            long r4 = r1.f173172i
            r0.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "doLikeLocalFeed localId:"
            r2.append(r6)
            r2.append(r4)
            java.lang.String r6 = ", isPrivate:"
            r2.append(r6)
            r2.append(r10)
            java.lang.String r6 = ", feedid:"
            r2.append(r6)
            long r6 = r8.getId()
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            java.util.HashMap<java.lang.Long, up1.t> r0 = r0.f189412e
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.Object r0 = r0.get(r2)
            up1.t r0 = (up1.C37556t) r0
            if (r0 == 0) goto L_0x06df
            cm1.q0 r5 = cm1.C0768q0.f1810a
            te3.hj1 r6 = r0.field_contextObj
            java.lang.String r2 = "action.field_contextObj"
            gy3.C87412m.m108593f(r6, r2)
            int r7 = r0.field_likeAction
            r9 = 1
            int r11 = r0.field_scene
            boolean r12 = r0.field_showTips
            r13 = 0
            er1.j4 r0 = er1.C58739j4.f168176a
            boolean r14 = r0.mo83687P()
            r5.mo710a(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x06df
        L_0x06cb:
            if (r0 == 0) goto L_0x06df
            je1.q2 r2 = new je1.q2
            zc1.b r3 = zc1.C66785b.f191882e
            java.lang.String r3 = r3.mo90662O5()
            r2.<init>(r3, r0)
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r0.mo123460f(r2)
        L_0x06df:
            r3 = r59
            r5 = r60
            goto L_0x07bb
        L_0x06e5:
            r4 = 0
            r7 = 1
            kj2.d r8 = kj2.C117407d.INSTANCE
            r9 = 1279(0x4ff, double:6.32E-321)
            r11 = 6
            r13 = 1
            r15 = 0
            r8.idkeyStat(r9, r11, r13, r15)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f173170g
            boolean r0 = r0.isLongVideo()
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 24
            r15 = 1
            r9 = 1253(0x4e5, double:6.19E-321)
            r11 = 24
            r13 = 1
            r8 = r2
            r8.mo175913w(r9, r11, r13)
            if (r0 == 0) goto L_0x0713
            r9 = 1523(0x5f3, double:7.525E-321)
            r8 = r2
            r11 = r5
            r13 = r15
            r8.mo175913w(r9, r11, r13)
        L_0x0713:
            r3 = r59
            r0 = 4
            if (r3 != r0) goto L_0x0730
            r0 = -5002(0xffffffffffffec76, float:NaN)
            r5 = r60
            if (r5 == r0) goto L_0x072e
            r0 = -5001(0xffffffffffffec77, float:NaN)
            if (r5 == r0) goto L_0x072e
            r0 = -4065(0xfffffffffffff01f, float:NaN)
            if (r5 == r0) goto L_0x072e
            r0 = -4059(0xfffffffffffff025, float:NaN)
            if (r5 == r0) goto L_0x072e
            switch(r5) {
                case -4007: goto L_0x072e;
                case -4006: goto L_0x072e;
                case -4005: goto L_0x072e;
                default: goto L_0x072d;
            }
        L_0x072d:
            goto L_0x0732
        L_0x072e:
            r0 = 0
            goto L_0x0733
        L_0x0730:
            r5 = r60
        L_0x0732:
            r0 = 1
        L_0x0733:
            r6 = -4013(0xfffffffffffff053, float:NaN)
            r4 = 4
            if (r5 != r6) goto L_0x073a
            r8 = 1
            goto L_0x073b
        L_0x073a:
            r8 = 0
        L_0x073b:
            if (r3 == r4) goto L_0x0741
            if (r0 == 0) goto L_0x0741
            if (r8 == 0) goto L_0x07bb
        L_0x0741:
            wp1.f$a r4 = wp1.C15585f.f42211a
            long r6 = r1.f173172i
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r4.mo14341d(r6)
            if (r6 == 0) goto L_0x0782
            if (r0 == 0) goto L_0x0757
            if (r8 == 0) goto L_0x0753
            r6.setPostFailedAndNoAuth()
            goto L_0x0779
        L_0x0753:
            r6.setPostFailed()
            goto L_0x0779
        L_0x0757:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f173170g
            boolean r0 = r0.isLongVideo()
            r15 = 25
            r17 = 1
            r9 = 1253(0x4e5, double:6.19E-321)
            r11 = 25
            r13 = 1
            r8 = r2
            r8.mo175913w(r9, r11, r13)
            if (r0 == 0) goto L_0x0776
            r9 = 1523(0x5f3, double:7.525E-321)
            r8 = r2
            r11 = r15
            r13 = r17
            r8.mo175913w(r9, r11, r13)
        L_0x0776:
            r6.setPostFailedAndNotRetry(r5)
        L_0x0779:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f173170g
            int r2 = r6.field_localFlag
            r0.field_localFlag = r2
            r4.mo14345h(r6)
        L_0x0782:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f173170g
            boolean r0 = r0.isLongVideo()
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 1253(0x4e5, double:6.19E-321)
            r15 = 16
            r17 = 1
            r6 = r2
            r7 = r13
            r9 = r15
            r11 = r17
            r6.mo175913w(r7, r9, r11)
            if (r0 == 0) goto L_0x07bb
            r6 = 1523(0x5f3, double:7.525E-321)
            r8 = 1253(0x4e5, double:6.19E-321)
            int r0 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x07a4
            r10 = r6
            goto L_0x07a6
        L_0x07a4:
            r10 = 0
        L_0x07a6:
            r19 = 0
            int r0 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x07bb
            int r0 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x07b2
            r7 = r6
            goto L_0x07b4
        L_0x07b2:
            r7 = r19
        L_0x07b4:
            r6 = r2
            r9 = r15
            r11 = r17
            r6.mo175913w(r7, r9, r11)
        L_0x07bb:
            ob0.n r0 = r1.f173174n
            if (r0 == 0) goto L_0x07c8
            gy3.C87412m.m108591d(r0)
            r2 = r61
            r0.onSceneEnd(r3, r5, r2, r1)
            goto L_0x07ca
        L_0x07c8:
            r2 = r61
        L_0x07ca:
            ot1.a r0 = ot1.C11767a.f34453a
            r0.mo11664f(r3, r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C60799f4.mo8516k1(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }
}
