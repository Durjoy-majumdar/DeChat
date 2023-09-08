package com.tencent.p014mm.plugin.fav.p047ui;

import pb1.C100734q;
import pb1.C100755z;
import te3.C101834rc0;

/* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteImageServer$$e */
public final /* synthetic */ class FavoriteImageServer$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f269899d;

    /* renamed from: e */
    public final /* synthetic */ String f269900e;

    /* renamed from: f */
    public final /* synthetic */ C100755z f269901f;

    /* renamed from: g */
    public final /* synthetic */ C101834rc0 f269902g;

    public /* synthetic */ FavoriteImageServer$$e(boolean z, String str, C100755z zVar, C101834rc0 rc02) {
        this.f269899d = z;
        this.f269900e = str;
        this.f269901f = zVar;
        this.f269902g = rc02;
    }

    public final void run() {
        boolean z = this.f269899d;
        String str = this.f269900e;
        C100755z zVar = this.f269901f;
        C101834rc0 rc02 = this.f269902g;
        if (z || FavoriteImageServer.m118082k(str)) {
            C100734q.m131853i0(zVar, rc02, z);
        }
    }
}
