package ao1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.post.PostMainUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: ao1.t0 */
public final class C54278t0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ PostMainUIC f152356d;

    /* renamed from: e */
    public final /* synthetic */ View f152357e;

    public C54278t0(PostMainUIC postMainUIC, View view) {
        this.f152356d = postMainUIC;
        this.f152357e = view;
    }

    public final void run() {
        String str = this.f152356d.f160270d;
        StringBuilder sb = new StringBuilder();
        sb.append("after add view  widgetView:");
        sb.append(this.f152357e.getWidth());
        sb.append(" height:");
        sb.append(this.f152357e.getHeight());
        sb.append("  mediaViewContainer:");
        ViewGroup viewGroup = this.f152356d.f160276j;
        if (viewGroup != null) {
            sb.append(viewGroup.getWidth());
            sb.append(" height:");
            ViewGroup viewGroup2 = this.f152356d.f160276j;
            if (viewGroup2 != null) {
                sb.append(viewGroup2.getHeight());
                Log.m105924i(str, sb.toString());
                ViewGroup viewGroup3 = this.f152356d.f160276j;
                if (viewGroup3 != null) {
                    ViewGroup.LayoutParams layoutParams = viewGroup3.getLayoutParams();
                    FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
                    if (layoutParams2 != null) {
                        PostMainUIC postMainUIC = this.f152356d;
                        ViewGroup viewGroup4 = postMainUIC.f160276j;
                        if (viewGroup4 != null) {
                            float dimension = viewGroup4.getResources().getDimension(C0966R.dimen.f3750d1);
                            String str2 = postMainUIC.f160270d;
                            Log.m105924i(str2, "topMargin:" + dimension + " originMargin:" + layoutParams2.topMargin);
                            if (Math.abs(((float) layoutParams2.topMargin) - dimension) > 5.0f) {
                                layoutParams2.topMargin = (int) dimension;
                                ViewGroup viewGroup5 = postMainUIC.f160276j;
                                if (viewGroup5 != null) {
                                    viewGroup5.setLayoutParams(layoutParams2);
                                } else {
                                    C87412m.m108603p("mediaViewContainer");
                                    throw null;
                                }
                            }
                        } else {
                            C87412m.m108603p("mediaViewContainer");
                            throw null;
                        }
                    }
                } else {
                    C87412m.m108603p("mediaViewContainer");
                    throw null;
                }
            } else {
                C87412m.m108603p("mediaViewContainer");
                throw null;
            }
        } else {
            C87412m.m108603p("mediaViewContainer");
            throw null;
        }
    }
}
