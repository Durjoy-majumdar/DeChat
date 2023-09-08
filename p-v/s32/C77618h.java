package s32;

import android.animation.Animator;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.f2f.p072ui.LuckyMoneyF2FReceiveUI;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyBeforeDetailUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: s32.h */
public class C77618h implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyF2FReceiveUI f226282d;

    public C77618h(LuckyMoneyF2FReceiveUI luckyMoneyF2FReceiveUI) {
        this.f226282d = luckyMoneyF2FReceiveUI;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        Log.m105924i("LuckyMoneyF2FReceiveUI", "packet exit animator end");
        LuckyMoneyF2FReceiveUI luckyMoneyF2FReceiveUI = this.f226282d;
        Intent intent = luckyMoneyF2FReceiveUI.f198891x;
        if (intent != null) {
            luckyMoneyF2FReceiveUI.startActivity(LuckyMoneyBeforeDetailUI.class, intent);
        }
        this.f226282d.setResult(-1, (Intent) null);
        this.f226282d.finish();
        LuckyMoneyF2FReceiveUI luckyMoneyF2FReceiveUI2 = this.f226282d;
        if (luckyMoneyF2FReceiveUI2.f198891x != null) {
            luckyMoneyF2FReceiveUI2.overridePendingTransition(C0966R.C0968anim.f2456di, C0966R.C0968anim.f2461dn);
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
