package rs1;

import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.bullet.MegaVideoBulletView;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import com.tencent.p014mm.plugin.finder.view.FinderVideoBanner;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import gy3.C87412m;
import j20.C117292a;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import rx3.C36570n;

/* renamed from: rs1.i5 */
public final class C13272i5 implements RecyclerViewDrawerSquares.C45117c {

    /* renamed from: d */
    public final /* synthetic */ C60905o f37663d;

    /* renamed from: e */
    public final /* synthetic */ FinderHorizontalVideoDrawerUIC f37664e;

    /* renamed from: f */
    public final /* synthetic */ FinderVideoBanner f37665f;

    /* renamed from: g */
    public final /* synthetic */ float f37666g;

    /* renamed from: h */
    public final /* synthetic */ float f37667h;

    /* renamed from: i */
    public final /* synthetic */ float f37668i;

    /* renamed from: j */
    public final /* synthetic */ float f37669j;

    /* renamed from: n */
    public final /* synthetic */ int f37670n;

    /* renamed from: o */
    public final /* synthetic */ float f37671o;

    /* renamed from: p */
    public final /* synthetic */ float f37672p;

    /* renamed from: q */
    public final /* synthetic */ float f37673q;

    public C13272i5(C60905o oVar, FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC, FinderVideoBanner finderVideoBanner, float f, float f2, float f3, float f4, int i, float f5, float f6, float f7) {
        this.f37663d = oVar;
        this.f37664e = finderHorizontalVideoDrawerUIC;
        this.f37665f = finderVideoBanner;
        this.f37666g = f;
        this.f37667h = f2;
        this.f37668i = f3;
        this.f37669j = f4;
        this.f37670n = i;
        this.f37671o = f5;
        this.f37672p = f6;
        this.f37673q = f7;
    }

    /* renamed from: e */
    public void mo9497e(float f) {
        float f2 = f;
        if (Float.isNaN(f)) {
            Log.m105924i("FinderHorizontalVideoDrawerUIC", "onDrawerTranslation isNaN percent:" + f2);
            return;
        }
        Log.m105924i("FinderHorizontalVideoDrawerUIC", "onDrawerTranslation percent:" + f2);
        FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC = this.f37664e;
        FinderVideoBanner finderVideoBanner = this.f37665f;
        C87412m.m108593f(finderVideoBanner, "banner");
        boolean z = true;
        float f3 = ((float) 1) - f2;
        float f4 = this.f37666g;
        float f5 = this.f37667h;
        float f6 = this.f37668i;
        float f7 = this.f37669j;
        float f8 = (float) this.f37670n;
        float f9 = this.f37671o;
        float f15 = this.f37672p;
        float f16 = this.f37673q;
        finderHorizontalVideoDrawerUIC.getClass();
        float f17 = f6 > 1.0f ? ((f6 - 1.0f) * f3) + 1.0f : f6 < 1.0f ? 1.0f - ((1.0f - f6) * f3) : 1.0f;
        float f18 = f7 > 1.0f ? ((f7 - 1.0f) * f3) + 1.0f : f7 < 1.0f ? 1.0f - ((1.0f - f7) * f3) : 1.0f;
        finderVideoBanner.setPivotX(f4);
        finderVideoBanner.setPivotY(f5);
        finderVideoBanner.setScaleX(f17);
        finderVideoBanner.setScaleY(f18);
        finderVideoBanner.setTranslationX(f15 + (f8 * f3));
        finderVideoBanner.setTranslationY(f16 + (f9 * f3));
        if (0.0f <= f3 && f3 <= 0.6f) {
            float f19 = 1.0f - (f3 / 0.6f);
            MegaVideoBulletView megaVideoBulletView = ((C63513a1) C39818r.f106831a.mo62444c(finderHorizontalVideoDrawerUIC.getActivity()).mo75002a(C63513a1.class)).f180149p;
            if (megaVideoBulletView != null) {
                megaVideoBulletView.setAlpha(f19);
            }
            C60905o oVar = finderHorizontalVideoDrawerUIC.f18679i;
            if (oVar != null) {
                float borderClose = (finderHorizontalVideoDrawerUIC.mo5141e3().getBorderClose() - finderHorizontalVideoDrawerUIC.mo5141e3().getPeekHeight()) - finderHorizontalVideoDrawerUIC.mo5141e3().getTranslation();
                View D = oVar.mo85812D(C0966R.C0970id.hra);
                if (D != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Float.valueOf(f19));
                    View view = D;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    D.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    D.setTranslationY(-borderClose);
                }
                View D2 = oVar.mo85812D(C0966R.C0970id.d97);
                if (D2 != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(Float.valueOf(f19));
                    View view2 = D2;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    D2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    D2.setTranslationY(-borderClose);
                }
            }
        }
        if (0.6f > f3 || f3 > 1.0f) {
            z = false;
        }
        if (z) {
            float f25 = (f3 - 0.6f) / 0.4f;
            View f35 = finderHorizontalVideoDrawerUIC.mo5142f3();
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(Float.valueOf(f25));
            View view3 = f35;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            f35.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            finderHorizontalVideoDrawerUIC.mo5143g3().setAlpha(f25);
            View view4 = (View) ((C36570n) finderHorizontalVideoDrawerUIC.f18683p).getValue();
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(Float.valueOf(f25));
            View view5 = view4;
            C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((Float) aVar4.mo10231a(0)).floatValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    /* renamed from: f */
    public void mo9498f() {
    }

    /* renamed from: g */
    public void mo3766g(boolean z, boolean z2, int i) {
        if (!z) {
            FinderFullSeekBarLayout finderFullSeekBarLayout = (FinderFullSeekBarLayout) this.f37663d.mo85812D(C0966R.C0970id.eh4);
            if (finderFullSeekBarLayout != null) {
                finderFullSeekBarLayout.mo4259i("horizontalVideoAnimClose");
            }
            this.f37664e.mo5147l3();
        }
    }
}
