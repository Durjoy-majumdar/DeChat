package zf0;

import b63.C113146l;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C47350c;
import p206nj.C117627q;
import te3.C77945i;
import te3.C77948j;
import te3.s94;

/* renamed from: zf0.h */
public class C79326h extends C75123k0 {

    /* renamed from: d */
    public C47350c f232883d;

    /* renamed from: e */
    public C77945i f232884e;

    /* renamed from: f */
    public C77948j f232885f;

    /* renamed from: g */
    public C11385n f232886g;

    /* renamed from: h */
    public String f232887h;

    public C79326h(String str, int i, String str2, long j, String str3, String str4, String str5, String str6, boolean z, LinkedList<s94> linkedList) {
        String str7 = str2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C77945i();
        bVar.f127067b = new C77948j();
        bVar.f127069d = 2831;
        bVar.f127068c = "/cgi-bin/mmpay-bin/newaalaunchbypayercustomize";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f232883d = a;
        this.f232884e = (C77945i) a.f127055a.f127080a;
        a.setIsUserCmd(true);
        try {
            String str8 = str;
            this.f232884e.f227596d = C117627q.m165909b(str, "UTF-8");
            C77945i iVar = this.f232884e;
            iVar.f227597e = i;
            iVar.f227598f = str7;
            iVar.f227599g = C113146l.m154805c();
            C77945i iVar2 = this.f232884e;
            iVar2.f227600h = j;
            iVar2.f227601i = str3;
            iVar2.f227602j = str4;
            iVar2.f227603n = str5;
            iVar2.f227604o = str6;
            iVar2.f227605p = z;
            iVar2.f227606q = linkedList;
            Log.m105919d("MicroMsg.NetSceneAALaunchByPersonCustomize", "location %s", iVar2.f227599g);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.NetSceneAALaunchByPersonCustomize", "build NetSceneAALaunchByPerson request error: %s", e.getMessage());
        }
        this.f232887h = str7;
        C77945i iVar3 = this.f232884e;
        C77945i iVar4 = this.f232884e;
        Log.m105925i("MicroMsg.NetSceneAALaunchByPersonCustomize", "NetSceneAALaunchByPersonCustomize, title: %s, scene: %s, groupid: %s, timestamp: %s, pic_cdn_url: %s, pic_cdn_thumb_url: %s, pf_order_no: %s , pic_cdn_md5: %s", iVar3.f227596d, Integer.valueOf(iVar3.f227597e), iVar4.f227598f, Long.valueOf(iVar4.f227600h), Util.nullAs(this.f232884e.f227601i, ""), Util.nullAs(this.f232884e.f227602j, ""), Util.nullAs(this.f232884e.f227603n, ""), Util.nullAs(this.f232884e.f227604o, ""));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f232886g = nVar;
        return dispatch(gVar, this.f232883d, this);
    }

    public int getType() {
        return 2831;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetSceneAALaunchByPersonCustomize", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C77948j jVar = (C77948j) ((C47350c) uVar).f127056b.f127083a;
        this.f232885f = jVar;
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(jVar.f227621d);
        C77948j jVar2 = this.f232885f;
        objArr[1] = jVar2.f227622e;
        objArr[2] = jVar2.f227623f;
        objArr[3] = Boolean.valueOf(jVar2.f227624g == null);
        Log.m105925i("MicroMsg.NetSceneAALaunchByPersonCustomize", "retcode: %s, retmsg: %s, bill_no: %s, msgxml==null: %s", objArr);
        Log.m105919d("MicroMsg.NetSceneAALaunchByPersonCustomize", "msgxml: %s", this.f232885f.f227624g);
        C11385n nVar = this.f232886g;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
