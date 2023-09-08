package com.tencent.p014mm.p136ui.chatting.gallery;

import android.content.DialogInterface;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.chatting.gallery.f1 */
public final class C97050f1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C97136u0 f284694d;

    /* renamed from: com.tencent.mm.ui.chatting.gallery.f1$a */
    public static final class C97051a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C97136u0 f284695d;

        public C97051a(C97136u0 u0Var) {
            this.f284695d = u0Var;
        }

        public final void run() {
            ImageGalleryUI imageGalleryUI;
            C97056h hVar = this.f284695d.f284638d;
            if (hVar != null && (imageGalleryUI = hVar.f284714g) != null) {
                imageGalleryUI.onBackPressed();
            }
        }
    }

    public C97050f1(C97136u0 u0Var) {
        this.f284694d = u0Var;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (dialogInterface != null) {
            dialogInterface.cancel();
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C97051a(this.f284694d));
    }
}
