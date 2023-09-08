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
import com.tencent.p014mm.plugin.game.model.C42039b;
import com.tencent.p014mm.plugin.game.model.C42043c;
import com.tencent.p014mm.plugin.game.model.C42056f0;
import com.tencent.p014mm.plugin.game.model.C42112t;
import com.tencent.p014mm.plugin.game.widget.GameTagListView;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import py1.C47693w0;
import qy1.C12934a;
import uy1.C52642c;
import uy1.C52645f;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameFeedGameTemplateView */
public class GameFeedGameTemplateView extends LinearLayout implements View.OnClickListener, C111847h {

    /* renamed from: d */
    public ImageView f113865d;

    /* renamed from: e */
    public TextView f113866e;

    /* renamed from: f */
    public GameTagListView f113867f;

    /* renamed from: g */
    public TextView f113868g;

    /* renamed from: h */
    public FrameLayout f113869h;

    /* renamed from: i */
    public GameRoundImageView f113870i;

    /* renamed from: j */
    public ImageView f113871j;

    /* renamed from: n */
    public GameFeedSubscriptView f113872n;

    /* renamed from: o */
    public GameDownloadView f113873o;

    /* renamed from: p */
    public C42043c f113874p;

    /* renamed from: q */
    public int f113875q;

    public GameFeedGameTemplateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo66185a(ImageView imageView, String str) {
        ImageView imageView2 = imageView;
        String str2 = str;
        C52645f.m59023a().mo73596f(imageView2, str2, getResources().getDimensionPixelSize(C0966R.dimen.f3855gu), getResources().getDimensionPixelSize(C0966R.dimen.f3854gt), (C52642c.m58990h(getContext()) - getPaddingLeft()) - getPaddingRight());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameFeedGameTemplateView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C42043c cVar = this.f113874p;
        if (cVar == null || cVar.f113282d == null) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameFeedGameTemplateView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else if (view.getId() != C0966R.C0970id.l6c || Util.isNullOrNil(this.f113874p.f113282d.f128103p.f127967i)) {
            if (!Util.isNullOrNil(this.f113874p.f113282d.f128098h)) {
                int t = C52642c.m59002t(getContext(), this.f113874p.f113282d.f128098h, (String) null);
                Context context = getContext();
                C42043c cVar2 = this.f113874p;
                C40314g.m43487f(context, 10, 1024, cVar2.f113280b, t, cVar2.f113282d.f128097g, GameIndexListView.getSourceScene(), C12934a.m12379a(this.f113874p.f113282d.f128096f, "clickType", "card"));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameFeedGameTemplateView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            int t2 = C52642c.m59002t(getContext(), this.f113874p.f113282d.f128103p.f127967i, (String) null);
            Context context2 = getContext();
            C42043c cVar3 = this.f113874p;
            C40314g.m43487f(context2, 10, 1024, cVar3.f113280b, t2, cVar3.f113282d.f128097g, GameIndexListView.getSourceScene(), C12934a.m12379a(this.f113874p.f113282d.f128096f, "clickType", "middle"));
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameFeedGameTemplateView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f113865d = (ImageView) findViewById(C0966R.C0970id.ekt);
        this.f113866e = (TextView) findViewById(C0966R.C0970id.emr);
        this.f113867f = (GameTagListView) findViewById(C0966R.C0970id.enw);
        this.f113868g = (TextView) findViewById(C0966R.C0970id.f357845c22);
        this.f113869h = (FrameLayout) findViewById(C0966R.C0970id.l6c);
        this.f113870i = (GameRoundImageView) findViewById(C0966R.C0970id.f39);
        this.f113871j = (ImageView) findViewById(C0966R.C0970id.l6m);
        this.f113872n = (GameFeedSubscriptView) findViewById(C0966R.C0970id.k_b);
        this.f113873o = (GameDownloadView) findViewById(C0966R.C0970id.ek9);
        setOnClickListener(this);
        this.f113875q = C52642c.m58990h(getContext()) - C76577a.m92151b(getContext(), WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE_VIDEO);
    }

    public void setData(C42043c cVar) {
        C47693w0 w0Var;
        if (cVar == null || (w0Var = cVar.f113282d) == null || w0Var.f128103p == null) {
            setVisibility(8);
            return;
        }
        this.f113874p = cVar;
        setVisibility(0);
        C52645f.m59023a().mo73592b(this.f113865d, w0Var.f128103p.f127970o.f127726d, C76577a.m92156g(getContext()));
        this.f113866e.setText(w0Var.f128103p.f127970o.f127728f);
        this.f113867f.mo5432a(w0Var.f128103p.f127970o.f127725C, this.f113875q);
        if (!Util.isNullOrNil(w0Var.f128103p.f127965g)) {
            this.f113868g.setText(w0Var.f128103p.f127965g);
            this.f113868g.setVisibility(0);
        } else {
            this.f113868g.setVisibility(8);
        }
        this.f113869h.setVisibility(0);
        if (!Util.isNullOrNil(w0Var.f128103p.f127968j)) {
            mo66185a(this.f113870i, w0Var.f128103p.f127966h);
            this.f113871j.setVisibility(0);
        } else if (!Util.isNullOrNil(w0Var.f128103p.f127966h)) {
            mo66185a(this.f113870i, w0Var.f128103p.f127966h);
            this.f113871j.setVisibility(8);
        } else {
            this.f113869h.setVisibility(8);
        }
        this.f113869h.setOnClickListener(this);
        this.f113872n.setData(w0Var);
        C42039b a = C42056f0.m45762a(this.f113874p.f113282d.f128103p.f127970o);
        a.f113254G1 = 10;
        a.f113255H1 = 1024;
        a.f113256I1 = this.f113874p.f113280b;
        this.f113873o.setDownloadInfo(new C42112t(a));
        if (!this.f113874p.f113284f) {
            Context context = getContext();
            C42043c cVar2 = this.f113874p;
            C12934a.m12380b(context, 10, 1024, cVar2.f113280b, 1, cVar2.f113282d.f128097g, GameIndexListView.getSourceScene(), C12934a.m12382d(this.f113874p.f113282d.f128096f));
            this.f113874p.f113284f = true;
        }
    }
}
