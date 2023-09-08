package hr2;

import android.animation.Animator;
import com.tencent.p014mm.plugin.sns.p104ad.widget.twistad.C94792a;
import com.tencent.p014mm.plugin.sns.p104ad.widget.twistad.C94793b;
import com.tencent.p014mm.plugin.sns.p104ad.widget.twistad.GLTwistRoateCardsView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import sq2.C13774c;

/* renamed from: hr2.e */
public class C98511e extends C13774c {

    /* renamed from: d */
    public final /* synthetic */ GLTwistRoateCardsView f288911d;

    public C98511e(GLTwistRoateCardsView gLTwistRoateCardsView) {
        this.f288911d = gLTwistRoateCardsView;
    }

    public void onAnimationEnd(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$3");
        GLTwistRoateCardsView gLTwistRoateCardsView = this.f288911d;
        int i = GLTwistRoateCardsView.f274526L;
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        gLTwistRoateCardsView.getClass();
        SnsMethodCalculate.markStartTimeMs("onRoateEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        MMHandlerThread.postToMainThread(new C94792a(gLTwistRoateCardsView));
        gLTwistRoateCardsView.postDelayed(new C94793b(gLTwistRoateCardsView), 20);
        SnsMethodCalculate.markEndTimeMs("onRoateEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$3");
    }
}
