package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoHandler$$j */
public class ImageGalleryVideoHandler$$j implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ ImageGalleryVideoHandler f284605d;

    public ImageGalleryVideoHandler$$j(ImageGalleryVideoHandler imageGalleryVideoHandler) {
        this.f284605d = imageGalleryVideoHandler;
    }

    public boolean onTimerExpired() {
        C97056h hVar = this.f284605d.f284638d;
        if (hVar == null) {
            Log.m105928w("MicroMsg.Imagegallery.handler.video", "[onTimerExpired] null == adapter");
            return false;
        }
        C97087m1 v = hVar.mo135934v();
        if (v == null || v.f284845l == null) {
            return false;
        }
        v.mo135970f();
        if (v.f284845l.getVisibility() != 0) {
            return false;
        }
        int f8 = this.f284605d.f284638d.f284714g.mo135768f8();
        if (this.f284605d.f284581n.get(f8) == null) {
            this.f284605d.mo135850w(f8);
            return false;
        }
        v.mo135970f();
        if (!v.f284849p.isPlaying()) {
            Log.m105924i("MicroMsg.Imagegallery.handler.video", "it is not playing, stop offline timer");
            return false;
        }
        ImageGalleryVideoHandler imageGalleryVideoHandler = this.f284605d;
        v.mo135970f();
        imageGalleryVideoHandler.f284588u = v.f284849p.getCurrentPosition();
        ImageGalleryVideoHandler imageGalleryVideoHandler2 = this.f284605d;
        imageGalleryVideoHandler2.mo135841R(imageGalleryVideoHandler2.f284588u / 1000);
        return true;
    }
}
