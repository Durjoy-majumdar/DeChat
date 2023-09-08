package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.model.C42043c;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import py1.C47616k5;
import py1.C47625m0;
import py1.C47656q3;
import py1.C47693w0;
import qy1.C12934a;
import uy1.C52642c;
import uy1.C52645f;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameFeedVideoView */
public class GameFeedVideoView extends LinearLayout implements View.OnClickListener, C111847h {

    /* renamed from: d */
    public GameFeedTitleDescView f113924d;

    /* renamed from: e */
    public FrameLayout f113925e;

    /* renamed from: f */
    public GameRoundImageView f113926f;

    /* renamed from: g */
    public LinearLayout f113927g;

    /* renamed from: h */
    public ImageView f113928h;

    /* renamed from: i */
    public TextView f113929i;

    /* renamed from: j */
    public GameFeedSubscriptView f113930j;

    /* renamed from: n */
    public C42043c f113931n;

    public GameFeedVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameFeedVideoView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C42043c cVar = this.f113931n;
        if (cVar == null) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameFeedVideoView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!Util.isNullOrNil(cVar.f113282d.f128098h)) {
            int t = C52642c.m59002t(getContext(), this.f113931n.f113282d.f128098h, (String) null);
            Context context = getContext();
            C42043c cVar2 = this.f113931n;
            C40314g.m43487f(context, 10, 1024, cVar2.f113280b, t, cVar2.f113282d.f128097g, GameIndexListView.getSourceScene(), C12934a.m12379a(this.f113931n.f113282d.f128096f, "clickType", "card"));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameFeedVideoView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f113924d = (GameFeedTitleDescView) findViewById(C0966R.C0970id.ekf);
        this.f113925e = (FrameLayout) findViewById(C0966R.C0970id.l6c);
        this.f113926f = (GameRoundImageView) findViewById(C0966R.C0970id.l57);
        this.f113927g = (LinearLayout) findViewById(C0966R.C0970id.l5b);
        this.f113928h = (ImageView) findViewById(C0966R.C0970id.l7a);
        this.f113929i = (TextView) findViewById(C0966R.C0970id.l5c);
        this.f113930j = (GameFeedSubscriptView) findViewById(C0966R.C0970id.k_b);
        setOnClickListener(this);
    }

    public void setLiveData(C42043c cVar) {
        C47693w0 w0Var;
        if (cVar == null || (w0Var = cVar.f113282d) == null || w0Var.f128101n == null) {
            setVisibility(8);
            return;
        }
        this.f113931n = cVar;
        setVisibility(0);
        GameFeedTitleDescView gameFeedTitleDescView = this.f113924d;
        C47656q3 q3Var = w0Var.f128101n;
        gameFeedTitleDescView.mo66205a(q3Var.f127947d, q3Var.f127948e, (LinkedList<C47625m0>) null);
        if (!Util.isNullOrNil(w0Var.f128101n.f127949f)) {
            this.f113925e.setVisibility(0);
            C52645f.m59023a().mo73596f(this.f113926f, w0Var.f128101n.f127949f, getResources().getDimensionPixelSize(C0966R.dimen.f3844gh), getResources().getDimensionPixelSize(C0966R.dimen.f3843gg), (C52642c.m58990h(getContext()) - getPaddingLeft()) - getPaddingRight());
        } else {
            this.f113925e.setVisibility(8);
        }
        if (!Util.isNullOrNil(w0Var.f128101n.f127950g)) {
            this.f113927g.setVisibility(0);
            this.f113928h.setVisibility(0);
            this.f113929i.setText(w0Var.f128101n.f127950g);
        } else {
            this.f113927g.setVisibility(8);
        }
        this.f113930j.setData(w0Var);
        if (!this.f113931n.f113284f) {
            Context context = getContext();
            C42043c cVar2 = this.f113931n;
            C12934a.m12380b(context, 10, 1024, cVar2.f113280b, 1, cVar2.f113282d.f128097g, GameIndexListView.getSourceScene(), C12934a.m12382d(this.f113931n.f113282d.f128096f));
            this.f113931n.f113284f = true;
        }
    }

    public void setVideoData(C42043c cVar) {
        C47693w0 w0Var;
        C47616k5 k5Var;
        if (cVar == null || (w0Var = cVar.f113282d) == null || (k5Var = w0Var.f128100j) == null || Util.isNullOrNil(k5Var.f127844g)) {
            setVisibility(8);
            return;
        }
        this.f113931n = cVar;
        C47693w0 w0Var2 = cVar.f113282d;
        setVisibility(0);
        GameFeedTitleDescView gameFeedTitleDescView = this.f113924d;
        C47616k5 k5Var2 = w0Var2.f128100j;
        gameFeedTitleDescView.mo66205a(k5Var2.f127841d, k5Var2.f127842e, (LinkedList<C47625m0>) null);
        C52645f.m59023a().mo73596f(this.f113926f, w0Var2.f128100j.f127844g, getResources().getDimensionPixelSize(C0966R.dimen.f3844gh), getResources().getDimensionPixelSize(C0966R.dimen.f3843gg), (C52642c.m58990h(getContext()) - getPaddingLeft()) - getPaddingRight());
        if (!Util.isNullOrNil(w0Var2.f128100j.f127843f)) {
            this.f113927g.setVisibility(0);
            this.f113928h.setVisibility(8);
            this.f113929i.setText(w0Var2.f128100j.f127843f);
        } else {
            this.f113927g.setVisibility(8);
        }
        this.f113930j.setData(w0Var2);
    }
}
