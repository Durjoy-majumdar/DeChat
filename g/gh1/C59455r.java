package gh1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomController;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import java.util.HashSet;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: gh1.r */
public final class C59455r extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LiveRoomControllerStore f169887d;

    /* renamed from: e */
    public final /* synthetic */ float f169888e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59455r(LiveRoomControllerStore liveRoomControllerStore, float f) {
        super(0);
        this.f169887d = liveRoomControllerStore;
        this.f169888e = f;
    }

    public Object invoke() {
        C59461x xVar;
        List<C59453p> b;
        HashSet<LiveRoomController> controllers = this.f169887d.getControllers();
        float f = this.f169888e;
        for (LiveRoomController liveRoomController : controllers) {
            C8313a aVar = liveRoomController instanceof C8313a ? (C8313a) liveRoomController : null;
            if (!(aVar == null || (xVar = aVar.f27265i) == null || (b = xVar.mo9172b()) == null)) {
                for (C59453p pVar : b) {
                    View view = pVar.f169882a;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(Float.valueOf(f));
                    C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/base/VisibleEventExtension$dispatchValueAnimator$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/controller/base/VisibleEventExtension$dispatchValueAnimator$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
        }
        return C13598b0.f38549a;
    }
}
