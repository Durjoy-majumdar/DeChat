package com.tencent.p014mm.sdk.platformtools;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.p014mm.plugin.appbrand.jsapi.wccoin.C55529k;
import kg3.C76577a;
import ol0.C117812i0;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.sdk.platformtools.KeyBoardUtil */
public class KeyBoardUtil {
    public static final int BOTTOM_PANEL_TIP_DP = 43;
    public static int CONTENT_HEIGHT = -1;
    public static final String KEYBORD_HEIGHT_PX_PREFS = "com.tencent.mm.compatible.util.keybord.height";
    private static int LAST_SAVE_KEYBORD_HEIGHT_PX = -1;
    private static int MAX_PANEL_HEIGHT_PX = -1;
    private static final int MAX_PANEL_HEIGH_DP = 380;
    private static int MIN_PANEL_HEIGHT_PX = -1;
    private static final int MIN_PANEL_HEIGH_DP = 230;
    private static final String TAG = "MicroMsg.KeyBordUtil";
    private static boolean isFixedHeight;

    private static final boolean checkContextIsValid(Context context) {
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        return context != null;
    }

    private static final int dp2px(Context context, int i) {
        return C76577a.m92151b(context, i);
    }

    public static final int getKeyBordHeightPx(Context context) {
        if (isFixedHeight) {
            return getMinPanelHeightPx(context);
        }
        if (!checkContextIsValid(context)) {
            return MMApplicationContext.getDefaultPreference().getInt(KEYBORD_HEIGHT_PX_PREFS, C117812i0.CTRL_INDEX);
        }
        int i = MMApplicationContext.getDefaultPreference().getInt(KEYBORD_HEIGHT_PX_PREFS, dp2px(context, 230));
        LAST_SAVE_KEYBORD_HEIGHT_PX = i;
        return i;
    }

    public static final int getMaxPanelHeightPx(Context context) {
        if (isFixedHeight) {
            return getMinPanelHeightPx(context);
        }
        int i = MAX_PANEL_HEIGHT_PX;
        if (i > 0) {
            return i;
        }
        if (!checkContextIsValid(context)) {
            return C55529k.CTRL_INDEX;
        }
        int dp2px = dp2px(context, MAX_PANEL_HEIGH_DP);
        MAX_PANEL_HEIGHT_PX = dp2px;
        return dp2px;
    }

    public static final int getMinPanelHeightPx(Context context) {
        return getMinPanelHeightPx(context, 0);
    }

    public static int getScreenOrientation(Context context) {
        int[] screenWH = getScreenWH(context);
        return screenWH[0] < screenWH[1] ? 1 : 2;
    }

    public static int[] getScreenWH(Context context) {
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        int[] iArr = new int[2];
        if (context instanceof Activity) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            iArr[0] = displayMetrics.widthPixels;
            iArr[1] = displayMetrics.heightPixels;
        } else {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            iArr[0] = defaultDisplay.getWidth();
            iArr[1] = defaultDisplay.getHeight();
        }
        return iArr;
    }

    public static int getStatusHeight(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }

    public static final int getValidPanelHeight(Context context, int i) {
        return getValidPanelHeight(context, i, 0);
    }

    public static int getVisibleHeight(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.bottom - rect.top;
    }

    public static boolean isPortOrientation(Context context) {
        return getScreenOrientation(context) == 1;
    }

    public static final boolean isValidPanelHeightDP(int i) {
        return i <= MAX_PANEL_HEIGH_DP && i >= 230;
    }

    public static final boolean saveKeyBordHeightPx(Context context, int i) {
        if (LAST_SAVE_KEYBORD_HEIGHT_PX == i) {
            return true;
        }
        if (!checkContextIsValid(context) || i < 0) {
            return false;
        }
        LAST_SAVE_KEYBORD_HEIGHT_PX = i;
        Log.m105919d(TAG, "save keybord: %d", Integer.valueOf(i));
        return MMApplicationContext.getDefaultPreference().edit().putInt(KEYBORD_HEIGHT_PX_PREFS, i).commit();
    }

    public static void setFixedHeight(boolean z) {
        isFixedHeight = z;
    }

    public static final int getMinPanelHeightPx(Context context, int i) {
        if (i > 0) {
            int i2 = i + 230;
            if (!checkContextIsValid(context)) {
                return i2 * 3;
            }
            int dp2px = dp2px(context, i2);
            MIN_PANEL_HEIGHT_PX = dp2px;
            return dp2px;
        }
        int i3 = MIN_PANEL_HEIGHT_PX;
        if (i3 > 0) {
            return i3;
        }
        if (!checkContextIsValid(context)) {
            return C117812i0.CTRL_INDEX;
        }
        int dp2px2 = dp2px(context, 230);
        MIN_PANEL_HEIGHT_PX = dp2px2;
        return dp2px2;
    }

    public static final int getValidPanelHeight(Context context, int i, boolean z) {
        return getValidPanelHeight(context, i, 0, z);
    }

    public static final int getValidPanelHeight(Context context, int i, int i2) {
        int minPanelHeightPx = getMinPanelHeightPx(context, i2);
        Log.m105921e(TAG, "getValidPanelHeight(): minPanelHeight= %d, isOpenIm=%b", Integer.valueOf(minPanelHeightPx), Integer.valueOf(i2));
        boolean isInMultiWindowMode = (!C11171e.m11046c(24) || !(context instanceof Activity)) ? false : ((Activity) context).isInMultiWindowMode();
        if (!isPortOrientation(context) || isInMultiWindowMode) {
            int i3 = (int) (((double) minPanelHeightPx) / 1.5d);
            int i4 = getScreenWH(context)[0] / 2;
            return i3 > i4 ? i4 : i3;
        }
        if (i <= 0) {
            i = getKeyBordHeightPx(context, true);
        }
        int maxPanelHeightPx = getMaxPanelHeightPx(context);
        if (i > maxPanelHeightPx) {
            return maxPanelHeightPx;
        }
        return i < minPanelHeightPx ? minPanelHeightPx : i;
    }

    public static final int getKeyBordHeightPx(Context context, boolean z) {
        if (isFixedHeight) {
            return getMinPanelHeightPx(context);
        }
        int i = LAST_SAVE_KEYBORD_HEIGHT_PX;
        if (i <= 0 || !z) {
            return getKeyBordHeightPx(context);
        }
        return i;
    }

    public static final int getValidPanelHeight(Context context, int i, int i2, boolean z) {
        int minPanelHeightPx = getMinPanelHeightPx(context, i2);
        Log.m105921e(TAG, "getValidPanelHeight(): minPanelHeight= %d, isOpenIm=%b", Integer.valueOf(minPanelHeightPx), Integer.valueOf(i2));
        if (!isPortOrientation(context) || z) {
            int i3 = (int) (((double) minPanelHeightPx) / 1.5d);
            int i4 = getScreenWH(context)[0] / 2;
            return i3 > i4 ? i4 : i3;
        }
        if (i <= 0) {
            i = getKeyBordHeightPx(context, true);
        }
        int maxPanelHeightPx = getMaxPanelHeightPx(context);
        if (i > maxPanelHeightPx) {
            return maxPanelHeightPx;
        }
        return i < minPanelHeightPx ? minPanelHeightPx : i;
    }

    public static final int getValidPanelHeight(Context context) {
        return getValidPanelHeight(context, -1);
    }
}
