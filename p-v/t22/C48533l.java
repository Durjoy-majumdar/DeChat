package t22;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49373f32;
import te3.C49509g32;
import wm0.C38230b;

/* renamed from: t22.l */
public class C48533l extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f129799d;

    /* renamed from: e */
    public final C47350c f129800e;

    /* renamed from: f */
    public String f129801f;

    public C48533l(float f, float f2, int i, int i2, int i3, int i4, String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49373f32();
        bVar.f127067b = new C49509g32();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getlocimg";
        bVar.f127069d = C38230b.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f129800e = a;
        C49373f32 f322 = (C49373f32) a.f127055a.f127080a;
        f322.f133268h = str2;
        if (Util.isOverseasUser(MMApplicationContext.getContext())) {
            f322.f133269i = 1;
        } else {
            f322.f133269i = 0;
        }
        f322.f133265e = f;
        f322.f133264d = f2;
        f322.f133270j = i;
        Log.m105925i("MicroMsg.NetSceneGetLocImg", "src w %d h %d", Integer.valueOf(i3), Integer.valueOf(i4));
        int i5 = i3;
        int i6 = i4;
        while (i5 * i6 > 270000) {
            i5 = (int) (((double) i5) / 1.2d);
            i6 = (int) (((double) i6) / 1.2d);
        }
        Log.m105925i("MicroMsg.NetSceneGetLocImg", "NetSceneGetLocImg %f %f %d w = %d h = %d lan=%s", Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i5), Integer.valueOf(i6), f322.f133268h);
        f322.f133267g = i6;
        f322.f133266f = i5;
        this.f129801f = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129799d = nVar;
        return dispatch(gVar, this.f129800e, this);
    }

    public int getType() {
        return C38230b.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneGetLocImg", "onGYNetEnd errType %d errCode%d", Integer.valueOf(i2), Integer.valueOf(i3));
        try {
            byte[] bArr2 = ((C49509g32) ((C47350c) uVar).f127056b.f127083a).f133825d.f140574f.f257327a;
            C86013q1.m106438T(this.f129801f, bArr2, 0, bArr2.length);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.NetSceneGetLocImg", e, "", new Object[0]);
        }
        C11385n nVar = this.f129799d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
