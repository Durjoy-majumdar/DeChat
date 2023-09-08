package db3;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.ArrowKeyMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import bb3.C92219b;

/* renamed from: db3.i */
public class C97465i extends ArrowKeyMovementMethod {
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
            int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
            int scrollX = x + textView.getScrollX();
            int scrollY = y + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), (float) scrollX);
            C97467k[] kVarArr = (C97467k[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal + 1, C97467k.class);
            if (scrollX < C92219b.m115909b() && kVarArr.length != 0 && action == 0) {
                C97467k kVar = kVarArr[0];
                kVar.mo136730b(textView, spannable, motionEvent, kVar);
            }
        }
        return false;
    }
}
