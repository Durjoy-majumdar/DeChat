package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;

/* renamed from: com.tencent.mm.plugin.aa.ui.AAQueryListH5UrlFooterView */
public class AAQueryListH5UrlFooterView extends LinearLayout {

    /* renamed from: d */
    public TextView f10473d;

    public AAQueryListH5UrlFooterView(Context context) {
        super(context);
        mo1259a(context);
    }

    /* renamed from: a */
    public final void mo1259a(Context context) {
        TextView textView = (TextView) C85868k2.m106137b(context).inflate(C0966R.C0971layout.f6265a3, this, true).findViewById(C0966R.C0970id.f5276ao);
        this.f10473d = textView;
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
    }

    public TextView getBottomLinkTv() {
        return this.f10473d;
    }

    public AAQueryListH5UrlFooterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo1259a(context);
    }

    public AAQueryListH5UrlFooterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo1259a(context);
    }
}
