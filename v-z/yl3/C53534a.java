package yl3;

import android.app.Activity;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

/* renamed from: yl3.a */
public class C53534a {

    /* renamed from: a */
    public static C53535b f150504a;

    /* renamed from: b */
    public static C53535b f150505b;

    /* renamed from: a */
    public static void m60078a(Activity activity, View view) {
        View decorView = activity.getWindow().getDecorView();
        f150504a = C53535b.m60080a(activity, (String) null, 1200, true);
        f150505b = C53535b.m60080a(activity, (String) null, 1200, true);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i = rect.top;
        int l = ((AppCompatActivity) activity).getSupportActionBar().mo91101l();
        f150504a.setHeight((iArr[1] - i) - l);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        f150505b.setHeight((displayMetrics.heightPixels - iArr[1]) - view.getHeight());
        f150504a.showAtLocation(decorView, 48, 0, i + l);
        f150505b.showAtLocation(decorView, 80, 0, 0);
    }

    /* renamed from: b */
    public static void m60079b() {
        C53535b bVar = f150504a;
        if (bVar != null) {
            bVar.setAnimationStyle(-1);
            f150504a.dismiss();
            f150504a = null;
        }
        C53535b bVar2 = f150505b;
        if (bVar2 != null) {
            bVar2.setAnimationStyle(-1);
            f150505b.dismiss();
            f150505b = null;
        }
    }
}
