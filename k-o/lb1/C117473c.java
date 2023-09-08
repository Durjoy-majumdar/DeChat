package lb1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ie3.C76328d;
import java.util.Arrays;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C118440l02;
import te3.C118476wb3;
import te3.C64542m02;

/* renamed from: lb1.c */
public class C117473c extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f351561d;

    /* renamed from: e */
    public C47350c f351562e;

    /* renamed from: f */
    public C118440l02 f351563f;

    /* renamed from: g */
    public C64542m02 f351564g;

    public C117473c(String str, String str2, float f, String str3, String str4, int i, String str5, String str6, byte[] bArr, boolean z, int i2, long j, double d, double d2) {
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str5;
        String str11 = str6;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C118440l02();
        bVar.f127067b = new C64542m02();
        bVar.f127069d = 2726;
        bVar.f127068c = "/cgi-bin/mmpay-bin/getfacecheckresult";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f351562e = a;
        C118440l02 l022 = (C118440l02) a.f127055a.f127080a;
        this.f351563f = l022;
        l022.f354079d = str7;
        l022.f354080e = str8;
        l022.f354081f = f;
        l022.f354082g = str9;
        l022.f354083h = str4;
        l022.f354084i = i;
        l022.f354085j = str10;
        l022.f354086n = str11;
        C118476wb3 E70 = ((C76328d) C86312j.m106911c(C76328d.class)).E70();
        if (E70 == null) {
            Log.m105924i("MicroMsg.NetSceneGetFaceCheckResult", "payGenActionLocation == nul");
            E70 = new C118476wb3();
        }
        if (E70.f354510g == 0.0d) {
            E70.f354510g = d;
        }
        if (E70.f354509f == 0.0d) {
            E70.f354509f = d2;
        }
        C118440l02 l023 = this.f351563f;
        l023.f354087o = E70;
        l023.f354088p = C89349b.m111674a(bArr);
        C118440l02 l024 = this.f351563f;
        l024.f354089q = z;
        l024.f354090r = i2;
        l024.f354091s = j;
        Log.m105925i("MicroMsg.NetSceneGetFaceCheckResult", "create GetFaceCheckResult, personId: %s, actionData: %s, reductionRatio: %s, videoFileid: %s, scene: %s, takeMessage: %s, packageName: %s，hash: %s,checkAliveType:%s bioId:%s payGenActionLocation.longitude：%s payGenActionLocation.latitude:%s ,signContract:%s", str7, str8, Float.valueOf(f), str9, Integer.valueOf(i), str10, str11, Arrays.toString(bArr), Integer.valueOf(i2), Long.valueOf(j), Double.valueOf(E70.f354510g), Double.valueOf(E70.f354509f), Boolean.valueOf(z));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f351561d = nVar;
        return dispatch(gVar, this.f351562e, this);
    }

    public int getType() {
        return 2726;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneGetFaceCheckResult", "onGYNetEnd, errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C115669n.INSTANCE.idkeyStat(917, i3 == 0 ? 54 : 55, 1, false);
        this.f351564g = (C64542m02) ((C47350c) uVar).f127056b.f127083a;
        this.f351561d.onSceneEnd(i2, i3, str, this);
    }
}
