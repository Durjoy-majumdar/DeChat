package com.tencent.p014mm.plugin.radar.p091ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/radar/ui/RadarWaveView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-radar_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.radar.ui.RadarWaveView */
public final class RadarWaveView extends RelativeLayout {

    /* renamed from: d */
    public View f203386d;

    /* renamed from: e */
    public Animation f203387e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadarWaveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }

    /* renamed from: a */
    public final void mo96975a() {
        Log.m105918d("MicroMsg.RadarWaveView", "start wave animation");
        setVisibility(0);
        View view = this.f203386d;
        C87412m.m108591d(view);
        view.startAnimation(this.f203387e);
    }

    /* renamed from: b */
    public final void mo96976b() {
        Log.m105919d("MicroMsg.RadarWaveView", "stop wave animation. forces, %d, %d", Integer.valueOf(getMeasuredHeight()), Integer.valueOf(getMeasuredWidth()));
        setVisibility(4);
        View view = this.f203386d;
        C87412m.m108591d(view);
        view.clearAnimation();
    }
}
