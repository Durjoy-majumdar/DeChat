package com.tencent.p014mm.p136ui.chatting.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import p849e3.C58521d;

/* renamed from: com.tencent.mm.ui.chatting.view.FoldableChatTextItemView */
public class FoldableChatTextItemView extends LinearLayout {

    /* renamed from: d */
    public C58521d f121704d;

    /* renamed from: com.tencent.mm.ui.chatting.view.FoldableChatTextItemView$a */
    public interface C44857a {
        /* renamed from: a */
        void mo70158a();
    }

    public FoldableChatTextItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void setTagObject(MotionEvent motionEvent) {
        setTag(C0966R.C0970id.f359414kt0, new int[]{(int) motionEvent.getRawX(), (int) motionEvent.getRawY()});
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        setTagObject(motionEvent);
        C58521d dVar = this.f121704d;
        if (dVar != null) {
            dVar.mo83434a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setFoldTextListener(C44857a aVar) {
    }

    public void setMaxHeight(int i) {
    }

    public void setOnGestureListener(GestureDetector.OnGestureListener onGestureListener) {
        this.f121704d = new C58521d(getContext(), onGestureListener);
    }

    public FoldableChatTextItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
