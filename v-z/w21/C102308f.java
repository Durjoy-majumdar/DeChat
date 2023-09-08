package w21;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.ArrowKeyMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import u21.C101956h;

/* renamed from: w21.f */
public class C102308f extends ArrowKeyMovementMethod {

    /* renamed from: a */
    public static C102308f f301324a;

    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
            int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
            int scrollX = x + textView.getScrollX();
            int scrollY = y + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), (float) scrollX);
            C102322s[] sVarArr = (C102322s[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal + 1, C102322s.class);
            if (scrollX < C101956h.m134205b() && sVarArr.length != 0 && action == 0) {
                C102322s sVar = sVarArr[0];
                sVar.mo141870b(textView, spannable, motionEvent, sVar);
            }
        }
        return false;
    }
}
