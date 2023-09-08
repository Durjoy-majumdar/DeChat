package com.tencent.p014mm.plugin.luckymoney.story;

import com.tencent.p014mm.p136ui.MMActivity;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.v */
public class C69330v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EnvelopeStoryVideoManager f199620d;

    public C69330v(EnvelopeStoryVideoManager envelopeStoryVideoManager) {
        this.f199620d = envelopeStoryVideoManager;
    }

    public void run() {
        EnvelopeStoryVideoManager envelopeStoryVideoManager = this.f199620d;
        MMActivity mMActivity = envelopeStoryVideoManager.f272050d;
        if (mMActivity != null) {
            mMActivity.getSupportActionBar().mo91099j().setOnTouchListener(new C69311c0(envelopeStoryVideoManager));
        }
    }
}
