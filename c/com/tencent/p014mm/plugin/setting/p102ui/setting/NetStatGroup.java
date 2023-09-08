package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.NetStatGroup */
public class NetStatGroup extends LinearLayout {

    /* renamed from: d */
    public LinearLayout f116228d = ((LinearLayout) findViewById(C0966R.C0970id.eqz));

    /* renamed from: e */
    public final TextView f116229e;

    public NetStatGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(context, C0966R.C0971layout.bkk, this);
        TextView textView = (TextView) findViewById(C0966R.C0970id.f357828bz0);
        this.f116229e = textView;
        textView.setTextSize(0, (float) context.getResources().getDimensionPixelSize(C0966R.dimen.f3881hq));
    }
}
