package wg1;

import ak1.C54067f0;
import ak1.C54116w;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import o40.C61926c;
import ok1.C62042e;
import org.json.JSONObject;

/* renamed from: wg1.y2 */
public final class C66110y2 {

    /* renamed from: a */
    public static final C66110y2 f190024a = new C66110y2();

    /* renamed from: b */
    public static int f190025b;

    /* renamed from: b */
    public static /* synthetic */ void m77912b(C66110y2 y2Var, int i, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        if ((i4 & 8) != 0) {
            z = false;
        }
        y2Var.mo90149a(i, i2, i3, z);
    }

    /* renamed from: a */
    public final void mo90149a(int i, int i2, int i3, boolean z) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        boolean N0 = C62042e.f176370a.mo87027N0();
        Log.m105924i("FinderLivePauseReportHelper", "report curType:" + f190025b + " type:" + i4 + ",time:" + i5 + ", uiState:" + i6 + ", miniWindow:" + z + ", isAnchor:" + N0);
        if (!N0 && i4 != f190025b) {
            if (i4 != 3 || C61926c.m72696u(i6, 524288) || C61926c.m72696u(i6, 32) || C61926c.m72696u(i6, 64) || C61926c.m72696u(i6, 262144)) {
                f190025b = i4;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", i4);
                jSONObject.put("times", i5);
                C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "js.toString()");
                wVar.getClass();
                C54116w.Ex0(wVar, C54067f0.C54076o0.ANCHOR_PAUSE_LIVE, jSONObject2, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
            }
        }
    }
}
