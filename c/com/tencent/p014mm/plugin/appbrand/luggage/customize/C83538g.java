package com.tencent.p014mm.plugin.appbrand.luggage.customize;

import ai0.C79581v;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import ep0.C86630a;
import lb0.C88394b;
import p1043ua.C90622a;
import p224ra.C89909e;
import zi0.C91755a;
import zi0.C91759b;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.customize.g */
public class C83538g extends C90622a implements C91759b {
    /* renamed from: Om */
    public void mo115832Om(String str, C91755a.C91758c cVar) {
        if (!mo115834Q0(str)) {
            Log.m105929w("MicroMsg.WxFileAdImageReader", "openRead, not match, url:%s", str);
        } else if (cVar != null) {
            C79581v vVar = (C79581v) C89909e.m112436a(C79581v.class);
            if (vVar == null) {
                Log.m105924i("MicroMsg.WxFileAdImageReader", "openRead, no ad service");
                return;
            }
            C81415h0 O3 = vVar.mo109625O3();
            if (O3 == null) {
                Log.m105924i("MicroMsg.WxFileAdImageReader", "openRead, no ad file system");
            } else {
                cVar.mo121428a(O3.readStream(str));
            }
        }
    }

    /* renamed from: P0 */
    public Bitmap mo115833P0(String str, Rect rect, C91755a.C91757b bVar) {
        C86630a aVar = null;
        if (!mo115834Q0(str)) {
            Log.m105929w("MicroMsg.WxFileAdImageReader", "read, not match, url:%s", str);
            return null;
        }
        C79581v vVar = (C79581v) C89909e.m112436a(C79581v.class);
        if (vVar == null) {
            Log.m105924i("MicroMsg.WxFileAdImageReader", "read, no ad service");
            return null;
        }
        C81415h0 O3 = vVar.mo109625O3();
        if (O3 == null) {
            Log.m105924i("MicroMsg.WxFileAdImageReader", "read, no ad file system");
            return null;
        }
        C86009m1 absoluteFile = O3.getAbsoluteFile(str);
        if (absoluteFile == null || !absoluteFile.mo119967g()) {
            Log.m105929w("MicroMsg.WxFileAdImageReader", "read, file not exist, url:%s", str);
            return null;
        }
        String i = absoluteFile.mo119971i();
        if (!i.startsWith("file://")) {
            i = "file://" + i;
        }
        Log.m105929w("MicroMsg.WxFileAdImageReader", "read, url:%s, path:%s", str, i);
        if (rect != null) {
            aVar = new C86630a(rect.left, rect.top, rect.width(), rect.height());
        }
        String str2 = C88394b.f255384g;
        return C88394b.C88418q.f255427a.mo122791g(i, aVar);
    }

    /* renamed from: Q0 */
    public boolean mo115834Q0(String str) {
        return str != null && str.startsWith("wxfile://ad");
    }

    /* renamed from: b3 */
    public boolean mo115836b3(C82381f fVar, String str) {
        if (fVar == null || str == null || str.length() == 0) {
            return false;
        }
        return str.startsWith("wxfile://ad");
    }

    public String key() {
        return "WxFileAdImageReader";
    }

    /* renamed from: nO */
    public String mo115838nO(C82381f fVar, String str) {
        mo115836b3(fVar, str);
        return str;
    }
}
