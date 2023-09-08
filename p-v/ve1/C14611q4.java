package ve1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;

/* renamed from: ve1.q4 */
public final class C14611q4 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ TextView f40446d;

    /* renamed from: e */
    public final /* synthetic */ View f40447e;

    /* renamed from: f */
    public final /* synthetic */ C14620r4 f40448f;

    /* renamed from: g */
    public final /* synthetic */ TextView f40449g;

    public C14611q4(TextView textView, View view, C14620r4 r4Var, TextView textView2) {
        this.f40446d = textView;
        this.f40447e = view;
        this.f40448f = r4Var;
        this.f40449g = textView2;
    }

    public boolean onPreDraw() {
        int i;
        this.f40446d.getViewTreeObserver().removeOnPreDrawListener(this);
        int[] iArr = new int[2];
        this.f40446d.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        this.f40449g.getLocationInWindow(iArr2);
        if (this.f40447e.getVisibility() == 0) {
            int width = this.f40447e.getWidth();
            ViewGroup.LayoutParams layoutParams = this.f40447e.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            int i2 = width + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            ViewGroup.LayoutParams layoutParams2 = this.f40447e.getLayoutParams();
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            i = i2 + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
        } else {
            i = 0;
        }
        this.f40446d.setMaxWidth(((iArr2[0] - iArr[0]) - i) - this.f40447e.getResources().getDimensionPixelOffset(C0966R.dimen.f3766df));
        String str = this.f40448f.f40460e;
        Log.m105924i(str, "adjustNickNameWidth maxWidth:" + this.f40446d.getMaxWidth() + ",nicknamePos:" + iArr[0] + '-' + iArr[1] + ", tipsPos:" + iArr2[0] + '-' + iArr2[1] + ",authIconWidth:" + i);
        if (this.f40446d.getMaxWidth() <= 0) {
            this.f40446d.setMaxWidth(MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3753d4));
        }
        return true;
    }
}
