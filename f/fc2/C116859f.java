package fc2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C118449o22;
import te3.C50484n22;
import te3.C51018qv3;
import te3.C51163rv3;
import te3.C64234an2;
import te3.C64885zm2;

/* renamed from: fc2.f */
public class C116859f extends C117747y implements C1311n {

    /* renamed from: p */
    public static Vector<String> f350252p = new Vector<>();

    /* renamed from: d */
    public C11385n f350253d;

    /* renamed from: e */
    public final C47350c f350254e;

    /* renamed from: f */
    public int f350255f;

    /* renamed from: g */
    public String f350256g;

    /* renamed from: h */
    public String f350257h;

    /* renamed from: i */
    public String f350258i;

    /* renamed from: j */
    public List<C116858d> f350259j;

    /* renamed from: n */
    public int f350260n;

    /* renamed from: o */
    public boolean f350261o;

    public C116859f(int i, int i2, float f, float f2, int i3, int i4, String str, String str2, C51018qv3 qv32, String str3, int i5, boolean z, boolean z2) {
        int i6 = i;
        int i7 = i2;
        float f3 = f;
        float f4 = f2;
        int i8 = i3;
        int i9 = i4;
        String str4 = str;
        String str5 = str2;
        C51018qv3 qv33 = qv32;
        String str6 = str3;
        int i15 = i5;
        this.f350255f = 0;
        this.f350257h = "";
        this.f350258i = "";
        this.f350256g = str6;
        if (!(i6 == 0 || i6 == 1)) {
            Log.m105920e("MicroMsg.NetSceneGetLbsLifeList", "OpCode Error :" + i6);
        }
        this.f350255f = i6;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50484n22();
        bVar.f127067b = new C118449o22();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getlbslifelist";
        bVar.f127069d = 603;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f350254e = a;
        C50484n22 n222 = (C50484n22) a.f127055a.f127080a;
        C64234an2 an22 = new C64234an2();
        an22.f182098h = str5;
        an22.f182099i = i9;
        an22.f182095e = f4;
        an22.f182094d = f3;
        an22.f182097g = str4;
        an22.f182096f = i8;
        n222.f138347g = an22;
        n222.f138348h = str6;
        n222.f138345e = i7;
        n222.f138349i = i15;
        if (qv33 == null) {
            C51018qv3 qv34 = new C51018qv3();
            qv34.mo73350k(new byte[0]);
            n222.f138346f = qv34;
        } else {
            n222.f138346f = qv33;
        }
        n222.f138344d = i6;
        n222.f138350j = z2 ? 1 : 0;
        this.f350261o = z;
        Log.m105918d("MicroMsg.NetSceneGetLbsLifeList", "Req: opcode:" + i6 + " lon:" + f3 + " lat:" + f4 + " pre:" + i8 + " gpsSource:" + i9 + " mac" + str4 + " cell:" + str5 + " scene: " + i7 + " entryTime: " + i15);
        Log.m105919d("MicroMsg.NetSceneGetLbsLifeList", "isLoadMore: %s, buf: %s", Boolean.valueOf(z), Integer.valueOf(n222.f138346f.f140572d));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f350253d = nVar;
        return dispatch(gVar, this.f350254e, this);
    }

    public int getType() {
        return 603;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneGetLbsLifeList", "onGYNetEnd  errType:" + i2 + " errCode:" + i3);
        C118449o22 o222 = (C118449o22) ((C47350c) uVar).f127056b.f127083a;
        this.f350258i = o222.f354166n;
        this.f350260n = o222.f354167o;
        Log.m105918d("MicroMsg.NetSceneGetLbsLifeList", "resp " + o222.f354162g + "searchId " + this.f350258i);
        boolean z = i3 == 0 || i3 == 101;
        if (i2 == 0 || z) {
            Log.m105919d("MicroMsg.NetSceneGetLbsLifeList", "continueFlag %d lifeCount %d linkCount %d %s", Integer.valueOf(o222.f354164i), Integer.valueOf(o222.f354162g), Integer.valueOf(o222.f354160e), o222.f354165j);
            this.f350257h = Util.nullAs(o222.f354165j, "");
            this.f350259j = new ArrayList();
            Iterator<C64885zm2> it = o222.f354163h.iterator();
            while (it.hasNext()) {
                this.f350259j.add(new C116858d(o222.f354166n, it.next()));
            }
            if (o222.f354162g > 0) {
                C64885zm2 zm22 = o222.f354163h.get(0);
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(" Bid " + zm22.f186729d);
                stringBuffer.append(" title " + zm22.f186730e);
                stringBuffer.append(" link " + zm22.f186737o);
                stringBuffer.append(" price " + zm22.f186731f);
                stringBuffer.append(" rate " + zm22.f186736n);
                stringBuffer.append(" type " + zm22.f186738p);
                stringBuffer.append(" desc : ");
                Iterator<C51163rv3> it4 = zm22.f186735j.iterator();
                while (it4.hasNext()) {
                    stringBuffer.append(it4.next().f141175d + "-");
                }
                Log.m105919d("MicroMsg.NetSceneGetLbsLifeList", "resp one %s ", stringBuffer.toString());
            }
            this.f350253d.onSceneEnd(i2, i3, str, this);
            return;
        }
        this.f350253d.onSceneEnd(i2, i3, str, this);
    }

    public C116859f(int i, int i2, C64234an2 an22) {
        this.f350255f = 0;
        this.f350256g = "";
        this.f350257h = "";
        this.f350258i = "";
        if (!(i == 0 || i == 1)) {
            Log.m105920e("MicroMsg.NetSceneGetLbsLifeList", "OpCode Error :" + i);
        }
        this.f350255f = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50484n22();
        bVar.f127067b = new C118449o22();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getlbslifelist";
        bVar.f127069d = 603;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f350254e = a;
        C50484n22 n222 = (C50484n22) a.f127055a.f127080a;
        n222.f138347g = an22;
        n222.f138348h = this.f350256g;
        n222.f138345e = i2;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(new byte[0]);
        n222.f138346f = qv32;
        n222.f138344d = i;
    }
}
