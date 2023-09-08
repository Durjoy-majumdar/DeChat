package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.base.HeaderGridView */
public class HeaderGridView extends GridView {

    /* renamed from: d */
    public ArrayList<Object> f121232d = new ArrayList<>();

    public HeaderGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setClipChildren(false);
    }

    public int getHeaderViewCount() {
        return this.f121232d.size();
    }

    public int getNumColumns() {
        return super.getNumColumns();
    }

    public void setClipChildren(boolean z) {
    }

    public HeaderGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setClipChildren(false);
    }
}
