package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.model.C42039b;
import com.tencent.p014mm.plugin.game.model.C42043c;
import com.tencent.p014mm.plugin.game.model.C42056f0;
import com.tencent.p014mm.plugin.game.model.C42112t;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import py1.C47552b4;
import py1.C47693w0;
import qy1.C12934a;
import uy1.C52642c;
import uy1.C52645f;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameFeedNoGamePlayTemplate */
public class GameFeedNoGamePlayTemplate extends LinearLayout implements View.OnClickListener, C111847h {

    /* renamed from: d */
    public GameFeedTitleDescView f113894d;

    /* renamed from: e */
    public FrameLayout f113895e;

    /* renamed from: f */
    public GameRoundImageView f113896f;

    /* renamed from: g */
    public ImageView f113897g;

    /* renamed from: h */
    public RelativeLayout f113898h;

    /* renamed from: i */
    public ImageView f113899i;

    /* renamed from: j */
    public GameDownloadView f113900j;

    /* renamed from: n */
    public TextView f113901n;

    /* renamed from: o */
    public C42043c f113902o;

    public GameFeedNoGamePlayTemplate(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onClick(View view) {
        C47693w0 w0Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameFeedNoGamePlayTemplate", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C42043c cVar = this.f113902o;
        if (cVar == null || (w0Var = cVar.f113282d) == null || w0Var.f128104q == null) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameFeedNoGamePlayTemplate", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else if (view.getId() != C0966R.C0970id.f4w || Util.isNullOrNil(this.f113902o.f113282d.f128104q.f127602h)) {
            if (!Util.isNullOrNil(this.f113902o.f113282d.f128098h)) {
                int t = C52642c.m59002t(getContext(), this.f113902o.f113282d.f128098h, (String) null);
                Context context = getContext();
                C42043c cVar2 = this.f113902o;
                C40314g.m43487f(context, 10, 1024, cVar2.f113280b, t, cVar2.f113282d.f128097g, GameIndexListView.getSourceScene(), C12934a.m12379a(this.f113902o.f113282d.f128096f, "clickType", "card"));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameFeedNoGamePlayTemplate", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            int t2 = C52642c.m59002t(getContext(), this.f113902o.f113282d.f128104q.f127602h, (String) null);
            Context context2 = getContext();
            C42043c cVar3 = this.f113902o;
            C40314g.m43487f(context2, 10, 1024, cVar3.f113280b, t2, cVar3.f113282d.f128097g, GameIndexListView.getSourceScene(), C12934a.m12379a(this.f113902o.f113282d.f128096f, "clickType", "middle"));
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameFeedNoGamePlayTemplate", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f113894d = (GameFeedTitleDescView) findViewById(C0966R.C0970id.ekf);
        this.f113895e = (FrameLayout) findViewById(C0966R.C0970id.f4w);
        this.f113896f = (GameRoundImageView) findViewById(C0966R.C0970id.bv5);
        this.f113897g = (ImageView) findViewById(C0966R.C0970id.l6m);
        this.f113898h = (RelativeLayout) findViewById(C0966R.C0970id.ein);
        this.f113899i = (ImageView) findViewById(C0966R.C0970id.ekt);
        this.f113901n = (TextView) findViewById(C0966R.C0970id.emr);
        this.f113900j = (GameDownloadView) findViewById(C0966R.C0970id.ek9);
        setOnClickListener(this);
        this.f113895e.setOnClickListener(this);
    }

    public void setData(C42043c cVar) {
        C47693w0 w0Var;
        Log.m105918d("MicroMsg.GameFeedNoGamePlayTemplate", "setData");
        if (cVar == null || (w0Var = cVar.f113282d) == null || w0Var.f128104q == null) {
            setVisibility(8);
            return;
        }
        Log.m105918d("MicroMsg.GameFeedNoGamePlayTemplate", "setData 1");
        this.f113902o = cVar;
        C47693w0 w0Var2 = cVar.f113282d;
        setVisibility(0);
        GameFeedTitleDescView gameFeedTitleDescView = this.f113894d;
        C47552b4 b4Var = w0Var2.f128104q;
        gameFeedTitleDescView.mo66205a(b4Var.f127598d, b4Var.f127601g, b4Var.f127604j);
        this.f113895e.setVisibility(0);
        if (!Util.isNullOrNil(w0Var2.f128104q.f127600f)) {
            C52645f.m59023a().mo73596f(this.f113896f, w0Var2.f128104q.f127600f, getResources().getDimensionPixelSize(C0966R.dimen.f3855gu), getResources().getDimensionPixelSize(C0966R.dimen.f3854gt), (C52642c.m58990h(getContext()) - getPaddingLeft()) - getPaddingRight());
            if (!Util.isNullOrNil(w0Var2.f128104q.f127602h)) {
                this.f113897g.setVisibility(0);
            } else {
                this.f113897g.setVisibility(8);
            }
        } else {
            this.f113895e.setVisibility(8);
        }
        if (w0Var2.f128104q.f127603i != null) {
            this.f113898h.setVisibility(0);
            C52645f.m59023a().mo73592b(this.f113899i, w0Var2.f128104q.f127603i.f127726d, C76577a.m92156g(getContext()));
            this.f113901n.setText(w0Var2.f128104q.f127603i.f127728f);
            C42039b a = C42056f0.m45762a(w0Var2.f128104q.f127603i);
            a.f113254G1 = 10;
            a.f113255H1 = 1024;
            a.f113256I1 = this.f113902o.f113280b;
            this.f113900j.setDownloadInfo(new C42112t(a));
        }
        if (!this.f113902o.f113284f) {
            Context context = getContext();
            C42043c cVar2 = this.f113902o;
            C12934a.m12380b(context, 10, 1024, cVar2.f113280b, 1, cVar2.f113282d.f128097g, GameIndexListView.getSourceScene(), C12934a.m12382d(this.f113902o.f113282d.f128096f));
            this.f113902o.f113284f = true;
        }
    }
}
