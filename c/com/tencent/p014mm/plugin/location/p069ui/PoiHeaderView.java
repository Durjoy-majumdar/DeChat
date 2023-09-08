package com.tencent.p014mm.plugin.location.p069ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import x22.C15624f;

/* renamed from: com.tencent.mm.plugin.location.ui.PoiHeaderView */
public class PoiHeaderView extends RelativeLayout {

    /* renamed from: d */
    public Context f19876d;

    /* renamed from: e */
    public TextView f19877e;

    /* renamed from: f */
    public String f19878f = "";

    /* renamed from: g */
    public String f19879g = "";

    /* renamed from: h */
    public SimpleImageView f19880h;

    public PoiHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19876d = context;
        View inflate = View.inflate(context, C0966R.C0971layout.bn_, this);
        this.f19877e = (TextView) inflate.findViewById(C0966R.C0970id.ev9);
        this.f19880h = (SimpleImageView) inflate.findViewById(C0966R.C0970id.euw);
        this.f19877e.setVisibility(8);
        this.f19880h.setVisibility(8);
        setVisibility(8);
        setOnClickListener(new C15624f(this));
    }

    public void setViewUrl(String str) {
        Log.m105918d("MicroMsg.PoiHeaderView", "viewUrl " + str);
        this.f19879g = str;
    }
}
