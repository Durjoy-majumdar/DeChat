package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.model.C42043c;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import py1.C47693w0;
import qy1.C12934a;
import uy1.C52642c;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameFeedMoreGameEntranceView */
public class GameFeedMoreGameEntranceView extends RelativeLayout implements View.OnClickListener, C111847h {

    /* renamed from: d */
    public TextView f113892d;

    /* renamed from: e */
    public C42043c f113893e;

    public GameFeedMoreGameEntranceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onClick(View view) {
        C47693w0 w0Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameFeedMoreGameEntranceView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C42043c cVar = this.f113893e;
        if (cVar == null || (w0Var = cVar.f113282d) == null) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameFeedMoreGameEntranceView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!Util.isNullOrNil(w0Var.f128098h)) {
            int t = C52642c.m59002t(getContext(), this.f113893e.f113282d.f128098h, (String) null);
            Context context = getContext();
            C42043c cVar2 = this.f113893e;
            C40314g.m43487f(context, 10, 1024, cVar2.f113280b, t, cVar2.f113282d.f128097g, GameIndexListView.getSourceScene(), C12934a.m12379a(this.f113893e.f113282d.f128096f, "clickType", "card"));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameFeedMoreGameEntranceView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f113892d = (TextView) findViewById(C0966R.C0970id.gzk);
        setOnClickListener(this);
    }

    public void setData(C42043c cVar) {
        C47693w0 w0Var;
        if (cVar == null || (w0Var = cVar.f113282d) == null || w0Var.f128107t == null) {
            setVisibility(8);
            return;
        }
        this.f113893e = cVar;
        setVisibility(0);
        this.f113892d.setText(cVar.f113282d.f128107t.f128087d);
        if (!this.f113893e.f113284f) {
            Context context = getContext();
            C42043c cVar2 = this.f113893e;
            C12934a.m12380b(context, 10, 1024, cVar2.f113280b, 1, cVar2.f113282d.f128097g, GameIndexListView.getSourceScene(), C12934a.m12382d(this.f113893e.f113282d.f128096f));
            this.f113893e.f113284f = true;
        }
    }
}
