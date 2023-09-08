package xs2;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: xs2.a */
public class C15894a implements ViewPager.C0133h {
    /* renamed from: a */
    public void mo14546a(View view, float f) {
        SnsMethodCalculate.markStartTimeMs("transformPage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.transforms.DefaultTransformer");
        float f2 = 0.0f;
        if (0.0f <= f && f <= 1.0f) {
            f2 = 1.0f - f;
        } else if (-1.0f < f && f < 0.0f) {
            f2 = f + 1.0f;
        }
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(f2));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/transforms/DefaultTransformer", "transformPage", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/transforms/DefaultTransformer", "transformPage", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setTranslationX(((float) view.getWidth()) * (-f));
        view.setTranslationY(f * ((float) view.getHeight()));
        SnsMethodCalculate.markEndTimeMs("transformPage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.transforms.DefaultTransformer");
    }
}
