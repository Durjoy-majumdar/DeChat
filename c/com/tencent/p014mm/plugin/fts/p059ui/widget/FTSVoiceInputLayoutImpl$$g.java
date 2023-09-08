package com.tencent.p014mm.plugin.fts.p059ui.widget;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl$$g */
public class FTSVoiceInputLayoutImpl$$g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f52888d;

    /* renamed from: e */
    public final /* synthetic */ FTSVoiceInputLayoutImpl f52889e;

    public FTSVoiceInputLayoutImpl$$g(FTSVoiceInputLayoutImpl fTSVoiceInputLayoutImpl, int i) {
        this.f52889e = fTSVoiceInputLayoutImpl;
        this.f52888d = i;
    }

    public void run() {
        C68992b bVar = this.f52889e.f52875s;
        int i = this.f52888d;
        bVar.getClass();
        boolean z = true;
        Log.m105919d("MicroMsg.FTSVoiceInputDrawable", "recordingState() called with: maxAmplitudeRate = [%s]", Integer.valueOf(i));
        if (i >= 10) {
            z = false;
        }
        bVar.f198251l = z;
        bVar.invalidateSelf();
        bVar.getClass();
    }
}
