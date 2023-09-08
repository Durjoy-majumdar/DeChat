package com.tencent.p014mm.plugin.appbrand.debugger;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.RemoteDebugMoveView */
public class RemoteDebugMoveView extends FrameLayout {

    /* renamed from: d */
    public int f197033d;

    /* renamed from: e */
    public int f197034e;

    /* renamed from: f */
    public float f197035f;

    /* renamed from: g */
    public float f197036g;

    /* renamed from: h */
    public float f197037h;

    /* renamed from: i */
    public float f197038i;

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.RemoteDebugMoveView$a */
    public class C68593a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public int f197039d = 0;

        /* renamed from: com.tencent.mm.plugin.appbrand.debugger.RemoteDebugMoveView$a$a */
        public class C68594a implements Runnable {
            public C68594a() {
            }

            public void run() {
                if (RemoteDebugMoveView.this.getParent() instanceof View) {
                    View view = (View) RemoteDebugMoveView.this.getParent();
                    RemoteDebugMoveView.this.f197033d = view.getMeasuredWidth();
                    RemoteDebugMoveView.this.f197034e = view.getMeasuredHeight();
                    RemoteDebugMoveView remoteDebugMoveView = RemoteDebugMoveView.this;
                    float max = Math.max(0.0f, Math.min((float) (remoteDebugMoveView.f197033d - remoteDebugMoveView.getWidth()), RemoteDebugMoveView.this.getX()));
                    RemoteDebugMoveView remoteDebugMoveView2 = RemoteDebugMoveView.this;
                    float max2 = Math.max(0.0f, Math.min((float) (remoteDebugMoveView2.f197034e - remoteDebugMoveView2.getHeight()), RemoteDebugMoveView.this.getY()));
                    RemoteDebugMoveView.this.setX(max);
                    RemoteDebugMoveView.this.setY(max2);
                    RemoteDebugMoveView.this.requestLayout();
                }
            }
        }

        public C68593a() {
        }

        public void onGlobalLayout() {
            int i = this.f197039d + 1;
            this.f197039d = i;
            if (i >= 2) {
                RemoteDebugMoveView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                RemoteDebugMoveView.this.post(new C68594a());
            }
        }
    }

    public RemoteDebugMoveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getViewTreeObserver().addOnGlobalLayoutListener(new C68593a());
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f197035f = motionEvent.getRawX();
            this.f197036g = motionEvent.getRawY();
            return true;
        } else if (action != 2) {
            return true;
        } else {
            this.f197037h = motionEvent.getRawX();
            this.f197038i = motionEvent.getRawY();
            float x = getX() + (this.f197037h - this.f197035f);
            if (0.0f < x && x < ((float) (this.f197033d - getWidth()))) {
                setX(x);
            }
            float f = this.f197038i - this.f197036g;
            float height = (float) (this.f197034e - getHeight());
            float y = getY() + f;
            if (0.0f < y && y < height) {
                setY(y);
            } else if ((y <= 0.0f && f > 0.0f) || (y >= height && f < 0.0f)) {
                setY(y);
            }
            this.f197035f = this.f197037h;
            this.f197036g = this.f197038i;
            return true;
        }
    }

    public RemoteDebugMoveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
