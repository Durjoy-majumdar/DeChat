package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.finder.feed.ui.q */
public final class C55847q implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderSharePostUI f159062d;

    /* renamed from: e */
    public final /* synthetic */ String f159063e;

    /* renamed from: f */
    public final /* synthetic */ String f159064f;

    public C55847q(FinderSharePostUI finderSharePostUI, String str, String str2) {
        this.f159062d = finderSharePostUI;
        this.f159063e = str;
        this.f159064f = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f159062d.mo77441P7(-9, "", this.f159063e, this.f159064f);
        this.f159062d.mo77439N7();
    }
}
