package lm1;

import bl3.C39818r;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager;
import com.tencent.p014mm.plugin.finder.nearby.live.NearbyLiveFeedLoader;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import er1.C58739j4;
import gy3.C8480h;
import gy3.C87412m;
import it1.C9251d;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import je1.C46523h2;
import jp3.C9487b;
import ln1.C10583e;
import o40.C61926c;
import ob0.C47350c;
import os1.C62153d;
import p565ir.C60606n;
import pe3.C47465a;
import rx3.C13604l;
import sx3.C36907w;
import te3.C49173do1;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C49886ir0;
import te3.C49966ja;
import te3.C50026jr0;
import te3.C50045jw0;
import te3.C50168kr0;
import te3.C50185kw0;
import te3.C51163rv3;
import te3.C51942x91;
import te3.C64436i61;
import te3.C64858yi1;
import te3.C90420iq;
import vc1.C37715b;

/* renamed from: lm1.a */
public final class C10542a extends C9251d<C50026jr0> {

    /* renamed from: v */
    public static boolean f31819v;

    /* renamed from: s */
    public final NearbyLiveFeedLoader.C3277c f31820s;

    /* renamed from: t */
    public final C10543a f31821t;

    /* renamed from: u */
    public NearbyLiveFeedLoader.C3273a f31822u;

