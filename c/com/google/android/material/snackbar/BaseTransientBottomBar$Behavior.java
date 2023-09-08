package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p825u8.C111133a;
import p825u8.C111134d;
import p825u8.C111136e;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: n */
    public final C111133a f309471n = new C111133a(this);

    /* renamed from: e */
    public boolean mo143313e(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f309471n.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C111136e.f332742b == null) {
                    C111136e.f332742b = new C111136e();
                }
                synchronized (C111136e.f332742b.f332743a) {
                }
            }
        } else if (coordinatorLayout.mo144909q(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C111136e.f332742b == null) {
                C111136e.f332742b = new C111136e();
            }
            synchronized (C111136e.f332742b.f332743a) {
            }
        }
        return super.mo143313e(coordinatorLayout, view, motionEvent);
    }

    /* renamed from: w */
    public boolean mo146269w(View view) {
        this.f309471n.getClass();
        return view instanceof C111134d;
    }
}
