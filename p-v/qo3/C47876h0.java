package qo3;

import android.view.ViewTreeObserver;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;

/* renamed from: qo3.h0 */
public class C47876h0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ C89779i0 f128477d;

    public C47876h0(C89779i0 i0Var) {
        this.f128477d = i0Var;
    }

    public void onGlobalLayout() {
        if (this.f128477d.f258146d.getLineCount() > 1) {
            C89779i0 i0Var = this.f128477d;
            i0Var.f258146d.setTextSize(0, (float) C74942w4.m89786c(i0Var.getContext(), C0966R.dimen.f3684bd));
        }
        this.f128477d.f258146d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
