package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.model.C42039b;
import com.tencent.p014mm.plugin.game.model.C42091s;
import com.tencent.p014mm.plugin.game.model.C42112t;
import com.tencent.p014mm.plugin.game.p061ui.GameDetailRankUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p763ym.C79138l;
import ry1.C48122i;
import ry1.C48169x0;
import uy1.C52642c;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameRankHeadView */
public class GameRankHeadView extends LinearLayout implements View.OnClickListener, C111847h {

    /* renamed from: d */
    public C42091s.C42092a f114124d;

    /* renamed from: e */
    public C42112t f114125e;

    /* renamed from: f */
    public C42039b f114126f;

    /* renamed from: g */
    public TextView f114127g;

    /* renamed from: h */
    public TextView f114128h;

    /* renamed from: i */
    public TextView f114129i;

    /* renamed from: j */
    public ImageView f114130j;

    public GameRankHeadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo66259a() {
        if (((C79138l) C86312j.m106911c(C79138l.class)).mo74016tz(getContext(), this.f114126f)) {
            if (this.f114126f.f113257J1 > C52642c.m58992j(this.f114126f.field_packageName)) {
                this.f114129i.setText(C0966R.string.f8k);
            } else {
                this.f114129i.setText(C0966R.string.f8i);
            }
        } else if (this.f114126f.f113270y1 != 0) {
            this.f114129i.setText(C0966R.string.f8f);
        } else if (this.f114125e == null) {
            this.f114129i.setVisibility(8);
            this.f114130j.setVisibility(8);
        } else {
            this.f114129i.setVisibility(0);
            this.f114130j.setVisibility(0);
            int i = this.f114125e.f113424b;
            if (i == 0) {
                this.f114129i.setText(C0966R.string.f8f);
            } else if (i == 1) {
                this.f114129i.setText(C0966R.string.f8g);
            } else if (i == 2) {
                this.f114129i.setText(C0966R.string.f8e);
            } else if (i == 3) {
                this.f114129i.setText(C0966R.string.f8h);
            }
        }
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameRankHeadView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C48122i iVar = new C48122i(getContext());
        C42039b bVar = this.f114126f;
        iVar.mo72863a(bVar, new C42112t(bVar));
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameRankHeadView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f114127g = (TextView) findViewById(C0966R.C0970id.f358348ek1);
        this.f114128h = (TextView) findViewById(C0966R.C0970id.ejm);
        this.f114129i = (TextView) findViewById(C0966R.C0970id.f358347ek0);
        this.f114130j = (ImageView) findViewById(C0966R.C0970id.emg);
        Log.m105924i("MicroMsg.GameRankHeadView", "initView finished");
    }

    public void setData(GameDetailRankUI.C42171c cVar) {
        this.f114127g.setText(cVar.f113758a);
        this.f114128h.setText(cVar.f113759b);
        C42039b bVar = cVar.f113760c;
        this.f114126f = bVar;
        bVar.f113255H1 = TXLiteAVCode.WARNING_MICROPHONE_NOT_AUTHORIZED;
        bVar.f113256I1 = 2;
        if (this.f114125e == null) {
            this.f114125e = new C42112t(bVar);
        }
        this.f114125e.mo66072a(getContext());
        this.f114125e.mo66073b();
        mo66259a();
        C42091s.C42092a aVar = this.f114124d;
        if (aVar != null) {
            C42091s.m45783a(aVar);
        } else {
            C48169x0 x0Var = new C48169x0(this);
            this.f114124d = x0Var;
            C42091s.m45783a(x0Var);
        }
        this.f114129i.setOnClickListener(this);
    }
}
