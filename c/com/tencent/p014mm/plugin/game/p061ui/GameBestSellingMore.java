package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.model.C42043c;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.rtmp.TXLiveConstants;
import j20.C117292a;
import java.util.ArrayList;
import py1.C47626m1;
import py1.C47693w0;
import qy1.C12934a;
import uy1.C52642c;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameBestSellingMore */
public class GameBestSellingMore extends LinearLayout implements View.OnClickListener, C111847h {

    /* renamed from: d */
    public TextView f113651d;

    /* renamed from: e */
    public ImageView f113652e;

    /* renamed from: f */
    public C42043c f113653f;

    public GameBestSellingMore(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onClick(View view) {
        C47693w0 w0Var;
        C47626m1 m1Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameBestSellingMore", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C42043c cVar = this.f113653f;
        if (cVar == null || (w0Var = cVar.f113282d) == null || (m1Var = w0Var.f128105r) == null || Util.isNullOrNil(m1Var.f127868g)) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameBestSellingMore", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C40314g.m43487f(getContext(), 10, TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED, 999, C52642c.m59002t(getContext(), this.f113653f.f113282d.f128105r.f127868g, (String) null), (String) null, GameIndexListView.getSourceScene(), C12934a.m12382d(this.f113653f.f113282d.f128096f));
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameBestSellingMore", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f113651d = (TextView) findViewById(C0966R.C0970id.gzk);
        this.f113652e = (ImageView) findViewById(C0966R.C0970id.gzj);
        setOnClickListener(this);
    }

    public void setData(C42043c cVar) {
        C47693w0 w0Var;
        C47626m1 m1Var;
        this.f113653f = cVar;
        if (cVar == null || (w0Var = cVar.f113282d) == null || (m1Var = w0Var.f128105r) == null || Util.isNullOrNil(m1Var.f127867f)) {
            this.f113651d.setVisibility(8);
            this.f113652e.setVisibility(8);
            setPadding(0, 0, 0, 0);
            return;
        }
        setPadding(getResources().getDimensionPixelSize(C0966R.dimen.f3847gm), 0, getResources().getDimensionPixelSize(C0966R.dimen.f3847gm), getResources().getDimensionPixelSize(C0966R.dimen.f3847gm));
        this.f113651d.setVisibility(0);
        this.f113652e.setVisibility(0);
        this.f113651d.setText(cVar.f113282d.f128105r.f127867f);
    }
}
