package com.tencent.p014mm.plugin.fav.p047ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import pb1.C100734q;
import pb1.C100755z;
import te3.C101834rc0;

/* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteImageServer$$c */
public final /* synthetic */ class FavoriteImageServer$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f269891d;

    /* renamed from: e */
    public final /* synthetic */ C100755z f269892e;

    /* renamed from: f */
    public final /* synthetic */ C101834rc0 f269893f;

    /* renamed from: g */
    public final /* synthetic */ String f269894g;

    public /* synthetic */ FavoriteImageServer$$c(String str, C100755z zVar, C101834rc0 rc02, String str2) {
        this.f269891d = str;
        this.f269892e = zVar;
        this.f269893f = rc02;
        this.f269894g = str2;
    }

    public final void run() {
        String str = this.f269891d;
        C100755z zVar = this.f269892e;
        C101834rc0 rc02 = this.f269893f;
        String str2 = this.f269894g;
        if (FavoriteImageServer.m118082k(str)) {
            Log.m105925i("MicroMsg.FavoriteImageServer", "attachVideoImg, needRestartCdnDownload, videoPath:%s", C86013q1.m106448i(str, false));
            C100734q.m131853i0(zVar, rc02, false);
        }
        if (!C86013q1.m106450k(str2)) {
            Log.m105925i("MicroMsg.FavoriteImageServer", "attachVideoImg, restartCdnThumbDownLoad, thumbPath:%s", C86013q1.m106448i(str2, false));
            C100734q.m131857k0(zVar, rc02, true);
        }
    }
}
