package com.tencent.p014mm.plugin.vlog.model;

import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import com.tencent.p014mm.sdk.platformtools.Log;
import u80.C111145g;
import w80.C111742d;

/* renamed from: com.tencent.mm.plugin.vlog.model.n */
public final class C106201n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f316481d;

    /* renamed from: e */
    public final /* synthetic */ C106197k f316482e;

    public C106201n(long j, C106197k kVar) {
        this.f316481d = j;
        this.f316482e = kVar;
    }

    public final void run() {
        Log.m105924i("MicroMsg.CompositionSoftwareEncoder", "render gpu rgb2yuv, timestamp:" + this.f316481d);
        C111145g gVar = this.f316482e.f316463n;
        if (gVar != null) {
            gVar.mo162879m();
        }
        C111742d.C65942b bVar = this.f316482e.f316464o;
        EGLSurface eGLSurface = null;
        EGLExt.eglPresentationTimeANDROID(bVar != null ? bVar.f189591a : null, bVar != null ? bVar.f189592b : null, this.f316481d * ((long) 1000));
        C111742d.C111743a aVar = C111742d.f334647a;
        C111742d.C65942b bVar2 = this.f316482e.f316464o;
        EGLDisplay eGLDisplay = bVar2 != null ? bVar2.f189591a : null;
        if (bVar2 != null) {
            eGLSurface = bVar2.f189592b;
        }
        aVar.mo163474t(eGLDisplay, eGLSurface);
        this.f316482e.f316473x++;
    }
}
