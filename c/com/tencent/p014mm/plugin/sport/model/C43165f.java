package com.tencent.p014mm.plugin.sport.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Date;
import java.util.TimeZone;
import nj3.C76901s0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.wm4;
import te3.xm4;

/* renamed from: com.tencent.mm.plugin.sport.model.f */
public class C43165f extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f116778d = null;

    /* renamed from: e */
    public C47350c f116779e = null;

    /* renamed from: f */
    public wm4 f116780f;

    public C43165f(String str, String str2, int i, int i2, int i3, String str3, int i4) {
        int i5 = 0;
        Log.m105925i("MicroMsg.Sport.NetSceneUploadDeviceStep", "NetSceneUploadDeviceStep %s, %s, %s, %s, %s", str, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new wm4();
        bVar.f127067b = new xm4();
        bVar.f127068c = "/cgi-bin/mmoc-bin/hardware/uploaddevicestep";
        bVar.f127069d = 1261;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f116779e = a;
        wm4 wm4 = (wm4) a.f127055a.f127080a;
        this.f116780f = wm4;
        wm4.f144138d = str;
        wm4.f144139e = str2;
        wm4.f144140f = i;
        wm4.f144141g = i2;
        wm4.f144142h = i3;
        C76901s0 s0Var = C115778q.f347351a;
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset() / 1000;
        if (timeZone.useDaylightTime() && timeZone.inDaylightTime(new Date(System.currentTimeMillis()))) {
            i5 = 1;
        }
        wm4.f144143i = String.valueOf((rawOffset / 3600) + i5);
        wm4 wm42 = this.f116780f;
        wm42.f144147p = str3;
        wm42.f144150s = i4;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f116778d = nVar;
        return dispatch(gVar, this.f116779e, this);
    }

    public int getType() {
        return 1261;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.Sport.NetSceneUploadDeviceStep", "NetSceneUploadDeviceStep end: errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C5139t.m5183e(10, 12);
        this.f116778d.onSceneEnd(i2, i3, str, this);
    }
}
