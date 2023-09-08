package com.tencent.p014mm.plugin.luckymoney.p073ui;

import a14.C0000n0;
import a14.C53930o0;
import android.view.View;
import com.tencent.p014mm.wallet_core.model.C75142u0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import org.libpag.PAGView;
import qo3.C77390c0;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.y0 */
public class C69725y0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77390c0 f201148d;

    /* renamed from: e */
    public final /* synthetic */ PAGView f201149e;

    /* renamed from: f */
    public final /* synthetic */ PAGView.PAGViewListener f201150f;

    /* renamed from: g */
    public final /* synthetic */ PAGView f201151g;

    /* renamed from: h */
    public final /* synthetic */ C0000n0 f201152h;

    public C69725y0(LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI, C77390c0 c0Var, PAGView pAGView, PAGView.PAGViewListener pAGViewListener, PAGView pAGView2, C0000n0 n0Var) {
        this.f201148d = c0Var;
        this.f201149e = pAGView;
        this.f201150f = pAGViewListener;
        this.f201151g = pAGView2;
        this.f201152h = n0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f201148d.dismiss();
        PAGView pAGView = this.f201149e;
        if (pAGView != null && pAGView.getVisibility() == 0) {
            this.f201149e.stop();
            this.f201149e.removeListener(this.f201150f);
        }
        PAGView pAGView2 = this.f201151g;
        if (pAGView2 != null && pAGView2.getVisibility() == 0) {
            this.f201151g.stop();
            this.f201151g.removeListener(this.f201150f);
        }
        C75142u0 u0Var = C75142u0.f221103a;
        C0000n0 n0Var = this.f201152h;
        u0Var.getClass();
        if (n0Var != null) {
            C53930o0.m60556c(n0Var, (CancellationException) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
