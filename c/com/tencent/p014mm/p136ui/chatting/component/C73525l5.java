package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.chatting.component.l5 */
public final class C73525l5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TranslateControllerView f215975d;

    public C73525l5(TranslateControllerView translateControllerView) {
        this.f215975d = translateControllerView;
    }

    public final void run() {
        Log.m105924i(this.f215975d.f215707e, "showLanguage: postDelayed");
        TranslateControllerView translateControllerView = this.f215975d;
        translateControllerView.mo102317a(translateControllerView.f215708f, translateControllerView.f215709g);
    }
}
