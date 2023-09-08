package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.model.C69197c1;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import p629ny.C76979h;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.q1 */
public class C69667q1 extends C69656o1 {

    /* renamed from: g */
    public Context f201055g;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.q1$a */
    public class C69668a implements C72476y0.C72477a {
        public C69668a(C69667q1 q1Var) {
        }

        /* renamed from: a */
        public void mo66525a(View view) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.q1$b */
    public class C69669b {

        /* renamed from: a */
        public TextView f201056a;

        /* renamed from: b */
        public TextView f201057b;

        /* renamed from: c */
        public TextView f201058c;

        /* renamed from: d */
        public TextView f201059d;

        public C69669b(C69667q1 q1Var) {
        }
    }

    public C69667q1(Context context) {
        super(context);
        this.f201055g = context;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C69669b bVar;
        Class cls = C76979h.class;
        if (view == null) {
            view = this.f201042f.inflate(C0966R.C0971layout.b_2, viewGroup, false);
            bVar = new C69669b(this);
            bVar.f201056a = (TextView) view.findViewById(C0966R.C0970id.ggk);
            bVar.f201059d = (TextView) view.findViewById(C0966R.C0970id.ggi);
            bVar.f201057b = (TextView) view.findViewById(C0966R.C0970id.ggj);
            bVar.f201058c = (TextView) view.findViewById(C0966R.C0970id.ggh);
            view.setTag(bVar);
        } else {
            bVar = (C69669b) view.getTag();
        }
        C69197c1 a = getItem(i);
        if (!Util.isNullOrNil(a.f199105v)) {
            SpannableString yp02 = ((C76979h) C86312j.m106911c(cls)).yp0(this.f201055g, a.f199095i + a.f199105v, bVar.f201056a.getTextSize());
            SpannableString yp03 = ((C76979h) C86312j.m106911c(cls)).yp0(this.f201055g, a.f199095i, bVar.f201056a.getTextSize());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(yp02);
            spannableStringBuilder.setSpan(new C72476y0("#FA9D3B", (C72476y0.C72477a) new C69668a(this)), yp03.length(), yp02.length(), 18);
            bVar.f201056a.setText(spannableStringBuilder);
        } else {
            C69242l1.m81616v(this.f201055g, bVar.f201056a, a.f199095i);
        }
        bVar.f201057b.setText(a.f199096j);
        bVar.f201058c.setText(this.f201055g.getString(C0966R.string.ges, new Object[]{C75228t.m90260n(((double) a.f199097n) / 100.0d)}));
        String string = this.f201055g.getString(C0966R.string.gj8, new Object[]{Long.valueOf(a.f199099p), Long.valueOf(a.f199098o)});
        if (a.f199100q == 5) {
            string = this.f201055g.getString(C0966R.string.gj9) + " " + string;
        }
        bVar.f201059d.setText(string);
        return view;
    }
}
