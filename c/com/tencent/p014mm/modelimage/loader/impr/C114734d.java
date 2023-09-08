package com.tencent.p014mm.modelimage.loader.impr;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ic0.C117153g;
import p823sg.C90193h;

/* renamed from: com.tencent.mm.modelimage.loader.impr.d */
public class C114734d implements C117153g {
    /* renamed from: a */
    public String mo174352a(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        String f = C90193h.m112878f(str.getBytes());
        Log.m105919d("MicroMsg.imageloader.DefaultImageFileNameCreator", "[cpan] create image file name :%s", f);
        return f;
    }
}
