package com.tencent.p014mm.plugin.finder.megavideo.p053ui;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(B%\b\u0016\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\u0006\u0010)\u001a\u00020\u0018¢\u0006\u0004\b'\u0010*R\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R6\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00178\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0005\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\t¨\u0006+"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/megavideo/ui/MegaVideoInputLayout;", "Landroid/widget/LinearLayout;", "Lcom/tencent/mm/ui/tools/t0;", "", "e", "Z", "getListenKeyBoardChange", "()Z", "setListenKeyBoardChange", "(Z)V", "listenKeyBoardChange", "Landroid/view/View;", "f", "Landroid/view/View;", "getNestedAnimVideoView", "()Landroid/view/View;", "setNestedAnimVideoView", "(Landroid/view/View;)V", "nestedAnimVideoView", "g", "getNestedAnimButton", "setNestedAnimButton", "nestedAnimButton", "Lkotlin/Function2;", "", "Lrx3/b0;", "h", "Lfy3/p;", "getOnKeyboardChange", "()Lfy3/p;", "setOnKeyboardChange", "(Lfy3/p;)V", "onKeyboardChange", "isShowKeyboard", "setShowKeyboard", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.megavideo.ui.MegaVideoInputLayout */
public final class MegaVideoInputLayout extends LinearLayout implements C7020t0 {

    /* renamed from: d */
    public final boolean f15487d = C75044y4.m89992d(getContext());

    /* renamed from: e */
    public boolean f15488e = true;

    /* renamed from: f */
    public View f15489f;

    /* renamed from: g */
    public View f15490g;

    /* renamed from: h */
    public C32227p<? super Boolean, ? super Integer, C13598b0> f15491h;

    public MegaVideoInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: Q1 */
    public void mo531Q1(int i, boolean z) {
        View view;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator translationY;
        ViewPropertyAnimator duration2;
        ViewPropertyAnimator translationY2;
        ViewPropertyAnimator scaleX;
        ViewPropertyAnimator scaleY;
        if (!this.f15488e) {
            Log.m105924i("MegaVideoInputLayout", "onKeyboardHeightChanged: listenKeyBoardChange = " + this.f15488e);
            return;
        }
        boolean z2 = false;
        boolean z3 = i > 0;
        if (z3) {
            int c = this.f15487d ? C75044y4.m89991c(getContext()) + i : i;
            boolean z4 = getContext().getResources().getConfiguration().orientation == 2;
            Log.m105924i("MegaVideoInputLayout", "animViews: footer isLand = " + z4 + ", translateY = " + c);
            if (!z4 && (view = this.f15489f) != null) {
                Point h = C85875k4.m106184h(getContext());
                int i2 = (h.x != 0 && h.y != 0 ? h.y : getContext().getResources().getDisplayMetrics().heightPixels) - c;
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                int height = view.getHeight();
                float f = 1.0f;
                if (height > i2) {
                    f = ((float) i2) / ((float) height);
                    height = i2;
                }
                int i3 = ((i2 - height) / 2) - iArr[1];
                view.setPivotY(0.0f);
                ViewPropertyAnimator animate2 = view.animate();
                if (!(animate2 == null || (duration2 = animate2.setDuration(90)) == null || (translationY2 = duration2.translationY((float) i3)) == null || (scaleX = translationY2.scaleX(f)) == null || (scaleY = scaleX.scaleY(f)) == null)) {
                    scaleY.start();
                }
                View view2 = this.f15490g;
                if (view2 != null) {
                    if (view2.getVisibility() == 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        view2 = null;
                    }
                    if (!(view2 == null || (animate = view2.animate()) == null || (duration = animate.setDuration(90)) == null || (translationY = duration.translationY((float) i3)) == null)) {
                        translationY.start();
                    }
                }
                Log.m105924i("MegaVideoInputLayout", "animViews: video view translateY = " + i3 + ", scale = " + f);
            }
        }
        Log.m105924i("MegaVideoInputLayout", "onKeyboardHeightChanged: isShow = " + z3 + ", height = " + i);
        C32227p<? super Boolean, ? super Integer, C13598b0> pVar = this.f15491h;
        if (pVar != null) {
            pVar.invoke(Boolean.valueOf(z3), Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public final void mo3457a() {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator translationY;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator duration2;
        ViewPropertyAnimator translationY2;
        ViewPropertyAnimator scaleX;
        ViewPropertyAnimator scaleY;
        Log.m105924i("MegaVideoInputLayout", "restoreViews: return to original");
        View view = this.f15489f;
        if (!(view == null || (animate2 = view.animate()) == null || (duration2 = animate2.setDuration(180)) == null || (translationY2 = duration2.translationY(0.0f)) == null || (scaleX = translationY2.scaleX(1.0f)) == null || (scaleY = scaleX.scaleY(1.0f)) == null)) {
            scaleY.start();
        }
        View view2 = this.f15490g;
        if (view2 != null) {
            if (!(Float.compare(view2.getTranslationY(), 0.0f) != 0)) {
                view2 = null;
            }
            if (view2 != null && (animate = view2.animate()) != null && (duration = animate.setDuration(180)) != null && (translationY = duration.translationY(0.0f)) != null) {
                translationY.start();
            }
        }
    }

    public final boolean getListenKeyBoardChange() {
        return this.f15488e;
    }

    public final View getNestedAnimButton() {
        return this.f15490g;
    }

    public final View getNestedAnimVideoView() {
        return this.f15489f;
    }

    public final C32227p<Boolean, Integer, C13598b0> getOnKeyboardChange() {
        return this.f15491h;
    }

    public final void setListenKeyBoardChange(boolean z) {
        this.f15488e = z;
    }

    public final void setNestedAnimButton(View view) {
        this.f15490g = view;
    }

    public final void setNestedAnimVideoView(View view) {
        this.f15489f = view;
    }

    public final void setOnKeyboardChange(C32227p<? super Boolean, ? super Integer, C13598b0> pVar) {
        this.f15491h = pVar;
    }

    public final void setShowKeyboard(boolean z) {
    }

    public MegaVideoInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
