package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import kg3.C76577a;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.q1 */
public class C72924q1 {
    /* renamed from: a */
    public static int m85520a(C72917n0 n0Var) {
        int i = 0;
        if (n0Var == null) {
            return 0;
        }
        int childCount = n0Var.getChildCount();
        int height = n0Var.getHeight() - n0Var.getPaddingBottom();
        View childAt = n0Var.getChildAt(childCount - 1);
        if (childAt != null) {
            i = childAt.getBottom();
        }
        return i - height;
    }

    /* renamed from: b */
    public static void m85521b(C72917n0 n0Var, int i, int i2, boolean z, boolean z2) {
        int i3;
        C72917n0 n0Var2 = n0Var;
        int i4 = i;
        if (n0Var2 != null) {
            if (!(n0Var.getFirstVisiblePosition() < i4 && i4 < n0Var.getLastVisiblePosition()) || !z2) {
                Log.m105925i("MicroMsg.ChattingUI.ScrollController", "setSelectionFromTop position22 %s smooth %s", Integer.valueOf(i), Boolean.valueOf(z));
                n0Var2.setItemChecked(i4, true);
                if (!z || !C11171e.m11046c(24) || m85522c(n0Var, i)) {
                    int i5 = i2;
                    if (Log.getLogLevel() <= 1) {
                        Log.m105919d("MicroMsg.ChattingUI.ScrollController", "[setSelectionFromTop] position:%s, y:%s", Integer.valueOf(i), Integer.valueOf(i2));
                    }
                    n0Var.setSelectionFromTop(i, i2);
                    return;
                }
                int lastVisiblePosition = n0Var.getLastVisiblePosition();
                int firstVisiblePosition = n0Var.getFirstVisiblePosition();
                int height = n0Var.getHeight();
                int c = height > 0 ? (int) ((((float) C76577a.m92152c(n0Var.getContext(), height)) / 712.0f) * 1800.0f) : 1800;
                if (i4 < firstVisiblePosition) {
                    c /= firstVisiblePosition - i4;
                } else if (i4 > lastVisiblePosition) {
                    c /= ((i4 - lastVisiblePosition) + 1) * 2;
                } else if (i4 == n0Var.mo81303l().getCount() - 1) {
                    int c2 = C76577a.m92152c(n0Var.getContext(), m85520a(n0Var));
                    boolean z3 = n0Var2 instanceof ScrollControlListView;
                    if (z3) {
                        i3 = C76577a.m92152c(n0Var.getContext(), ((ScrollControlListView) n0Var2).getExtraScrollDistance());
                        if (i3 != 0) {
                            Log.m105918d("MicroMsg.ChattingUI.ScrollController", "calcDuring extraScrollDistanceDp: " + i3);
                            c2 -= i3;
                        }
                    } else {
                        i3 = 0;
                    }
                    float f = (float) c2;
                    if (f >= 52.0f) {
                        c = (int) ((52.0f / f) * ((float) c));
                    }
                    if (z3 && i3 < 15) {
                        long b = (long) ((ScrollControlListView) n0Var2).mo100789b(n0Var.getChildCount() - 1);
                        if (b > 0) {
                            c = (int) (((long) c) + b);
                            Log.m105918d("MicroMsg.ChattingUI.ScrollController", "calcDuring extraScrollTime: " + b);
                        }
                    }
                    if (Log.getLogLevel() <= 1) {
                        Log.m105919d("MicroMsg.ChattingUI.ScrollController", "calcDuring maxDuring %s position %s firstVisible:%s lastVisible:%s lastBottomGap:" + c2, Integer.valueOf(c), Integer.valueOf(i), Integer.valueOf(firstVisiblePosition), Integer.valueOf(lastVisiblePosition));
                    }
                }
                if (Log.getLogLevel() <= 1) {
                    Log.m105919d("MicroMsg.ChattingUI.ScrollController", "[smoothScrollToPositionFromTop] position:%s, y:%s, calcDuring:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(c));
                }
                n0Var2.smoothScrollToPositionFromTop(i4, i2, c);
            } else if (Log.getLogLevel() <= 1) {
                Log.m105918d("MicroMsg.ChattingUI.ScrollController", "setSelectionFromTop itemvisible, not scroll");
            }
        }
    }

    /* renamed from: c */
    public static boolean m85522c(C72917n0 n0Var, int i) {
        int lastVisiblePosition = n0Var.getLastVisiblePosition();
        int firstVisiblePosition = n0Var.getFirstVisiblePosition();
        if (i < firstVisiblePosition && firstVisiblePosition - i >= 20) {
            if (Log.getLogLevel() <= 1) {
                Log.m105919d("MicroMsg.ChattingUI.ScrollController", "tooFarAway return true 1111 position:%s firstVisible:%s lastVisible:%s ", Integer.valueOf(i), Integer.valueOf(firstVisiblePosition), Integer.valueOf(lastVisiblePosition));
            }
            return true;
        } else if (i <= lastVisiblePosition || i - lastVisiblePosition < 20) {
            if (Log.getLogLevel() <= 1) {
                Log.m105919d("MicroMsg.ChattingUI.ScrollController", "tooFarAway return false position:%s firstVisible:%s lastVisible:%s ", Integer.valueOf(i), Integer.valueOf(firstVisiblePosition), Integer.valueOf(lastVisiblePosition));
            }
            return false;
        } else {
            if (Log.getLogLevel() <= 1) {
                Log.m105919d("MicroMsg.ChattingUI.ScrollController", "tooFarAway return true 2222 position:%s firstVisible:%s lastVisible:%s ", Integer.valueOf(i), Integer.valueOf(firstVisiblePosition), Integer.valueOf(lastVisiblePosition));
            }
            return true;
        }
    }
}
