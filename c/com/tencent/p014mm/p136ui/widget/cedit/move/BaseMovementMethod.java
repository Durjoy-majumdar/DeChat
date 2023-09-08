package com.tencent.p014mm.p136ui.widget.cedit.move;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView;
import mo3.C109633a;
import mo3.C109634b;
import no3.C109755b;

/* renamed from: com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod */
public class BaseMovementMethod implements C109633a {
    private int getBottomLine(CustomTextView customTextView) {
        return customTextView.getLayout().getLineForVertical(customTextView.getScrollY() + getInnerHeight(customTextView));
    }

    private int getCharacterWidth(CustomTextView customTextView) {
        return (int) Math.ceil((double) customTextView.getPaint().getFontSpacing());
    }

    private int getInnerHeight(CustomTextView customTextView) {
        return (customTextView.getHeight() - customTextView.getTotalPaddingTop()) - customTextView.getTotalPaddingBottom();
    }

    private int getInnerWidth(CustomTextView customTextView) {
        return (customTextView.getWidth() - customTextView.getTotalPaddingLeft()) - customTextView.getTotalPaddingRight();
    }

    private int getScrollBoundsLeft(CustomTextView customTextView) {
        Layout layout = customTextView.getLayout();
        int topLine = getTopLine(customTextView);
        int bottomLine = getBottomLine(customTextView);
        if (topLine > bottomLine) {
            return 0;
        }
        int i = Integer.MAX_VALUE;
        while (topLine <= bottomLine) {
            int floor = (int) Math.floor((double) layout.getLineLeft(topLine));
            if (floor < i) {
                i = floor;
            }
            topLine++;
        }
        return i;
    }

    private int getScrollBoundsRight(CustomTextView customTextView) {
        Layout layout = customTextView.getLayout();
        int topLine = getTopLine(customTextView);
        int bottomLine = getBottomLine(customTextView);
        if (topLine > bottomLine) {
            return 0;
        }
        int i = Integer.MIN_VALUE;
        while (topLine <= bottomLine) {
            int ceil = (int) Math.ceil((double) layout.getLineRight(topLine));
            if (ceil > i) {
                i = ceil;
            }
            topLine++;
        }
        return i;
    }

    private int getTopLine(CustomTextView customTextView) {
        return customTextView.getLayout().getLineForVertical(customTextView.getScrollY());
    }

    public boolean bottom(CustomTextView customTextView, Spannable spannable) {
        return false;
    }

    public boolean canSelectArbitrarily() {
        return false;
    }

    public boolean down(CustomTextView customTextView, Spannable spannable) {
        return false;
    }

    public boolean end(CustomTextView customTextView, Spannable spannable) {
        return false;
    }

    public int getMovementMetaState(Spannable spannable, KeyEvent keyEvent) {
        return KeyEvent.normalizeMetaState(MetaKeyKeyListener.getMetaState(spannable, keyEvent) & -1537) & -194;
    }

