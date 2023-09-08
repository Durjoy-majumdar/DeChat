package je1;

import bd1.C0264h;
import bd1.C39759i;
import bd1.C54447c;
import bd1.C54448d;
import bo1.C0344g;
import cm1.C0740i2;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.protocal.protobuf.FinderUserPageResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58784w3;
import fe1.C58960c;
import fe1.C58961d;
import fe1.C58969q;
import gy3.C8480h;
import gy3.C87412m;
import it1.C9255j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kj2.C117407d;
import o40.C61937h;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import sx3.C36907w;
import sx3.C64186f0;
import te3.C49098d51;
import te3.C49742hr0;
import te3.C49842ig0;
import te3.C50856po1;
import te3.C51270sn1;
import te3.C51974xh1;
import te3.C64284cg;
import vp1.C14937o;
import vp1.C14944s;
import wp1.C15585f;
import z04.C112551y;
import zc1.C66785b;
import zh0.C16196b;

/* renamed from: je1.s4 */
public final class C9377s4 extends C9255j implements C16196b {

    /* renamed from: g */
    public final String f29277g;

    /* renamed from: h */
    public final long f29278h;

    /* renamed from: i */
    public boolean f29279i;

    /* renamed from: j */
    public final String f29280j;

    /* renamed from: n */
    public final boolean f29281n;

    /* renamed from: o */
    public C47350c f29282o;

    /* renamed from: p */
    public C11385n f29283p;

    /* renamed from: q */
    public List<? extends FinderItem> f29284q;

    /* renamed from: r */
    public boolean f29285r;

    /* renamed from: s */
    public int f29286s;

    /* renamed from: t */
    public LinkedList<String> f29287t;

    /* renamed from: u */
    public int f29288u;

    /* renamed from: v */
    public int f29289v;

    /* renamed from: w */
    public int f29290w;

