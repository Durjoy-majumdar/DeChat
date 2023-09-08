package o13;

import com.tencent.p014mm.plugin.updater.xlabupdater.XUpdateDownloadUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C47883u;
import zp3.C23564m;

/* renamed from: o13.d */
public final class C11328d implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ XUpdateDownloadUI f33284a;

    public C11328d(XUpdateDownloadUI xUpdateDownloadUI) {
        this.f33284a = xUpdateDownloadUI;
    }

    /* renamed from: a */
    public final void mo353a(boolean z, String str) {
        XUpdateDownloadUI xUpdateDownloadUI = this.f33284a;
        int i = XUpdateDownloadUI.f21647q;
        xUpdateDownloadUI.getClass();
        Log.m105924i("MicroMsg.XUpdate.XUpdateDownloadUI", "hideToDownloadDialog: ");
        C23564m.m28136f(new C11326b(xUpdateDownloadUI));
        this.f33284a.finish();
    }
}
