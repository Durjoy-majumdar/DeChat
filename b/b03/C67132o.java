package b03;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import fy3.C32224a;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: b03.o */
public final class C67132o extends LinkMovementMethod {

    /* renamed from: a */
    public final C32224a<C13598b0> f192746a;

    public C67132o(C32224a<C13598b0> aVar) {
        this.f192746a = aVar;
    }

    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        C32224a<C13598b0> aVar;
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (textView != null && ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 0))) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float totalPaddingLeft = x - ((float) textView.getTotalPaddingLeft());
            float totalPaddingTop = y - ((float) textView.getTotalPaddingTop());
            float scrollX = totalPaddingLeft + ((float) textView.getScrollX());
            float scrollY = totalPaddingTop + ((float) textView.getScrollY());
            Layout layout = textView.getLayout();
            C87412m.m108593f(layout, "widget.layout");
            if (layout.getOffsetForHorizontal(layout.getLineForVertical((int) scrollY), scrollX) >= textView.getText().length()) {
                if (valueOf == null || valueOf.intValue() != 1 || (aVar = this.f192746a) == null) {
                    return false;
                }
                aVar.invoke();
                return false;
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
