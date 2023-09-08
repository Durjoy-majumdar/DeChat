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
import com.tencent.p014mm.plugin.game.model.C42043c;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import py1.C47584g1;
import py1.C47693w0;
import qy1.C12934a;
import uy1.C52642c;
import uy1.C52645f;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameFeedQipaiView */
public class GameFeedQipaiView extends LinearLayout implements View.OnClickListener, C111847h {

    /* renamed from: d */
    public TextView f113903d;

    /* renamed from: e */
    public TextView f113904e;

    /* renamed from: f */
    public ImageView f113905f;

    /* renamed from: g */
    public LinearLayout f113906g;

    /* renamed from: h */
    public C47693w0 f113907h;

    public GameFeedQipaiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameFeedQipaiView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f113907h == null) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameFeedQipaiView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else if (view.getId() == C0966R.C0970id.gzf) {
            if (!Util.isNullOrNil(this.f113907h.f128108u.f127818g)) {
                C40314g.m43487f(getContext(), 10, 1023, 999, C52642c.m59002t(getContext(), this.f113907h.f128108u.f127818g, (String) null), (String) null, GameIndexListView.getSourceScene(), C12934a.m12382d(this.f113907h.f128096f));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameFeedQipaiView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            int intValue = ((Integer) view.getTag()).intValue();
            if (intValue < 0 || intValue > this.f113907h.f128108u.f127816e.size() - 1) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameFeedQipaiView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C47584g1 g1Var = this.f113907h.f128108u.f127816e.get(intValue);
            if (!Util.isNullOrNil(g1Var.f127709g)) {
                C40314g.m43487f(getContext(), 10, 1023, intValue + 1, C52642c.m59002t(getContext(), g1Var.f127709g, (String) null), g1Var.f127710h, GameIndexListView.getSourceScene(), C12934a.m12382d(this.f113907h.f128096f));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameFeedQipaiView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f113903d = (TextView) findViewById(C0966R.C0970id.knx);
        this.f113904e = (TextView) findViewById(C0966R.C0970id.gzf);
        this.f113905f = (ImageView) findViewById(C0966R.C0970id.f358770gz3);
        this.f113906g = (LinearLayout) findViewById(C0966R.C0970id.elf);
        this.f113904e.setOnClickListener(this);
    }

    public void setData(C42043c cVar) {
        C47693w0 w0Var;
        if (cVar == null || (w0Var = cVar.f113282d) == null || w0Var.f128108u == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.f113907h = w0Var;
        if (!Util.isNullOrNil(w0Var.f128108u.f127815d)) {
            this.f113903d.setText(w0Var.f128108u.f127815d);
            this.f113903d.setVisibility(0);
        } else {
            this.f113903d.setVisibility(8);
        }
        if (!Util.isNullOrNil(w0Var.f128108u.f127817f)) {
            this.f113905f.setVisibility(0);
            this.f113904e.setVisibility(0);
            this.f113904e.setText(w0Var.f128108u.f127817f);
        } else {
            this.f113904e.setVisibility(8);
            this.f113905f.setVisibility(8);
        }
        this.f113906g.removeAllViews();
        if (!Util.isNullOrNil((List) w0Var.f128108u.f127816e)) {
            Iterator<C47584g1> it = w0Var.f128108u.f127816e.iterator();
            while (it.hasNext()) {
                C47584g1 next = it.next();
                View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.auo, this, false);
                inflate.setOnClickListener(this);
                inflate.setTag(Integer.valueOf(w0Var.f128108u.f127816e.indexOf(next)));
                this.f113906g.addView(inflate, new LinearLayout.LayoutParams(-1, -2, 1.0f));
                ((TextView) inflate.findViewById(C0966R.C0970id.igr)).setVisibility(8);
                C52645f.m59023a().mo73595e((ImageView) inflate.findViewById(C0966R.C0970id.igo), next.f127706d, (C52645f.C52650d) null, (C52645f.C52652e) null);
                ((TextView) inflate.findViewById(C0966R.C0970id.igq)).setText(next.f127707e);
                ((TextView) inflate.findViewById(C0966R.C0970id.ign)).setText(next.f127708f);
            }
        }
        if (!cVar.f113284f) {
            C12934a.m12380b(getContext(), 10, 1023, cVar.f113280b, 1, cVar.f113282d.f128097g, GameIndexListView.getSourceScene(), C12934a.m12382d(cVar.f113282d.f128096f));
            cVar.f113284f = true;
        }
    }
}
