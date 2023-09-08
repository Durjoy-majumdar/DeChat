package com.tencent.p014mm.p136ui.chatting.gallery;

/* renamed from: com.tencent.mm.ui.chatting.gallery.g0 */
public class C97055g0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f284709d;

    /* renamed from: e */
    public final /* synthetic */ ImageGalleryUI f284710e;

    public C97055g0(ImageGalleryUI imageGalleryUI, int i) {
        this.f284710e = imageGalleryUI;
        this.f284709d = i;
    }

    public void run() {
        C97056h hVar = this.f284710e.f284432g;
        if (hVar != null) {
            hVar.f284720p.mo135849v(this.f284709d);
        }
    }
}
