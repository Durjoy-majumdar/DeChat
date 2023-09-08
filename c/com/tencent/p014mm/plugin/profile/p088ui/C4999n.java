package com.tencent.p014mm.plugin.profile.p088ui;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kw0.C46746a;

/* renamed from: com.tencent.mm.plugin.profile.ui.n */
public final class C4999n extends C87413o implements C32226l<View, String> {

    /* renamed from: d */
    public static final C4999n f20298d = new C4999n();

    public C4999n() {
        super(1);
    }

    public Object invoke(Object obj) {
        View view = (View) obj;
        C87412m.m108594g(view, LocaleUtil.ITALIAN);
        MMNeat7extView mMNeat7extView = (MMNeat7extView) view.findViewById(C0966R.C0970id.aek);
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.ael);
        TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.ikv);
        StringBuilder sb = new StringBuilder();
        C46746a aVar = C46746a.f125826a;
        C87412m.m108593f(mMNeat7extView, "mainNeatTv");
        sb.append(mMNeat7extView.getVisibility() == 0 ? mMNeat7extView.mo154968a().toString() : "");
        sb.append(", ");
        C87412m.m108593f(textView, "expandTv");
        sb.append(aVar.mo71975h(textView));
        sb.append(", ");
        C87412m.m108593f(textView2, "recTv");
        sb.append(aVar.mo71975h(textView2));
        return sb.toString();
    }
}
