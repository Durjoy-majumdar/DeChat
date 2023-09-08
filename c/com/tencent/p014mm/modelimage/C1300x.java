package com.tencent.p014mm.modelimage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import fy3.C32228q;
import gy3.C87412m;
import java.net.URLDecoder;
import java.util.Map;
import java.util.Set;
import ke3.C88144b;
import sx3.C110818d0;
import sx3.C22415w0;

/* renamed from: com.tencent.mm.modelimage.x */
public final class C1300x {

    /* renamed from: a */
    public static final Set<String> f10406a = C22415w0.m26092a("mp.weixin.qq.com");

    /* renamed from: a */
    public static final void m1390a(Context context, String str, C32228q<? super Context, ? super String, ? super Integer, Boolean> qVar) {
        Uri uri;
        C87412m.m108594g(context, "context");
        try {
            uri = Uri.parse(str);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ImgSourceUrlUtil", "checkGoToSourceUrl Uri.parse Exp:%s sourceUrl:%s", e, str);
            uri = null;
        }
        if (!C110818d0.m150903D(f10406a, uri != null ? uri.getHost() : null)) {
            Log.m105921e("MicroMsg.ImgSourceUrlUtil", "checkGoToSourceUrl not valid sourceUrl:%s", str);
            return;
        }
        int i = Util.getInt(uri != null ? uri.getQueryParameter("item_show_type") : null, -1);
        boolean booleanValue = qVar != null ? qVar.invoke(context, str, Integer.valueOf(i)).booleanValue() : false;
        Log.m105925i("MicroMsg.ImgSourceUrlUtil", "checkGoToSourceUrl go : %s openDelegateRet:%b itemShowType:%d", str, Boolean.valueOf(booleanValue), Integer.valueOf(i));
        if (!booleanValue) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", str);
            C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }

    /* renamed from: b */
    public static final String m1391b(C72963f4 f4Var) {
        if (f4Var != null && !Util.isNullOrNil(f4Var.getContent())) {
            return m1392c(XmlParser.parseXml(f4Var.getContent(), "msg", (String) null));
        }
        return null;
    }

    /* renamed from: c */
    public static final String m1392c(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        String str = map.get(".msg.img.$imgsourceurl");
        if (Util.isNullOrNil(str)) {
            return null;
        }
        try {
            return URLDecoder.decode(str);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ImgSourceUrlUtil", "parseImageSourceUrl decodeExp:%s url:%s", e, str);
            return null;
        }
    }
}
