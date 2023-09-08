package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.n0 */
public interface C72917n0 {
    /* renamed from: B */
    View mo81288B(int i);

    /* renamed from: D */
    ViewGroup mo81289D();

    /* renamed from: E */
    void mo81290E(C57547m0 m0Var);

    /* renamed from: N */
    <T extends View> T mo81291N(int i);

    void addFooterView(View view);

    void addHeaderView(View view);

    void addOnLayoutChangeListener(View.OnLayoutChangeListener onLayoutChangeListener);

    /* renamed from: c */
    void mo17043c(RecyclerView.C0130p pVar);

    int getBottom();

    View getChildAt(int i);

    int getChildCount();

    Context getContext();

    int getCount();

    int getFirstCompletelyVisiblePosition();

    int getFirstVisiblePosition();

    int getFooterViewsCount();

    int getHeaderViewsCount();

    int getHeight();

    int getLastVisiblePosition();

    boolean getLocalVisibleRect(Rect rect);

    int getPaddingBottom();

    int getPaddingTop();

    int getPositionForView(View view);

    int getVisibility();

    /* renamed from: l */
    C57547m0 mo81303l();

    boolean post(Runnable runnable);

    boolean postDelayed(Runnable runnable, long j);

    void postInvalidate();

    boolean removeCallbacks(Runnable runnable);

    boolean removeHeaderView(View view);

    void removeOnLayoutChangeListener(View.OnLayoutChangeListener onLayoutChangeListener);

    /* renamed from: s */
    int mo81305s(int i, int i2);

    void setBackgroundDrawable(Drawable drawable);

    void setCacheColorHint(int i);

    void setClipToPadding(boolean z);

    void setDivider(Drawable drawable);

    void setFocusable(boolean z);

    void setFocusableInTouchMode(boolean z);

    void setId(int i);

    void setItemChecked(int i, boolean z);

    void setKeepScreenOn(boolean z);

    void setOnDragListener(View.OnDragListener onDragListener);

    void setOnScrollListener(AbsListView.OnScrollListener onScrollListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setOverScrollMode(int i);

    void setPadding(int i, int i2, int i3, int i4);

    void setScrollBarStyle(int i);

    void setSelection(int i);

    void setSelectionFromTop(int i, int i2);

    void setSelector(int i);

    void setTranscriptMode(int i);

    void setVisibility(int i);

    void smoothScrollBy(int i, int i2);

    void smoothScrollToPositionFromTop(int i, int i2, int i3);

    /* renamed from: w */
    View mo81316w(int i, int i2);
}
