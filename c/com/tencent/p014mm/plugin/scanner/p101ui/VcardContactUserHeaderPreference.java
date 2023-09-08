package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.scanner.ui.VcardContactUserHeaderPreference */
public class VcardContactUserHeaderPreference extends Preference {

    /* renamed from: J */
    public TextView f20592J;

    /* renamed from: K */
    public TextView f20593K;

    /* renamed from: L */
    public TextView f20594L;

    /* renamed from: M */
    public String f20595M;

    /* renamed from: N */
    public String f20596N;

    /* renamed from: P */
    public String f20597P;

    /* renamed from: Q */
    public String f20598Q;

    /* renamed from: R */
    public final Context f20599R;

    public VcardContactUserHeaderPreference(Context context) {
        super(context);
        this.f20599R = context;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        Log.m105920e("MicroMsg.scanner.VcardContactUserHeaderPreference", "onbindview");
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.l3i);
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.l3j);
        String str = this.f20595M;
        if (str != null) {
            textView.setText(str);
        }
        TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.l3k);
        this.f20592J = textView2;
        String str2 = this.f20596N;
        if (str2 != null) {
            textView2.setText(this.f20599R.getString(C0966R.string.k98, new Object[]{str2}));
            this.f20592J.setVisibility(0);
        }
        TextView textView3 = (TextView) view.findViewById(C0966R.C0970id.l3l);
        this.f20593K = textView3;
        String str3 = this.f20597P;
        if (str3 != null) {
            textView3.setText(this.f20599R.getString(C0966R.string.k9c, new Object[]{str3}));
            this.f20593K.setVisibility(0);
        }
        TextView textView4 = (TextView) view.findViewById(C0966R.C0970id.l3m);
        this.f20594L = textView4;
        String str4 = this.f20598Q;
        if (str4 != null) {
            textView4.setText(this.f20599R.getString(C0966R.string.k9d, new Object[]{str4}));
            this.f20594L.setVisibility(0);
        }
    }

    public VcardContactUserHeaderPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20599R = context;
    }

    public VcardContactUserHeaderPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20599R = context;
    }
}
