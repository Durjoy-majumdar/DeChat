package com.tencent.p014mm.p136ui.anim.transition.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.sdk.platformtools.ForceGpuUtil;
import ij3.C60331a;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003R$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0012\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, mo182094d2 = {"Lcom/tencent/mm/ui/anim/transition/view/AnimMultiTouchImage;", "Lcom/tencent/mm/ui/base/MultiTouchImageView;", "Lij3/a;", "Landroid/graphics/Bitmap;", "bmp", "Lrx3/b0;", "setAnimBitmap", "Landroid/view/View;", "P", "Landroid/view/View;", "getBindingLayout", "()Landroid/view/View;", "setBindingLayout", "(Landroid/view/View;)V", "bindingLayout", "", "Q", "Z", "isNeedHideBindingAfterSetBitmap", "()Z", "setNeedHideBindingAfterSetBitmap", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.anim.transition.view.AnimMultiTouchImage */
public final class AnimMultiTouchImage extends MultiTouchImageView implements C60331a {

    /* renamed from: P */
    public View f284204P;

    /* renamed from: Q */
    public boolean f284205Q;

    public AnimMultiTouchImage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: g */
    public void mo81999g(boolean z) {
        if (z) {
            mo135657t(true);
        } else if (getDrawable() == null) {
            this.f284205Q = true;
        } else {
            mo135657t(false);
        }
    }

    public final View getBindingLayout() {
        return this.f284204P;
    }

    /* renamed from: j */
    public void mo82001j() {
    }

    public final void setAnimBitmap(Bitmap bitmap) {
        setMaxZoomLimit(10.0f);
        setEnableHorLongBmpMode(false);
        ForceGpuUtil.decideLayerType(this, bitmap != null ? bitmap.getWidth() : 0, bitmap != null ? bitmap.getHeight() : 0);
        int width = bitmap != null ? bitmap.getWidth() : 0;
        int height = bitmap != null ? bitmap.getHeight() : 0;
        this.f348280o = width;
        this.f348281p = height;
        setImageBitmap(bitmap);
        requestLayout();
        if (this.f284205Q) {
            mo135657t(false);
        }
    }

    public final void setBindingLayout(View view) {
        this.f284204P = view;
    }

    public final void setNeedHideBindingAfterSetBitmap(boolean z) {
        this.f284205Q = z;
    }

    /* renamed from: t */
    public final void mo135657t(boolean z) {
        if (z) {
            View view = this.f284204P;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/anim/transition/view/AnimMultiTouchImage", "showBindViewInner", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/anim/transition/view/AnimMultiTouchImage", "showBindViewInner", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view2 = this.f284204P;
            if (view2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(Float.valueOf(1.0f));
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/anim/transition/view/AnimMultiTouchImage", "showBindViewInner", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view3, "com/tencent/mm/ui/anim/transition/view/AnimMultiTouchImage", "showBindViewInner", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                return;
            }
            return;
        }
        View view4 = this.f284204P;
        if (view4 != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(Float.valueOf(0.0f));
            View view5 = view4;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/ui/anim/transition/view/AnimMultiTouchImage", "showBindViewInner", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view5, "com/tencent/mm/ui/anim/transition/view/AnimMultiTouchImage", "showBindViewInner", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }
}
