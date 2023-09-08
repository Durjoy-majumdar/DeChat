package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81439t0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p749xh.C66261f3;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.i0 */
public final class C82447i0 extends C82268c {
    private static final int CTRL_INDEX = 778;
    private static final String NAME = "private_fileSystemConvert";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Log.m105925i("MicroMsg.AppBrand.JsApiPrivateFileSystem", "hy: %s %s", NAME, jSONObject.toString());
        String optString = jSONObject.optString("operationType", "");
        if (optString.equalsIgnoreCase("getAbsolutePath")) {
            String optString2 = jSONObject.optString(C66261f3.COL_LOCALID);
            if (Util.isNullOrNil(optString2)) {
                fVar.mo109647a(i, mo115109j(String.format("fail: parmas error %s", new Object[]{jSONObject.toString()})));
                return;
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, optString2);
                if (optString2.contains("wxfile://")) {
                    C86009m1 absoluteFile = fVar.getFileSystem().getAbsoluteFile(optString2);
                    if (absoluteFile == null) {
                        fVar.mo109647a(i, mo115109j("fail:file doesn't exist"));
                        fVar.mo109647a(i, mo115109j(String.format("fail: %s not exists", new Object[]{optString2})));
                        return;
                    }
                    jSONObject2.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, absoluteFile.mo119971i());
                }
                fVar.mo109647a(i, jSONObject2.toString());
            } catch (JSONException e) {
                fVar.mo109647a(i, mo115109j(String.format("fail: error %s", new Object[]{e.getMessage()})));
            }
        } else if (optString.equalsIgnoreCase("getWxFilePath")) {
            try {
                String optString3 = jSONObject.optString(DownloadInfo.FILENAME);
                if (Util.isNullOrNil(optString3)) {
                    optString3 = "private_fileSystemConvert_" + System.currentTimeMillis();
                }
                String optString4 = jSONObject.optString("mimeType");
                boolean optBoolean = jSONObject.optBoolean("autoDeleteIfExists", true);
                if (Util.isNullOrNil(optString4)) {
                    fVar.mo109647a(i, mo115109j(String.format("fail: parmas error %s", new Object[]{jSONObject.toString()})));
                    return;
                }
                String str = optString3 + "." + optString4;
                String w = mo114817w(fVar, str);
                if (Util.isNullOrNil(w)) {
                    fVar.mo109647a(i, mo115109j("fail: getAbsoluteFile failed"));
                    return;
                }
                if (optBoolean && C86013q1.m106450k(w)) {
                    C86013q1.m106447h(w);
                }
                String s = C86013q1.m106458s(w);
                C86013q1.m106461v(s);
                Log.m105929w("MicroMsg.AppBrand.JsApiPrivateFileSystem", "hy: getWxFilePath, fileName: %s, relativeFilePath: %s, relativeFileName: %s, parentAbsolutePath: %s!", optString3, str, w, s);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, w);
                jSONObject3.put(C66261f3.COL_LOCALID, "wxfile://clientdata/" + str);
                fVar.mo109647a(i, jSONObject3.toString());
            } catch (JSONException e2) {
                fVar.mo109647a(i, mo115109j(String.format("fail: error %s", new Object[]{e2.getMessage()})));
                Log.printErrStackTrace("MicroMsg.AppBrand.JsApiPrivateFileSystem", e2, "hy: json error!", new Object[0]);
            }
        } else {
            Log.m105921e("MicroMsg.AppBrand.JsApiPrivateFileSystem", "hy: invalid operate type: %s", optString);
            fVar.mo109647a(i, mo115109j(String.format("fail: not valid operate type: %s", new Object[]{optString})));
        }
    }

    /* renamed from: w */
    public final String mo114817w(C82381f fVar, String str) {
        if (fVar == null || Util.isNullOrNil(str)) {
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(fVar == null);
            objArr[1] = str;
            Log.m105929w("MicroMsg.AppBrand.JsApiPrivateFileSystem", "hy: param error %b, %s", objArr);
            return null;
        }
        C82419d1 d1Var = (C82419d1) fVar.getFileSystem();
        if (d1Var == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiPrivateFileSystem", "hy: fs is null");
            return null;
        }
        String str2 = ((C81439t0) d1Var.mo113747a("wxfile://clientdata")).f238992d;
        if (!str2.endsWith("/")) {
            str2 = str2 + "/";
        }
        C86009m1 m1Var = new C86009m1(str2 + FilePathGenerator.NO_MEDIA_FILENAME);
        if (!m1Var.mo119967g()) {
            Log.m105924i("MicroMsg.AppBrand.JsApiPrivateFileSystem", "hy: no nomedia file. trigger new");
            try {
                m1Var.mo119964e();
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.AppBrand.JsApiPrivateFileSystem", e, "hy: create no media file failed!", new Object[0]);
            }
        }
        return str2 + str;
    }
}
