package fg2;

import android.app.Activity;
import android.view.View;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: fg2.b0 */
public final class C8029b0 extends C87413o implements C32224a<View> {

    /* renamed from: d */
    public final /* synthetic */ Activity f26727d;

    /* renamed from: e */
    public final /* synthetic */ int f26728e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8029b0(Activity activity, int i) {
        super(0);
        this.f26727d = activity;
        this.f26728e = i;
    }

    public Object invoke() {
        View findViewById = this.f26727d.findViewById(this.f26728e);
        C87412m.m108592e(findViewById, "null cannot be cast to non-null type T of com.tencent.mm.plugin.radar.ui.ViewBindKt.bind");
        return findViewById;
    }
}
