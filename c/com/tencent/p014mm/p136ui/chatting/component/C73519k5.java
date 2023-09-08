package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.chatting.component.k5 */
public final class C73519k5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TranslateControllerView f215963d;

    public C73519k5(TranslateControllerView translateControllerView) {
        this.f215963d = translateControllerView;
    }

    public final void run() {
        Log.m105924i(this.f215963d.f215707e, "hideLanguage: postDelayed");
        TranslateControllerView translateControllerView = this.f215963d;
        translateControllerView.mo102317a(translateControllerView.f215708f, 0);
    }
}
