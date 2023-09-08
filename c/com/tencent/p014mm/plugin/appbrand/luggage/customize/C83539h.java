package com.tencent.p014mm.plugin.appbrand.luggage.customize;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Pair;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.vfs.C86009m1;
import ep0.C86630a;
import java.io.InputStream;
import lb0.C88394b;
import p1043ua.C90622a;
import zi0.C91755a;
import zi0.C91759b;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.customize.h */
public class C83539h extends C90622a implements C91759b {

    /* renamed from: d */
    public final AppBrandRuntime f244063d;

    public C83539h(AppBrandRuntime appBrandRuntime) {
        this.f244063d = appBrandRuntime;
    }

    /* renamed from: Om */
    public void mo115832Om(String str, C91755a.C91758c cVar) {
        if (cVar != null) {
            C81415h0 V = this.f244063d.mo113034V();
            if (V == null) {
                cVar.mo121428a((InputStream) null);
                return;
            }
            int lastIndexOf = str.lastIndexOf("?appId=");
            cVar.mo121428a(V.readStream((String) Pair.create(str.substring(lastIndexOf + 7), str.substring(0, lastIndexOf)).second));
        }
    }

    /* renamed from: P0 */
    public Bitmap mo115833P0(String str, Rect rect, C91755a.C91757b bVar) {
        C81415h0 V;
        C86630a aVar = null;
        if (!mo115834Q0(str) || (V = this.f244063d.mo113034V()) == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf("?appId=");
        C86009m1 absoluteFile = V.getAbsoluteFile((String) Pair.create(str.substring(lastIndexOf + 7), str.substring(0, lastIndexOf)).second);
        if (absoluteFile == null || !absoluteFile.mo119967g()) {
            return null;
        }
        String i = absoluteFile.mo119971i();
        if (!i.startsWith("file://")) {
            i = "file://" + i;
        }
        if (rect != null) {
            aVar = new C86630a(rect.left, rect.top, rect.width(), rect.height());
        }
        String str2 = C88394b.f255384g;
        return C88394b.C88418q.f255427a.mo122791g(i, aVar);
    }

    /* renamed from: Q0 */
    public boolean mo115834Q0(String str) {
        return str != null && str.startsWith("wxfile://") && !str.startsWith("wxfile://ad");
    }

    /* renamed from: b3 */
    public boolean mo115836b3(C82381f fVar, String str) {
        return (fVar == null || str == null || str.length() == 0 || !str.startsWith("wxfile://") || str.startsWith("wxfile://ad")) ? false : true;
    }

    public String key() {
        return "WxFileImageReader";
    }

    /* renamed from: nO */
    public String mo115838nO(C82381f fVar, String str) {
        if (!mo115836b3(fVar, str)) {
            return str;
        }
        return str + "?appId=" + fVar.getAppId();
    }
}