    /* renamed from: lm1.a$a */
    public interface C10543a {
        /* renamed from: N0 */
        void mo10814N0(int i, int i2, String str, C50026jr0 jr02, NearbyLiveFeedLoader.C3277c cVar, C90420iq iqVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10542a(NearbyLiveFeedLoader.C3277c cVar, C10543a aVar, NearbyLiveFeedLoader.C3273a aVar2, C49712hj1 hj12) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        C50045jw0 jw02;
        Class cls = FinderCommonFeatureService.class;
        C87412m.m108594g(cVar, "userRequest");
        C87412m.m108594g(aVar, "callback");
        Integer num = null;
        this.f31820s = cVar;
        this.f31821t = aVar;
        this.f31822u = aVar2;
        boolean z = false;
        f31819v = false;
        C47350c.C47352b bVar = new C47350c.C47352b();
        C49886ir0 ir02 = new C49886ir0();
        C13604l<Float, Float> X0 = ((C62153d) C39818r.f106831a.mo62446e(cls).mo75002a(C62153d.class)).mo9104X0();
        C49842ig0 a = C46523h2.f125330a.mo71859a(4026);
        a.f135313e = cVar.f15565f;
        ir02.f135606d = a;
        ir02.f135608f = ((Number) X0.f38555d).floatValue();
        ir02.f135609g = ((Number) X0.f38556e).floatValue();
        ir02.f135607e = cVar.f15562c;
        int i = cVar.f15560a;
        ir02.f135612j = i;
        ir02.f135621v = cVar.f15566g;
        ir02.f135622w = cVar.f15567h;
        ir02.f135623x = cVar.f15568i;
        C51942x91 x912 = cVar.f15561b;
        if (x912 != null) {
            ir02.f135616q = x912;
        }
        if (i == 1) {
            C10583e eVar = C10583e.f31911a;
            if (eVar.mo10835c(cVar.f15565f)) {
                ir02.f135614o.addAll(eVar.mo10834b(cVar.f15565f));
                LinkedList<C49173do1> linkedList = ir02.f135615p;
                int i2 = cVar.f15565f;
                linkedList.addAll(eVar.mo10833a(i2, i2 != 15 ? i2 != 80 ? 1001 : 1004 : 1002));
            }
        }
        C58739j4 j4Var = C58739j4.f168176a;
        ir02.f135624y = j4Var.mo83698a();
        ir02.f135625z = ((C60606n) C86312j.m106911c(C60606n.class)).Q30() ^ true ? 1 : 0;
        ir02.f135611i = C58739j4.m68251e(j4Var, (C64436i61) null, (LinkedList) null, 3, (Object) null);
        int i3 = cVar.f15565f;
        if (i3 == 9500001 || i3 == 9500002 || i3 == 9500004 || i3 == 9500003) {
            Log.m105924i("Finder.CgiNearbyLiveFeedStream", "buildRedDotRequest return for in operation game.");
        } else {
            int i4 = cVar.f15560a;
            if (i4 == 1 || i4 == 0 || i4 == 11 || i4 == 12 || i4 == 14 || i4 == 15) {
                FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0();
                C64858yi1 s = Nx0.mo77279s("NearbyLiveTab");
                boolean z2 = s != null;
                C50168kr0 kr02 = new C50168kr0();
                ir02.f135618s = kr02;
                if (s != null) {
                    kr02.f136997d = s.f186549g;
                    kr02.f136998e = s.f186554o;
                    kr02.f136999f = s.f186553n;
                    if (C37715b.f99914a.mo61298a()) {
                        kr02.f137000g = "FinderLiveEntrance";
                    } else {
                        kr02.f137000g = "NearbyEntrance";
                    }
                } else {
                    C55718s0 G5 = Nx0.mo77227G5("NearbyLiveTab");
                    if (G5 != null) {
                        C64858yi1 yi12 = G5.f158585F;
                        kr02.f136997d = yi12.f186549g;
                        kr02.f136998e = yi12.f186554o;
                        kr02.f136999f = yi12.f186553n;
                        kr02.f137000g = "NearbyLiveTab";
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("[buildRedDotRequest] pullType:");
                sb.append(cVar.f15560a);
                sb.append(" isEnterRequest=");
                sb.append(z2);
                sb.append(" tab_tips_path=");
                sb.append(kr02.f137000g);
                sb.append("  tabTipsByPassInfo=");
                sb.append(kr02.f136999f != null ? true : z);
                sb.append(" objectId=");
                sb.append(C61926c.m72691p(kr02.f136997d));
                sb.append(' ');
                Log.m105924i("Finder.CgiNearbyLiveFeedStream", sb.toString());
            }
        }
        bVar.f127066a = ir02;
        C50026jr0 jr02 = new C50026jr0();
        jr02.setBaseResponse(new C49966ja());
        jr02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = jr02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlbslivestream";
        bVar.f127069d = 4026;
        mo123453j(bVar.mo72403a());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("[CgiFetchFinderTimeline#init] commentScene:");
        sb4.append(cVar.f15565f);
        sb4.append(", pullType=");
        sb4.append(cVar.f15560a);
        sb4.append(", only_follow_feed:");
        sb4.append(cVar.f15567h);
        sb4.append(" longitude=");
        sb4.append(ir02.f135608f);
        sb4.append(" latitude=");
        sb4.append(ir02.f135609g);
        sb4.append(" tabInfo:");
        C51942x91 x913 = ir02.f135616q;
        sb4.append(x913 != null ? Integer.valueOf(x913.f144531d) : null);
        sb4.append(" - ");
        C51942x91 x914 = ir02.f135616q;
        sb4.append(x914 != null ? x914.f144532e : null);
        sb4.append(" related_object_id:");
        sb4.append(ir02.f135623x);
        sb4.append(",lastBuffer:");
        sb4.append(ir02.f135607e);
        sb4.append(",speed=");
        C50185kw0 kw02 = ir02.f135624y;
        if (!(kw02 == null || (jw02 = kw02.f137066d) == null)) {
            num = Integer.valueOf(jw02.f136359d);
        }
        sb4.append(num);
        sb4.append(" need_banner_card_style:");
        sb4.append(ir02.f135625z);
        Log.m105924i("Finder.CgiNearbyLiveFeedStream", sb4.toString());
    }

    public void dead() {
        super.dead();
        this.f31822u = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x010e, code lost:
        r15 = (r15 = r15.getReqResp()).getRespObj();
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo332r(int r11, int r12, java.lang.String r13, te3.C49335eu3 r14, ob0.C117747y r15) {
        /*
            r10 = this;
            te3.jr0 r14 = (te3.C50026jr0) r14
            java.lang.String r0 = "resp"
            gy3.C87412m.m108594g(r14, r0)
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            super.mo332r(r1, r2, r3, r4, r5)
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[onCgiBack] pullType="
            r0.append(r1)
            com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader$c r1 = r10.f31820s
            int r1 = r1.f15560a
            r0.append(r1)
            java.lang.String r1 = " errType="
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = " errCode="
            r0.append(r1)
            r0.append(r12)
            java.lang.String r2 = " errMsg="
            r0.append(r2)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            java.lang.String r9 = "Finder.CgiNearbyLiveFeedStream"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader$a r0 = r10.f31822u
            r3 = 1
            if (r0 == 0) goto L_0x0052
            boolean r0 = r0.mo2804a(r11, r12, r13, r14)
            if (r0 != r3) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r3 = 0
        L_0x0053:
            r0 = 0
            if (r3 == 0) goto L_0x0080
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "task:"
            r11.append(r12)
            com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader$a r12 = r10.f31822u
            if (r12 == 0) goto L_0x006f
            u60.l r12 = r12.f15548b
            if (r12 == 0) goto L_0x006f
            int r12 = r12.f39521h
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
        L_0x006f:
            r11.append(r0)
            java.lang.String r12 = " has consume."
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r11)
            goto L_0x01c1
        L_0x0080:
            if (r11 != 0) goto L_0x0106
            if (r12 != 0) goto L_0x0106
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r3 = r14.f136265d
            int r3 = r3.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[onCgiBack#streamCgi] errType="
            r4.append(r5)
            r4.append(r11)
            r4.append(r1)
            r4.append(r12)
            r4.append(r2)
            r4.append(r13)
            java.lang.String r1 = " hasMore:"
            r4.append(r1)
            int r1 = r14.f136267f
            r4.append(r1)
            java.lang.String r1 = " list="
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = " pullType="
            r4.append(r1)
            com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader$c r1 = r10.f31820s
            int r1 = r1.f15560a
            r4.append(r1)
            r1 = 32
            r4.append(r1)
            je1.g2 r1 = je1.C9311g2.f29093a
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r2 = r14.f136265d
            java.lang.String r1 = r1.mo10062a(r2)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r1 = r14.f136265d
            java.lang.String r2 = "resp.`object`"
            gy3.C87412m.m108593f(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x00e3:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0106
            java.lang.Object r2 = r1.next()
            com.tencent.mm.protocal.protobuf.FinderObject r2 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r2
            java.lang.String r3 = "it"
            gy3.C87412m.m108593f(r2, r3)
            te3.hj1 r3 = r10.f172731j
            if (r3 == 0) goto L_0x00e3
            java.lang.Class<dp1.y0> r4 = dp1.C58417y0.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            dp1.y0 r4 = (dp1.C58417y0) r4
            int r3 = r3.f134675i
            r4.j80(r2, r3)
            goto L_0x00e3
        L_0x0106:
            if (r15 == 0) goto L_0x011a
            com.tencent.mm.network.u r15 = r15.getReqResp()
            if (r15 == 0) goto L_0x011a
            qe3.w$e r15 = r15.getRespObj()
            if (r15 == 0) goto L_0x011a
            te3.iq r15 = r15.getProfile()
            r6 = r15
            goto L_0x011b
        L_0x011a:
            r6 = r0
        L_0x011b:
            if (r6 == 0) goto L_0x017a
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "profile time\nstartConnectTime: "
            r15.append(r0)
            long r0 = r6.f259600d
            r15.append(r0)
            java.lang.String r0 = " \nconnectSuccessfulTime："
            r15.append(r0)
            long r0 = r6.f259601e
            r15.append(r0)
            java.lang.String r0 = " \nstartHandshakeTime："
            r15.append(r0)
            long r0 = r6.f259602f
            r15.append(r0)
            java.lang.String r0 = " \nhandshakeSuccessfulTime："
            r15.append(r0)
            long r0 = r6.f259603g
            r15.append(r0)
            java.lang.String r0 = " \nstartSendPacketTime："
            r15.append(r0)
            long r0 = r6.f259604h
            r15.append(r0)
            java.lang.String r0 = " \nstartReadPacketTime："
            r15.append(r0)
            long r0 = r6.f259605i
            r15.append(r0)
            java.lang.String r0 = " \nreadPacketFinishedTime： "
            r15.append(r0)
            long r0 = r6.f259606j
            r15.append(r0)
            java.lang.String r0 = " \ntaskStartTime："
            r15.append(r0)
            long r0 = r6.f259607n
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r15)
            goto L_0x017f
        L_0x017a:
            java.lang.String r15 = "profile is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r15)
        L_0x017f:
            boolean r15 = r14.f136274p
            f31819v = r15
            int r15 = r14.f136271j
            int r15 = r15 * 1000
            jn1.C9479b.f29571u = r15
            lm1.a$a r0 = r10.f31821t
            com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader$c r5 = r10.f31820s
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r0.mo10814N0(r1, r2, r3, r4, r5, r6)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "[onCgiBack] Cost="
            r11.append(r12)
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 - r7
            r11.append(r12)
            java.lang.String r12 = "ms prefech_min_interval:"
            r11.append(r12)
            int r12 = jn1.C9479b.f29571u
            r11.append(r12)
            java.lang.String r12 = " skip_feeds_report:"
            r11.append(r12)
            boolean r12 = f31819v
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r11)
        L_0x01c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lm1.C10542a.mo332r(int, int, java.lang.String, te3.eu3, ob0.y):void");
    }

    /* renamed from: s */
    public List mo10027s(C49335eu3 eu32) {
        C50026jr0 jr02 = (C50026jr0) eu32;
        C87412m.m108594g(jr02, "resp");
        LinkedList<FinderObject> linkedList = jr02.f136265d;
        C87412m.m108593f(linkedList, "resp.`object`");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (FinderObject finderObject : linkedList) {
            FinderItem.C56324a aVar = FinderItem.Companion;
            C87412m.m108593f(finderObject, LocaleUtil.ITALIAN);
            arrayList.add(aVar.mo79056a(finderObject, 0));
        }
        return arrayList;
    }

    /* renamed from: t */
    public long mo10028t() {
        C49842ig0 ig02;
        C47465a aVar = this.f256789f.f127055a.f127080a;
        C49886ir0 ir02 = aVar instanceof C49886ir0 ? (C49886ir0) aVar : null;
        if (ir02 == null || (ig02 = ir02.f135606d) == null) {
            return 0;
        }
        return ig02.f135317i;
    }
}
