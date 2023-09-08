package com.tencent.tavkit.utils;

import com.tencent.tav.coremedia.CGRect;
import com.tencent.tav.coremedia.CGSize;

/* renamed from: com.tencent.tavkit.utils.Utils */
public class C106943Utils {
    public static boolean isRectValid(CGRect cGRect) {
        return cGRect != null && isSizeValid(cGRect.size);
    }

    public static boolean isSizeValid(CGSize cGSize) {
        return (cGSize == null || cGSize.width == 0.0f || cGSize.height == 0.0f) ? false : true;
    }
}
