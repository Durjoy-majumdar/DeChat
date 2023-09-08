package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.framework.widget.tools.ResourcesUtils;
import com.tencent.kinda.gen.KToastDialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import nj3.C76912y0;

public class MMToastDialog implements KToastDialog {
    private static final String TAG = "MMToastDialog";

    public void show(String str, String str2) {
        Context context = KindaContext.get();
        if (context == null) {
            Log.m105920e(TAG, "MMToastDialog showImpl() KindaContext.get() return null!");
            return;
        }
        int drawableId = ResourcesUtils.getDrawableId(MMApplicationContext.getContext(), str2);
        int resId = ResourcesUtils.getResId(MMApplicationContext.getContext(), str2, ShareConstants.DEXMODE_RAW);
        if (resId != 0) {
            drawableId = resId;
        }
        C76912y0.m92769h(context, str, drawableId);
    }
}
