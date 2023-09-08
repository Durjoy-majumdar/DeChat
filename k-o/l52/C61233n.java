package l52;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import o52.C61945f;
import p175j0.C60690y0;

/* renamed from: l52.n */
public final class C61233n extends C87413o implements C32226l<Context, MagicBrushSclDemoView> {

    /* renamed from: d */
    public final /* synthetic */ C61945f f174290d;

    /* renamed from: e */
    public final /* synthetic */ C60690y0<Integer> f174291e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61233n(C61945f fVar, C60690y0<Integer> y0Var) {
        super(1);
        this.f174290d = fVar;
        this.f174291e = y0Var;
    }

    public Object invoke(Object obj) {
        Context context = (Context) obj;
        C87412m.m108594g(context, LocaleUtil.ITALIAN);
        MagicBrushSclDemoView magicBrushSclDemoView = new MagicBrushSclDemoView(context, (AttributeSet) null, 0, 6, (C8480h) null);
        C61945f fVar = this.f174290d;
        C60690y0<Integer> y0Var = this.f174291e;
        String str = fVar.f176077a;
        C87412m.m108594g(str, "name");
        magicBrushSclDemoView.f157377h = str;
        magicBrushSclDemoView.setUnbindFrameSetOnDetach(false);
        magicBrushSclDemoView.setOnSizeChangeListener(new C61232m(y0Var));
        return magicBrushSclDemoView;
    }
}
