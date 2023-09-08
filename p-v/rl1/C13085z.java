package rl1;

import android.view.View;
import cm1.C0724d1;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: rl1.z */
public final class C13085z implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C13018b0 f37251d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f37252e;

    /* renamed from: f */
    public final /* synthetic */ C0724d1 f37253f;

    public C13085z(C13018b0 b0Var, C60905o oVar, C0724d1 d1Var) {
        this.f37251d = b0Var;
        this.f37252e = oVar;
        this.f37253f = d1Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersHeaderConvert$setClaimInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C13018b0.m12466j(this.f37251d, this.f37252e, this.f37253f.f1740g);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersHeaderConvert$setClaimInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
