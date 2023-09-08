package com.tencent.p014mm.plugin.game.media.preview;

import com.tencent.p014mm.plugin.game.media.preview.GameVideoPreviewUI;

/* renamed from: com.tencent.mm.plugin.game.media.preview.b */
public class C94135b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GameVideoPreviewUI.C94126h f271875d;

    public C94135b(GameVideoPreviewUI.C94126h hVar) {
        this.f271875d = hVar;
    }

    public void run() {
        this.f271875d.notifyDataSetChanged();
    }
}
