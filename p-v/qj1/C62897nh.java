package qj1;

import al1.C54130j;
import android.view.View;
import android.widget.TextView;
import cl1.C54963d0;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import ok1.C62042e;
import rx3.C13598b0;
import tf0.C64916p1;

/* renamed from: qj1.nh */
public final class C62897nh extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62795gh f178494d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62897nh(C62795gh ghVar) {
        super(0);
        this.f178494d = ghVar;
    }

    public Object invoke() {
        Class cls = C54963d0.class;
        int i = ((C54963d0) this.f178494d.mo87696x0(cls)).f154078u;
        if (i == 0) {
            View view = this.f178494d.f178246s;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorLinkMicStatePlugin$updateByState$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorLinkMicStatePlugin$updateByState$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f178494d.f178247t;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorLinkMicStatePlugin$updateByState$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorLinkMicStatePlugin$updateByState$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C62795gh ghVar = this.f178494d;
            ghVar.f178248u.setImageResource(C0966R.raw.icons_filled_done);
            ghVar.f178249v.setText(ghVar.f166287d.getContext().getResources().getString(C0966R.string.f360601ds3));
        } else if (i == 1 || i == 2) {
            View view5 = this.f178494d.f178246s;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorLinkMicStatePlugin$updateByState$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorLinkMicStatePlugin$updateByState$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view7 = this.f178494d.f178247t;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorLinkMicStatePlugin$updateByState$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorLinkMicStatePlugin$updateByState$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int i2 = ((C54963d0) this.f178494d.mo87696x0(cls)).f154078u == 2 ? C0966R.raw.icons_filled_video_call : C0966R.raw.icons_filled_call;
            C62795gh ghVar2 = this.f178494d;
            ghVar2.f178248u.setImageResource(i2);
            ghVar2.f178249v.setText(ghVar2.f166287d.getContext().getResources().getString(C0966R.string.ds4));
        } else if (i == 3) {
            View view9 = this.f178494d.f178246s;
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar5.mo10233c(8);
            C117292a.m165358d(view9, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorLinkMicStatePlugin$updateByState$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view9, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorLinkMicStatePlugin$updateByState$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view10 = this.f178494d.f178247t;
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(0);
            C117292a.m165358d(view10, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorLinkMicStatePlugin$updateByState$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorLinkMicStatePlugin$updateByState$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C62795gh ghVar3 = this.f178494d;
            C54130j jVar = ((C54963d0) ghVar3.mo87696x0(cls)).f154073p;
            if (jVar != null) {
                TextView textView = ghVar3.f178250w;
                C7335d c = C86312j.m106911c(C64916p1.class);
                C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
                TextView textView2 = ghVar3.f178250w;
                C87412m.m108593f(textView2, "linkUserNameTv");
                textView.setText(C64916p1.C64917a.m76442i((C64916p1) c, textView2, C62042e.m72808l0(C62042e.f176370a, jVar.f151999c, jVar.f152000d, false, 4, (Object) null), 0, 4, (Object) null));
                ghVar3.f178252y.play();
                if (Util.isEqual(((C54991o) ghVar3.mo87696x0(C54991o.class)).mo76015n4(), jVar.f151997a)) {
                    ghVar3.f178253z.setVisibility(8);
                    View view11 = ghVar3.f178251x;
                    C9556a aVar7 = new C9556a();
                    aVar7.mo10233c(0);
                    View view12 = view11;
                    C117292a.m165358d(view12, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorLinkMicStatePlugin", "drawLinkedState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view11.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                    C117292a.m165359e(view12, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorLinkMicStatePlugin", "drawLinkedState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    ghVar3.f178253z.setVisibility(0);
                    View view13 = ghVar3.f178251x;
                    C9556a aVar8 = new C9556a();
                    aVar8.mo10233c(8);
                    View view14 = view13;
                    C117292a.m165358d(view14, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorLinkMicStatePlugin", "drawLinkedState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view13.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                    C117292a.m165359e(view14, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorLinkMicStatePlugin", "drawLinkedState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            String str = ghVar3.f178244q;
            Log.m105924i(str, "curlinkedUser:" + jVar);
        }
        return C13598b0.f38549a;
    }
}
