package er1;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import de3.C75359b0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: er1.c4 */
public final class C75652c4 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ View f222238d;

    public C75652c4(View view) {
        this.f222238d = view;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Spannable spannable;
        ClickableSpan[] clickableSpanArr;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/utils/FinderUtil$getSpanTouchListener$touchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        C87412m.m108592e(view, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) view;
        if (textView.getText() instanceof Spannable) {
            CharSequence text = textView.getText();
            C87412m.m108592e(text, "null cannot be cast to non-null type android.text.Spannable");
            spannable = (Spannable) text;
        } else {
            spannable = new SpannableString(textView.getText());
        }
        boolean z = false;
        if ((action == 1 || action == 3) && (clickableSpanArr = (ClickableSpan[]) spannable.getSpans(0, spannable.length(), ClickableSpan.class)) != null) {
            View view2 = this.f222238d;
            for (ClickableSpan clickableSpan : clickableSpanArr) {
                if (clickableSpan instanceof C75359b0) {
                    ((C75359b0) clickableSpan).setIsPressed(false);
                    view2.invalidate();
                }
            }
        }
        if (action == 0 || action == 1) {
            int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
            int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
            int scrollX = x + textView.getScrollX();
            int scrollY = y + textView.getScrollY();
            Layout layout = textView.getLayout();
            int lineForVertical = layout.getLineForVertical(scrollY);
            float f = (float) scrollX;
            int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
            ClickableSpan[] clickableSpanArr2 = f > layout.getLineWidth(lineForVertical) ? null : (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr2 == null || clickableSpanArr2.length <= 0) {
                Selection.removeSelection(spannable);
            } else {
                ClickableSpan clickableSpan2 = clickableSpanArr2[0];
                if (action == 0) {
                    if (clickableSpan2 instanceof C75359b0) {
                        ((C75359b0) clickableSpan2).setIsPressed(true);
                        this.f222238d.invalidate();
                    }
                    Selection.setSelection(spannable, spannable.getSpanStart(clickableSpan2), spannable.getSpanEnd(clickableSpan2));
                } else if (action == 1) {
                    clickableSpan2.onClick(textView);
                }
                z = true;
            }
        }
        Log.m105924i(C58784w3.f168296b, "touch " + motionEvent.getX() + ", " + motionEvent.getY() + ", ret:" + z);
        C117292a.m165362h(z, this, "com/tencent/mm/plugin/finder/utils/FinderUtil$getSpanTouchListener$touchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z;
    }
}
