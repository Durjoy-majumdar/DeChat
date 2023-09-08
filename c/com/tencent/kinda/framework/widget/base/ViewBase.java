package com.tencent.kinda.framework.widget.base;

import com.facebook.yoga.YogaNode;
import com.tencent.kinda.framework.widget.tools.FlexBoxAttr;

public class ViewBase {
    public FlexBoxAttr flexAttr = new FlexBoxAttr(new FlexBoxAttr.IFlexBoxChange() {
        public void onChange() {
            ViewBase.this.onFlexAttribute();
        }
    });

    public YogaNode node() {
        return this.flexAttr.node();
    }

    public void onFlexAttribute() {
    }
}
