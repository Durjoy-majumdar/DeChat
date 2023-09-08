package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import gy3.C87412m;
import p625nu.C100196e;
import p914oj.C89231c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.f7 */
public final class C82388f7 {
    /* renamed from: a */
    public static final String m101144a(String str, String str2) {
        C87412m.m108594g(str, "videoPath");
        if (!(str2 == null || str2.length() == 0)) {
            return str2;
        }
        C86009m1 m1Var = new C86009m1(str + ".jpg");
        try {
            Bitmap rk = ((C100196e) C86312j.m106911c(C100196e.class)).mo139319rk(str);
            if (rk != null) {
                BitmapUtil.saveBitmapToImage(rk, 100, Bitmap.CompressFormat.PNG, m1Var.mo119971i(), true);
            }
        } catch (Exception e) {
            Log.m105928w("MicroMsg.AppBrand.SendVideoCommons", "createThumbFile, fail since " + e);
            m1Var = null;
        }
        if (m1Var != null) {
            return m1Var.mo119971i();
        }
        return null;
    }

    /* renamed from: b */
    public static final int m101145b(String str) {
        int i;
        C87412m.m108594g(str, "videoPath");
        try {
            C89231c cVar = new C89231c();
            cVar.setDataSource(str);
            long j = Util.getLong(cVar.extractMetadata(9), 0);
            cVar.release();
            i = Util.videoMsToSec(j);
        } catch (Exception unused) {
            i = 0;
        }
        Log.m105924i("MicroMsg.AppBrand.SendVideoCommons", "parseVideoDurationS, duration: " + i);
        return i;
    }
}
