package com.tencent.p014mm.p136ui.widget.cedit.move;

import android.text.Layout;
import android.text.Spannable;
import android.view.MotionEvent;
import com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView;
import mo3.C109633a;
import mo3.C109634b;

/* renamed from: com.tencent.mm.ui.widget.cedit.move.ScrollingMovementMethod */
public class ScrollingMovementMethod extends BaseMovementMethod {
    private static ScrollingMovementMethod sInstance;

    public static C109633a getInstance() {
        if (sInstance == null) {
            sInstance = new ScrollingMovementMethod();
        }
        return sInstance;
    }

    public boolean bottom(CustomTextView customTextView, Spannable spannable) {
        return scrollBottom(customTextView, spannable);
    }

    public boolean down(CustomTextView customTextView, Spannable spannable) {
        return scrollDown(customTextView, spannable, 1);
    }

    public boolean end(CustomTextView customTextView, Spannable spannable) {
        return bottom(customTextView, spannable);
    }

    public boolean home(CustomTextView customTextView, Spannable spannable) {
        return top(customTextView, spannable);
    }

    public boolean left(CustomTextView customTextView, Spannable spannable) {
        return scrollLeft(customTextView, spannable, 1);
    }

    public boolean lineEnd(CustomTextView customTextView, Spannable spannable) {
        return scrollLineEnd(customTextView, spannable);
    }

    public boolean lineStart(CustomTextView customTextView, Spannable spannable) {
        return scrollLineStart(customTextView, spannable);
    }

    public void onTakeFocus(CustomTextView customTextView, Spannable spannable, int i) {
        Layout layout = customTextView.getLayout();
        if (!(layout == null || (i & 2) == 0)) {
            customTextView.scrollTo(customTextView.getScrollX(), layout.getLineTop(0));
        }
        if (layout != null && (i & 1) != 0) {
            customTextView.scrollTo(customTextView.getScrollX(), layout.getLineTop((layout.getLineCount() - 1) + 1) - (customTextView.getHeight() - (customTextView.getTotalPaddingTop() + customTextView.getTotalPaddingBottom())));
        }
    }

    public boolean onTouchEvent(CustomTextView customTextView, Spannable spannable, MotionEvent motionEvent) {
        return C109634b.m148943a(customTextView, spannable, motionEvent);
    }

    public boolean pageDown(CustomTextView customTextView, Spannable spannable) {
        return scrollPageDown(customTextView, spannable);
    }

    public boolean pageUp(CustomTextView customTextView, Spannable spannable) {
        return scrollPageUp(customTextView, spannable);
    }

    public boolean right(CustomTextView customTextView, Spannable spannable) {
        return scrollRight(customTextView, spannable, 1);
    }

    public boolean top(CustomTextView customTextView, Spannable spannable) {
        return scrollTop(customTextView, spannable);
    }

    /* renamed from: up */
    public boolean mo154408up(CustomTextView customTextView, Spannable spannable) {
        return scrollUp(customTextView, spannable, 1);
    }
}
