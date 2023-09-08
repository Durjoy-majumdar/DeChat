package vo1;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: vo1.i */
public final class C14916i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C56032b f40943d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14916i(C56032b bVar) {
        super(0);
        this.f40943d = bVar;
    }

    public Object invoke() {
        FrameLayout frameLayout = (FrameLayout) this.f40943d.findViewById(C0966R.C0970id.n06);
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = C75044y4.m89991c(MMApplicationContext.getContext());
        }
        return C13598b0.f38549a;
    }
}
