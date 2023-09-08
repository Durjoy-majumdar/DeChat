package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.model.C42043c;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import py1.C47625m0;
import py1.C47693w0;
import py1.C47704y;
import qy1.C12934a;
import uy1.C52642c;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameFeedAddTopicView */
public class GameFeedAddTopicView extends LinearLayout implements View.OnClickListener, C111847h {

    /* renamed from: d */
    public GameFeedTitleDescView f113862d;

    /* renamed from: e */
    public TextView f113863e;

    /* renamed from: f */
    public C42043c f113864f;

    public GameFeedAddTopicView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onClick(View view) {
        C47693w0 w0Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameFeedAddTopicView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C42043c cVar = this.f113864f;
        if (cVar == null || (w0Var = cVar.f113282d) == null) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameFeedAddTopicView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!Util.isNullOrNil(w0Var.f128098h)) {
            int t = C52642c.m59002t(getContext(), this.f113864f.f113282d.f128098h, (String) null);
            Context context = getContext();
            C42043c cVar2 = this.f113864f;
            C40314g.m43487f(context, 10, 1024, cVar2.f113280b, t, cVar2.f113282d.f128097g, GameIndexListView.getSourceScene(), C12934a.m12379a(this.f113864f.f113282d.f128096f, "clickType", "card"));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameFeedAddTopicView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f113862d = (GameFeedTitleDescView) findViewById(C0966R.C0970id.ekf);
        this.f113863e = (TextView) findViewById(C0966R.C0970id.f5599jg);
        setOnClickListener(this);
    }

    public void setData(C42043c cVar) {
        C47693w0 w0Var;
        if (cVar == null || (w0Var = cVar.f113282d) == null || w0Var.f128106s == null) {
            setVisibility(8);
            return;
        }
        this.f113864f = cVar;
        setVisibility(0);
        GameFeedTitleDescView gameFeedTitleDescView = this.f113862d;
        C47704y yVar = cVar.f113282d.f128106s;
        gameFeedTitleDescView.mo66205a(yVar.f128150d, yVar.f128151e, (LinkedList<C47625m0>) null);
        this.f113863e.setText(cVar.f113282d.f128106s.f128152f);
        if (!this.f113864f.f113284f) {
            Context context = getContext();
            C42043c cVar2 = this.f113864f;
            C12934a.m12380b(context, 10, 1024, cVar2.f113280b, 1, cVar2.f113282d.f128097g, GameIndexListView.getSourceScene(), C12934a.m12382d(this.f113864f.f113282d.f128096f));
            this.f113864f.f113284f = true;
        }
    }
}
