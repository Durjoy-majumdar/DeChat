package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.base.preference.IconSummaryPreference */
public class IconSummaryPreference extends Preference {

    /* renamed from: J */
    public String f24252J;

    /* renamed from: K */
    public int f24253K;

    /* renamed from: L */
    public int f24254L;

    /* renamed from: M */
    public int f24255M;

    /* renamed from: N */
    public int f24256N;

    /* renamed from: P */
    public int f24257P;

    /* renamed from: Q */
    public int f24258Q;

    /* renamed from: R */
    public ImageView f24259R;

    /* renamed from: S */
    public ViewGroup f24260S;

    /* renamed from: T */
    public View f24261T;

    /* renamed from: U */
    public TextView f24262U;

    /* renamed from: V */
    public int f24263V;

    /* renamed from: W */
    public int f24264W;

    /* renamed from: X */
    public Context f24265X;

    public IconSummaryPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: D */
    public void mo7740D(int i) {
        CharSequence charSequence;
        super.mo7740D(i);
        if (this.f24262U != null && (charSequence = this.f121281n) != null && charSequence.length() > 0) {
            this.f24262U.setText(this.f121281n);
        }
    }

    /* renamed from: E */
    public void mo7741E(CharSequence charSequence) {
        CharSequence charSequence2;
        super.mo7741E(charSequence);
        if (this.f24262U != null && (charSequence2 = this.f121281n) != null && charSequence2.length() > 0) {
            this.f24262U.setText(this.f121281n);
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        int i;
        CharSequence charSequence;
        super.mo1086w(view);
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.f4k);
        if (imageView != null) {
            imageView.setVisibility(8);
            Drawable drawable = this.f121284q;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
            } else {
                int i2 = this.f121282o;
                if (i2 != 0) {
                    imageView.setImageResource(i2);
                    imageView.setVisibility(0);
                }
            }
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.gv6);
        int i3 = this.f24264W;
        if (i3 != -1) {
            linearLayout.setMinimumHeight(i3);
        }
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.kiq);
        if (textView != null) {
            textView.setVisibility(this.f24254L);
            textView.setText(this.f24252J);
            int i4 = this.f24253K;
            if (i4 != -1) {
                textView.setBackgroundDrawable(C76577a.m92158i(this.f24265X, i4));
            }
        }
        if (this.f24259R == null) {
            this.f24259R = (ImageView) view.findViewById(C0966R.C0970id.f57);
        }
        if (this.f24260S == null) {
            this.f24260S = (ViewGroup) view.findViewById(C0966R.C0970id.ity);
        }
        if (this.f24261T == null) {
            this.f24261T = view.findViewById(C0966R.C0970id.itw);
        }
        View view2 = this.f24261T;
        int i5 = this.f24257P;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i5));
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/ui/base/preference/IconSummaryPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/ui/base/preference/IconSummaryPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i6 = this.f24255M;
        if (i6 != -1) {
            this.f24259R.setImageResource(i6);
        }
        this.f24259R.setVisibility(this.f24256N);
        this.f24260S.setVisibility(0);
        TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.iu5);
        this.f24262U = textView2;
        if (!(textView2 == null || (charSequence = this.f121281n) == null || charSequence.length() <= 0)) {
            this.f24262U.setText(this.f121281n);
            this.f24262U.setVisibility(this.f24258Q);
        }
        TextView textView3 = this.f24262U;
        if (textView3 != null && (i = this.f24263V) != -1) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
            this.f24262U.setCompoundDrawablePadding(BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f121274d, 2.0f));
            this.f24262U.setVisibility(this.f24258Q);
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        View.inflate(this.f121274d, C0966R.C0971layout.bdl, viewGroup2);
        return x;
    }

    public IconSummaryPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24252J = "";
        this.f24253K = -1;
        this.f24254L = 8;
        this.f24255M = -1;
        this.f24256N = 8;
        this.f24257P = 8;
        this.f24258Q = 8;
        this.f24259R = null;
        this.f24260S = null;
        this.f24261T = null;
        this.f24262U = null;
        this.f24263V = -1;
        this.f24264W = -1;
        this.f24265X = context;
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
