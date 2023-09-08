package com.tencent.p014mm.plugin.fav.p047ui;

import android.view.View;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.p136ui.tools.MMGestureGallery;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.fav.ui.n */
public class C93677n implements MMGestureGallery.C19821c {

    /* renamed from: a */
    public final /* synthetic */ C93687q f270460a;

    public C93677n(C93687q qVar) {
        this.f270460a = qVar;
    }

    /* renamed from: a */
    public void mo26353a(float f, float f2) {
        C93687q qVar = this.f270460a;
        MMGestureGallery mMGestureGallery = qVar.f270474b;
        if (mMGestureGallery != null && qVar.f270477e != null) {
            int height = mMGestureGallery.getHeight();
            float f3 = 1.0f;
            float height2 = height != 0 ? 1.0f - (f2 / ((float) this.f270460a.f270474b.getHeight())) : 1.0f;
            if (height2 <= 1.0f) {
                f3 = height2;
            }
            Log.m105919d("MicroMsg.FavDragLogic", "onGalleryScale tx: %f, ty: %f, scale: %f", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
            MultiTouchImageView g4 = this.f270460a.f270477e.mo127461g4();
            if (g4 != null) {
                g4.setPivotX((float) (this.f270460a.f270474b.getWidth() / 2));
                g4.setPivotY((float) (this.f270460a.f270474b.getHeight() / 2));
                g4.setScaleX(f3);
                g4.setScaleY(f3);
                g4.setTranslationX(f);
                g4.setTranslationY(f2);
                View view = this.f270460a.f270475c;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(f3));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavDragLogic$1", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/fav/ui/FavDragLogic$1", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                return;
            }
            Log.m105918d("MicroMsg.FavDragLogic", "runDragAnimation contentView is null !!");
        }
    }

    /* renamed from: b */
    public void mo26354b(float f, float f2) {
    }
}
