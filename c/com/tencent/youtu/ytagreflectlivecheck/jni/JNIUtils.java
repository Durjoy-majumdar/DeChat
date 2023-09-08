package com.tencent.youtu.ytagreflectlivecheck.jni;

import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.Timeval;

public class JNIUtils {
    private static final String TAG = "LightLiveCheck";

    public static Timeval getTimeval(long j) {
        return new Timeval(j / 1000, (int) ((j * 1000) % TimeUtil.SECOND_TO_US));
    }
}
