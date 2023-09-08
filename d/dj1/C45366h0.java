package dj1;

import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C46108j1;
import java.util.LinkedList;
import java.util.List;
import je1.C46523h2;
import ob0.C47350c;
import org.json.JSONObject;
import sx3.C26236u;
import sx3.C64186f0;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C49966ja;
import te3.C50704on0;
import te3.C50851pn0;
import te3.C51163rv3;
import te3.C64436i61;

/* renamed from: dj1.h0 */
public final class C45366h0 extends C45368j<C50851pn0> {

    /* renamed from: s */
    public final String f122866s;

    /* renamed from: t */
    public final JSONObject f122867t;

    /* renamed from: u */
    public final JSONObject f122868u;

    /* renamed from: v */
    public C46108j1 f122869v;

    /* renamed from: w */
    public C50704on0 f122870w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45366h0(String str, C46108j1 j1Var) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(str, "username");
        this.f122866s = "Finder.CgiFinderLiveGetLastObject";
        this.f122867t = new JSONObject();
        JSONObject jSONObject = new JSONObject();
        this.f122868u = jSONObject;
        this.f122869v = j1Var;
        C50704on0 on02 = new C50704on0();
        this.f122870w = on02;
        on02.f139263e = str;
        on02.f139262d = C46523h2.f125330a.mo71859a(6482);
        this.f122870w.f139266h = C58739j4.m68251e(C58739j4.f168176a, (C64436i61) null, (LinkedList) null, 3, (Object) null);
        jSONObject.put("username", str);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f122870w;
        C50851pn0 pn02 = new C50851pn0();
        pn02.setBaseResponse(new C49966ja());
        pn02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = pn02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findergetlatestliveobject";
        bVar.f127069d = 6482;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderLiveGetLastObject", "CgiFinderLiveGetLastObject init username:" + this.f122870w.f139263e);
    }

    /* renamed from: N */
    public JSONObject mo8506N() {
        return this.f122868u;
    }

    /* renamed from: R0 */
    public JSONObject mo8510R0() {
        return this.f122867t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0066, code lost:
        r0 = r0.liveInfo;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo332r(int r7, int r8, java.lang.String r9, te3.C49335eu3 r10, ob0.C117747y r11) {
        /*
            r6 = this;
            te3.pn0 r10 = (te3.C50851pn0) r10
            java.lang.String r0 = "resp"
            gy3.C87412m.m108594g(r10, r0)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            super.mo332r(r1, r2, r3, r4, r5)
            java.lang.String r11 = r6.f122866s
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[onCgiBack] errType="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = " errCode="
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = " errMsg="
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = " thread="
            r0.append(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            if (r7 != 0) goto L_0x0060
            if (r8 != 0) goto L_0x0060
            java.lang.String r11 = r6.f122866s
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "GetLastObject result:"
            r0.append(r1)
            org.json.JSONObject r1 = o40.C61937h.m72709h(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
        L_0x0060:
            org.json.JSONObject r11 = r6.f122867t
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r10.f139838d
            if (r0 == 0) goto L_0x0071
            te3.c21 r0 = r0.liveInfo
            if (r0 == 0) goto L_0x0071
            long r0 = r0.f182392d
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x0072
        L_0x0071:
            r0 = 0
        L_0x0072:
            java.lang.String r1 = "liveId"
            r11.put(r1, r0)
            ht1.j1 r11 = r6.f122869v
            if (r11 == 0) goto L_0x007e
            r11.mo71551a(r7, r8, r9, r10)
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dj1.C45366h0.mo332r(int, int, java.lang.String, te3.eu3, ob0.y):void");
    }

    /* renamed from: s */
    public List mo10027s(C49335eu3 eu32) {
        C50851pn0 pn02 = (C50851pn0) eu32;
        C87412m.m108594g(pn02, "resp");
        FinderObject finderObject = pn02.f139838d;
        return finderObject != null ? C26236u.m33719b(FinderItem.Companion.mo79056a(finderObject, 0)) : C64186f0.f181907d;
    }

    /* renamed from: t */
    public long mo10028t() {
        C49842ig0 ig02 = this.f122870w.f139262d;
        if (ig02 != null) {
            return ig02.f135317i;
        }
        return 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C45366h0(String str, C46108j1 j1Var, int i, C8480h hVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : j1Var);
    }
}
