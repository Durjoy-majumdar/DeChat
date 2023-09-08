package com.tencent.p014mm.p136ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Util;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.e */
public class C74753e {

    /* renamed from: a */
    public View f219799a;

    /* renamed from: b */
    public WeImageView f219800b;

    /* renamed from: c */
    public TextView f219801c;

    /* renamed from: d */
    public TextView f219802d;

    /* renamed from: e */
    public TextView f219803e;

    /* renamed from: f */
    public ViewGroup f219804f;

    /* renamed from: g */
    public WeImageView f219805g;

    /* renamed from: h */
    public TextView f219806h;

    /* renamed from: i */
    public ViewGroup f219807i;

    /* renamed from: j */
    public WeImageView f219808j;

    /* renamed from: k */
    public ImageView f219809k;

    /* renamed from: l */
    public ImageView f219810l;

    /* renamed from: m */
    public ImageView f219811m;

    /* renamed from: n */
    public ImageView f219812n;

    /* renamed from: o */
    public ImageView f219813o;

    /* renamed from: p */
    public ImageView f219814p;

    /* renamed from: q */
    public View f219815q;

    public C74753e(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        } else {
            layoutParams.width = -1;
            layoutParams.height = -1;
        }
        view.setLayoutParams(layoutParams);
        this.f219802d = (TextView) view.findViewById(C0966R.C0970id.ko4);
        this.f219803e = (TextView) view.findViewById(C0966R.C0970id.ko8);
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.f359396kp1);
        this.f219804f = (ViewGroup) view.findViewById(C0966R.C0970id.ko6);
        this.f219805g = (WeImageView) view.findViewById(C0966R.C0970id.ko5);
        this.f219806h = (TextView) view.findViewById(C0966R.C0970id.k9n);
        this.f219807i = (ViewGroup) view.findViewById(C0966R.C0970id.k9p);
        this.f219808j = (WeImageView) view.findViewById(C0966R.C0970id.k9o);
        this.f219810l = (ImageView) view.findViewById(C0966R.C0970id.mjj);
        this.f219809k = (ImageView) view.findViewById(C0966R.C0970id.h7k);
        this.f219811m = (ImageView) view.findViewById(C0966R.C0970id.huv);
        this.f219812n = (ImageView) view.findViewById(C0966R.C0970id.f358986i90);
        this.f219799a = view.findViewById(C0966R.C0970id.f5470g0);
        this.f219800b = (WeImageView) view.findViewById(C0966R.C0970id.f6148yn);
        this.f219801c = (TextView) view.findViewById(C0966R.C0970id.dbf);
        this.f219813o = (ImageView) view.findViewById(C0966R.C0970id.ikn);
        this.f219814p = (ImageView) view.findViewById(C0966R.C0970id.l2l);
        this.f219815q = view;
        C44706b.m49451b(this.f219802d, C0966R.dimen.f3619c);
        C44706b.m49451b(this.f219806h, C0966R.dimen.f3881hq);
        C44706b.m49451b(this.f219803e, C0966R.dimen.f3684bd);
        C44706b.m49451b(this.f219801c, C0966R.dimen.f3619c);
    }

    /* renamed from: a */
    public void mo103918a(boolean z, boolean z2) {
        int i = 0;
        if (!z) {
            WeImageView weImageView = this.f219805g;
            if (!z2) {
                i = 8;
            }
            weImageView.setVisibility(i);
            this.f219808j.setVisibility(8);
            this.f219805g.setIconColor(this.f219802d.getCurrentTextColor());
            return;
        }
        this.f219805g.setVisibility(8);
        WeImageView weImageView2 = this.f219808j;
        if (!z2) {
            i = 8;
        }
        weImageView2.setVisibility(i);
        this.f219808j.setIconColor(this.f219806h.getCurrentTextColor());
    }

    /* renamed from: b */
    public void mo103919b(CharSequence charSequence) {
        if (charSequence == null || Util.isNullOrNil(charSequence.toString())) {
            this.f219806h.setVisibility(8);
            return;
        }
        this.f219806h.setVisibility(0);
        this.f219806h.setText(charSequence);
        if (C76577a.m92147C(this.f219806h.getContext())) {
            this.f219806h.setTextSize(1, 14.0f);
            this.f219802d.setTextSize(1, 18.0f);
        }
    }

    /* renamed from: c */
    public void mo103920c(CharSequence charSequence) {
        this.f219802d.setText(charSequence);
        if (C44706b.m49450a()) {
            C44706b.m49451b(this.f219802d, C0966R.dimen.f3619c);
        } else if (C76577a.m92147C(this.f219802d.getContext())) {
            TextView textView = this.f219802d;
            textView.setTextSize(0, ((float) C76577a.m92155f(textView.getContext(), C0966R.dimen.f3619c)) * C76577a.m92161l(this.f219802d.getContext()));
        }
    }
}
