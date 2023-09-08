package com.tencent.p014mm.p136ui.chatting.gallery;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: com.tencent.mm.ui.chatting.gallery.l0 */
public class C97082l0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ View f284797d;

    /* renamed from: e */
    public final /* synthetic */ ImageGalleryUI f284798e;

    public C97082l0(ImageGalleryUI imageGalleryUI, View view) {
        this.f284798e = imageGalleryUI;
        this.f284797d = view;
    }

    public void onGlobalLayout() {
        this.f284797d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        ImageGalleryUI.m124726H7(this.f284798e);
    }
}
