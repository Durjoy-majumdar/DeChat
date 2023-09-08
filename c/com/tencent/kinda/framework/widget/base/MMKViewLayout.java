package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.yoga.android.YogaLayout;
import com.tencent.kinda.framework.animate.KindaAnimatorViewProxy;
import com.tencent.kinda.gen.Align;
import com.tencent.kinda.gen.FlexDirection;
import com.tencent.kinda.gen.Justify;
import com.tencent.kinda.gen.KView;
import com.tencent.kinda.gen.KViewLayout;
import com.tencent.kinda.gen.Wrap;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;

public class MMKViewLayout<Layout extends ViewGroup> extends MMKView<Layout> implements KViewLayout {
    public static final String TAG = "MMKViewLayout";
    public ArrayList<MMKView> childList = new ArrayList<>();

    private void addViewImpl(KView kView, int i) {
        if (getView() != null) {
            KView unWrapRealObj = KindaAnimatorViewProxy.unWrapRealObj(kView);
            boolean z = unWrapRealObj instanceof MMKView;
            if (z) {
                MMKView mMKView = (MMKView) unWrapRealObj;
                Log.printDebugStack(TAG, "%s addview this %s | child %s | childparent %s | childCount: %s", this, getView(), mMKView.getView(), mMKView.getView().getParent(), Integer.valueOf(this.childList.size()));
                if (mMKView.node() != null && mMKView.node().getData() == null) {
                    mMKView.node().setData(mMKView.getView());
                }
                if (getView() instanceof YogaLayout) {
                    ((YogaLayout) getView()).addView(mMKView.getView(), mMKView.node());
                } else {
                    ((ViewGroup) getView()).addView(mMKView.getView());
                }
                this.childList.add(mMKView);
                return;
            }
            Log.m105921e(TAG, "error error %s child %s %s", getView(), unWrapRealObj, Boolean.valueOf(z));
        }
    }

    public void addView(KView kView) {
        addView(kView, node().getChildCount());
    }

    public Align getAlignContent() {
        return this.flexAttr.getAlignContent();
    }

    public Align getAlignItems() {
        return this.flexAttr.getAlignItems();
    }

    public boolean getDisableHighlightDarkMode() {
        return super.getDisableHighlightDarkMode();
    }

    public FlexDirection getFlexDirection() {
        return this.flexAttr.getFlexDirection();
    }

    public Wrap getFlexWrap() {
        return this.flexAttr.getFlexWrap();
    }

    public Justify getJustifyContent() {
        return this.flexAttr.getJustifyContent();
    }

    public void removeAllViews() {
        ((ViewGroup) getView()).removeAllViews();
    }

    public void removeView(KView kView) {
        if (getView() != null && (kView instanceof MMKView)) {
            ((ViewGroup) getView()).removeView(((MMKView) kView).getView());
            this.childList.remove(kView);
        }
    }

    public void setAccessible(boolean z) {
        if (z) {
            ((ViewGroup) getView()).setImportantForAccessibility(1);
            ((ViewGroup) getView()).post(new Runnable() {
                public void run() {
                    for (int i = 0; i < MMKViewLayout.this.childList.size(); i++) {
                        MMKViewLayout.this.childList.get(i).getView().setImportantForAccessibility(4);
                    }
                }
            });
            return;
        }
        ((ViewGroup) getView()).setImportantForAccessibility(2);
        ((ViewGroup) getView()).post(new Runnable() {
            public void run() {
                for (int i = 0; i < MMKViewLayout.this.childList.size(); i++) {
                    View view = MMKViewLayout.this.childList.get(i).getView();
                    if (view.getImportantForAccessibility() == 4) {
                        view.setImportantForAccessibility(0);
                    }
                }
            }
        });
    }

    public void setAlignContent(Align align) {
        this.flexAttr.setAlignContent(align);
    }

    public void setAlignItems(Align align) {
        this.flexAttr.setAlignItems(align);
    }

    public void setDisableHighlightDarkMode(boolean z) {
        super.setDisableHighlightDarkMode(z);
        Log.m105925i(TAG, "setDisableDarkMode: %b, childlist's size: %d", Boolean.valueOf(z), Integer.valueOf(this.childList.size()));
        for (int i = 0; i < this.childList.size(); i++) {
            this.childList.get(i).setDisableHighlightDarkMode(z);
        }
    }

    public void setFlexDirection(FlexDirection flexDirection) {
        this.flexAttr.setFlexDirection(flexDirection);
    }

    public void setFlexWrap(Wrap wrap) {
        this.flexAttr.setFlexWrap(wrap);
    }

    public void setFocusableInTouchMode(boolean z) {
        ((ViewGroup) getView()).setFocusable(true);
        ((ViewGroup) getView()).setFocusableInTouchMode(true);
    }

    public void setJustifyContent(Justify justify) {
        this.flexAttr.setJustifyContent(justify);
    }

    public void addView(KView kView, int i) {
        addViewImpl(kView, node().getChildCount());
    }

    public Layout createView(Context context) {
        Layout yogaLayout = new YogaLayout(context);
        this.flexAttr.setYogaNode(yogaLayout.getYogaNode());
        return yogaLayout;
    }
}
