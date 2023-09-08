package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.framework.widget.tools.MMKViewUtil;
import com.tencent.kinda.gen.KPoint;
import com.tencent.kinda.gen.KScrollView;
import com.tencent.kinda.gen.KScrollViewOnScrollCallback;
import com.tencent.kinda.gen.KView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.MMScrollView;
import kg3.C76577a;

public class MMKScrollView extends MMKViewLayout<MMScrollView> implements KScrollView {
    public static final String TAG = "MMKScrollView";

    public void addView(KView kView, int i) {
        if (kView instanceof MMKViewLayout) {
            Log.printDebugStack(TAG, "%s addView: %s, childCount: %s %s", this, kView, Integer.valueOf(((MMKViewLayout) kView).childList.size()), Integer.valueOf(this.childList.size()));
        } else {
            Log.printDebugStack(TAG, "%s addView: %s, childCount: %s", this, kView, Integer.valueOf(this.childList.size()));
        }
        MMKView mMKView = (MMKView) kView;
        this.childList.add(mMKView);
        ((MMScrollView) getView()).addView(mMKView.getView());
        float marginLeft = kView.getMarginLeft();
        float marginRight = kView.getMarginRight();
        float marginTop = kView.getMarginTop();
        float marginBottom = kView.getMarginBottom();
        MMKView mMKView2 = (MMKView) kView;
        if (mMKView2.getView().getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mMKView2.getView().getLayoutParams();
            marginLayoutParams.topMargin = (int) MMKViewUtil.dpToPx(this.mContext, marginTop);
            marginLayoutParams.bottomMargin = (int) MMKViewUtil.dpToPx(this.mContext, marginBottom);
            marginLayoutParams.leftMargin = (int) MMKViewUtil.dpToPx(this.mContext, marginLeft);
            marginLayoutParams.rightMargin = (int) MMKViewUtil.dpToPx(this.mContext, marginRight);
            mMKView2.getView().setLayoutParams(marginLayoutParams);
        }
    }

    public KPoint getContentOffset() {
        int c = C76577a.m92152c(((MMScrollView) getView()).getContext(), ((MMScrollView) getView()).getScrollX());
        int c2 = C76577a.m92152c(((MMScrollView) getView()).getContext(), ((MMScrollView) getView()).getScrollY());
        KPoint kPoint = new KPoint((float) c, (float) c2);
        Log.printDebugStack(TAG, "getContentOffset  X: %s, Y: %s", Integer.valueOf(c), Integer.valueOf(c2));
        return kPoint;
    }

    public float getHeight() {
        if (KindaContext.get() == null) {
            return (float) 0;
        }
        DisplayMetrics displayMetrics = KindaContext.get().getResources().getDisplayMetrics();
        int pxToDp = (int) MMKViewUtil.pxToDp(((MMScrollView) getView()).getContext(), (float) ((MMScrollView) getView()).getHeight());
        int pxToDp2 = (int) MMKViewUtil.pxToDp(((MMScrollView) getView()).getContext(), (float) displayMetrics.heightPixels);
        Log.printDebugStack(TAG, "getView() - %s scroolviewheight: %s,screenheight: %s", this, Integer.valueOf(pxToDp), Integer.valueOf(pxToDp2));
        return (float) Math.min(pxToDp, pxToDp2);
    }

    public boolean getScrollToDimissKeyboardEnabled() {
        return false;
    }

    public boolean getScrollWhenViewSizeEnough() {
        return false;
    }

    public boolean getShowScrollBar() {
        return ((MMScrollView) getView()).isVerticalScrollBarEnabled();
    }

    public void removeView(KView kView) {
        MMKView mMKView = (MMKView) kView;
        this.childList.remove(mMKView.getView());
        ((MMScrollView) getView()).removeView(mMKView.getView());
    }

