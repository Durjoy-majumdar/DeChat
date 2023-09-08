package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.q0 */
public final class C82471q0 extends C82268c {
    private static final int CTRL_INDEX = 117;
    private static final String NAME = "removeSavedFile";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        String optString = jSONObject.optString(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "");
        fVar.mo109647a(i, mo115109j(Util.isNullOrNil(optString) ? "fail:invalid data" : !fVar.getFileSystem().isSavedFile(optString) ? "fail not a store filePath" : fVar.getFileSystem().removeSavedFile(optString) ? "ok" : "fail"));
    }
}
