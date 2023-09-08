package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.os.Bundle;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6210c;
import com.tencent.p014mm.plugin.webview.stub.C6107m;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.m2 */
public class C6279m2 extends C6210c.C6214c {

    /* renamed from: b */
    public final /* synthetic */ String f23088b;

    /* renamed from: c */
    public final /* synthetic */ C6107m f23089c;

    /* renamed from: d */
    public final /* synthetic */ String f23090d;

    /* renamed from: e */
    public final /* synthetic */ JsapiPermissionWrapper f23091e;

    /* renamed from: f */
    public final /* synthetic */ String f23092f;

    /* renamed from: g */
    public final /* synthetic */ C13851h1 f23093g;

    /* renamed from: h */
    public final /* synthetic */ MsgHandler f23094h;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.m2$a */
    public class C6280a extends LinkedList<String> {
        public C6280a(C6279m2 m2Var) {
            add(m2Var.f23092f);
            add(m2Var.f23090d);
        }
    }

    public C6279m2(MsgHandler msgHandler, String str, C6107m mVar, String str2, JsapiPermissionWrapper jsapiPermissionWrapper, String str3, C13851h1 h1Var) {
        this.f23094h = msgHandler;
        this.f23088b = str;
        this.f23089c = mVar;
        this.f23090d = str2;
        this.f23091e = jsapiPermissionWrapper;
        this.f23092f = str3;
        this.f23093g = h1Var;
    }

