package com.tencent.p014mm.plugin.appbrand.luggage.customize;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Pair;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import ep0.C86630a;
import java.io.InputStream;
import lb0.C88394b;
import p1043ua.C90622a;
import zi0.C91755a;
import zi0.C91759b;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.customize.f */
public class C83537f extends C90622a implements C91759b {

    /* renamed from: d */
    public final AppBrandRuntime f244062d;

    public C83537f(AppBrandRuntime appBrandRuntime) {
        this.f244062d = appBrandRuntime;
    }

    /* renamed from: Om */
    public void mo115832Om(String str, C91755a.C91758c cVar) {
        if (cVar != null) {
            C81415h0 V = this.f244062d.mo113034V();
            if (V == null) {
                cVar.mo121428a((InputStream) null);
            } else {
                cVar.mo121428a(V.readStream((String) mo115835a(str).second));
            }
        }
    }

    /* renamed from: P0 */
    public Bitmap mo115833P0(String str, Rect rect, C91755a.C91757b bVar) {
        C81415h0 V;
        C86009m1 privateAbsoluteFile;
        C86630a aVar = null;
        if (!mo115834Q0(str) || (V = this.f244062d.mo113034V()) == null || (privateAbsoluteFile = V.getPrivateAbsoluteFile((String) mo115835a(str).second)) == null || !privateAbsoluteFile.mo119967g()) {
            return null;
        }
        String i = privateAbsoluteFile.mo119971i();
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
        return str != null && str.startsWith("wxblob://");
    }

    /* renamed from: a */
    public final Pair<String, String> mo115835a(String str) {
        if (Util.isNullOrNil(str)) {
            return Pair.create((Object) null, (Object) null);
        }
        int lastIndexOf = str.lastIndexOf("wxblob://");
        return lastIndexOf < 0 ? Pair.create((Object) null, (Object) null) : Pair.create(str.substring(0, lastIndexOf), str.substring(lastIndexOf));
    }

    /* renamed from: b3 */
    public boolean mo115836b3(C82381f fVar, String str) {
        if (fVar == null || str == null || str.length() == 0) {
            return false;
        }
        return str.startsWith("wxblob://") || Util.nullAsNil((String) mo115835a(str).second).startsWith("wxblob://");
    }

    public String key() {
        return "WxBlobImageReader";
    }

    /* renamed from: nO */
    public String mo115838nO(C82381f fVar, String str) {
        return !mo115836b3(fVar, str) ? str : Util.nullAsNil((String) mo115835a(str).second);
    }
}
