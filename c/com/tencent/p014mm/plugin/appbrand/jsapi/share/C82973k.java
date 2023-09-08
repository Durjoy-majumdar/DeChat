package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import android.app.Activity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.k */
public final class C82973k extends C82268c<C82381f> {
    private static final int CTRL_INDEX = 956;
    private static final String NAME = "shareFileMessage";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.k$a */
    public static final class C82974a<R extends AppBrandProxyUIProcessTask.ProcessResult> implements AppBrandProxyUIProcessTask.C81943b {

        /* renamed from: a */
        public final /* synthetic */ Activity f242607a;

        /* renamed from: b */
        public final /* synthetic */ C82381f f242608b;

        /* renamed from: c */
        public final /* synthetic */ int f242609c;

        /* renamed from: d */
        public final /* synthetic */ C82973k f242610d;

        public C82974a(Activity activity, C82381f fVar, int i, C82973k kVar) {
            this.f242607a = activity;
            this.f242608b = fVar;
            this.f242609c = i;
            this.f242610d = kVar;
        }

        public void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
            C82975k0 k0Var;
            ShareToConversationResult shareToConversationResult = (ShareToConversationResult) processResult;
            if (shareToConversationResult == null) {
                Log.m105928w("MicroMsg.AppBrand.JsApiShareFileMessage", "invoke, result is null");
                return;
            }
            int i = shareToConversationResult.f242577d;
            C82975k0[] values = C82975k0.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    k0Var = null;
                    break;
                }
                k0Var = values[i2];
                if (i == k0Var.f242615d) {
                    break;
                }
                i2++;
            }
            if (k0Var == null) {
                Log.m105928w("MicroMsg.AppBrand.JsApiShareFileMessage", "invoke, shareResult is null");
                k0Var = C82975k0.FAIL;
            }
            Log.m105924i("MicroMsg.AppBrand.JsApiShareFileMessage", "invoke, shareResult: " + k0Var);
            int ordinal = k0Var.ordinal();
            if (ordinal == 0) {
                Activity activity = this.f242607a;
                C75026b.m89951a(activity, activity.getString(C0966R.string.euo));
                this.f242608b.mo109647a(this.f242609c, this.f242610d.mo115109j("ok"));
            } else if (ordinal == 1) {
                this.f242608b.mo109647a(this.f242609c, this.f242610d.mo115109j("cancel"));
            } else if (ordinal == 2) {
                this.f242608b.mo109647a(this.f242609c, this.f242610d.mo115109j("fail"));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d0  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r10, org.json.JSONObject r11, int r12) {
        /*
            r9 = this;
            java.lang.String r0 = "MicroMsg.AppBrand.JsApiShareFileMessage"
            if (r10 != 0) goto L_0x000a
            java.lang.String r10 = "invoke, env is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r10)
            return
        L_0x000a:
            android.content.Context r1 = r10.getContext()
            boolean r2 = r1 instanceof android.app.Activity
            r3 = 0
            if (r2 == 0) goto L_0x0016
            android.app.Activity r1 = (android.app.Activity) r1
            goto L_0x0017
        L_0x0016:
            r1 = r3
        L_0x0017:
            if (r1 != 0) goto L_0x0028
            java.lang.String r11 = "invoke, activity is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r11)
            java.lang.String r11 = "fail:activity is null"
            java.lang.String r11 = r9.mo115109j(r11)
            r10.mo109647a(r12, r11)
            return
        L_0x0028:
            if (r11 != 0) goto L_0x0039
            java.lang.String r11 = "invoke, data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r11)
            java.lang.String r11 = "fail:data is null"
            java.lang.String r11 = r9.mo115109j(r11)
            r10.mo109647a(r12, r11)
            return
        L_0x0039:
            java.lang.String r2 = "filePath"
            java.lang.String r4 = r11.optString(r2)
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x004c
            int r7 = r4.length()
            if (r7 != 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r7 = 0
            goto L_0x004d
        L_0x004c:
            r7 = 1
        L_0x004d:
            if (r7 == 0) goto L_0x005e
            java.lang.String r11 = "invoke, filePath is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r11)
            java.lang.String r11 = "fail:filePath is empty"
            java.lang.String r11 = r9.mo115109j(r11)
            r10.mo109647a(r12, r11)
            return
        L_0x005e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "invoke, filePath: "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
            com.tencent.mm.plugin.appbrand.appstorage.h0 r7 = r10.getFileSystem()
            if (r7 == 0) goto L_0x00b2
            com.tencent.mm.vfs.m1 r7 = r7.getAbsoluteFile(r4)
            if (r7 == 0) goto L_0x00b2
            gy3.C87412m.m108593f(r4, r2)
            java.lang.String r2 = "wxfile://"
            boolean r2 = z04.C112551y.m153819s(r4, r2, r6)
            if (r2 != 0) goto L_0x00ad
            com.tencent.mm.plugin.appbrand.appstorage.h0 r2 = r10.getFileSystem()
            if (r2 == 0) goto L_0x00b2
            java.lang.String r8 = r7.getName()
            com.tencent.mm.vfs.m1 r2 = r2.allocTempFile(r8)
            if (r2 == 0) goto L_0x00b2
            java.lang.String r7 = r7.mo119971i()
            java.lang.String r8 = r2.mo119971i()
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106463x(r7, r8)
            if (r7 == 0) goto L_0x00b2
            java.lang.String r2 = r2.mo119971i()
            goto L_0x00b3
        L_0x00ad:
            java.lang.String r2 = r7.mo119971i()
            goto L_0x00b3
        L_0x00b2:
            r2 = r3
        L_0x00b3:
            if (r2 == 0) goto L_0x00be
            int r7 = r2.length()
            if (r7 != 0) goto L_0x00bc
            goto L_0x00be
        L_0x00bc:
            r7 = 0
            goto L_0x00bf
        L_0x00be:
            r7 = 1
        L_0x00bf:
            if (r7 == 0) goto L_0x00d0
            java.lang.String r11 = "invoke, filePath is illegal"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r11)
            java.lang.String r11 = "fail:filePath is illegal"
            java.lang.String r11 = r9.mo115109j(r11)
            r10.mo109647a(r12, r11)
            return
        L_0x00d0:
            java.lang.String r7 = s24.C90124b.m112768c(r2)
            if (r7 == 0) goto L_0x00de
            int r7 = r7.length()
            if (r7 != 0) goto L_0x00dd
            goto L_0x00de
        L_0x00dd:
            r5 = 0
        L_0x00de:
            if (r5 == 0) goto L_0x00e5
            java.lang.String r4 = s24.C90124b.m112768c(r4)
            goto L_0x00e7
        L_0x00e5:
            java.lang.String r4 = ""
        L_0x00e7:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "invoke, fileExt: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r6 = ", realFilePath: "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            java.lang.String r5 = "fileName"
            java.lang.String r11 = r11.optString(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "invoke, fileName: "
            r5.append(r6)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            com.tencent.mm.plugin.appbrand.jsapi.share.ShareFileToConversationRequest r0 = new com.tencent.mm.plugin.appbrand.jsapi.share.ShareFileToConversationRequest
            r0.<init>(r2, r4, r11)
            com.tencent.mm.plugin.appbrand.jsapi.share.k$a r11 = new com.tencent.mm.plugin.appbrand.jsapi.share.k$a
            r11.<init>(r1, r10, r12, r9)
            com.tencent.p014mm.plugin.appbrand.ipc.C81956c.m100675c(r1, r0, r11, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.share.C82973k.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }
}
