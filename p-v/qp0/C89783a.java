package qp0;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandTaskProxyUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import d92.C107028a;
import java.io.IOException;
import k92.C108976d;
import te3.C101828pe0;

/* renamed from: qp0.a */
public class C89783a extends C108976d {

    /* renamed from: u */
    public C101828pe0 f258162u = new C101828pe0();

    /* renamed from: v */
    public AppBrandTaskProxyUI f258163v = null;

    public C89783a(C107028a aVar) {
        super(aVar);
    }

    /* renamed from: H */
    public void mo124068H(boolean z, int i) {
        if (z) {
            Log.m105924i("MicroMsg.AppBrandFilesMultiTaskHelper", "onMenuFloatBallSelected, enter float ball");
            mo160090r((Bitmap) null, true);
            this.f258163v.mo114356H7((AppBrandProxyUIProcessTask.ProcessResult) null);
        }
    }

    /* renamed from: Z */
    public void mo124069Z(String str) {
        Log.m105925i("MicroMsg.AppBrandFilesMultiTaskHelper", "update processName: %s", str);
        C101828pe0 pe02 = this.f258162u;
        if (pe02 != null) {
            pe02.f299164h = str;
            try {
                this.f326418a.field_data = pe02.toByteArray();
            } catch (IOException e) {
                Log.m105921e("MicroMsg.AppBrandFilesMultiTaskHelper", "updateAppid", e);
            }
        }
        mo160075M();
    }
}