    public boolean handleMovementKey(CustomTextView customTextView, Spannable spannable, int i, int i2, KeyEvent keyEvent) {
        if (i != 92) {
            if (i != 93) {
                if (i != 122) {
                    if (i != 123) {
                        switch (i) {
                            case 19:
                                if (KeyEvent.metaStateHasNoModifiers(i2)) {
                                    return mo154408up(customTextView, spannable);
                                }
                                if (KeyEvent.metaStateHasModifiers(i2, 2)) {
                                    return top(customTextView, spannable);
                                }
                                return false;
                            case 20:
                                if (KeyEvent.metaStateHasNoModifiers(i2)) {
                                    return down(customTextView, spannable);
                                }
                                if (KeyEvent.metaStateHasModifiers(i2, 2)) {
                                    return bottom(customTextView, spannable);
                                }
                                return false;
                            case 21:
                                if (KeyEvent.metaStateHasNoModifiers(i2)) {
                                    return left(customTextView, spannable);
                                }
                                if (KeyEvent.metaStateHasModifiers(i2, 4096)) {
                                    return leftWord(customTextView, spannable);
                                }
                                if (KeyEvent.metaStateHasModifiers(i2, 2)) {
                                    return lineStart(customTextView, spannable);
                                }
                                return false;
                            case 22:
                                if (KeyEvent.metaStateHasNoModifiers(i2)) {
                                    return right(customTextView, spannable);
                                }
                                if (KeyEvent.metaStateHasModifiers(i2, 4096)) {
                                    return rightWord(customTextView, spannable);
                                }
                                if (KeyEvent.metaStateHasModifiers(i2, 2)) {
                                    return lineEnd(customTextView, spannable);
                                }
                                return false;
                            default:
                                return false;
                        }
                    } else if (KeyEvent.metaStateHasNoModifiers(i2)) {
                        return end(customTextView, spannable);
                    } else {
                        if (KeyEvent.metaStateHasModifiers(i2, 4096)) {
                            return bottom(customTextView, spannable);
                        }
                        return false;
                    }
                } else if (KeyEvent.metaStateHasNoModifiers(i2)) {
                    return home(customTextView, spannable);
                } else {
                    if (KeyEvent.metaStateHasModifiers(i2, 4096)) {
                        return top(customTextView, spannable);
                    }
                    return false;
                }
            } else if (KeyEvent.metaStateHasNoModifiers(i2)) {
                return pageDown(customTextView, spannable);
            } else {
                if (KeyEvent.metaStateHasModifiers(i2, 2)) {
                    return bottom(customTextView, spannable);
                }
                return false;
            }
        } else if (KeyEvent.metaStateHasNoModifiers(i2)) {
            return pageUp(customTextView, spannable);
        } else {
            if (KeyEvent.metaStateHasModifiers(i2, 2)) {
                return top(customTextView, spannable);
            }
            return false;
        }
    }

    public boolean home(CustomTextView customTextView, Spannable spannable) {
        return false;
    }

    public void initialize(CustomTextView customTextView, Spannable spannable) {
    }

    public boolean left(CustomTextView customTextView, Spannable spannable) {
        return false;
    }

    public boolean leftWord(CustomTextView customTextView, Spannable spannable) {
        return false;
    }

    public boolean lineEnd(CustomTextView customTextView, Spannable spannable) {
        return false;
    }

