package com.tencent.p014mm.p136ui.bizchat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ListView;

/* renamed from: com.tencent.mm.ui.bizchat.BizChatSearchListView */
public class BizChatSearchListView extends ListView {

    /* renamed from: d */
    public C44734a f121368d;

    /* renamed from: com.tencent.mm.ui.bizchat.BizChatSearchListView$a */
    public interface C44734a {
    }

    public BizChatSearchListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C44734a aVar = this.f121368d;
        if (aVar != null) {
            ((BizChatSearchUI) aVar).hideVKB();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setOnTouchListener(C44734a aVar) {
        this.f121368d = aVar;
    }

    public BizChatSearchListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
