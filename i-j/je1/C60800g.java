package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import jp3.C9487b;
import ob0.C47350c;
import rx3.C13604l;
import sx3.C26236u;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C52263zh0;
import te3.C64856yh0;

/* renamed from: je1.g */
public final class C60800g extends C60625c<C52263zh0> {

    /* renamed from: s */
    public long f173177s;

    /* renamed from: t */
    public long f173178t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60800g(long j, long j2, String str, int i, C49712hj1 hj12) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(str, "objectNonceId");
        C64856yh0 yh02 = new C64856yh0();
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = yh02;
        C52263zh0 zh02 = new C52263zh0();
        zh02.setBaseResponse(new C49966ja());
        bVar.f127067b = zh02;
        bVar.f127074i = 2000;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findercomment";
        bVar.f127069d = 3906;
        mo123453j(bVar.mo72403a());
        Log.m105924i("MicroMsg.Finder.CgiDeleteFinderComment", "CgiReplyFinderComment init");
        this.f173177s = j;
        this.f173178t = j2;
        Log.m105924i("MicroMsg.Finder.CgiDeleteFinderComment", "[CgiDeleteFinderComment] commentId=" + j + ')');
        C64856yh0 yh03 = new C64856yh0();
        yh03.f186518g = j;
        yh03.f186521j = 1;
        yh03.f186516e = j2;
        yh03.f186525q = str;
        yh03.f186524p = i;
        C46523h2 h2Var = C46523h2.f125330a;
        yh03.f186526r = h2Var.mo71860b(3906, hj12);
        int i2 = 0;
        yh03.f186527s = ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83281Cu(j2, hj12 != null ? hj12.f134675i : 0);
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = yh03;
        C52263zh0 zh03 = new C52263zh0();
        zh03.setBaseResponse(new C49966ja());
        bVar2.f127067b = zh03;
        bVar2.f127074i = 2000;
        h2Var.mo71865g(yh03.f186526r, C26236u.m33719b(new C13604l(Integer.valueOf(hj12 != null ? hj12.f134677n : i2), Long.valueOf(j2))), hj12);
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findercomment";
        bVar2.f127069d = 3906;
        mo123453j(bVar2.mo72403a());
        Log.m105924i("MicroMsg.Finder.CgiDeleteFinderComment", "CgiReplyFinderComment init");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x004f, code lost:
        r9 = vp1.C65834e.f189316a;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo332r(int r9, int r10, java.lang.String r11, te3.C49335eu3 r12, ob0.C117747y r13) {
        /*
            r8 = this;
            te3.zh0 r12 = (te3.C52263zh0) r12
            java.lang.String r13 = "resp"
            gy3.C87412m.m108594g(r12, r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "[onCgiBack] errType="
            r13.append(r0)
            r13.append(r9)
            java.lang.String r0 = " errCode="
            r13.append(r0)
            r13.append(r10)
            java.lang.String r0 = " errMsg="
            r13.append(r0)
            r13.append(r11)
            java.lang.String r11 = " resp="
            r13.append(r11)
            r13.append(r12)
            java.lang.String r11 = " thread="
            r13.append(r11)
            java.lang.Thread r11 = java.lang.Thread.currentThread()
            r13.append(r11)
            java.lang.String r11 = " commentId="
            r13.append(r11)
            long r0 = r8.f173177s
            r13.append(r0)
            java.lang.String r11 = r13.toString()
            java.lang.String r13 = "MicroMsg.Finder.CgiDeleteFinderComment"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r11)
            if (r9 != 0) goto L_0x00c1
            if (r10 != 0) goto L_0x00c1
            vp1.e r9 = vp1.C65834e.f189316a
            long r10 = r8.f173178t
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r9.mo89871e(r10)
            if (r10 == 0) goto L_0x00c1
            int r11 = r10.getCommentCount()
            int r11 = r11 + -1
            r10.setCommentCount(r11)
            com.tencent.mm.autogen.events.FinderExposeInfoChangeEvent r11 = new com.tencent.mm.autogen.events.FinderExposeInfoChangeEvent
            r11.<init>()
            com.tencent.mm.autogen.events.FinderExposeInfoChangeEvent$a r13 = r11.f154769d
            long r0 = r10.field_id
            r13.f154770a = r0
            int r0 = r10.getCommentCount()
            r13.f154772c = r0
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> r12 = r12.f145959g
            if (r12 == 0) goto L_0x009a
            int r13 = r12.size()
            if (r13 <= 0) goto L_0x009a
            java.util.LinkedList r13 = r10.getCommentList()
            r13.clear()
            java.util.LinkedList r13 = r10.getCommentList()
            r13.addAll(r12)
            com.tencent.mm.autogen.events.FinderExposeInfoChangeEvent$a r12 = r11.f154769d
            te3.ff1 r13 = new te3.ff1
            r13.<init>()
            java.util.LinkedList r0 = r10.getCommentList()
            r13.f133475d = r0
            r12.f154771b = r13
        L_0x009a:
            r11.publish()
            er1.w3 r1 = er1.C58784w3.f168295a
            java.util.LinkedList r2 = r10.getCommentList()
            long r3 = r10.getId()
            long r5 = r8.f173177s
            java.lang.String r7 = ""
            r1.mo83969u1(r2, r3, r5, r7)
            vp1.e$b r11 = vp1.C65834e.C65836b.f189326f
            r9.mo89878l(r10, r11)
            com.tencent.mm.autogen.events.FeedUpdateEvent r9 = new com.tencent.mm.autogen.events.FeedUpdateEvent
            r9.<init>()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r11 = r9.f9173d
            long r12 = r10.field_id
            r11.f9174a = r12
            r9.publish()
        L_0x00c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C60800g.mo332r(int, int, java.lang.String, te3.eu3, ob0.y):void");
    }
}
