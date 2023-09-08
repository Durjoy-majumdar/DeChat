package p451b2;

import android.content.Context;
import android.os.Build;
import gy3.C87412m;

/* renamed from: b2.c */
public final class C28236c {
    /* renamed from: a */
    public static final C28235b m38131a(Context context) {
        C87412m.m108594g(context, "context");
        return new C28235b(Build.VERSION.SDK_INT >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0);
    }
}
