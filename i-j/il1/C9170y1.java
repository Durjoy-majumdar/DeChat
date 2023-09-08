package il1;

import android.view.inputmethod.InputMethodManager;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveDescEditView;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: il1.y1 */
public final class C9170y1 extends C87413o implements C32224a<Boolean> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveDescEditView f28866d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9170y1(FinderLiveDescEditView finderLiveDescEditView) {
        super(0);
        this.f28866d = finderLiveDescEditView;
    }

    public Object invoke() {
        Object systemService = this.f28866d.getContext().getSystemService("input_method");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(this.f28866d.f15373i.f32950b, 1);
        return Boolean.valueOf(this.f28866d.f15373i.f32950b.requestFocus());
    }
}
