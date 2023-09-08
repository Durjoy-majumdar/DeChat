package fx0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.util.WXWebReporter;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C22497fg;
import te3.C22509lp3;
import te3.C22522pr3;
import te3.C51003qr3;

/* renamed from: fx0.t */
public class C20733t extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f58614d;

    /* renamed from: e */
    public C47350c f58615e;

    public C20733t(LinkedList<C22497fg> linkedList, int i, int i2, int i3, long j, int i4, int i5, long j2) {
        this(linkedList, i, i2, i3, j, i4, i5, j2, (C22509lp3) null);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f58614d = nVar;
        return dispatch(gVar, this.f58615e, this);
    }

    public int getType() {
        return 2645;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f58614d.onSceneEnd(i2, i3, str, this);
    }

    public C20733t(LinkedList<C22497fg> linkedList, int i, int i2, int i3, long j, int i4, int i5, long j2, C22509lp3 lp32) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C22522pr3();
        bVar.f127067b = new C51003qr3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/reportshow";
        bVar.f127069d = 2645;
        bVar.f127070e = WXWebReporter.WXWEB_GET_MMKV_FROM_CALLBACK_FAILED;
        bVar.f127071f = 1000000176;
        C47350c a = bVar.mo72403a();
        this.f58615e = a;
        C22522pr3 pr32 = (C22522pr3) a.f127055a.f127080a;
        if (linkedList != null) {
            pr32.f64444d = linkedList;
        }
        pr32.f64445e = i;
        pr32.f64446f = i2;
        pr32.f64447g = i3;
        pr32.f64448h = j;
        pr32.f64449i = i4;
        pr32.f64450j = i5;
        pr32.f64451n = j2;
        pr32.f64452o = lp32;
        Log.m105925i("MicroMsg.NetSceneReportBizListShowInfo", "reportshow report_list size %d,enter_pos %d,exit_pos %d, scene=%d, actType=%d, exposeId=%d", Integer.valueOf(pr32.f64444d.size()), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i4), Integer.valueOf(i5), Long.valueOf(j2));
    }
}
