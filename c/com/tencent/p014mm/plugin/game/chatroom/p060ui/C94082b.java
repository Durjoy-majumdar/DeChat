package com.tencent.p014mm.plugin.game.chatroom.p060ui;

import android.graphics.Bitmap;
import com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult;
import d20.C20382b;

/* renamed from: com.tencent.mm.plugin.game.chatroom.ui.b */
public class C94082b implements C20382b {

    /* renamed from: a */
    public final /* synthetic */ GameImagePreviewUI f271664a;

    public C94082b(GameImagePreviewUI gameImagePreviewUI) {
        this.f271664a = gameImagePreviewUI;
    }

    public void onImageLoadError(ImageDecodeResult imageDecodeResult) {
    }

    public void onImageLoaded(Bitmap bitmap) {
        this.f271664a.f271650e.f286280b.setVisibility(8);
    }

    public void onPreviewLoadError(ImageDecodeResult imageDecodeResult) {
    }

    public void onPreviewLoaded() {
    }

    public void onPreviewReleased() {
    }

    public void onReady() {
    }

    public void onTileLoadError(ImageDecodeResult imageDecodeResult) {
    }
}
