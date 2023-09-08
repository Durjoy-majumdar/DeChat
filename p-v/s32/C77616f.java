package s32;

import android.animation.ValueAnimator;
import com.tencent.p014mm.plugin.luckymoney.f2f.p072ui.LuckyMoneyF2FReceiveUI;

/* renamed from: s32.f */
public class C77616f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyF2FReceiveUI f226280d;

    public C77616f(LuckyMoneyF2FReceiveUI luckyMoneyF2FReceiveUI) {
        this.f226280d = luckyMoneyF2FReceiveUI;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        LuckyMoneyF2FReceiveUI luckyMoneyF2FReceiveUI = this.f226280d;
        luckyMoneyF2FReceiveUI.f198877g.setTranslationY((-floatValue) * ((float) luckyMoneyF2FReceiveUI.f198888u.heightPixels));
    }
}