    public void scrollTo(KView kView, float f, float f2, boolean z) {
        View view = ((MMKView) kView).getView();
        int dpToPx = (int) MMKViewUtil.dpToPx(this.mContext, f);
        int dpToPx2 = (int) MMKViewUtil.dpToPx(this.mContext, f2);
        if (this.childList.size() <= 0) {
            Log.m105920e(TAG, "has not contentView");
            return;
        }
        KPoint convertPointToView = kView.convertPointToView(new KPoint(0.0f, 0.0f), this.childList.get(0));
        KPoint convertPointToView2 = kView.convertPointToView(new KPoint(0.0f, 0.0f), this);
        int width = ((MMScrollView) getView()).getWidth();
        int height = ((MMScrollView) getView()).getHeight();
        int width2 = view.getWidth();
        int height2 = view.getHeight();
        float a = (float) C76577a.m92150a(this.mContext, convertPointToView2.f193409mY);
        float f3 = ((float) height2) + a;
        if (a < 0.0f || f3 > ((float) height)) {
            int a2 = C76577a.m92150a(this.mContext, convertPointToView.f193408mX);
            int a3 = C76577a.m92150a(this.mContext, convertPointToView.f193409mY);
            Log.m105925i(TAG, "sw:%s sh:%s, tx:%s ty:%s tw:%s th:%s, xo:%s yo:%s", Integer.valueOf(width), Integer.valueOf(height), Integer.valueOf(a2), Integer.valueOf(a3), Integer.valueOf(width2), Integer.valueOf(height2), Integer.valueOf(dpToPx), Integer.valueOf(dpToPx2));
            int i = dpToPx2 - (height - (a3 + height2));
            int i2 = dpToPx - (width - (a2 + width2));
            Log.m105925i(TAG, "scrollTo x:%s y:%s", Integer.valueOf(i2), Integer.valueOf(i));
            ((MMScrollView) getView()).scrollTo(Math.max(i2, 0), Math.max(i, 0));
            return;
        }
        Log.m105924i(TAG, "view is perfect visible, no need scroll to");
    }

    public void setContent(KView kView) {
    }

    public void setContentInsect(float f, float f2, float f3, float f4) {
    }

    public void setContentOffset(KPoint kPoint) {
        final int dpToPx = (int) MMKViewUtil.dpToPx(((MMScrollView) getView()).getContext(), (float) ((int) kPoint.getX()));
        final int dpToPx2 = (int) MMKViewUtil.dpToPx(((MMScrollView) getView()).getContext(), (float) ((int) kPoint.getY()));
        ((MMScrollView) getView()).postDelayed(new Runnable() {
            public void run() {
                ((MMScrollView) MMKScrollView.this.getView()).scrollBy(dpToPx, dpToPx2);
            }
        }, 150);
        Log.printDebugStack(TAG, "setContentOffset  X: %s, Y: %s", Integer.valueOf(dpToPx), Integer.valueOf(dpToPx2));
    }

    public void setOnScrollCallback(final KScrollViewOnScrollCallback kScrollViewOnScrollCallback) {
        if (kScrollViewOnScrollCallback != null) {
            ((MMScrollView) getView()).setOnScrollListener(new MMScrollView.C75166b() {
                public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    kScrollViewOnScrollCallback.onScroll((float) C76577a.m92152c(MMKScrollView.this.mContext, i), (float) C76577a.m92152c(MMKScrollView.this.mContext, i2));
                }
            });
        }
    }

    public void setScrollToDimissKeyboardEnabled(boolean z) {
    }

    public void setScrollWhenViewSizeEnough(boolean z) {
    }

    public void setShowScrollBar(boolean z) {
        ((MMScrollView) getView()).setVerticalScrollBarEnabled(z);
    }

    public MMScrollView createView(Context context) {
        MMScrollView mMScrollView = new MMScrollView(context);
        mMScrollView.setOverScrollMode(2);
        mMScrollView.setFillViewport(true);
        return mMScrollView;
    }

    public void setContentOffset(KPoint kPoint, boolean z) {
        setContentOffset(kPoint);
    }
}
