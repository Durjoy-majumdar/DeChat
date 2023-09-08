package com.tencent.p014mm.plugin.luckymoney.story;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tencent.p014mm.view.RecyclerHorizontalViewPager;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.LuckyMoneyStoryViewPager */
public class LuckyMoneyStoryViewPager extends RecyclerHorizontalViewPager {
    public LuckyMoneyStoryViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return motionEvent.getActionMasked() == 3 ? super.dispatchTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 1, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState())) : super.dispatchTouchEvent(motionEvent);
    }
}
