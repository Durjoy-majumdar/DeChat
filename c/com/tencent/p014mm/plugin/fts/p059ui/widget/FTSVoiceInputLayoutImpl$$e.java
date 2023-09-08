package com.tencent.p014mm.plugin.fts.p059ui.widget;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl$$e */
public class FTSVoiceInputLayoutImpl$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FTSVoiceInputLayoutImpl f52886d;

    public FTSVoiceInputLayoutImpl$$e(FTSVoiceInputLayoutImpl fTSVoiceInputLayoutImpl) {
        this.f52886d = fTSVoiceInputLayoutImpl;
    }

    public void run() {
        C68992b bVar = this.f52886d.f52875s;
        Log.m105919d("MicroMsg.FTSVoiceInputDrawable", "recognizingState %s", Integer.valueOf(bVar.f198253n));
        bVar.f198253n = 4;
    }
}
