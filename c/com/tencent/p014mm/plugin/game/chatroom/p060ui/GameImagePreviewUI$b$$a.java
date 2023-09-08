package com.tencent.p014mm.plugin.game.chatroom.p060ui;

import com.tencent.p014mm.plugin.game.chatroom.p060ui.GameImagePreviewUI;

/* renamed from: com.tencent.mm.plugin.game.chatroom.ui.GameImagePreviewUI$b$$a */
public final /* synthetic */ class GameImagePreviewUI$b$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GameImagePreviewUI.C94080b f271661d;

    /* renamed from: e */
    public final /* synthetic */ String f271662e;

    public /* synthetic */ GameImagePreviewUI$b$$a(GameImagePreviewUI.C94080b bVar, String str) {
        this.f271661d = bVar;
        this.f271662e = str;
    }

    public final void run() {
        GameImagePreviewUI.C94080b bVar = this.f271661d;
        String str = this.f271662e;
        GameImagePreviewUI gameImagePreviewUI = GameImagePreviewUI.this;
        int i = GameImagePreviewUI.f271648q;
        gameImagePreviewUI.mo129095I7(str, false);
    }
}
