package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C72963f4;
import eb0.C75569c4;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.ui.chatting.gallery.c0 */
public class C97040c0 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ ImageGalleryUI f284665d;

    public C97040c0(ImageGalleryUI imageGalleryUI) {
        this.f284665d = imageGalleryUI;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.clear();
        C72963f4 w = this.f284665d.f284432g.mo135935w();
        int k = C75569c4.m90678k(w);
        if (!(k == 3 || k == 4) && !C75569c4.m90692y(w) && !C75569c4.m90671d(w)) {
            e0Var.mo107142f(0, this.f284665d.getString(C0966R.string.i4e));
            String string = this.f284665d.getString(C0966R.string.iaq);
            if (C97056h.m124953H(w) || C97056h.m124952F(w)) {
                string = this.f284665d.getString(C0966R.string.iam);
            } else if ((C97056h.m124955K(w) || C97056h.m124954I(w)) && !w.mo100983V3()) {
                string = this.f284665d.getString(C0966R.string.iar);
            }
            if (!w.mo100983V3()) {
                e0Var.mo107142f(1, string);
            }
        }
        e0Var.mo107144g(5, this.f284665d.getString(C0966R.string.b8e), C0966R.raw.icons_outlined_chats);
    }
}
