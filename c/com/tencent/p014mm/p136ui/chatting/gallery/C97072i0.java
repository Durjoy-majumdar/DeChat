package com.tencent.p014mm.p136ui.chatting.gallery;

import android.view.Display;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.ui.chatting.gallery.i0 */
public class C97072i0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f284775d;

    /* renamed from: e */
    public final /* synthetic */ ImageGalleryUI f284776e;

    public C97072i0(ImageGalleryUI imageGalleryUI, int i) {
        this.f284776e = imageGalleryUI;
        this.f284775d = i;
    }

    public void run() {
        ImageGalleryUI imageGalleryUI = this.f284776e;
        if (!imageGalleryUI.f284469t) {
            int i = this.f284775d;
            if (i >= 100) {
                i = 99;
            }
            imageGalleryUI.mo135753X8(false);
            ImageGalleryUI imageGalleryUI2 = this.f284776e;
            imageGalleryUI2.mo135743S8(imageGalleryUI2.f284359H, 8);
            Display display = this.f284776e.getContentView().getDisplay();
            if (!(display == null || display.getRotation() == 0 || display.getRotation() == 2 || this.f284776e.f284362I.getVisibility() == 0)) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f284776e.f284400U0.getLayoutParams();
                layoutParams.addRule(1, C0966R.C0970id.m8w);
                this.f284776e.f284400U0.setLayoutParams(layoutParams);
            }
            ImageGalleryUI imageGalleryUI3 = this.f284776e;
            imageGalleryUI3.mo135743S8(imageGalleryUI3.f284362I, 0);
            ImageGalleryUI imageGalleryUI4 = this.f284776e;
            Button button = imageGalleryUI4.f284362I;
            button.setText(imageGalleryUI4.getString(C0966R.string.m0d, new Object[]{i + "%"}));
        }
    }
}
