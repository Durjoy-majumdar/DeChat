package xk1;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: xk1.v1 */
public final class C15786v1 extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C15794y1 f42547d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15786v1(C15794y1 y1Var) {
        super(1);
        this.f42547d = y1Var;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, "desc");
        MMEditText mMEditText = this.f42547d.f42556d;
        if (mMEditText != null) {
            mMEditText.setText(str);
        }
        this.f42547d.getActivity().getIntent().putExtra("DESC", str);
        View view = this.f42547d.f42557e;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostEditDescUIC$initOuterDescEt$showEdit$1$1", "invoke", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostEditDescUIC$initOuterDescEt$showEdit$1$1", "invoke", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return C13598b0.f38549a;
    }
}
