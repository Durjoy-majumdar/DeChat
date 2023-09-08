package com.tencent.p014mm.p136ui.chatting;

import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;

/* renamed from: com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$q */
public class AppAttachNewDownloadUI$$q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C72683d f215152d;

    /* renamed from: e */
    public final /* synthetic */ C72683d f215153e;

    public AppAttachNewDownloadUI$$q(C72683d dVar, C72683d dVar2) {
        this.f215152d = dVar;
        this.f215153e = dVar2;
    }

    public void run() {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        long d = C86013q1.m106443d(this.f215152d.field_fileFullPath, this.f215153e.field_fileFullPath, false);
        if (d > 0) {
            C72683d dVar = this.f215153e;
            dVar.field_offset = d;
            if (AppAttachNewDownloadUI.m21358V7(dVar)) {
                this.f215153e.field_status = 199;
            }
            z = C72709y1.vx0().update(this.f215153e, new String[0]);
        } else {
            z = false;
        }
        Log.m105925i("MicroMsg.AppAttachNewDownloadUI", "summerapp copyAttachFromLocal size[%d], id[%d, %d], ret[%b], new status[%d], take[%d]ms", Long.valueOf(d), Long.valueOf(this.f215152d.field_msgInfoId), Long.valueOf(this.f215153e.field_msgInfoId), Boolean.valueOf(z), Long.valueOf(this.f215153e.field_status), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }
}
