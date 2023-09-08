package xk1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import fy3.C32227p;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import te3.C50169kr1;

/* renamed from: xk1.d0 */
public final class C53357d0 extends C87413o implements C32227p<String, Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C66355w f150158d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53357d0(C66355w wVar) {
        super(2);
        this.f150158d = wVar;
    }

    public Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        C66355w wVar = this.f150158d;
        C50169kr1 kr12 = wVar.f191042x;
        if (kr12 != null) {
            kr12.f137018x = str;
        }
        if (kr12 != null) {
            kr12.f137017w = booleanValue;
        }
        String str2 = kr12 != null ? kr12.f137018x : null;
        if (!(str2 == null || str2.length() == 0)) {
            View findViewById = wVar.getActivity().findViewById(C0966R.C0970id.ent);
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLivePostUIC", "refreshSticker", "(Lcom/tencent/mm/protocal/protobuf/GameAppInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLivePostUIC", "refreshSticker", "(Lcom/tencent/mm/protocal/protobuf/GameAppInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            View findViewById2 = wVar.getActivity().findViewById(C0966R.C0970id.k1u);
            if (findViewById2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLivePostUIC", "refreshSticker", "(Lcom/tencent/mm/protocal/protobuf/GameAppInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById2, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLivePostUIC", "refreshSticker", "(Lcom/tencent/mm/protocal/protobuf/GameAppInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById3 = wVar.getActivity().findViewById(C0966R.C0970id.ent);
            if (findViewById3 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view2 = findViewById3;
                C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLivePostUIC", "refreshSticker", "(Lcom/tencent/mm/protocal/protobuf/GameAppInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLivePostUIC", "refreshSticker", "(Lcom/tencent/mm/protocal/protobuf/GameAppInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return C13598b0.f38549a;
    }
}
