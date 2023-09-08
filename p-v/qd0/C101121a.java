package qd0;

import android.content.Context;
import com.tencent.p014mm.C0966R;

/* renamed from: qd0.a */
public final class C101121a {
    /* renamed from: a */
    public static float m132521a(long j) {
        float f = ((float) j) / 1000.0f;
        if (f < 1.0f) {
            f = 1.0f;
        }
        return (float) Math.round(f);
    }

    /* renamed from: b */
    public static CharSequence m132522b(Context context, int i) {
        if (i <= 0) {
            return context.getString(C0966R.string.cr7, new Object[]{0, 0});
        }
        return context.getString(C0966R.string.cr7, new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)});
    }
}
