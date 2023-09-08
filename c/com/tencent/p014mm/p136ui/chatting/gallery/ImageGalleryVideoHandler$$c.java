package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoHandler$$c */
public class ImageGalleryVideoHandler$$c implements C96875r0.C96879e {

    /* renamed from: d */
    public final /* synthetic */ ImageGalleryVideoHandler f284597d;

    public ImageGalleryVideoHandler$$c(ImageGalleryVideoHandler imageGalleryVideoHandler) {
        this.f284597d = imageGalleryVideoHandler;
    }

    /* renamed from: r */
    public void mo79636r() {
        Log.m105925i("MicroMsg.Imagegallery.handler.video", "%d on texture update.", Integer.valueOf(this.f284597d.hashCode()));
        try {
            this.f284597d.f284638d.mo135934v().mo135973i(true, 1.0f);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.Imagegallery.handler.video", "texture view update. error " + e.toString());
        }
    }
}
