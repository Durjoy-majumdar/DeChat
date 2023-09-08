package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.model.C42043c;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import py1.C47625m0;
import py1.C47663r3;
import py1.C47693w0;
import qy1.C12934a;
import uy1.C52642c;
import uy1.C52645f;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameFeedMatchView */
public class GameFeedMatchView extends LinearLayout implements View.OnClickListener, C111847h {

    /* renamed from: d */
    public GameFeedTitleDescView f113887d;

    /* renamed from: e */
    public GameRoundImageView f113888e;

    /* renamed from: f */
    public GameFeedSubscriptView f113889f;

    /* renamed from: g */
    public C42043c f113890g;

    public GameFeedMatchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onClick(View view) {
        C47693w0 w0Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameFeedMatchView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C42043c cVar = this.f113890g;
        if (cVar == null || (w0Var = cVar.f113282d) == null) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameFeedMatchView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!Util.isNullOrNil(w0Var.f128098h)) {
            int t = C52642c.m59002t(getContext(), this.f113890g.f113282d.f128098h, (String) null);
            Context context = getContext();
            C42043c cVar2 = this.f113890g;
            C40314g.m43487f(context, 10, 1024, cVar2.f113280b, t, cVar2.f113282d.f128097g, GameIndexListView.getSourceScene(), C12934a.m12379a(this.f113890g.f113282d.f128096f, "clickType", "card"));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameFeedMatchView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f113887d = (GameFeedTitleDescView) findViewById(C0966R.C0970id.ekf);
        this.f113888e = (GameRoundImageView) findViewById(C0966R.C0970id.a8y);
        this.f113889f = (GameFeedSubscriptView) findViewById(C0966R.C0970id.k_b);
        setOnClickListener(this);
    }

    public void setData(C42043c cVar) {
        C47693w0 w0Var;
        if (cVar == null || (w0Var = cVar.f113282d) == null || w0Var.f128102o == null) {
            setVisibility(8);
            return;
        }
        this.f113890g = cVar;
        setVisibility(0);
        GameFeedTitleDescView gameFeedTitleDescView = this.f113887d;
        C47663r3 r3Var = w0Var.f128102o;
        gameFeedTitleDescView.mo66205a(r3Var.f127976d, r3Var.f127978f, (LinkedList<C47625m0>) null);
        if (!Util.isNullOrNil(w0Var.f128102o.f127977e)) {
            this.f113888e.setVisibility(0);
            C52645f.m59023a().mo73596f(this.f113888e, w0Var.f128102o.f127977e, getResources().getDimensionPixelSize(C0966R.dimen.f3855gu), getResources().getDimensionPixelSize(C0966R.dimen.f3854gt), (C52642c.m58990h(getContext()) - getPaddingLeft()) - getPaddingRight());
        } else {
            setVisibility(8);
        }
        this.f113889f.setData(w0Var);
        if (!this.f113890g.f113284f) {
            Context context = getContext();
            C42043c cVar2 = this.f113890g;
            C12934a.m12380b(context, 10, 1024, cVar2.f113280b, 1, cVar2.f113282d.f128097g, GameIndexListView.getSourceScene(), C12934a.m12382d(this.f113890g.f113282d.f128096f));
            this.f113890g.f113284f = true;
        }
    }
}
