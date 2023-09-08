package com.tencent.p014mm.plugin.game.chatroom.p060ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.chatroom.p060ui.GameImagePreviewUI;

/* renamed from: com.tencent.mm.plugin.game.chatroom.ui.GameImagePreviewUI$b$$b */
public class GameImagePreviewUI$b$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GameImagePreviewUI.C94080b f271663d;

    public GameImagePreviewUI$b$$b(GameImagePreviewUI.C94080b bVar) {
        this.f271663d = bVar;
    }

    public void run() {
        GameImagePreviewUI.this.f271650e.f286281c.setVisibility(8);
        GameImagePreviewUI.this.f271650e.f286279a.setVisibility(8);
        GameImagePreviewUI.this.f271650e.f286282d.setVisibility(8);
        GameImagePreviewUI.this.f271650e.f286280b.setVisibility(8);
        GameImagePreviewUI.this.f271650e.f286279a.setVisibility(0);
        GameImagePreviewUI.this.f271650e.f286279a.setImageResource(C0966R.raw.image_download_fail_icon);
    }
}
