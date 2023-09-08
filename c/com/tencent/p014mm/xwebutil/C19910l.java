package com.tencent.p014mm.xwebutil;

import java.util.TimerTask;

/* renamed from: com.tencent.mm.xwebutil.l */
public class C19910l extends TimerTask {

    /* renamed from: d */
    public final /* synthetic */ XWebAudioPlayerProgress f56755d;

    public C19910l(XWebAudioPlayerProgress xWebAudioPlayerProgress) {
        this.f56755d = xWebAudioPlayerProgress;
    }

    public void run() {
        Runnable runnable;
        XWebAudioPlayerProgress xWebAudioPlayerProgress = this.f56755d;
        XWebAudioPlayerProgressBall xWebAudioPlayerProgressBall = xWebAudioPlayerProgress.f56703i;
        if (xWebAudioPlayerProgressBall != null && (runnable = xWebAudioPlayerProgress.f56706o) != null) {
            xWebAudioPlayerProgressBall.post(runnable);
        }
    }
}
