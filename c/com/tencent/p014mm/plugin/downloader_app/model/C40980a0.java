package com.tencent.p014mm.plugin.downloader_app.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import qo3.C77429t;

/* renamed from: com.tencent.mm.plugin.downloader_app.model.a0 */
public class C40980a0 implements C77429t {

    /* renamed from: a */
    public final /* synthetic */ C41009x f110310a;

    public C40980a0(C41009x xVar) {
        this.f110310a = xVar;
    }

    /* renamed from: a */
    public void mo8330a(boolean z, String str, boolean z2) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_GAME_DOWNLOAD_FLOAT_BALL_REMOVE_INT;
        Log.m105925i("MicroMsg.GameDownloadFloatBallHelper", "click stopDownload : %s, checkbox : %s", Boolean.valueOf(!z), Boolean.valueOf(z2));
        if (!z) {
            this.f110310a.mo64037x0();
            if (z2) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, 2);
            }
        } else if (z2) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, 1);
        }
    }
}
