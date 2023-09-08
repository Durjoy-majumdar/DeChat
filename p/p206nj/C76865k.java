package p206nj;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;

@Deprecated
/* renamed from: nj.k */
public class C76865k extends KeyBoardUtil {
    /* renamed from: a */
    public static final void m92670a(Activity activity) {
        if (activity != null) {
            Rect rect = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            KeyBoardUtil.CONTENT_HEIGHT = (activity.getResources().getDisplayMetrics().heightPixels - C76860a.m92655a(activity)) - rect.top;
        }
    }

    /* renamed from: b */
    public static final void m92671b(Context context, int i) {
        int minPanelHeightPx = KeyBoardUtil.getMinPanelHeightPx(context);
        int maxPanelHeightPx = KeyBoardUtil.getMaxPanelHeightPx(context);
        if (i < minPanelHeightPx) {
            i = minPanelHeightPx;
        }
        if (i <= maxPanelHeightPx) {
            maxPanelHeightPx = i;
        }
        KeyBoardUtil.saveKeyBordHeightPx(context, maxPanelHeightPx);
        MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putInt(KeyBoardUtil.KEYBORD_HEIGHT_PX_PREFS, maxPanelHeightPx);
    }
}
