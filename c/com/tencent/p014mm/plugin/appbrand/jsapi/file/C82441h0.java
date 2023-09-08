package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.OpenFileRequest;
import com.tencent.p014mm.plugin.multitask.C105919k;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import d92.C45293c;
import di3.C86312j;
import java.io.IOException;
import java.util.List;
import l92.C109294b;
import org.json.JSONObject;
import qp0.C89783a;
import s24.C90124b;
import te3.C101828pe0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.h0 */
public final class C82441h0 extends C82268c {
    private static final int CTRL_INDEX = 99;
    private static final String NAME = "openDocument";

    /* renamed from: n */
    public static long f241524n = -1;

    /* renamed from: g */
    public String f241525g;

    /* renamed from: h */
    public C89783a f241526h;

    /* renamed from: i */
    public C109294b f241527i = new C82444c();

    /* renamed from: j */
    public C109294b f241528j = new C82445d();

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.h0$a */
    public class C82442a implements AppBrandProxyUIProcessTask.C81943b<OpenFileRequest.OpenResult> {

        /* renamed from: a */
        public final /* synthetic */ C82381f f241529a;

        /* renamed from: b */
        public final /* synthetic */ Context f241530b;

        /* renamed from: c */
        public final /* synthetic */ int f241531c;

        public C82442a(C82381f fVar, Context context, int i) {
            this.f241529a = fVar;
            this.f241530b = context;
            this.f241531c = i;
        }

        public void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
            String str;
            int i;
            OpenFileRequest.OpenResult openResult = (OpenFileRequest.OpenResult) processResult;
            if (this.f241529a.isRunning()) {
                if (openResult == null || (i = openResult.f241478d) == 2147483645) {
                    str = "fail env error";
                } else if (i != 0) {
                    switch (i) {
                        case 2147483646:
                            str = "fail no third apps supported";
                            break;
                        case Integer.MAX_VALUE:
                            str = "fail user cancel";
                            break;
                        default:
                            str = "fail file type not supported " + openResult.f241478d;
                            break;
                    }
                } else {
                    C82441h0.this.f241526h = new C89783a(new C45293c((Activity) this.f241530b));
                    str = "ok";
                }
                this.f241529a.mo109647a(this.f241531c, C82441h0.this.mo115109j(str));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.h0$b */
    public class C82443b extends C83231l.C83234d {

        /* renamed from: d */
        public final /* synthetic */ C82381f f241533d;

        public C82443b(C82381f fVar) {
            this.f241533d = fVar;
        }

        /* renamed from: c */
        public void mo109497c() {
            C89783a aVar = C82441h0.this.f241526h;
            if (aVar != null) {
                aVar.getClass();
                C82441h0.this.f241526h = null;
            }
            C83231l.m102144e(this.f241533d.getAppId(), this);
        }

        /* renamed from: e */
        public void mo74049e(C83231l.C83235e eVar) {
            C82441h0 h0Var = C82441h0.this;
            if (h0Var.f241526h != null) {
                ((C105919k) C86312j.m106911c(C105919k.class)).mo151033H3(h0Var.f241528j);
            }
        }

        /* renamed from: f */
        public void mo109498f() {
            C82441h0 h0Var = C82441h0.this;
            if (h0Var.f241526h != null) {
                ((C105919k) C86312j.m106911c(C105919k.class)).mo151033H3(h0Var.f241527i);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.h0$c */
    public class C82444c implements C109294b {
        public C82444c() {
        }

        /* renamed from: a */
        public void mo114815a(List<MultiTaskInfo> list) {
            C89783a aVar;
            for (MultiTaskInfo next : list) {
                if (!(next == null || next.field_type != 4 || next.field_data == null)) {
                    C101828pe0 pe02 = new C101828pe0();
                    try {
                        pe02.parseFrom(next.field_data);
                    } catch (Throwable th) {
                        Log.m105921e("MicroMsg.AppBrand.JsApiOpenDocument", "handleMultiTaskInfoClicked", th);
                    }
                    if (Util.nullAsNil(pe02.f299163g).equals(C82441h0.this.f241525g) && (aVar = C82441h0.this.f241526h) != null) {
                        aVar.mo124069Z(MMApplicationContext.getProcessName());
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.h0$d */
    public class C82445d implements C109294b {
        public C82445d() {
        }

        /* renamed from: a */
        public void mo114815a(List<MultiTaskInfo> list) {
            C89783a aVar;
            for (MultiTaskInfo next : list) {
                if (!(next == null || next.field_type != 4 || next.field_data == null)) {
                    C101828pe0 pe02 = new C101828pe0();
                    try {
                        pe02.parseFrom(next.field_data);
                    } catch (Throwable th) {
                        Log.m105921e("MicroMsg.AppBrand.JsApiOpenDocument", "handleMultiTaskInfoClicked", th);
                    }
                    if (Util.nullAsNil(pe02.f299164h).equals(MMApplicationContext.getProcessName()) && (aVar = C82441h0.this.f241526h) != null) {
                        aVar.mo124069Z("");
                    }
                }
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        long nowMilliSecond = Util.nowMilliSecond();
        if (nowMilliSecond - f241524n < 1000) {
            fVar.mo109647a(i, mo115109j("fail:document viewer already starting"));
            return;
        }
        f241524n = nowMilliSecond;
        Context context = fVar.getContext();
        if (context == null || !(context instanceof Activity)) {
            fVar.mo109647a(i, mo115109j("fail"));
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("showMenu");
        String optString = jSONObject.optString(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        if (Util.isNullOrNil(optString)) {
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        C86009m1 absoluteFile = fVar.getFileSystem().getAbsoluteFile(optString);
        if (absoluteFile == null) {
            fVar.mo109647a(i, mo115109j("fail:file doesn't exist"));
            return;
        }
        this.f241525g = fVar.getAppId();
        String c = C90124b.m112768c(optString);
        OpenFileRequest openFileRequest = new OpenFileRequest();
        String str = null;
        if (!(absoluteFile == null || fVar.getFileSystem() == null)) {
            String i2 = absoluteFile.mo119971i();
            if (!Util.nullAsNil(i2).endsWith(c)) {
                Log.m105924i("MicroMsg.AppBrand.JsApiOpenDocument", "create new temp file for suffix");
                C86009m1 allocTempFile = fVar.getFileSystem().allocTempFile(String.format("%s.%s", new Object[]{absoluteFile.getName(), c}));
                if (allocTempFile != null) {
                    if (!allocTempFile.mo119967g()) {
                        try {
                            allocTempFile.mo119964e();
                        } catch (IOException unused) {
                        }
                    }
                    C86013q1.m106442c(i2, allocTempFile.mo119971i());
                    if (allocTempFile.mo119967g() && allocTempFile.mo119980r() == absoluteFile.mo119980r()) {
                        str = allocTempFile.mo119971i();
                    }
                }
            }
            str = absoluteFile.mo119971i();
        }
        openFileRequest.f241474d = str;
        openFileRequest.f241475e = c;
        openFileRequest.f241476f = this.f241525g;
        openFileRequest.f241477g = optBoolean;
        String optString2 = jSONObject.optString("fileType");
        if (!Util.isNullOrNil(optString2)) {
            openFileRequest.f241475e = optString2;
        }
        C81956c.m100674b(context, openFileRequest, new C82442a(fVar, context, i));
        C83231l.m102140a(fVar.getAppId(), new C82443b(fVar));
    }
}
