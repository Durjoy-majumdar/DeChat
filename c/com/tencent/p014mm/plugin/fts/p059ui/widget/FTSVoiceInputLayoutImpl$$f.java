package com.tencent.p014mm.plugin.fts.p059ui.widget;

import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl$$f */
public class FTSVoiceInputLayoutImpl$$f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FTSVoiceInputLayoutImpl f52887d;

    public FTSVoiceInputLayoutImpl$$f(FTSVoiceInputLayoutImpl fTSVoiceInputLayoutImpl) {
        this.f52887d = fTSVoiceInputLayoutImpl;
    }

    public void run() {
        FTSVoiceInputLayoutImpl fTSVoiceInputLayoutImpl = this.f52887d;
        int i = FTSVoiceInputLayoutImpl.f52872y;
        fTSVoiceInputLayoutImpl.getClass();
        MMHandlerThread.postToMainThreadDelayed(new C18878d(fTSVoiceInputLayoutImpl), 100);
        this.f52887d.f52875s.mo94950c();
    }
}
