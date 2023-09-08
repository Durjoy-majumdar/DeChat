package ul2;

import android.animation.Animator;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanCodeMaskView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ul2.j */
public final class C111207j implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ ScanCodeMaskView f333030d;

    public C111207j(ScanCodeMaskView scanCodeMaskView) {
        this.f333030d = scanCodeMaskView;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        ScanCodeMaskView scanCodeMaskView = this.f333030d;
        int i = ScanCodeMaskView.f315975Q0;
        scanCodeMaskView.f315993S.stopTimer();
        Log.m105919d("MicroMsg.ScanCodeMaskView", "alvinluo initScaleAnimation period: %d", 3350L);
        scanCodeMaskView.f315993S.startTimer(0, 3350);
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
