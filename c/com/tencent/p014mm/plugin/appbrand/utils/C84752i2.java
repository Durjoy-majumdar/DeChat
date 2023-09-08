package com.tencent.p014mm.plugin.appbrand.utils;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.widget.FrameLayout;
import br0.C79774c;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82644m7;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.i2 */
public class C84752i2 {
    /* renamed from: a */
    public static int[] m104413a(C82554k kVar) {
        DisplayMetrics displayMetrics;
        C79774c f0 = kVar.getRuntime() != null ? kVar.getRuntime().mo113054f0() : null;
        if (f0 != null) {
            Log.m105926v("Luggage.WXA.UIUtil", "getScreenSizeInner: V_DM");
            displayMetrics = f0.getVDisplayMetrics();
        } else {
            Log.m105926v("Luggage.WXA.UIUtil", "getScreenSizeInner: normal DM");
            displayMetrics = kVar.getContext().getResources().getDisplayMetrics();
        }
        int i = displayMetrics.widthPixels;
        int[] iArr = {i, displayMetrics.heightPixels};
        Log.m105927v("Luggage.WXA.UIUtil", "getScreenSize: [x,y] = [%d,%d]", Integer.valueOf(i), Integer.valueOf(iArr[1]));
        return iArr;
    }

    /* renamed from: b */
    public static int m104414b(C82554k kVar) {
        int i;
        int[] iArr = new int[2];
        if (kVar instanceof C81879g) {
            C83780d1 a = C82644m7.m101430a((C81879g) kVar);
            FrameLayout frameLayout = a == null ? null : a.f244555G;
            if (frameLayout != null) {
                frameLayout.getLocationOnScreen(iArr);
                i = iArr[1];
                Log.m105927v("Luggage.WXA.UIUtil", "getScreenTop: [%d]", Integer.valueOf(i));
                return i;
            }
        }
        i = 0;
        Log.m105927v("Luggage.WXA.UIUtil", "getScreenTop: [%d]", Integer.valueOf(i));
        return i;
    }

    /* renamed from: c */
    public static int[] m104415c(C81879g gVar) {
        int[] iArr;
        C83780d1 a = C82644m7.m101430a(gVar);
        FrameLayout frameLayout = a == null ? null : a.f244555G;
        if (frameLayout != null && frameLayout.isLaidOut()) {
            Log.m105924i("Luggage.WXA.UIUtil", "getWindowWidthHeight Method: normal");
            iArr = new int[]{frameLayout.getWidth(), frameLayout.getHeight()};
        } else if (gVar.getContext() instanceof Activity) {
            Log.m105924i("Luggage.WXA.UIUtil", "getWindowWidthHeight Method: windowAndroid");
            DisplayMetrics vDisplayMetrics = gVar.mo114271f0().getVDisplayMetrics();
            int i = vDisplayMetrics.widthPixels;
            if (i <= 0) {
                Log.m105920e("Luggage.WXA.UIUtil", "getWindowWidthHeight try Method(windowAndroid) but width<=0, use Method(Screen) instead");
                iArr = m104413a(gVar);
            } else {
                iArr = new int[]{i, vDisplayMetrics.heightPixels};
            }
        } else {
            Log.m105924i("Luggage.WXA.UIUtil", "getWindowWidthHeight Method: Screen");
            iArr = m104413a(gVar);
        }
        Log.m105927v("Luggage.WXA.UIUtil", "getWindowWidthHeight: [x,y] = [%d,%d]", Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
        return iArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        r3 = com.tencent.p014mm.sdk.system.AndroidContextUtil.castActivityOrNull(r3.getContext());
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m104416d(android.view.View r3) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 24
            if (r0 >= r2) goto L_0x0008
            return r1
        L_0x0008:
            if (r3 != 0) goto L_0x000b
            return r1
        L_0x000b:
            android.content.Context r3 = r3.getContext()
            android.app.Activity r3 = com.tencent.p014mm.sdk.system.AndroidContextUtil.castActivityOrNull(r3)
            if (r3 == 0) goto L_0x001c
            boolean r3 = r3.isInMultiWindowMode()
            if (r3 == 0) goto L_0x001c
            r1 = 1
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.utils.C84752i2.m104416d(android.view.View):boolean");
    }
}
