package vf1;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderRingtoneTimelineUI;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import rx3.C13598b0;

/* renamed from: vf1.p4 */
public final class C14811p4 extends C87413o implements C32226l<C60905o, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderRingtoneTimelineUI f40799d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14811p4(FinderRingtoneTimelineUI finderRingtoneTimelineUI) {
        super(1);
        this.f40799d = finderRingtoneTimelineUI;
    }

    public Object invoke(Object obj) {
        ViewPropertyAnimator translationYBy;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator translationYBy2;
        ViewPropertyAnimator duration2;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator translationYBy3;
        ViewPropertyAnimator duration3;
        ViewPropertyAnimator animate3;
        ViewPropertyAnimator translationYBy4;
        ViewPropertyAnimator duration4;
        C60905o oVar = (C60905o) obj;
        C87412m.m108594g(oVar, LocaleUtil.ITALIAN);
        FinderRingtoneTimelineUI finderRingtoneTimelineUI = this.f40799d;
        if (!finderRingtoneTimelineUI.f14785w) {
            View W7 = finderRingtoneTimelineUI.mo3098W7();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(W7, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "popupTips", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            W7.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(W7, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "popupTips", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            float b = (float) C76577a.m92151b(finderRingtoneTimelineUI.getContext(), 48);
            View findViewById = oVar.f44854d.findViewById(C0966R.C0970id.d97);
            View findViewById2 = oVar.f44854d.findViewById(C0966R.C0970id.e6u);
            View findViewById3 = oVar.f44854d.findViewById(C0966R.C0970id.crv);
            if (!(findViewById == null || (animate3 = findViewById.animate()) == null || (translationYBy4 = animate3.translationYBy(-b)) == null || (duration4 = translationYBy4.setDuration(0)) == null)) {
                duration4.start();
            }
            if (!(findViewById2 == null || (animate2 = findViewById2.animate()) == null || (translationYBy3 = animate2.translationYBy(-b)) == null || (duration3 = translationYBy3.setDuration(0)) == null)) {
                duration3.start();
            }
            if (!(findViewById3 == null || (animate = findViewById3.animate()) == null || (translationYBy2 = animate.translationYBy(-b)) == null || (duration2 = translationYBy2.setDuration(0)) == null)) {
                duration2.start();
            }
            TextView textView = finderRingtoneTimelineUI.f14784v;
            if (textView != null) {
                ViewPropertyAnimator animate4 = textView.animate();
                if (!(animate4 == null || (translationYBy = animate4.translationYBy(-b)) == null || (duration = translationYBy.setDuration(0)) == null)) {
                    duration.start();
                }
            } else {
                C87412m.m108603p("selectTv");
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}
