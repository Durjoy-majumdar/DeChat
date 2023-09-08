package qj1;

import al1.C54130j;
import android.view.View;
import android.widget.TextView;
import cl1.C54963d0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import tf0.C64916p1;

/* renamed from: qj1.n2 */
public final class C62891n2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62799h2 f178485d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62891n2(C62799h2 h2Var) {
        super(0);
        this.f178485d = h2Var;
    }

    public Object invoke() {
        Class cls = C54963d0.class;
        int i = ((C54963d0) this.f178485d.mo87696x0(cls)).f154078u;
        if (i == 1) {
            View view = this.f178485d.f178265w;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkMicStatePlugin$updateLinkStateUI$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkMicStatePlugin$updateLinkStateUI$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f178485d.f178261s;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkMicStatePlugin$updateLinkStateUI$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkMicStatePlugin$updateLinkStateUI$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            WeImageView weImageView = this.f178485d.f178266x;
            weImageView.setImageDrawable(weImageView.getContext().getResources().getDrawable(C0966R.raw.icons_filled_call));
        } else if (i == 2) {
            View view5 = this.f178485d.f178265w;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkMicStatePlugin$updateLinkStateUI$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkMicStatePlugin$updateLinkStateUI$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view7 = this.f178485d.f178261s;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkMicStatePlugin$updateLinkStateUI$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkMicStatePlugin$updateLinkStateUI$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            WeImageView weImageView2 = this.f178485d.f178266x;
            weImageView2.setImageDrawable(weImageView2.getContext().getResources().getDrawable(C0966R.raw.icons_filled_video_call));
        } else if (i == 3) {
            View view9 = this.f178485d.f178265w;
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar5.mo10233c(8);
            View view10 = view9;
            C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkMicStatePlugin$updateLinkStateUI$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkMicStatePlugin$updateLinkStateUI$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view11 = this.f178485d.f178261s;
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(0);
            View view12 = view11;
            C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkMicStatePlugin$updateLinkStateUI$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view12, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkMicStatePlugin$updateLinkStateUI$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C62799h2 h2Var = this.f178485d;
            C54130j jVar = ((C54963d0) h2Var.mo87696x0(cls)).f154073p;
            if (jVar != null) {
                TextView textView = h2Var.f178262t;
                C7335d c = C86312j.m106911c(C64916p1.class);
                C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
                TextView textView2 = h2Var.f178262t;
                C87412m.m108593f(textView2, "linkedUserNameTv");
                textView.setText(C64916p1.C64917a.m76442i((C64916p1) c, textView2, C58739j4.m68253s(C58739j4.f168176a, jVar.f151999c, jVar.f152000d, false, 4, (Object) null), 0, 4, (Object) null));
                h2Var.f178264v.play();
                View view13 = h2Var.f178263u;
                C9556a aVar7 = new C9556a();
                aVar7.mo10233c(0);
                View view14 = view13;
                C117292a.m165358d(view14, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkMicStatePlugin", "fillLinkMicUserInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view13.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view14, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkMicStatePlugin", "fillLinkMicUserInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            String str = h2Var.f178259q;
            Log.m105924i(str, "curlinkedUser:" + jVar);
        }
        return C13598b0.f38549a;
    }
}
