package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.finder.feed.ui.p */
public final class C55846p implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderSharePostUI f159059d;

    /* renamed from: e */
    public final /* synthetic */ String f159060e;

    /* renamed from: f */
    public final /* synthetic */ String f159061f;

    public C55846p(FinderSharePostUI finderSharePostUI, String str, String str2) {
        this.f159059d = finderSharePostUI;
        this.f159060e = str;
        this.f159061f = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f159059d.mo77441P7(-8, "", this.f159060e, this.f159061f);
        this.f159059d.mo77439N7();
    }
}
