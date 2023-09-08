package com.tencent.kinda.framework.widget.tools;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kg3.C76577a;

public class MMKViewUtil {
    private static final String TAG = "MMKViewUtil";
    private static float density = -1.0f;
    public static float[] fontLevel = {0.8f, 1.0f, 1.1f, 1.12f, 1.125f, 1.4f};

    public static int argbColor(long j) {
        return Color.argb((int) ((j >> 24) & 255), (int) ((j >> 16) & 255), (int) ((j >> 8) & 255), (int) (j & 255));
    }

    public static String colorToString(long j) {
        return String.format("#%08x", new Object[]{Long.valueOf(j)});
    }

    public static float dpToPx(Context context, float f) {
        if (context != null) {
            return (float) BackwardSupportUtil.BitmapFactory.fromDPToPix(context, f);
        }
        Log.m105920e(TAG, "DpToPx method parameter is illegal! context is null! stack: \n" + android.util.Log.getStackTraceString(new Throwable()));
        return f * 2.0f;
    }

    public static float getScaleSize(Context context) {
        float f = 1.0f;
        if (context == null) {
            return 1.0f;
        }
        float p = C76577a.m92165p(context);
        if (!context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getBoolean("screenResolution_isModifyDensity", true) || (!C85875k4.m106153J(p, 1.1f) && !C85875k4.m106153J(p, 0.8f))) {
            f = p;
        }
        return (C85875k4.m106153J(f, C76577a.m92169t(context)) || C85875k4.m106153J(f, C76577a.m92170u(context))) ? C76577a.m92168s(context) : f;
    }

    public static float pxToDp(Context context, float f) {
        float f2;
        if (context == null) {
            Log.m105920e(TAG, "dpToPx method parameter is illegal! context is null! stack: \n" + android.util.Log.getStackTraceString(new Throwable()));
            f2 = 2.0f;
        } else {
            f *= 160.0f;
            f2 = (float) context.getResources().getDisplayMetrics().densityDpi;
        }
        return f / f2;
    }

    public static void setExpandSize(final View view, final float f, final float f2) {
        view.post(new Runnable() {
            public void run() {
                View view = (View) view.getParent();
                if (view != null) {
                    Rect rect = new Rect();
                    view.getHitRect(rect);
                    rect.inset((int) ((-((float) C76577a.m92150a(view.getContext(), f))) / 2.0f), (int) ((-((float) C76577a.m92150a(view.getContext(), f2))) / 2.0f));
                    TouchDelegate touchDelegate = view.getTouchDelegate();
                    if (touchDelegate instanceof KindaTouchDelegate) {
                        ((KindaTouchDelegate) touchDelegate).addDelegate(rect, view);
                    } else {
                        view.setTouchDelegate(new KindaTouchDelegate(rect, view));
                    }
                }
            }
        });
    }

    public static void setId4KindaImplView(Context context, String str, View view) {
        int identifier = context.getResources().getIdentifier(str, "id", context.getPackageName());
        if (identifier > 0) {
            view.setId(identifier);
            Log.m105918d(TAG, "setViewId has set rid: " + str);
            return;
        }
        Log.m105918d(TAG, "setViewId has not set rid: " + str + ", because no found res.");
    }
}
