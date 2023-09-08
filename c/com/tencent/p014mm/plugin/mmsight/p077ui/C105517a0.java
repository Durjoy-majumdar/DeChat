package com.tencent.p014mm.plugin.mmsight.p077ui;

import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.a0 */
public class C105517a0 implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C105562q f313902d;

    public C105517a0(C105562q qVar) {
        this.f313902d = qVar;
    }

    public boolean onTimerExpired() {
        VideoPlayerTextureView videoPlayerTextureView = this.f313902d.f313989h;
        if (videoPlayerTextureView != null && videoPlayerTextureView.isPlaying()) {
            C105562q qVar = this.f313902d;
            if (qVar.f313986e > 0) {
                int currentPosition = qVar.f313989h.getCurrentPosition();
                C105562q qVar2 = this.f313902d;
                if (currentPosition >= qVar2.f313986e) {
                    qVar2.f313989h.mo24787a((double) qVar2.f313985d, true);
                    C105562q qVar3 = this.f313902d;
                    qVar3.f313982a.setCurrentCursorPosition(((float) qVar3.f313985d) / ((float) qVar3.f313984c));
                }
            }
            C105562q qVar4 = this.f313902d;
            qVar4.f313982a.setCurrentCursorPosition(((float) qVar4.f313989h.getCurrentPosition()) / ((float) this.f313902d.f313984c));
        }
        return true;
    }
}
