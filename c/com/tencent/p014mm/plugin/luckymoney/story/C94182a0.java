package com.tencent.p014mm.plugin.luckymoney.story;

import android.view.View;
import com.tencent.p014mm.plugin.luckymoney.story.EnvelopeStoryVideoManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import java.util.Set;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.a0 */
public class C94182a0 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ EnvelopeStoryVideoManager.C94180e f272096g;

    /* renamed from: h */
    public final /* synthetic */ EnvelopeStoryVideoManager f272097h;

    public C94182a0(EnvelopeStoryVideoManager envelopeStoryVideoManager, EnvelopeStoryVideoManager.C94180e eVar) {
        this.f272097h = envelopeStoryVideoManager;
        this.f272096g = eVar;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105924i("MicroMsg.EnvelopeStoryVideoManager", "click play btn");
        EnvelopeStoryVideoView envelopeStoryVideoView = this.f272096g.f272081m;
        if (envelopeStoryVideoView == null || !envelopeStoryVideoView.isPlaying()) {
            this.f272096g.f272084p.setVisibility(4);
            EnvelopeStoryVideoManager envelopeStoryVideoManager = this.f272097h;
            EnvelopeStoryVideoManager.C94180e eVar = this.f272096g;
            Set<String> set = EnvelopeStoryVideoManager.f272049j;
            envelopeStoryVideoManager.mo129405d(eVar);
        }
    }
}
