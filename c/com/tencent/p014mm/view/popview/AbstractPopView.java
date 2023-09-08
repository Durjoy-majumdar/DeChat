package com.tencent.p014mm.view.popview;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* renamed from: com.tencent.mm.view.popview.AbstractPopView */
public abstract class AbstractPopView extends FrameLayout {

    /* renamed from: d */
    public C75076a f220882d;

    /* renamed from: e */
    public int f220883e = 0;

    /* renamed from: com.tencent.mm.view.popview.AbstractPopView$a */
    public interface C75076a {
        void onDismiss();
    }

    public AbstractPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo104700a() {
        C75076a aVar = this.f220882d;
        if (aVar != null) {
            aVar.onDismiss();
        }
    }

    /* renamed from: b */
    public final Activity mo104701b(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            return mo104701b(((ContextThemeWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: c */
    public void mo104702c(Context context) {
        Activity b = mo104701b(context);
        this.f220883e = 0;
        if (b != null) {
            View findViewById = b.findViewById(16908290);
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            findViewById.getLocationOnScreen(iArr);
            findViewById.getLocationInWindow(iArr2);
            this.f220883e = iArr[1] - iArr2[1];
        }
    }

    /* renamed from: d */
    public abstract void mo104703d(View view);

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() != 4) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (getKeyDispatcherState() == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
            if (keyDispatcherState2 != null) {
                keyDispatcherState2.startTracking(keyEvent, this);
            }
            return true;
        } else if (keyEvent.getAction() != 1 || (keyDispatcherState = getKeyDispatcherState()) == null || !keyDispatcherState.isTracking(keyEvent) || keyEvent.isCanceled()) {
            return super.dispatchKeyEvent(keyEvent);
        } else {
            mo104700a();
            return true;
        }
    }

    public abstract WindowManager.LayoutParams getWindowLayoutParams();

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (motionEvent.getAction() == 0 && (x < 0 || x >= getWidth() || y < 0 || y >= getHeight())) {
            mo104700a();
            return true;
        } else if (motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        } else {
            mo104700a();
            return true;
        }
    }

    public void setOnDismissCallback(C75076a aVar) {
        this.f220882d = aVar;
    }

    public AbstractPopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
