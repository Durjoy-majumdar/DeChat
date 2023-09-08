package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.u1 */
public class C104926u1 {

    /* renamed from: d */
    public static final int f311550d = ViewConfiguration.getLongPressTimeout();

    /* renamed from: a */
    public final Handler f311551a = new C104927a(Looper.getMainLooper());

    /* renamed from: b */
    public boolean f311552b = false;

    /* renamed from: c */
    public final C104928b f311553c;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.u1$a */
    public class C104927a extends Handler {
        public C104927a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            boolean z = true;
            if (i == 1 || i == 2) {
                C104926u1 u1Var = C104926u1.this;
                if (!u1Var.f311552b) {
                    u1Var.f311553c.mo148711b();
                } else {
                    z = false;
                }
                if (z) {
                    sendMessageDelayed(Message.obtain(C104926u1.this.f311551a, 2), 50);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.u1$b */
    public interface C104928b {
        /* renamed from: a */
        void mo148710a();

        /* renamed from: b */
        void mo148711b();
    }

    public C104926u1(C104928b bVar) {
        this.f311553c = bVar;
    }

    /* renamed from: a */
    public boolean mo148916a(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            view.setPressed(true);
            Handler handler = this.f311551a;
            handler.sendMessageDelayed(Message.obtain(handler, 1), (long) f311550d);
            motionEvent.getX();
            motionEvent.getY();
        } else if (actionMasked == 1) {
            if (!this.f311552b && this.f311551a.hasMessages(1)) {
                this.f311553c.mo148710a();
            }
            view.setPressed(false);
            this.f311552b = false;
            this.f311551a.removeMessages(1);
            this.f311551a.removeMessages(2);
        } else if (actionMasked == 2) {
            int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float f = (float) (-scaledTouchSlop);
            if (f > x || x > ((float) (view.getWidth() + scaledTouchSlop)) || f > y || y > ((float) (view.getHeight() + scaledTouchSlop))) {
                this.f311552b = true;
            }
        } else if (actionMasked == 3) {
            view.setPressed(false);
            this.f311552b = false;
            this.f311551a.removeMessages(1);
            this.f311551a.removeMessages(2);
        }
        return true;
    }
}
