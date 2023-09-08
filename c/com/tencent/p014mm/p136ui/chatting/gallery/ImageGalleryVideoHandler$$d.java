package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C97625j3;
import s62.C110762b;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoHandler$$d */
public class ImageGalleryVideoHandler$$d implements C110762b {

    /* renamed from: a */
    public final /* synthetic */ ImageGalleryVideoHandler f284598a;

    public ImageGalleryVideoHandler$$d(ImageGalleryVideoHandler imageGalleryVideoHandler) {
        this.f284598a = imageGalleryVideoHandler;
    }

    /* renamed from: a */
    public long mo132384a() {
        C97132t1 t1Var;
        Log.m105925i("MicroMsg.Imagegallery.handler.video", "%d video get online cache sec", Integer.valueOf(this.f284598a.hashCode()));
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_VIDEO_NEED_RESET_EXTRACTOR_BOOLEAN, Boolean.TRUE);
        try {
            ImageGalleryVideoHandler imageGalleryVideoHandler = this.f284598a;
            if (!imageGalleryVideoHandler.f284584q || (t1Var = imageGalleryVideoHandler.f284582o) == null) {
                return 0;
            }
            return (long) t1Var.f285006l;
        } catch (Exception unused) {
            return 0;
        }
    }
}
