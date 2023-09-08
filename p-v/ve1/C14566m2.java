package ve1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import bl3.C39818r;
import cm1.C0755n0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rs1.C13392r4;
import rx3.C13598b0;
import te3.C48878bm1;

/* renamed from: ve1.m2 */
public final class C14566m2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C14576n2 f40359d;

    /* renamed from: e */
    public final /* synthetic */ FinderHomeTabRedDotTipsBubbleView f40360e;

    /* renamed from: f */
    public final /* synthetic */ C0755n0 f40361f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14566m2(C14576n2 n2Var, FinderHomeTabRedDotTipsBubbleView finderHomeTabRedDotTipsBubbleView, C0755n0 n0Var) {
        super(0);
        this.f40359d = n2Var;
        this.f40360e = finderHomeTabRedDotTipsBubbleView;
        this.f40361f = n0Var;
    }

    public Object invoke() {
        C14576n2 n2Var = this.f40359d;
        FinderHomeTabRedDotTipsBubbleView finderHomeTabRedDotTipsBubbleView = this.f40360e;
        C48878bm1 bm12 = this.f40361f.f1779g.f1761c;
        n2Var.getClass();
        boolean z = true;
        boolean z2 = bm12 != null && bm12.f131199d == 2;
        int width = finderHomeTabRedDotTipsBubbleView.getWidth();
        Context context = finderHomeTabRedDotTipsBubbleView.getContext();
        C39818r rVar = C39818r.f106831a;
        Context context2 = finderHomeTabRedDotTipsBubbleView.getContext();
        C87412m.m108593f(context2, "tipsLayout.context");
        C13392r4.C13393a i3 = ((C13392r4) rVar.mo62443b(context2).mo75002a(C13392r4.class)).mo12803i3(3);
        TextView textView = i3 != null ? i3.f37959c : null;
        int[] iArr = new int[2];
        if (textView != null) {
            textView.getLocationInWindow(iArr);
        }
        int dimension = (int) context.getResources().getDimension(C0966R.dimen.f3736cp);
        int i = iArr[0];
        int dimension2 = i > 0 ? i + dimension : (int) context.getResources().getDimension(C0966R.dimen.f3718c_);
        int i2 = width / 2;
        int i4 = dimension2 - i2;
        int i5 = (!z2 || i2 <= dimension2) ? 0 : dimension2 - (dimension * 2);
        StringBuilder sb = new StringBuilder();
        sb.append("[adjustTipsBubbleLayout] width=");
        sb.append(width);
        sb.append(" isFollowBubble=");
        sb.append(z2);
        sb.append(" startPadding=");
        sb.append(i4);
        sb.append(" arrowPaddingStart=");
        sb.append(i5);
        sb.append(" values=");
        sb.append(iArr[0]);
        sb.append(" followTitleView is null?=");
        if (textView != null) {
            z = false;
        }
        sb.append(z);
        Log.m105924i("Finder.FeedFullMergedHeaderConvert", sb.toString());
        View findViewById = finderHomeTabRedDotTipsBubbleView.findViewById(C0966R.C0970id.l2s);
        if (findViewById != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (i5 > 0) {
                layoutParams2.gravity = 51;
                layoutParams2.leftMargin = i5;
            } else {
                layoutParams2.leftMargin = 0;
                layoutParams2.gravity = 49;
            }
            findViewById.requestLayout();
        }
        int f = C75044y4.m89994f(context);
        finderHomeTabRedDotTipsBubbleView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        ViewGroup.LayoutParams layoutParams3 = finderHomeTabRedDotTipsBubbleView.getLayoutParams();
        C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        layoutParams4.topMargin = ((int) context.getResources().getDimension(C0966R.dimen.f3679b9)) + ((int) context.getResources().getDimension(C0966R.dimen.f3701bu)) + f;
        if (!z2) {
            layoutParams4.gravity = 49;
            layoutParams4.setMarginStart(0);
        } else {
            layoutParams4.gravity = 8388659;
            layoutParams4.leftMargin = Math.max(i4, dimension);
        }
        finderHomeTabRedDotTipsBubbleView.requestLayout();
        this.f40360e.mo4565c(this.f40361f.f1779g.f1761c);
        C14576n2 n2Var2 = this.f40359d;
        Runnable runnable = n2Var2.f40385n;
        if (runnable != null) {
            n2Var2.f40386o.removeCallbacks(runnable);
        }
        C14576n2 n2Var3 = this.f40359d;
        C0755n0 n0Var = this.f40361f;
        n2Var3.f40385n = new C14560l2(n0Var, n2Var3);
        C48878bm1 bm13 = n0Var.f1779g.f1761c;
        long j = (bm13 != null ? (long) bm13.f131201f : 0) * 1000;
        if (j <= 0) {
            j = FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION;
        }
        Log.m105924i("Finder.FeedFullMergedHeaderConvert", "[handleTabTipsBubble] delayMs=" + j);
        C14576n2 n2Var4 = this.f40359d;
        n2Var4.f40386o.postDelayed(n2Var4.f40385n, j);
        return C13598b0.f38549a;
    }
}
