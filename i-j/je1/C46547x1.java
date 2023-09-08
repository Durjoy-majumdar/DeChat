package je1;

import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dp1.C58417y0;
import fe1.C58961d;
import gy3.C87412m;
import ht1.C60200t1;
import it1.C9251d;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kt1.C46744d;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import pf1.C62273n;
import rx3.C13598b0;
import sx3.C26236u;
import sx3.C64186f0;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C49867im0;
import te3.C50008jm0;
import up1.C65426w0;

/* renamed from: je1.x1 */
public final class C46547x1 extends C9251d<C50008jm0> {

    /* renamed from: s */
    public final long f125420s;

    /* renamed from: t */
    public boolean f125421t;

    /* renamed from: u */
    public C65426w0 f125422u;

    /* renamed from: v */
    public String f125423v;

    /* renamed from: w */
    public final boolean f125424w;

    /* renamed from: x */
    public final boolean f125425x;

    /* renamed from: y */
    public long f125426y;

    /* renamed from: z */
    public C46744d f125427z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0203  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C46547x1(long r22, java.lang.String r24, int r25, int r26, java.lang.String r27, boolean r28, pe3.C89349b r29, up1.C65426w0 r30, long r31, java.lang.String r33, boolean r34, boolean r35, java.lang.String r36, te3.C49712hj1 r37, int r38, te3.C49946j51 r39, boolean r40, int r41, gy3.C8480h r42) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r37
            r7 = r41
            r8 = r7 & 32
            if (r8 == 0) goto L_0x0014
            r8 = 0
            goto L_0x0016
        L_0x0014:
            r8 = r28
        L_0x0016:
            r10 = r7 & 64
            if (r10 == 0) goto L_0x001c
            r10 = 0
            goto L_0x001e
        L_0x001c:
            r10 = r29
        L_0x001e:
            r12 = r7 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x0024
            r12 = 0
            goto L_0x0026
        L_0x0024:
            r12 = r30
        L_0x0026:
            r13 = r7 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x002d
            r16 = 0
            goto L_0x002f
        L_0x002d:
            r16 = r31
        L_0x002f:
            r13 = r7 & 512(0x200, float:7.175E-43)
            java.lang.String r18 = ""
            if (r13 == 0) goto L_0x0038
            r13 = r18
            goto L_0x003a
        L_0x0038:
            r13 = r33
        L_0x003a:
            r9 = r7 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0040
            r9 = 1
            goto L_0x0042
        L_0x0040:
            r9 = r34
        L_0x0042:
            r15 = r7 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L_0x0048
            r15 = 0
            goto L_0x004a
        L_0x0048:
            r15 = r35
        L_0x004a:
            r14 = r7 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0051
            r14 = r18
            goto L_0x0053
        L_0x0051:
            r14 = r36
        L_0x0053:
            r11 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x0059
            r11 = 6
            goto L_0x005b
        L_0x0059:
            r11 = r38
        L_0x005b:
            r19 = 32768(0x8000, float:4.5918E-41)
            r19 = r7 & r19
            if (r19 == 0) goto L_0x0066
            r19 = r15
            r15 = 0
            goto L_0x006a
        L_0x0066:
            r19 = r15
            r15 = r39
        L_0x006a:
            r20 = 65536(0x10000, float:9.18355E-41)
            r7 = r7 & r20
            if (r7 == 0) goto L_0x0074
            r31 = r15
            r7 = 1
            goto L_0x0078
        L_0x0074:
            r7 = r40
            r31 = r15
        L_0x0078:
            java.lang.String r15 = "feedUsername"
            gy3.C87412m.m108594g(r5, r15)
            java.lang.String r15 = "username"
            gy3.C87412m.m108594g(r13, r15)
            java.lang.String r15 = "encryptedObjectId"
            gy3.C87412m.m108594g(r14, r15)
            r15 = 2
            r20 = r11
            r11 = 0
            r0.<init>(r6, r11, r15, r11)
            r0.f125420s = r1
            r0.f125421t = r8
            r0.f125422u = r12
            r0.f125423v = r13
            r0.f125424w = r9
            r0.f125425x = r7
            if (r12 == 0) goto L_0x00a2
            long r7 = r12.mo89531n2()
            goto L_0x00a4
        L_0x00a2:
            r7 = 0
        L_0x00a4:
            r0.f125426y = r7
            ob0.c$b r7 = new ob0.c$b
            r7.<init>()
            te3.im0 r8 = new te3.im0
            r8.<init>()
            r8.f135478d = r1
            r11 = r24
            r8.f135488q = r11
            je1.h2 r11 = je1.C46523h2.f125330a
            r12 = 3763(0xeb3, float:5.273E-42)
            te3.ig0 r6 = r11.mo71860b(r12, r6)
            r8.f135489r = r6
            rx3.l r13 = new rx3.l
            java.lang.Integer r15 = java.lang.Integer.valueOf(r25)
            java.lang.Long r12 = java.lang.Long.valueOf(r22)
            r13.<init>(r15, r12)
            java.util.List r12 = sx3.C26236u.m33719b(r13)
            r13 = 0
            r11.mo71865g(r6, r12, r13)
            boolean r6 = r0.f125421t
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            boolean r6 = gy3.C87412m.m108589b(r6, r12)
            r8.f135480f = r6
            r8.f135481g = r10
            r12 = 0
            r8.f135479e = r12
            r8.f135487p = r14
            java.lang.String r6 = r0.f125423v
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x00f8
            java.lang.String r6 = r0.f125423v
            r8.f135483i = r6
            goto L_0x0100
        L_0x00f8:
            zc1.b r6 = zc1.C66785b.f191882e
            java.lang.String r6 = r6.mo90662O5()
            r8.f135483i = r6
        L_0x0100:
            r12 = r16
            r15 = 0
            int r6 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r6 == 0) goto L_0x010a
            r8.f135484j = r12
        L_0x010a:
            long r12 = r0.f125426y
            r8.f135482h = r12
            if (r9 == 0) goto L_0x0112
            r6 = 2
            goto L_0x0113
        L_0x0112:
            r6 = 1
        L_0x0113:
            r8.f135486o = r6
            r8.f135485n = r3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "getIdScene scene:"
            r6.append(r9)
            r6.append(r4)
            java.lang.String r9 = ", commentScene:"
            r6.append(r9)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            java.lang.String r9 = "Finder.CgiGetFinderFeedComment"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r6)
            up1.f r6 = up1.C37521f.f99374d
            r6.getClass()
            pe1.c<java.lang.Integer> r6 = up1.C37521f.f99211K1
            java.lang.Object r6 = r6.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r12 = 1
            if (r6 == r12) goto L_0x0159
            int r6 = up1.C37521f.f99260Q
            if (r6 != r12) goto L_0x0159
            er1.w3 r3 = er1.C58784w3.f168295a
            boolean r3 = r3.mo83899R0(r5)
            if (r3 == 0) goto L_0x0156
            goto L_0x015c
        L_0x0156:
            r15 = 3
            r12 = 1
            goto L_0x0168
        L_0x0159:
            r5 = 7
            if (r3 != r5) goto L_0x015e
        L_0x015c:
            r12 = 1
            goto L_0x0165
        L_0x015e:
            r5 = 8
            r12 = 1
            if (r3 != r5) goto L_0x0167
            if (r4 != r12) goto L_0x0167
        L_0x0165:
            r15 = 1
            goto L_0x0168
        L_0x0167:
            r15 = 2
        L_0x0168:
            r8.f135490s = r15
            r3 = r20
            r8.f135491t = r3
            bl3.r r4 = bl3.C39818r.f106831a
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r5 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            bl3.r$a r4 = r4.mo62446e(r5)
            java.lang.Class<os1.d> r5 = os1.C62153d.class
            androidx.lifecycle.i0 r4 = r4.mo75002a(r5)
            os1.d r4 = (os1.C62153d) r4
            rx3.l r4 = r4.mo9104X0()
            A r5 = r4.f38555d
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            r8.f135495x = r5
            B r4 = r4.f38556e
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            r8.f135496y = r4
            if (r31 == 0) goto L_0x019c
            r4 = r31
            r8.f135474A = r4
        L_0x019c:
            te3.hh0 r4 = r11.mo71867j()
            r8.f135497z = r4
            r7.f127066a = r8
            te3.jm0 r4 = new te3.jm0
            r4.<init>()
            te3.ja r5 = new te3.ja
            r5.<init>()
            r4.setBaseResponse(r5)
            te3.ja r5 = r4.getBaseResponse()
            te3.rv3 r6 = new te3.rv3
            r6.<init>()
            r5.f135956e = r6
            r7.f127067b = r4
            java.lang.String r4 = "/cgi-bin/micromsg-bin/findergetcommentdetail"
            r7.f127068c = r4
            r4 = 3763(0xeb3, float:5.273E-42)
            r7.f127069d = r4
            ob0.c r4 = r7.mo72403a()
            r0.mo123453j(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "CgiGetFinderFeedComment init pullScene:"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = " identityScene:"
            r4.append(r3)
            int r3 = r8.f135490s
            r4.append(r3)
            java.lang.String r3 = ", feedId="
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = " lastBuffer="
            r4.append(r1)
            if (r10 == 0) goto L_0x01f5
            r1 = 1
            goto L_0x01f6
        L_0x01f5:
            r1 = 0
        L_0x01f6:
            r4.append(r1)
            java.lang.String r1 = " isSecondCommentFetch="
            r4.append(r1)
            up1.w0 r1 = r0.f125422u
            if (r1 == 0) goto L_0x0203
            goto L_0x0204
        L_0x0203:
            r12 = 0
        L_0x0204:
            r4.append(r12)
            java.lang.String r1 = " scene "
            r4.append(r1)
            int r1 = r8.f135485n
            r4.append(r1)
            java.lang.String r1 = ", justUpdateObjectStatus:"
            r4.append(r1)
            r1 = r19
            r4.append(r1)
            java.lang.String r1 = ", encryptedObjectid:"
            r4.append(r1)
            r4.append(r14)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            kt1.d r1 = kt1.C46744d.Disable
            r0.f125427z = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C46547x1.<init>(long, java.lang.String, int, int, java.lang.String, boolean, pe3.b, up1.w0, long, java.lang.String, boolean, boolean, java.lang.String, te3.hj1, int, te3.j51, boolean, int, gy3.h):void");
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return this.f125427z;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        FinderContact finderContact;
        T t;
        boolean z;
        C13598b0 b0Var;
        C50008jm0 jm02 = (C50008jm0) eu32;
        C87412m.m108594g(jm02, "resp");
        super.mo332r(i, i2, str, jm02, yVar);
        Log.m105924i("Finder.CgiGetFinderFeedComment", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " resp=" + jm02 + " thread=" + Thread.currentThread() + " isNeedLoadJumperInfo: " + this.f125425x);
        if (i >= 4) {
            this.f125427z = C46744d.Default;
        }
        if (i == 0 && i2 == 0) {
            if (this.f125421t) {
                Log.m105924i("Finder.CgiGetFinderFeedComment", "need fetch object");
                FinderObject finderObject = jm02.f136184e;
                if (finderObject != null) {
                    Class cls = C58417y0.class;
                    C49712hj1 hj12 = this.f172731j;
                    if (hj12 != null) {
                        ((C58417y0) C86312j.m106911c(cls)).j80(finderObject, hj12.f134675i);
                        b0Var = C13598b0.f38549a;
                    } else {
                        b0Var = null;
                    }
                    if (b0Var == null) {
                        ((C58417y0) C86312j.m106911c(cls)).ry0(finderObject);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("contextObj.extraInfo: ");
                    C49712hj1 hj13 = this.f172731j;
                    sb.append(hj13 != null ? hj13.f134681r : null);
                    Log.m105924i("Finder.CgiGetFinderFeedComment", sb.toString());
                    if (this.f125425x) {
                        C39622i0 a = C39818r.f106831a.mo62446e(C60200t1.class).mo75002a(C62273n.class);
                        C87412m.m108593f(a, "UICProvider.of(IFinderCo…perGlobalUIC::class.java)");
                        C62273n nVar = (C62273n) a;
                        C49712hj1 hj14 = this.f172731j;
                        C62273n.m73199k3(nVar, finderObject, hj14 != null ? hj14.f134675i : 0, hj14, 0, 8, (Object) null);
                    }
                }
            }
            LinkedList<FinderCommentInfo> linkedList = jm02.f136183d;
            C87412m.m108593f(linkedList, "resp.commentInfo");
            LinkedList<FinderCommentInfo> linkedList2 = new LinkedList<>();
            for (FinderCommentInfo finderCommentInfo : linkedList) {
                Iterator<T> it = linkedList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (((FinderCommentInfo) t).commentId == finderCommentInfo.commentId) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                if (t == null) {
                    linkedList2.add(finderCommentInfo);
                } else {
                    Log.m105928w("Finder.CgiGetFinderFeedComment", "filterDuplicate " + finderCommentInfo.commentId + " content " + finderCommentInfo.content + " username " + finderCommentInfo.username);
                }
            }
            jm02.f136183d = linkedList2;
            C65426w0 w0Var = this.f125422u;
            if (w0Var != null) {
                w0Var.mo89532o2().lastBuffer = jm02.f136185f;
                if (this.f125424w) {
                    w0Var.mo89532o2().continueFlag = jm02.f136188i;
                } else {
                    w0Var.mo89532o2().upContinueFlag = jm02.f136187h;
                }
            }
            FinderObject finderObject2 = jm02.f136184e;
            if (!(finderObject2 == null || (finderContact = finderObject2.contact) == null)) {
                C58961d.C58963b.m68837m(C58961d.f168673a, finderContact, false, 2, (Object) null);
            }
            Log.m105924i("Finder.CgiGetFinderFeedComment", "[onCgiBack] feedId=" + this.f125420s + "  size=" + jm02.f136183d.size() + " commentCount=" + jm02.f136186g);
        }
    }

    /* renamed from: s */
    public List mo10027s(C49335eu3 eu32) {
        C50008jm0 jm02 = (C50008jm0) eu32;
        C87412m.m108594g(jm02, "resp");
        FinderObject finderObject = jm02.f136184e;
        return finderObject != null ? C26236u.m33719b(FinderItem.Companion.mo79056a(finderObject, 0)) : C64186f0.f181907d;
    }

    /* renamed from: t */
    public long mo10028t() {
        C49842ig0 ig02;
        C47350c cVar = this.f256789f;
        C87412m.m108593f(cVar, "reqResp");
        C47465a aVar = cVar.f127055a.f127080a;
        C49867im0 im02 = aVar instanceof C49867im0 ? (C49867im0) aVar : null;
        if (im02 == null || (ig02 = im02.f135489r) == null) {
            return 0;
        }
        return ig02.f135317i;
    }
}
