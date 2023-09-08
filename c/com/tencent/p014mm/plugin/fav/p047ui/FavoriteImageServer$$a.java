package com.tencent.p014mm.plugin.fav.p047ui;

import pb1.C100734q;
import pb1.C100755z;
import te3.C101834rc0;

/* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteImageServer$$a */
public final /* synthetic */ class FavoriteImageServer$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f269881d;

    /* renamed from: e */
    public final /* synthetic */ C100755z f269882e;

    /* renamed from: f */
    public final /* synthetic */ C101834rc0 f269883f;

    public /* synthetic */ FavoriteImageServer$$a(String str, C100755z zVar, C101834rc0 rc02) {
        this.f269881d = str;
        this.f269882e = zVar;
        this.f269883f = rc02;
    }

    public final void run() {
        String str = this.f269881d;
        C100755z zVar = this.f269882e;
        C101834rc0 rc02 = this.f269883f;
        if (FavoriteImageServer.m118082k(str)) {
            C100734q.m131857k0(zVar, rc02, true);
        }
    }
}
