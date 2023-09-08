package com.tencent.p014mm.p136ui.anim.transition.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import gy3.C87412m;
import ij3.C60331a;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/ui/anim/transition/view/TransitionAnimImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lij3/a;", "Landroid/view/View;", "f", "Landroid/view/View;", "getBindingLayout", "()Landroid/view/View;", "setBindingLayout", "(Landroid/view/View;)V", "bindingLayout", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.anim.transition.view.TransitionAnimImageView */
public final class TransitionAnimImageView extends AppCompatImageView implements C60331a {

    /* renamed from: f */
    public View f165045f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransitionAnimImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: g */
    public void mo81999g(boolean z) {
        if (z) {
            View view = this.f165045f;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/anim/transition/view/TransitionAnimImageView", "showBindView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/anim/transition/view/TransitionAnimImageView", "showBindView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view2 = this.f165045f;
            if (view2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(Float.valueOf(1.0f));
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/anim/transition/view/TransitionAnimImageView", "showBindView", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view3, "com/tencent/mm/ui/anim/transition/view/TransitionAnimImageView", "showBindView", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                return;
            }
            return;
        }
        View view4 = this.f165045f;
        if (view4 != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(Float.valueOf(0.0f));
            View view5 = view4;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/ui/anim/transition/view/TransitionAnimImageView", "showBindView", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view5, "com/tencent/mm/ui/anim/transition/view/TransitionAnimImageView", "showBindView", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    public final View getBindingLayout() {
        return this.f165045f;
    }

    /* renamed from: j */
    public void mo82001j() {
        View view = this.f165045f;
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() != null) {
                setImageDrawable(imageView.getDrawable());
            }
        }
    }

    public final void setBindingLayout(View view) {
        this.f165045f = view;
    }
}
