package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.model.C69197c1;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import p629ny.C76979h;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.n1 */
public class C69647n1 extends C69656o1 {

    /* renamed from: g */
    public Context f201020g;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.n1$a */
    public class C69648a implements C72476y0.C72477a {
        public C69648a(C69647n1 n1Var) {
        }

        /* renamed from: a */
        public void mo66525a(View view) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.n1$b */
    public class C69649b {

        /* renamed from: a */
        public TextView f201021a;

        /* renamed from: b */
        public TextView f201022b;

        /* renamed from: c */
        public TextView f201023c;

        /* renamed from: d */
        public ImageView f201024d;

        /* renamed from: e */
        public TextView f201025e;

        public C69649b(C69647n1 n1Var) {
        }
    }

    public C69647n1(Context context) {
        super(context);
        this.f201020g = context;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C69649b bVar;
        Class cls = C76979h.class;
        if (view == null) {
            view = this.f201042f.inflate(C0966R.C0971layout.b_0, viewGroup, false);
            bVar = new C69649b(this);
            bVar.f201021a = (TextView) view.findViewById(C0966R.C0970id.ggf);
            bVar.f201022b = (TextView) view.findViewById(C0966R.C0970id.ggg);
            bVar.f201023c = (TextView) view.findViewById(C0966R.C0970id.gg_);
            bVar.f201025e = (TextView) view.findViewById(C0966R.C0970id.gga);
            bVar.f201024d = (ImageView) view.findViewById(C0966R.C0970id.ggc);
            view.setTag(bVar);
        } else {
            bVar = (C69649b) view.getTag();
        }
        C69197c1 a = getItem(i);
        if (!Util.isNullOrNil(a.f199105v)) {
            Context context = this.f201020g;
            SpannableString yp02 = ((C76979h) C86312j.m106911c(cls)).yp0(context, a.f199090d + a.f199105v, bVar.f201021a.getTextSize());
            SpannableString yp03 = ((C76979h) C86312j.m106911c(cls)).yp0(this.f201020g, a.f199090d, bVar.f201021a.getTextSize());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(yp02);
            spannableStringBuilder.setSpan(new C72476y0("#FA9D3B", (C72476y0.C72477a) new C69648a(this)), yp03.length(), yp02.length(), 18);
            bVar.f201021a.setText(spannableStringBuilder);
        } else {
            C69242l1.m81616v(this.f201020g, bVar.f201021a, a.f199090d);
        }
        if (!Util.isNullOrNil(a.f199106w)) {
            bVar.f201025e.setVisibility(0);
            bVar.f201025e.setText(a.f199106w);
        } else {
            bVar.f201025e.setVisibility(8);
        }
        bVar.f201022b.setText(a.f199093g);
        bVar.f201023c.setText(this.f201020g.getString(C0966R.string.gin, new Object[]{C75228t.m90260n(((double) a.f199092f) / 100.0d)}));
        int i2 = a.f199094h;
        if (i2 == 1) {
            bVar.f201024d.setImageResource(C0966R.C0969drawable.f357259c72);
            bVar.f201024d.setVisibility(0);
        } else if (i2 == 2) {
            bVar.f201024d.setImageResource(C0966R.C0969drawable.c6u);
            bVar.f201024d.setVisibility(0);
        } else if (i2 == 3) {
            bVar.f201024d.setImageResource(C0966R.raw.lucky_money_exclusive_hb);
            bVar.f201024d.setVisibility(0);
        } else {
            bVar.f201024d.setVisibility(8);
        }
        return view;
    }
}
