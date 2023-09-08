package com.tencent.p014mm.p136ui.widget.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.widget.bottomsheet.ViewTitleWithAnimation */
public class ViewTitleWithAnimation extends LinearLayout {

    /* renamed from: d */
    public TextView f122369d;

    /* renamed from: e */
    public ImageView f122370e;

    /* renamed from: f */
    public TextView f122371f;

    /* renamed from: g */
    public TextView f122372g;

    /* renamed from: h */
    public ImageView f122373h;

    /* renamed from: i */
    public TextView f122374i;

    /* renamed from: j */
    public ViewGroup f122375j;

    /* renamed from: n */
    public View f122376n;

    public ViewTitleWithAnimation(Context context) {
        super(context);
        mo70486a(context);
    }

    /* renamed from: a */
    public final void mo70486a(Context context) {
        LayoutInflater.from(context).inflate(C0966R.C0971layout.f6657kz, this);
        this.f122369d = (TextView) findViewById(C0966R.C0970id.kyn);
        this.f122376n = findViewById(C0966R.C0970id.krf);
        this.f122370e = (ImageView) findViewById(C0966R.C0970id.f358476fd0);
        this.f122371f = (TextView) findViewById(C0966R.C0970id.ky_);
        this.f122372g = (TextView) findViewById(C0966R.C0970id.kwd);
        this.f122373h = (ImageView) findViewById(C0966R.C0970id.f358479fd3);
        this.f122374i = (TextView) findViewById(C0966R.C0970id.kwe);
        this.f122375j = (ViewGroup) findViewById(C0966R.C0970id.fkg);
    }

    public ImageView getIconImageView() {
        return this.f122370e;
    }

    public void setCompanyText(String str) {
        if (!Util.isNullOrNil(str)) {
            this.f122372g.setVisibility(0);
            this.f122372g.setText(str);
            return;
        }
        this.f122372g.setVisibility(8);
    }

    public void setSubTitle(String str) {
        this.f122371f.setText(str);
    }

    public void setTitle(String str) {
        this.f122369d.setText(str);
    }

    public void setTopPaddingVisibility(int i) {
        View view = this.f122376n;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/widget/bottomsheet/ViewTitleWithAnimation", "setTopPaddingVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/ui/widget/bottomsheet/ViewTitleWithAnimation", "setTopPaddingVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public ViewTitleWithAnimation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo70486a(context);
    }

    public ViewTitleWithAnimation(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo70486a(context);
    }
}
