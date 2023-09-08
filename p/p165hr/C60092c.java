package p165hr;

import ak1.C0077k0;
import ak1.C54064b0;
import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C7335d;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60151b;
import p185kq.C61130g;
import p204mr.C61568m;
import p565ir.C60603k;
import p749xh.C66261f3;
import t91.C64208c;
import te3.C64623p81;

@C86522b
/* renamed from: hr.c */
public final class C60092c extends C86301e implements C60603k {
    public void Pv0(String str) {
        C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        ((C54108o) C86312j.m106911c(C54108o.class)).getClass();
        C54067f0 f0Var = C54108o.f151869h;
        f0Var.getClass();
        f0Var.f151445a = str;
    }

    /* renamed from: cS */
    public void mo84959cS(long j, long j2, C60151b bVar, long j3, String str) {
        C60151b bVar2 = bVar;
        C87412m.m108594g(bVar2, C66261f3.COL_FINDEROBJECT);
        C87412m.m108594g(str, "talkerUsername");
        C54108o oVar = (C54108o) C86312j.m106911c(C54108o.class);
        C64623p81 p812 = bVar2.f171698b;
        String str2 = p812.f184779e;
        String str3 = str2 == null ? "" : str2;
        C54067f0.C54078q qVar = C54067f0.C54078q.LIVE_AUDIENCE_ENTER_LIVE_ROOM;
        long j4 = p812.f184791t == 1 ? 1 : 2;
        String str4 = C64208c.f181958h;
        String str5 = str4 == null ? "" : str4;
        String str6 = C64208c.f181959i;
        String str7 = str6 == null ? "" : str6;
        C54064b0 b0Var = r2;
        C54064b0 b0Var2 = new C54064b0(j, j2, str3, 0, -1, qVar, "temp_6", j4, j3, str5, str7, System.currentTimeMillis(), C54067f0.C54083s0.CLICK_LIVE_CARD, (String) null, (String) null, (String) null, (String) null, str, 122880, (C8480h) null);
        oVar.mo9597CB(b0Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r4 = r7.f171698b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void cp0(ht1.C60151b r7) {
        /*
            r6 = this;
            java.lang.Class<ak1.o> r0 = ak1.C54108o.class
            di3.d r1 = di3.C86312j.m106911c(r0)
            ak1.o r1 = (ak1.C54108o) r1
            ak1.f0$n r2 = ak1.C54067f0.C0066n.SHARE_SEND
            di3.d r0 = di3.C86312j.m106911c(r0)
            ak1.o r0 = (ak1.C54108o) r0
            r3 = 0
            if (r7 == 0) goto L_0x001a
            te3.p81 r4 = r7.f171698b
            if (r4 == 0) goto L_0x001a
            java.lang.String r4 = r4.f184778d
            goto L_0x001b
        L_0x001a:
            r4 = r3
        L_0x001b:
            if (r7 == 0) goto L_0x0023
            te3.p81 r7 = r7.f171698b
            if (r7 == 0) goto L_0x0023
            java.lang.String r3 = r7.f184780f
        L_0x0023:
            r0.getClass()
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.lang.String r0 = ""
            if (r4 != 0) goto L_0x0030
            r4 = r0
        L_0x0030:
            java.lang.String r5 = "liveId"
            r7.put(r5, r4)
            if (r3 != 0) goto L_0x0038
            r3 = r0
        L_0x0038:
            java.lang.String r4 = "feedId"
            r7.put(r4, r3)
            java.lang.String r3 = "share_id"
            r7.put(r3, r0)
            r1.mo9602Jz(r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p165hr.C60092c.cp0(ht1.b):void");
    }

    /* renamed from: lD */
    public void mo84961lD(long j, long j2, String str, int i, String str2) {
        ((C61130g) C86312j.m106911c(C61130g.class)).mo33246ry("temp_7");
        ((C54108o) C86312j.m106911c(C54108o.class)).oj0(j, j2, str, (long) i, 0, C54067f0.C54078q.LIVE_AUDIENCE_ENTER_LIVE_ROOM, "temp_7", "", 0);
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(\n            …ter::class.java\n        )");
        C61568m.C61569a.m72263a((C61568m) c, C0077k0.Click, str, j2, 0, "", str2, 1L, "", "", "", "", "", "", 0, 0, 24576, (Object) null);
    }
}
