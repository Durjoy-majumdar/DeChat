package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C18479j;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l;
import com.tencent.p014mm.storage.C19623o0;
import fy0.C8219i;
import gy3.C87412m;
import kw0.C46746a;
import s90.C77629i;
import s90.C77630j;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.d4 */
public final class C18236d4 extends C18349r3 {

    /* renamed from: B */
    public ImageView f50425B;

    /* renamed from: C */
    public TextView f50426C;

    /* renamed from: D */
    public View f50427D;

    /* renamed from: E */
    public View f50428E;

    /* renamed from: f */
    public void mo22848f(int i, C77630j jVar, C19623o0 o0Var, int i2, C77629i iVar, int i3) {
        int i4;
        C77630j jVar2 = jVar;
        C19623o0 o0Var2 = o0Var;
        C87412m.m108594g(jVar2, "topItem");
        C87412m.m108594g(o0Var2, "info");
        super.mo22848f(i, jVar, o0Var, i2, iVar, i3);
        this.f50806n.setVisibility(8);
        View view = this.f50428E;
        int i5 = C18508z2.f51414N;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i5;
        view.setLayoutParams(layoutParams);
        ImageView imageView = this.f50425B;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.f50811s.setTextColor(this.f50824c.getResources().getColor(C0966R.color.a18));
        View view2 = this.f50427D;
        C87412m.m108591d(view2);
        view2.setBackgroundResource(C0966R.C0969drawable.ags);
        this.f50808p.setTextColor(this.f50824c.getResources().getColor(C0966R.color.a18));
        C18479j jVar3 = this.f50825d.f51445p;
        jVar3.getClass();
        this.f50825d.f51445p.mo23109k(o0Var2.field_msgId, 0, jVar, jVar2.f226330i, this.f50425B, C46746a.f125826a.mo71973f(jVar3.f51309a) - C18508z2.f51418S, C18508z2.f51414N, false, new C18231c4(this, o0Var2, i2), false, this.f50804A);
        mo22880d(this.f50816x, jVar2, o0Var2);
        C40726l.f109414a.mo63636e(jVar2.f226326e, jVar2.f226333o);
        if (!mo22917j(i, jVar)) {
            mo22920b(this.f50807o, this.f50808p, o0Var2, jVar2);
        }
        C18508z2 z2Var = this.f50825d;
        View view3 = this.f50827f;
        C87412m.m108593f(view3, "clickView");
        z2Var.mo23168z(jVar, o0Var, i2, iVar, view3, this.f50816x > 1, 0);
        if (this.f50816x == 1) {
            this.f50827f.setBackgroundResource(C0966R.C0969drawable.f4588h4);
            View view4 = this.f50827f;
            i4 = 0;
            view4.setPadding(view4.getPaddingLeft(), 0, this.f50827f.getPaddingRight(), C18508z2.f51417R);
        } else {
            i4 = 0;
            this.f50827f.setBackgroundResource(C0966R.C0969drawable.f4595ha);
            View view5 = this.f50827f;
            view5.setPadding(view5.getPaddingLeft(), 0, this.f50827f.getPaddingRight(), 0);
        }
        this.f50806n.setBackgroundResource(C0966R.C0969drawable.f4587h3);
        if (jVar2.f226311C > 1) {
            TextView textView = this.f50426C;
            if (textView != null) {
                textView.setVisibility(i4);
            }
            TextView textView2 = this.f50426C;
            if (textView2 != null) {
                textView2.setText(String.valueOf(jVar2.f226311C));
                return;
            }
            return;
        }
        TextView textView3 = this.f50426C;
        if (textView3 != null) {
            textView3.setText("");
        }
        TextView textView4 = this.f50426C;
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
    }

    /* renamed from: g */
    public void mo22825g(View view, C18508z2 z2Var) {
        C87412m.m108594g(view, "parent");
        C87412m.m108594g(z2Var, "adapter");
        this.f50824c = view.getContext();
        this.f50825d = z2Var;
        if (this.f50826e == null) {
            View findViewById = view.findViewById(C0966R.C0970id.oba);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.view.ViewStub");
            ((ViewStub) findViewById).inflate();
            this.f50826e = view.findViewById(C0966R.C0970id.o59);
            this.f50827f = view.findViewById(C0966R.C0970id.o5i);
            mo22915h();
            this.f50425B = (ImageView) view.findViewById(C0966R.C0970id.buo);
            this.f50426C = (TextView) view.findViewById(C0966R.C0970id.hwd);
            this.f50811s = (MMNeat7extView) this.f50826e.findViewById(C0966R.C0970id.kpm);
            this.f50428E = this.f50826e.findViewById(C0966R.C0970id.o5l);
            this.f50806n = (ImageView) this.f50826e.findViewById(C0966R.C0970id.i1x);
            this.f50427D = this.f50826e.findViewById(C0966R.C0970id.mae);
            this.f50812t = (LinearLayout) this.f50826e.findViewById(C0966R.C0970id.jmn);
            this.f50813u = (MMNeat7extView) this.f50826e.findViewById(C0966R.C0970id.jmk);
            this.f50814v = (MMNeat7extView) this.f50826e.findViewById(C0966R.C0970id.jmf);
            this.f50809q = this.f50826e.findViewById(C0966R.C0970id.k0r);
            this.f50810r = (TextView) this.f50826e.findViewById(C0966R.C0970id.efv);
            C8219i iVar = C8219i.f27144a;
        }
    }
}
