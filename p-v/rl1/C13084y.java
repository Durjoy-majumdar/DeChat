package rl1;

import ak1.C54067f0;
import ak1.C54108o;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import cm1.C0724d1;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import ke3.C88144b;

/* renamed from: rl1.y */
public final class C13084y implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C0724d1 f37248d;

    /* renamed from: e */
    public final /* synthetic */ C13018b0 f37249e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f37250f;

    public C13084y(C0724d1 d1Var, C13018b0 b0Var, C60905o oVar) {
        this.f37248d = d1Var;
        this.f37249e = b0Var;
        this.f37250f = oVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersHeaderConvert$setClaimInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((C54108o) C86312j.m106911c(C54108o.class)).Mx0(C54067f0.C0051c.CLICK_LOTTERY_DETAIL_CLAIM_INFO, "");
        C0724d1 d1Var = this.f37248d;
        if (d1Var.f1741h == 1) {
            C13018b0.m12466j(this.f37249e, this.f37250f, d1Var.f1740g);
        } else {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f37248d.f1739f);
            C88144b.m109791i(this.f37250f.f173499A, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersHeaderConvert$setClaimInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
