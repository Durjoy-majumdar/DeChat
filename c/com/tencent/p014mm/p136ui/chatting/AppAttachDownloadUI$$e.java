package com.tencent.p014mm.p136ui.chatting;

import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;

/* renamed from: com.tencent.mm.ui.chatting.AppAttachDownloadUI$$e */
public class AppAttachDownloadUI$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C72683d f55955d;

    /* renamed from: e */
    public final /* synthetic */ C72683d f55956e;

    /* renamed from: f */
    public final /* synthetic */ AppAttachDownloadUI f55957f;

    public AppAttachDownloadUI$$e(AppAttachDownloadUI appAttachDownloadUI, C72683d dVar, C72683d dVar2) {
        this.f55957f = appAttachDownloadUI;
        this.f55955d = dVar;
        this.f55956e = dVar2;
    }

    public void run() {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        long d = C86013q1.m106443d(this.f55955d.field_fileFullPath, this.f55956e.field_fileFullPath, false);
        if (d > 0) {
            C72683d dVar = this.f55956e;
            dVar.field_offset = d;
            AppAttachDownloadUI appAttachDownloadUI = this.f55957f;
            int i = AppAttachDownloadUI.f55901U0;
            if (appAttachDownloadUI.mo26090M7(dVar)) {
                this.f55956e.field_status = 199;
            }
            z = C72709y1.vx0().update(this.f55956e, new String[0]);
        } else {
            z = false;
        }
        Log.m105925i("MicroMsg.AppAttachDownloadUI", "summerapp copyAttachFromLocal size[%d], id[%d, %d], ret[%b], new status[%d], take[%d]ms", Long.valueOf(d), Long.valueOf(this.f55955d.field_msgInfoId), Long.valueOf(this.f55956e.field_msgInfoId), Boolean.valueOf(z), Long.valueOf(this.f55956e.field_status), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }
}
