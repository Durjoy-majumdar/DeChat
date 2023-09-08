package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.autogen.events.F2fDynamicStartPayEvent;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C45119n;
import com.tencent.p014mm.wallet_core.model.C75117g0;
import com.tencent.p014mm.wallet_core.model.C75120i;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import di3.C86312j;
import f40.C86709a0;
import java.net.URLDecoder;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C47350c;
import p281yz.C79173v;
import pv2.C110259i;
import pv2.C110260j;
import te3.C77907be0;
import te3.C77920eb0;
import te3.C78013xj;
import te3.C78018yj;
import vt1.C78473a;

/* renamed from: com.tencent.mm.plugin.remittance.model.k */
public class C70604k extends C75123k0 implements C45119n {

    /* renamed from: d */
    public C47350c f204234d;

    /* renamed from: e */
    public C78018yj f204235e;

    /* renamed from: f */
    public C11385n f204236f;

    /* renamed from: g */
    public String f204237g;

    /* renamed from: h */
    public F2fDynamicStartPayEvent f204238h = null;

    /* renamed from: i */
    public int f204239i;

    /* renamed from: com.tencent.mm.plugin.remittance.model.k$a */
    public static class C70605a {

        /* renamed from: A */
        public String f204240A;

        /* renamed from: B */
        public LinkedList<C77920eb0> f204241B;

        /* renamed from: C */
        public Boolean f204242C;

        /* renamed from: D */
        public Boolean f204243D;

        /* renamed from: E */
        public String f204244E;

        /* renamed from: a */
        public String f204245a;

        /* renamed from: b */
        public String f204246b;

        /* renamed from: c */
        public int f204247c;

        /* renamed from: d */
        public String f204248d;

        /* renamed from: e */
        public String f204249e;

        /* renamed from: f */
        public int f204250f;

        /* renamed from: g */
        public int f204251g;

        /* renamed from: h */
        public String f204252h;

        /* renamed from: i */
        public String f204253i;

        /* renamed from: j */
        public int f204254j;

        /* renamed from: k */
        public int f204255k;

        /* renamed from: l */
        public String f204256l;

        /* renamed from: m */
        public C77907be0 f204257m;

        /* renamed from: n */
        public String f204258n;

        /* renamed from: o */
        public int f204259o;

        /* renamed from: p */
        public String f204260p;

        /* renamed from: q */
        public String f204261q;

        /* renamed from: r */
        public String f204262r;

        /* renamed from: s */
        public String f204263s;

        /* renamed from: t */
        public String f204264t;

        /* renamed from: u */
        public int f204265u;

        /* renamed from: v */
        public int f204266v;

        /* renamed from: w */
        public String f204267w;

        /* renamed from: x */
        public String f204268x;

        /* renamed from: y */
        public String f204269y;

        /* renamed from: z */
        public int f204270z;
    }

