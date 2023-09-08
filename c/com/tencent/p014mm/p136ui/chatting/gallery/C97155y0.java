package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87413o;
import hd0.C98410o0;
import p682rz.C101488s;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.ui.chatting.gallery.y0 */
public final class C97155y0 extends C87413o implements C32226l<Throwable, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C97156z0 f285097d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97155y0(C97156z0 z0Var) {
        super(1);
        this.f285097d = z0Var;
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        Log.m105928w("MicroMsg.Imagegallery.handler.video.tp", "download job is canceled");
        ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137731u(this.f285097d);
        return C13598b0.f38549a;
    }
}
