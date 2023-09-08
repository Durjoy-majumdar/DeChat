package com.tencent.kinda.framework.widget.base;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.tencent.kinda.gen.KBarCodeView;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p200lx.C76736w;

public class KindaBarCodeViewImpl extends BaseKindaCodeView implements KBarCodeView {
    public Bitmap getNewBitmap(String str) {
        if (!TextUtils.isEmpty(str)) {
            return ((C76736w) C86312j.m106911c(C76736w.class)).p10(this.mContext, str, 5, 0, 0.0d);
        }
        Log.m105920e(MMKView.TAG, "getBarcodeBitmap mBarcode == null");
        return null;
    }
}
