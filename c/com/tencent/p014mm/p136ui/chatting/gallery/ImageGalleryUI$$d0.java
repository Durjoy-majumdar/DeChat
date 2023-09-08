package com.tencent.p014mm.p136ui.chatting.gallery;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$d0 */
public class ImageGalleryUI$$d0 implements C97122r1 {

    /* renamed from: a */
    public final /* synthetic */ ImageGalleryUI f284502a;

    public ImageGalleryUI$$d0(ImageGalleryUI imageGalleryUI) {
        this.f284502a = imageGalleryUI;
    }

    /* renamed from: a */
    public void mo135801a(long j, View view, String str, Bitmap bitmap) {
        if (view != null && bitmap != null && !Util.isNullOrNil(str)) {
            Log.m105925i("MicroMsg.ImageGalleryUI", "alvinluo onImageLoaded msgId: %d, currentMsgId: %d, imagePath: %s, bitmap: %s", Long.valueOf(j), Long.valueOf(this.f284502a.f284341B), str, Integer.valueOf(bitmap.hashCode()));
            ImageGalleryUI imageGalleryUI = this.f284502a;
            imageGalleryUI.mo135748V7(view, str, bitmap, 1, imageGalleryUI.f284407W1);
            ImageGalleryUI imageGalleryUI2 = this.f284502a;
            if (j == imageGalleryUI2.f284341B) {
                ImageGalleryUI.m124727I7(imageGalleryUI2, j);
            }
        }
    }
}
