package com.facebook.yoga.android;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.YogaNodeFactory;
import com.facebook.yoga.android.YogaLayout;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class VirtualYogaLayout extends ViewGroup {
    private final List<View> mChildren;
    private final YogaNode mYogaNode;
    private final Map<View, YogaNode> mYogaNodes;

    public VirtualYogaLayout(Context context) {
        super(context);
        this.mChildren = new LinkedList();
        this.mYogaNodes = new HashMap();
        this.mYogaNode = YogaNodeFactory.create();
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof VirtualYogaLayout) {
            VirtualYogaLayout virtualYogaLayout = (VirtualYogaLayout) view;
            virtualYogaLayout.transferChildren(this);
            YogaNode yogaNode = virtualYogaLayout.getYogaNode();
            YogaNode yogaNode2 = this.mYogaNode;
            yogaNode2.addChildAt(yogaNode, yogaNode2.getChildCount());
            return;
        }
        YogaNode create = YogaNodeFactory.create();
        YogaLayout.applyLayoutParams(new YogaLayout.LayoutParams(layoutParams), create, view);
        create.setData(view);
        create.setMeasureFunction(new YogaLayout.ViewMeasureFunction());
        YogaNode yogaNode3 = this.mYogaNode;
        yogaNode3.addChildAt(create, yogaNode3.getChildCount());
        addView(view, create);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof YogaLayout.LayoutParams;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new YogaLayout.LayoutParams(-1, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new YogaLayout.LayoutParams(getContext(), attributeSet);
    }

    public YogaNode getYogaNode() {
        return this.mYogaNode;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw new RuntimeException("Attempting to layout a VirtualYogaLayout");
    }

    public void transferChildren(ViewGroup viewGroup) {
        if (viewGroup instanceof VirtualYogaLayout) {
            for (View next : this.mChildren) {
                ((VirtualYogaLayout) viewGroup).addView(next, this.mYogaNodes.get(next));
            }
        } else if (viewGroup instanceof YogaLayout) {
            for (View next2 : this.mChildren) {
                ((YogaLayout) viewGroup).addView(next2, this.mYogaNodes.get(next2));
            }
        } else {
            throw new RuntimeException("VirtualYogaLayout cannot transfer children to ViewGroup of type " + viewGroup.getClass().getCanonicalName() + ".  Must either be a VirtualYogaLayout or a YogaLayout.");
        }
        this.mChildren.clear();
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new YogaLayout.LayoutParams(layoutParams);
    }

    public VirtualYogaLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VirtualYogaLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildren = new LinkedList();
        this.mYogaNodes = new HashMap();
        YogaNode create = YogaNodeFactory.create();
        this.mYogaNode = create;
        YogaLayout.applyLayoutParams(new YogaLayout.LayoutParams(context, attributeSet), create, this);
    }

    public void addView(View view, YogaNode yogaNode) {
        this.mChildren.add(view);
        this.mYogaNodes.put(view, yogaNode);
    }
}
