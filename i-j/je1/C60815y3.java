package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60628i;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kj2.C117407d;
import kt1.C46744d;
import ob0.C11385n;
import ob0.C47350c;
import org.json.JSONObject;
import ot1.C11767a;
import pe3.C47465a;
import te3.C49282eg1;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C50401mh0;
import te3.C50542nh0;
import te3.C64313dg1;

/* renamed from: je1.y3 */
public final class C60815y3 extends C60628i {

    /* renamed from: g */
    public final String f173207g;

    /* renamed from: h */
    public C47350c f173208h;

    /* renamed from: i */
    public C11385n f173209i;

    /* renamed from: j */
    public final JSONObject f173210j;

    /* renamed from: n */
    public final JSONObject f173211n;

    /* renamed from: o */
    public boolean f173212o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60815y3(String str, List list, boolean z, int i, String str2, int i2, C8480h hVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        int i3 = 0;
        z = (i2 & 4) != 0 ? false : z;
        i = (i2 & 8) != 0 ? 0 : i;
        str2 = (i2 & 16) != 0 ? null : str2;
        C87412m.m108594g(str, "username");
        C87412m.m108594g(list, "cmdList");
        boolean z2 = true;
        this.f173207g = "Finder.NetSceneFinderOplog";
        this.f173210j = new JSONObject();
        this.f173211n = new JSONObject();
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 3870;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderoplog";
        C64313dg1 dg12 = new C64313dg1();
        dg12.f182703d = str;
        if (i != 0) {
            dg12.f182707h = i;
        }
        if (!(str2 == null || str2.length() == 0)) {
            z2 = false;
        }
        if (!z2) {
            dg12.f182708i = str2;
        }
        dg12.f182704e.addAll(list);
        C49842ig0 a = C46523h2.f125330a.mo71859a(3870);
        dg12.f182705f = a;
        a.f135313e = z ? 1 : 0;
        bVar.f127066a = dg12;
        bVar.f127067b = new C49282eg1();
        this.f173208h = bVar.mo72403a();
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = this.f173211n;
                jSONObject.put("req" + i3, ((C50401mh0) it.next()).f138028d);
                i3++;
            }
        }
        this.f173211n.put("isMegaVideo", z);
        Log.m105924i(this.f173207g, "NetSceneFinderOplog init ");
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return C46744d.Enable;
    }

    /* renamed from: N */
    public JSONObject mo8506N() {
        return this.f173211n;
    }

    /* renamed from: R0 */
    public JSONObject mo8510R0() {
        return this.f173210j;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f173209i = nVar;
        return dispatch(gVar, this.f173208h, this);
    }

    public int getType() {
        return 3870;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        String str3 = this.f173207g;
        Log.m105924i(str3, "errType " + i4 + ", errCode " + i5 + ", errMsg " + str2);
        String str4 = this.f173207g;
        StringBuilder sb = new StringBuilder();
        sb.append("retList ");
        sb.append(((LinkedList) mo85733l1()).size());
        Log.m105924i(str4, sb.toString());
        this.f173210j.put("retsize", ((LinkedList) mo85733l1()).size());
        int i6 = 0;
        for (C50542nh0 next : mo85733l1()) {
            JSONObject jSONObject = this.f173210j;
            jSONObject.put("resp" + i6, next.f138603e);
            JSONObject jSONObject2 = this.f173210j;
            jSONObject2.put("respm" + i6, next.f138604f);
            i6++;
        }
        C11385n nVar = this.f173209i;
        if (nVar != null) {
            nVar.onSceneEnd(i4, i5, str2, this);
        }
        for (C50542nh0 next2 : mo85733l1()) {
            String str5 = this.f173207g;
            Log.m105924i(str5, "retCode " + next2.f138603e + " retMsg " + next2.f138604f);
            if (!this.f173212o) {
                C11767a aVar = C11767a.f34453a;
                int i7 = next2.f138603e;
                String str6 = next2.f138604f;
                if (!Util.isNullOrNil(str6)) {
                    if (i7 == -5002) {
                        if (str6 != null) {
                            aVar.mo11668j(str6);
                        }
                        C117407d.INSTANCE.idkeyStat(1264, 1, 1, false);
                    } else if (i7 == -5001) {
                        if (str6 != null) {
                            aVar.mo11667i(str6);
                        }
                        C117407d.INSTANCE.idkeyStat(1264, 1, 1, false);
                    } else if (i7 == -4019) {
                        if (str6 != null) {
                            aVar.mo11666h(str6);
                        }
                        C117407d.INSTANCE.idkeyStat(1264, 6, 1, false);
                    } else if (i7 != -4017) {
                        switch (i7) {
                            case -4007:
                                if (str6 != null) {
                                    aVar.mo11666h(str6);
                                }
                                C117407d.INSTANCE.idkeyStat(1264, 1, 1, false);
                                break;
                            case -4006:
                                if (str6 != null) {
                                    aVar.mo11666h(str6);
                                }
                                C117407d.INSTANCE.idkeyStat(1264, 0, 1, false);
                                break;
                            case -4005:
                                if (str6 != null) {
                                    aVar.mo11666h(str6);
                                }
                                C117407d.INSTANCE.idkeyStat(1264, 5, 1, false);
                                break;
                            default:
                                if ((i7 == -5300 || i7 == -5000) && str6 != null) {
                                    aVar.mo11666h(str6);
                                    break;
                                }
                        }
                    } else {
                        if (str6 != null) {
                            aVar.mo11666h(str6);
                        }
                        C117407d.INSTANCE.idkeyStat(1264, 2, 1, false);
                    }
                }
            }
        }
    }

    /* renamed from: l1 */
    public final List<C50542nh0> mo85733l1() {
        C47350c cVar = this.f173208h;
        C87412m.m108591d(cVar);
        C47465a aVar = cVar.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderOplogResponse");
        LinkedList<C50542nh0> linkedList = ((C49282eg1) aVar).f132918d;
        C87412m.m108593f(linkedList, "rr!!.responseProtoBuf as…derOplogResponse).retList");
        return linkedList;
    }
}
