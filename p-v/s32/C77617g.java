package s32;

import android.animation.Animator;
import com.tencent.p014mm.plugin.luckymoney.f2f.p072ui.LuckyMoneyF2FReceiveUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: s32.g */
public class C77617g implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyF2FReceiveUI f226281d;

    public C77617g(LuckyMoneyF2FReceiveUI luckyMoneyF2FReceiveUI) {
        this.f226281d = luckyMoneyF2FReceiveUI;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        Log.m105924i("LuckyMoneyF2FReceiveUI", "packet top in animator end");
        this.f226281d.f198890w.start();
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
