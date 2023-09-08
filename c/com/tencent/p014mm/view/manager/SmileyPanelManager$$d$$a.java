package com.tencent.p014mm.view.manager;

import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72837v1;

/* renamed from: com.tencent.mm.view.manager.SmileyPanelManager$$d$$a */
public final /* synthetic */ class SmileyPanelManager$$d$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SmileyPanelManager$$d f285739d;

    /* renamed from: e */
    public final /* synthetic */ IEmojiInfo f285740e;

    public /* synthetic */ SmileyPanelManager$$d$$a(SmileyPanelManager$$d smileyPanelManager$$d, IEmojiInfo iEmojiInfo) {
        this.f285739d = smileyPanelManager$$d;
        this.f285740e = iEmojiInfo;
    }

    public final void run() {
        SmileyPanelManager$$d smileyPanelManager$$d = this.f285739d;
        IEmojiInfo iEmojiInfo = this.f285740e;
        C72837v1 v1Var = smileyPanelManager$$d.f285743a.f285696A;
        if (v1Var != null) {
            v1Var.mo65586X1(iEmojiInfo);
        }
        Runnable runnable = smileyPanelManager$$d.f285743a.f285700E;
        if (runnable != null) {
            runnable.run();
            smileyPanelManager$$d.f285743a.f285700E = null;
        }
    }
}
