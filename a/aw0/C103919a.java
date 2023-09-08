package aw0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.view.FloatBallBlurView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import kg3.C76577a;

/* renamed from: aw0.a */
public final class C103919a {

    /* renamed from: a */
    public static final int f307277a = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.axc);

    /* renamed from: b */
    public static final int f307278b = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.axb);

    /* renamed from: a */
    public static final void m138617a(BallInfo.C55569c cVar, FloatBallBlurView floatBallBlurView) {
        C87412m.m108594g(cVar, "blurInfo");
        C87412m.m108594g(floatBallBlurView, "blurView");
        String str = cVar.f158210a;
        if (!(str == null || str.length() == 0)) {
            floatBallBlurView.setImageUrl(cVar.f158210a);
        } else {
            floatBallBlurView.setBitmap(cVar.f158211b);
        }
    }
}
