package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

/* renamed from: com.tencent.mm.plugin.game.ui.GameIndexSearchView */
public class GameIndexSearchView extends LinearLayout {

    /* renamed from: d */
    public Context f113963d;

    /* renamed from: e */
    public LayoutInflater f113964e;

    public GameIndexSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
        this.f113963d = context;
        this.f113964e = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
