package yz2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusCardFeedsActivity;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: yz2.j0 */
public final class C53685j0 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ TextStatusCardFeedsActivity f150770d;

    public C53685j0(TextStatusCardFeedsActivity textStatusCardFeedsActivity) {
        this.f150770d = textStatusCardFeedsActivity;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        Log.m105918d("MicroMsg.TextStatus.TextStatusCardFeedsActivity", "handleEnterAnim2() called anim end");
        this.f150770d.mo67430K7();
    }
}
