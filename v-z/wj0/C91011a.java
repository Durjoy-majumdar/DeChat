package wj0;

import android.content.Context;
import com.tencent.magicbrush.C80301a;
import com.tencent.magicbrush.p941ui.MagicBrushView;
import gy3.C87412m;
import p284zb.C91635f;
import p958eb.C86470a;

/* renamed from: wj0.a */
public abstract class C91011a implements C80301a.C80305d {

    /* renamed from: a */
    public final C86470a<?> f261109a;

    public C91011a(C86470a<?> aVar) {
        C87412m.m108594g(aVar, "logicImpl");
        this.f261109a = aVar;
    }

    /* renamed from: M */
    public void mo111584M(MagicBrushView magicBrushView, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        C87412m.m108594g(magicBrushView, "view");
        C87412m.m108594g(fArr, "left");
        C87412m.m108594g(fArr2, "top");
        C87412m.m108594g(fArr3, "width");
        C87412m.m108594g(fArr4, "height");
    }

    /* renamed from: q */
    public MagicBrushView mo111588q() {
        C91635f fVar = (C91635f) this.f261109a.mo124764Z();
        Context context = fVar != null ? fVar.getContext() : null;
        C87412m.m108591d(context);
        MagicBrushView magicBrushView = new MagicBrushView(context, MagicBrushView.C80327h.TextureView);
        magicBrushView.setContentDescription("ScreenCanvasMagicBrushView");
        magicBrushView.setMagicBrush(this.f261109a.mo120910U());
        magicBrushView.setUseRawAxisTouchEvent(true);
        return magicBrushView;
    }
}
