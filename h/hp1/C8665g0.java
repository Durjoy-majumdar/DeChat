package hp1;

import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import fe1.C58960c;
import fe1.C58969q;
import gy3.C87412m;
import te3.C48868bk1;

/* renamed from: hp1.g0 */
public final class C8665g0 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ C8661f0 f27852d;

    /* renamed from: e */
    public final /* synthetic */ C48868bk1 f27853e;

    public C8665g0(C8661f0 f0Var, C48868bk1 bk12) {
        this.f27852d = f0Var;
        this.f27853e = bk12;
    }

    public boolean onPreDraw() {
        this.f27852d.f27831E.getViewTreeObserver().removeOnPreDrawListener(this);
        ViewParent parent = this.f27852d.f27831E.getParent();
        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
        int width = ((View) parent).getWidth();
        int width2 = this.f27852d.f27840N.getVisibility() == 0 ? this.f27852d.f27840N.getWidth() + ((int) this.f27852d.f27840N.getResources().getDimension(C0966R.dimen.f3703bv)) + 0 : 0;
        if (this.f27852d.f27839M.getVisibility() == 0) {
            width2 += this.f27852d.f27839M.getWidth() + ((int) this.f27852d.f27839M.getResources().getDimension(C0966R.dimen.f3703bv));
        }
        TextPaint paint = this.f27852d.f27831E.getPaint();
        FinderContact finderContact = this.f27853e.f131162d;
        float measureText = paint.measureText(finderContact != null ? C58960c.m68834f(finderContact, (C58969q) null, false, 3, (Object) null).getNickname() : "");
        if (((float) width2) + measureText > ((float) width)) {
            TextView textView = this.f27852d.f27831E;
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = (width - width2) - 1;
            textView.setLayoutParams(layoutParams);
            String str = this.f27852d.f27828B;
            Log.m105924i(str, "adjustTitleTvSize titleW:" + this.f27852d.f27831E.getLayoutParams().width + ", containerW:" + width + ",iconW:" + width2);
        } else {
            TextView textView2 = this.f27852d.f27831E;
            ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
            layoutParams2.width = (int) measureText;
            textView2.setLayoutParams(layoutParams2);
            String str2 = this.f27852d.f27828B;
            Log.m105924i(str2, "adjustTitleTvSize titleW:" + this.f27852d.f27831E.getLayoutParams().width + ", titleMaxWidth:" + measureText);
        }
        return true;
    }
}
