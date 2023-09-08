package com.tencent.p014mm.plugin.wallet_core.p125ui.view;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemView */
public class SwitchPhoneItemView extends RelativeLayout {

    /* renamed from: d */
    public TextView f210708d;

    /* renamed from: e */
    public TextView f210709e;

    /* renamed from: f */
    public ImageView f210710f;

    /* renamed from: g */
    public int f210711g;

    public SwitchPhoneItemView(Context context, int i) {
        super(context);
        this.f210711g = i;
        mo99802b(context);
    }

    /* renamed from: a */
    public void mo99801a(CharSequence charSequence, CharSequence charSequence2) {
        if (!Util.isNullOrNil(charSequence)) {
            this.f210708d.setText(charSequence);
        } else {
            this.f210708d.setVisibility(8);
        }
        if (!Util.isNullOrNil(charSequence2)) {
            this.f210709e.setMaxLines(2);
            this.f210709e.setSelected(true);
            this.f210709e.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.f210709e.setText(charSequence2);
            this.f210709e.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        }
        this.f210709e.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo99802b(Context context) {
        int i = this.f210711g;
        View inflate = i > 0 ? View.inflate(context, i, this) : View.inflate(context, C0966R.C0971layout.cgl, this);
        this.f210708d = (TextView) inflate.findViewById(C0966R.C0970id.hvl);
        this.f210709e = (TextView) inflate.findViewById(C0966R.C0970id.hut);
        this.f210710f = (ImageView) inflate.findViewById(C0966R.C0970id.hus);
    }

    public SwitchPhoneItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f210711g = 0;
        mo99802b(context);
    }

    public SwitchPhoneItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f210711g = 0;
        mo99802b(context);
    }
}
