package com.tencent.p014mm.plugin.game.media;

import com.tencent.p014mm.plugin.game.media.GameLocalGalleryView;

/* renamed from: com.tencent.mm.plugin.game.media.e */
public class C94118e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GameLocalGalleryView.C94092f f271818d;

    public C94118e(GameLocalGalleryView.C94092f fVar) {
        this.f271818d = fVar;
    }

    public void run() {
        this.f271818d.notifyDataSetChanged();
    }
}