    public boolean lineStart(CustomTextView customTextView, Spannable spannable) {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onGenericMotionEvent(com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView r7, android.text.Spannable r8, android.view.MotionEvent r9) {
        /*
            r6 = this;
            int r0 = r9.getSource()
            r0 = r0 & 2
            r1 = 0
            if (r0 == 0) goto L_0x006e
            int r0 = r9.getAction()
            r2 = 8
            if (r0 == r2) goto L_0x0012
            goto L_0x006e
        L_0x0012:
            int r0 = r9.getMetaState()
            r0 = r0 & 1
            r2 = 9
            r3 = 0
            if (r0 == 0) goto L_0x0023
            float r9 = r9.getAxisValue(r2)
            r0 = 0
            goto L_0x002e
        L_0x0023:
            float r0 = r9.getAxisValue(r2)
            float r0 = -r0
            r2 = 10
            float r9 = r9.getAxisValue(r2)
        L_0x002e:
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x003f
            float r9 = -r9
            double r4 = (double) r9
            double r4 = java.lang.Math.ceil(r4)
            int r9 = (int) r4
            boolean r9 = r6.scrollLeft(r7, r8, r9)
        L_0x003d:
            r1 = r1 | r9
            goto L_0x004e
        L_0x003f:
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x004e
            double r4 = (double) r9
            double r4 = java.lang.Math.ceil(r4)
            int r9 = (int) r4
            boolean r9 = r6.scrollRight(r7, r8, r9)
            goto L_0x003d
        L_0x004e:
            int r9 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r9 >= 0) goto L_0x005f
            float r9 = -r0
            double r2 = (double) r9
            double r2 = java.lang.Math.ceil(r2)
            int r9 = (int) r2
            boolean r7 = r6.scrollUp(r7, r8, r9)
        L_0x005d:
            r1 = r1 | r7
            goto L_0x006e
        L_0x005f:
            int r9 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r9 <= 0) goto L_0x006e
            double r2 = (double) r0
            double r2 = java.lang.Math.ceil(r2)
            int r9 = (int) r2
            boolean r7 = r6.scrollDown(r7, r8, r9)
            goto L_0x005d
        L_0x006e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.move.BaseMovementMethod.onGenericMotionEvent(com.tencent.mm.ui.widget.cedit.edit.CustomTextView, android.text.Spannable, android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(CustomTextView customTextView, Spannable spannable, int i, KeyEvent keyEvent) {
        boolean handleMovementKey = handleMovementKey(customTextView, spannable, i, getMovementMetaState(spannable, keyEvent), keyEvent);
        if (handleMovementKey) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(spannable);
            C109755b.m149078a(spannable);
        }
        return handleMovementKey;
    }

    public boolean onKeyOther(CustomTextView customTextView, Spannable spannable, KeyEvent keyEvent) {
        int movementMetaState = getMovementMetaState(spannable, keyEvent);
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 0 || keyEvent.getAction() != 2) {
            return false;
        }
        int repeatCount = keyEvent.getRepeatCount();
        int i = 0;
        boolean z = false;
        while (i < repeatCount && handleMovementKey(customTextView, spannable, keyCode, movementMetaState, keyEvent)) {
            i++;
            z = true;
        }
        if (z) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(spannable);
            C109755b.m149078a(spannable);
        }
        return z;
    }

    public boolean onKeyUp(CustomTextView customTextView, Spannable spannable, int i, KeyEvent keyEvent) {
        return false;
    }

    public void onTakeFocus(CustomTextView customTextView, Spannable spannable, int i) {
    }

    public boolean onTouchEvent(CustomTextView customTextView, Spannable spannable, MotionEvent motionEvent) {
        return false;
    }

    public boolean onTrackballEvent(CustomTextView customTextView, Spannable spannable, MotionEvent motionEvent) {
        return false;
    }

    public boolean pageDown(CustomTextView customTextView, Spannable spannable) {
        return false;
    }

    public boolean pageUp(CustomTextView customTextView, Spannable spannable) {
        return false;
    }

    public boolean right(CustomTextView customTextView, Spannable spannable) {
        return false;
    }

    public boolean rightWord(CustomTextView customTextView, Spannable spannable) {
        return false;
    }

    public boolean scrollBottom(CustomTextView customTextView, Spannable spannable) {
        Layout layout = customTextView.getLayout();
        int lineCount = layout.getLineCount();
        if (getBottomLine(customTextView) > lineCount - 1) {
            return false;
        }
        C109634b.m148944b(customTextView, layout, customTextView.getScrollX(), layout.getLineTop(lineCount) - getInnerHeight(customTextView));
        return true;
    }

    public boolean scrollDown(CustomTextView customTextView, Spannable spannable, int i) {
        Layout layout = customTextView.getLayout();
        int innerHeight = getInnerHeight(customTextView);
        int scrollY = customTextView.getScrollY() + innerHeight;
        int lineForVertical = layout.getLineForVertical(scrollY);
        int i2 = lineForVertical + 1;
        if (layout.getLineTop(i2) < scrollY + 1) {
            lineForVertical = i2;
        }
        int lineCount = layout.getLineCount() - 1;
        if (lineForVertical > lineCount) {
            return false;
        }
        C109634b.m148944b(customTextView, layout, customTextView.getScrollX(), layout.getLineTop(Math.min((lineForVertical + i) - 1, lineCount) + 1) - innerHeight);
        return true;
    }

    public boolean scrollLeft(CustomTextView customTextView, Spannable spannable, int i) {
        int scrollBoundsLeft = getScrollBoundsLeft(customTextView);
        int scrollX = customTextView.getScrollX();
        if (scrollX <= scrollBoundsLeft) {
            return false;
        }
        customTextView.scrollTo(Math.max(scrollX - (getCharacterWidth(customTextView) * i), scrollBoundsLeft), customTextView.getScrollY());
        return true;
    }

    public boolean scrollLineEnd(CustomTextView customTextView, Spannable spannable) {
        int scrollBoundsRight = getScrollBoundsRight(customTextView) - getInnerWidth(customTextView);
        if (customTextView.getScrollX() >= scrollBoundsRight) {
            return false;
        }
        customTextView.scrollTo(scrollBoundsRight, customTextView.getScrollY());
        return true;
    }

    public boolean scrollLineStart(CustomTextView customTextView, Spannable spannable) {
        int scrollBoundsLeft = getScrollBoundsLeft(customTextView);
        if (customTextView.getScrollX() <= scrollBoundsLeft) {
            return false;
        }
        customTextView.scrollTo(scrollBoundsLeft, customTextView.getScrollY());
        return true;
    }

    public boolean scrollPageDown(CustomTextView customTextView, Spannable spannable) {
        Layout layout = customTextView.getLayout();
        int innerHeight = getInnerHeight(customTextView);
        int lineForVertical = layout.getLineForVertical(customTextView.getScrollY() + innerHeight + innerHeight);
        if (lineForVertical > layout.getLineCount() - 1) {
            return false;
        }
        C109634b.m148944b(customTextView, layout, customTextView.getScrollX(), layout.getLineTop(lineForVertical + 1) - innerHeight);
        return true;
    }

    public boolean scrollPageUp(CustomTextView customTextView, Spannable spannable) {
        Layout layout = customTextView.getLayout();
        int lineForVertical = layout.getLineForVertical(customTextView.getScrollY() - getInnerHeight(customTextView));
        if (lineForVertical < 0) {
            return false;
        }
        C109634b.m148944b(customTextView, layout, customTextView.getScrollX(), layout.getLineTop(lineForVertical));
        return true;
    }

    public boolean scrollRight(CustomTextView customTextView, Spannable spannable, int i) {
        int scrollBoundsRight = getScrollBoundsRight(customTextView) - getInnerWidth(customTextView);
        int scrollX = customTextView.getScrollX();
        if (scrollX >= scrollBoundsRight) {
            return false;
        }
        customTextView.scrollTo(Math.min(scrollX + (getCharacterWidth(customTextView) * i), scrollBoundsRight), customTextView.getScrollY());
        return true;
    }

    public boolean scrollTop(CustomTextView customTextView, Spannable spannable) {
        Layout layout = customTextView.getLayout();
        if (getTopLine(customTextView) < 0) {
            return false;
        }
        C109634b.m148944b(customTextView, layout, customTextView.getScrollX(), layout.getLineTop(0));
        return true;
    }

    public boolean scrollUp(CustomTextView customTextView, Spannable spannable, int i) {
        Layout layout = customTextView.getLayout();
        int scrollY = customTextView.getScrollY();
        int lineForVertical = layout.getLineForVertical(scrollY);
        if (layout.getLineTop(lineForVertical) == scrollY) {
            lineForVertical--;
        }
        if (lineForVertical < 0) {
            return false;
        }
        C109634b.m148944b(customTextView, layout, customTextView.getScrollX(), layout.getLineTop(Math.max((lineForVertical - i) + 1, 0)));
        return true;
    }

    public boolean top(CustomTextView customTextView, Spannable spannable) {
        return false;
    }

    /* renamed from: up */
    public boolean mo154408up(CustomTextView customTextView, Spannable spannable) {
        return false;
    }
}
