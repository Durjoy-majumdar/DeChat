package com.tencent.p014mm.plugin.appbrand;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.C1940m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import kg3.C76577a;
import lb0.C88394b;
import p003ay.C0235b;
import p156gj.C87203t;

/* renamed from: com.tencent.mm.plugin.appbrand.o2 */
public final class C83714o2 {

    /* renamed from: com.tencent.mm.plugin.appbrand.o2$a */
    public static class C83715a {

        /* renamed from: a */
        public int f244358a;

        /* renamed from: b */
        public String[] f244359b;

        /* renamed from: c */
        public String f244360c;

        /* renamed from: d */
        public String f244361d;

        /* renamed from: e */
        public String f244362e;

        public C83715a(int i, String[] strArr, String str, String str2, String str3) {
            this.f244358a = i;
            this.f244359b = strArr;
            this.f244360c = str;
            this.f244361d = str2;
            this.f244362e = str3;
        }
    }

    /* renamed from: a */
    public static boolean m102751a(Context context, C83715a aVar, int i, boolean z) {
        String str;
        String str2;
        Class cls = C0235b.class;
        if (context == null || aVar == null) {
            Log.m105920e("MicroMsg.AppBrandShortcutManager", "add fail, invalid argument");
            return false;
        }
        String[] strArr = aVar.f244359b;
        if (strArr == null) {
            Log.m105920e("MicroMsg.AppBrandShortcutManager", "no such user");
            return false;
        }
        Bitmap d = m102754d(strArr);
        if (d == null) {
            Log.m105924i("MicroMsg.AppBrandShortcutManager", "bitmap do not exist, delay get.");
            return true;
        }
        Intent c = m102753c(context, aVar, i, m102755e(context, d, i), true);
        if (c == null) {
            Log.m105920e("MicroMsg.AppBrandShortcutManager", "add fail, intent is null");
            return false;
        }
        String str3 = null;
        if (((Intent) c.getParcelableExtra("android.intent.extra.shortcut.INTENT")) != null) {
            String str4 = aVar.f244361d;
            String Ce = ((C0235b) C86312j.m106911c(cls)).mo259Ce(str4 + String.valueOf(i), C87203t.m108270f(true));
            String fu = Ce != null ? ((C0235b) C86312j.m106911c(cls)).mo264fu(Ce.getBytes()) : null;
            String Ce2 = ((C0235b) C86312j.m106911c(cls)).mo259Ce(str4 + String.valueOf(i), C87203t.m108266b());
            if (Ce != null) {
                str3 = ((C0235b) C86312j.m106911c(cls)).mo264fu(Ce2.getBytes());
            }
            Log.m105925i("MicroMsg.AppBrandShortcutManager", "alvinluo appId: %s, shortcutId: %s", str4, fu);
            str = fu;
            str2 = str3;
        } else {
            str2 = null;
            str = null;
        }
        try {
            ((C0235b) C86312j.m106911c(cls)).mo269vd(context, c, str2, str, z);
            Log.m105925i("MicroMsg.AppBrandShortcutManager", "add shortcut %s", aVar.f244362e);
            return true;
        } catch (IllegalStateException e) {
            Log.m105928w("MicroMsg.AppBrandShortcutManager", e.toString());
            return false;
        }
    }

    /* renamed from: b */
    public static void m102752b(Context context, Bitmap bitmap, String str) {
        RectF rectF;
        if (context != null && bitmap != null && !bitmap.isRecycled() && !Util.isNullOrNil(str)) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float g = C76577a.m92156g(context);
            float f = g * 4.0f;
            float f2 = g * 2.0f;
            Paint paint = new Paint();
            paint.setTextSize(g * 6.0f);
            paint.setFakeBoldText(true);
            paint.setAntiAlias(true);
            float measureText = paint.measureText(str);
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            float f3 = fontMetrics.bottom - fontMetrics.top;
            paint.setColor(Color.parseColor("#459AE9"));
            Canvas canvas = new Canvas(bitmap);
            if (Build.VERSION.SDK_INT < 26) {
                float f4 = (float) width;
                float f5 = (float) height;
                rectF = new RectF((f4 - measureText) - (f * 2.0f), (f5 - f3) - (2.0f * f2), f4, f5);
            } else {
                float f6 = (float) height;
                rectF = new RectF(0.0f, (f6 - f3) - (f2 * 2.0f), measureText + (2.0f * f), f6);
            }
            canvas.drawRoundRect(rectF, 4.0f, 4.0f, paint);
            paint.setColor(-1);
            canvas.drawText(str, rectF.left + f, (rectF.top + f2) - fontMetrics.ascent, paint);
        }
    }

    /* renamed from: c */
    public static Intent m102753c(Context context, C83715a aVar, int i, Bitmap bitmap, boolean z) {
        if (aVar == null || context == null || aVar.f244362e == null) {
            Log.m105920e("MicroMsg.AppBrandShortcutManager", "buildIntent, wrong parameters");
            return null;
        } else if (bitmap != null || !z) {
            String str = TextUtils.isEmpty(aVar.f244360c) ? aVar.f244362e : aVar.f244360c;
            Intent Dp0 = C1940m2.C1941a.f11819a.Dp0(context.getPackageName(), i, aVar.f244362e, aVar.f244360c, aVar.f244359b, aVar.f244361d, aVar.f244358a, 1);
            Intent intent = new Intent(z ? "com.android.launcher.action.INSTALL_SHORTCUT" : "com.android.launcher.action.UNINSTALL_SHORTCUT");
            intent.putExtra("android.intent.extra.shortcut.NAME", str);
            intent.putExtra("duplicate", false);
            intent.putExtra("android.intent.extra.shortcut.INTENT", Dp0);
            intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
            intent.putExtra("shortcut_is_adaptive_icon", true);
            return intent;
        } else {
            Log.m105920e("MicroMsg.AppBrandShortcutManager", "no bmp");
            return null;
        }
    }

    /* renamed from: d */
    public static Bitmap m102754d(String[] strArr) {
        Bitmap bitmap;
        int length = strArr.length;
        int i = 0;
        while (true) {
            bitmap = null;
            if (i >= length) {
                break;
            }
            String str = strArr[i];
            if (!Util.isNullOrNil(str)) {
                String str2 = C88394b.f255384g;
                bitmap = C88394b.C88418q.f255427a.mo122791g(str, (C88394b.C88405h) null);
                if (bitmap != null && !bitmap.isRecycled()) {
                    break;
                }
            }
            i++;
        }
        return bitmap;
    }

    /* renamed from: e */
    public static Bitmap m102755e(Context context, Bitmap bitmap, int i) {
        Bitmap bitmap2 = null;
        if (!(context == null || bitmap == null || bitmap.isRecycled())) {
            int g = (int) (C76577a.m92156g(context) * 48.0f);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, g, g, true);
            if (createScaledBitmap != null) {
                bitmap2 = createScaledBitmap.copy(Bitmap.Config.ARGB_8888, true);
                Log.m105925i("MicroMsg.AppBrandShortcutManager", "bitmap recycle %s", createScaledBitmap);
                createScaledBitmap.recycle();
            }
            if (i == 2) {
                m102752b(context, bitmap2, C76577a.m92166q(context, C0966R.string.f7875uo));
            } else if (i == 1) {
                m102752b(context, bitmap2, C76577a.m92166q(context, C0966R.string.f7876up));
            }
        }
        return bitmap2;
    }
}
