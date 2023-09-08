package com.tencent.p014mm.plugin.fts.p059ui.widget;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl$$a */
public final /* synthetic */ class FTSVoiceInputLayoutImpl$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FTSVoiceInputLayoutImpl f52881d;

    public /* synthetic */ FTSVoiceInputLayoutImpl$$a(FTSVoiceInputLayoutImpl fTSVoiceInputLayoutImpl) {
        this.f52881d = fTSVoiceInputLayoutImpl;
    }

    public final void run() {
        C68992b bVar = this.f52881d.f52875s;
        Log.m105919d("MicroMsg.FTSVoiceInputDrawable", "disableState %s", Integer.valueOf(bVar.f198253n));
        bVar.f198253n = 5;
        bVar.invalidateSelf();
    }
}
