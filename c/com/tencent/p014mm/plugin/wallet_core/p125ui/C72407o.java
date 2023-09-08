package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72478z;
import di3.C86312j;
import p629ny.C76979h;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.o */
public class C72407o extends Preference {

    /* renamed from: J */
    public View f210641J = null;

    /* renamed from: K */
    public String f210642K;

    /* renamed from: L */
    public int f210643L = Integer.MAX_VALUE;

    /* renamed from: M */
    public boolean f210644M;

    /* renamed from: N */
    public int f210645N = -1;

    /* renamed from: P */
    public int f210646P = -1;

    /* renamed from: Q */
    public View.OnClickListener f210647Q;

    /* renamed from: R */
    public View f210648R;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.o$a */
    public class C72408a implements C72478z.C72479a {
        public C72408a() {
        }

        public void onClick(View view) {
            View.OnClickListener onClickListener = C72407o.this.f210647Q;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public C72407o(Context context) {
        super(context, (AttributeSet) null);
        this.f121271G = C0966R.C0971layout.f359839b30;
    }

    /* renamed from: t */
    public View mo2020t(View view, ViewGroup viewGroup) {
        if (this.f210641J == null) {
            this.f210641J = mo1087x(viewGroup);
        }
        mo1086w(this.f210641J);
        return this.f210641J;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        Class cls = C76979h.class;
        super.mo1086w(view);
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.l3g);
        ((TextView) view.findViewById(C0966R.C0970id.ffd)).setText(this.f121279i);
        this.f210648R = view;
        int i = this.f210643L;
        if (i != Integer.MAX_VALUE) {
            textView.setTextColor(i);
        }
        if (!this.f210644M) {
            textView.setOnClickListener((View.OnClickListener) null);
            textView.setText(((C76979h) C86312j.m106911c(cls)).yp0(this.f121274d, this.f210642K, textView.getTextSize()));
        } else if (this.f210645N < 0 || this.f210646P <= 0) {
            int i2 = this.f210643L;
            if (i2 != Integer.MAX_VALUE) {
                textView.setTextColor(i2);
            } else {
                textView.setTextColor(this.f121274d.getResources().getColor(C0966R.color.a3q));
            }
            textView.setOnClickListener(this.f210647Q);
            textView.setText(((C76979h) C86312j.m106911c(cls)).yp0(this.f121274d, this.f210642K, textView.getTextSize()));
        } else {
            C72478z zVar = new C72478z(this.f121274d);
            SpannableString spannableString = new SpannableString(this.f210642K);
            zVar.f210835d = new C72408a();
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            spannableString.setSpan(zVar, this.f210645N, this.f210646P, 33);
            textView.setText(spannableString);
        }
    }
}
