package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.RadioBelowSummarytAndIconPreference */
public class RadioBelowSummarytAndIconPreference extends Preference {

    /* renamed from: J */
    public View f208730J;

    /* renamed from: K */
    public LinearLayout f208731K;

    /* renamed from: L */
    public ImageView f208732L;

    /* renamed from: M */
    public View f208733M;

    /* renamed from: N */
    public int f208734N = 0;

    /* renamed from: P */
    public View.OnClickListener f208735P;

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.RadioBelowSummarytAndIconPreference$a */
    public class C71961a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f208736d;

        public C71961a(View view) {
            this.f208736d = view;
        }

        public void run() {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) RadioBelowSummarytAndIconPreference.this.f208733M.getLayoutParams();
            layoutParams.leftMargin = this.f208736d.findViewById(16908304).getWidth();
            RadioBelowSummarytAndIconPreference.this.f208733M.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.RadioBelowSummarytAndIconPreference$b */
    public class C71962b implements View.OnClickListener {
        public C71962b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/pwd/ui/RadioBelowSummarytAndIconPreference$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RadioBelowSummarytAndIconPreference.this.f208735P.onClick(view);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/pwd/ui/RadioBelowSummarytAndIconPreference$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public RadioBelowSummarytAndIconPreference(Context context) {
        super(context);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        mo69921C(8);
        if (this.f208732L == null || this.f208735P == null || Util.isEqual(0, this.f208734N)) {
            ImageView imageView = this.f208732L;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        } else {
            this.f208732L.setImageResource(this.f208734N);
            this.f208732L.post(new C71961a(view));
            this.f208733M.setOnClickListener(new C71962b());
        }
        LinearLayout linearLayout = this.f208731K;
        if (linearLayout == null) {
            return;
        }
        if (this.f121272H != 0) {
            linearLayout.removeAllViews();
            View.inflate(this.f121274d, this.f121272H, this.f208731K);
            return;
        }
        linearLayout.setVisibility(8);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        if (this.f208730J == null) {
            View x = super.mo1087x(viewGroup);
            ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
            viewGroup2.removeAllViews();
            this.f208731K = (LinearLayout) x.findViewById(16908312);
            View.inflate(this.f121274d, C0966R.C0971layout.bf9, viewGroup2);
            this.f208732L = (ImageView) viewGroup2.findViewById(C0966R.C0970id.ka4);
            this.f208733M = viewGroup2.findViewById(C0966R.C0970id.f359326ka2);
            this.f208730J = x;
        }
        return this.f208730J;
    }

    public RadioBelowSummarytAndIconPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RadioBelowSummarytAndIconPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
