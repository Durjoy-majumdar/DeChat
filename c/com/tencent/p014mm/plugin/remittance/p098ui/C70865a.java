package com.tencent.p014mm.plugin.remittance.p098ui;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.remittance.ui.a */
public class C70865a implements View.OnTouchListener {

    /* renamed from: d */
    public C70866a f205272d;

    /* renamed from: com.tencent.mm.plugin.remittance.ui.a$a */
    public static class C70866a implements Runnable {

        /* renamed from: d */
        public View f205273d;

        public C70866a(View view) {
            this.f205273d = view;
        }

        public void run() {
            View view = this.f205273d;
            boolean performLongClick = view.performLongClick();
            while (!performLongClick) {
                view = (View) view.getParent();
                if (view != null) {
                    performLongClick = view.performLongClick();
                } else {
                    return;
                }
            }
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/remittance/ui/ClickMovementMethod", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (this.f205272d == null) {
            this.f205272d = new C70866a(view);
        }
        TextView textView = (TextView) view;
        textView.setMovementMethod((MovementMethod) null);
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(textView.getText());
        int action = motionEvent.getAction();
        if (action == 0 || action == 1) {
            int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
            int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
            int scrollX = x + textView.getScrollX();
            int scrollY = y + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), (float) scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) newSpannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                if (action == 0) {
                    view.postDelayed(this.f205272d, (long) ViewConfiguration.getLongPressTimeout());
                } else {
                    view.removeCallbacks(this.f205272d);
                    clickableSpanArr[0].onClick(textView);
                }
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/remittance/ui/ClickMovementMethod", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return true;
            }
        } else if (action == 3) {
            view.removeCallbacks(this.f205272d);
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/remittance/ui/ClickMovementMethod", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
