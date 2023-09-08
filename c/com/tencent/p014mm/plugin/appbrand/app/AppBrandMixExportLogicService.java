package com.tencent.p014mm.plugin.appbrand.app;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.tencent.luggage.sdk.processes.LuggageServiceType;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage;
import com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent;
import com.tencent.p014mm.plugin.appbrand.C83727p2;
import com.tencent.p014mm.plugin.appbrand.C84079q3;
import com.tencent.p014mm.plugin.appbrand.app.C81194z;
import com.tencent.p014mm.plugin.appbrand.appcache.C81243g;
import com.tencent.p014mm.plugin.appbrand.appcache.predownload.export.C81331p;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProcessProxyUI;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandTaskProxyUI;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.ipc.C81964j;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.OpenFileRequest;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi.C83568b;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi.C83570c;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import di0.C86299o;
import di3.C7335d;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import es0.C31689g;
import es0.C31690h;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kr0.C33987b1;
import kr0.C76630x0;
import kr0.C88273g1;
import kr0.C88274h0;
import org.json.JSONException;
import org.json.JSONObject;
import s00.C90110f;
import zt3.C119157j;

@C86522b(dependencies = {C81161g2.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.appbrand.app.AppBrandMixExportLogicService */
public class AppBrandMixExportLogicService extends C86301e implements C88274h0 {

    /* renamed from: com.tencent.mm.plugin.appbrand.app.AppBrandMixExportLogicService$a */
    public class C29096a implements Runnable {
        public C29096a(AppBrandMixExportLogicService appBrandMixExportLogicService) {
        }

        public void run() {
            C31690h.f84637a.mo58306a();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.app.AppBrandMixExportLogicService$AppBrandOnStartReportCanvasDataEvent */
    public static final class AppBrandOnStartReportCanvasDataEvent implements Parcelable {
        public static final Parcelable.Creator<AppBrandOnStartReportCanvasDataEvent> CREATOR = new C81134a();

        /* renamed from: d */
        public String f238429d;

        /* renamed from: com.tencent.mm.plugin.appbrand.app.AppBrandMixExportLogicService$AppBrandOnStartReportCanvasDataEvent$a */
        public class C81134a implements Parcelable.Creator<AppBrandOnStartReportCanvasDataEvent> {
            public Object createFromParcel(Parcel parcel) {
                return new AppBrandOnStartReportCanvasDataEvent(parcel);
            }

            public Object[] newArray(int i) {
                return new AppBrandOnStartReportCanvasDataEvent[i];
            }
        }

        public AppBrandOnStartReportCanvasDataEvent() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f238429d);
        }

        public AppBrandOnStartReportCanvasDataEvent(Parcel parcel) {
            this.f238429d = parcel.readString();
        }
    }

    /* renamed from: AC */
    public void mo113299AC(C88273g1 g1Var) {
        AppBrandProcessesManager.m103869I().mo116954S(LuggageServiceType.WASERVICE, g1Var);
    }

    /* renamed from: BB */
    public Pair<Integer, String> mo113300BB(Context context, WXLaunchWxaRedirectingPage.Req req, String str, String str2, String str3) {
        String str4;
        WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage;
        Context context2 = context;
        WXLaunchWxaRedirectingPage.Req req2 = req;
        String str5 = str3;
        String str6 = "__wx__/open-api-redirecting-page";
        String str7 = "";
        Uri parse = Uri.parse(str2);
        String queryParameter = parse.getQueryParameter("host_appid");
        boolean z = true;
        int i = Util.getInt(parse.getQueryParameter("wxa_scene"), 1);
        AppBrandLaunchReferrer appBrandLaunchReferrer = new AppBrandLaunchReferrer();
        appBrandLaunchReferrer.f239396d = 7;
        appBrandLaunchReferrer.f239397e = queryParameter;
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str5).optString("invokeData"));
            str4 = jSONObject.getString("miniprogramAppID");
            String optString = jSONObject.optString("path", str6);
            jSONObject.put("invokeTicket", req2.invokeTicket);
            jSONObject.put("wxa_scene", i);
            jSONObject.put("packageName", str);
            jSONObject.put("callbackActivity", req2.callbackActivity);
            wechatNativeExtraDataInvokeFunctionalPage = new WechatNativeExtraDataInvokeFunctionalPage((String) null, (String) null, (String) null, (String) null, false, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 16383, (C8480h) null);
            wechatNativeExtraDataInvokeFunctionalPage.mo115870b(jSONObject);
            str7 = wechatNativeExtraDataInvokeFunctionalPage.f244092e;
            str6 = optString;
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.AppBrandMixExportLogicService", "openWeappFunctionalPageByDeepLink, get JSONException %s", e);
            wechatNativeExtraDataInvokeFunctionalPage = null;
            str4 = str7;
        }
        if (TextUtils.isEmpty(str7) || TextUtils.isEmpty(str4) || wechatNativeExtraDataInvokeFunctionalPage == null) {
            Log.m105921e("MicroMsg.AppBrandMixExportLogicService", "openWeappFunctionalPageByDeepLink invalid apiName(%s) miniprogramAppID(%s) transferBuffer(%s)", str7, str4, str5);
            return Pair.create(-1, "Invalid transferJson");
        }
        C86299o oVar = new C86299o();
        oVar.f250930b = str4;
        oVar.f250934f = str6;
        oVar.f250939k = 1111;
        oVar.f250940l = queryParameter + XVFSFile.PATH_SEPARATOR + str7;
        oVar.f250947s = appBrandLaunchReferrer;
        oVar.f250937i = wechatNativeExtraDataInvokeFunctionalPage;
        oVar.f250931c = wechatNativeExtraDataInvokeFunctionalPage.f244102r;
        HashMap<String, C83568b> hashMap = C83570c.f244117a;
        C87412m.m108594g(context2, "context");
        C83568b bVar = C83570c.f244117a.get(wechatNativeExtraDataInvokeFunctionalPage.f244092e);
        if (bVar == null) {
            z = false;
        } else {
            Log.m105924i("MicroMsg.AppBrand.FunctionalDirectApiInterceptor", "intercept by directApi[" + bVar.mo115909c() + ']');
            bVar.mo115907a(wechatNativeExtraDataInvokeFunctionalPage, oVar);
        }
        if (z) {
            return Pair.create(0, "OK");
        }
        Objects.requireNonNull(str7);
        if (str7.endsWith("openUrl")) {
            ((C90110f) C86312j.m106911c(C90110f.class)).mo124149ID("com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
        }
        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(context2, oVar);
        return Pair.create(0, "OK");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ca, code lost:
        if (r1 != null) goto L_0x00cc;
     */
    /* renamed from: Gt */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.tencent.p014mm.plugin.appbrand.appstorage.C81427p> mo113301Gt() {
        /*
            r34 = this;
            com.tencent.mm.plugin.appbrand.AppBrandFileCleaner$a r1 = com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner.f238096a
            java.lang.Class<com.tencent.mm.plugin.appbrand.appusage.d0> r0 = com.tencent.p014mm.plugin.appbrand.appusage.C81477d0.class
            java.lang.String r2 = "getAllAppBrandStorageInfo cost %dms"
            java.lang.String r3 = "MicroMsg.AppBrandFileCleaner"
            java.lang.String r4 = "start calculate appbrand storage usage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            com.tencent.mm.plugin.appbrand.n4 r6 = new com.tencent.mm.plugin.appbrand.n4
            com.tencent.mm.plugin.appbrand.k<T> r7 = com.tencent.p014mm.plugin.appbrand.C83191k.f242991d
            r6.<init>(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.Class<com.tencent.mm.plugin.appbrand.appusage.r> r8 = com.tencent.p014mm.plugin.appbrand.appusage.C29384r.class
            java.lang.Object r8 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r8)
            com.tencent.mm.plugin.appbrand.appusage.r r8 = (com.tencent.p014mm.plugin.appbrand.appusage.C29384r) r8
            java.lang.String r9 = "attributes.%s,"
            java.lang.String r10 = "WxaAttributesTable"
            java.lang.String r11 = "AppBrandAppLaunchUsernameDuplicateRecord2"
            java.lang.String r12 = "attributes.*"
            java.lang.String r13 = "nickname"
            java.lang.String r14 = "brandIconURL"
            java.lang.String r15 = "appId"
            r16 = 2
            r17 = r12
            if (r8 == 0) goto L_0x00d3
            java.lang.String[] r20 = new java.lang.String[]{r15, r14, r13}
            boolean r21 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String[]) r20)
            if (r21 == 0) goto L_0x0052
            r26 = r1
            r24 = r2
            r22 = r4
            r25 = r6
            r1 = r17
            r2 = 1
            r4 = 3
            r6 = 0
            goto L_0x008f
        L_0x0052:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r22 = r4
            r4 = 0
        L_0x005a:
            r5 = 3
            if (r4 >= r5) goto L_0x007d
            r5 = r20[r4]
            r24 = r2
            java.util.Locale r2 = java.util.Locale.US
            r26 = r1
            r25 = r6
            r6 = 1
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r6 = 0
            r1[r6] = r5
            java.lang.String r1 = java.lang.String.format(r2, r9, r1)
            r12.append(r1)
            int r4 = r4 + 1
            r2 = r24
            r6 = r25
            r1 = r26
            goto L_0x005a
        L_0x007d:
            r26 = r1
            r24 = r2
            r25 = r6
            r6 = 0
            int r1 = r12.length()
            r2 = 1
            int r1 = r1 - r2
            java.lang.String r1 = r12.substring(r6, r1)
            r4 = 3
        L_0x008f:
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r6] = r1
            r5[r2] = r11
            r5[r16] = r10
            java.lang.String r1 = "select %s from %s as duplicate inner join %s as attributes where duplicate.username = attributes.username"
            java.lang.String r1 = java.lang.String.format(r1, r5)
            java.lang.String[] r2 = new java.lang.String[r6]
            android.database.Cursor r1 = r8.rawQuery(r1, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r1 == 0) goto L_0x00ca
            int r4 = r1.getColumnCount()     // Catch:{ all -> 0x00c5 }
            r5 = 1
            if (r4 >= r5) goto L_0x00b3
            goto L_0x00ca
        L_0x00b3:
            boolean r4 = r1.moveToNext()     // Catch:{ all -> 0x00c5 }
            if (r4 == 0) goto L_0x00cc
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r4 = new com.tencent.mm.plugin.appbrand.config.WxaAttributes     // Catch:{ all -> 0x00c5 }
            r4.<init>()     // Catch:{ all -> 0x00c5 }
            r4.convertFrom(r1)     // Catch:{ all -> 0x00c5 }
            r2.add(r4)     // Catch:{ all -> 0x00c5 }
            goto L_0x00b3
        L_0x00c5:
            r0 = move-exception
            r1.close()
            throw r0
        L_0x00ca:
            if (r1 == 0) goto L_0x00cf
        L_0x00cc:
            r1.close()
        L_0x00cf:
            r7.addAll(r2)
            goto L_0x00db
        L_0x00d3:
            r26 = r1
            r24 = r2
            r22 = r4
            r25 = r6
        L_0x00db:
            java.lang.Object r1 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r0)
            com.tencent.mm.plugin.appbrand.appusage.d0 r1 = (com.tencent.p014mm.plugin.appbrand.appusage.C81477d0) r1
            if (r1 == 0) goto L_0x01d1
            java.lang.String[] r4 = new java.lang.String[]{r15, r14, r13}
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 3
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r4, r6)
            java.lang.String[] r8 = (java.lang.String[]) r8
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String[]) r8)
            java.lang.String r12 = "format(locale, format, *args)"
            if (r8 == 0) goto L_0x0102
            r20 = r3
            r4 = r17
            r2 = 1
            r3 = 0
            goto L_0x013b
        L_0x0102:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r13 = 0
        L_0x0108:
            if (r13 >= r6) goto L_0x012e
            r6 = r4[r13]
            java.util.Locale r14 = java.util.Locale.US
            r19 = r4
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r20 = r3
            r3 = 0
            r4[r3] = r6
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r2)
            java.lang.String r4 = java.lang.String.format(r14, r9, r4)
            gy3.C87412m.m108593f(r4, r12)
            r8.append(r4)
            int r13 = r13 + 1
            r4 = r19
            r3 = r20
            r6 = 3
            goto L_0x0108
        L_0x012e:
            r20 = r3
            r2 = 1
            r3 = 0
            int r4 = r8.length()
            int r4 = r4 - r2
            java.lang.String r4 = r8.substring(r3, r4)
        L_0x013b:
            java.util.Locale r6 = java.util.Locale.US
            r8 = 11
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r9[r3] = r4
            r9[r2] = r10
            r9[r16] = r11
            java.lang.String r2 = "username"
            r3 = 3
            r9[r3] = r2
            r3 = 4
            r9[r3] = r2
            r3 = 5
            java.lang.String r4 = "AppBrandMessInfoRecord"
            r9[r3] = r4
            r3 = 6
            r9[r3] = r15
            r3 = 7
            r9[r3] = r15
            r3 = 8
            r9[r3] = r2
            r2 = 9
            java.lang.String r3 = "lastLaunchTime"
            r9[r2] = r3
            r2 = 1
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 10
            r9[r3] = r2
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r9, r8)
            java.lang.String r3 = "select %s from %s as attributes left join %s as duplicate on attributes.%s = duplicate.%s left join %s as messInfo on attributes.%s = messInfo.%s where duplicate.%s is null and messInfo.%s >= %d"
            java.lang.String r2 = java.lang.String.format(r6, r3, r2)
            gy3.C87412m.m108593f(r2, r12)
            r3 = 0
            java.lang.String[] r4 = new java.lang.String[r3]
            android.database.Cursor r1 = r1.rawQuery(r2, r4)
            r2 = 0
            if (r1 == 0) goto L_0x01ca
            int r3 = r1.getColumnCount()     // Catch:{ all -> 0x01c1 }
            r4 = 1
            if (r3 >= r4) goto L_0x018f
            goto L_0x01ca
        L_0x018f:
            boolean r3 = r1.moveToNext()     // Catch:{ all -> 0x01c1 }
            if (r3 == 0) goto L_0x01a1
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r3 = new com.tencent.mm.plugin.appbrand.config.WxaAttributes     // Catch:{ all -> 0x01c1 }
            r3.<init>()     // Catch:{ all -> 0x01c1 }
            r3.convertFrom(r1)     // Catch:{ all -> 0x01c1 }
            r5.add(r3)     // Catch:{ all -> 0x01c1 }
            goto L_0x018f
        L_0x01a1:
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x01c1 }
            cy3.C58003b.m67160a(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "launched not in duplicate size "
            r1.append(r2)
            int r2 = r5.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.AppBrandMessInfoStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            goto L_0x01cd
        L_0x01c1:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ all -> 0x01c4 }
        L_0x01c4:
            r0 = move-exception
            r3 = r0
            cy3.C58003b.m67160a(r1, r2)
            throw r3
        L_0x01ca:
            cy3.C58003b.m67160a(r1, r2)
        L_0x01cd:
            r7.addAll(r5)
            goto L_0x01d3
        L_0x01d1:
            r20 = r3
        L_0x01d3:
            f40.e r1 = f40.C86709a0.m107523b()
            java.lang.String r1 = r1.mo121111i()
            if (r1 == 0) goto L_0x01e6
            int r2 = r1.length()
            if (r2 != 0) goto L_0x01e4
            goto L_0x01e6
        L_0x01e4:
            r2 = 0
            goto L_0x01e7
        L_0x01e6:
            r2 = 1
        L_0x01e7:
            if (r2 == 0) goto L_0x01f5
            java.lang.String r0 = "uin value is invaild"
            r2 = r20
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            r1 = r25
            goto L_0x0420
        L_0x01f5:
            r2 = r20
            java.lang.String r3 = "prepare to flush mess info column"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            java.lang.Object r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r0)
            com.tencent.mm.plugin.appbrand.appusage.d0 r0 = (com.tencent.p014mm.plugin.appbrand.appusage.C81477d0) r0
            if (r0 == 0) goto L_0x0208
            r0.mo113783jo()
        L_0x0208:
            com.tencent.mm.plugin.appbrand.p3 r3 = com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner.C81063b.f238100a
            r3.getClass()
            java.lang.String r4 = "run() cost %dms"
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.appcache.h3 r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238471g
            java.lang.String r6 = "MicroMsg.AppBrand.PkgCalculateLogic"
            if (r0 != 0) goto L_0x0225
            java.lang.String r0 = "run() entered but storage not ready"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            goto L_0x028b
        L_0x0225:
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f244377a
            r8 = 0
            r0.set(r8)
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            java.util.List r0 = r3.mo116013d()     // Catch:{ InterruptedException -> 0x026a, all -> 0x024c }
            r3.mo116011b(r5, r0)     // Catch:{ InterruptedException -> 0x026a, all -> 0x024c }
            r3.mo116010a(r5, r0)     // Catch:{ InterruptedException -> 0x026a, all -> 0x024c }
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            long r10 = r10 - r8
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Long r8 = java.lang.Long.valueOf(r10)
            r9 = 0
            r0[r9] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r0)
            goto L_0x028b
        L_0x024c:
            r0 = move-exception
            java.lang.String r10 = "calculate occur exception %s"
            r11 = 1
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ all -> 0x0435 }
            r13 = 0
            r12[r13] = r0     // Catch:{ all -> 0x0435 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r10, r12)     // Catch:{ all -> 0x0435 }
            long r18 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            long r8 = r18 - r8
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r0[r13] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r0)
            goto L_0x028b
        L_0x026a:
            r0 = move-exception
            java.lang.String r10 = "interrupted %s"
            r11 = 1
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ all -> 0x0435 }
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)     // Catch:{ all -> 0x0435 }
            r13 = 0
            r12[r13] = r0     // Catch:{ all -> 0x0435 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r10, r12)     // Catch:{ all -> 0x0435 }
            long r18 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            long r8 = r18 - r8
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r0[r13] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r0)
        L_0x028b:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r4 = r5.size()
            int r4 = sx3.C90363p0.m113142a(r4)
            r0.<init>(r4)
            java.util.Set r4 = r5.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x02a0:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02c0
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.Object r5 = r5.getValue()
            com.tencent.mm.plugin.appbrand.r3 r5 = (com.tencent.p014mm.plugin.appbrand.C1953r3) r5
            int r5 = r5.f11861b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.put(r6, r5)
            goto L_0x02a0
        L_0x02c0:
            com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager$b r4 = com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager.f246131g
            com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager r4 = r4.mo116962a()
            java.util.List r4 = r4.mo111386a()
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = sx3.C36907w.m41090l(r4, r6)
            r5.<init>(r6)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x02db:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x02ed
            java.lang.Object r6 = r4.next()
            com.tencent.luggage.sdk.processes.l r6 = (com.tencent.luggage.sdk.processes.C80264l) r6
            java.lang.String r6 = r6.f234965a
            r5.add(r6)
            goto L_0x02db
        L_0x02ed:
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            java.util.Iterator r4 = r7.iterator()     // Catch:{ InterruptedException -> 0x03d6, all -> 0x03b5 }
        L_0x02f5:
            boolean r6 = r4.hasNext()     // Catch:{ InterruptedException -> 0x03d6, all -> 0x03b5 }
            if (r6 == 0) goto L_0x039e
            java.lang.Object r6 = r4.next()     // Catch:{ InterruptedException -> 0x0398, all -> 0x0392 }
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r6 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes) r6     // Catch:{ InterruptedException -> 0x0398, all -> 0x0392 }
            r3.mo116012c()     // Catch:{ InterruptedException -> 0x0398, all -> 0x0392 }
            java.lang.String r7 = r6.field_appId     // Catch:{ InterruptedException -> 0x0398, all -> 0x0392 }
            java.lang.String r10 = "uin"
            gy3.C87412m.m108593f(r1, r10)     // Catch:{ InterruptedException -> 0x0398, all -> 0x0392 }
            gy3.C87412m.m108593f(r7, r15)     // Catch:{ InterruptedException -> 0x0398, all -> 0x0392 }
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch:{ InterruptedException -> 0x0398, all -> 0x0392 }
            r11 = r26
            long r12 = r11.mo112997a(r1, r7, r10)     // Catch:{ InterruptedException -> 0x0398, all -> 0x0392 }
            long r16 = r11.mo112998b(r1, r7)     // Catch:{ InterruptedException -> 0x0398, all -> 0x0392 }
            long r12 = r12 + r16
            boolean r10 = r0.containsKey(r7)     // Catch:{ InterruptedException -> 0x0398, all -> 0x0392 }
            if (r10 == 0) goto L_0x036c
            java.lang.Object r10 = r0.get(r7)     // Catch:{ InterruptedException -> 0x0398, all -> 0x0392 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ InterruptedException -> 0x0398, all -> 0x0392 }
            if (r10 == 0) goto L_0x0333
            int r10 = r10.intValue()     // Catch:{ InterruptedException -> 0x03d6, all -> 0x03b5 }
            r16 = r0
            r14 = r1
            goto L_0x0337
        L_0x0333:
            r16 = r0
            r14 = r1
            r10 = 0
        L_0x0337:
            long r0 = (long) r10
            long r31 = r12 + r0
            r0 = 0
            int r10 = (r31 > r0 ? 1 : (r31 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x0369
            com.tencent.mm.plugin.appbrand.appstorage.p r0 = new com.tencent.mm.plugin.appbrand.appstorage.p     // Catch:{ InterruptedException -> 0x0398, all -> 0x0392 }
            java.lang.String r1 = r6.field_brandIconURL     // Catch:{ InterruptedException -> 0x0398, all -> 0x0392 }
            java.lang.String r10 = "attributes.field_brandIconURL"
            gy3.C87412m.m108593f(r1, r10)     // Catch:{ InterruptedException -> 0x0398, all -> 0x0392 }
            java.lang.String r6 = r6.field_nickname     // Catch:{ InterruptedException -> 0x0398, all -> 0x0392 }
            java.lang.String r10 = "attributes.field_nickname"
            gy3.C87412m.m108593f(r6, r10)     // Catch:{ InterruptedException -> 0x0398, all -> 0x0392 }
            boolean r10 = r5.contains(r7)     // Catch:{ InterruptedException -> 0x0398, all -> 0x0392 }
            java.lang.Boolean r33 = java.lang.Boolean.valueOf(r10)     // Catch:{ InterruptedException -> 0x0398, all -> 0x0392 }
            r27 = r0
            r28 = r7
            r29 = r1
            r30 = r6
            r27.<init>(r28, r29, r30, r31, r33)     // Catch:{ InterruptedException -> 0x0398, all -> 0x0392 }
            r1 = r25
            r1.add(r0)     // Catch:{ InterruptedException -> 0x0390, all -> 0x038e }
            goto L_0x0385
        L_0x0369:
            r1 = r25
            goto L_0x0385
        L_0x036c:
            r16 = r0
            r14 = r1
            r1 = r25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x0390, all -> 0x038e }
            r0.<init>()     // Catch:{ InterruptedException -> 0x0390, all -> 0x038e }
            java.lang.String r6 = "find wxapkg record, but no pkg file, appId: "
            r0.append(r6)     // Catch:{ InterruptedException -> 0x0390, all -> 0x038e }
            r0.append(r7)     // Catch:{ InterruptedException -> 0x0390, all -> 0x038e }
            java.lang.String r0 = r0.toString()     // Catch:{ InterruptedException -> 0x0390, all -> 0x038e }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)     // Catch:{ InterruptedException -> 0x0390, all -> 0x038e }
        L_0x0385:
            r25 = r1
            r26 = r11
            r1 = r14
            r0 = r16
            goto L_0x02f5
        L_0x038e:
            r0 = move-exception
            goto L_0x0395
        L_0x0390:
            r0 = move-exception
            goto L_0x039b
        L_0x0392:
            r0 = move-exception
            r1 = r25
        L_0x0395:
            r3 = r24
            goto L_0x03ba
        L_0x0398:
            r0 = move-exception
            r1 = r25
        L_0x039b:
            r3 = r24
            goto L_0x03db
        L_0x039e:
            r1 = r25
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            long r3 = r3 - r8
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 0
            r0[r4] = r3
            r3 = r24
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r0)
            goto L_0x03fa
        L_0x03b5:
            r0 = move-exception
            r3 = r24
            r1 = r25
        L_0x03ba:
            java.lang.String r4 = "getAllAppBrandStorageInfo process occur exception %s"
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0421 }
            r7 = 0
            r6[r7] = r0     // Catch:{ all -> 0x0421 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r4, r6)     // Catch:{ all -> 0x0421 }
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            long r10 = r10 - r8
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            r0[r7] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r0)
            goto L_0x03fa
        L_0x03d6:
            r0 = move-exception
            r3 = r24
            r1 = r25
        L_0x03db:
            java.lang.String r4 = "getAllAppBrandStorageInfo interrupted %s"
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0421 }
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)     // Catch:{ all -> 0x0421 }
            r7 = 0
            r6[r7] = r0     // Catch:{ all -> 0x0421 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r6)     // Catch:{ all -> 0x0421 }
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            long r10 = r10 - r8
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            r0[r7] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r0)
        L_0x03fa:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "calculate appbrand storage usage time cost: "
            r0.append(r3)
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            long r3 = r3 - r22
            r0.append(r3)
            java.lang.String r3 = "ms, record: "
            r0.append(r3)
            int r3 = r1.size()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
        L_0x0420:
            return r1
        L_0x0421:
            r0 = move-exception
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            long r4 = r4 - r8
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 0
            r1[r5] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r1)
            throw r0
        L_0x0435:
            r0 = move-exception
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            long r1 = r1 - r8
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            r3[r2] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.app.AppBrandMixExportLogicService.mo113301Gt():java.util.List");
    }

    public <T extends Parcelable> void O30(String str, T t) {
        C81964j.m100679b(str, t);
    }

    /* renamed from: QK */
    public void mo113303QK(C88273g1 g1Var) {
        AppBrandProcessesManager.m103869I().mo116954S(LuggageServiceType.WAGAME, g1Var);
    }

    /* renamed from: Ss */
    public void mo113304Ss(List<String> list) {
        List<String> list2 = list;
        AppBrandFileCleaner.C81062a aVar = AppBrandFileCleaner.f238096a;
        if (list2 == null || list.isEmpty()) {
            Log.m105924i("MicroMsg.AppBrandFileCleaner", "clean list is empty");
            return;
        }
        Log.m105924i("MicroMsg.AppBrandFileCleaner", "start clean appbrand storage, size: " + list.size());
        long currentTicks = Util.currentTicks();
        String i = C86709a0.m107523b().mo121111i();
        if (i == null || i.length() == 0) {
            Log.m105920e("MicroMsg.AppBrandFileCleaner", "uin value is invaild");
            return;
        }
        C84079q3 q3Var = AppBrandFileCleaner.C81064c.f238101a;
        q3Var.getClass();
        C81161g2.requireAccountInitializedOnDemand();
        if (C81161g2.f238471g == null) {
            Log.m105920e("MicroMsg.AppBrand.PkgCleanupLogic", "run() entered but storage not ready");
        } else if (!list.isEmpty()) {
            q3Var.f245491a.set(false);
            long currentTicks2 = Util.currentTicks();
            try {
                q3Var.mo116746h(list2);
                q3Var.mo116742d(list2);
                q3Var.mo116743e();
                q3Var.mo116740b(list2);
                q3Var.mo116741c(list2);
                q3Var.mo116745g(list2);
            } catch (InterruptedException e) {
                Log.m105925i("MicroMsg.AppBrand.PkgCleanupLogic", "interrupted %s", android.util.Log.getStackTraceString(e));
            } catch (Throwable th) {
                Log.m105921e("MicroMsg.AppBrand.PkgCleanupLogic", "process occur exception %s", th);
            } finally {
                Log.m105925i("MicroMsg.AppBrand.PkgCleanupLogic", "run() cost %dms", Long.valueOf(Util.currentTicks() - currentTicks2));
            }
        }
        long currentTicks3 = Util.currentTicks();
        try {
            for (String d : list) {
                q3Var.mo116739a();
                C87412m.m108593f(i, "uin");
                AppBrandFileCleaner.C81062a.m99061d(aVar, i, d, (Boolean) null, 4, (Object) null);
            }
        } catch (InterruptedException e2) {
            Log.m105925i("MicroMsg.AppBrandFileCleaner", "batchCleanStorageByAppIdList interrupted %s", android.util.Log.getStackTraceString(e2));
        } catch (Throwable th4) {
            Log.m105921e("MicroMsg.AppBrandFileCleaner", "batchCleanStorageByAppIdList process occur exception %s", th4);
        } finally {
            Log.m105925i("MicroMsg.AppBrandFileCleaner", "batchCleanStorageByAppIdList cost %dms", Long.valueOf(Util.currentTicks() - currentTicks3));
        }
        Log.m105924i("MicroMsg.AppBrandFileCleaner", "clean appbrand storage usage time cost: " + (Util.currentTicks() - currentTicks) + LocaleUtil.MALAY);
    }

    /* renamed from: TH */
    public void mo113305TH(C88273g1 g1Var) {
        AppBrandProcessesManager.m103869I().mo116954S(LuggageServiceType.WASERVICE, g1Var);
    }

    public C82870p Xg0(int i) {
        return C81154e.m99438a(i);
    }

    public void a90() {
        AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent.f238248d.mo113165a(false);
        C81194z.zx0(C81194z.C81196b.PULLDOWN_TASK_BAR);
    }

    /* renamed from: b0 */
    public Pair<String, Integer> mo113308b0(int i) {
        return new Pair<>(C81243g.m99551a(i), Integer.valueOf(C0966R.C0969drawable.f4459d5));
    }

    /* renamed from: fx */
    public List<String> mo113309fx() {
        AppBrandFileCleaner.C81062a aVar = AppBrandFileCleaner.f238096a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(AppBrandFileCleaner.f238097b);
        arrayList.add(AppBrandFileCleaner.f238098c);
        C7335d c = C86312j.m106911c(C33987b1.class);
        C87412m.m108592e(c, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl");
        for (C81331p.C29266b next : ((C81331p) c).vx0()) {
            if (next != null) {
                String str = next.f79951d;
                StringBuilder sb = new StringBuilder();
                sb.append('_');
                sb.append(str.hashCode());
                sb.append('_');
                arrayList.add(sb.toString());
            }
        }
        return arrayList;
    }

    public void j30(Context context, String str, String str2, String str3, boolean z, String str4) {
        OpenFileRequest openFileRequest = new OpenFileRequest();
        openFileRequest.f241474d = str;
        openFileRequest.f241475e = str2;
        openFileRequest.f241476f = str3;
        openFileRequest.f241477g = z;
        Map<String, Class<? extends AppBrandTaskProxyUI>> map = C81956c.f240358a;
        Class<AppBrandProcessProxyUI> cls = C81956c.f240358a.get(str4.replaceFirst(MMApplicationContext.getPackageName(), ""));
        Class<AppBrandProcessProxyUI> cls2 = AppBrandProcessProxyUI.class;
        if (cls == null) {
            cls = cls2;
        }
        AppBrandProcessProxyUI.m100646K7(context, cls, openFileRequest, (AppBrandProxyUIProcessTask.C81943b) null, (Intent) null);
    }

    /* renamed from: k8 */
    public String mo113311k8(String str) {
        return C83727p2.m102773c(str);
    }

    /* renamed from: xm */
    public void mo113312xm() {
        if (C31689g.m39501b()) {
            boolean z = false;
            if (!C31689g.m39500a() && ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_appbrand_recommend_use_fake_native, -1) == 1) {
                z = true;
            }
            if (z) {
                mo113305TH(C88273g1.FIND_MORE_ENTRANCE_EXPOSED);
            }
        }
        ((C119157j) C119157j.f356862d).mo183875f(new C29096a(this));
    }
}