    public C70604k(C70605a aVar) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C78013xj();
        bVar.f127067b = new C78018yj();
        bVar.f127069d = 1633;
        bVar.f127068c = "/cgi-bin/mmpay-bin/busif2fplaceorder";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C110260j a = C110259i.m149874a();
        String str = a.f329808a;
        String str2 = a.f329809b;
        this.f204237g = aVar.f204260p;
        this.f204239i = aVar.f204250f;
        C47350c a2 = bVar.mo72403a();
        this.f204234d = a2;
        C78013xj xjVar = (C78013xj) a2.f127055a.f127080a;
        xjVar.f228444d = aVar.f204245a;
        xjVar.f228445e = URLDecoder.decode(aVar.f204246b);
        xjVar.f228446f = aVar.f204247c;
        xjVar.f228447g = aVar.f204248d;
        xjVar.f228448h = aVar.f204249e;
        xjVar.f228449i = aVar.f204250f;
        xjVar.f228439M = aVar.f204270z;
        xjVar.f228450j = aVar.f204251g;
        xjVar.f228452o = aVar.f204252h;
        xjVar.f228451n = aVar.f204253i;
        xjVar.f228455r = aVar.f204254j;
        xjVar.f228432F = aVar.f204264t;
        xjVar.f228434H = aVar.f204266v;
        xjVar.f228456s = aVar.f204256l;
        xjVar.f228435I = aVar.f204267w;
        C77907be0 be02 = aVar.f204257m;
        if (be02 != null) {
            xjVar.f228457t = be02;
        }
        xjVar.f228458u = aVar.f204258n;
        xjVar.f228459v = aVar.f204259o;
        if (aVar.f204255k == 1) {
            xjVar.f228453p = ConnectivityCompat.Companion.getWiFiBssid();
            xjVar.f228454q = 0;
        }
        xjVar.f228462y = str;
        xjVar.f228463z = str2;
        xjVar.f228461x = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91340v();
        C78473a aVar2 = (C78473a) C86709a0.m107533q(C78473a.class);
        xjVar.f228460w = aVar2 == null ? false : aVar2.isRoot();
        xjVar.f228427A = this.f204237g;
        xjVar.f228428B = aVar.f204261q;
        xjVar.f228429C = aVar.f204262r;
        xjVar.f228433G = aVar.f204265u;
        xjVar.f228430D = aVar.f204263s;
        LinkedList<C77920eb0> linkedList = aVar.f204241B;
        if (linkedList != null) {
            xjVar.f228438L = linkedList;
            Log.m105925i("MicroMsg.NetSceneBusiF2fPlaceOrder", "extra_buy_detail_infos count: %d", Integer.valueOf(linkedList.size()));
        }
        String str3 = aVar.f204268x;
        if (str3 != null) {
            xjVar.f228436J = str3;
            Log.m105925i("MicroMsg.NetSceneBusiF2fPlaceOrder", "inputRecvName:%s", str3);
        }
        String str4 = aVar.f204269y;
        if (str4 != null) {
            xjVar.f228437K = str4;
            Log.m105925i("MicroMsg.NetSceneBusiF2fPlaceOrder", "checkRecvNameSign:%s", str4);
        }
        xjVar.f228440N = aVar.f204240A;
        xjVar.f228441P = aVar.f204242C.booleanValue();
        xjVar.f228443R = aVar.f204244E;
        if (aVar.f204242C.booleanValue()) {
            xjVar.f228442Q = aVar.f204243D.booleanValue();
        }
        Log.m105925i("MicroMsg.NetSceneBusiF2fPlaceOrder", "NetSceneBusiF2fPlaceOrder dycodeurl: %s", aVar.f204260p);
        Log.m105925i("MicroMsg.NetSceneBusiF2fPlaceOrder", "NetSceneBusiF2fPlaceOrder, scene: %s, channel: %s, total: %s, origin: %s, qrcode: %s, getPayWifi: %s favor_compose_info %s dynamicCodeUrl %s cancel_f2fid:%s cancel_reason:%s unpayType:%s amount_remind_sign:%s,qrcodeSenderName：%s", Integer.valueOf(aVar.f204247c), Integer.valueOf(aVar.f204251g), Integer.valueOf(aVar.f204250f), Integer.valueOf(aVar.f204270z), aVar.f204246b, Integer.valueOf(aVar.f204255k), C70580a.m83109c(aVar.f204257m), this.f204237g, aVar.f204264t, Integer.valueOf(aVar.f204266v), Integer.valueOf(aVar.f204265u), aVar.f204267w, aVar.f204244E);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f204236f = nVar;
        return dispatch(gVar, this.f204234d, this);
    }

    public int getType() {
        return 1633;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetSceneBusiF2fPlaceOrder", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f204235e = (C78018yj) ((C47350c) uVar).f127056b.f127083a;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(String.format("trans_id: %s,", new Object[]{this.f204235e.f228607q}));
        stringBuffer.append(String.format("zero_pay_flag: %s,", new Object[]{Integer.valueOf(this.f204235e.f228609s)}));
        stringBuffer.append(String.format("can_use_fingerprint: %s,", new Object[]{Integer.valueOf(this.f204235e.f228615y)}));
        stringBuffer.append(String.format("payer_need_auth_flag: %s,", new Object[]{Integer.valueOf(this.f204235e.f228610t)}));
        C75120i iVar = new C75120i(i2, i3, str);
        C75117g0.getRetModel(i2, i3, str, iVar);
        C78018yj yjVar = this.f204235e;
        C78018yj yjVar2 = this.f204235e;
        Log.m105925i("MicroMsg.NetSceneBusiF2fPlaceOrder", "ret_code: %s, ret_msg: %s trans_id: %s f2f_id: %s re_getfavor: %s payok_checksign: %s reqKey %s ret:%s", Integer.valueOf(this.f204235e.f228597d), yjVar.f228598e, yjVar.f228607q, yjVar.f228602i, Integer.valueOf(yjVar.f228606p), yjVar2.f228603j, yjVar2.f228599f, stringBuffer.toString());
        C11385n nVar = this.f204236f;
        if (nVar != null) {
            nVar.onSceneEnd(iVar.f221052a, iVar.f221053b, iVar.f221054c, this);
        }
    }
}
