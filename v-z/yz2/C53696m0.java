package yz2;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusCardFeedsActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj3.C20713c;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;

/* renamed from: yz2.m0 */
public final class C53696m0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TextStatusCardFeedsActivity f150790d;

    public C53696m0(TextStatusCardFeedsActivity textStatusCardFeedsActivity) {
        this.f150790d = textStatusCardFeedsActivity;
    }

    public final void run() {
        TextStatusCardFeedsActivity textStatusCardFeedsActivity = this.f150790d;
        if (!textStatusCardFeedsActivity.f116899d) {
            textStatusCardFeedsActivity.f116899d = true;
            int intExtra = textStatusCardFeedsActivity.getIntent().getIntExtra("KEY_START_CARD_ANIM_X_OFFSET", -1);
            int intExtra2 = textStatusCardFeedsActivity.getIntent().getIntExtra("KEY_START_CARD_ANIM_Y_OFFSET", -1);
            if (intExtra == -1 || intExtra2 == -1) {
                textStatusCardFeedsActivity.getContentView().postDelayed(new C53678h0(textStatusCardFeedsActivity), 300);
                return;
            }
            View contentView = textStatusCardFeedsActivity.getContentView();
            if (contentView != null) {
                contentView.setClipToOutline(true);
            }
            contentView.setTranslationX((float) intExtra);
            contentView.setTranslationY((float) intExtra2);
            int h = C76577a.m92157h(textStatusCardFeedsActivity, C0966R.dimen.f3753d4);
            int h2 = C76577a.m92157h(textStatusCardFeedsActivity, C0966R.dimen.f3753d4);
            contentView.setPivotX(0.0f);
            contentView.setPivotY(0.0f);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(0.0f));
            C117292a.m165358d(contentView, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "handleEnterAnimInner", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            contentView.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(contentView, "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "handleEnterAnimInner", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            Log.m105918d("MicroMsg.TextStatus.TextStatusCardFeedsActivity", "handleEnterAnim2() called anim start");
            ViewPropertyAnimator alpha = contentView.animate().translationX(0.0f).translationY(0.0f).alpha(1.0f);
            alpha.setInterpolator(C20713c.f58572a.mo32435a());
            alpha.setDuration(200);
            alpha.start();
            alpha.setUpdateListener(new C53681i0(contentView, h2, h2, h));
            alpha.setListener(new C53685j0(textStatusCardFeedsActivity));
        }
    }
}
