package com.tencent.p014mm.plugin.luckymoney.story;

import android.view.View;
import com.tencent.p014mm.plugin.luckymoney.story.EnvelopeStoryVideoManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.b0 */
public class C94183b0 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ EnvelopeStoryVideoManager.C94180e f272098g;

    /* renamed from: h */
    public final /* synthetic */ EnvelopeStoryVideoManager f272099h;

    public C94183b0(EnvelopeStoryVideoManager envelopeStoryVideoManager, EnvelopeStoryVideoManager.C94180e eVar) {
        this.f272099h = envelopeStoryVideoManager;
        this.f272098g = eVar;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        EnvelopeStoryVideoManager envelopeStoryVideoManager = this.f272099h;
        if (envelopeStoryVideoManager.f272051e != -1) {
            EnvelopeStoryVideoManager.C94180e eVar = this.f272098g;
            if (eVar.f272081m != null) {
                envelopeStoryVideoManager.getClass();
                EnvelopeStoryVideoView envelopeStoryVideoView = eVar.f272081m;
                if (envelopeStoryVideoView != null) {
                    boolean z = !envelopeStoryVideoView.f272091h1;
                    envelopeStoryVideoManager.f272052f = z;
                    Log.m105925i("MicroMsg.EnvelopeStoryVideoManager", "click to mute: %s", Boolean.valueOf(z));
                    eVar.f272081m.setMute(envelopeStoryVideoManager.f272052f);
                    if (!envelopeStoryVideoManager.f272052f) {
                        envelopeStoryVideoManager.f272053g.mo139415b();
                        envelopeStoryVideoManager.f272054h = true;
                    } else if (envelopeStoryVideoManager.f272054h) {
                        envelopeStoryVideoManager.f272053g.mo139414a();
                        envelopeStoryVideoManager.f272054h = false;
                    }
                    envelopeStoryVideoManager.mo129408h(eVar);
                }
            }
        }
    }
}
