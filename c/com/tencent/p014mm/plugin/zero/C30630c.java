package com.tencent.p014mm.plugin.zero;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.wcdb.support.Log;
import di3.C86301e;
import ei3.C86522b;
import p206nj.C88957l;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.zero.c */
public class C30630c extends C86301e {
    public void onCreate(Context context) {
        if (!C88957l.m111068d("wcdb")) {
            C88957l.m111079o("wcdb", C30630c.class.getClassLoader());
        }
        Log.setLogger((Log.LogCallback) new C85596b(this));
    }
}
