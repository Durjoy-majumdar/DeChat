package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.ui.chatting.component.e3 */
public final class C73466e3 implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ LoadableTextView f215874d;

    public C73466e3(LoadableTextView loadableTextView) {
        this.f215874d = loadableTextView;
    }

    public final boolean onTimerExpired() {
        int dotCounter = this.f215874d.getDotCounter() % 3;
        LoadableTextView loadableTextView = this.f215874d;
        loadableTextView.setDotCounter(loadableTextView.getDotCounter() + 1);
        if (dotCounter == 0) {
            this.f215874d.setDotStr("·");
        } else if (dotCounter == 1) {
            this.f215874d.setDotStr("··");
        } else if (dotCounter == 2) {
            this.f215874d.setDotStr("···");
        }
        LoadableTextView loadableTextView2 = this.f215874d;
        if (loadableTextView2.f215647j) {
            loadableTextView2.setText(loadableTextView2.f215648n + loadableTextView2.f215650p);
        } else {
            loadableTextView2.setText(loadableTextView2.f215648n);
        }
        return true;
    }
}
