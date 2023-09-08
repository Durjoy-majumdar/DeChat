package yf0;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import lp3.C46888b;
import lp3.C88643g;
import ob0.C11385n;
import ob0.C117747y;
import te3.C77903a;
import te3.C77910c0;
import te3.C77937h;
import te3.C77948j;
import te3.C77962l;
import zf0.C79324f;
import zf0.C79325g;
import zf0.C79326h;

/* renamed from: yf0.l */
public class C79105l implements C11385n {

    /* renamed from: d */
    public boolean f232260d = false;

    /* renamed from: e */
    public int f232261e = 0;

    /* renamed from: f */
    public Map<String, Object> f232262f;

    /* renamed from: g */
    public C46888b f232263g;

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.LaunchAALogic", "onSceneEnd, errType: %s, errCode: %s, scene: %s, mode: %s", Integer.valueOf(i), Integer.valueOf(i2), yVar, Integer.valueOf(this.f232261e));
        if (yVar.getType() == 1624) {
            this.f232260d = false;
            if (i == 0 && i2 == 0) {
                C79324f fVar = (C79324f) yVar;
                C77937h hVar = fVar.f232875f;
                Object[] objArr = new Object[4];
                objArr[0] = Integer.valueOf(hVar.f227520d);
                objArr[1] = hVar.f227521e;
                objArr[2] = Boolean.valueOf(hVar.f227523g == null);
                objArr[3] = hVar.f227522f;
                Log.m105925i("MicroMsg.LaunchAALogic", "launchAAByMoney, onSceneEnd, retCode: %s, retmsg: %s, msgXml==null: %s, billNo: %s", objArr);
                int i3 = hVar.f227520d;
                if (i3 == 0) {
                    String str2 = hVar.f227523g;
                    if (str2 != null) {
                        C79104i.m95671p(hVar.f227522f, fVar.f232877h, str2);
                        C88643g.m110553k(this.f232263g, Boolean.TRUE);
                    } else {
                        C79104i.m95668m(hVar.f227522f, false, 0);
                        C88643g.m110553k(this.f232263g, Boolean.TRUE);
                    }
                    C79104i.m95657b(fVar.f232877h);
                    C115669n.INSTANCE.idkeyStat(407, 0, 1, false);
                    return;
                }
                C46888b bVar = this.f232263g;
                if (bVar != null) {
                    if (i3 > 0) {
                        C77910c0 c0Var = hVar.f227524h;
                        if (c0Var == null || c0Var.f227110d <= 0) {
                            C77903a aVar = hVar.f227525i;
                            if (aVar != null && aVar.f226964d == 1 && !Util.isNullOrNil(aVar.f226968h) && !Util.isNullOrNil(hVar.f227525i.f226966f) && !Util.isNullOrNil(hVar.f227525i.f226967g) && !Util.isNullOrNil(hVar.f227525i.f226965e)) {
                                this.f232263g.mo72091a(hVar.f227525i);
                            } else if (!Util.isNullOrNil(hVar.f227521e)) {
                                this.f232263g.mo72091a(hVar.f227521e);
                            } else {
                                this.f232263g.mo72091a(Boolean.FALSE);
                            }
                        } else {
                            bVar.mo72091a(c0Var);
                        }
                    } else {
                        bVar.mo72091a(Boolean.FALSE);
                    }
                }
                C115669n.INSTANCE.idkeyStat(407, 2, 1, false);
                return;
            }
            C46888b bVar2 = this.f232263g;
            if (bVar2 != null) {
                bVar2.mo72091a(Boolean.FALSE);
            }
            C115669n.INSTANCE.idkeyStat(407, 1, 1, false);
        } else if (yVar.getType() == 1655) {
            this.f232260d = false;
            if (i == 0 && i2 == 0) {
                C79325g gVar = (C79325g) yVar;
                C77962l lVar = gVar.f232880f;
                Object[] objArr2 = new Object[3];
                objArr2[0] = Integer.valueOf(lVar.f227785d);
                objArr2[1] = lVar.f227786e;
                objArr2[2] = Boolean.valueOf(lVar.f227788g == null);
                Log.m105925i("MicroMsg.LaunchAALogic", "launchAAByPerson, onSceneEnd, retCode: %s, retmsg: %s, msgxml==null: %s", objArr2);
                Log.m105919d("MicroMsg.LaunchAALogic", "launchAAByPerson, onSceneEnd, retMsg: %s, billNo: %s", lVar.f227786e, lVar.f227787f);
                int i4 = lVar.f227785d;
                if (i4 == 0) {
                    String str3 = lVar.f227788g;
                    if (str3 != null) {
                        C79104i.m95671p(lVar.f227787f, gVar.f232882h, str3);
                        C88643g.m110553k(this.f232263g, Boolean.TRUE, lVar.f227787f);
                    } else {
                        C79104i.m95668m(lVar.f227787f, false, 0);
                        C88643g.m110553k(this.f232263g, Boolean.TRUE, lVar.f227787f);
                    }
                    C79104i.m95657b(gVar.f232882h);
                    C115669n.INSTANCE.idkeyStat(407, 3, 1, false);
                    return;
                }
                if (i4 > 0) {
                    C77910c0 c0Var2 = lVar.f227789h;
                    if (c0Var2 == null || c0Var2.f227110d <= 0) {
                        C77903a aVar2 = lVar.f227790i;
                        if (aVar2 != null && aVar2.f226964d == 1 && !Util.isNullOrNil(aVar2.f226968h) && !Util.isNullOrNil(lVar.f227790i.f226966f) && !Util.isNullOrNil(lVar.f227790i.f226967g) && !Util.isNullOrNil(lVar.f227790i.f226965e)) {
                            this.f232263g.mo72091a(lVar.f227790i);
                        } else if (!Util.isNullOrNil(lVar.f227786e)) {
                            this.f232263g.mo72091a(lVar.f227786e);
                        } else {
                            this.f232263g.mo72091a(Boolean.FALSE);
                        }
                    } else {
                        this.f232263g.mo72091a(c0Var2);
                    }
                } else {
                    this.f232263g.mo72091a(Boolean.FALSE);
                }
                C115669n.INSTANCE.idkeyStat(407, 5, 1, false);
                return;
            }
            C46888b bVar3 = this.f232263g;
            if (bVar3 != null) {
                bVar3.mo72091a(Boolean.FALSE);
            }
            C115669n.INSTANCE.idkeyStat(407, 4, 1, false);
        } else if (yVar.getType() == 2831) {
            this.f232260d = false;
            if (i == 0 && i2 == 0) {
                C79326h hVar2 = (C79326h) yVar;
                C77948j jVar = hVar2.f232885f;
                Object[] objArr3 = new Object[3];
                objArr3[0] = Integer.valueOf(jVar.f227621d);
                objArr3[1] = jVar.f227622e;
                objArr3[2] = Boolean.valueOf(jVar.f227624g == null);
                Log.m105925i("MicroMsg.LaunchAALogic", "launchAAByPersonCustomize, onSceneEnd, retCode: %s, retmsg: %s, msgxml==null: %s", objArr3);
                Log.m105925i("MicroMsg.LaunchAALogic", "launchAAByPersonCustomize, onSceneEnd, retMsg: %s, billNo: %s", jVar.f227622e, jVar.f227623f);
                int i5 = jVar.f227621d;
                if (i5 == 0) {
                    String str4 = jVar.f227624g;
                    if (str4 != null) {
                        C79104i.m95671p(jVar.f227623f, hVar2.f232887h, str4);
                        C88643g.m110553k(this.f232263g, Boolean.TRUE, jVar.f227623f);
                    } else {
                        C79104i.m95668m(jVar.f227623f, false, 0);
                        C88643g.m110553k(this.f232263g, Boolean.TRUE, jVar.f227623f);
                    }
                    C79104i.m95657b(hVar2.f232887h);
                    C115669n.INSTANCE.idkeyStat(407, 3, 1, false);
                    return;
                }
                if (i5 > 0) {
                    C77910c0 c0Var3 = jVar.f227625h;
                    if (c0Var3 == null || c0Var3.f227110d <= 0) {
                        C77903a aVar3 = jVar.f227626i;
                        if (aVar3 != null && aVar3.f226964d == 1 && !Util.isNullOrNil(aVar3.f226968h) && !Util.isNullOrNil(jVar.f227626i.f226966f) && !Util.isNullOrNil(jVar.f227626i.f226967g) && !Util.isNullOrNil(jVar.f227626i.f226965e)) {
                            this.f232263g.mo72091a(jVar.f227626i);
                        } else if (!Util.isNullOrNil(jVar.f227622e)) {
                            this.f232263g.mo72091a(jVar.f227622e);
                        } else {
                            this.f232263g.mo72091a(Boolean.FALSE);
                        }
                    } else {
                        this.f232263g.mo72091a(c0Var3);
                    }
                } else {
                    this.f232263g.mo72091a(Boolean.FALSE);
                }
                C115669n.INSTANCE.idkeyStat(407, 5, 1, false);
                return;
            }
            C46888b bVar4 = this.f232263g;
            if (bVar4 != null) {
                bVar4.mo72091a(Boolean.FALSE);
            }
            C115669n.INSTANCE.idkeyStat(407, 4, 1, false);
        }
    }
}
