package com.tencent.p014mm.plugin.fts.p059ui.widget;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl$$d */
public class FTSVoiceInputLayoutImpl$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f52884d;

    /* renamed from: e */
    public final /* synthetic */ FTSVoiceInputLayoutImpl f52885e;

    public FTSVoiceInputLayoutImpl$$d(FTSVoiceInputLayoutImpl fTSVoiceInputLayoutImpl, boolean z) {
        this.f52885e = fTSVoiceInputLayoutImpl;
        this.f52884d = z;
    }

    public void run() {
        C68992b bVar = this.f52885e.f52875s;
        boolean z = this.f52884d;
        bVar.getClass();
        Log.m105919d("MicroMsg.FTSVoiceInputDrawable", "recordingStartState() called with: maxAmplitudeRate = [%s] fromLongCkick = %s", 0, Boolean.valueOf(z));
        if (!z) {
            bVar.f198253n = 3;
        }
        bVar.f198251l = true;
        bVar.invalidateSelf();
        bVar.getClass();
    }
}
