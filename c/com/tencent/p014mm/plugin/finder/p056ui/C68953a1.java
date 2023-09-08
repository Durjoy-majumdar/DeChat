package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.View;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.p136ui.tools.MMGestureGallery;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.finder.ui.a1 */
public final class C68953a1 implements MMGestureGallery.C19821c {

    /* renamed from: a */
    public final /* synthetic */ FinderImagePreviewUI f198147a;

    public C68953a1(FinderImagePreviewUI finderImagePreviewUI) {
        this.f198147a = finderImagePreviewUI;
    }

    /* renamed from: a */
    public void mo26353a(float f, float f2) {
        float f3 = f2;
        float f4 = (float) 1;
        MMGestureGallery mMGestureGallery = this.f198147a.f270639q;
        if (mMGestureGallery != null) {
            float height = f4 - (f3 / ((float) mMGestureGallery.getHeight()));
            if (height > 1.0f) {
                height = 1.0f;
            }
            Log.m105919d(this.f198147a.f270637o, "onGalleryScale tx: %f, ty: %f, scale: %f", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(height));
            MMGestureGallery mMGestureGallery2 = this.f198147a.f270639q;
            if (mMGestureGallery2 != null) {
                View selectedView = mMGestureGallery2.getSelectedView();
                C87412m.m108592e(selectedView, "null cannot be cast to non-null type com.tencent.mm.ui.base.MultiTouchImageView");
                MultiTouchImageView multiTouchImageView = (MultiTouchImageView) selectedView;
                MMGestureGallery mMGestureGallery3 = this.f198147a.f270639q;
                if (mMGestureGallery3 != null) {
                    multiTouchImageView.setPivotX((float) (mMGestureGallery3.getWidth() / 2));
                    MMGestureGallery mMGestureGallery4 = this.f198147a.f270639q;
                    if (mMGestureGallery4 != null) {
                        multiTouchImageView.setPivotY((float) (mMGestureGallery4.getHeight() / 2));
                        multiTouchImageView.setScaleX(height);
                        multiTouchImageView.setScaleY(height);
                        multiTouchImageView.setTranslationX(f);
                        multiTouchImageView.setTranslationY(f3);
                        View view = this.f198147a.f270638p;
                        if (view != null) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(Float.valueOf(height));
                            View view2 = view;
                            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderImagePreviewUI$initDragGallery$1", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/ui/FinderImagePreviewUI$initDragGallery$1", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            return;
                        }
                        C87412m.m108603p("root");
                        throw null;
                    }
                    C87412m.m108603p("gallery");
                    throw null;
                }
                C87412m.m108603p("gallery");
                throw null;
            }
            C87412m.m108603p("gallery");
            throw null;
        }
        C87412m.m108603p("gallery");
        throw null;
    }

    /* renamed from: b */
    public void mo26354b(float f, float f2) {
    }
}
