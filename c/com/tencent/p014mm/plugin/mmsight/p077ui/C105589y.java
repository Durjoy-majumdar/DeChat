package com.tencent.p014mm.plugin.mmsight.p077ui;

import com.tencent.p014mm.plugin.mmsight.segment.C105476b;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.y */
public class C105589y implements C105476b {

    /* renamed from: d */
    public final /* synthetic */ C105562q f314037d;

    public C105589y(C105562q qVar) {
        this.f314037d = qVar;
    }

    /* renamed from: g */
    public void mo139245g(boolean z, float f, float f2) {
    }

    /* renamed from: l */
    public void mo139248l(boolean z, float f, float f2) {
        VideoPlayerTextureView videoPlayerTextureView = this.f314037d.f313989h;
        if (videoPlayerTextureView != null) {
            videoPlayerTextureView.pause();
        }
    }

    /* renamed from: m */
    public void mo139249m(boolean z, float f, float f2) {
        C105562q qVar = this.f314037d;
        if (qVar.f313989h != null) {
            float f3 = (float) qVar.f313984c;
            qVar.f313985d = Math.round(f3 * f);
            this.f314037d.f313986e = Math.round(f3 * f2);
            C105562q qVar2 = this.f314037d;
            if (qVar2.f313986e <= 0) {
                qVar2.f313986e = 1000;
            }
            qVar2.f313989h.mo24787a((double) qVar2.f313985d, true);
            Log.m105925i("MicroMsg.MMSightVideoEditor", "onUp, start: %s, end: %s %s %s", Integer.valueOf(this.f314037d.f313985d), Integer.valueOf(this.f314037d.f313986e), Float.valueOf(f), Float.valueOf(f2));
        }
    }

    /* renamed from: q */
    public void mo139251q(float f, float f2) {
        C105562q qVar = this.f314037d;
        if (qVar.f313989h != null) {
            float f3 = (float) qVar.f313984c;
            qVar.f313985d = Math.round(f3 * f);
            this.f314037d.f313986e = Math.round(f3 * f2);
            Log.m105925i("MicroMsg.MMSightVideoEditor", "onRecyclerChanged, start: %s, end: %s %s %s", Integer.valueOf(this.f314037d.f313985d), Integer.valueOf(this.f314037d.f313986e), Float.valueOf(f), Float.valueOf(f2));
            C105562q qVar2 = this.f314037d;
            qVar2.f313989h.mo24787a((double) qVar2.f313985d, true);
        }
    }
}
