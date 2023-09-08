package com.tencent.p014mm.plugin.fav.p047ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import pb1.C100734q;
import pb1.C100755z;
import te3.C101834rc0;

/* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteImageServer$$d */
public final /* synthetic */ class FavoriteImageServer$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f269895d;

    /* renamed from: e */
    public final /* synthetic */ String f269896e;

    /* renamed from: f */
    public final /* synthetic */ C100755z f269897f;

    /* renamed from: g */
    public final /* synthetic */ C101834rc0 f269898g;

    public /* synthetic */ FavoriteImageServer$$d(boolean z, String str, C100755z zVar, C101834rc0 rc02) {
        this.f269895d = z;
        this.f269896e = str;
        this.f269897f = zVar;
        this.f269898g = rc02;
    }

    public final void run() {
        boolean z = this.f269895d;
        String str = this.f269896e;
        C100755z zVar = this.f269897f;
        C101834rc0 rc02 = this.f269898g;
        Log.m105924i("MicroMsg.FavoriteImageServer", "forceDownload = " + z + ", needRestartCdnDownload = " + FavoriteImageServer.m118082k(str));
        if (z || FavoriteImageServer.m118082k(str)) {
            C100734q.m131853i0(zVar, rc02, z);
        }
    }
}
