package com.tencent.p014mm.plugin.bizui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C57547m0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72917n0;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.bizui.widget.StoryListView */
public class StoryListView extends ListView implements C72917n0 {

    /* renamed from: d */
    public boolean f197544d;

    public StoryListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: B */
    public View mo81288B(int i) {
        View childAt = getChildAt(i);
        if (childAt != null) {
            return childAt.getBottom() - childAt.getTop() <= 0 ? getChildAt(i + getHeaderViewsCount()) : childAt;
        }
        Log.m105921e("ChattingListView", "null == view index:%s", Integer.valueOf(i));
        return null;
    }

    /* renamed from: D */
    public ViewGroup mo81289D() {
        return this;
    }

    /* renamed from: E */
    public void mo81290E(C57547m0 m0Var) {
        if (m0Var instanceof ListAdapter) {
            super.setAdapter((ListAdapter) m0Var);
        }
    }

    /* renamed from: N */
    public <T extends View> T mo81291N(int i) {
        return findViewById(i);
    }

    /* renamed from: c */
    public void mo17043c(RecyclerView.C0130p pVar) {
    }

    public int getFirstCompletelyVisiblePosition() {
        return getFirstVisiblePosition();
    }

    public RecyclerView.C16623q getRecycledViewPool() {
        return null;
    }

    /* renamed from: l */
    public C57547m0 mo81303l() {
        ListAdapter adapter = super.getAdapter();
        if (adapter instanceof C57547m0) {
            return (C57547m0) adapter;
        }
        return null;
    }

    public void layoutChildren() {
        if (!this.f197544d) {
            super.layoutChildren();
        }
    }

    /* renamed from: s */
    public int mo81305s(int i, int i2) {
        return Math.max(i, i2 - getFirstVisiblePosition());
    }

    public void setBlockLayoutChildren(boolean z) {
        this.f197544d = z;
    }

    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
    }

    /* renamed from: w */
    public View mo81316w(int i, int i2) {
        return getChildAt(i - i2);
    }
}
