package com.tencent.p014mm.p136ui.chatting.gallery;

import android.view.View;
import com.tencent.p014mm.autogen.events.CancelScanTranslationEvent;
import j20.C117292a;
import java.util.ArrayList;
import tk2.C101903a;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$g */
public class ImageGalleryUI$$g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ImageGalleryUI f284510d;

    public ImageGalleryUI$$g(ImageGalleryUI imageGalleryUI) {
        this.f284510d = imageGalleryUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C101903a aVar = this.f284510d.f284420b2;
        if (aVar != null && !aVar.mo33392i()) {
            this.f284510d.mo135730M7();
        }
        CancelScanTranslationEvent cancelScanTranslationEvent = new CancelScanTranslationEvent();
        CancelScanTranslationEvent.C92467a aVar2 = cancelScanTranslationEvent.f264645d;
        aVar2.f264646a = 1;
        aVar2.f264647b = this.f284510d.f284351E1;
        cancelScanTranslationEvent.publish();
        this.f284510d.mo135756Z7(false);
        this.f284510d.f284351E1 = 0;
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
