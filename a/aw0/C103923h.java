package aw0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.view.CircleAnimateView;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import hi3.C87515a;
import java.util.ArrayList;
import java.util.List;
import sx3.C110818d0;

/* renamed from: aw0.h */
public final class C103923h {

    /* renamed from: a */
    public final Context f307284a;

    /* renamed from: b */
    public ViewGroup f307285b;

    /* renamed from: c */
    public final ArrayList<CircleAnimateView> f307286c = new ArrayList<>();

    /* renamed from: d */
    public List<? extends BallInfo> f307287d;

    public C103923h(Context context) {
        C87412m.m108594g(context, "context");
        this.f307284a = context;
    }

    /* renamed from: a */
    public final void mo145546a(int i, boolean z) {
        CircleAnimateView circleAnimateView = (CircleAnimateView) C110818d0.m150917O(this.f307286c, i);
        if (circleAnimateView != null) {
            circleAnimateView.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: b */
    public final void mo145547b(int i) {
        CircleAnimateView circleAnimateView = (CircleAnimateView) C110818d0.m150917O(this.f307286c, i);
        List<? extends BallInfo> list = this.f307287d;
        if (list != null && C103925l.m138627a(list)) {
            List<? extends BallInfo> list2 = this.f307287d;
            C87412m.m108591d(list2);
            if (list2.size() > i) {
                List<? extends BallInfo> list3 = this.f307287d;
                BallInfo ballInfo = list3 != null ? (BallInfo) C110818d0.m150917O(list3, i) : null;
                if (ballInfo != null) {
                    int l = C103925l.m138638l(ballInfo);
                    if (-1 != l) {
                        C87515a aVar = new C87515a();
                        if (!ImgUtil.isGif(MMApplicationContext.getContext(), l) && aVar.mo121968f(this.f307284a.getResources(), l)) {
                            Drawable drawable = this.f307284a.getResources().getDrawable(l);
                            C87412m.m108593f(drawable, "context.resources.getDrawable(stateResId)");
                            if (circleAnimateView != null) {
                                circleAnimateView.setImageDrawable(drawable);
                            }
                        } else if (circleAnimateView != null) {
                            circleAnimateView.setImageResource(l);
                        }
                    }
                    long j = ballInfo.f311702w;
                    if (j >= 0) {
                        if (circleAnimateView != null) {
                            circleAnimateView.setProgress(j);
                        }
                    } else if (circleAnimateView != null) {
                        circleAnimateView.setProgress(-2147483648L);
                    }
                }
            }
        }
    }
}