    /* renamed from: a */
    public void mo7280a(String str) {
        if (!Util.isNullOrNil(str) && this.f23089c != null) {
            Bundle bundle = new Bundle();
            bundle.putString("key_bag_icon", str);
            try {
                this.f23089c.callback(72, bundle);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MsgHandler", "withExtInfo remote ex, %s", e.getMessage());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x023c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7263b(com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6210c.C6211a.C6212a r18, java.lang.String r19, java.util.LinkedList<te3.wp4> r20, int r21, int r22) {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = "UTF-8"
            java.lang.String r3 = ""
            r4 = 0
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r0 = r1.f23094h     // Catch:{ Exception -> 0x0010 }
            com.tencent.mm.plugin.webview.stub.m r0 = r0.f22715x     // Catch:{ Exception -> 0x0010 }
            r5 = 253(0xfd, float:3.55E-43)
            r0.mo7031V5(r5, r4)     // Catch:{ Exception -> 0x0010 }
        L_0x0010:
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r0 = r1.f23094h
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c r0 = r0.f22719z
            java.lang.String r5 = r1.f23088b
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c$d r0 = r0.mo7278d(r5)
            r5 = 1
            java.lang.String r6 = "MicroMsg.MsgHandler"
            r7 = 0
            if (r0 == 0) goto L_0x00ae
            com.tencent.mm.plugin.webview.stub.m r8 = r1.f23089c
            if (r8 == 0) goto L_0x00ae
            android.os.Bundle r8 = new android.os.Bundle     // Catch:{ IOException -> 0x00a3, RemoteException -> 0x0098 }
            r8.<init>()     // Catch:{ IOException -> 0x00a3, RemoteException -> 0x0098 }
            java.lang.String r9 = "__url"
            java.lang.String r10 = r1.f23090d     // Catch:{ IOException -> 0x00a3, RemoteException -> 0x0098 }
            r8.putString(r9, r10)     // Catch:{ IOException -> 0x00a3, RemoteException -> 0x0098 }
            java.lang.String r9 = "__appId"
            java.lang.String r10 = r0.f22925a     // Catch:{ IOException -> 0x00a3, RemoteException -> 0x0098 }
            r8.putString(r9, r10)     // Catch:{ IOException -> 0x00a3, RemoteException -> 0x0098 }
            java.util.List<te3.bk2> r9 = r0.f22927c     // Catch:{ IOException -> 0x00a3, RemoteException -> 0x0098 }
            if (r9 == 0) goto L_0x008b
            java.util.LinkedList r9 = (java.util.LinkedList) r9     // Catch:{ IOException -> 0x00a3, RemoteException -> 0x0098 }
            int r9 = r9.size()     // Catch:{ IOException -> 0x00a3, RemoteException -> 0x0098 }
            if (r9 <= 0) goto L_0x008b
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ IOException -> 0x00a3, RemoteException -> 0x0098 }
            r9.<init>()     // Catch:{ IOException -> 0x00a3, RemoteException -> 0x0098 }
            java.util.List<te3.bk2> r0 = r0.f22927c     // Catch:{ IOException -> 0x00a3, RemoteException -> 0x0098 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x00a3, RemoteException -> 0x0098 }
            r10 = 0
        L_0x004f:
            boolean r11 = r0.hasNext()     // Catch:{ IOException -> 0x0096, RemoteException -> 0x0094 }
            if (r11 == 0) goto L_0x0076
            java.lang.Object r11 = r0.next()     // Catch:{ IOException -> 0x0096, RemoteException -> 0x0094 }
            te3.bk2 r11 = (te3.C48869bk2) r11     // Catch:{ IOException -> 0x0096, RemoteException -> 0x0094 }
            java.lang.String r12 = r11.f131168d     // Catch:{ IOException -> 0x0096, RemoteException -> 0x0094 }
            r9.add(r12)     // Catch:{ IOException -> 0x0096, RemoteException -> 0x0094 }
            java.lang.String r12 = r11.f131168d     // Catch:{ IOException -> 0x0096, RemoteException -> 0x0094 }
            byte[] r13 = r11.toByteArray()     // Catch:{ IOException -> 0x0096, RemoteException -> 0x0094 }
            r8.putByteArray(r12, r13)     // Catch:{ IOException -> 0x0096, RemoteException -> 0x0094 }
            java.lang.String r12 = "wx-open-launch-weapp"
            java.lang.String r11 = r11.f131168d     // Catch:{ IOException -> 0x0096, RemoteException -> 0x0094 }
            boolean r11 = r12.equals(r11)     // Catch:{ IOException -> 0x0096, RemoteException -> 0x0094 }
            if (r11 == 0) goto L_0x004f
            r10 = 1
            goto L_0x004f
        L_0x0076:
            java.lang.String r0 = "doPreVerifyJSAPI webComptList(%s)"
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x0096, RemoteException -> 0x0094 }
            java.lang.String r12 = ", "
            java.lang.String r12 = com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6270l2.m6559a(r12, r9)     // Catch:{ IOException -> 0x0096, RemoteException -> 0x0094 }
            r11[r7] = r12     // Catch:{ IOException -> 0x0096, RemoteException -> 0x0094 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r11)     // Catch:{ IOException -> 0x0096, RemoteException -> 0x0094 }
            java.lang.String r0 = "__webComptList"
            r8.putStringArrayList(r0, r9)     // Catch:{ IOException -> 0x0096, RemoteException -> 0x0094 }
            goto L_0x008c
        L_0x008b:
            r10 = 0
        L_0x008c:
            com.tencent.mm.plugin.webview.stub.m r0 = r1.f23089c     // Catch:{ IOException -> 0x0096, RemoteException -> 0x0094 }
            r9 = 1013(0x3f5, float:1.42E-42)
            r0.callback(r9, r8)     // Catch:{ IOException -> 0x0096, RemoteException -> 0x0094 }
            goto L_0x00af
        L_0x0094:
            r0 = move-exception
            goto L_0x009a
        L_0x0096:
            r0 = move-exception
            goto L_0x00a5
        L_0x0098:
            r0 = move-exception
            r10 = 0
        L_0x009a:
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r9 = "webCompt notify callback"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r9, r8)
            goto L_0x00af
        L_0x00a3:
            r0 = move-exception
            r10 = 0
        L_0x00a5:
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r9 = "webCompt notify serialize"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r9, r8)
            goto L_0x00af
        L_0x00ae:
            r10 = 0
        L_0x00af:
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c$a$a r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6210c.C6211a.C6212a.RET_OK
            java.lang.String r11 = "doPreVerifyJSAPI remote ex, %s"
            r12 = r18
            if (r12 != r0) goto L_0x023c
            com.tencent.mm.protocal.JsapiPermissionWrapper r0 = r1.f23091e
            byte[] r0 = r0.f121048d
            if (r0 == 0) goto L_0x023c
            java.util.LinkedList r12 = new java.util.LinkedList
            r12.<init>()
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r0 = r1.f23094h
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r0.f22680I = r13
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            com.tencent.mm.plugin.webview.stub.m r0 = r1.f23089c
            r14 = 2
            if (r0 == 0) goto L_0x0196
            if (r20 == 0) goto L_0x0196
            int r0 = r20.size()
            if (r0 <= 0) goto L_0x0196
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "["
            r15.<init>(r0)
            java.util.Iterator r16 = r20.iterator()
        L_0x00ec:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0161
            java.lang.Object r0 = r16.next()
            te3.wp4 r0 = (te3.wp4) r0
            com.tencent.mm.plugin.webview.core.f0 r4 = com.tencent.p014mm.plugin.webview.core.C5843f0.f22025a
            java.lang.String r9 = r0.f144209d
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r9)
            qe3.c$h r4 = r4.mo6894a(r9)
            if (r4 != 0) goto L_0x011b
            java.lang.Object[] r4 = new java.lang.Object[r14]
            java.lang.String r9 = r0.f144209d
            r4[r7] = r9
            int r0 = r0.f144210e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4[r5] = r0
            java.lang.String r0 = "doPreVerifyJSAPI updateJsApi permission failed, func do not exist(%s, %d)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r4)
            r4 = 0
            goto L_0x00ec
        L_0x011b:
            int r9 = r0.f144210e
            if (r9 != 0) goto L_0x0124
            java.lang.String r9 = r4.f35268a
            r12.add(r9)
        L_0x0124:
            java.lang.String r9 = r0.f144209d
            java.lang.String r14 = "launchMiniProgram"
            boolean r9 = r14.equals(r9)
            if (r9 == 0) goto L_0x0133
            int r9 = r0.f144210e
            if (r9 != r5) goto L_0x0133
            r10 = 1
        L_0x0133:
            java.lang.String r9 = r4.f35268a     // Catch:{ Exception -> 0x0156 }
            byte[] r14 = r0.toByteArray()     // Catch:{ Exception -> 0x0156 }
            r8.putByteArray(r9, r14)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r9 = r4.f35268a     // Catch:{ Exception -> 0x0156 }
            r13.add(r9)     // Catch:{ Exception -> 0x0156 }
            int r4 = r4.f35270c     // Catch:{ Exception -> 0x0156 }
            r15.append(r4)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r4 = ":"
            r15.append(r4)     // Catch:{ Exception -> 0x0156 }
            int r0 = r0.f144210e     // Catch:{ Exception -> 0x0156 }
            r15.append(r0)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r0 = ","
            r15.append(r0)     // Catch:{ Exception -> 0x0156 }
            goto L_0x015e
        L_0x0156:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.String r9 = "parse jsapi verify data"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r9, r4)
        L_0x015e:
            r4 = 0
            r14 = 2
            goto L_0x00ec
        L_0x0161:
            java.lang.String r0 = "]"
            r15.append(r0)
            java.lang.String r0 = "jsapi_preverify_fun_list"
            r8.putStringArrayList(r0, r13)
            java.lang.String r0 = r1.f23090d
            java.lang.String r4 = "jsapi_preverify_commit_url"
            r8.putString(r4, r0)
            java.lang.String r0 = r1.f23092f
            java.lang.String r4 = "jsapi_preverify_current_url"
            r8.putString(r4, r0)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r7] = r15
            java.lang.String r4 = "doPreVerifyJSAPI updateJsApis permission(%s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r0)
            com.tencent.mm.plugin.webview.stub.m r0 = r1.f23089c     // Catch:{ Exception -> 0x018a }
            r4 = 1006(0x3ee, float:1.41E-42)
            r0.callback(r4, r8)     // Catch:{ Exception -> 0x018a }
            goto L_0x0196
        L_0x018a:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.String r0 = r0.getMessage()
            r4[r7] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r11, r4)
        L_0x0196:
            int r0 = r12.size()
            java.lang.String r4 = "pre_verify_jsapi:ok"
            if (r0 != 0) goto L_0x01a7
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r0 = r1.f23094h
            t83.h1 r8 = r1.f23093g
            r9 = 0
            r0.mo7210k5(r8, r4, r9)
            goto L_0x01d2
        L_0x01a7:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r5)
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ Exception -> 0x01c2 }
            r8.<init>(r12)     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r9 = "noPermissionJsApi"
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x01c2 }
            r0.put(r9, r8)     // Catch:{ Exception -> 0x01c2 }
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r8 = r1.f23094h     // Catch:{ Exception -> 0x01c2 }
            t83.h1 r9 = r1.f23093g     // Catch:{ Exception -> 0x01c2 }
            r8.mo7210k5(r9, r4, r0)     // Catch:{ Exception -> 0x01c2 }
            goto L_0x01d2
        L_0x01c2:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r0 = r1.f23094h
            t83.h1 r8 = r1.f23093g
            r9 = 0
            r0.mo7210k5(r8, r4, r9)
        L_0x01d2:
            if (r10 == 0) goto L_0x0292
            java.lang.String r0 = r1.f23092f     // Catch:{ Exception -> 0x0235 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0235 }
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r2)     // Catch:{ Exception -> 0x0235 }
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r4 = r1.f23094h     // Catch:{ Exception -> 0x0235 }
            com.tencent.mm.plugin.webview.stub.m r4 = r4.f22715x     // Catch:{ Exception -> 0x0235 }
            r8 = 1020(0x3fc, float:1.43E-42)
            r9 = 0
            android.os.Bundle r4 = r4.mo7031V5(r8, r9)     // Catch:{ Exception -> 0x0235 }
            java.lang.String r8 = "key_get_a8key_req_params_scene"
            int r8 = r4.getInt(r8)     // Catch:{ Exception -> 0x0235 }
            java.lang.String r9 = "key_get_a8key_req_params_username"
            java.lang.String r4 = r4.getString(r9, r3)     // Catch:{ Exception -> 0x0235 }
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r9 = r1.f23094h     // Catch:{ Exception -> 0x0235 }
            com.tencent.mm.plugin.webview.stub.m r9 = r9.f22715x     // Catch:{ Exception -> 0x0235 }
            r10 = 84
            r11 = 0
            android.os.Bundle r9 = r9.mo7031V5(r10, r11)     // Catch:{ Exception -> 0x0235 }
            java.lang.String r10 = "webview_current_title"
            java.lang.String r10 = r9.getString(r10)     // Catch:{ Exception -> 0x0235 }
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r10)     // Catch:{ Exception -> 0x0235 }
            java.lang.String r2 = java.net.URLEncoder.encode(r10, r2)     // Catch:{ Exception -> 0x0235 }
            java.lang.String r10 = "KAppId"
            java.lang.String r9 = r9.getString(r10)     // Catch:{ Exception -> 0x0235 }
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0235 }
            r11 = 25428(0x6354, float:3.5632E-41)
            r12 = 5
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0235 }
            r12[r7] = r0     // Catch:{ Exception -> 0x0235 }
            r12[r5] = r2     // Catch:{ Exception -> 0x0235 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0235 }
            r2 = 2
            r12[r2] = r0     // Catch:{ Exception -> 0x0235 }
            r0 = 3
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r9)     // Catch:{ Exception -> 0x0235 }
            r12[r0] = r2     // Catch:{ Exception -> 0x0235 }
            r0 = 4
            r12[r0] = r4     // Catch:{ Exception -> 0x0235 }
            r10.mo160131h(r11, r12)     // Catch:{ Exception -> 0x0235 }
            goto L_0x0292
        L_0x0235:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r7]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r3, r2)
            goto L_0x0292
        L_0x023c:
            java.lang.String r0 = "doPreVerifyJSAPI fail, callback and do nothing"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)     // Catch:{ Exception -> 0x0249 }
            com.tencent.mm.plugin.webview.stub.m r0 = r1.f23089c     // Catch:{ Exception -> 0x0249 }
            r2 = 1006(0x3ee, float:1.41E-42)
            r0.callback(r2, r8)     // Catch:{ Exception -> 0x0249 }
            goto L_0x0255
        L_0x0249:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r0 = r0.getMessage()
            r2[r7] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r11, r2)
        L_0x0255:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r5)
            com.tencent.mm.plugin.webview.ui.tools.jsapi.m2$a r2 = new com.tencent.mm.plugin.webview.ui.tools.jsapi.m2$a
            r2.<init>(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "realAuthUrl"
            r0.put(r3, r2)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r19)
            if (r2 == 0) goto L_0x0278
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r2 = r1.f23094h
            t83.h1 r3 = r1.f23093g
            java.lang.String r4 = "pre_verify_jsapi:fail"
            r2.mo7210k5(r3, r4, r0)
            goto L_0x0292
        L_0x0278:
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r2 = r1.f23094h
            t83.h1 r3 = r1.f23093g
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "pre_verify_jsapi:fail_"
            r4.append(r5)
            r5 = r19
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r2.mo7210k5(r3, r4, r0)
        L_0x0292:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6279m2.mo7263b(com.tencent.mm.plugin.webview.ui.tools.jsapi.c$a$a, java.lang.String, java.util.LinkedList, int, int):void");
    }
}
