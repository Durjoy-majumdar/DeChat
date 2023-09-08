package com.tencent.p014mm.plugin.fav.p047ui;

import android.content.DialogInterface;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;

/* renamed from: com.tencent.mm.plugin.fav.ui.h */
public class C93657h implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ DoFavoriteEvent f270436d;

    public C93657h(DoFavoriteEvent doFavoriteEvent) {
        this.f270436d = doFavoriteEvent;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            C93658i.m118348c(this.f270436d);
        }
    }
}
