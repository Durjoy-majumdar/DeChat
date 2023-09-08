package com.tencent.p014mm.sdk.vendor;

import android.content.Context;
import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.sdk.vendor.Oppo */
public class Oppo {
    private static final String TAG = "MicroMsg.Vendor.Oppo";
    public static Boolean _isUnDefaultFont;

    public static boolean isUnDefaultFont() {
        Boolean bool = _isUnDefaultFont;
        if (bool != null) {
            return bool.booleanValue();
        }
        _isUnDefaultFont = Boolean.FALSE;
        try {
            Class<?> cls = Class.forName(Build.VERSION.SDK_INT > 29 ? "oplus.content.res.OplusFontUtils" : "oppo.content.res.OppoFontUtils");
            _isUnDefaultFont = Boolean.valueOf(cls.getField("isFlipFontUsed").getBoolean(cls));
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
        Boolean bool2 = _isUnDefaultFont;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        return false;
    }

    public static boolean oppohasCutOut(Context context) {
        if (context == null) {
            return false;
        }
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }
}
