package com.tencent.p014mm.plugin.location.p069ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import p196ln.C76705f;

/* renamed from: com.tencent.mm.plugin.location.ui.TipSayingWidget */
public class TipSayingWidget extends LinearLayout {

    /* renamed from: d */
    public Context f19886d;

    /* renamed from: e */
    public ImageView f19887e;

    /* renamed from: f */
    public TextView f19888f;

    /* renamed from: g */
    public String f19889g;

    /* renamed from: h */
    public Chronometer f19890h = ((Chronometer) findViewById(C0966R.C0970id.bcw));

    public TipSayingWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19886d = context;
        View inflate = View.inflate(context, C0966R.C0971layout.c_n, this);
        this.f19887e = (ImageView) inflate.findViewById(C0966R.C0970id.f359116j13);
        this.f19888f = (TextView) inflate.findViewById(C0966R.C0970id.j15);
    }

    public void setCurSaying(String str) {
        if (Util.isNullOrNil(str)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106841jW(this.f19887e, str, true);
        if (Util.isNullOrNil(this.f19889g)) {
            this.f19889g = C75592q0.m90789s();
        }
        if (this.f19889g.equals(str)) {
            this.f19888f.setText(this.f19886d.getString(C0966R.string.k5s, new Object[]{str}));
            this.f19890h.setVisibility(0);
            return;
        }
        this.f19888f.setText(this.f19886d.getString(C0966R.string.k5s, new Object[]{str}));
        this.f19890h.setVisibility(8);
    }
}
