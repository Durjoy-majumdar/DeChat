package de3;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: de3.n */
public final class C75368n implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ Spannable f221583d;

    /* renamed from: e */
    public final /* synthetic */ TextView f221584e;

    public C75368n(Spannable spannable, TextView textView) {
        this.f221583d = spannable;
        this.f221584e = textView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ClickableSpan[] clickableSpanArr;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/span/MMLinkSpanLogic$Companion$setSpanTouch$touchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        C87412m.m108592e(view, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) view;
        Spannable spannable = this.f221583d;
        boolean z = false;
        if ((action == 1 || action == 3) && (clickableSpanArr = (ClickableSpan[]) spannable.getSpans(0, spannable.length(), ClickableSpan.class)) != null) {
            TextView textView2 = this.f221584e;
            for (ClickableSpan clickableSpan : clickableSpanArr) {
                if (clickableSpan instanceof C75359b0) {
                    ((C75359b0) clickableSpan).setIsPressed(false);
                    textView2.invalidate();
                }
            }
        }
        if (action == 0 || action == 1) {
            int x = ((int) motionEvent.getX()) - textView.getPaddingLeft();
            int y = ((int) motionEvent.getY()) - textView.getPaddingTop();
            int scrollX = x + textView.getScrollX();
            int scrollY = y + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), (float) scrollX);
            ClickableSpan[] clickableSpanArr2 = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr2.length != 0) {
                ClickableSpan clickableSpan2 = clickableSpanArr2[0];
                if (action == 0) {
                    if (clickableSpan2 instanceof C75359b0) {
                        ((C75359b0) clickableSpan2).setIsPressed(true);
                        this.f221584e.invalidate();
                    }
                    Selection.setSelection(spannable, spannable.getSpanStart(clickableSpan2), spannable.getSpanEnd(clickableSpan2));
                } else if (action == 1) {
                    clickableSpan2.onClick(textView);
                }
                z = true;
            } else {
                Selection.removeSelection(spannable);
            }
        }
        Log.m105924i("MicroMSg.MMLinkSpanTextView", "touch " + motionEvent.getX() + ", " + motionEvent.getY() + ", ret:" + z);
        C117292a.m165362h(z, this, "com/tencent/mm/pluginsdk/ui/span/MMLinkSpanLogic$Companion$setSpanTouch$touchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z;
    }
}