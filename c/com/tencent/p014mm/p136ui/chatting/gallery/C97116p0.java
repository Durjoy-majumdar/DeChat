package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import hd0.C98408n0;
import java.util.HashMap;

/* renamed from: com.tencent.mm.ui.chatting.gallery.p0 */
public class C97116p0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f284950d;

    /* renamed from: e */
    public final /* synthetic */ boolean f284951e;

    /* renamed from: f */
    public final /* synthetic */ ImageGalleryVideoHandler f284952f;

    public C97116p0(ImageGalleryVideoHandler imageGalleryVideoHandler, String str, boolean z) {
        this.f284952f = imageGalleryVideoHandler;
        this.f284950d = str;
        this.f284951e = z;
    }

    public void run() {
        C72963f4 f4Var;
        Log.m105925i("MicroMsg.Imagegallery.handler.video", "prepare video filename %s isOnlinePlay %b ", this.f284950d, Boolean.valueOf(this.f284951e));
        HashMap<String, ImageGalleryVideoHandler$$k> hashMap = this.f284952f.f284579i;
        if (hashMap == null) {
            Log.m105928w("MicroMsg.Imagegallery.handler.video", "prepare video but cache map is null.");
            return;
        }
        ImageGalleryVideoHandler$$k imageGalleryVideoHandler$$k = hashMap.get(this.f284950d);
        if (imageGalleryVideoHandler$$k != null && (f4Var = imageGalleryVideoHandler$$k.f284606a) != null) {
            C98408n0 o = C97052g.m124927o(f4Var);
            int f8 = this.f284952f.f284638d.f284714g.mo135768f8();
            int i = imageGalleryVideoHandler$$k.f284607b;
            if (f8 == i) {
                this.f284952f.mo135834K(imageGalleryVideoHandler$$k.f284606a, o, i, this.f284951e);
                this.f284952f.mo135838O(this.f284950d);
                return;
            }
            Log.m105929w("MicroMsg.Imagegallery.handler.video", "playVideo, but currentItem is not correct.[%d, %d]", Integer.valueOf(this.f284952f.f284638d.f284714g.mo135768f8()), Integer.valueOf(imageGalleryVideoHandler$$k.f284607b));
        }
    }
}
