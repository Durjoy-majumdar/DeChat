package com.tencent.p014mm.plugin.webview.model;

import a70.C112760b;
import android.content.Intent;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.p014mm.vfs.VFSStrategy$$b;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import di3.C86312j;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONStringer;
import p749xh.C66261f3;

/* renamed from: com.tencent.mm.plugin.webview.model.g2 */
public final class C43702g2 {

    /* renamed from: a */
    public static final HashMap<String, List<String>> f118107a;

    /* renamed from: b */
    public static final HashMap<String, List<String>> f118108b;

    static {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        f118107a = hashMap;
        HashMap<String, List<String>> hashMap2 = new HashMap<>();
        f118108b = hashMap2;
        hashMap.put("image/jpeg", Arrays.asList(new String[]{".jpg", ".jpeg"}));
        hashMap.put("image/jpg", Arrays.asList(new String[]{".jpg", ".jpeg"}));
        hashMap.put("image/png", Collections.singletonList(".png"));
        hashMap.put("image/webp", Collections.singletonList(".webp"));
        hashMap.put("image/bmp", Collections.singletonList(".bmp"));
        hashMap.put("image/gif", Collections.singletonList(".gif"));
        hashMap.put("image/tiff", Arrays.asList(new String[]{".tiff", ".tif"}));
        hashMap.put("image/svg+xml", Arrays.asList(new String[]{".svg", ".svgz"}));
        hashMap2.put(MimeTypes.VIDEO_MP4, Collections.singletonList(".mp4"));
        hashMap2.put("video/x-m4v", Collections.singletonList(".m4v"));
        hashMap2.put(MimeTypes.VIDEO_MPEG, Arrays.asList(new String[]{".mpg", ".mpeg", ".mpe"}));
        hashMap2.put("video/quicktime", Arrays.asList(new String[]{".qt", ".mov"}));
        hashMap2.put("video/x-msvideo", Collections.singletonList(".avi"));
        hashMap2.put("video/x-ms-wmv", Collections.singletonList(".wmv"));
        hashMap2.put(MimeTypes.VIDEO_WEBM, Collections.singletonList(".webm"));
        hashMap2.put("video/ogg", Collections.singletonList(".ogv"));
        hashMap2.put(MimeTypes.VIDEO_H263, Collections.singletonList(".3gp"));
        hashMap2.put("video/3gpp2", Collections.singletonList(".3g2"));
    }

