package com.tencent.p014mm.p136ui.chatting.gallery;

import android.widget.CheckBox;
import com.tencent.p014mm.p136ui.chatting.gallery.C73708v;
import com.tencent.p014mm.p136ui.chatting.gallery.C97056h;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$n */
public class ImageGalleryUI$$n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImageGalleryUI f284524d;

    public ImageGalleryUI$$n(ImageGalleryUI imageGalleryUI) {
        this.f284524d = imageGalleryUI;
    }

    public void run() {
        CheckBox checkBox;
        ImageGalleryUI imageGalleryUI = this.f284524d;
        C97056h hVar = imageGalleryUI.f284432g;
        if (hVar != null) {
            C73708v vVar = C73708v.C73710b.f216437a;
            if (vVar.f216435b && (checkBox = imageGalleryUI.f284440i2) != null) {
                checkBox.setChecked(vVar.mo102780d(hVar.mo135935w()));
                ImageGalleryUI imageGalleryUI2 = this.f284524d;
                imageGalleryUI2.f284443j2.setOnClickListener(imageGalleryUI2);
            }
            int i = C97056h.C97063f.f284741p;
            if (this.f284524d.f284450n.getCurrentItem() == i) {
                this.f284524d.mo135763c9();
                C97056h.C97067g B = C97056h.m124949B(this.f284524d.f284432g.mo135937y(i));
                ImageGalleryUI imageGalleryUI3 = this.f284524d;
                if (!imageGalleryUI3.f284483x1 && B == C97056h.C97067g.video) {
                    imageGalleryUI3.f284432g.mo135921P(i);
                }
                if (B == C97056h.C97067g.sight) {
                    this.f284524d.f284432g.mo135917L(i);
                }
            }
        }
    }
}
