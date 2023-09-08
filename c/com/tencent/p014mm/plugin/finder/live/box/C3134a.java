package com.tencent.p014mm.plugin.finder.live.box;

import android.animation.ValueAnimator;
import android.view.View;
import com.tencent.p014mm.plugin.finder.live.box.DammakuLayout;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.finder.live.box.a */
public final class C3134a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ DammakuLayout.C3131b f15016d;

    public C3134a(DammakuLayout.C3131b bVar) {
        this.f15016d = bVar;
    }

    public final void run() {
        for (Map.Entry<View, ValueAnimator> value : this.f15016d.f15010d.entrySet()) {
            ((ValueAnimator) value.getValue()).cancel();
        }
    }
}
