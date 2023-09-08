package com.tencent.p014mm.plugin.game.media;

import com.tencent.p014mm.plugin.game.media.GameLocalGalleryView;

/* renamed from: com.tencent.mm.plugin.game.media.d */
public class C94117d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GameLocalGalleryView.C94092f f271817d;

    public C94117d(GameLocalGalleryView.C94092f fVar) {
        this.f271817d = fVar;
    }

    public void run() {
        this.f271817d.notifyDataSetChanged();
    }
}
