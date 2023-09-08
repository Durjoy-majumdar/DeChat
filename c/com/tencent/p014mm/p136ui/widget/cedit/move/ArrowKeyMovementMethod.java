package com.tencent.p014mm.p136ui.widget.cedit.move;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a;
import com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView;
import mo3.C109633a;
import mo3.C109634b;
import no3.C109755b;

/* renamed from: com.tencent.mm.ui.widget.cedit.move.ArrowKeyMovementMethod */
public class ArrowKeyMovementMethod extends BaseMovementMethod {
    private static final Object LAST_TAP_DOWN = new Object();
    private static final String TAG = "cmEdit.ArrowKeyMovementMethod";
    private static ArrowKeyMovementMethod sInstance;

    private static int getCurrentLineTop(Spannable spannable, Layout layout) {
        return layout.getLineTop(layout.getLineForOffset(Selection.getSelectionEnd(spannable)));
    }

    public static C109633a getInstance() {
        if (sInstance == null) {
            sInstance = new ArrowKeyMovementMethod();
        }
        return sInstance;
    }

    private static int getPageHeight(CustomTextView customTextView) {
        Rect rect = new Rect();
        if (customTextView.getGlobalVisibleRect(rect)) {
            return rect.height();
        }
        return 0;
    }

    private static boolean isSelecting(Spannable spannable) {
        return MetaKeyKeyListener.getMetaState(spannable, 1) == 1 || MetaKeyKeyListener.getMetaState(spannable, 2048) != 0;
    }

    public boolean bottom(CustomTextView customTextView, Spannable spannable) {
        if (isSelecting(spannable)) {
            Selection.extendSelection(spannable, spannable.length());
            return true;
        }
        Selection.setSelection(spannable, spannable.length());
        return true;
    }

    public boolean canSelectArbitrarily() {
        return true;
    }

    public boolean down(CustomTextView customTextView, Spannable spannable) {
        Layout layout = customTextView.getLayout();
        return isSelecting(spannable) ? Selection.extendDown(spannable, layout) : Selection.moveDown(spannable, layout);
    }

    public boolean end(CustomTextView customTextView, Spannable spannable) {
        return lineEnd(customTextView, spannable);
    }

    public boolean handleMovementKey(CustomTextView customTextView, Spannable spannable, int i, int i2, KeyEvent keyEvent) {
        return (i == 23 && KeyEvent.metaStateHasNoModifiers(i2) && keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0 && MetaKeyKeyListener.getMetaState(spannable, 2048, keyEvent) != 0) ? customTextView.showContextMenu() : super.handleMovementKey(customTextView, spannable, i, i2, keyEvent);
    }

    public boolean home(CustomTextView customTextView, Spannable spannable) {
        return lineStart(customTextView, spannable);
    }

    public void initialize(CustomTextView customTextView, Spannable spannable) {
        Selection.setSelection(spannable, 0);
    }

    public boolean left(CustomTextView customTextView, Spannable spannable) {
        Layout layout = customTextView.getLayout();
        return isSelecting(spannable) ? Selection.extendLeft(spannable, layout) : Selection.moveLeft(spannable, layout);
    }

    public boolean leftWord(CustomTextView customTextView, Spannable spannable) {
        return false;
    }

    public boolean lineEnd(CustomTextView customTextView, Spannable spannable) {
        Layout layout = customTextView.getLayout();
        return isSelecting(spannable) ? Selection.extendToRightEdge(spannable, layout) : Selection.moveToRightEdge(spannable, layout);
    }

    public boolean lineStart(CustomTextView customTextView, Spannable spannable) {
        Layout layout = customTextView.getLayout();
        return isSelecting(spannable) ? Selection.extendToLeftEdge(spannable, layout) : Selection.moveToLeftEdge(spannable, layout);
    }

    public void onTakeFocus(CustomTextView customTextView, Spannable spannable, int i) {
        if ((i & 130) == 0) {
            Selection.setSelection(spannable, spannable.length());
        } else if (customTextView.getLayout() == null) {
            Selection.setSelection(spannable, spannable.length());
        }
    }

