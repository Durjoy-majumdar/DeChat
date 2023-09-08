package com.tencent.p014mm.plugin.scanner.p101ui;

import android.view.View;
import com.tencent.p014mm.p136ui.tools.MMGestureGallery;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.scanner.ui.t */
public class C71021t implements MMGestureGallery.C19821c {

    /* renamed from: a */
    public final /* synthetic */ TranslationResultUI f205535a;

    public C71021t(TranslationResultUI translationResultUI) {
        this.f205535a = translationResultUI;
    }

    /* renamed from: a */
    public void mo26353a(float f, float f2) {
        float f3 = f;
        float f4 = f2;
        float f5 = 1.0f;
        float height = 1.0f - (f4 / ((float) this.f205535a.f273290o.getHeight()));
        if (height <= 1.0f) {
            f5 = height;
        }
        Log.m105919d("MicroMsg.TranslationResultUI", "onGalleryScale tx: %f, ty: %f, scale: %f", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f5));
        TranslationResultUI translationResultUI = this.f205535a;
        if (translationResultUI.f273291p != null) {
            if (f3 == 0.0f && f4 == 0.0f) {
                View view = translationResultUI.f273293r;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/TranslationResultUI$4", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/scanner/ui/TranslationResultUI$4", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view3 = translationResultUI.f273293r;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/ui/TranslationResultUI$4", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/scanner/ui/TranslationResultUI$4", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            TranslationResultUI translationResultUI2 = this.f205535a;
            translationResultUI2.f273291p.setPivotX((float) (translationResultUI2.f273290o.getWidth() / 2));
            TranslationResultUI translationResultUI3 = this.f205535a;
            translationResultUI3.f273291p.setPivotY((float) (translationResultUI3.f273290o.getHeight() / 2));
            this.f205535a.f273291p.setScaleX(f5);
            this.f205535a.f273291p.setScaleY(f5);
            this.f205535a.f273291p.setTranslationX(f3);
            this.f205535a.f273291p.setTranslationY(f4);
            View view5 = this.f205535a.f273294s;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(Float.valueOf(f5));
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/scanner/ui/TranslationResultUI$4", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/scanner/ui/TranslationResultUI$4", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            return;
        }
        Log.m105918d("MicroMsg.TranslationResultUI", "runDragAnimation contentView is null !!");
    }

    /* renamed from: b */
    public void mo26354b(float f, float f2) {
    }
}
