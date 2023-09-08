package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import hd0.C98429r0;
import xn2.C102693c;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoHandler$$b */
public class ImageGalleryVideoHandler$$b implements C102693c {

    /* renamed from: d */
    public final /* synthetic */ ImageGalleryVideoHandler f284596d;

    public ImageGalleryVideoHandler$$b(ImageGalleryVideoHandler imageGalleryVideoHandler) {
        this.f284596d = imageGalleryVideoHandler;
    }

    /* renamed from: a */
    public void mo4335a(int i) {
        String str;
        try {
            C97087m1 v = this.f284596d.f284638d.mo135934v();
            v.mo135970f();
            str = v.f284849p.getVideoPath();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Imagegallery.handler.video", e, "", new Object[0]);
            Log.m105920e("MicroMsg.Imagegallery.handler.video", "on seek get video path error: " + e.toString());
            str = null;
        }
        boolean z = true;
        Log.m105925i("MicroMsg.Imagegallery.handler.video", "on seek to time[%d] isOnlinePlay[%b] videoPath[%s]", Integer.valueOf(i), Boolean.valueOf(this.f284596d.f284584q), str);
        C97087m1 v2 = this.f284596d.f284638d.mo135934v();
        v2.mo135970f();
        v2.f284848o.setVisibility(8);
        if (!Util.isNullOrNil(str)) {
            ImageGalleryVideoHandler imageGalleryVideoHandler = this.f284596d;
            if (!imageGalleryVideoHandler.f284584q) {
                imageGalleryVideoHandler.mo135837N(i, true);
            } else {
                z = imageGalleryVideoHandler.f284582o.mo136042l(i, true);
            }
            if (z) {
                this.f284596d.mo135840Q(false);
            }
        } else {
            C72963f4 w = this.f284596d.f284638d.mo135935w();
            if (w != null && w.mo100994f4()) {
                C98429r0.m127832w(w.mo108765s2(), i * 1000, this.f284596d.f284584q);
            }
            C97056h hVar = this.f284596d.f284638d;
            hVar.mo135921P(hVar.f284714g.mo135768f8());
        }
        this.f284596d.f284638d.f284714g.mo135763c9();
        C72963f4 w2 = this.f284596d.f284638d.mo135935w();
        if (w2 != null && w2.mo100983V3()) {
            this.f284596d.f284638d.f284714g.f284478w.mo136024c(w2, 13);
        }
    }

    /* renamed from: c */
    public void mo4336c(int i) {
    }

    public void onSeekPre() {
        if (this.f284596d.f284638d.mo135934v() != null) {
            ImageGalleryVideoHandler imageGalleryVideoHandler = this.f284596d;
            imageGalleryVideoHandler.mo135832I(imageGalleryVideoHandler.f284638d.mo135934v());
        }
        this.f284596d.f284638d.f284714g.mo135767e9();
    }
}
