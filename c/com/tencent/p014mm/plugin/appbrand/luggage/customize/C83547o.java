package com.tencent.p014mm.plugin.appbrand.luggage.customize;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.appcache.C81247g3;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83762b1;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import ep0.C7772b;
import java.io.InputStream;
import p1043ua.C90622a;
import zi0.C91755a;
import zi0.C91759b;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.customize.o */
public class C83547o extends C90622a implements C91759b {

    /* renamed from: d */
    public final AppBrandRuntime f244072d;

    public C83547o(AppBrandRuntime appBrandRuntime) {
        this.f244072d = appBrandRuntime;
    }

    /* renamed from: Om */
    public void mo115832Om(String str, C91755a.C91758c cVar) {
        if (cVar != null) {
            Uri parse = Uri.parse(str);
            String str2 = (String) Pair.create(parse.getQueryParameter("appId"), parse.getQueryParameter("path")).second;
            if (TextUtils.isEmpty(str2)) {
                cVar.mo121428a((InputStream) null);
            } else {
                cVar.mo121428a(C81247g3.m99557m(this.f244072d, str2));
            }
        }
    }

    /* renamed from: P0 */
    public Bitmap mo115833P0(String str, Rect rect, C91755a.C91757b bVar) {
        if (!mo115834Q0(str)) {
            return null;
        }
        Uri parse = Uri.parse(str);
        String str2 = (String) Pair.create(parse.getQueryParameter("appId"), parse.getQueryParameter("path")).second;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        Bitmap b = C83762b1.m102898b(this.f244072d, Uri.decode(str2));
        return rect != null ? new C7772b(rect.left, rect.top, rect.width(), rect.height()).mo5830c(b) : b;
    }

    /* renamed from: Q0 */
    public boolean mo115834Q0(String str) {
        return str != null && str.startsWith("wxapkg://");
    }

    /* renamed from: b3 */
    public boolean mo115836b3(C82381f fVar, String str) {
        return fVar != null && str != null && str.length() != 0 && !str.startsWith("wxapkg://") && !str.startsWith(HttpWrapperBase.PROTOCAL_HTTP) && !str.startsWith(HttpWrapperBase.PROTOCAL_HTTPS) && !str.startsWith("wxfile://") && !str.contains("://");
    }

    public String key() {
        return "WxaPkgImageReader";
    }

    /* renamed from: nO */
    public String mo115838nO(C82381f fVar, String str) {
        if (!mo115836b3(fVar, str)) {
            return str;
        }
        return "wxapkg://" + "icon?" + "appId=" + fVar.getAppId() + "&" + "path=" + Uri.encode(str);
    }
}
