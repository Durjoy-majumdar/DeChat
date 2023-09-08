package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import java.util.List;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.profile.ui.BizInfoPayInfoIconPreference */
public class BizInfoPayInfoIconPreference extends Preference {

    /* renamed from: J */
    public LayoutInflater f20122J;

    /* renamed from: K */
    public LinearLayout f20123K;

    /* renamed from: L */
    public List<String> f20124L;

    /* renamed from: M */
    public int f20125M;

    public BizInfoPayInfoIconPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: I */
    public final void mo5900I(int i) {
        ImageView imageView = (ImageView) this.f20122J.inflate(C0966R.C0971layout.f7055wc, (ViewGroup) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C76577a.m92151b(this.f121274d, 20), C76577a.m92151b(this.f121274d, 20));
        layoutParams.rightMargin = C76577a.m92151b(this.f121274d, 6);
        imageView.setImageResource(i);
        this.f20123K.addView(imageView, layoutParams);
    }

    /* renamed from: J */
    public final void mo5901J() {
        LinearLayout linearLayout = this.f20123K;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int i = this.f20125M;
            if (i >= 0) {
                for (int i2 = 0; i2 < 5; i2++) {
                    if (i <= 0) {
                        mo5900I(C0966R.raw.biz_info_brand_unselect);
                    } else {
                        if (i <= 10) {
                            mo5900I(C0966R.raw.biz_info_brand_half_selected);
                        } else if (i <= 20) {
                            mo5900I(C0966R.raw.biz_info_brand_selected);
                        } else {
                            mo5900I(C0966R.raw.biz_info_brand_selected);
                        }
                        i -= 20;
                    }
                }
                return;
            }
            List<String> list = this.f20124L;
            if (list != null) {
                for (String url : list) {
                    CdnImageView cdnImageView = new CdnImageView(this.f121274d, (AttributeSet) null);
                    cdnImageView.setUrl(url);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C76577a.m92151b(this.f121274d, 20), C76577a.m92151b(this.f121274d, 20));
                    layoutParams.rightMargin = C76577a.m92151b(this.f121274d, 6);
                    this.f20123K.addView(cdnImageView, layoutParams);
                }
            }
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        this.f20123K = (LinearLayout) view.findViewById(C0966R.C0970id.k_z);
        mo5901J();
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        this.f20122J.inflate(C0966R.C0971layout.f7076xi, viewGroup2);
        return x;
    }

    public BizInfoPayInfoIconPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BizInfoPayInfoIconPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20125M = -1;
        this.f20122J = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
