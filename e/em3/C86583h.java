package em3;

import com.tencent.p014mm.p136ui.chatting.C106691j3;
import com.tencent.p014mm.p136ui.chatting.ChattingAnimFrame;
import com.tencent.p014mm.sdk.platformtools.Log;
import dm3.C86350a;
import dm3.C86351b;
import e42.C7596h;
import e42.C86430i;
import e61.C86454b;
import fy3.C32226l;
import gy3.C87412m;
import org.json.JSONObject;
import p51.C110184g;
import rx3.C13598b0;

/* renamed from: em3.h */
public final class C86583h extends C86430i<C86351b> {
    /* renamed from: e */
    public String mo16e() {
        return "setEasterEggAnimationStatus";
    }

    /* renamed from: l */
    public boolean mo17l() {
        return true;
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C7596h hVar2;
        C87412m.m108594g(hVar, "data");
        C32226l<C7596h, C13598b0> p = mo120840p();
        T t = this.f251227a;
        C87412m.m108591d(t);
        C86351b bVar = (C86351b) t;
        int optInt = hVar.optInt("status");
        JSONObject jSONObject = hVar.getJSONObject("result");
        String optString = jSONObject.optString("eggKey");
        String optString2 = jSONObject.optString("eggId");
        long optLong = jSONObject.optLong("timeout");
        if (optLong <= 0) {
            optLong = 20000;
        }
        if (optInt > 0) {
            C87412m.m108593f(optString, "eggKey");
            if (!(optString.length() == 0)) {
                C87412m.m108593f(optString2, "eggId");
                if (!(optString2.length() == 0)) {
                    if (!C87412m.m108589b(optString2, bVar.f251060f.f251248b)) {
                        Log.m105928w("MicroMsg.MEChattingMgr", "[ME]: can't send status change because " + optString2 + " is not " + bVar.f251060f);
                    } else {
                        Log.m105924i("MicroMsg.MEChattingMgr", "[ME]: onMagicEggStatusChange: " + optInt + ' ' + optString2);
                        if (optInt == 1) {
                            bVar.f251058d.postDelayed(bVar.f251064j, optLong);
                            C86350a aVar = bVar.f251059e;
                            if (aVar != null) {
                                C86454b bVar2 = bVar.f251060f;
                                Log.m105925i("MicroMsg.EggMgr", "onStart: %s, %s", bVar2.f251248b, bVar2.f251247a);
                                C106691j3 j3Var = C106691j3.this;
                                j3Var.f318967r = true;
                                ChattingAnimFrame chattingAnimFrame = j3Var.f318951b;
                                if (chattingAnimFrame != null) {
                                    chattingAnimFrame.mo153608e();
                                }
                            }
                        } else if (optInt == 2) {
                            C86350a aVar2 = bVar.f251059e;
                            if (aVar2 != null) {
                                C86454b bVar3 = bVar.f251060f;
                                Log.m105925i("MicroMsg.EggMgr", "onClick: %s, %s", bVar3.f251248b, bVar3.f251247a);
                                C110184g.f329618a.mo161587a(4, C110184g.f329625h);
                                C106691j3 j3Var2 = C106691j3.this;
                                C106691j3.m144077a(j3Var2, j3Var2.f318965p, j3Var2.f318962m, j3Var2.f318950a, j3Var2.f318953d);
                            }
                        } else if (optInt != 3) {
                            Log.m105920e("MicroMsg.MEChattingMgr", "[ME]: onMagicEggStatusChange: wrong status: " + optInt);
                        } else {
                            bVar.mo120738l0();
                        }
                    }
                    hVar2 = mo120844i();
                    p.invoke(hVar2);
                }
            }
        }
        Log.m105920e("MicroMsg.MESetEasterEggStatus", "stevecai: set easter egg status error: " + optInt + ' ' + optString + ' ' + optString2 + ' ' + optLong);
        hVar2 = mo120842g(2, "");
        p.invoke(hVar2);
    }
}
