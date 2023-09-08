package com.tencent.p014mm.plugin.fav.p047ui;

import pb1.C100734q;
import pb1.C100755z;
import te3.C101834rc0;

/* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteImageServer$$f */
public final /* synthetic */ class FavoriteImageServer$$f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f269903d;

    /* renamed from: e */
    public final /* synthetic */ String f269904e;

    /* renamed from: f */
    public final /* synthetic */ C100755z f269905f;

    /* renamed from: g */
    public final /* synthetic */ C101834rc0 f269906g;

    public /* synthetic */ FavoriteImageServer$$f(boolean z, String str, C100755z zVar, C101834rc0 rc02) {
        this.f269903d = z;
        this.f269904e = str;
        this.f269905f = zVar;
        this.f269906g = rc02;
    }

    public final void run() {
        boolean z = this.f269903d;
        String str = this.f269904e;
        C100755z zVar = this.f269905f;
        C101834rc0 rc02 = this.f269906g;
        if (z || FavoriteImageServer.m118082k(str)) {
            C100734q.m131853i0(zVar, rc02, z);
        }
    }
}
