package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.base.preference.HeadImgAndNamePreference */
public final class HeadImgAndNamePreference extends Preference {

    /* renamed from: J */
    public int f24232J;

    /* renamed from: K */
    public ImageView f24233K;

    /* renamed from: L */
    public View f24234L;

    /* renamed from: M */
    public TextView f24235M;

    public HeadImgAndNamePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        if (this.f24233K == null) {
            this.f24233K = (ImageView) view.findViewById(C0966R.C0970id.f4h);
        }
        if (this.f24235M == null) {
            this.f24235M = (TextView) view.findViewById(C0966R.C0970id.hgg);
        }
        if (this.f24234L == null) {
            this.f24234L = view.findViewById(C0966R.C0970id.gon);
        }
        View view2 = this.f24234L;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/base/preference/HeadImgAndNamePreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/ui/base/preference/HeadImgAndNamePreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f24235M.setVisibility(0);
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C0966R.C0970id.gv6);
        int i = this.f24232J;
        if (i != -1) {
            relativeLayout.setMinimumHeight(i);
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        View.inflate(this.f121274d, C0966R.C0971layout.bde, viewGroup2);
        this.f24233K = (ImageView) x.findViewById(C0966R.C0970id.f4h);
        this.f24234L = x.findViewById(C0966R.C0970id.goo);
        LinearLayout linearLayout = (LinearLayout) x.findViewById(C0966R.C0970id.c2c);
        ImageView imageView = (ImageView) x.findViewById(C0966R.C0970id.f15);
        this.f24235M = (TextView) x.findViewById(C0966R.C0970id.f357845c22);
        return x;
    }

    public HeadImgAndNamePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24232J = -1;
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
