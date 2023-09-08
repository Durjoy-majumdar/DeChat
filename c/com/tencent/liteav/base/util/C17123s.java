package com.tencent.liteav.base.util;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.tencent.liteav.base.util.C17109a;

/* renamed from: com.tencent.liteav.base.util.s */
public final class C17123s {

    /* renamed from: a */
    private static boolean f46177a;

    /* renamed from: b */
    private static C17109a<CpuUsageMeasurer> f46178b = new C17109a<>(new C17109a.C17110a<CpuUsageMeasurer>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo19359a() {
            return new CpuUsageMeasurer();
        }
    });

    /* renamed from: a */
    public static int[] m16935a() {
        if (f46177a) {
            f46177a = false;
            f46178b.mo19358a();
            CpuUsageMeasurer.m16895a();
            return new int[]{0, 0};
        }
        f46178b.mo19358a();
        return CpuUsageMeasurer.m16895a();
    }

    /* renamed from: a */
    public static C104507p m16934a(Context context) {
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                LiteavLog.m16902i("SystemUtil", "DeviceScreen:[width:%d][height:%d]", Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
                return new C104507p(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
        } catch (Exception e) {
            LiteavLog.m16899e("SystemUtil", "get screen resolution failed.", (Throwable) e);
        }
        return new C104507p(0, 0);
    }
}
