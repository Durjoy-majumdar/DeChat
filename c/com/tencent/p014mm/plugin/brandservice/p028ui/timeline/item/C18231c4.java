package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C19623o0;
import gy3.C87412m;
import wd3.C22906q;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.c4 */
public final class C18231c4 implements C22906q.C22907a {

    /* renamed from: a */
    public final /* synthetic */ C18236d4 f50403a;

    /* renamed from: b */
    public final /* synthetic */ C19623o0 f50404b;

    /* renamed from: c */
    public final /* synthetic */ int f50405c;

    public C18231c4(C18236d4 d4Var, C19623o0 o0Var, int i) {
        this.f50403a = d4Var;
        this.f50404b = o0Var;
        this.f50405c = i;
    }

    public void onFinish() {
        C18236d4 d4Var = this.f50403a;
        d4Var.f50817y = true;
        d4Var.f50808p.setTextColor(d4Var.f50824c.getResources().getColor(C0966R.color.BW_100_Alpha_0_6_5));
        ImageView imageView = this.f50403a.f50806n;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        C18236d4 d4Var2 = this.f50403a;
        if (d4Var2.f50816x > 1) {
            d4Var2.f50811s.setTextColor(d4Var2.f50824c.getResources().getColor(C0966R.color.al_));
            View view = this.f50403a.f50427D;
            C87412m.m108591d(view);
            view.setBackgroundResource(C0966R.C0969drawable.f4608ho);
        } else {
            View view2 = d4Var2.f50427D;
            C87412m.m108591d(view2);
            view2.setBackgroundResource(C0966R.C0969drawable.ayq);
        }
        this.f50403a.f50825d.f51445p.mo23110l(this.f50404b.field_msgId, this.f50405c);
    }

    public void onStart() {
    }
}
