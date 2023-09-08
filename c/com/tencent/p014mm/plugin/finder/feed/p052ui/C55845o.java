package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.finder.feed.ui.o */
public final class C55845o implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderSharePostUI f159056d;

    /* renamed from: e */
    public final /* synthetic */ String f159057e;

    /* renamed from: f */
    public final /* synthetic */ String f159058f;

    public C55845o(FinderSharePostUI finderSharePostUI, String str, String str2) {
        this.f159056d = finderSharePostUI;
        this.f159057e = str;
        this.f159058f = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f159056d.mo77441P7(-7, "", this.f159057e, this.f159058f);
        this.f159056d.mo77439N7();
    }
}
