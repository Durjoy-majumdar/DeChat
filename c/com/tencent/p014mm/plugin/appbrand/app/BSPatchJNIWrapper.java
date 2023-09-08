package com.tencent.p014mm.plugin.appbrand.app;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.appcache.WABSPatch;
import com.tencent.p014mm.plugin.appbrand.service.IBSPatchJNIService;
import di3.C86301e;
import ei3.C86522b;
import p206nj.C88957l;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND})
/* renamed from: com.tencent.mm.plugin.appbrand.app.BSPatchJNIWrapper */
public class BSPatchJNIWrapper extends C86301e implements IBSPatchJNIService {
    public int bspatch(String str, String str2, String str3) {
        return WABSPatch.bspatch(str, str2, str3);
    }

    public void onCreate(Context context) {
        C88957l.m111079o("appbrandcommon", BSPatchJNIWrapper.class.getClassLoader());
    }
}
