package com.tencent.p014mm.plugin.zero;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import di3.C86301e;
import ei3.C86522b;
import p206nj.C88957l;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_PUSH})
/* renamed from: com.tencent.mm.plugin.zero.LoadNormsgJNIService */
public class LoadNormsgJNIService extends C86301e {
    public void onCreate(Context context) {
        C88957l.m111079o("stlport_shared", getClass().getClassLoader());
        C88957l.m111079o("wechatxlog", getClass().getClassLoader());
        C88957l.m111079o("wechatnormsg", getClass().getClassLoader());
    }
}
