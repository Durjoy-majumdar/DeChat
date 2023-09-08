package com.tencent.p014mm.plugin.appbrand.page;

import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;

/* renamed from: com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader$$g */
public class AppBrandMenuHeader$$g extends LinkMovementMethod {

    /* renamed from: a */
    public static AppBrandMenuHeader$$g f197146a;

    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(textView, spannable, motionEvent);
        if (!onTouchEvent && motionEvent.getAction() == 1) {
            ViewParent parent = textView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).performClick();
            }
        }
        return onTouchEvent;
    }
}