    /* renamed from: x */
    public int f29291x;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9377s4(java.lang.String r25, long r26, pe3.C89349b r28, int r29, te3.C49712hj1 r30, int r31, long r32, boolean r34, java.lang.String r35, long r36, java.lang.Integer r38, java.lang.Long r39, java.lang.String r40, boolean r41, boolean r42, java.lang.Long r43, int r44, gy3.C8480h r45) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r30
            r3 = r44
            r4 = r3 & 2
            r5 = 0
            java.lang.Long r7 = java.lang.Long.valueOf(r5)
            if (r4 == 0) goto L_0x0014
            r8 = r5
            goto L_0x0016
        L_0x0014:
            r8 = r26
        L_0x0016:
            r4 = r3 & 4
            if (r4 == 0) goto L_0x001c
            r4 = 0
            goto L_0x001e
        L_0x001c:
            r4 = r28
        L_0x001e:
            r11 = r3 & 8
            r12 = 0
            if (r11 == 0) goto L_0x0025
            r11 = 0
            goto L_0x0027
        L_0x0025:
            r11 = r29
        L_0x0027:
            r13 = r3 & 32
            if (r13 == 0) goto L_0x002d
            r13 = 0
            goto L_0x002f
        L_0x002d:
            r13 = r31
        L_0x002f:
            r14 = r3 & 64
            if (r14 == 0) goto L_0x0035
            r14 = r5
            goto L_0x0037
        L_0x0035:
            r14 = r32
        L_0x0037:
            r5 = r3 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x003d
            r5 = 0
            goto L_0x003f
        L_0x003d:
            r5 = r34
        L_0x003f:
            r6 = r3 & 256(0x100, float:3.59E-43)
            java.lang.String r16 = ""
            if (r6 == 0) goto L_0x0048
            r6 = r16
            goto L_0x004a
        L_0x0048:
            r6 = r35
        L_0x004a:
            r10 = r3 & 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L_0x0051
            r17 = 0
            goto L_0x0053
        L_0x0051:
            r17 = r36
        L_0x0053:
            r10 = r3 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L_0x005c
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            goto L_0x005e
        L_0x005c:
            r10 = r38
        L_0x005e:
            r12 = r3 & 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x0064
            r12 = r7
            goto L_0x0066
        L_0x0064:
            r12 = r39
        L_0x0066:
            r45 = r7
            r7 = r3 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x006f
            r7 = r16
            goto L_0x0071
        L_0x006f:
            r7 = r40
        L_0x0071:
            r28 = r11
            r11 = r3 & 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L_0x0079
            r11 = 0
            goto L_0x007b
        L_0x0079:
            r11 = r41
        L_0x007b:
            r29 = r12
            r12 = r3 & 16384(0x4000, float:2.2959E-41)
            if (r12 == 0) goto L_0x0083
            r12 = 0
            goto L_0x0085
        L_0x0083:
            r12 = r42
        L_0x0085:
            r19 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 & r19
            if (r3 == 0) goto L_0x008f
            r31 = r45
            goto L_0x0091
        L_0x008f:
            r31 = r43
        L_0x0091:
            java.lang.String r3 = "req_username"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "biz_username"
            gy3.C87412m.m108594g(r6, r3)
            java.lang.String r3 = "liveNoticeId"
            gy3.C87412m.m108594g(r7, r3)
            r0.<init>(r2)
            r0.f29277g = r1
            r0.f29278h = r14
            r0.f29279i = r5
            r0.f29280j = r6
            r0.f29281n = r12
            r3 = 1
            r0.f29285r = r3
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            r0.f29287t = r5
            fe1.d$b r5 = fe1.C58961d.f168673a
            fe1.q r5 = r5.mo84155b(r1)
            if (r5 == 0) goto L_0x00c2
            java.lang.String r5 = r5.field_firstPageMD5
            goto L_0x00c3
        L_0x00c2:
            r5 = 0
        L_0x00c3:
            if (r5 != 0) goto L_0x00c7
            r5 = r16
        L_0x00c7:
            ob0.c$b r3 = new ob0.c$b
            r3.<init>()
            java.lang.String r0 = "/cgi-bin/micromsg-bin/finderuserpage"
            r3.f127068c = r0
            r0 = 3736(0xe98, float:5.235E-42)
            r3.f127069d = r0
            te3.po1 r0 = new te3.po1
            r0.<init>()
            r0.f139867d = r1
            r0.f139868e = r8
            r0.f139869f = r5
            zc1.b r16 = zc1.C66785b.f191882e
            r19 = r5
            java.lang.String r5 = r16.mo90662O5()
            r0.f139870g = r5
            r0.f139877q = r13
            r0.f139876p = r14
            je1.h2 r5 = je1.C46523h2.f125330a
            r13 = 3736(0xe98, float:5.235E-42)
            te3.ig0 r13 = r5.mo71860b(r13, r2)
            r0.f139872i = r13
            if (r2 == 0) goto L_0x00fc
            int r1 = r2.f134677n
            goto L_0x00fd
        L_0x00fc:
            r1 = 0
        L_0x00fd:
            r13.f135313e = r1
            if (r11 == 0) goto L_0x0108
            int r1 = r13.f135315g
            r11 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 | r11
            r13.f135315g = r1
        L_0x0108:
            java.lang.String r1 = r0.f139867d
            java.lang.String r11 = r0.f139870g
            r13 = 2
            r20 = r8
            r8 = 0
            r9 = 0
            boolean r1 = z04.C112551y.m153810j(r1, r11, r9, r13, r8)
            if (r1 != 0) goto L_0x012d
            up1.f r1 = up1.C37521f.f99374d
            r1.getClass()
            re1.a r1 = up1.C37521f.f99178G4
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x012b
            goto L_0x012d
        L_0x012b:
            r1 = 0
            goto L_0x012e
        L_0x012d:
            r1 = 1
        L_0x012e:
            r0.f139871h = r1
            r0.f139873j = r4
            te3.hh0 r1 = r5.mo71867j()
            r0.f139875o = r1
            bl3.r r1 = bl3.C39818r.f106831a
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r4 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            bl3.r$a r1 = r1.mo62446e(r4)
            java.lang.Class<os1.d> r4 = os1.C62153d.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r4)
            os1.d r1 = (os1.C62153d) r1
            rx3.l r1 = r1.mo9104X0()
            A r4 = r1.f38555d
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            r0.f139880t = r4
            B r1 = r1.f38556e
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r0.f139881u = r1
            if (r10 == 0) goto L_0x0167
            int r1 = r10.intValue()
            goto L_0x0168
        L_0x0167:
            r1 = 0
        L_0x0168:
            r0.f139882v = r1
            if (r29 == 0) goto L_0x0175
            long r22 = r29.longValue()
            r26 = r10
            r9 = r22
            goto L_0x0179
        L_0x0175:
            r26 = r10
            r9 = 0
        L_0x0179:
            r0.f139883w = r9
            r0.f139885y = r7
            if (r31 == 0) goto L_0x0184
            long r7 = r31.longValue()
            goto L_0x0186
        L_0x0184:
            r7 = 0
        L_0x0186:
            r0.f139886z = r7
            r7 = 0
            int r1 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0191
            r7 = r17
            goto L_0x0197
        L_0x0191:
            if (r29 == 0) goto L_0x0197
            long r7 = r29.longValue()
        L_0x0197:
            r0.f139878r = r7
            int r4 = r6.length()
            if (r4 <= 0) goto L_0x01a1
            r4 = 1
            goto L_0x01a2
        L_0x01a1:
            r4 = 0
        L_0x01a2:
            if (r4 == 0) goto L_0x01af
            if (r1 == 0) goto L_0x01a9
            r1 = 23
            goto L_0x01ab
        L_0x01a9:
            r1 = 24
        L_0x01ab:
            r0.f139874n = r1
            r0.f139879s = r6
        L_0x01af:
            if (r12 == 0) goto L_0x01b5
            r1 = 33
            r0.f139874n = r1
        L_0x01b5:
            int r1 = r0.f139874n
            if (r1 != 0) goto L_0x01c1
            if (r2 == 0) goto L_0x01be
            int r1 = r2.f134678o
            goto L_0x01bf
        L_0x01be:
            r1 = 0
        L_0x01bf:
            r0.f139874n = r1
        L_0x01c1:
            te3.ig0 r1 = r0.f139872i
            rx3.l r4 = new rx3.l
            if (r1 == 0) goto L_0x01ca
            int r12 = r1.f135313e
            goto L_0x01cb
        L_0x01ca:
            r12 = 0
        L_0x01cb:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            java.lang.Long r7 = java.lang.Long.valueOf(r14)
            r4.<init>(r6, r7)
            java.util.List r4 = sx3.C26236u.m33719b(r4)
            r5.mo71865g(r1, r4, r2)
            com.tencent.mm.protocal.protobuf.FinderUserPageResponse r1 = new com.tencent.mm.protocal.protobuf.FinderUserPageResponse
            r1.<init>()
            r3.f127066a = r0
            r3.f127067b = r1
            ob0.c r0 = r3.mo72403a()
            r1 = r24
            r1.f29282o = r0
            r12 = r28
            r1.f29286s = r12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "NetSceneFinderUserPage init maxId "
            r0.append(r2)
            r5 = r20
            r0.append(r5)
            java.lang.String r2 = " username "
            r0.append(r2)
            r2 = r25
            r0.append(r2)
            java.lang.String r2 = " pullType "
            r0.append(r2)
            r0.append(r12)
            java.lang.String r2 = " fpMD5 "
            r0.append(r2)
            r5 = r19
            r0.append(r5)
            java.lang.String r2 = " scene "
            r0.append(r2)
            r10 = r26
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Finder.NetSceneFinderUserPage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C9377s4.<init>(java.lang.String, long, pe3.b, int, te3.hj1, int, long, boolean, java.lang.String, long, java.lang.Integer, java.lang.Long, java.lang.String, boolean, boolean, java.lang.Long, int, gy3.h):void");
    }

    /* renamed from: A */
    public FinderObject mo10099A() {
        T t;
        C47465a aVar = this.f29282o.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
        LinkedList<FinderObject> linkedList = ((FinderUserPageResponse) aVar).object;
        C87412m.m108593f(linkedList, "rr.responseProtoBuf as F…serPageResponse).`object`");
        Iterator<T> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            FinderObjectDesc finderObjectDesc = ((FinderObject) t).objectDesc;
            boolean z = false;
            if (finderObjectDesc != null && finderObjectDesc.mediaType == 9) {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (FinderObject) t;
    }

    /* renamed from: N0 */
    public C49098d51 mo10100N0() {
        C47465a aVar = this.f29282o.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
        return ((FinderUserPageResponse) aVar).liveNoticeInfo;
    }

    /* renamed from: P0 */
    public FinderContact mo10101P0() {
        C47465a aVar = this.f29282o.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
        return ((FinderUserPageResponse) aVar).contact;
    }

    /* renamed from: S0 */
    public boolean mo10102S0() {
        C47465a aVar = this.f29282o.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
        return ((FinderUserPageResponse) aVar).mv_object_move_flag == 1;
    }

    /* renamed from: X0 */
    public boolean mo10103X0() {
        return this.f29279i;
    }

    /* renamed from: Y0 */
    public int mo10104Y0() {
        return this.f29288u;
    }

    /* renamed from: c1 */
    public String mo10105c1() {
        return this.f29277g;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29283p = nVar;
        return dispatch(gVar, this.f29282o, this);
    }

    public C89349b getLastBuffer() {
        C47465a aVar = this.f29282o.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
        return ((FinderUserPageResponse) aVar).lastBuffer;
    }

    public List<FinderItem> getMediaList() {
        return this.f29284q;
    }

    public int getType() {
        return 3736;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        super.mo8516k1(i, i2, i3, str, uVar, bArr);
        Log.m105924i("Finder.NetSceneFinderUserPage", "errType " + i4 + ", errCode " + i5 + ", errMsg " + str2);
        if (i4 == 0 && i5 == 0) {
            C117407d.INSTANCE.idkeyStat(1279, 13, 1, false);
            C47465a aVar = this.f29282o.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
            FinderUserPageResponse finderUserPageResponse = (FinderUserPageResponse) aVar;
            String str3 = this.f29277g;
            String str4 = this.f29280j;
            LinkedList<String> linkedList = finderUserPageResponse.userTags;
            C87412m.m108593f(linkedList, "resp.userTags");
            this.f29287t = linkedList;
            this.f29288u = finderUserPageResponse.friendFollowCount;
            this.f29289v = finderUserPageResponse.fansCount;
            C49742hr0 hr02 = finderUserPageResponse.just_watch;
            boolean z = false;
            this.f29290w = hr02 != null ? hr02.f134824d : 0;
            this.f29291x = hr02 != null ? hr02.f134825e : 0;
            C0344g gVar = C0344g.f929a;
            C51974xh1 xh12 = finderUserPageResponse.preloadInfo;
            LinkedList<FinderObject> linkedList2 = finderUserPageResponse.object;
            C87412m.m108593f(linkedList2, "resp.`object`");
            gVar.mo386b(xh12, linkedList2, 3736);
            FinderContact finderContact = finderUserPageResponse.contact;
            if (finderContact != null) {
                Log.m105924i("Finder.NetSceneFinderUserPage", "contact info " + C61937h.m72709h(finderContact) + " fansCount: " + finderUserPageResponse.fansCount + " friendFollowCount:" + finderUserPageResponse.friendFollowCount);
                String str5 = finderContact.username;
                String str6 = str5 == null ? "" : str5;
                C64284cg a = C58960c.m68829a(finderContact, false);
                FinderContact finderContact2 = null;
                String str7 = a != null ? a.f182468d : null;
                String str8 = str7 == null ? "" : str7;
                C58961d.f168673a.mo84162j(finderContact);
                String str9 = finderContact.username;
                if (!(str9 == null || str9.length() == 0) && !C87412m.m108589b(finderContact.username, this.f29277g)) {
                    FinderContact finderContact3 = new FinderContact();
                    byte[] byteArray = finderContact.toByteArray();
                    if (byteArray != null) {
                        try {
                            finderContact3.parseFrom(byteArray);
                            finderContact2 = finderContact3;
                        } catch (Exception e) {
                            Log.printDebugStack("safeParser", "", e);
                        }
                    }
                    if (finderContact2 != null) {
                        finderContact2.username = this.f29277g;
                        C58961d.f168673a.mo84162j(finderContact2);
                        Log.m105924i("Finder.NetSceneFinderUserPage", "duplicate contact for " + this.f29277g + ", " + str6);
                    }
                }
                C58961d.C58963b bVar = C58961d.f168673a;
                C58969q b = bVar.mo84155b(finderContact.username);
                if (b != null) {
                    b.field_firstPageMD5 = finderUserPageResponse.firstPageMD5;
                    bVar.mo84166o(b);
                }
                C66785b bVar2 = C66785b.f191882e;
                if (bVar2.mo90677q1(str6)) {
                    C54447c a2 = C54448d.m61169a(finderContact);
                    if (finderUserPageResponse.fansCount > 0) {
                        a2.mo75251m2().f132484A = finderUserPageResponse.fansCount;
                    }
                    bVar2.mo90672m1(a2, C39759i.USER_PAGE);
                }
                str3 = str6;
                str4 = str8;
            }
            if (this.f29279i) {
                Log.m105928w("Finder.NetSceneFinderUserPage", "isOnlyFetchUserInfo=true");
                C11385n nVar = this.f29283p;
                if (nVar != null) {
                    C87412m.m108591d(nVar);
                    nVar.onSceneEnd(i4, i5, str2, this);
                    return;
                }
                return;
            }
            LinkedList<FinderObject> linkedList3 = finderUserPageResponse.object;
            C87412m.m108591d(linkedList3);
            Log.m105924i("Finder.NetSceneFinderUserPage", "cgiBack: continueFlag:" + finderUserPageResponse.continueFlag + ", list:" + C9311g2.f29093a.mo10062a(linkedList3));
            StringBuilder sb = new StringBuilder();
            sb.append("onGYNetEnd list:");
            sb.append(linkedList3.size());
            Log.m105924i("Finder.NetSceneFinderUserPage", sb.toString());
            this.f29285r = finderUserPageResponse.continueFlag == 1;
            boolean z2 = this.f29286s != 2;
            ArrayList arrayList = new ArrayList();
            for (T next : linkedList3) {
                if (C58784w3.f168295a.mo83866E0((FinderObject) next)) {
                    arrayList.add(next);
                }
            }
            C15585f.C15586a aVar2 = C15585f.f42211a;
            List<FinderItem> f = aVar2.mo14343f(arrayList, 2, this.f172736d);
            this.f29284q = f;
            if (z2 && this.f29278h == 0) {
                if (str4 == null || str4.length() == 0) {
                    z = true;
                }
                if (!z) {
                    ArrayList<C0740i2> arrayList2 = new ArrayList<>(C36907w.m41090l(f, 10));
                    for (FinderItem k : f) {
                        arrayList2.add(C15585f.f42211a.mo14348k(k));
                    }
                    C87412m.m108594g(str4, "bizUsername");
                    if (!C112551y.m153811k(str4)) {
                        int L1 = C58784w3.f168295a.mo83884L1(33536);
                        LinkedList linkedList4 = new LinkedList();
                        for (C0740i2 i2Var : arrayList2) {
                            if (i2Var instanceof BaseFinderFeed) {
                                FinderObject feedObject = ((BaseFinderFeed) i2Var).mo3513o().getFeedObject();
                                linkedList4.add(new C14944s(0, feedObject.f164794id, feedObject, 33536, false, 16, (C8480h) null));
                            }
                        }
                        C14937o.f40972a.mo13980a(L1, str4, linkedList4);
                    }
                } else {
                    ArrayList arrayList3 = new ArrayList(C36907w.m41090l(f, 10));
                    for (FinderItem k2 : f) {
                        arrayList3.add(C15585f.f42211a.mo14348k(k2));
                    }
                    aVar2.mo14346i(arrayList3, 2, str3, z2);
                }
            }
            C66785b.f191882e.mo90657E1(this.f29277g, new C0264h(finderUserPageResponse.logout_lock, finderUserPageResponse.logout_url, false, 4, (C8480h) null));
        } else {
            C117407d.INSTANCE.idkeyStat(1279, 14, 1, false);
        }
        C11385n nVar2 = this.f29283p;
        if (nVar2 != null) {
            C87412m.m108591d(nVar2);
            nVar2.onSceneEnd(i4, i5, str2, this);
        }
    }

    /* renamed from: l1 */
    public List<FinderItem> mo10031l1(C114799u uVar) {
        C47465a aVar = this.f29282o.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
        LinkedList<FinderObject> linkedList = ((FinderUserPageResponse) aVar).object;
        if (linkedList == null) {
            return C64186f0.f181907d;
        }
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (FinderObject b : linkedList) {
            arrayList.add(FinderItem.C56324a.m64570b(FinderItem.Companion, b, 0, 2, (Object) null));
        }
        return arrayList;
    }

    /* renamed from: m1 */
    public long mo10032m1() {
        C47465a aVar = this.f29282o.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageRequest");
        C49842ig0 ig02 = ((C50856po1) aVar).f139872i;
        if (ig02 != null) {
            return ig02.f135317i;
        }
        return 0;
    }

    /* renamed from: n1 */
    public final long mo10108n1() {
        C47465a aVar = this.f29282o.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageRequest");
        return ((C50856po1) aVar).f139868e;
    }

    /* renamed from: o1 */
    public final String mo10109o1() {
        C47465a aVar = this.f29282o.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
        return ((FinderUserPageResponse) aVar).preload_buffer;
    }

    /* renamed from: p1 */
    public final LinkedList<C51270sn1> mo10110p1() {
        C47465a aVar = this.f29282o.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
        LinkedList<C51270sn1> linkedList = ((FinderUserPageResponse) aVar).usualTopics;
        C87412m.m108593f(linkedList, "rr.responseProtoBuf as F…PageResponse).usualTopics");
        return linkedList;
    }
}
