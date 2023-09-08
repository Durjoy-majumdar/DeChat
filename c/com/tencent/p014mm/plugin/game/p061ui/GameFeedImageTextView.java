package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.model.C42043c;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;
import py1.C47572e3;
import py1.C47625m0;
import py1.C47693w0;
import qy1.C12934a;
import uy1.C52642c;
import uy1.C52645f;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameFeedImageTextView */
public class GameFeedImageTextView extends LinearLayout implements View.OnClickListener, C111847h {

    /* renamed from: d */
    public GameFeedTitleDescView f113876d;

    /* renamed from: e */
    public GameRoundImageView f113877e;

    /* renamed from: f */
    public LinearLayout f113878f;

    /* renamed from: g */
    public GameRoundImageView f113879g;

    /* renamed from: h */
    public GameRoundImageView f113880h;

    /* renamed from: i */
    public GameRoundImageView f113881i;

    /* renamed from: j */
    public TextView f113882j;

    /* renamed from: n */
    public GameFeedSubscriptView f113883n;

    /* renamed from: o */
    public int f113884o = 0;

    /* renamed from: p */
    public int f113885p;

    /* renamed from: q */
    public C42043c f113886q;

    public GameFeedImageTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onClick(View view) {
        C47693w0 w0Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameFeedImageTextView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C42043c cVar = this.f113886q;
        if (cVar == null || (w0Var = cVar.f113282d) == null) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameFeedImageTextView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!Util.isNullOrNil(w0Var.f128098h)) {
            int t = C52642c.m59002t(getContext(), this.f113886q.f113282d.f128098h, (String) null);
            Context context = getContext();
            C42043c cVar2 = this.f113886q;
            C40314g.m43487f(context, 10, 1024, cVar2.f113280b, t, cVar2.f113282d.f128097g, GameIndexListView.getSourceScene(), C12934a.m12379a(this.f113886q.f113282d.f128096f, "clickType", "card"));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameFeedImageTextView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f113876d = (GameFeedTitleDescView) findViewById(C0966R.C0970id.ekf);
        this.f113877e = (GameRoundImageView) findViewById(C0966R.C0970id.a8y);
        this.f113878f = (LinearLayout) findViewById(C0966R.C0970id.jnb);
        this.f113879g = (GameRoundImageView) findViewById(C0966R.C0970id.e_8);
        this.f113880h = (GameRoundImageView) findViewById(C0966R.C0970id.j7b);
        this.f113881i = (GameRoundImageView) findViewById(C0966R.C0970id.kjd);
        this.f113882j = (TextView) findViewById(C0966R.C0970id.gzl);
        this.f113883n = (GameFeedSubscriptView) findViewById(C0966R.C0970id.k_b);
        setOnClickListener(this);
        this.f113884o = (((C52642c.m58990h(getContext()) - getPaddingLeft()) - getPaddingRight()) - (C76577a.m92151b(getContext(), 10) * 2)) / 3;
        int b = C76577a.m92151b(getContext(), 105);
        this.f113885p = b;
        int i = this.f113884o;
        if (i < b) {
            this.f113885p = i;
        }
        ViewGroup.LayoutParams layoutParams = this.f113879g.getLayoutParams();
        int i2 = this.f113885p;
        layoutParams.width = i2;
        layoutParams.height = i2;
        this.f113879g.setLayoutParams(layoutParams);
        this.f113880h.setLayoutParams(layoutParams);
        this.f113881i.setLayoutParams(layoutParams);
    }

    public void setData(C42043c cVar) {
        C47693w0 w0Var;
        if (cVar == null || (w0Var = cVar.f113282d) == null || w0Var.f128099i == null) {
            setVisibility(8);
            return;
        }
        this.f113886q = cVar;
        setVisibility(0);
        GameFeedTitleDescView gameFeedTitleDescView = this.f113876d;
        C47572e3 e3Var = w0Var.f128099i;
        gameFeedTitleDescView.mo66205a(e3Var.f127669d, e3Var.f127670e, (LinkedList<C47625m0>) null);
        if (!Util.isNullOrNil((List) w0Var.f128099i.f127671f)) {
            int size = w0Var.f128099i.f127671f.size();
            if (size == 1) {
                this.f113878f.setVisibility(8);
                this.f113877e.setVisibility(0);
                C52645f.m59023a().mo73596f(this.f113877e, w0Var.f128099i.f127671f.get(0), getResources().getDimensionPixelSize(C0966R.dimen.f3844gh), getResources().getDimensionPixelSize(C0966R.dimen.f3843gg), (C52642c.m58990h(getContext()) - getPaddingLeft()) - getPaddingRight());
            } else {
                this.f113877e.setVisibility(8);
                this.f113878f.setVisibility(0);
                this.f113882j.setVisibility(8);
                C52645f.C52650d.C52651a aVar = new C52645f.C52650d.C52651a();
                aVar.f147023d = true;
                C52645f.C52650d a = aVar.mo73598a();
                C52645f.m59023a().mo73595e(this.f113879g, w0Var.f128099i.f127671f.get(0), a, (C52645f.C52652e) null);
                C52645f.m59023a().mo73595e(this.f113880h, w0Var.f128099i.f127671f.get(1), a, (C52645f.C52652e) null);
                if (size > 2) {
                    C52645f.m59023a().mo73595e(this.f113881i, w0Var.f128099i.f127671f.get(2), a, (C52645f.C52652e) null);
                    this.f113881i.setVisibility(0);
                    if (size > 3) {
                        this.f113882j.setVisibility(0);
                        this.f113882j.setText(String.format("共%d张", new Object[]{Integer.valueOf(size)}));
                    }
                } else {
                    this.f113881i.setVisibility(4);
                }
            }
        } else {
            this.f113877e.setVisibility(8);
            this.f113878f.setVisibility(8);
        }
        this.f113883n.setData(w0Var);
        if (!this.f113886q.f113284f) {
            Context context = getContext();
            C42043c cVar2 = this.f113886q;
            C12934a.m12380b(context, 10, 1024, cVar2.f113280b, 1, cVar2.f113282d.f128097g, GameIndexListView.getSourceScene(), C12934a.m12382d(this.f113886q.f113282d.f128096f));
            this.f113886q.f113284f = true;
        }
    }
}
