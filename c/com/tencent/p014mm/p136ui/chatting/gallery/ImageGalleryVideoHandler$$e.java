package com.tencent.p014mm.p136ui.chatting.gallery;

import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import hd0.C98429r0;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoHandler$$e */
public class ImageGalleryVideoHandler$$e implements MMHandler.Callback {

    /* renamed from: d */
    public final /* synthetic */ ImageGalleryVideoHandler f284599d;

    public ImageGalleryVideoHandler$$e(ImageGalleryVideoHandler imageGalleryVideoHandler) {
        this.f284599d = imageGalleryVideoHandler;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            C97087m1 v = this.f284599d.f284638d.mo135934v();
            if (v != null && !Util.isNullOrNil(this.f284599d.f284593z)) {
                Log.m105925i("MicroMsg.Imagegallery.handler.video", "%d ui on pause, pause video now. %s", Integer.valueOf(hashCode()), this.f284599d.f284593z);
                ImageGalleryVideoHandler imageGalleryVideoHandler = this.f284599d;
                if (!imageGalleryVideoHandler.f284586s) {
                    String str = imageGalleryVideoHandler.f284593z;
                    v.mo135970f();
                    C98429r0.m127832w(str, v.f284849p.getCurrentPosition(), this.f284599d.f284584q);
                }
                this.f284599d.getClass();
                v.mo135970f();
                v.mo135970f();
                if (v.f284849p.isPlaying()) {
                    v.mo135970f();
                    v.mo135972h(v.f284848o, 0);
                }
                this.f284599d.mo135832I(v);
                this.f284599d.f284583p.mo136889a();
                ImageGalleryVideoHandler imageGalleryVideoHandler2 = this.f284599d;
                if (imageGalleryVideoHandler2.f284584q) {
                    imageGalleryVideoHandler2.f284573K.dead();
                    this.f284599d.f284582o.mo136043m();
                    this.f284599d.f284584q = false;
                }
            }
            this.f284599d.f284585r = false;
        }
        return false;
    }
}
