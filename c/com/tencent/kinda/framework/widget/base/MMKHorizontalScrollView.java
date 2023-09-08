package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.kinda.framework.widget.tools.MMKViewUtil;
import com.tencent.kinda.gen.KHorizontalScrollView;
import com.tencent.kinda.gen.KHorizontalScrollViewOnScrollCallback;
import com.tencent.kinda.gen.KPoint;
import com.tencent.kinda.gen.KView;
import com.tencent.p014mm.p136ui.base.MMHorizontalScrollView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001'B\u0007¢\u0006\u0004\b%\u0010&J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J*\u0010\u0012\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0012\u0010\u0013\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J(\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\rH\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\u0012\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0010H\u0016J\b\u0010\u001f\u001a\u00020\u0010H\u0016J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0010H\u0016J\b\u0010!\u001a\u00020\u0010H\u0016J\u0012\u0010$\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¨\u0006("}, mo182094d2 = {"Lcom/tencent/kinda/framework/widget/base/MMKHorizontalScrollView;", "Lcom/tencent/kinda/framework/widget/base/MMKViewLayout;", "Lcom/tencent/mm/ui/base/MMHorizontalScrollView;", "Lcom/tencent/kinda/gen/KHorizontalScrollView;", "Landroid/content/Context;", "context", "createView", "Lcom/tencent/kinda/gen/KView;", "view", "", "position", "Lrx3/b0;", "addView", "", "xOffset", "yOffset", "", "animated", "scrollTo", "setContent", "top", "left", "bottom", "right", "setContentInsect", "Lcom/tencent/kinda/gen/KPoint;", "getContentOffset", "offset", "setContentOffset", "value", "setShowScrollBar", "getShowScrollBar", "setScrollWhenViewSizeEnough", "getScrollWhenViewSizeEnough", "Lcom/tencent/kinda/gen/KHorizontalScrollViewOnScrollCallback;", "callback", "setOnScrollCallback", "<init>", "()V", "Companion", "kinda-framework-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class MMKHorizontalScrollView extends MMKViewLayout<MMHorizontalScrollView> implements KHorizontalScrollView {
    public static final Companion Companion = new Companion((C8480h) null);
    public static final String TAG = "MMKHorizontalScrollView";

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/kinda/framework/widget/base/MMKHorizontalScrollView$Companion;", "", "()V", "TAG", "", "kinda-framework-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    public void addView(KView kView, int i) {
        if (kView instanceof MMKViewLayout) {
            Log.printDebugStack(TAG, this + " addView: " + kView + ", childCount: " + ((MMKViewLayout) kView).childList.size() + ' ' + this.childList.size(), new Object[0]);
        } else {
            Log.printDebugStack(TAG, this + " addView: " + kView + ", childCount: " + this.childList.size(), new Object[0]);
        }
        this.childList.add((MMKView) kView);
        C87412m.m108592e(kView, "null cannot be cast to non-null type com.tencent.kinda.framework.widget.base.MMKView<*>");
        MMKView mMKView = (MMKView) kView;
        ((MMHorizontalScrollView) getView()).addView(mMKView.getView());
        float marginLeft = mMKView.getMarginLeft();
        float marginRight = mMKView.getMarginRight();
        float marginTop = mMKView.getMarginTop();
        float marginBottom = mMKView.getMarginBottom();
        if (mMKView.getView().getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = mMKView.getView().getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = (int) MMKViewUtil.dpToPx(this.mContext, marginTop);
            marginLayoutParams.bottomMargin = (int) MMKViewUtil.dpToPx(this.mContext, marginBottom);
            marginLayoutParams.leftMargin = (int) MMKViewUtil.dpToPx(this.mContext, marginLeft);
            marginLayoutParams.rightMargin = (int) MMKViewUtil.dpToPx(this.mContext, marginRight);
            mMKView.getView().setLayoutParams(marginLayoutParams);
        }
    }

    public KPoint getContentOffset() {
        int c = C76577a.m92152c(((MMHorizontalScrollView) this.view).getContext(), ((MMHorizontalScrollView) this.view).getScrollX());
        int c2 = C76577a.m92152c(((MMHorizontalScrollView) this.view).getContext(), ((MMHorizontalScrollView) this.view).getScrollY());
        Log.printDebugStack(MMKViewLayout.TAG, "getContentOffset X: " + c + " , Y: " + c2, new Object[0]);
        return new KPoint((float) c, (float) c2);
    }

    public boolean getScrollWhenViewSizeEnough() {
        return false;
    }

    public boolean getShowScrollBar() {
        return ((MMHorizontalScrollView) this.view).isHorizontalScrollBarEnabled();
    }

    public void scrollTo(KView kView, float f, float f2, boolean z) {
        C87412m.m108592e(kView, "null cannot be cast to non-null type com.tencent.kinda.framework.widget.base.MMKView<*>");
        View view = ((MMKView) kView).getView();
        ((MMHorizontalScrollView) getView()).scrollTo((int) MMKViewUtil.dpToPx(this.mContext, f), view.getTop() - ((int) MMKViewUtil.dpToPx(this.mContext, f2)));
    }

    public void setContent(KView kView) {
    }

    public void setContentInsect(float f, float f2, float f3, float f4) {
    }

    public void setContentOffset(KPoint kPoint) {
        float f = 0.0f;
        int dpToPx = (int) MMKViewUtil.dpToPx(((MMHorizontalScrollView) this.view).getContext(), kPoint != null ? kPoint.getX() : 0.0f);
        Context context = ((MMHorizontalScrollView) this.view).getContext();
        if (kPoint != null) {
            f = kPoint.getY();
        }
        ((MMHorizontalScrollView) this.view).postDelayed(new MMKHorizontalScrollView$setContentOffset$1(this, dpToPx, (int) MMKViewUtil.dpToPx(context, f)), 150);
    }

    public void setOnScrollCallback(KHorizontalScrollViewOnScrollCallback kHorizontalScrollViewOnScrollCallback) {
        ((MMHorizontalScrollView) this.view).setOnScrollListener(new MMKHorizontalScrollView$setOnScrollCallback$1(kHorizontalScrollViewOnScrollCallback));
    }

    public void setScrollWhenViewSizeEnough(boolean z) {
    }

    public void setShowScrollBar(boolean z) {
        ((MMHorizontalScrollView) this.view).setHorizontalScrollBarEnabled(z);
    }

    public MMHorizontalScrollView createView(Context context) {
        if (context == null) {
            ViewGroup createView = super.createView(context);
            C87412m.m108593f(createView, "super.createView(context)");
            return (MMHorizontalScrollView) createView;
        }
        MMHorizontalScrollView mMHorizontalScrollView = new MMHorizontalScrollView(context);
        mMHorizontalScrollView.setOverScrollMode(2);
        mMHorizontalScrollView.setHorizontalScrollBarEnabled(false);
        mMHorizontalScrollView.setFillViewport(false);
        return mMHorizontalScrollView;
    }

    public void setContentOffset(KPoint kPoint, boolean z) {
        setContentOffset(kPoint);
    }
}
