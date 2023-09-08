package je1;

import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.Html5Info;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import it1.C60625c;
import java.util.Iterator;
import java.util.LinkedList;
import kt1.C46744d;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C49335eu3;
import te3.C49842ig0;
import te3.C50124kf1;
import te3.C50284lm0;
import te3.C50953qf1;
import te3.C52286zn2;
import te3.C64495km0;
import te3.C64503ky;
import te3.C64565my;
import te3.C64642py;
import te3.C64750uh0;
import te3.C64772vh0;
import te3.uc4;
import up1.C37521f;
import up1.C65426w0;
import vp1.C65834e;

/* renamed from: je1.a2 */
public final class C60795a2 extends C60625c<C50284lm0> {

    /* renamed from: s */
    public final long f173159s;

    /* renamed from: t */
    public final C89349b f173160t;

    /* renamed from: u */
    public C65426w0 f173161u;

    /* renamed from: v */
    public final boolean f173162v;

    /* renamed from: w */
    public long f173163w;

    /* renamed from: x */
    public C46744d f173164x;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0145  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C60795a2(long r20, java.lang.String r22, int r23, int r24, java.lang.String r25, pe3.C89349b r26, up1.C65426w0 r27, long r28, boolean r30, te3.C49712hj1 r31, int r32, int r33, gy3.C8480h r34) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r31
            r7 = r32
            r8 = r33
            r9 = r8 & 32
            r10 = 0
            if (r9 == 0) goto L_0x0017
            r9 = r10
            goto L_0x0019
        L_0x0017:
            r9 = r26
        L_0x0019:
            r11 = r8 & 64
            if (r11 == 0) goto L_0x001f
            r11 = r10
            goto L_0x0021
        L_0x001f:
            r11 = r27
        L_0x0021:
            r12 = r8 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x0028
            r15 = 0
            goto L_0x002a
        L_0x0028:
            r15 = r28
        L_0x002a:
            r8 = r8 & 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L_0x0030
            r8 = 1
            goto L_0x0032
        L_0x0030:
            r8 = r30
        L_0x0032:
            java.lang.String r12 = "feedUsername"
            gy3.C87412m.m108594g(r5, r12)
            r12 = 2
            r0.<init>(r6, r10, r12, r10)
            r0.f173159s = r1
            r0.f173160t = r9
            r0.f173161u = r11
            r0.f173162v = r8
            if (r11 == 0) goto L_0x004c
            long r17 = r11.mo89531n2()
            r12 = r17
            goto L_0x004e
        L_0x004c:
            r12 = 0
        L_0x004e:
            r0.f173163w = r12
            ob0.c$b r11 = new ob0.c$b
            r11.<init>()
            te3.km0 r12 = new te3.km0
            r12.<init>()
            r12.f183950f = r1
            r13 = r22
            r12.f183951g = r13
            je1.h2 r13 = je1.C46523h2.f125330a
            r14 = 11842(0x2e42, float:1.6594E-41)
            te3.ig0 r6 = r13.mo71860b(r14, r6)
            r12.f183948d = r6
            rx3.l r14 = new rx3.l
            java.lang.Integer r10 = java.lang.Integer.valueOf(r23)
            java.lang.Long r1 = java.lang.Long.valueOf(r20)
            r14.<init>(r10, r1)
            java.util.List r1 = sx3.C26236u.m33719b(r14)
            r2 = 0
            r13.mo71865g(r6, r1, r2)
            r12.f183955n = r9
            r13 = r15
            r1 = 0
            int r6 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r6 == 0) goto L_0x008a
            r12.f183954j = r13
        L_0x008a:
            long r1 = r0.f173163w
            r12.f183953i = r1
            if (r8 == 0) goto L_0x0092
            r1 = 2
            goto L_0x0093
        L_0x0092:
            r1 = 1
        L_0x0093:
            r12.f183952h = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getIdScene scene:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ", commentScene:"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Finder.CgiGetFinderGetCommentList"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            up1.f r1 = up1.C37521f.f99374d
            r1.getClass()
            pe1.c<java.lang.Integer> r1 = up1.C37521f.f99211K1
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r6 = 1
            if (r1 == r6) goto L_0x00d7
            int r1 = up1.C37521f.f99260Q
            if (r1 != r6) goto L_0x00d7
            er1.w3 r1 = er1.C58784w3.f168295a
            boolean r1 = r1.mo83899R0(r5)
            if (r1 == 0) goto L_0x00d4
            goto L_0x00da
        L_0x00d4:
            r1 = 3
            r6 = 1
            goto L_0x00e6
        L_0x00d7:
            r1 = 7
            if (r3 != r1) goto L_0x00dc
        L_0x00da:
            r6 = 1
            goto L_0x00e3
        L_0x00dc:
            r1 = 8
            r6 = 1
            if (r3 != r1) goto L_0x00e5
            if (r4 != r6) goto L_0x00e5
        L_0x00e3:
            r1 = 1
            goto L_0x00e6
        L_0x00e5:
            r1 = 2
        L_0x00e6:
            r12.f183949e = r1
            r12.f183956o = r7
            r11.f127066a = r12
            te3.lm0 r1 = new te3.lm0
            r1.<init>()
            te3.ja r3 = new te3.ja
            r3.<init>()
            r1.setBaseResponse(r3)
            te3.ja r3 = r1.getBaseResponse()
            te3.rv3 r4 = new te3.rv3
            r4.<init>()
            r3.f135956e = r4
            r11.f127067b = r1
            java.lang.String r1 = "/cgi-bin/micromsg-bin/findergetcommentlist"
            r11.f127068c = r1
            r1 = 11842(0x2e42, float:1.6594E-41)
            r11.f127069d = r1
            ob0.c r1 = r11.mo72403a()
            r0.mo123453j(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "init pullScene:"
            r1.append(r3)
            r1.append(r7)
            java.lang.String r3 = ", feedId="
            r1.append(r3)
            java.lang.String r3 = o40.C61926c.m72691p(r20)
            r1.append(r3)
            java.lang.String r3 = " lastBuffer="
            r1.append(r3)
            r3 = 0
            if (r9 == 0) goto L_0x0138
            r4 = 1
            goto L_0x0139
        L_0x0138:
            r4 = 0
        L_0x0139:
            r1.append(r4)
            java.lang.String r4 = " isSecondCommentFetch="
            r1.append(r4)
            up1.w0 r4 = r0.f173161u
            if (r4 == 0) goto L_0x0146
            r3 = 1
        L_0x0146:
            r1.append(r3)
            java.lang.String r3 = " scene "
            r1.append(r3)
            int r3 = r12.f183956o
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            kt1.d r1 = kt1.C46744d.Disable
            r0.f173164x = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C60795a2.<init>(long, java.lang.String, int, int, java.lang.String, pe3.b, up1.w0, long, boolean, te3.hj1, int, int, gy3.h):void");
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return this.f173164x;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        T t;
        boolean z;
        C50284lm0 lm02 = (C50284lm0) eu32;
        C87412m.m108594g(lm02, "resp");
        Log.m105924i("Finder.CgiGetFinderGetCommentList", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " resp=" + lm02 + " thread=" + Thread.currentThread());
        C47350c cVar = this.f256789f;
        int i3 = cVar.f127058d;
        C47465a aVar = cVar.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetCommentListRequest");
        C49842ig0 ig02 = ((C64495km0) aVar).f183948d;
        C65834e.C65835a aVar2 = new C65834e.C65835a(i3, ig02 != null ? ig02.f135317i : 0);
        C50953qf1 qf12 = lm02.f137518j;
        if (qf12 != null) {
            C65834e eVar = C65834e.f189316a;
            long j = this.f173159s;
            eVar.getClass();
            FinderItem e = eVar.mo89871e(j);
            if (e != null) {
                FinderItem.C56324a aVar3 = FinderItem.Companion;
                FinderObject finderObject = new FinderObject();
                finderObject.parseFrom(e.getFeedObject().toByteArray());
                C50124kf1 kf12 = finderObject.object_extend;
                if (kf12 != null) {
                    kf12.f136757s = qf12;
                }
                eVar.mo89878l(aVar3.mo79056a(finderObject, 0), aVar2);
            }
        }
        if (i >= 4) {
            this.f173164x = C46744d.Default;
        }
        if (i == 0 && i2 == 0) {
            LinkedList<FinderCommentInfo> linkedList = lm02.f137512d;
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
                    Log.m105928w("Finder.CgiGetFinderGetCommentList", "filterDuplicate " + finderCommentInfo.commentId + " content " + finderCommentInfo.content + " username " + finderCommentInfo.username);
                }
            }
            lm02.f137512d = linkedList2;
            C65426w0 w0Var = this.f173161u;
            if (w0Var != null) {
                w0Var.mo89532o2().lastBuffer = lm02.f137514f;
                if (this.f173162v) {
                    w0Var.mo89532o2().continueFlag = lm02.f137516h;
                } else {
                    w0Var.mo89532o2().upContinueFlag = lm02.f137515g;
                }
            }
            C37521f.f99374d.getClass();
            if (C37521f.f99236M8.mo60266n().intValue() == 1 && this.f173160t == null && lm02.f137512d.size() > 5) {
                LinkedList<FinderCommentInfo> linkedList3 = lm02.f137512d;
                FinderCommentInfo finderCommentInfo2 = new FinderCommentInfo();
                finderCommentInfo2.commentId = 1111111111;
                finderCommentInfo2.comment_type = 1;
                finderCommentInfo2.content = "新年打开百事，把乐带回家！";
                finderCommentInfo2.headUrl = "https://p2.itc.cn/q_70/images03/20210602/aba4da2697d3456caeba09726f7b2861.png";
                finderCommentInfo2.username = "";
                finderCommentInfo2.nickname = "百事可乐";
                C64772vh0 vh02 = new C64772vh0();
                FinderJumpInfo finderJumpInfo = new FinderJumpInfo();
                finderJumpInfo.jumpinfo_type = 2;
                Html5Info html5Info = new Html5Info();
                html5Info.url = "https://www.baidu.com";
                html5Info.style = 1;
                finderJumpInfo.html5_info = html5Info;
                LinkedList<uc4> linkedList4 = finderJumpInfo.style;
                uc4 uc4 = new uc4();
                uc4.f142760f = 12;
                uc4.f142761g = true;
                uc4.f142762h = 2;
                uc4.f142763i = true;
                C52286zn2 zn22 = new C52286zn2();
                zn22.f146128e = "打开百事可乐官方小程序";
                zn22.f146127d = "https://dldir1.qq.com/weixin/checkresupdate/icons_filled_music_dbffd75457b5423684dbbd330c2e3117.png";
                uc4.f142766o = zn22;
                linkedList4.add(uc4);
                vh02.f185886d = finderJumpInfo;
                LinkedList<C64750uh0> linkedList5 = new LinkedList<>();
                C64750uh0 uh02 = new C64750uh0();
                uh02.f185740d = 21;
                uh02.f185741e = "内容重复";
                linkedList5.add(uh02);
                C64750uh0 uh03 = new C64750uh0();
                uh03.f185740d = 22;
                uh03.f185741e = "不喜欢该广告";
                linkedList5.add(uh03);
                C64750uh0 uh04 = new C64750uh0();
                uh04.f185740d = 23;
                uh04.f185741e = "对此内容不感兴趣";
                linkedList5.add(uh04);
                vh02.f185892j = linkedList5;
                finderCommentInfo2.advertisement_info = vh02;
                finderCommentInfo2.content_type = 3;
                C64503ky kyVar = new C64503ky();
                LinkedList<C64642py> linkedList6 = kyVar.f183997f;
                C64642py pyVar = new C64642py();
                pyVar.f184916d = "http://playertest-75538.gzc.vod.tencent-cloud.com/mp4/h264_definition_source/h264_864_486.mp4";
                pyVar.f184920h = 1920;
                pyVar.f184921i = 1080;
                linkedList6.add(pyVar);
                LinkedList<C64565my> linkedList7 = kyVar.f183996e;
                C64565my myVar = new C64565my();
                myVar.f184403d = "https://www.smartm.com.tw/data/Images/31/3d/a4/7e/4142152402dc1f8d3d667d5.jpg";
                myVar.f184405f = 1920;
                myVar.f184406g = 1080;
                linkedList7.add(myVar);
                finderCommentInfo2.content_info = kyVar;
                C13598b0 b0Var = C13598b0.f38549a;
                linkedList3.add(5, finderCommentInfo2);
            }
            Log.m105924i("Finder.CgiGetFinderGetCommentList", "[onCgiBack] feedId=" + this.f173159s + "  size=" + lm02.f137512d.size() + ' ');
        }
    }
}
