package j51;

import com.tencent.p014mm.plugin.downloader_app.model.C40983c;
import com.tencent.p014mm.plugin.downloader_app.model.C40990e0;
import com.tencent.p014mm.plugin.downloader_app.p039ui.DownloadMainUI;
import e51.C45543b;
import z41.C53736a;

/* renamed from: j51.f */
public class C46403f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C53736a f125006d;

    /* renamed from: e */
    public final /* synthetic */ C40990e0 f125007e;

    /* renamed from: f */
    public final /* synthetic */ DownloadMainUI f125008f;

    public C46403f(DownloadMainUI downloadMainUI, C53736a aVar, C40990e0 e0Var) {
        this.f125008f = downloadMainUI;
        this.f125006d = aVar;
        this.f125007e = e0Var;
    }

    public void run() {
        C53736a aVar = this.f125006d;
        if (aVar != null) {
            int i = aVar.field_status;
            if (i != 1) {
                if (i == 2) {
                    C40983c.m44423e(this.f125008f, this.f125007e, false, (C45543b) null);
                } else {
                    C40983c.m44420b(this.f125008f, this.f125007e, true);
                }
            }
        } else {
            C40983c.m44420b(this.f125008f, this.f125007e, true);
        }
    }
}
