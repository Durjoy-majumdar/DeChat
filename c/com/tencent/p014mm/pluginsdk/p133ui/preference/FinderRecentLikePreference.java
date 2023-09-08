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
import te3.hp4;

/* renamed from: com.tencent.mm.pluginsdk.ui.preference.FinderRecentLikePreference */
public final class FinderRecentLikePreference extends Preference {

    /* renamed from: J */
    public String f120973J;

    /* renamed from: K */
    public List<ImageView> f120974K;

    /* renamed from: L */
    public MMActivity f120975L;

    /* renamed from: M */
    public hp4 f120976M;

    /* renamed from: N */
    public View f120977N;

    public FinderRecentLikePreference(Context context) {
        this(context, (AttributeSet) null);
        this.f120975L = (MMActivity) context;
    }

    /* renamed from: I */
    public void mo69405I() {
        for (ImageView visibility : this.f120974K) {
            visibility.setVisibility(8);
        }
        hp4 hp4 = this.f120976M;
        if (hp4 != null) {
            int size = hp4.f134812d.size();
            int i = 0;
            while (i < size && i < ((LinkedList) this.f120974K).size()) {
                ImageView imageView = (ImageView) ((LinkedList) this.f120974K).get(i);
                imageView.setVisibility(0);
                ((C60200t1) C86312j.m106911c(C60200t1.class)).kc0().mo8974a(hp4.f134812d.get(i), imageView);
                i++;
            }
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        ((LinkedList) this.f120974K).clear();
        ((LinkedList) this.f120974K).add((ImageView) view.findViewById(C0966R.C0970id.f4l));
        ((LinkedList) this.f120974K).add((ImageView) view.findViewById(C0966R.C0970id.f4m));
        ((LinkedList) this.f120974K).add((ImageView) view.findViewById(C0966R.C0970id.f4n));
        ((LinkedList) this.f120974K).add((ImageView) view.findViewById(C0966R.C0970id.f4o));
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.f5772o8);
        if (!Util.isNullOrNil(this.f120973J)) {
            textView.setText(this.f120973J);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = C76577a.m92157h(this.f121274d, C0966R.dimen.f3815f9);
            textView.setLayoutParams(layoutParams);
        }
        mo69405I();
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        if (this.f120977N == null) {
            View x = super.mo1087x(viewGroup);
            ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
            viewGroup2.removeAllViews();
            ((LayoutInflater) this.f121274d.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.bdh, viewGroup2);
            this.f120977N = x;
        }
        return this.f120977N;
    }

    public FinderRecentLikePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f120975L = (MMActivity) context;
    }

    public FinderRecentLikePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f120973J = "";
        this.f120974K = new LinkedList();
        this.f120976M = null;
        this.f120975L = (MMActivity) context;
        this.f120973J = context.getString(C0966R.string.cwf);
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
