package com.tencent.p014mm.plugin.game.chatroom.p060ui;

import android.view.MenuItem;
import android.view.View;
import di3.C86312j;
import f40.C86709a0;
import nj3.C11184p0;
import nj3.C76912y0;
import p140cw.C7138g;

/* renamed from: com.tencent.mm.plugin.game.chatroom.ui.d */
public class C94084d implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ GameImagePreviewUI f271666d;

    public C94084d(GameImagePreviewUI gameImagePreviewUI) {
        this.f271666d = gameImagePreviewUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 1) {
            GameImagePreviewUI gameImagePreviewUI = this.f271666d;
            int i2 = GameImagePreviewUI.f271648q;
            gameImagePreviewUI.getClass();
            if (!C86709a0.m107535s().mo121147n()) {
                C76912y0.m92771j(gameImagePreviewUI, (View) null);
            } else {
                ((C7138g) C86312j.m106911c(C7138g.class)).he0(gameImagePreviewUI.f271657o, gameImagePreviewUI);
            }
        }
    }
}
