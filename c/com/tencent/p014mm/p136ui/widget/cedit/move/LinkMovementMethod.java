package com.tencent.p014mm.p136ui.widget.cedit.move;

import android.os.Build;
import android.text.Layout;
import android.text.NoCopySpan;
import android.text.Selection;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.textclassifier.TextLinks;
import com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a;
import com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView;
import mo3.C109633a;

/* renamed from: com.tencent.mm.ui.widget.cedit.move.LinkMovementMethod */
public class LinkMovementMethod extends ScrollingMovementMethod {
    private static final int CLICK = 1;
    private static final int DOWN = 3;
    private static Object FROM_BELOW = new NoCopySpan.Concrete();
    private static final int HIDE_FLOATING_TOOLBAR_DELAY_MS = 200;

    /* renamed from: UP */
    private static final int f319536UP = 2;
    private static LinkMovementMethod sInstance;
    private String TAG = "cmEdit.LinkMovementMethod";

    private boolean action(int i, CustomTextView customTextView, Spannable spannable) {
        Layout layout = customTextView.getLayout();
        int totalPaddingTop = customTextView.getTotalPaddingTop() + customTextView.getTotalPaddingBottom();
        int scrollY = customTextView.getScrollY();
        int height = (customTextView.getHeight() + scrollY) - totalPaddingTop;
        int lineForVertical = layout.getLineForVertical(scrollY);
        int lineForVertical2 = layout.getLineForVertical(height);
        int lineStart = layout.getLineStart(lineForVertical);
        int lineEnd = layout.getLineEnd(lineForVertical2);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(lineStart, lineEnd, ClickableSpan.class);
        int selectionStart = Selection.getSelectionStart(spannable);
        int selectionEnd = Selection.getSelectionEnd(spannable);
        int min = Math.min(selectionStart, selectionEnd);
        int max = Math.max(selectionStart, selectionEnd);
        if (min < 0 && spannable.getSpanStart(FROM_BELOW) >= 0) {
            min = spannable.length();
            max = min;
        }
        if (min > lineEnd) {
            max = Integer.MAX_VALUE;
            min = Integer.MAX_VALUE;
        }
        int i2 = -1;
        if (max < lineStart) {
            max = -1;
            min = -1;
        }
        if (i != 1) {
            if (i == 2) {
                int i3 = -1;
                for (int i4 = 0; i4 < clickableSpanArr.length; i4++) {
                    int spanEnd = spannable.getSpanEnd(clickableSpanArr[i4]);
                    if ((spanEnd < max || min == max) && spanEnd > i3) {
                        i2 = spannable.getSpanStart(clickableSpanArr[i4]);
                        i3 = spanEnd;
                    }
                }
                if (i2 >= 0) {
                    Selection.setSelection(spannable, i3, i2);
                    return true;
                }
            } else if (i == 3) {
                int i5 = Integer.MAX_VALUE;
                int i6 = Integer.MAX_VALUE;
                for (int i7 = 0; i7 < clickableSpanArr.length; i7++) {
                    int spanStart = spannable.getSpanStart(clickableSpanArr[i7]);
                    if ((spanStart > min || min == max) && spanStart < i6) {
                        i5 = spannable.getSpanEnd(clickableSpanArr[i7]);
                        i6 = spanStart;
                    }
                }
                if (i5 < Integer.MAX_VALUE) {
                    Selection.setSelection(spannable, i6, i5);
                    return true;
                }
            }
        } else if (min == max) {
            return false;
        } else {
            ClickableSpan[] clickableSpanArr2 = (ClickableSpan[]) spannable.getSpans(min, max, ClickableSpan.class);
            if (clickableSpanArr2.length != 1) {
                return false;
            }
            ClickableSpan clickableSpan = clickableSpanArr2[0];
            if (Build.VERSION.SDK_INT >= 28) {
                if (clickableSpan instanceof TextLinks.TextLinkSpan) {
                    clickableSpan.onClick(customTextView);
                } else {
                    clickableSpan.onClick(customTextView);
                }
            }
        }
        return false;
    }

    public static C109633a getInstance() {
        if (sInstance == null) {
            sInstance = new LinkMovementMethod();
        }
        return sInstance;
    }

    public boolean canSelectArbitrarily() {
        return true;
    }

    public boolean down(CustomTextView customTextView, Spannable spannable) {
        if (action(3, customTextView, spannable)) {
            return true;
        }
        return super.down(customTextView, spannable);
    }

    public boolean handleMovementKey(CustomTextView customTextView, Spannable spannable, int i, int i2, KeyEvent keyEvent) {
        if ((i == 23 || i == 66) && KeyEvent.metaStateHasNoModifiers(i2) && keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0 && action(1, customTextView, spannable)) {
            return true;
        }
        return super.handleMovementKey(customTextView, spannable, i, i2, keyEvent);
    }

    public void initialize(CustomTextView customTextView, Spannable spannable) {
        Selection.removeSelection(spannable);
        spannable.removeSpan(FROM_BELOW);
    }

    public boolean left(CustomTextView customTextView, Spannable spannable) {
        if (action(2, customTextView, spannable)) {
            return true;
        }
        return super.left(customTextView, spannable);
    }

    public void onTakeFocus(CustomTextView customTextView, Spannable spannable, int i) {
        Selection.removeSelection(spannable);
        if ((i & 1) != 0) {
            spannable.setSpan(FROM_BELOW, 0, 0, 34);
        } else {
            spannable.removeSpan(FROM_BELOW);
        }
    }

    public boolean onTouchEvent(CustomTextView customTextView, Spannable spannable, MotionEvent motionEvent) {
        C106778a aVar;
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x = ((int) motionEvent.getX()) - customTextView.getTotalPaddingLeft();
            int y = ((int) motionEvent.getY()) - customTextView.getTotalPaddingTop();
            int scrollX = x + customTextView.getScrollX();
            int scrollY = y + customTextView.getScrollY();
            Layout layout = customTextView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), (float) scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                ClickableSpan clickableSpan = clickableSpanArr[0];
                if (action == 1) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        clickableSpan.onClick(customTextView);
                    }
                } else if (action == 0) {
                    if (customTextView.getContext().getApplicationInfo().targetSdkVersion >= 28 && (aVar = customTextView.f319246B1) != null) {
                        aVar.mo154314s(200);
                    }
                    Selection.setSelection(spannable, spannable.getSpanStart(clickableSpan), spannable.getSpanEnd(clickableSpan));
                }
                return true;
            }
            Selection.removeSelection(spannable);
        }
        return super.onTouchEvent(customTextView, spannable, motionEvent);
    }

    public boolean right(CustomTextView customTextView, Spannable spannable) {
        if (action(3, customTextView, spannable)) {
            return true;
        }
        return super.right(customTextView, spannable);
    }

    /* renamed from: up */
    public boolean mo154408up(CustomTextView customTextView, Spannable spannable) {
        if (action(2, customTextView, spannable)) {
            return true;
        }
        return super.mo154408up(customTextView, spannable);
    }
}
