package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingHeaderPref */
public class WalletSecuritySettingHeaderPref extends Preference {

    /* renamed from: J */
    public MMActivity f208910J;

    /* renamed from: K */
    public TextView f208911K;

    /* renamed from: L */
    public TextView f208912L;

    /* renamed from: M */
    public TextView f208913M;

    /* renamed from: N */
    public ImageView f208914N;

    /* renamed from: P */
    public String f208915P;

    /* renamed from: Q */
    public String f208916Q;

    /* renamed from: R */
    public String f208917R;

    /* renamed from: S */
    public View.OnClickListener f208918S;

    /* renamed from: T */
    public View.OnClickListener f208919T;

    public WalletSecuritySettingHeaderPref(Context context) {
        this(context, (AttributeSet) null);
        this.f208910J = (MMActivity) context;
    }

    /* renamed from: I */
    public final void mo99241I() {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        if (!Util.isNullOrNil(this.f208915P) && (textView4 = this.f208911K) != null) {
            textView4.setText(this.f208915P);
            this.f208911K.setVisibility(0);
        }
        if (!Util.isNullOrNil(this.f208916Q) && (textView3 = this.f208912L) != null) {
            textView3.setText(this.f208916Q);
            this.f208912L.setVisibility(0);
        }
        if (!Util.isNullOrNil(this.f208917R) && (textView2 = this.f208913M) != null) {
            textView2.setText(this.f208917R);
            this.f208913M.setVisibility(0);
        }
        if (Util.isNullOrNil(this.f208917R) && (textView = this.f208913M) != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        View.OnClickListener onClickListener;
        View.OnClickListener onClickListener2;
        super.mo1086w(view);
        Log.m105926v("MicroMsg.WalletSecuritySettingHeaderPref", "alvinluo onBindView");
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.gkr);
        this.f208911K = textView;
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
        this.f208912L = (TextView) view.findViewById(C0966R.C0970id.f357845c22);
        this.f208913M = (TextView) view.findViewById(C0966R.C0970id.c46);
        this.f208914N = (ImageView) view.findViewById(C0966R.C0970id.ljg);
        mo99241I();
        TextView textView2 = this.f208913M;
        if (!(textView2 == null || (onClickListener2 = this.f208918S) == null)) {
            textView2.setOnClickListener(onClickListener2);
        }
        ImageView imageView = this.f208914N;
        if (imageView != null && (onClickListener = this.f208919T) != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    public WalletSecuritySettingHeaderPref(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f208910J = (MMActivity) context;
    }

    public WalletSecuritySettingHeaderPref(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f208918S = null;
        this.f208919T = null;
        this.f208910J = (MMActivity) context;
        this.f121271G = C0966R.C0971layout.cgc;
    }
}
