package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.storage.C72963f4;

/* renamed from: com.tencent.mm.ui.chatting.gallery.n0$$a */
public final /* synthetic */ class n0$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C97099n0 f284880d;

    /* renamed from: e */
    public final /* synthetic */ C72963f4 f284881e;

    /* renamed from: f */
    public final /* synthetic */ int f284882f;

    public /* synthetic */ n0$$a(C97099n0 n0Var, C72963f4 f4Var, int i) {
        this.f284880d = n0Var;
        this.f284881e = f4Var;
        this.f284882f = i;
    }

    public final void run() {
        ImageGalleryUI imageGalleryUI;
        C97099n0 n0Var = this.f284880d;
        C72963f4 f4Var = this.f284881e;
        int i = this.f284882f;
        C97056h hVar = n0Var.f284879g.f284638d;
        if (hVar != null && (imageGalleryUI = hVar.f284714g) != null) {
            imageGalleryUI.f284374M = false;
            imageGalleryUI.f284371L.setVisibility(8);
            n0Var.f284879g.f284638d.f284714g.mo135753X8(false);
            n0Var.f284879g.mo135824A(f4Var, i);
        }
    }
}
