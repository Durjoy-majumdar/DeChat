package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.ViewGroup;
import android.widget.ImageView;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.ui.b */
public final class C3772b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderActivityDescUI f17245d;

    public C3772b(FinderActivityDescUI finderActivityDescUI) {
        this.f17245d = finderActivityDescUI;
    }

    public final void run() {
        ImageView imageView = this.f17245d.f16740N;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            ImageView imageView2 = this.f17245d.f16740N;
            if (imageView2 != null) {
                layoutParams.height = (int) (((float) imageView2.getWidth()) * 1.3333334f);
                ImageView imageView3 = this.f17245d.f16740N;
                if (imageView3 != null) {
                    imageView3.setLayoutParams(layoutParams);
                } else {
                    C87412m.m108603p("coverImageView");
                    throw null;
                }
            } else {
                C87412m.m108603p("coverImageView");
                throw null;
            }
        } else {
            C87412m.m108603p("coverImageView");
            throw null;
        }
    }
}
