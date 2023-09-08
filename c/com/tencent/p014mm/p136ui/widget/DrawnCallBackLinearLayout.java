package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.x2c.X2CLinearLayout;

/* renamed from: com.tencent.mm.ui.widget.DrawnCallBackLinearLayout */
public class DrawnCallBackLinearLayout extends X2CLinearLayout {

    /* renamed from: com.tencent.mm.ui.widget.DrawnCallBackLinearLayout$a */
    public interface C74943a {
        /* renamed from: a */
        void mo104192a();
    }

    /* renamed from: com.tencent.mm.ui.widget.DrawnCallBackLinearLayout$b */
    public interface C74944b {
        /* renamed from: a */
        void mo104193a();
    }

    public DrawnCallBackLinearLayout(Context context) {
        super(context);
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        long currentTimeMillis = System.currentTimeMillis();
        super.onLayout(z, i, i2, i3, i4);
        Log.m105918d("MicroMsg.TestTimeForChatting", "[onLayout] " + (System.currentTimeMillis() - currentTimeMillis));
    }

    public void setListener(C74943a aVar) {
    }

    public void setTouchedCallback(C74944b bVar) {
    }

    public DrawnCallBackLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DrawnCallBackLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
