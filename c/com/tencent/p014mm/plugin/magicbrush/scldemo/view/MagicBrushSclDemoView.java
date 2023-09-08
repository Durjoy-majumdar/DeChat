package com.tencent.p014mm.plugin.magicbrush.scldemo.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.tencent.p014mm.magicbrush.plugin.scl.view.MagicSclViewContainer;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R6\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/mm/plugin/magicbrush/scldemo/view/MagicBrushSclDemoView;", "Lcom/tencent/mm/magicbrush/plugin/scl/view/MagicSclViewContainer;", "Landroid/view/ViewGroup$LayoutParams;", "params", "Lrx3/b0;", "setLayoutParams", "Lkotlin/Function2;", "", "n", "Lfy3/p;", "getOnSizeChangeListener", "()Lfy3/p;", "setOnSizeChangeListener", "(Lfy3/p;)V", "onSizeChangeListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mb-samples_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView */
public final class MagicBrushSclDemoView extends MagicSclViewContainer {

    /* renamed from: n */
    public C32227p<? super Integer, ? super Integer, C13598b0> f162919n;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MagicBrushSclDemoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C8480h) null);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MagicBrushSclDemoView(Context context, AttributeSet attributeSet, int i, int i2, C8480h hVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final C32227p<Integer, Integer, C13598b0> getOnSizeChangeListener() {
        return this.f162919n;
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C32227p<? super Integer, ? super Integer, C13598b0> pVar;
        super.setLayoutParams(layoutParams);
        if (layoutParams != null && layoutParams.height > 0 && (pVar = this.f162919n) != null) {
            pVar.invoke(Integer.valueOf(layoutParams.width), Integer.valueOf(layoutParams.height));
        }
    }

    public final void setOnSizeChangeListener(C32227p<? super Integer, ? super Integer, C13598b0> pVar) {
        this.f162919n = pVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MagicBrushSclDemoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        setBackgroundColor(-7829368);
    }
}
