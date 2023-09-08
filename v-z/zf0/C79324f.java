package zf0;

import b63.C113146l;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import java.net.URLEncoder;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C47350c;
import te3.C77932g;
import te3.C77937h;
import te3.s94;

/* renamed from: zf0.f */
public class C79324f extends C75123k0 {

    /* renamed from: d */
    public C47350c f232873d;

    /* renamed from: e */
    public C77932g f232874e;

    /* renamed from: f */
    public C77937h f232875f;

    /* renamed from: g */
    public C11385n f232876g;

    /* renamed from: h */
    public String f232877h;

    public C79324f(long j, String str, List<String> list, int i, long j2, String str2, String str3, String str4, String str5, String str6, boolean z, LinkedList<s94> linkedList) {
        List<String> list2 = list;
        String str7 = str2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C77932g();
        bVar.f127067b = new C77937h();
        bVar.f127069d = 1624;
        bVar.f127068c = "/cgi-bin/mmpay-bin/newaalaunchbymoney";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f232877h = str7;
        C47350c a = bVar.mo72403a();
        this.f232873d = a;
        this.f232874e = (C77932g) a.f127055a.f127080a;
        a.setIsUserCmd(true);
        if (list2 != null) {
            try {
                if (list.size() > 0) {
                    this.f232874e.f227417d = list.size();
                    C77932g gVar = this.f232874e;
                    gVar.f227418e = j;
                    String str8 = str;
                    gVar.f227419f = URLEncoder.encode(str, "UTF-8");
                    this.f232874e.f227420g = new LinkedList<>();
                    this.f232874e.f227420g.addAll(list);
                    C77932g gVar2 = this.f232874e;
                    gVar2.f227421h = i;
                    gVar2.f227422i = str7;
                    gVar2.f227423j = C113146l.m154805c();
                    C77932g gVar3 = this.f232874e;
                    gVar3.f227424n = j2;
                    gVar3.f227425o = str3;
                    gVar3.f227426p = str4;
                    gVar3.f227427q = str5;
                    gVar3.f227428r = str6;
                    Log.m105919d("MicroMsg.NetSceneAALaunchByMoney", "location %s", gVar3.f227423j);
                    C77932g gVar4 = this.f232874e;
                    gVar4.f227429s = z;
                    gVar4.f227430t = linkedList;
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.NetSceneAALaunchByMoney", "build NetSceneAALaunchByMoney request error: %s", e.getMessage());
            }
        }
        C77932g gVar5 = this.f232874e;
        C77932g gVar6 = this.f232874e;
        Log.m105925i("MicroMsg.NetSceneAALaunchByMoney", "NetSceneAALaunchByMoney, total_num: %s, per_amount: %s, title: %s, payer_list: %s, scene: %s, groupid: %s, timestamp: %s, pic_cdn_url: %s, pic_cdn_thumb_url: %s, pf_order_no: %s,pic_cdn_md5:%s", Integer.valueOf(this.f232874e.f227417d), Long.valueOf(this.f232874e.f227418e), gVar5.f227419f, gVar5.f227420g, Integer.valueOf(gVar5.f227421h), gVar6.f227422i, Long.valueOf(gVar6.f227424n), Util.nullAs(this.f232874e.f227425o, ""), Util.nullAs(this.f232874e.f227426p, ""), Util.nullAs(this.f232874e.f227427q, ""), Util.nullAs(this.f232874e.f227428r, ""));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.NetSceneAALaunchByMoney", "doScene");
        this.f232876g = nVar;
        return dispatch(gVar, this.f232873d, this);
    }

    public int getType() {
        return 1624;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetSceneAALaunchByMoney", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C77937h hVar = (C77937h) ((C47350c) uVar).f127056b.f127083a;
        this.f232875f = hVar;
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(hVar.f227520d);
        C77937h hVar2 = this.f232875f;
        objArr[1] = hVar2.f227521e;
        objArr[2] = Boolean.valueOf(hVar2.f227523g == null);
        objArr[3] = this.f232875f.f227522f;
        Log.m105925i("MicroMsg.NetSceneAALaunchByMoney", "retcode: %s, retmsg: %s, msgxml==null: %s, billNo: %s", objArr);
        Log.m105919d("MicroMsg.NetSceneAALaunchByMoney", "msgxml: %s", this.f232875f.f227523g);
        C11385n nVar = this.f232876g;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    public C79324f(long j, String str, int i, int i2, long j2, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C77932g();
        bVar.f127067b = new C77937h();
        bVar.f127069d = 1624;
        bVar.f127068c = "/cgi-bin/mmpay-bin/newaalaunchbymoney";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f232873d = a;
        C77932g gVar = (C77932g) a.f127055a.f127080a;
        this.f232874e = gVar;
        this.f232877h = str2;
        try {
            gVar.f227417d = i;
            gVar.f227418e = j;
            gVar.f227419f = URLEncoder.encode(str, "UTF-8");
            this.f232874e.f227420g = new LinkedList<>();
            C77932g gVar2 = this.f232874e;
            gVar2.f227421h = i2;
            gVar2.f227422i = str2;
            gVar2.f227423j = C113146l.m154805c();
            Log.m105919d("MicroMsg.NetSceneAALaunchByMoney", "location %s", this.f232874e.f227423j);
            this.f232874e.f227424n = j2;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.NetSceneAALaunchByMoney", "build NetSceneAALaunchByMoney request error: %s", e.getMessage());
        }
        C77932g gVar3 = this.f232874e;
        C77932g gVar4 = this.f232874e;
        Log.m105925i("MicroMsg.NetSceneAALaunchByMoney", "NetSceneAALaunchByMoney, total_num: %s, per_amount: %s, title: %s, payer_list: %s, scene: %s, groupid: %s, timestamp", Integer.valueOf(this.f232874e.f227417d), Long.valueOf(this.f232874e.f227418e), gVar3.f227419f, gVar3.f227420g, Integer.valueOf(gVar3.f227421h), gVar4.f227422i, Long.valueOf(gVar4.f227424n));
    }
}
