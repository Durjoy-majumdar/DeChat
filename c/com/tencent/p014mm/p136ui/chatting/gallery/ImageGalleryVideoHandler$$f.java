package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.sdk.platformtools.Util;
import hd0.C98429r0;
import java.util.HashMap;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoHandler$$f */
public class ImageGalleryVideoHandler$$f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImageGalleryVideoHandler f284600d;

    public ImageGalleryVideoHandler$$f(ImageGalleryVideoHandler imageGalleryVideoHandler) {
        this.f284600d = imageGalleryVideoHandler;
    }

    public void run() {
        ImageGalleryVideoHandler$$k imageGalleryVideoHandler$$k;
        ImageGalleryVideoHandler imageGalleryVideoHandler = this.f284600d;
        imageGalleryVideoHandler.f284587t = true;
        imageGalleryVideoHandler.f284589v = 0;
        imageGalleryVideoHandler.f284590w = 0;
        imageGalleryVideoHandler.f284583p.mo136889a();
        this.f284600d.mo135830G();
        ImageGalleryVideoHandler imageGalleryVideoHandler2 = this.f284600d;
        if (imageGalleryVideoHandler2.f284584q) {
            imageGalleryVideoHandler2.f284564B = Util.nowMilliSecond();
            this.f284600d.f284582o.mo136043m();
            this.f284600d.f284582o.mo136040j();
            ImageGalleryVideoHandler imageGalleryVideoHandler3 = this.f284600d;
            imageGalleryVideoHandler3.f284584q = false;
            imageGalleryVideoHandler3.f284574L = false;
        }
        ImageGalleryVideoHandler imageGalleryVideoHandler4 = this.f284600d;
        C98429r0.m127832w(imageGalleryVideoHandler4.f284593z, 0, imageGalleryVideoHandler4.f284584q);
        ImageGalleryVideoHandler imageGalleryVideoHandler5 = this.f284600d;
        HashMap<String, ImageGalleryVideoHandler$$k> hashMap = imageGalleryVideoHandler5.f284579i;
        if (hashMap != null && (imageGalleryVideoHandler$$k = hashMap.get(imageGalleryVideoHandler5.f284593z)) != null) {
            C97087m1 v = this.f284600d.f284638d.mo135934v();
            v.mo135970f();
            v.f284849p.stop();
            ImageGalleryVideoHandler imageGalleryVideoHandler6 = this.f284600d;
            imageGalleryVideoHandler6.f284588u = 0;
            imageGalleryVideoHandler6.mo135842g(v, imageGalleryVideoHandler$$k.f284606a, imageGalleryVideoHandler$$k.f284607b);
            this.f284600d.mo135841R(0);
            v.mo135970f();
            if (v.f284858y.getVisibility() != 8) {
                v.mo135970f();
                v.f284858y.setVisibility(8);
            }
        }
    }
}
