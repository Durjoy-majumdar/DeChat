package com.tencent.p014mm.plugin.fav.p047ui;

import pb1.C100734q;
import pb1.C100755z;
import te3.C101834rc0;

/* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteImageServer$$g */
public final /* synthetic */ class FavoriteImageServer$$g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f269907d;

    /* renamed from: e */
    public final /* synthetic */ C100755z f269908e;

    /* renamed from: f */
    public final /* synthetic */ C101834rc0 f269909f;

    public /* synthetic */ FavoriteImageServer$$g(String str, C100755z zVar, C101834rc0 rc02) {
        this.f269907d = str;
        this.f269908e = zVar;
        this.f269909f = rc02;
    }

    public final void run() {
        String str = this.f269907d;
        C100755z zVar = this.f269908e;
        C101834rc0 rc02 = this.f269909f;
        if (FavoriteImageServer.m118082k(str)) {
            C100734q.m131857k0(zVar, rc02, true);
        }
    }
}
