package com.tencent.p014mm.plugin.wallet_core.utils;

import android.text.Layout;
import android.text.SpannedString;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.wallet_core.utils.f0 */
public class C72499f0 implements View.OnTouchListener {
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View view2 = view;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_core/utils/WcPayViewEngineRender$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        TextView textView = (TextView) view2;
        CharSequence text = textView.getText();
        if (!(text instanceof SpannedString) || !(action == 1 || action == 0)) {
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/wallet_core/utils/WcPayViewEngineRender$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
        int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
        int scrollX = x + textView.getScrollX();
        int scrollY = y + textView.getScrollY();
        Layout layout = textView.getLayout();
        int lineForVertical = layout.getLineForVertical(scrollY);
        float f = (float) scrollX;
        if (f > layout.getLineWidth(lineForVertical)) {
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/wallet_core/utils/WcPayViewEngineRender$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((SpannedString) text).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        if (clickableSpanArr.length == 0) {
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/wallet_core/utils/WcPayViewEngineRender$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        } else if (action == 0) {
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/wallet_core/utils/WcPayViewEngineRender$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        } else {
            clickableSpanArr[0].onClick(textView);
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/wallet_core/utils/WcPayViewEngineRender$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }
}