    /* renamed from: a */
    public static String m47528a(ArrayList<String> arrayList) {
        if (Util.isNullOrNil((List) arrayList)) {
            return "";
        }
        JSONStringer jSONStringer = new JSONStringer();
        try {
            jSONStringer.array();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                WebViewJSSDKFileItem b = C6080m.Ax0().mo7010b(next);
                if (b instanceof WebViewJSSDKImageItem) {
                    jSONStringer.object();
                    jSONStringer.key(C66261f3.COL_LOCALID);
                    jSONStringer.value(next);
                    jSONStringer.key("height");
                    jSONStringer.value(b.f283031q + "");
                    jSONStringer.key("width");
                    jSONStringer.value(b.f283030p + "");
                    jSONStringer.key("isGif");
                    jSONStringer.value(((WebViewJSSDKImageItem) b).f22268w + "");
                    jSONStringer.endObject();
                }
            }
            jSONStringer.endArray();
            return jSONStringer.toString();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebviewJSSDKUtil", e, "", new Object[0]);
            return "";
        }
    }

    /* renamed from: b */
    public static Intent m47529b(String str) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", FileProviderHelper.getUriForFile(MMApplicationContext.getContext(), new C86009m1(m47530c(str))));
        return intent;
    }

    /* renamed from: c */
    public static String m47530c(String str) {
        if (!(((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_webview_jsapi_choose_image_forbid_new_tmp_path, 0) == 1)) {
            VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
            C86009m1 i0 = C112760b.m154236i0("WebViewImageCache");
            String str2 = i0.mo119971i() + "/" + str + ".jpg";
            Log.m105925i("MicroMsg.WebviewJSSDKUtil", "getTmpFilePath: %s == %s", str, str2);
            return str2;
        }
        C86009m1 m1Var = new C86009m1(C112760b.m154203K());
        if (!m1Var.mo119987x()) {
            Log.m105924i("MicroMsg.WebviewJSSDKUtil", "mkdirs failed.File is exist = " + m1Var.mo119967g());
        }
        if (!m1Var.mo119967g()) {
            Log.m105921e("MicroMsg.WebviewJSSDKUtil", "camera storage path do not exist.(%s)", C112760b.m154203K());
        }
        String str3 = m1Var.mo119971i() + "/" + str + ".jpg";
        Log.m105925i("MicroMsg.WebviewJSSDKUtil", "get file path from capture file name : %s == %s", str, str3);
        return str3;
    }

    /* renamed from: d */
    public static String m47531d(String str) {
        WebViewJSSDKFileItem b = C6080m.Ax0().mo7010b(str);
        if (b != null) {
            Log.m105925i("MicroMsg.WebviewJSSDKUtil", "get orignal filepath from local id :%s", b.f283024g);
            return b.f283024g;
        }
        Log.m105921e("MicroMsg.WebviewJSSDKUtil", "getOrigFilePathByLocalId, local map not contains the local id : %s", str);
        return null;
    }

    /* renamed from: e */
    public static String m47532e(String str) {
        WebViewJSSDKFileItem b = C6080m.Ax0().mo7010b(str);
        if (b != null) {
            Log.m105925i("MicroMsg.WebviewJSSDKUtil", "get local thumb filepath from local id :%s", b.f283023f);
            return b.f283023f;
        }
        Log.m105921e("MicroMsg.WebviewJSSDKUtil", "fromLocalIdToFilePath, local map not contains the local id : %s", str);
        return null;
    }

    /* renamed from: f */
    public static boolean m47533f(String[] strArr, HashMap<String, List<String>> hashMap, String str) {
        if (strArr == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (!Util.isNullOrNil(str2)) {
                String trim = str2.trim();
                if (trim.equalsIgnoreCase(str)) {
                    return true;
                }
                for (String next : hashMap.keySet()) {
                    if (trim.equalsIgnoreCase(next)) {
                        return true;
                    }
                    List list = hashMap.get(next);
                    if (list != null && list.contains(trim)) {
                        return true;
                    }
                }
                continue;
            }
        }
        Log.m105919d("MicroMsg.WebviewJSSDKUtil", "isFileTypeSupport false, acceptType: %s, type: %s", strArr, str);
        return false;
    }

    /* renamed from: g */
    public static String m47534g(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            Log.m105920e("MicroMsg.WebviewJSSDKUtil", "data is null");
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < arrayList.size(); i++) {
            jSONArray.put(arrayList.get(i));
        }
        return jSONArray.toString();
    }

    /* renamed from: h */
    public static String m47535h(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            Log.m105920e("MicroMsg.WebviewJSSDKUtil", "data is null");
            return "";
        }
        JSONStringer jSONStringer = new JSONStringer();
        try {
            jSONStringer.array();
            for (int i = 0; i < arrayList.size(); i++) {
                jSONStringer.object();
                jSONStringer.key(C66261f3.COL_LOCALID);
                jSONStringer.value(arrayList.get(i));
                jSONStringer.endObject();
            }
            jSONStringer.endArray();
            return jSONStringer.toString();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebviewJSSDKUtil", e, "", new Object[0]);
            return "";
        }
    }

    /* renamed from: i */
    public static String m47536i(String str, String str2, int i, int i2, int i3, int i4) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.WebviewJSSDKUtil", "parseVideoItemToJson localId is null");
            return "";
        }
        JSONStringer jSONStringer = new JSONStringer();
        try {
            jSONStringer.array();
            jSONStringer.object();
            jSONStringer.key(C66261f3.COL_LOCALID);
            jSONStringer.value(str);
            jSONStringer.key("thumbLocalId");
            jSONStringer.value(str2);
            jSONStringer.key("duration");
            jSONStringer.value(i + "");
            jSONStringer.key("height");
            jSONStringer.value(i2 + "");
            jSONStringer.key("width");
            jSONStringer.value(i3 + "");
            jSONStringer.key("size");
            jSONStringer.value(i4 + "");
            jSONStringer.endObject();
            jSONStringer.endArray();
            return jSONStringer.toString();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebviewJSSDKUtil", e, "", new Object[0]);
            return "";
        }
    }
}
