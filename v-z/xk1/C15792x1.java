package xk1;

import android.text.Editable;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveDescEditView;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: xk1.x1 */
public final class C15792x1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C15794y1 f42554d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15792x1(C15794y1 y1Var) {
        super(0);
        this.f42554d = y1Var;
    }

    public Object invoke() {
        MMEditText mMEditText = this.f42554d.f42556d;
        if (mMEditText != null) {
            mMEditText.clearFocus();
        }
        View view = this.f42554d.f42557e;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostEditDescUIC$initOuterDescEt$showEdit$1", "invoke", "()Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostEditDescUIC$initOuterDescEt$showEdit$1", "invoke", "()Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C15794y1 y1Var = this.f42554d;
        FinderLiveDescEditView finderLiveDescEditView = y1Var.f42558f;
        Editable editable = null;
        if (finderLiveDescEditView == null) {
            return null;
        }
        MMEditText mMEditText2 = y1Var.f42556d;
        if (mMEditText2 != null) {
            editable = mMEditText2.getText();
        }
        String valueOf = String.valueOf(editable);
        C15786v1 v1Var = new C15786v1(this.f42554d);
        C15789w1 w1Var = new C15789w1(this.f42554d);
        int i = FinderLiveDescEditView.f15367j;
        finderLiveDescEditView.mo3403c(valueOf, false, v1Var, w1Var, false);
        return C13598b0.f38549a;
    }
}
