package hl1;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12317e4;
import qj1.C62660c;
import vk1.C65762c;

/* renamed from: hl1.v3 */
public final class C8590v3 extends C87413o implements C32224a<C62660c> {

    /* renamed from: d */
    public final /* synthetic */ C65762c f27681d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8590v3(C65762c cVar) {
        super(0);
        this.f27681d = cVar;
    }

    public Object invoke() {
        View findViewById = this.f27681d.findViewById(C0966R.C0970id.e1d);
        C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.leftMargin = relativeLayout.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3736cp);
        layoutParams.rightMargin = relativeLayout.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3736cp);
        FrameLayout frameLayout = new FrameLayout(relativeLayout.getContext());
        frameLayout.setId(C0966R.C0970id.gr9);
        relativeLayout.addView(frameLayout, layoutParams);
        frameLayout.setPadding(0, 0, 0, C12317e4.f35481u);
        return new C12317e4(frameLayout, this.f27681d);
    }
}
