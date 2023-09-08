package com.tencent.p014mm.plugin.finder.live.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveMusicScrollViewBehavior;", "Lcom/google/android/material/appbar/AppBarLayout$Behavior;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveMusicScrollViewBehavior */
public final class FinderLiveMusicScrollViewBehavior extends AppBarLayout.Behavior {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveMusicScrollViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: J */
    public void mo94855J(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
        C87412m.m108594g(coordinatorLayout, "coordinatorLayout");
        C87412m.m108594g(appBarLayout, "child");
        C87412m.m108594g(view, "target");
        if (i4 >= 0) {
            super.mo78308m(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5);
        }
    }
}
