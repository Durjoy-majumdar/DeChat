package lp2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49355f0;
import te3.C49492g0;

/* renamed from: lp2.e */
public class C46884e extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f126084d;

    /* renamed from: e */
    public C11385n f126085e;

    public C46884e(String str, long j, int i) {
        this(str, j, i, "");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdAppointment");
        this.f126085e = nVar;
        int dispatch = dispatch(gVar, this.f126084d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdAppointment");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdAppointment");
        int i = this.f126084d.f127058d;
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdAppointment");
        return i;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdAppointment");
        Log.m105924i("NetSceneAdAppointment", "errType=" + i2 + ", errCode=" + i3 + ", errMsg=" + str);
        C11385n nVar = this.f126085e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdAppointment");
    }

    public C46884e(String str, long j, int i, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49355f0();
        bVar.f127067b = new C49492g0();
        bVar.f127068c = "/cgi-bin/mmoc-bin/adplayinfo/ad_appointment";
        bVar.f127069d = 5159;
        C47350c a = bVar.mo72403a();
        this.f126084d = a;
        C49355f0 f0Var = (C49355f0) a.f127055a.f127080a;
        f0Var.f133212d = str;
        f0Var.f133213e = j;
        f0Var.f133214f = i;
        f0Var.f133215g = str2;
        Log.m105924i("NetSceneAdAppointment", "appointmentId=" + j + ", opType=" + i + ", uxInfo=" + str + ", phoneNumber=" + str2);
    }
}
