package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.s */
public final class C82477s extends C82268c {
    private static final int CTRL_INDEX = 116;
    private static final String NAME = "getSavedFileInfo";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.s$a */
    public class C82478a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C82381f f241542d;

        /* renamed from: e */
        public final /* synthetic */ String f241543e;

        /* renamed from: f */
        public final /* synthetic */ int f241544f;

        public C82478a(C82381f fVar, String str, int i) {
            this.f241542d = fVar;
            this.f241543e = str;
            this.f241544f = i;
        }

        public void run() {
            if (this.f241542d.isRunning()) {
                C86009m1 absoluteFile = this.f241542d.getFileSystem().getAbsoluteFile(this.f241543e);
                if (absoluteFile == null) {
                    this.f241542d.mo109647a(this.f241544f, C82477s.this.mo115109j(String.format(Locale.US, "fail no such file \"%s\"", new Object[]{this.f241543e})));
                    return;
                }
                HashMap hashMap = new HashMap(3);
                hashMap.put("size", Long.valueOf(absoluteFile.mo119980r()));
                hashMap.put("createTime", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(absoluteFile.mo119979q())));
                this.f241542d.mo109647a(this.f241544f, C82477s.this.mo115112m("ok", hashMap));
            }
        }
    }

    /* renamed from: t */
    public boolean mo1769t() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        String optString = jSONObject.optString(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "");
        if (Util.isNullOrNil(optString)) {
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
        } else {
            C82421e.f241505h.execute(new C82478a(fVar, optString, i));
        }
    }
}
