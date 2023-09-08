package com.tencent.p014mm.p136ui.chatting.gallery;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$j */
public class ImageGalleryUI$$j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ImageGalleryUI f216403d;

    public ImageGalleryUI$$j(ImageGalleryUI imageGalleryUI) {
        this.f216403d = imageGalleryUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f216403d.onBackPressed();
        this.f216403d.overridePendingTransition(0, 0);
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
