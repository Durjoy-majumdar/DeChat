package com.tencent.p014mm.p136ui.conversation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.p136ui.conversation.C74720p;
import com.tencent.p014mm.view.x2c.X2CLinearLayout;

/* renamed from: com.tencent.mm.ui.conversation.ConversationFolderItemView */
public class ConversationFolderItemView extends X2CLinearLayout {
    public ConversationFolderItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i, int i2) {
        if (getTag() instanceof C74720p.C74733m) {
            C74720p.C74733m mVar = (C74720p.C74733m) getTag();
            if (mVar.f219761p == 0) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(mVar.f219760o, 1073741824));
            } else {
                super.onMeasure(i, i2);
            }
        } else {
            super.onMeasure(i, i2);
        }
    }

    public ConversationFolderItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
