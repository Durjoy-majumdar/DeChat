package p655px;

import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p655px.C118134l;
import te3.C51018qv3;
import te3.lx4;

/* renamed from: px.m */
public class C118141m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bundle f353154d;

    public C118141m(C118134l.C118140f fVar, Bundle bundle) {
        this.f353154d = bundle;
    }

    public void run() {
        try {
            byte[] byteArray = this.f353154d.getByteArray("ECD");
            String string = this.f353154d.getString("MGAI", "");
            lx4 lx4 = new lx4();
            C51018qv3 qv32 = new C51018qv3();
            qv32.mo73350k(byteArray);
            lx4.f354117f = qv32;
            if (!TextUtils.isEmpty(string)) {
                C51018qv3 qv33 = new C51018qv3();
                qv33.mo73350k(string.getBytes());
                lx4.f354128t = qv33;
            }
            ((C118134l) C86312j.m106911c(C118134l.class)).wx0(540999708, lx4.toByteArray());
        } catch (Throwable th) {
            Log.m105921e("MicroMsg.SecInfoReporterImpl", "report wg task error: %s", th.toString());
        }
    }
}
