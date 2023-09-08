package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$v */
public class ImageGalleryUI$$v implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ ImageGalleryUI f284545d;

    public ImageGalleryUI$$v(ImageGalleryUI imageGalleryUI) {
        this.f284545d = imageGalleryUI;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.clear();
        e0Var.mo107144g(5, this.f284545d.getString(C0966R.string.b8e), C0966R.raw.icons_outlined_chats);
    }
}
