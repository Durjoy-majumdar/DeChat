package vc0;

import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import h81.C32735h;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p200lx.C10661v;
import sf0.C48374j0;
import te3.C51163rv3;
import te3.C51653v62;
import te3.C51791w62;
import te3.C52126yj3;

/* renamed from: vc0.a */
public class C52809a extends C117747y implements C1311n, C10661v {

    /* renamed from: d */
    public final C47350c f147538d;

    /* renamed from: e */
    public C11385n f147539e;

    /* renamed from: f */
    public String f147540f;

    /* renamed from: g */
    public String f147541g;

    /* renamed from: h */
    public byte[] f147542h;

    /* renamed from: i */
    public int f147543i;

    /* renamed from: j */
    public int f147544j;

    /* renamed from: n */
    public List<C52126yj3> f147545n;

    /* renamed from: o */
    public String f147546o;

    public C52809a() {
        this(C75592q0.m90789s(), Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(66561, (Object) null)), 0);
    }

    /* renamed from: S */
    public int mo10928S() {
        return this.f147543i;
    }

    /* renamed from: X */
    public int mo10929X() {
        return this.f147544j;
    }

    /* renamed from: b */
    public byte[] mo10930b() {
        return this.f147542h;
    }

    /* renamed from: c */
    public String mo10931c() {
        return this.f147540f;
    }

    /* renamed from: d */
    public String mo10932d() {
        return this.f147546o;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f147539e = nVar;
        return dispatch(gVar, this.f147538d, this);
    }

    /* renamed from: e */
    public String mo10933e() {
        return this.f147541g;
    }

    public int getType() {
        return 168;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneGetQRCode", "onGYNetEnd errType:" + i2 + " errCode" + i3);
        if (i2 == 0 && i3 == 0) {
            C47350c cVar = this.f147538d;
            C51791w62 w622 = (C51791w62) cVar.f127056b.f127083a;
            String g = C48374j0.m53718g(((C51653v62) cVar.f127055a.f127080a).f143345d);
            this.f147542h = C48374j0.m53716e(w622.f143885d, new byte[0]);
            String str2 = w622.f143887f;
            this.f147540f = str2;
            this.f147544j = w622.f143891j;
            this.f147545n = w622.f143892n;
            int i4 = w622.f143886e;
            this.f147543i = i4;
            String str3 = w622.f143890i;
            if (str3 == null) {
                str3 = "";
            }
            this.f147546o = str3;
            Log.m105925i("MicroMsg.NetSceneGetQRCode", "expiredWording:%s, revokeId:%s, revokeWording:%s respStyle:%s respQrUrl:%s ", str2, w622.f143888g, w622.f143889h, Integer.valueOf(i4), this.f147546o);
            if (C75592q0.m90789s().equals(g)) {
                String str4 = w622.f143888g;
                String str5 = (String) C86709a0.m107535s().mo121142i().mo119684e(66563, "");
                if (str4 != null && !str5.equals(str4)) {
                    C86709a0.m107535s().mo121142i().mo119676J(66563, str4);
                    this.f147541g = w622.f143889h;
                }
                if (!(C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Global_ColorfulQRCode_Int, 0) == 1 || ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_colorful_qrcode_new_enable, 0) == 1)) {
                    C86709a0.m107535s().mo121142i().mo119676J(66561, Integer.valueOf(w622.f143886e));
                }
            }
        }
        this.f147539e.onSceneEnd(i2, i3, str, this);
    }

    /* renamed from: s0 */
    public List<C52126yj3> mo10934s0() {
        return this.f147545n;
    }

    public C52809a(String str, int i, int i2) {
        this(str, i, i2, "");
    }

    public C52809a(String str, int i, int i2, String str2) {
        this.f147539e = null;
        this.f147540f = null;
        this.f147541g = null;
        this.f147542h = null;
        this.f147543i = 0;
        this.f147544j = 0;
        this.f147545n = null;
        String str3 = "";
        this.f147546o = str3;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51653v62();
        bVar.f127067b = new C51791w62();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getqrcode";
        bVar.f127069d = 168;
        bVar.f127070e = 67;
        bVar.f127071f = 1000000067;
        C47350c a = bVar.mo72403a();
        this.f147538d = a;
        C51653v62 v622 = (C51653v62) a.f127055a.f127080a;
        v622.f143345d = C48374j0.m53720i(str);
        v622.f143346e = i;
        v622.f143347f = i2;
        C51163rv3 rv32 = new C51163rv3();
        rv32.f141175d = str2 != null ? str2 : str3;
        rv32.f141176e = true;
        v622.f143348g = rv32;
        Log.m105925i("MicroMsg.NetSceneGetQRCode", "username:%s, style:%d, opcode:%d, url:%s", str, Integer.valueOf(i), Integer.valueOf(i2), str2);
    }
}
