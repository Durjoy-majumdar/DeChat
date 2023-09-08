package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import it1.C60628i;
import jm2.C117361f;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C89349b;
import rx3.C13604l;
import sx3.C26236u;
import tc2.C118418g;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C49966ja;
import te3.C51018qv3;
import te3.C52263zh0;
import te3.C64854ye0;
import te3.C64856yh0;
import te3.lx4;
import up1.C37521f;
import up1.C65426w0;
import zc1.C66785b;

/* renamed from: je1.y4 */
public final class C60816y4 extends C60628i {

    /* renamed from: g */
    public C47350c f173213g;

    /* renamed from: h */
    public C11385n f173214h;

    /* renamed from: i */
    public final C65426w0 f173215i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60816y4(C65426w0 w0Var, C49712hj1 hj12) {
        super(hj12);
        C87412m.m108594g(w0Var, "unsentComment");
        C64856yh0 yh02 = new C64856yh0();
        this.f173215i = w0Var;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = yh02;
        C52263zh0 zh02 = new C52263zh0();
        zh02.setBaseResponse(new C49966ja());
        bVar.f127067b = zh02;
        bVar.f127074i = 30000;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findercomment";
        bVar.f127069d = 3906;
        this.f173213g = bVar.mo72403a();
        yh02.f186515d = C66785b.f191882e.mo90662O5();
        C37521f.f99374d.getClass();
        yh02.f186516e = w0Var.field_feedId;
        String str = w0Var.field_objectNonceId;
        yh02.f186525q = str == null ? "" : str;
        yh02.f186520i = w0Var.mo89543y2();
        yh02.f186517f = w0Var.getContent();
        yh02.f186519h = w0Var.mo89541w2();
        yh02.f186522n = w0Var.mo89530m2();
        yh02.f186524p = w0Var.field_scene;
        yh02.f186523o = w0Var.field_actionInfo.f186500h;
        int i = 0;
        yh02.f186521j = 0;
        C46523h2 h2Var = C46523h2.f125330a;
        yh02.f186526r = h2Var.mo71860b(3906, hj12);
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
        long j = w0Var.field_feedId;
        C49842ig0 ig02 = yh02.f186526r;
        yh02.f186527s = y0Var.mo83281Cu(j, ig02 != null ? ig02.f135313e : 0);
        C64854ye0 ye02 = w0Var.field_actionInfo;
        yh02.f186528t = ye02.f186504o;
        yh02.f186529u = ye02.f186505p;
        yh02.f186530v = w0Var.f188280Q;
        yh02.f186531w = w0Var.f188281R;
        Log.m105924i("Finder.NetSceneReplyFinderComment", "commentPastedList = " + yh02.f186530v);
        C49842ig0 ig03 = yh02.f186526r;
        h2Var.mo71865g(ig03, C26236u.m33719b(new C13604l(Integer.valueOf(ig03 != null ? ig03.f135313e : i), Long.valueOf(yh02.f186516e))), hj12);
        if (yh02.f186521j == 0) {
            lx4 lx4 = new lx4();
            C51018qv3 qv32 = new C51018qv3();
            qv32.mo73350k(C118418g.INSTANCE.mo175821hd());
            lx4.f354117f = qv32;
            C49842ig0 ig04 = yh02.f186526r;
            if (ig04 != null) {
                ig04.f135314f = new C89349b(lx4.toByteArray());
            }
            C117361f.INSTANCE.mo182041q(540999689);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CgiReplyFinderComment init, localId:");
        sb.append(w0Var.field_localCommentId);
        sb.append(", clientId:");
        sb.append(w0Var.mo89530m2());
        sb.append(", feedId:");
        sb.append(w0Var.field_feedId);
        sb.append(" commentScene:");
        C49842ig0 ig05 = yh02.f186526r;
        sb.append(ig05 != null ? Integer.valueOf(ig05.f135313e) : null);
        Log.m105924i("Finder.NetSceneReplyFinderComment", sb.toString());
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f173214h = nVar;
        return dispatch(gVar, this.f173213g, this);
    }

    public int getType() {
        return 3906;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x006b, code lost:
        r6 = vp1.C65834e.f189316a;
     */
    /* renamed from: k1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8516k1(int r18, int r19, int r20, java.lang.String r21, com.tencent.p014mm.network.C114799u r22, byte[] r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r19)
            r6 = 0
            r4[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r20)
            r6 = 1
            r4[r6] = r5
            r5 = 2
            r4[r5] = r3
            java.lang.String r7 = "Finder.NetSceneReplyFinderComment"
            java.lang.String r8 = "errType %d, errCode %d, errMsg %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r4)
            if (r1 != 0) goto L_0x00f2
            if (r2 != 0) goto L_0x00f2
            kj2.d r9 = kj2.C117407d.INSTANCE
            r10 = 1279(0x4ff, double:6.32E-321)
            r12 = 15
            r14 = 1
            r16 = 0
            r9.idkeyStat(r10, r12, r14, r16)
            ob0.c r4 = r0.f173213g
            ob0.c$d r4 = r4.f127056b
            pe3.a r4 = r4.f127083a
            java.lang.String r6 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderCommentResponse"
            gy3.C87412m.m108592e(r4, r6)
            te3.zh0 r4 = (te3.C52263zh0) r4
            up1.w0 r6 = r0.f173215i
            long r8 = eb0.C31543z5.m39451a()
            r10 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 / r10
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r6 = r6.mo89532o2()
            r6.createtime = r8
            up1.w0 r6 = r0.f173215i
            long r8 = r4.f145956d
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r6 = r6.mo89532o2()
            r6.commentId = r8
            up1.w0 r6 = r0.f173215i
            java.util.LinkedList<java.lang.String> r6 = r6.f188280Q
            if (r6 == 0) goto L_0x0063
            r6.clear()
        L_0x0063:
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> r4 = r4.f145959g
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r4)
            if (r6 != 0) goto L_0x00ed
            vp1.e r6 = vp1.C65834e.f189316a
            up1.w0 r8 = r0.f173215i
            long r8 = r8.field_feedId
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r6.mo89871e(r8)
            if (r8 == 0) goto L_0x00ed
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "add CommentCount on "
            r9.append(r10)
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r8.getFeedObject()
            int r10 = r10.hashCode()
            r9.append(r10)
            java.lang.String r10 = ", "
            r9.append(r10)
            long r11 = r8.getId()
            r9.append(r11)
            r9.append(r10)
            int r10 = r8.getCommentCount()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r9)
            java.util.LinkedList r9 = r8.getCommentList()
            r9.clear()
            java.util.LinkedList r9 = r8.getCommentList()
            r9.addAll(r4)
            com.tencent.mm.autogen.events.FinderExposeInfoChangeEvent r4 = new com.tencent.mm.autogen.events.FinderExposeInfoChangeEvent
            r4.<init>()
            com.tencent.mm.autogen.events.FinderExposeInfoChangeEvent$a r9 = r4.f154769d
            long r10 = r8.field_id
            r9.f154770a = r10
            te3.ff1 r10 = new te3.ff1
            r10.<init>()
            java.util.LinkedList r11 = r8.getCommentList()
            r10.f133475d = r11
            r9.f154771b = r10
            r4.publish()
            java.lang.String r4 = "update expose commentList, add"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
            vp1.e$b r4 = vp1.C65834e.C65836b.f189324d
            r6.mo89878l(r8, r4)
            com.tencent.mm.autogen.events.FeedUpdateEvent r4 = new com.tencent.mm.autogen.events.FeedUpdateEvent
            r4.<init>()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r6 = r4.f9173d
            long r7 = r8.field_id
            r6.f9174a = r7
            r6.f9175b = r5
            r4.publish()
        L_0x00ed:
            up1.w0 r4 = r0.f173215i
            r4.field_state = r5
            goto L_0x0102
        L_0x00f2:
            kj2.d r7 = kj2.C117407d.INSTANCE
            r8 = 1279(0x4ff, double:6.32E-321)
            r10 = 16
            r12 = 1
            r14 = 0
            r7.idkeyStat(r8, r10, r12, r14)
            up1.w0 r4 = r0.f173215i
            r4.field_state = r6
        L_0x0102:
            ot1.a r4 = ot1.C11767a.f34453a
            r4.mo11664f(r1, r2, r3)
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6 = 2131826307(0x7f111683, float:1.9285495E38)
            java.lang.String r5 = r5.getString(r6)
            r4.mo11662d(r1, r2, r5)
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6 = 2131826306(0x7f111682, float:1.9285493E38)
            java.lang.String r5 = r5.getString(r6)
            r4.mo11663e(r1, r2, r5)
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r4 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            com.tencent.mm.plugin.FinderCommonFeatureService r4 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r4
            up1.c r5 = r4.Ex0()
            up1.w0 r4 = r0.f173215i
            long r6 = r4.field_feedId
            long r8 = r4.mo89531n2()
            up1.w0 r13 = r0.f173215i
            long r10 = r13.field_localCommentId
            java.lang.String[] r4 = up1.C65412c.f188250f
            r12 = 2
            r5.mo89493Lo(r6, r8, r10, r12, r13)
            ob0.n r4 = r0.f173214h
            if (r4 == 0) goto L_0x0148
            r4.onSceneEnd(r1, r2, r3, r0)
        L_0x0148:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C60816y4.mo8516k1(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }
}
