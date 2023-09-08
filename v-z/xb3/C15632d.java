package xb3;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: xb3.d */
public final class C15632d {
    /* renamed from: a */
    public static final View m14634a(ViewGroup viewGroup, int i, String str, int i2) {
        View a;
        if (i2 > 200) {
            Log.m105928w("ViewTookit", "over max recurrence");
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (childAt != null) {
                if (C87412m.m108589b(childAt.getTag(i), str)) {
                    return childAt;
                }
                if ((childAt instanceof ViewGroup) && (a = m14634a((ViewGroup) childAt, i, str, i2 + 1)) != null) {
                    return a;
                }
            }
        }
        return null;
    }
}
