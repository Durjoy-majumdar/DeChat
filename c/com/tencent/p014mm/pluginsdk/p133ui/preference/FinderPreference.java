package com.tencent.p014mm.pluginsdk.p133ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ht1.C60200t1;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;
import te3.fp4;

/* renamed from: com.tencent.mm.pluginsdk.ui.preference.FinderPreference */
public final class FinderPreference extends Preference {

    /* renamed from: J */
    public String f120967J;

    /* renamed from: K */
    public List<ImageView> f120968K;

    /* renamed from: L */
    public MMActivity f120969L;

    /* renamed from: M */
    public fp4 f120970M;

    /* renamed from: N */
    public boolean f120971N;

    /* renamed from: P */
    public View f120972P;

    public FinderPreference(Context context) {
        this(context, (AttributeSet) null);
        this.f120969L = (MMActivity) context;
    }

    /* renamed from: I */
    public void mo69404I() {
        for (ImageView visibility : this.f120968K) {
            visibility.setVisibility(8);
        }
        fp4 fp4 = this.f120970M;
        if (fp4 != null && fp4.f133629e == 0) {
            int size = fp4.f133630f.size();
            int i = 0;
            while (i < size && i < ((LinkedList) this.f120968K).size()) {
                ImageView imageView = (ImageView) ((LinkedList) this.f120968K).get(i);
                imageView.setVisibility(0);
                ((C60200t1) C86312j.m106911c(C60200t1.class)).kc0().mo8974a(fp4.f133630f.get(i), imageView);
                i++;
            }
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        ((LinkedList) this.f120968K).clear();
        ((LinkedList) this.f120968K).add((ImageView) view.findViewById(C0966R.C0970id.f4l));
        ((LinkedList) this.f120968K).add((ImageView) view.findViewById(C0966R.C0970id.f4m));
        ((LinkedList) this.f120968K).add((ImageView) view.findViewById(C0966R.C0970id.f4n));
        ((LinkedList) this.f120968K).add((ImageView) view.findViewById(C0966R.C0970id.f4o));
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.f5772o8);
        if (!Util.isNullOrNil(this.f120967J)) {
            textView.setText(this.f120967J);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = C76577a.m92157h(this.f121274d, C0966R.dimen.f3815f9);
            textView.setLayoutParams(layoutParams);
        }
        mo69404I();
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        if (this.f120972P == null) {
            View x = super.mo1087x(viewGroup);
            ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
            viewGroup2.removeAllViews();
            ((LayoutInflater) this.f121274d.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.bdh, viewGroup2);
            this.f120972P = x;
        }
        return this.f120972P;
    }

    public FinderPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f120969L = (MMActivity) context;
    }

    public FinderPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f120967J = "";
        this.f120968K = new LinkedList();
        this.f120970M = null;
        this.f120971N = false;
        this.f120969L = (MMActivity) context;
        this.f120967J = context.getString(C0966R.string.cvt);
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
