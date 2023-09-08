package x50;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: x50.a */
public final class C15625a extends RelativeLayout {

    /* renamed from: d */
    public C32226l<? super Integer, C13598b0> f42253d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15625a(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        C32226l<? super Integer, C13598b0> lVar = this.f42253d;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(i));
        }
        Log.m105924i("FluentSwitchRelativeLayout", "onWindowVisibilityChanged visibility: " + i + " function: " + this.f42253d);
    }

    public final void setNotifyVisibilityFunction(C32226l<? super Integer, C13598b0> lVar) {
        C87412m.m108594g(lVar, "function");
        this.f42253d = lVar;
    }
}
