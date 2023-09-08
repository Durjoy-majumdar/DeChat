package p206nj;

import android.app.Activity;
import android.content.Context;
import android.util.TypedValue;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;

/* renamed from: nj.a */
public class C76860a {
    /* renamed from: a */
    public static int m92655a(Activity activity) {
        if (activity instanceof AppCompatActivity) {
            AppCompatActivity appCompatActivity = (AppCompatActivity) activity;
            if (appCompatActivity.getSupportActionBar() != null) {
                return appCompatActivity.getSupportActionBar().mo91101l();
            }
        } else if (activity.getActionBar() != null) {
            return activity.getActionBar().getHeight();
        }
        return m92657c(activity);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m92656b(android.app.Activity r4, int r5) {
        /*
            java.lang.String r0 = "MicroMsg.ActionBarCompatHelper"
            if (r4 != 0) goto L_0x000a
            java.lang.String r4 = "[getActionBarHeight] activity is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r4)
            return r5
        L_0x000a:
            boolean r1 = r4 instanceof androidx.appcompat.app.AppCompatActivity
            r2 = 0
            if (r1 == 0) goto L_0x0020
            androidx.appcompat.app.AppCompatActivity r4 = (androidx.appcompat.app.AppCompatActivity) r4
            androidx.appcompat.app.ActionBar r1 = r4.getSupportActionBar()
            if (r1 == 0) goto L_0x002f
            androidx.appcompat.app.ActionBar r4 = r4.getSupportActionBar()
            int r4 = r4.mo91101l()
            goto L_0x0030
        L_0x0020:
            android.app.ActionBar r1 = r4.getActionBar()
            if (r1 == 0) goto L_0x002f
            android.app.ActionBar r4 = r4.getActionBar()
            int r4 = r4.getHeight()
            goto L_0x0030
        L_0x002f:
            r4 = 0
        L_0x0030:
            if (r4 > 0) goto L_0x0033
            r4 = r5
        L_0x0033:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r1[r2] = r3
            r2 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1[r2] = r5
            java.lang.String r5 = "[getActionBarHeight] real:%s defaultVal:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p206nj.C76860a.m92656b(android.app.Activity, int):int");
    }

    /* renamed from: c */
    public static int m92657c(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C0966R.attr.f2625a0, typedValue, true)) {
            return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        if (context.getTheme().resolveAttribute(16843499, typedValue, true)) {
            return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        return 0;
    }
}
