package com.tencent.p014mm.plugin.collect.p038ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.wallet_core.p137ui.WalletTextView;

/* renamed from: com.tencent.mm.plugin.collect.ui.CollectBillHeaderView */
public class CollectBillHeaderView extends LinearLayout {

    /* renamed from: d */
    public TextView f197749d;

    /* renamed from: e */
    public WalletTextView f197750e;

    /* renamed from: f */
    public TextView f197751f;

    public CollectBillHeaderView(Context context) {
        super(context);
        mo94675a(context);
    }

    /* renamed from: a */
    public final void mo94675a(Context context) {
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.f7012uw, this);
        this.f197749d = (TextView) inflate.findViewById(C0966R.C0970id.bgp);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.bgo);
        this.f197750e = (WalletTextView) inflate.findViewById(C0966R.C0970id.bgr);
        this.f197751f = (TextView) inflate.findViewById(C0966R.C0970id.bgq);
    }

    public CollectBillHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo94675a(context);
    }

    public CollectBillHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo94675a(context);
    }
}
