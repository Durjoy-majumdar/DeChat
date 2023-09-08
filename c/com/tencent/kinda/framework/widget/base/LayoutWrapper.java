package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import j20.C117292a;
import java.util.ArrayList;

class LayoutWrapper extends LinearLayout {
    public LayoutWrapper(Context context, View view) {
        super(context);
        setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        addView(view, layoutParams);
        setClickable(true);
        setLongClickable(true);
        view.setOnTouchListener(new View.OnTouchListener() {
            private byte _hellAccFlag_;

            public boolean onTouch(View view, MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/kinda/framework/widget/base/LayoutWrapper$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                this.onTouchEvent(motionEvent);
                C117292a.m165362h(false, this, "com/tencent/kinda/framework/widget/base/LayoutWrapper$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        });
        view.setImportantForAccessibility(2);
    }
}
