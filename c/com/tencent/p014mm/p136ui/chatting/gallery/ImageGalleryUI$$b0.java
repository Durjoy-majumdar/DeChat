package com.tencent.p014mm.p136ui.chatting.gallery;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$b0 */
public class ImageGalleryUI$$b0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ImageGalleryUI f284496d;

    public ImageGalleryUI$$b0(ImageGalleryUI imageGalleryUI) {
        this.f284496d = imageGalleryUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$38", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ImageGalleryUI imageGalleryUI = this.f284496d;
        int i = ImageGalleryUI.f284337S2;
        imageGalleryUI.mo135740R7(5);
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$38", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
