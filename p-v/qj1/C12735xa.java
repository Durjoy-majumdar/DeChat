package qj1;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: qj1.xa */
public final class C12735xa extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12389fa f36478d;

    /* renamed from: e */
    public final /* synthetic */ int f36479e;

    /* renamed from: f */
    public final /* synthetic */ int f36480f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12735xa(C12389fa faVar, int i, int i2) {
        super(0);
        this.f36478d = faVar;
        this.f36479e = i;
        this.f36480f = i2;
    }

    public Object invoke() {
        if (this.f36478d.mo14483f0() == 0) {
            if (this.f36479e == 0 && this.f36480f == 0) {
                this.f36478d.mo12070b1(false);
            } else {
                C12389fa faVar = this.f36478d;
                faVar.f35668E.setVisibility(0);
                faVar.f35674K.setVisibility(8);
                View view = faVar.f35683T;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "onGetLiveOnlineMemberFail", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "onGetLiveOnlineMemberFail", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                faVar.f35672I.setVisibility(8);
                View view2 = faVar.f35671H;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "onGetLiveOnlineMemberFail", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "onGetLiveOnlineMemberFail", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                Log.m105924i(faVar.f35692q, "onGetLiveOnlineByRoomFail");
            }
        }
        return C13598b0.f38549a;
    }
}
