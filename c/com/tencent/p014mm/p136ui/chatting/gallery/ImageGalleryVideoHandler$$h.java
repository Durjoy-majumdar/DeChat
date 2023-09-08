package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import hd0.C98429r0;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoHandler$$h */
public class ImageGalleryVideoHandler$$h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImageGalleryVideoHandler f284603d;

    public ImageGalleryVideoHandler$$h(ImageGalleryVideoHandler imageGalleryVideoHandler) {
        this.f284603d = imageGalleryVideoHandler;
    }

    public void run() {
        int i;
        try {
            C97087m1 v = this.f284603d.f284638d.mo135934v();
            v.mo135970f();
            if (Util.isNullOrNil(v.f284849p.getVideoPath())) {
                ImageGalleryVideoHandler imageGalleryVideoHandler = this.f284603d;
                i = C98429r0.m127811b(imageGalleryVideoHandler.f284582o.f285003i, imageGalleryVideoHandler.f284593z);
            } else {
                C97087m1 v2 = this.f284603d.f284638d.mo135934v();
                v2.mo135970f();
                i = v2.f284849p.getCurrentPosition() / 1000;
            }
            this.f284603d.f284582o.mo136034d(i);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Imagegallery.handler.video", e, "start timer error[%s]", e.toString());
        }
        this.f284603d.f284570H.startTimer(500);
    }
}
