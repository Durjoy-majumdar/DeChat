package com.tencent.p014mm.plugin.nearby.p083ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.nearby.ui.CleanLocationHeaderView */
public class CleanLocationHeaderView extends LinearLayout {

    /* renamed from: d */
    public TextView f20069d;

    /* renamed from: e */
    public ImageView f20070e;

    public CleanLocationHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo5870a(context);
    }

    /* renamed from: a */
    public final void mo5870a(Context context) {
        View inflate = View.inflate(context, C0966R.C0971layout.bjw, this);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.ha8);
        this.f20069d = textView;
        textView.setSingleLine(false);
        this.f20070e = (ImageView) inflate.findViewById(C0966R.C0970id.h_q);
        this.f20069d.setText(C0966R.string.beh);
        this.f20070e.setImageResource(C0966R.raw.peoplenearby_icon);
    }

    public CleanLocationHeaderView(Context context) {
        super(context);
        mo5870a(context);
    }
}
