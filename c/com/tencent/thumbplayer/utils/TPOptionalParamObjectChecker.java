package com.tencent.thumbplayer.utils;

import com.tencent.thumbplayer.api.TPAudioAttributes;
import com.tencent.thumbplayer.api.TPJitterBufferConfig;
import com.tencent.thumbplayer.api.TPSubtitleRenderModel;
import java.util.HashMap;

public class TPOptionalParamObjectChecker {
    private static final HashMap<Integer, Class> mMapKeyToClass;

    static {
        HashMap<Integer, Class> hashMap = new HashMap<>();
        mMapKeyToClass = hashMap;
        hashMap.put(414, TPAudioAttributes.class);
        hashMap.put(507, TPSubtitleRenderModel.class);
        hashMap.put(140, TPJitterBufferConfig.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r2 = mMapKeyToClass.get(java.lang.Integer.valueOf(r2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean checkObjectType(@com.tencent.thumbplayer.api.TPCommonEnum.TPOptionalId int r2, java.lang.Object r3) {
        /*
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.util.HashMap<java.lang.Integer, java.lang.Class> r1 = mMapKeyToClass
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r1.get(r2)
            java.lang.Class r2 = (java.lang.Class) r2
            if (r2 != 0) goto L_0x0013
            return r0
        L_0x0013:
            java.lang.Class r3 = r3.getClass()
            if (r3 == r2) goto L_0x001a
            return r0
        L_0x001a:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.utils.TPOptionalParamObjectChecker.checkObjectType(int, java.lang.Object):boolean");
    }
}
