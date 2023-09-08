package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import py1.C47693w0;
import py1.C47698x;
import qy1.C12934a;
import uy1.C52642c;
import uy1.C52645f;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameFeedSubscriptView */
public class GameFeedSubscriptView extends LinearLayout implements View.OnClickListener, C111847h {

    /* renamed from: d */
    public TextView f113913d;

    /* renamed from: e */
    public TextView f113914e;

    /* renamed from: f */
    public LinearLayout f113915f;

    /* renamed from: g */
    public ImageView f113916g;

    /* renamed from: h */
    public TextView f113917h;

    /* renamed from: i */
    public TextView f113918i;

    /* renamed from: j */
    public TextView f113919j;

    /* renamed from: n */
    public C47693w0 f113920n;

    public GameFeedSubscriptView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo66202a(int i) {
        String a = i == 1 ? C12934a.m12379a(this.f113920n.f128096f, "clickType", "leftCorner") : C12934a.m12379a(this.f113920n.f128096f, "clickType", "rightCorner");
        Context context = getContext();
        C47693w0 w0Var = this.f113920n;
        C40314g.m43487f(context, 10, 1024, w0Var.f128095e, 7, w0Var.f128097g, GameIndexListView.getSourceScene(), a);
    }

    public void onClick(View view) {
        C47698x xVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameFeedSubscriptView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f113920n == null) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameFeedSubscriptView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getId() == C0966R.C0970id.fmv || view.getId() == C0966R.C0970id.fmw || view.getId() == C0966R.C0970id.a2h) {
            C47698x xVar2 = this.f113920n.f128109v;
            if (xVar2 != null && !Util.isNullOrNil(xVar2.f128128g)) {
                C52642c.m59001s(getContext(), this.f113920n.f128109v.f128128g);
                mo66202a(1);
            }
        } else if (view.getId() == C0966R.C0970id.iu4 && (xVar = this.f113920n.f128110w) != null && !Util.isNullOrNil(xVar.f128128g)) {
            C52642c.m59001s(getContext(), this.f113920n.f128110w.f128128g);
            mo66202a(2);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameFeedSubscriptView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.aw8, this, true);
        this.f113913d = (TextView) inflate.findViewById(C0966R.C0970id.fmv);
        this.f113914e = (TextView) inflate.findViewById(C0966R.C0970id.fmw);
        this.f113915f = (LinearLayout) inflate.findViewById(C0966R.C0970id.a2h);
        this.f113916g = (ImageView) inflate.findViewById(C0966R.C0970id.a1p);
        this.f113917h = (TextView) inflate.findViewById(C0966R.C0970id.hfo);
        this.f113918i = (TextView) inflate.findViewById(C0966R.C0970id.l1o);
        this.f113919j = (TextView) inflate.findViewById(C0966R.C0970id.iu4);
        this.f113913d.setOnClickListener(this);
        this.f113914e.setOnClickListener(this);
        this.f113915f.setOnClickListener(this);
        this.f113919j.setOnClickListener(this);
    }

    public void setData(C47693w0 w0Var) {
        if (w0Var == null || (w0Var.f128109v == null && w0Var.f128110w == null)) {
            setVisibility(8);
            return;
        }
        this.f113920n = w0Var;
        setVisibility(0);
        this.f113913d.setVisibility(8);
        this.f113914e.setVisibility(8);
        this.f113915f.setVisibility(8);
        C47698x xVar = w0Var.f128109v;
        if (xVar != null) {
            int i = xVar.f128129h;
            if (i == 1) {
                this.f113914e.setVisibility(0);
                this.f113914e.setText(w0Var.f128109v.f128127f);
            } else if (i == 2) {
                this.f113913d.setVisibility(0);
                this.f113913d.setText(w0Var.f128109v.f128127f);
            } else if (i == 3) {
                this.f113915f.setVisibility(0);
                if (!Util.isNullOrNil(w0Var.f128109v.f128125d)) {
                    C52645f.C52650d.C52651a aVar = new C52645f.C52650d.C52651a();
                    aVar.f147022c = true;
                    C52645f.m59023a().mo73595e(this.f113916g, w0Var.f128109v.f128125d, aVar.mo73598a(), (C52645f.C52652e) null);
                    this.f113916g.setVisibility(0);
                }
                this.f113917h.setText(w0Var.f128109v.f128126e);
                this.f113918i.setText(w0Var.f128109v.f128127f);
            }
        }
        C47698x xVar2 = w0Var.f128110w;
        if (xVar2 != null) {
            this.f113919j.setText(xVar2.f128127f);
            this.f113919j.setVisibility(0);
            return;
        }
        this.f113919j.setVisibility(8);
    }
}
