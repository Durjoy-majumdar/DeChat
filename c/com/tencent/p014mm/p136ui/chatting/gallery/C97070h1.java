package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.sdk.platformtools.Log;
import m03.C99783d;
import nc3.C34767b;

/* renamed from: com.tencent.mm.ui.chatting.gallery.h1 */
public final class C97070h1 implements C34767b.C21622a {

    /* renamed from: a */
    public final /* synthetic */ C99783d f284771a;

    public C97070h1(C99783d dVar) {
        this.f284771a = dVar;
    }

    /* renamed from: a */
    public void mo17997a(boolean z) {
        Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "onPause: loss focus canDuck " + z);
        this.f284771a.setMute(true);
    }

    public void onResume() {
        Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "onResume: gain focus");
        this.f284771a.setMute(false);
    }

    public void onStop() {
        Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "onStop: loss focus");
    }
}
