package com.tencent.p014mm.plugin.finder.viewmodel.component;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC */
public final class FinderFeedMegaVideoBtnAnimUIC extends UIComponent {

    /* renamed from: d */
    public RecyclerView f162495d;

    /* renamed from: e */
    public View f162496e;

    /* renamed from: f */
    public int f162497f;

    /* renamed from: g */
    public boolean f162498g;

    /* renamed from: h */
    public final ValueAnimator f162499h;

    /* renamed from: i */
    public boolean f162500i = true;

    /* renamed from: j */
    public final FinderFeedMegaVideoBtnAnimUIC$videoFinishListener$1 f162501j = new FinderFeedMegaVideoBtnAnimUIC$videoFinishListener$1(this, C40008f.f107254d);

    /* renamed from: n */
    public final FinderFeedMegaVideoBtnAnimUIC$lifecycleObserver$1 f162502n = new FinderFeedMegaVideoBtnAnimUIC$lifecycleObserver$1(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFeedMegaVideoBtnAnimUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(300);
        ofFloat.setInterpolator(new LinearInterpolator());
        this.f162499h = ofFloat;
    }

    /* renamed from: c3 */
    public static final int m65389c3(FinderFeedMegaVideoBtnAnimUIC finderFeedMegaVideoBtnAnimUIC, float f, int i, int i2) {
        finderFeedMegaVideoBtnAnimUIC.getClass();
        int red = Color.red(i);
        int blue = Color.blue(i);
        int green = Color.green(i);
        int red2 = Color.red(i2);
        int blue2 = Color.blue(i2);
        return Color.rgb(red + ((int) (((float) (red2 - red)) * f)), green + ((int) (f * ((float) (Color.green(i2) - green)))), blue + ((int) (((float) (blue2 - blue)) * f)));
    }

    /* renamed from: d3 */
    public final void mo80031d3(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "rv");
        this.f162495d = recyclerView;
        if (!this.f162498g) {
            this.f162501j.alive();
        }
        this.f162498g = true;
        getActivity().getLifecycle().addObserver(this.f162502n);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFeedMegaVideoBtnAnimUIC(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(300);
        ofFloat.setInterpolator(new LinearInterpolator());
        this.f162499h = ofFloat;
    }
}