    public boolean onTouchEvent(CustomTextView customTextView, Spannable spannable, MotionEvent motionEvent) {
        int i;
        int selectionStart;
        int action = motionEvent.getAction();
        boolean z = false;
        int i2 = -1;
        if (action == 1) {
            C109634b.C109635a[] aVarArr = (C109634b.C109635a[]) spannable.getSpans(0, spannable.length(), C109634b.C109635a.class);
            i = aVarArr.length > 0 ? aVarArr[0].f328228f : -1;
            C109634b.C109635a[] aVarArr2 = (C109634b.C109635a[]) spannable.getSpans(0, spannable.length(), C109634b.C109635a.class);
            if (aVarArr2.length > 0) {
                i2 = aVarArr2[0].f328229g;
            }
        } else {
            i = -1;
        }
        boolean isSelecting = isSelecting(spannable);
        boolean a = C109634b.m148943a(customTextView, spannable, motionEvent);
        C106778a aVar = customTextView.f319246B1;
        if (aVar != null && aVar.f319403n) {
            z = true;
        }
        if (z) {
            return a;
        }
        if (action == 0) {
            if (!isSelecting(spannable) || (!customTextView.isFocused() && !customTextView.requestFocus())) {
                return a;
            }
            int J = customTextView.mo153976J(motionEvent.getX(), motionEvent.getY());
            spannable.setSpan(LAST_TAP_DOWN, J, J, 34);
            customTextView.getParent().requestDisallowInterceptTouchEvent(true);
        } else if (customTextView.isFocused()) {
            if (action == 2) {
                if (isSelecting(spannable) && a) {
                    int spanStart = spannable.getSpanStart(LAST_TAP_DOWN);
                    customTextView.cancelLongPress();
                    int J2 = customTextView.mo153976J(motionEvent.getX(), motionEvent.getY());
                    Selection.setSelection(spannable, Math.min(spanStart, J2), Math.max(spanStart, J2));
                    return true;
                }
            } else if (action == 1) {
                if ((i2 < 0 || i2 == customTextView.getScrollY()) && (i < 0 || i == customTextView.getScrollX())) {
                    if (isSelecting) {
                        Object obj = LAST_TAP_DOWN;
                        int spanStart2 = spannable.getSpanStart(obj);
                        int J3 = customTextView.mo153976J(motionEvent.getX(), motionEvent.getY());
                        Selection.setSelection(spannable, Math.min(spanStart2, J3), Math.max(spanStart2, J3));
                        spannable.removeSpan(obj);
                    }
                    MetaKeyKeyListener.adjustMetaAfterKeypress(spannable);
                    C109755b.m149078a(spannable);
                    return true;
                }
                if ((customTextView.f319243A instanceof Spannable) && (selectionStart = customTextView.getSelectionStart()) == customTextView.getSelectionEnd()) {
                    int lineForOffset = customTextView.f319264M.getLineForOffset(selectionStart);
                    int lineTop = customTextView.f319264M.getLineTop(lineForOffset);
                    int lineTop2 = customTextView.f319264M.getLineTop(lineForOffset + 1);
                    int bottom = ((customTextView.getBottom() - customTextView.getTop()) - customTextView.getExtendedPaddingTop()) - customTextView.getExtendedPaddingBottom();
                    int i3 = lineTop2 - lineTop;
                    int i4 = i3 / 2;
                    int i5 = bottom / 4;
                    if (i4 > i5) {
                        i4 = i5;
                    }
                    int scrollY = customTextView.getScrollY();
                    int i6 = scrollY + i4;
                    if (lineTop < i6) {
                        lineForOffset = customTextView.f319264M.getLineForVertical(i6 + i3);
                    } else {
                        int i7 = (bottom + scrollY) - i4;
                        if (lineTop2 > i7) {
                            lineForOffset = customTextView.f319264M.getLineForVertical(i7 - i3);
                        }
                    }
                    int right = ((customTextView.getRight() - customTextView.getLeft()) - customTextView.getCompoundPaddingLeft()) - customTextView.getCompoundPaddingRight();
                    int scrollX = customTextView.getScrollX();
                    int offsetForHorizontal = customTextView.f319264M.getOffsetForHorizontal(lineForOffset, (float) scrollX);
                    int offsetForHorizontal2 = customTextView.f319264M.getOffsetForHorizontal(lineForOffset, (float) (right + scrollX));
                    int i8 = offsetForHorizontal < offsetForHorizontal2 ? offsetForHorizontal : offsetForHorizontal2;
                    if (offsetForHorizontal <= offsetForHorizontal2) {
                        offsetForHorizontal = offsetForHorizontal2;
                    }
                    if (selectionStart >= i8) {
                        i8 = selectionStart > offsetForHorizontal ? offsetForHorizontal : selectionStart;
                    }
                    if (i8 != selectionStart) {
                        Selection.setSelection(customTextView.f319245B, i8);
                    }
                }
                return true;
            }
        }
        return a;
    }

    public boolean pageDown(CustomTextView customTextView, Spannable spannable) {
        Layout layout = customTextView.getLayout();
        boolean isSelecting = isSelecting(spannable);
        int currentLineTop = getCurrentLineTop(spannable, layout) + getPageHeight(customTextView);
        boolean z = false;
        do {
            int selectionEnd = Selection.getSelectionEnd(spannable);
            if (isSelecting) {
                Selection.extendDown(spannable, layout);
            } else {
                Selection.moveDown(spannable, layout);
            }
            if (Selection.getSelectionEnd(spannable) == selectionEnd) {
                break;
            }
            z = true;
        } while (getCurrentLineTop(spannable, layout) < currentLineTop);
        return z;
    }

    public boolean pageUp(CustomTextView customTextView, Spannable spannable) {
        Layout layout = customTextView.getLayout();
        boolean isSelecting = isSelecting(spannable);
        int currentLineTop = getCurrentLineTop(spannable, layout) - getPageHeight(customTextView);
        boolean z = false;
        do {
            int selectionEnd = Selection.getSelectionEnd(spannable);
            if (isSelecting) {
                Selection.extendUp(spannable, layout);
            } else {
                Selection.moveUp(spannable, layout);
            }
            if (Selection.getSelectionEnd(spannable) == selectionEnd) {
                break;
            }
            z = true;
        } while (getCurrentLineTop(spannable, layout) > currentLineTop);
        return z;
    }

    public boolean right(CustomTextView customTextView, Spannable spannable) {
        Layout layout = customTextView.getLayout();
        return isSelecting(spannable) ? Selection.extendRight(spannable, layout) : Selection.moveRight(spannable, layout);
    }

    public boolean rightWord(CustomTextView customTextView, Spannable spannable) {
        return false;
    }

    public boolean top(CustomTextView customTextView, Spannable spannable) {
        if (isSelecting(spannable)) {
            Selection.extendSelection(spannable, 0);
            return true;
        }
        Selection.setSelection(spannable, 0);
        return true;
    }

    /* renamed from: up */
    public boolean mo154408up(CustomTextView customTextView, Spannable spannable) {
        Layout layout = customTextView.getLayout();
        return isSelecting(spannable) ? Selection.extendUp(spannable, layout) : Selection.moveUp(spannable, layout);
    }
}
