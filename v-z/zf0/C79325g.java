package zf0;

import b63.C113146l;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C47350c;
import p206nj.C117627q;
import te3.C64541m;
import te3.C77956k;
import te3.C77962l;
import te3.s94;

/* renamed from: zf0.g */
public class C79325g extends C75123k0 {

    /* renamed from: d */
    public C47350c f232878d;

    /* renamed from: e */
    public C77956k f232879e;

    /* renamed from: f */
    public C77962l f232880f;

    /* renamed from: g */
    public C11385n f232881g;

    /* renamed from: h */
    public String f232882h;

    public C79325g(String str, long j, List<C64541m> list, int i, String str2, long j2, String str3, String str4, String str5, String str6, boolean z, LinkedList<s94> linkedList) {
        String str7 = str2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C77956k();
        bVar.f127067b = new C77962l();
        bVar.f127069d = 1655;
        bVar.f127068c = "/cgi-bin/mmpay-bin/newaalaunchbyperson";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f232878d = a;
        this.f232879e = (C77956k) a.f127055a.f127080a;
        a.setIsUserCmd(true);
        try {
            String str8 = str;
            this.f232879e.f227713d = C117627q.m165909b(str, "UTF-8");
            C77956k kVar = this.f232879e;
            kVar.f227714e = j;
            kVar.f227715f = new LinkedList<>();
            List<C64541m> list2 = list;
            this.f232879e.f227715f.addAll(list);
            C77956k kVar2 = this.f232879e;
            kVar2.f227716g = i;
            kVar2.f227717h = str7;
            kVar2.f227718i = C113146l.m154805c();
            C77956k kVar3 = this.f232879e;
            kVar3.f227719j = j2;
            kVar3.f227720n = str3;
            kVar3.f227721o = str4;
            kVar3.f227722p = str5;
            kVar3.f227723q = str6;
            kVar3.f227724r = z;
            kVar3.f227725s = linkedList;
            Log.m105919d("MicroMsg.NetSceneAALaunchByPerson", "location %s", kVar3.f227718i);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.NetSceneAALaunchByPerson", "build NetSceneAALaunchByPerson request error: %s", e.getMessage());
        }
        this.f232882h = str7;
        C77956k kVar4 = this.f232879e;
        C77956k kVar5 = this.f232879e;
        C77956k kVar6 = this.f232879e;
        Log.m105925i("MicroMsg.NetSceneAALaunchByPerson", "NetSceneAALaunchByPerson, title: %s, total_pay_amount: %s, payer_list: %s, scene: %s, groupid: %s, timestamp: %s, pic_cdn_url: %s, pic_cdn_thumb_url: %s, pf_order_no: %s , pic_cdn_md5:%s", kVar4.f227713d, Long.valueOf(kVar4.f227714e), kVar5.f227715f, Integer.valueOf(kVar5.f227716g), kVar6.f227717h, Long.valueOf(kVar6.f227719j), Util.nullAs(this.f232879e.f227720n, ""), Util.nullAs(this.f232879e.f227721o, ""), Util.nullAs(this.f232879e.f227722p, ""), Util.nullAs(this.f232879e.f227723q, ""));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105918d("MicroMsg.NetSceneAALaunchByPerson", "doScene");
        this.f232881g = nVar;
        return dispatch(gVar, this.f232878d, this);
    }

    public int getType() {
        return 1655;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetSceneAALaunchByPerson", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C77962l lVar = (C77962l) ((C47350c) uVar).f127056b.f127083a;
        this.f232880f = lVar;
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(lVar.f227785d);
        C77962l lVar2 = this.f232880f;
        objArr[1] = lVar2.f227786e;
        objArr[2] = lVar2.f227787f;
        objArr[3] = Boolean.valueOf(lVar2.f227788g == null);
        Log.m105925i("MicroMsg.NetSceneAALaunchByPerson", "retcode: %s, retmsg: %s, bill_no: %s, msgxml==null: %s", objArr);
        Log.m105919d("MicroMsg.NetSceneAALaunchByPerson", "msgxml: %s", this.f232880f.f227788g);
        C11385n nVar = this.f232881g;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
