package qj1;

import android.content.Context;
import cj1.C0528d1;
import cj1.C0639y1;
import cl1.C0702z0;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ig1.C8916d;
import java.util.HashMap;
import java.util.Map;
import ok1.C62042e;
import rx3.C13598b0;
import te3.C49765hx0;
import te3.C50767p11;
import te3.C51443tt0;
import te3.C51799w81;
import te3.C52013xs0;
import y50.C53496k;

/* renamed from: qj1.p8 */
public final class C12599p8 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f36126d;

    /* renamed from: e */
    public final /* synthetic */ String f36127e;

    /* renamed from: f */
    public final /* synthetic */ int f36128f;

    /* renamed from: g */
    public final /* synthetic */ C12360e8 f36129g;

    /* renamed from: h */
    public final /* synthetic */ String f36130h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12599p8(String str, String str2, int i, C12360e8 e8Var, String str3) {
        super(0);
        this.f36126d = str;
        this.f36127e = str2;
        this.f36128f = i;
        this.f36129g = e8Var;
        this.f36130h = str3;
    }

    public Object invoke() {
        String str;
        C50767p11 p112;
        StringBuilder sb = new StringBuilder();
        sb.append("updateValidRewardMap: giftId:");
        sb.append(this.f36126d);
        sb.append(", comboId:");
        sb.append(this.f36127e);
        sb.append(", cnt:");
        sb.append(this.f36128f);
        sb.append(", previousCnt:");
        Map<String, Integer> map = this.f36129g.f35588A;
        String str2 = this.f36127e;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        sb.append(((HashMap) map).get(str2));
        sb.append(", comboIdStatus:");
        Map<String, Boolean> map2 = this.f36129g.f35589B;
        String str4 = this.f36127e;
        if (str4 == null) {
            str4 = str3;
        }
        sb.append(((HashMap) map2).get(str4));
        sb.append(", songName: ");
        sb.append(this.f36130h);
        Log.m105924i("Finder.FinderLiveGiftSendPlugin", sb.toString());
        Map<String, Integer> map3 = this.f36129g.f35588A;
        String str5 = this.f36127e;
        String str6 = str5 == null ? str3 : str5;
        if (str5 == null) {
            str5 = str3;
        }
        HashMap hashMap = (HashMap) map3;
        int i = hashMap.get(str5);
        if (i == null) {
            i = 0;
        }
        hashMap.put(str6, Integer.valueOf(((Number) i).intValue() + this.f36128f));
        Map<String, Boolean> map4 = this.f36129g.f35589B;
        String str7 = this.f36127e;
        if (str7 == null) {
            str7 = str3;
        }
        if (C87412m.m108589b(((HashMap) map4).get(str7), Boolean.TRUE)) {
            Map<String, Integer> map5 = this.f36129g.f35588A;
            String str8 = this.f36127e;
            if (str8 == null) {
                str8 = str3;
            }
            Integer num = (Integer) ((HashMap) map5).get(str8);
            if ((num != null ? num.intValue() : 0) > 0) {
                C12360e8 e8Var = this.f36129g;
                String str9 = this.f36126d;
                String str10 = this.f36127e;
                String str11 = this.f36130h;
                Integer num2 = (Integer) ((HashMap) e8Var.f35588A).get(str10 == null ? str3 : str10);
                int intValue = num2 != null ? num2.intValue() : 0;
                if (e8Var.f35600M) {
                    if (intValue > 0) {
                        if (!(str10 == null || str10.length() == 0)) {
                            C52013xs0 xs02 = new C52013xs0();
                            C49765hx0 hx02 = new C49765hx0();
                            C62042e eVar = C62042e.f176370a;
                            hx02.f134919d = eVar.mo87050W(e8Var.mo87684A0());
                            hx02.f134930r = ((C54991o) e8Var.mo87696x0(C54991o.class)).f154320h;
                            hx02.f134926n = eVar.mo87036R();
                            xs02.f144914s = hx02;
                            xs02.f144903e = 20013;
                            C0528d1 d1Var = new C0528d1(xs02);
                            d1Var.f1294d = true;
                            C51443tt0 tt02 = new C51443tt0();
                            tt02.f142388d = str9;
                            tt02.f142392h = str10;
                            tt02.f142391g = intValue;
                            C8916d d = C0639y1.f1510a.mo612d(str9);
                            tt02.f142389e = d != null ? d.mo9725p2() : null;
                            if (!(str11 == null || str11.length() == 0)) {
                                tt02.f142393i = 1;
                                C58739j4 j4Var = C58739j4.f168176a;
                                C51799w81 w812 = new C51799w81();
                                w812.f143922d = str11;
                                C13598b0 b0Var = C13598b0.f38549a;
                                tt02.f142394j = j4Var.mo83710g0(w812);
                                Log.m105924i("Finder.FinderLiveGiftSendPlugin", "addSelfGiftToComment songName: " + str11 + ",username:" + d1Var.mo571e());
                            } else {
                                Log.m105924i("Finder.FinderLiveGiftSendPlugin", "addSelfGiftToComment songName is empty,username:" + d1Var.mo571e());
                            }
                            d1Var.f1293c = tt02;
                            ((C0702z0) e8Var.mo87696x0(C0702z0.class)).f1672f.add(d1Var);
                            Log.m105924i("Finder.FinderLiveGiftSendPlugin", "addSelfGiftToComment comboCount:" + intValue + ",comboId:" + str10 + ",username:" + d1Var.mo571e());
                            C53496k.f150436a.mo74169b();
                            Context context = e8Var.f166287d.getContext();
                            Object[] objArr = new Object[3];
                            objArr[0] = d1Var.mo573g();
                            C51443tt0 tt03 = d1Var.f1293c;
                            if (tt03 == null || (p112 = tt03.f142389e) == null || (str = p112.f139515o) == null) {
                                str = str3;
                            }
                            objArr[1] = str;
                            objArr[2] = String.valueOf(intValue);
                            String string = context.getString(C0966R.string.djj, objArr);
                            C87412m.m108593f(string, "root.context.getString(\n…\", comboCount.toString())");
                            e8Var.f166287d.announceForAccessibility(string);
                        }
                    }
                    Log.m105924i("Finder.FinderLiveGiftSendPlugin", "addSelfGiftToComment comboCount:" + intValue + ",comboId:" + str10);
                }
                Map<String, Integer> map6 = this.f36129g.f35588A;
                String str12 = this.f36127e;
                if (str12 != null) {
                    str3 = str12;
                }
                ((HashMap) map6).put(str3, 0);
            }
        }
        return C13598b0.f38549a;
    }
}
