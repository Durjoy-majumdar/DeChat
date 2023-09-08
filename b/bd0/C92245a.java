package bd0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import p206nj.C76861g;
import p823sg.C90193h;
import te3.C51018qv3;
import te3.C51163rv3;
import te3.kn4;
import te3.ln4;

/* renamed from: bd0.a */
public class C92245a extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f264021d;

    /* renamed from: e */
    public C47350c f264022e;

    /* renamed from: f */
    public String f264023f;

    /* renamed from: g */
    public String f264024g;

    /* renamed from: h */
    public String f264025h;

    /* renamed from: i */
    public int f264026i;

    /* renamed from: j */
    public int f264027j;

    /* renamed from: n */
    public int f264028n;

    /* renamed from: o */
    public int f264029o;

    /* renamed from: p */
    public int f264030p;

    /* renamed from: q */
    public MTimerHandler f264031q;

    /* renamed from: bd0.a$a */
    public class C92246a implements MTimerHandler.CallBack {
        public C92246a() {
        }

        public boolean onTimerExpired() {
            long l = C86013q1.m106451l(C92245a.this.f264025h);
            Log.m105918d("MicroMsg.NetSceneUploadMedia", C76861g.m92660c() + " onTimerExpired: file:" + C92245a.this.f264025h + " nowlen:" + l + " oldoff:" + C92245a.this.f264029o);
            C92245a aVar = C92245a.this;
            if (aVar.doScene(aVar.dispatcher(), C92245a.this.f264021d) != -1) {
                return false;
            }
            C92245a aVar2 = C92245a.this;
            aVar2.f264021d.onSceneEnd(3, -1, "doScene failed", aVar2);
            return false;
        }
    }

    public C92245a(String str, int i, int i2, int i3, int i4) {
        this.f264023f = null;
        this.f264024g = null;
        this.f264025h = null;
        this.f264026i = 0;
        this.f264027j = 0;
        this.f264028n = 0;
        this.f264029o = 0;
        this.f264030p = 5;
        this.f264031q = new MTimerHandler(new C92246a(), true);
        this.f264023f = "" + Util.nowMilliSecond();
        this.f264025h = str;
        this.f264030p = i;
        this.f264026i = i2;
        this.f264027j = i3;
        this.f264028n = i4;
        this.f264024g = C90193h.m112878f(C86013q1.m106433O(this.f264025h, 0, (int) C86013q1.m106451l(str)));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f264021d = nVar;
        int l = (int) C86013q1.m106451l(this.f264025h);
        Log.m105918d("MicroMsg.NetSceneUploadMedia", C76861g.m92660c() + " read file:" + this.f264025h + " filelen:" + l + " oldoff:" + this.f264029o + "this.filemd5 " + this.f264024g);
        if (l <= 0) {
            Log.m105920e("MicroMsg.NetSceneUploadMedia", "read failed :" + this.f264025h);
            return -1;
        }
        int i = l - this.f264029o;
        if (i > 3960) {
            i = 3960;
        }
        Log.m105924i("MicroMsg.NetSceneUploadMedia", C76861g.m92660c() + " read file:" + this.f264025h + " filelen:" + l + " oldoff:" + this.f264029o + "  canReadLen " + i);
        byte[] O = C86013q1.m106433O(this.f264025h, this.f264029o, i);
        if (O == null) {
            Log.m105920e("MicroMsg.NetSceneUploadMedia", "read data error");
            return -1;
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new kn4();
        bVar.f127067b = new ln4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmuploadmedia";
        bVar.f127069d = 240;
        bVar.f127070e = 111;
        bVar.f127071f = 1000000111;
        C47350c a = bVar.mo72403a();
        this.f264022e = a;
        kn4 kn4 = (kn4) a.f127055a.f127080a;
        C51163rv3 rv32 = new C51163rv3();
        rv32.f141175d = this.f264023f;
        rv32.f141176e = true;
        kn4.f298636d = rv32;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(O);
        kn4.f298641i = qv32;
        kn4.f298640h = O.length;
        C51163rv3 rv33 = new C51163rv3();
        rv33.f141175d = this.f264024g;
        rv33.f141176e = true;
        kn4.f298637e = rv33;
        kn4.f298638f = l;
        kn4.f298639g = this.f264029o;
        kn4.f298642j = this.f264030p;
        kn4.f298643n = 1;
        kn4.f298644o = this.f264026i;
        kn4.f298645p = this.f264027j;
        kn4.f298646q = this.f264028n;
        return dispatch(gVar, this.f264022e, this);
    }

    public int getType() {
        return 240;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        updateDispatchId(i);
        Log.m105918d("MicroMsg.NetSceneUploadMedia", C76861g.m92660c() + " onGYNetEnd file:" + this.f264025h + " errtype:" + i2 + " errCode:" + i3);
        C47350c cVar = (C47350c) uVar;
        kn4 kn4 = (kn4) cVar.f127055a.f127080a;
        String str2 = ((ln4) cVar.f127056b.f127083a).f137528d;
        Log.m105925i("MicroMsg.NetSceneUploadMedia", "fileName:%s, md5:%s, totalLen:%d, dataLen:%d, startPos:%d", this.f264025h, str2, Integer.valueOf(kn4.f298638f), Integer.valueOf(kn4.f298640h), Integer.valueOf(kn4.f298639g));
        if (i2 != 0 || i3 != 0) {
            Log.m105920e("MicroMsg.NetSceneUploadMedia", C76861g.m92660c() + " onGYNetEnd file:" + this.f264025h + " errType:" + i2 + " errCode:" + i3);
            this.f264021d.onSceneEnd(i2, i3, str, this);
        } else if (kn4.f298638f > kn4.f298640h + kn4.f298639g || str2 == null || str2.equals("0")) {
            this.f264029o = kn4.f298639g + kn4.f298641i.f140572d;
            Log.m105918d("MicroMsg.NetSceneUploadMedia", "onGYNetEnd file:" + this.f264025h + " delay:" + 500);
            this.f264031q.startTimer(500);
        } else {
            this.f264021d.onSceneEnd(i2, i3, str, this);
        }
    }

    public int securityLimitCount() {
        return 60;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }
}
