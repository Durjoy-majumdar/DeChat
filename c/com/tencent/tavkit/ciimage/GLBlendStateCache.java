package com.tencent.tavkit.ciimage;

import android.opengl.GLES20;
import com.tencent.tav.decoder.logger.Logger;
import java.util.Arrays;

class GLBlendStateCache {
    private static final String TAG = "GLBlendStateCache";
    private final int[] pNames = {32777, 32777, 34877, 32969, 32968, 32971, 32970};
    private final int[] params = new int[7];

    public synchronized void cache() {
        int i = 0;
        while (true) {
            int[] iArr = this.pNames;
            if (i < iArr.length) {
                GLES20.glGetIntegerv(iArr[i], this.params, i);
                i++;
            }
        }
    }

    public synchronized void restore() {
        Logger.m144648v(TAG, "restore: params = " + Arrays.toString(this.params));
        GLES20.glEnable(3042);
        GLES20.glBlendEquation(this.params[0]);
        int[] iArr = this.params;
        GLES20.glBlendEquationSeparate(iArr[1], iArr[2]);
        int[] iArr2 = this.params;
        GLES20.glBlendFuncSeparate(iArr2[3], iArr2[4], iArr2[5], iArr2[6]);
    }
}
